package com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item;

import Y41.l;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DealUpdateItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/deal_update_item/d;", "LTV0/d;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/deal_update_item/g;", "Lcom/avito/android/developments_agency_search/screen/deal_cabinet/adapter/deal_update_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<g, com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<zw.b, G0> f136813b;

    /* compiled from: DealUpdateItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f136814a;

        static {
            int[] iArr = new int[GetDealUpdatesResponse.UpdatedDeal.Status.values().length];
            try {
                iArr[GetDealUpdatesResponse.UpdatedDeal.Status.CONFIRMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetDealUpdatesResponse.UpdatedDeal.Status.EXPIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetDealUpdatesResponse.UpdatedDeal.Status.REJECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f136814a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k l<? super zw.b, G0> lVar) {
        this.f136813b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        g gVar = (g) eVar;
        com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.a aVar2 = (com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.deal_update_item.a) aVar;
        GetDealUpdatesResponse.UpdatedDeal updatedDeal = aVar2.f136808b;
        gVar.l(updatedDeal.getImage());
        gVar.b(updatedDeal.getTitle());
        int i14 = a.f136814a[updatedDeal.getStatus().ordinal()];
        if (i14 == 1 || i14 == 2) {
            i13 = R.drawable.ic_done_filled_16x20;
        } else {
            if (i14 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = R.drawable.ic_exclamation_mark_filled_18x20;
        }
        gVar.setIcon(i13);
        gVar.j(updatedDeal.getSubtitle());
        gVar.gd(updatedDeal.getText());
        gVar.xN(updatedDeal.getClient().getName());
        gVar.a(new e(this, aVar2));
    }
}
