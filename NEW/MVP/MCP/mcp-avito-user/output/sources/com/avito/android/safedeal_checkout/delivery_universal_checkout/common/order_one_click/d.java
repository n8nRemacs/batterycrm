package com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click;

import com.avito.android.beduin_models.BeduinUniversalPageContent;
import com.avito.android.deep_linking.links.BeduinUniversalPageLink;
import com.avito.android.deep_linking.links.ScreenStyle;
import com.avito.android.safedeal_checkout.delivery_universal_checkout.common.order_one_click.a;
import kotlin.Metadata;

/* compiled from: DeliveryOrderRealOneClickDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin_models/BeduinUniversalPageContent;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/beduin_models/BeduinUniversalPageContent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f256944b;

    public d(a aVar) {
        this.f256944b = aVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        BeduinUniversalPageContent beduinUniversalPageContent = (BeduinUniversalPageContent) obj;
        a aVar = this.f256944b;
        aVar.i(a.AbstractC7706a.C7707a.f256940b, aVar.f256933i, new BeduinUniversalPageLink(null, ScreenStyle.BOTTOM_SHEET.f133649b, beduinUniversalPageContent.getScreenName(), Long.valueOf(aVar.f256934j.a(beduinUniversalPageContent)), null, "avitoRe23", null, 80, null));
    }
}
