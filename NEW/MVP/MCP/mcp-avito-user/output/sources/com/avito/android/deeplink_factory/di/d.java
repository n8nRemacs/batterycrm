package com.avito.android.deeplink_factory.di;

import Y61.k;
import com.avito.android.C30277e1;
import com.avito.android.C30713g1;
import com.avito.android.D2;
import com.avito.android.P;
import com.avito.android.S;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.deep_linking.L;
import com.avito.android.deeplink_factory.legacy.E2;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.C35743a3;
import com.google.gson.Gson;
import dagger.internal.h;
import dagger.internal.u;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.n;
import lE.C43624b;

/* compiled from: DeepLinkFactoryModule_ProvideDeeplinkLegacyFactoryFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/di/d;", "Ldagger/internal/h;", "Lcom/avito/android/deeplink_factory/legacy/E2;", "a", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements h<E2> {

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final a f134178j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C30713g1 f134179a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final S f134180b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final D2 f134181c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final lE.d f134182d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final dagger.internal.f f134183e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final Provider<Gson> f134184f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final dagger.internal.f f134185g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final Provider<com.avito.android.deeplink_events.registry.d> f134186h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final u f134187i;

    /* compiled from: DeepLinkFactoryModule_ProvideDeeplinkLegacyFactoryFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deeplink_factory/di/d$a;", "", "<init>", "()V", "_avito-discouraged_avito-network_deeplinks-parser-factory"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@k C30713g1 c30713g1, @k S s5, @k D2 d22, @k lE.d dVar, @k dagger.internal.f fVar, @k Provider provider, @k dagger.internal.f fVar2, @k Provider provider2, @k u uVar) {
        this.f134179a = c30713g1;
        this.f134180b = s5;
        this.f134181c = d22;
        this.f134182d = dVar;
        this.f134183e = fVar;
        this.f134184f = provider;
        this.f134185g = fVar2;
        this.f134186h = provider2;
        this.f134187i = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C30277e1 c30277e1 = (C30277e1) this.f134179a.get();
        P p12 = (P) this.f134180b.get();
        this.f134181c.get();
        C43624b c43624b = (C43624b) this.f134182d.get();
        Gson gson = this.f134184f.get();
        InterfaceC28373a interfaceC28373a = (InterfaceC28373a) this.f134185g.get();
        com.avito.android.deeplink_events.registry.d dVar = this.f134186h.get();
        L l12 = (L) this.f134187i.get();
        f134178j.getClass();
        com.avito.android.deeplink_factory.di.a.f134166a.getClass();
        n<Object> nVar = P.f67370w0[60];
        if (((Boolean) p12.f67390T.a().invoke()).booleanValue() && C35743a3.a()) {
            interfaceC28373a.c(new NonFatalErrorEvent("LegacyDeeplinkFactory initialisation on main thread.", new RuntimeException(), null, null, 12, null));
        }
        D.f90335a.getClass();
        F fA2 = D.a.a();
        E2 e22 = new E2(c30277e1, p12, c43624b, this.f134183e, gson, dVar, l12);
        interfaceC28373a.c(new y.c("deeplink-initialization.legacy-deeplink-factory", Long.valueOf(fA2.b()), null));
        return e22;
    }
}
