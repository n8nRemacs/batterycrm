package com.avito.android.favorite_comparison.presentation.items.comparison_list_item;

import Y61.k;
import android.view.View;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ComparisonListItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/g;", "LTV0/d;", "Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/i;", "Lcom/avito/android/favorite_comparison/presentation/items/comparison_list_item/a;", "_avito_favorite-comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements TV0.d<i, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<com.avito.android.favorite_comparison.presentation.a> f155335b;

    @Inject
    public g(@com.avito.android.favorite_comparison.di.b @k io.reactivex.rxjava3.subjects.e<com.avito.android.favorite_comparison.presentation.a> eVar) {
        this.f155335b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        View view;
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        iVar.b(aVar2.f155326c);
        iVar.j(aVar2.f155327d);
        iVar.K5(aVar2.f155328e);
        com.avito.konveyor.adapter.b bVar = iVar instanceof com.avito.konveyor.adapter.b ? (com.avito.konveyor.adapter.b) iVar : null;
        if (bVar == null || (view = bVar.itemView) == null) {
            return;
        }
        view.setOnClickListener(new com.avito.android.extended_profile_ui_components.c(7, this, aVar2));
    }
}
