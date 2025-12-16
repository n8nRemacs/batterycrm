package com.avito.android.multigeo_flow.deeplink;

import android.content.Context;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/Context;", "context", "Lcom/avito/android/lib/design/bottom_sheet/d;", "invoke", "(Landroid/content/Context;)Lcom/avito/android/lib/design/bottom_sheet/d;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class n extends N implements Y41.l<Context, com.avito.android.lib.design.bottom_sheet.d> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f206847l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ JobMultiGeoLink.EditAddress f206848m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, JobMultiGeoLink.EditAddress editAddress) {
        super(1);
        this.f206847l = oVar;
        this.f206848m = editAddress;
    }

    @Override // Y41.l
    public final com.avito.android.lib.design.bottom_sheet.d invoke(Context context) {
        JobMultiGeoLink.EditAddress editAddress = this.f206848m;
        JobMultiGeoLink.Address address = editAddress.getAddress();
        o oVar = this.f206847l;
        AddressItem addressItem = new AddressItem(address.getAddress(), address.getAddressId(), address.getLocationId(), address.getLongitude(), address.getLatitude(), null, 32, null);
        com.avito.android.multigeo_flow.edit_address.a aVar = new com.avito.android.multigeo_flow.edit_address.a(context, addressItem, new C32889k(oVar, addressItem, editAddress), new l(oVar, addressItem, editAddress), new m(oVar));
        oVar.f206854k = aVar;
        return aVar;
    }
}
