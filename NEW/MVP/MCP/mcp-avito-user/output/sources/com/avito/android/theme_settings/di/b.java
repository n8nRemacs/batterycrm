package com.avito.android.theme_settings.di;

import Y61.k;
import android.content.Context;
import com.avito.android.di.B;
import com.avito.android.theme_settings.ThemeSettingsFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: ThemeSettingsComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/theme_settings/di/b;", "", "a", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: ThemeSettingsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/theme_settings/di/b$a;", "", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k ThemeSettingsFragment themeSettingsFragment, @h31.b @k Context context, @k c cVar);
    }

    void a(@k ThemeSettingsFragment themeSettingsFragment);
}
