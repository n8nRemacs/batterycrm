package com.avito.android.multigeo_flow.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.multigeo_flow.domain.AddressItem;
import com.avito.android.multigeo_flow.full_list.view.JobMultiGeoParams;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;
import sv.C48421d;

/* compiled from: JobMultiGeoFullListDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/deeplink/x;", "Lev/a;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$FullList;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class x extends AbstractC40161a<JobMultiGeoLink.FullList> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.InterfaceC4053a f206865f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final N20.a f206866g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final a.b f206867h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C43238h f206868i;

    @Inject
    public x(@Y61.k a.InterfaceC4053a interfaceC4053a, @Y61.k N20.a aVar, @Y61.k a.b bVar, @Y61.k R0 r02) {
        this.f206865f = interfaceC4053a;
        this.f206866g = aVar;
        this.f206867h = bVar;
        this.f206868i = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JobMultiGeoLink.FullList fullList = (JobMultiGeoLink.FullList) deepLink;
        C43259k.d(this.f206868i, null, null, new v(this, null), 3);
        String jwt = fullList.getJwt();
        List<JobMultiGeoLink.Address> listJ = fullList.j();
        ArrayList arrayList = new ArrayList(C42745f0.q(listJ, 10));
        for (JobMultiGeoLink.Address address : listJ) {
            arrayList.add(new AddressItem(address.getAddress(), address.getAddressId(), address.getLocationId(), address.getLongitude(), address.getLatitude(), null, 32, null));
        }
        this.f206865f.J(this.f206866g.a(new JobMultiGeoParams(jwt, arrayList, fullList.getFullListTitle(), fullList.getFullListButtonTitle(), fullList.getMaxListLimit(), fullList.getFlowType())), C48421d.a(this), com.avito.android.deeplink_handler.view.c.f134589l);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f206868i, null);
    }
}
