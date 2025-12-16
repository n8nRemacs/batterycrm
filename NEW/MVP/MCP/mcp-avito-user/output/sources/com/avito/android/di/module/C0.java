package com.avito.android.di.module;

import com.avito.android.retrofit.C34414f;
import com.avito.android.retrofit.C34415g;
import com.avito.android.retrofit.C34417i;
import com.avito.android.retrofit.C34419k;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import retrofit2.z;

/* compiled from: ApiModule_ProvideAvitoRetrofitFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/C0;", "Ldagger/internal/h;", "Lretrofit2/z;", "a", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class C0 implements dagger.internal.h<retrofit2.z> {

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final a f143855i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.S f143856a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.util.C> f143857b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.retrofit.H> f143858c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.retrofit.N f143859d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C34419k f143860e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C34415g f143861f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.retrofit.x f143862g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final dagger.internal.u f143863h;

    /* compiled from: ApiModule_ProvideAvitoRetrofitFactory.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/di/module/C0$a;", "", "<init>", "()V", "_avito_network_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C0(@Y61.k B0 b02, @Y61.k com.avito.android.S s5, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k com.avito.android.retrofit.N n12, @Y61.k C34419k c34419k, @Y61.k C34415g c34415g, @Y61.k com.avito.android.retrofit.x xVar, @Y61.k dagger.internal.u uVar) {
        this.f143856a = s5;
        this.f143857b = provider;
        this.f143858c = provider2;
        this.f143859d = n12;
        this.f143860e = c34419k;
        this.f143861f = c34415g;
        this.f143862g = xVar;
        this.f143863h = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.P p12 = (com.avito.android.P) this.f143856a.get();
        com.avito.android.util.C c12 = this.f143857b.get();
        com.avito.android.retrofit.H h12 = this.f143858c.get();
        com.avito.android.retrofit.M m12 = (com.avito.android.retrofit.M) this.f143859d.get();
        C34417i c34417i = (C34417i) this.f143860e.get();
        this.f143861f.getClass();
        C34414f c34414f = new C34414f();
        com.avito.android.retrofit.w wVar = (com.avito.android.retrofit.w) this.f143862g.get();
        com.avito.android.retrofit.S s5 = (com.avito.android.retrofit.S) this.f143863h.get();
        f143855i.getClass();
        h12.a();
        z.b bVar = new z.b();
        bVar.c(com.avito.android.util.C5.c(p12.a()));
        bVar.b(m12);
        bVar.b(new com.avito.android.remote.parse.adapter.date.b());
        bVar.a(s5.a(c34417i));
        bVar.a(s5.a(c34414f));
        bVar.f430138g = !c12.l();
        bVar.f430133b = wVar;
        return bVar.e();
    }
}
