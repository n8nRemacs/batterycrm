package com.avito.android.multigeo_flow.deeplink;

import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.multigeo_flow.links.JobMultiGeoLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: JobMultiGeoAddDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/multigeo_flow/deeplink/c;", "Lev/a;", "Lcom/avito/android/multigeo_flow/links/JobMultiGeoLink$AddAddress;", "_avito_multigeo-flow_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.multigeo_flow.deeplink.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32881c extends AbstractC40161a<JobMultiGeoLink.AddAddress> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f206823f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C43238h f206824g;

    @Inject
    public C32881c(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k R0 r02) {
        this.f206823f = aVar;
        this.f206824g = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JobMultiGeoLink.AddAddress addAddress = (JobMultiGeoLink.AddAddress) deepLink;
        C43259k.d(this.f206824g, null, null, new C32879a(this, null), 3);
        b.a.a(this.f206823f, new UserAddressLink.MultiGeoSuggest(addAddress.getJwt(), addAddress.getFlowType(), UserAddressLink.ForceExit.f133781b), null, null, 6);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f206824g, null);
    }
}
