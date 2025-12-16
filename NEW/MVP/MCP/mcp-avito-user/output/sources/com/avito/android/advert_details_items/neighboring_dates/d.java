package com.avito.android.advert_details_items.neighboring_dates;

import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsNeighboringDatesPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertDetailsNeighboringDatesItem f84898l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ c f84899m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(AdvertDetailsNeighboringDatesItem advertDetailsNeighboringDatesItem, c cVar) {
        super(0);
        this.f84898l = advertDetailsNeighboringDatesItem;
        this.f84899m = cVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        DeepLink deepLink;
        AdvertDetailsNeighboringDatesItem.State.Content.ChangeDateButton f84882c = ((AdvertDetailsNeighboringDatesItem.State.Content) this.f84898l.f84871f).getF84882c();
        if (f84882c != null && (deepLink = f84882c.f84873c) != null) {
            this.f84899m.f84895b.M(deepLink);
        }
        return G0.f406611a;
    }
}
