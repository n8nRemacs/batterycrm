package com.avito.android.di.module;

import com.avito.android.remote.interceptor.C34271a0;
import com.avito.android.remote.interceptor.C34289j0;
import com.avito.android.remote.interceptor.C34291k0;
import gD.C40571a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ApiInterceptorsModule_ProvideFrescoHeadersInterceptorFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/u0;", "Ldagger/internal/h;", "Lcom/avito/android/remote/interceptor/a0;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.di.module.u0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30197u0 implements dagger.internal.h<C34271a0> {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f144603h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final gD.c f144604a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f144605b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.P f144606c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.U f144607d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C34291k0 f144608e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.W0 f144609f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.interceptor.Z f144610g;

    /* compiled from: ApiInterceptorsModule_ProvideFrescoHeadersInterceptorFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/u0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.di.module.u0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C30197u0(@Y61.k C30143p0 c30143p0, @Y61.k gD.c cVar, @Y61.k com.avito.android.S s5, @Y61.k com.avito.android.remote.interceptor.P p12, @Y61.k com.avito.android.remote.interceptor.U u12, @Y61.k C34291k0 c34291k0, @Y61.k com.avito.android.remote.interceptor.W0 w02, @Y61.k com.avito.android.remote.interceptor.Z z12) {
        this.f144604a = cVar;
        this.f144605b = s5;
        this.f144606c = p12;
        this.f144607d = u12;
        this.f144608e = c34291k0;
        this.f144609f = w02;
        this.f144610g = z12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C40571a c40571a = (C40571a) this.f144604a.get();
        com.avito.android.P p12 = (com.avito.android.P) this.f144605b.get();
        com.avito.android.remote.interceptor.M m12 = (com.avito.android.remote.interceptor.M) this.f144606c.get();
        com.avito.android.remote.interceptor.S s5 = (com.avito.android.remote.interceptor.S) this.f144607d.get();
        this.f144608e.getClass();
        C34289j0 c34289j0 = new C34289j0();
        com.avito.android.remote.interceptor.U0 u02 = (com.avito.android.remote.interceptor.U0) this.f144609f.get();
        com.avito.android.remote.interceptor.I i12 = (com.avito.android.remote.interceptor.I) this.f144610g.get();
        f144603h.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c34289j0);
        kotlin.reflect.n<Object>[] nVarArr = C40571a.f396381e;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        if (((Boolean) c40571a.f396382b.a().invoke()).booleanValue()) {
            arrayList.add(u02);
            arrayList.add(m12);
        }
        kotlin.reflect.n<Object> nVar2 = com.avito.android.P.f67370w0[46];
        if (((Boolean) p12.f67379I.a().invoke()).booleanValue()) {
            kotlin.reflect.n<Object> nVar3 = nVarArr[1];
            if (((Boolean) c40571a.f396383c.a().invoke()).booleanValue()) {
                arrayList.add(s5);
            }
        }
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        if (((Boolean) c40571a.f396384d.a().invoke()).booleanValue()) {
            arrayList.add(i12);
        }
        return new C34271a0(arrayList);
    }
}
