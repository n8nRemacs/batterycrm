package com.avito.android.campaigns_sale_search.konveyor.history_item;

import Y41.l;
import Y61.k;
import com.avito.android.calltracking.item.m;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: HistoryItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/history_item/f;", "LTV0/d;", "Lcom/avito/android/campaigns_sale_search/konveyor/history_item/h;", "Lcom/avito/android/campaigns_sale_search/konveyor/history_item/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements TV0.d<h, a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<um.b, G0> f114570b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@k l<? super um.b, G0> lVar) {
        this.f114570b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.f114575d.setText(aVar2.f114561c);
        hVar.f114574c.setOnClickListener(new m(3, new d(this, aVar2)));
        hVar.f114573b.setOnClickListener(new m(4, new e(this, aVar2)));
    }
}
