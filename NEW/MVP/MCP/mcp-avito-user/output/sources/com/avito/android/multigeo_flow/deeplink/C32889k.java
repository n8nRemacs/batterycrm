package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.multigeo_flow.deeplink.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32889k extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f206840l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddressItem f206841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JobMultiGeoLink.EditAddress f206842n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32889k(o oVar, AddressItem addressItem, JobMultiGeoLink.EditAddress editAddress) {
        super(0);
        this.f206840l = oVar;
        this.f206841m = addressItem;
        this.f206842n = editAddress;
    }

    @Override // Y41.a
    public final G0 invoke() {
        JobMultiGeoLink.EditAddress editAddress = this.f206842n;
        String jwt = editAddress.getJwt();
        JobMultiGeoLink.FlowType flowType = editAddress.getFlowType();
        o oVar = this.f206840l;
        AddressItem addressItem = this.f206841m;
        UserAddressLink.ForceExit forceExit = UserAddressLink.ForceExit.f133781b;
        b.a.a(oVar.f206851h, new UserAddressLink.MultiGeoMap(jwt, addressItem.f206874b, addressItem.f206875c, addressItem.f206877e, addressItem.f206878f, flowType, forceExit), null, null, 6);
        return G0.f406611a;
    }
}
