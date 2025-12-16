package com.avito.android.di.module;

import com.avito.android.InterfaceC35289u1;
import com.avito.android.util.C35975x3;
import com.google.gson.Gson;
import com.google.gson.ToNumberPolicy;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CoreOptimalJsonModule_ProvideStreamGson$_avito_network_implFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/E3;", "Ldagger/internal/h;", "Lcom/google/gson/Gson;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class E3 implements dagger.internal.h<Gson> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f143903f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f143904a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.A f143905b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f143906c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.retrofit.H> f143907d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC35289u1> f143908e;

    /* compiled from: CoreOptimalJsonModule_ProvideStreamGson$_avito_network_implFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"com/avito/android/di/module/CoreOptimalJsonModule_ProvideStreamGson$_avito_network_implFactory.Companion", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public E3(@Y61.k dagger.internal.A a12, @Y61.k dagger.internal.A a13, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3) {
        this.f143904a = a12;
        this.f143905b = a13;
        this.f143906c = provider;
        this.f143907d = provider2;
        this.f143908e = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Set<C35975x3> set = (Set) this.f143904a.get();
        Set set2 = (Set) this.f143905b.get();
        com.avito.android.util.C c12 = this.f143906c.get();
        com.avito.android.retrofit.H h12 = this.f143907d.get();
        InterfaceC35289u1 interfaceC35289u1 = this.f143908e.get();
        f143903f.getClass();
        C30200u3 c30200u3 = C30200u3.f144612a;
        h12.a();
        com.google.gson.d dVar = new com.google.gson.d();
        for (C35975x3 c35975x3 : set) {
            if (!c12.l() && c35975x3.f319125a.equals(com.google.gson.h.class)) {
                throw new IllegalStateException("Using jsonDeserializer is non-streaming.");
            }
            dVar.b(c35975x3.f319125a, c35975x3.f319126b);
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            dVar.c((com.google.gson.r) it.next());
        }
        dVar.f361997l = ToNumberPolicy.f361982d;
        return interfaceC35289u1.n().invoke().booleanValue() ? com.avito.android.gson.e.a(dVar, interfaceC35289u1.q().invoke().booleanValue(), true ^ c12.l(), AW.f.f434a) : dVar.a();
    }
}
