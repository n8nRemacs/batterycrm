package com.avito.android.tariff_lf_constructor.configure.setting.viewmodel;

import androidx.compose.runtime.internal.P;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConstructorSettingViewModelFactory.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/viewmodel/k;", "Landroidx/lifecycle/P0$c;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f300186a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35215a f300187b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35219e f300188c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f300189d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f300190e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f300191f;

    @Inject
    public k(@Y61.l String str, @Y61.k InterfaceC35215a interfaceC35215a, @Y61.k InterfaceC35219e interfaceC35219e, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f300186a = str;
        this.f300187b = interfaceC35215a;
        this.f300188c = interfaceC35219e;
        this.f300189d = interfaceC35745a5;
        this.f300190e = screenPerformanceTracker;
        this.f300191f = aVar;
    }

    @Override // androidx.lifecycle.P0.c
    @Y61.k
    public final <T extends M0> T create(@Y61.k Class<T> cls) {
        if (!cls.isAssignableFrom(m.class)) {
            throw new IllegalArgumentException("Unknown ViewModel class");
        }
        return new m(this.f300186a, this.f300187b, this.f300188c, this.f300189d, this.f300190e, this.f300191f);
    }
}
