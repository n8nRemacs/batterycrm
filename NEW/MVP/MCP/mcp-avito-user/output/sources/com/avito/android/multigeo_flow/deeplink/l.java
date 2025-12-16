package com.avito.android.multigeo_flow.deeplink;

import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;

/* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o f206843l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AddressItem f206844m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ JobMultiGeoLink.EditAddress f206845n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, AddressItem addressItem, JobMultiGeoLink.EditAddress editAddress) {
        super(0);
        this.f206843l = oVar;
        this.f206844m = addressItem;
        this.f206845n = editAddress;
    }

    @Override // Y41.a
    public final G0 invoke() {
        String jwt = this.f206845n.getJwt();
        o oVar = this.f206843l;
        C43259k.d(oVar.f206853j, null, null, new C32888j(oVar, this.f206844m, jwt, null), 3);
        return G0.f406611a;
    }
}
