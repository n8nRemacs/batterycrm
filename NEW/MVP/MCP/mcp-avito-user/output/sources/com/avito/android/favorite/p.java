package com.avito.android.favorite;

import com.avito.android.di.InterfaceC30264p;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.serp.adapter.S;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.rx3.S0;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FavoriteAdvertsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite/p;", "Lcom/avito/android/favorite/n;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class p implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f155228b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f155229c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f155230d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public UV0.a<? extends TV0.a> f155231e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public s f155232f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f155233g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<S> f155234h = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public p(@Y61.k h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l @InterfaceC30264p String str) {
        this.f155228b = hVar;
        this.f155229c = interfaceC35745a5;
        this.f155230d = str;
    }

    public static final void a(p pVar, List list, boolean z12) {
        UV0.a<? extends TV0.a> aVar = pVar.f155231e;
        if (aVar == null) {
            return;
        }
        int i12 = 0;
        for (Object obj : com.avito.konveyor.util.g.b(aVar)) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            TV0.a aVar2 = (TV0.a) obj;
            if (aVar2 instanceof S) {
                S s5 = (S) aVar2;
                if (list.contains(s5.getF85687d())) {
                    s5.setFavorite(z12);
                    s sVar = pVar.f155232f;
                    if (sVar != null) {
                        sVar.C3(i12);
                    }
                }
            }
            i12 = i13;
        }
    }

    @Override // com.avito.android.favorite.n
    public final void I() {
        this.f155232f = null;
        this.f155233g.e();
    }

    @Override // com.avito.android.favorite.u
    public final void Ld(@Y61.k S s5, @Y61.l AbstractC30567a abstractC30567a) {
        this.f155234h.accept(s5);
        String f85687d = s5.getF85687d();
        if (abstractC30567a == null) {
            abstractC30567a = new AbstractC30567a.m(s5.getF107478n());
        }
        boolean f107475k = s5.getF107475k();
        AdvertisementVerticalAlias f107479o = s5.getF107479o();
        String str = this.f155230d;
        this.f155233g.b(S0.a(this.f155228b.g(f85687d, abstractC30567a, f107475k, f107479o, null, (2016 & 32) != 0 ? null : null, (2016 & 64) != 0 ? null : null, (2016 & 128) != 0 ? null : null, (2016 & 256) != 0 ? null : null, (2016 & 512) != 0 ? null : str, (2016 & 1024) != 0)));
    }

    @Override // com.avito.android.favorite.n
    public final void c(@Y61.k UV0.a<? extends TV0.a> aVar) {
        this.f155231e = aVar;
    }

    @Override // com.avito.android.favorite.n
    @Y61.k
    /* renamed from: qa, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF155234h() {
        return this.f155234h;
    }

    @Override // com.avito.android.favorite.n
    public final void s4(@Y61.k s sVar) {
        this.f155232f = sVar;
        this.f155233g.b(this.f155228b.c().m(this.f155229c.e()).p(new o(this), io.reactivex.rxjava3.internal.functions.a.f401996f, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
