package com.avito.android.favorites.adapter.promo_banner_with_description;

import Y41.l;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.comfortable_deal.deeplink.PpRecallDeeplink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: PromoBannerRecallWithDescriptionPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "phoneNumber", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f156776l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar) {
        super(1);
        this.f156776l = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        Bundle bundleB = C22777e.b(new Q("recalldeeplink.placement", "middle"), new Q("recalldeeplink.pagetype", "favorites"), new Q("recalldeeplink.banner_name", "rre_trx_favorites_2024_v1"));
        g gVar = this.f156776l;
        gVar.f156780b.s(new PpRecallDeeplink("", str, "favorites"), bundleB);
        return G0.f406611a;
    }
}
