package com.avito.android.publish.items.location_addresses;

import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;

/* compiled from: LocationAddressesItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ParameterElement.C f236996l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f236997m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JO.m f236998n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ParameterElement.C c12, g gVar, JO.m mVar) {
        super(0);
        this.f236996l = c12;
        this.f236997m = gVar;
        this.f236998n = mVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        AddressParameter.SellerAddresses.DeleteAddressSheet deleteAddressSheet;
        ParameterElement.C c12 = this.f236996l;
        AddressParameter.SellerAddresses sellerAddresses = c12.f117207D;
        if (sellerAddresses != null && (deleteAddressSheet = sellerAddresses.getDeleteAddressSheet()) != null) {
            String description = deleteAddressSheet.getDescription();
            C43059p c43059p = new C43059p("%@");
            String str = c12.f117210f;
            if (str == null) {
                str = "";
            }
            this.f236997m.f237005h.accept(new Q<>(Boolean.valueOf(!this.f236998n.f8968i), AddressParameter.SellerAddresses.DeleteAddressSheet.copy$default(deleteAddressSheet, null, c43059p.f(description, str), null, 5, null)));
        }
        return G0.f406611a;
    }
}
