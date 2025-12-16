package com.avito.android.user_advert.advert;

import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import jJ0.C42265a;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsPresenter.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/deep_linking/links/DetailsSheetLinkBody;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class S0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C35435m0 f308424b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f308425c;

    public S0(C35435m0 c35435m0, String str) {
        this.f308424b = c35435m0;
        this.f308425c = str;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        DetailsSheetLinkBody detailsSheetLinkBody = (DetailsSheetLinkBody) obj;
        C35435m0 c35435m0 = this.f308424b;
        MyAdvertDetailsActivity myAdvertDetailsActivity = c35435m0.f310461c0;
        if (myAdvertDetailsActivity != null) {
            myAdvertDetailsActivity.a(new DetailsSheetLink(detailsSheetLinkBody, null, 2, null));
        }
        c35435m0.f310480m.c(new C42265a(this.f308425c));
    }
}
