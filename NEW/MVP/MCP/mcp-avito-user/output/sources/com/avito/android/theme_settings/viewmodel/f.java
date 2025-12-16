package com.avito.android.theme_settings.viewmodel;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Inject;
import kotlin.Metadata;
import nE0.InterfaceC44242a;

/* compiled from: ThemeSettingsViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/theme_settings/viewmodel/f;", "Landroidx/lifecycle/P0$c;", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.darkTheme.a f301371a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b f301372b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC44242a f301373c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f301374d;

    @Inject
    public f(@k com.avito.android.lib.util.darkTheme.a aVar, @k b bVar, @k InterfaceC44242a interfaceC44242a, @k InterfaceC28373a interfaceC28373a) {
        this.f301371a = aVar;
        this.f301372b = bVar;
        this.f301373c = interfaceC44242a;
        this.f301374d = interfaceC28373a;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        if (cls.isAssignableFrom(h.class)) {
            return new h(this.f301371a, this.f301372b, this.f301373c, this.f301374d);
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
