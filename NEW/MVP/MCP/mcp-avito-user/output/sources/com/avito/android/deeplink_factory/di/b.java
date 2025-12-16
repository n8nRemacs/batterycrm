package com.avito.android.deeplink_factory.di;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.L;
import com.avito.android.deep_linking.x;
import com.google.gson.Gson;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.w;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import lE.C43624b;
import mv.C44139a;
import mv.C44140b;

/* compiled from: DeepLinkFactoryModule_ProvideDeeplinkFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/di/b;", "Ldagger/internal/h;", "Lcom/avito/android/deep_linking/x;", "a", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements h<x> {

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final a f134167h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C44140b f134168a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final u f134169b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Provider<Gson> f134170c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final dagger.internal.f f134171d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.deeplink_events.registry.d> f134172e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final lE.d f134173f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Provider<L> f134174g;

    /* compiled from: DeepLinkFactoryModule_ProvideDeeplinkFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/di/b$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public b(@k C44140b c44140b, @k u uVar, @k Provider provider, @k dagger.internal.f fVar, @k Provider provider2, @k lE.d dVar, @k Provider provider3) {
        this.f134168a = c44140b;
        this.f134169b = uVar;
        this.f134170c = provider;
        this.f134171d = fVar;
        this.f134172e = provider2;
        this.f134173f = dVar;
        this.f134174g = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C44139a c44139a = (C44139a) this.f134168a.get();
        h31.e eVarA = g.a(w.a(this.f134169b));
        h31.e eVarB = g.b(this.f134170c);
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f134171d.get();
        com.avito.android.deeplink_events.registry.d dVar = this.f134172e.get();
        C43624b c43624b = (C43624b) this.f134173f.get();
        L l12 = this.f134174g.get();
        f134167h.getClass();
        com.avito.android.deeplink_factory.di.a.f134166a.getClass();
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.deeplink_factory.b bVar = new com.avito.android.deeplink_factory.b(c44139a, eVarA, eVarB, dVar, l12, c43624b);
        interfaceC28373a.c(new y.c("deeplink-initialization.deeplink-factory-impl", Long.valueOf(fA2.b()), null));
        return bVar;
    }
}
