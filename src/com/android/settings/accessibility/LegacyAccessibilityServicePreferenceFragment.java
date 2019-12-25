/*
 * Copyright (C) 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settings.accessibility;

import android.os.Bundle;
import android.view.View;

import androidx.preference.PreferenceScreen;

/** For accessibility services that target SDK <= Q. */
public class LegacyAccessibilityServicePreferenceFragment extends
        ToggleAccessibilityServicePreferenceFragment {
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final PreferenceScreen preferenceScreen = getPreferenceScreen();
        final ShortcutPreference preference = preferenceScreen.findPreference(
                getShortcutPreferenceKey());
        if (preference != null) {
            preference.setSettingsVisibility(View.GONE);
        }
    }
}
