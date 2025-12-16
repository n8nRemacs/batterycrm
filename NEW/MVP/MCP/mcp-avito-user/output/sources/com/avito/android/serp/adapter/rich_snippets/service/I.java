package com.avito.android.serp.adapter.rich_snippets.service;

import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.event.service_booking.SbSignUpEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.serp.adapter.advert_xl.AdvertXlItem;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertXlRichServiceItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AdvertXlItem f271266l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ O f271267m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(AdvertXlItem advertXlItem, O o12) {
        super(0);
        this.f271266l = advertXlItem;
        this.f271267m = o12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        List<AdvertAction> actions;
        Object next;
        AdvertXlItem advertXlItem = this.f271266l;
        AdvertActions advertActions = advertXlItem.f268752E;
        DeepLink deepLink = null;
        if (advertActions != null && (actions = advertActions.getActions()) != null) {
            Iterator<T> it = actions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((AdvertAction) next) instanceof AdvertAction.Booking) {
                    break;
                }
            }
            AdvertAction advertAction = (AdvertAction) next;
            if (advertAction != null) {
                deepLink = advertAction.getDeepLink();
            }
        }
        if (deepLink != null) {
            O o12 = this.f271267m;
            o12.f271287f.c(new SbSignUpEvent(advertXlItem.f268777c, null, null, SbSignUpEvent.ServiceBookingSource.f90139f, null));
            o12.f271283b.get().W(advertXlItem.f268777c, deepLink, ContactSource.f89921f, null, null);
        }
        return G0.f406611a;
    }
}
