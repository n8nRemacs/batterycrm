package com.avito.android.settings;

import android.app.Application;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.settings.ui.SettingsActivity;
import com.avito.android.settings.ui.SettingsFragmentData;
import com.avito.android.theme_settings.ThemeSettingsActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SettingsIntentFactoryImpl.kt */
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/settings/c;", "Lcom/avito/android/settings/b;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f280817a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f280818b;

    @Inject
    public c(@Y61.k Application application, @Y61.k L l12) {
        this.f280817a = application;
        this.f280818b = l12;
    }

    @Override // com.avito.android.settings.b
    @Y61.k
    public final Intent a() {
        ThemeSettingsActivity.f301286o.getClass();
        return new Intent(this.f280817a, (Class<?>) ThemeSettingsActivity.class);
    }

    @Override // com.avito.android.settings.b
    @Y61.k
    public final Intent b(@Y61.l NavigationTabSetItem navigationTabSetItem) {
        if (navigationTabSetItem == null) {
            return new Intent(this.f280817a, (Class<?>) SettingsActivity.class);
        }
        return this.f280818b.d(new SettingsFragmentData(navigationTabSetItem));
    }
}
