package com.avito.android.seller_promotions.deep_link;

import com.avito.android.deep_linking.links.PromotionsSellerLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sv.C48421d;

/* compiled from: SellerPromotionsLinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f267674l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PromotionsSellerLink f267675m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, PromotionsSellerLink promotionsSellerLink) {
        super(0);
        this.f267674l = gVar;
        this.f267675m = promotionsSellerLink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        g gVar = this.f267674l;
        PromotionsSellerLink promotionsSellerLink = this.f267675m;
        gVar.f267677g.J(gVar.f267676f.a(promotionsSellerLink.f133615b, promotionsSellerLink.f133616c, promotionsSellerLink.f133617d, promotionsSellerLink.f133618e, promotionsSellerLink.f133619f, promotionsSellerLink.f133620g), C48421d.a(gVar), com.avito.android.deeplink_handler.view.c.f134589l);
        return G0.f406611a;
    }
}
