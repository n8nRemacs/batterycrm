package com.avito.android.user_advert.advert;

import com.avito.android.deep_linking.links.DiscountDispatchLink;
import com.avito.android.user_advert.advert.items.advert_details.MyAdvertDetailsItem;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class G0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f308234b;

    public G0(C35435m0 c35435m0) {
        this.f308234b = c35435m0;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        String str;
        MyAdvertDetailsActivity myAdvertDetailsActivity;
        C35435m0 c35435m0 = this.f308234b;
        MyAdvertDetailsItem myAdvertDetailsItem = c35435m0.f310465e0;
        if (myAdvertDetailsItem == null || (str = myAdvertDetailsItem.f309129b) == null || (myAdvertDetailsActivity = c35435m0.f310461c0) == null) {
            return;
        }
        myAdvertDetailsActivity.a(new DiscountDispatchLink(str, null, "onboarding", 2, null));
    }
}
