package com.avito.android.sbc.create.mvi;

import Ju.InterfaceC14249c;
import Uo0.e;
import com.avito.android.deep_linking.links.LegacyPaymentSessionLink;
import com.avito.android.deep_linking.links.MyAdvertLink;
import com.avito.android.deep_linking.links.PaymentSessionLink;
import com.avito.android.sbc.create.mvi.CreateDiscountDispatchFragment;
import com.avito.android.util.V2;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: CreateDiscountDispatchFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class D0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateDiscountDispatchFragment f259276b;

    public D0(CreateDiscountDispatchFragment createDiscountDispatchFragment) {
        this.f259276b = createDiscountDispatchFragment;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        boolean z12 = interfaceC14249c instanceof PaymentSessionLink.b.C4013b ? true : interfaceC14249c instanceof LegacyPaymentSessionLink.b.C4003b;
        CreateDiscountDispatchFragment createDiscountDispatchFragment = this.f259276b;
        if (z12) {
            CreateDiscountDispatchFragment.a aVar = CreateDiscountDispatchFragment.f259243G0;
            createDiscountDispatchFragment.q5().accept(e.z.f16645a);
            return;
        }
        if (interfaceC14249c instanceof PaymentSessionLink.b.a ? true : interfaceC14249c instanceof LegacyPaymentSessionLink.b.a) {
            CreateDiscountDispatchFragment.a aVar2 = CreateDiscountDispatchFragment.f259243G0;
            createDiscountDispatchFragment.q5().accept(e.s.f16638a);
        } else if (interfaceC14249c instanceof MyAdvertLink.Edit.Result.Success) {
            CreateDiscountDispatchFragment.a aVar3 = CreateDiscountDispatchFragment.f259243G0;
            createDiscountDispatchFragment.q5().accept(e.k.f16630a);
        } else {
            V2.f318762a.e("Unexpected result: " + interfaceC14249c, null);
        }
    }
}
