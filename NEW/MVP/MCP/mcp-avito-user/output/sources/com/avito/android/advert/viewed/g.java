package com.avito.android.advert.viewed;

import Y61.k;
import Y61.l;
import com.avito.android.serp.adapter.m1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: ViewedAdvertsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/viewed/g;", "Lcom/avito/android/advert/viewed/f;", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert.viewed.a f81010a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f81011b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f81012c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f81013d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public C43238h f81014e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public N0 f81015f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f81016g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @l
    public Object f81017h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public UV0.a<? extends TV0.a> f81018i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public UV0.a<? extends TV0.a> f81019j;

    /* compiled from: ViewedAdvertsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<String, G0> {
        public a() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r3v5, types: [com.avito.android.advert.viewed.j, java.lang.Object] */
        @Override // Y41.l
        public final G0 invoke(String str) {
            String str2 = str;
            g gVar = g.this;
            UV0.a<? extends TV0.a> aVar = gVar.f81019j;
            if (aVar != null) {
                int i12 = 0;
                for (Object obj : com.avito.konveyor.util.g.b(aVar)) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    TV0.a aVar2 = (TV0.a) obj;
                    if (aVar2 instanceof m1) {
                        m1 m1Var = (m1) aVar2;
                        if (L.f(m1Var.getF291445k(), str2)) {
                            m1Var.setViewed(true);
                            try {
                                ?? r32 = gVar.f81017h;
                                if (r32 != 0) {
                                    r32.C3(i12);
                                }
                            } catch (Throwable th2) {
                                V2.f318762a.f(th2);
                            }
                        }
                    }
                    i12 = i13;
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public g(@k com.avito.android.advert.viewed.a aVar, @k d dVar, @k R0 r02, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f81010a = aVar;
        this.f81011b = dVar;
        this.f81012c = r02;
        this.f81013d = interfaceC35745a5;
    }

    @Override // com.avito.android.advert.viewed.f
    public final void c(@k UV0.a<? extends TV0.a> aVar) {
        this.f81019j = aVar;
        N0 n02 = this.f81015f;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f81018i = null;
        if (aVar.isEmpty()) {
            return;
        }
        C43238h c43238h = this.f81014e;
        if (c43238h != null) {
            this.f81015f = C43259k.d(c43238h, null, null, new h(aVar, this, null), 3);
        } else {
            this.f81018i = aVar;
        }
    }

    @Override // com.avito.android.advert.viewed.f
    public final void d(@k j jVar) {
        this.f81017h = jVar;
        this.f81016g.b(C35896f0.g(this.f81010a.getF81002a().j0(this.f81013d.e()), new a()));
        C43238h c43238hA = U.a(this.f81012c.b().plus(t1.b()));
        N0 n02 = this.f81015f;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f81014e = c43238hA;
        UV0.a<? extends TV0.a> aVar = this.f81018i;
        if (aVar != null) {
            this.f81015f = C43259k.d(c43238hA, null, null, new h(aVar, this, null), 3);
            this.f81018i = null;
        }
    }

    @Override // com.avito.android.advert.viewed.f
    public final void e0() {
        this.f81016g.e();
        C43238h c43238h = this.f81014e;
        if (c43238h != null) {
            U.b(c43238h, null);
        }
        this.f81014e = null;
        this.f81017h = null;
    }
}
