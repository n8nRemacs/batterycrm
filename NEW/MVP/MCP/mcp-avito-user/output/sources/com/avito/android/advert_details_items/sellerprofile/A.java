package com.avito.android.advert_details_items.sellerprofile;

import com.avito.android.remote.model.AdvertDetails;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertSellerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class A extends kotlin.jvm.internal.N implements Y41.l<G0, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ D f85531l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(D d12) {
        super(1);
        this.f85531l = d12;
    }

    @Override // Y41.l
    public final G0 invoke(G0 g02) {
        D d12 = this.f85531l;
        AdvertDetails advertDetails = d12.f85554l;
        if (advertDetails != null) {
            d12.a(advertDetails);
        }
        return G0.f406611a;
    }
}
