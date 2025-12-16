package com.avito.android.serp.adapter;

import com.avito.android.remote.model.SerpDisplayType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SerpItemSaturator.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/T0;", "Lcom/avito/android/serp/adapter/S0;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class T0 implements S0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.favorite.x f268588a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.viewed.d f268589b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advertising.kebab.n f268590c;

    @Inject
    public T0(@Y61.k com.avito.android.favorite.x xVar, @Y61.k com.avito.android.advert.viewed.d dVar, @Y61.k com.avito.android.advertising.kebab.n nVar) {
        this.f268588a = xVar;
        this.f268589b = dVar;
        this.f268590c = nVar;
    }

    @Override // com.avito.android.serp.adapter.S0
    @Y61.k
    public final l1 a(@Y61.k l1 l1Var, @Y61.k SerpDisplayType serpDisplayType) {
        if ((l1Var instanceof Q) && (!(l1Var instanceof AdvertItem) || !((AdvertItem) l1Var).f268393M0)) {
            ((Q) l1Var).a(serpDisplayType);
        }
        if (l1Var instanceof S) {
            S s5 = (S) l1Var;
            s5.setFavorite(this.f268588a.b(l1Var.getF264867b(), s5.getF268783f()));
        }
        if (l1Var instanceof m1) {
            ((m1) l1Var).setViewed(this.f268589b.a(l1Var.getF264867b()));
        }
        if (l1Var instanceof com.avito.android.advertising.i) {
            com.avito.android.advertising.i iVar = (com.avito.android.advertising.i) l1Var;
            iVar.setHidden(this.f268590c.e(iVar));
        }
        return l1Var;
    }
}
