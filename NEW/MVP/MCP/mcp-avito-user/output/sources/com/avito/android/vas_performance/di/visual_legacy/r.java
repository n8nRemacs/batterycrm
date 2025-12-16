package com.avito.android.vas_performance.di.visual_legacy;

import androidx.view.P0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.vas_performance.I;
import com.avito.android.vas_performance.di.visual_legacy.a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.G0;

/* compiled from: LegacyVisualVasModule_ProvideViewModelFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class r implements dagger.internal.h<P0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final o f320201a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.vas_performance.repository.a> f320202b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<I> f320203c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f320204d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<TL0.d> f320205e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f320206f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f320207g;

    /* renamed from: h, reason: collision with root package name */
    public final dagger.internal.l f320208h;

    /* renamed from: i, reason: collision with root package name */
    public final Provider<com.avito.android.preloading.j<G0, P2<HL0.b>>> f320209i;

    public r(o oVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, dagger.internal.l lVar, Provider provider7) {
        this.f320201a = oVar;
        this.f320202b = provider;
        this.f320203c = provider2;
        this.f320204d = provider3;
        this.f320205e = provider4;
        this.f320206f = provider5;
        this.f320207g = provider6;
        this.f320208h = lVar;
        this.f320209i = provider7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.vas_performance.repository.a aVar = this.f320202b.get();
        I i12 = this.f320203c.get();
        InterfaceC35745a5 interfaceC35745a5 = (InterfaceC35745a5) ((a.c.f) this.f320204d).get();
        TL0.d dVar = this.f320205e.get();
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = (com.avito.android.deeplink_handler.handler.composite.a) ((a.c.d) this.f320206f).get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) ((a.c.C9923a) this.f320207g).get();
        boolean zBooleanValue = ((Boolean) this.f320208h.f393949a).booleanValue();
        com.avito.android.preloading.j<G0, P2<HL0.b>> jVar = this.f320209i.get();
        o oVar = this.f320201a;
        oVar.getClass();
        return new com.avito.android.vas_performance.ui.visual_legacy.n(oVar.f320190a, oVar.f320191b, aVar, i12, interfaceC35745a5, dVar, aVar2, interfaceC28373a, zBooleanValue, jVar);
    }
}
