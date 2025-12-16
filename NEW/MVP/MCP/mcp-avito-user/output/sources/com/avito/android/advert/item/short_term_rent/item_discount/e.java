package com.avito.android.advert.item.short_term_rent.item_discount;

import Y41.l;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsShortTermRentItemDiscountPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", TooltipAttribute.PARAM_DEEP_LINK, "Lkotlin/G0;", "invoke", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e extends N implements l<Uri, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f80044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f80044l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(Uri uri) {
        Uri uri2 = uri;
        if (uri2 != null) {
            f fVar = this.f80044l;
            DeepLink deepLinkE = fVar.f80046c.e(uri2);
            Bundle bundle = new Bundle();
            bundle.putString("advert_id", fVar.f80047d);
            G0 g02 = G0.f406611a;
            fVar.f80045b.r6(bundle, deepLinkE, "key_advert_details_str_item_discount");
        }
        return G0.f406611a;
    }
}
