package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.preference.PreferenceManager;

/* loaded from: classes8.dex */
public final class e51 {
    public static boolean a(@Y61.k Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false);
    }
}
