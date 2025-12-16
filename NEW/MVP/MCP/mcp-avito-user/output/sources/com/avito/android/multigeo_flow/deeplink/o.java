package com.avito.android.multigeo_flow.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: JobMultiGeoEditDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/deeplink/o;", "Lev/a;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$EditAddress;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class o extends AbstractC40161a<JobMultiGeoLink.EditAddress> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f206849f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.g f206850g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f206851h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.multigeo_flow.domain.b f206852i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C43238h f206853j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public com.avito.android.multigeo_flow.edit_address.a f206854k;

    @Inject
    public o(@Y61.k a.d dVar, @Y61.k a.g gVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.multigeo_flow.domain.b bVar, @Y61.k R0 r02) {
        this.f206849f = dVar;
        this.f206850g = gVar;
        this.f206851h = aVar;
        this.f206852i = bVar;
        this.f206853j = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        C43259k.d(this.f206853j, null, null, new C32886h(this, null), 3);
        this.f206849f.k0(new n(this, (JobMultiGeoLink.EditAddress) deepLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        com.avito.android.multigeo_flow.edit_address.a aVar = this.f206854k;
        if (aVar != null) {
            aVar.r();
        }
        U.b(this.f206853j, null);
    }
}
