package com.avito.android.serp.adapter.seller_element.seller_pin;

import com.avito.android.serp.adapter.seller_element.SellerPinItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import rn0.InterfaceC47691c;

/* compiled from: PinnedSellerPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class d extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SellerPinItem f271708l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f271709m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SellerPinItem sellerPinItem, e eVar) {
        super(0);
        this.f271708l = sellerPinItem;
        this.f271709m = eVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        SellerPinItem sellerPinItem = this.f271708l;
        if (sellerPinItem.f271699f != null) {
            InterfaceC47691c.a.a(this.f271709m.f271710b.get(), sellerPinItem.f271699f, null, 14);
        }
        return G0.f406611a;
    }
}
