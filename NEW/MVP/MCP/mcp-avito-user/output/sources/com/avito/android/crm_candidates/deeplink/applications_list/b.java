package com.avito.android.crm_candidates.deeplink.applications_list;

import Y61.k;
import Ys.InterfaceC18322a;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_candidates.link.JobCrmCandidatesDeeplink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: JobCrmApplicationsListDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/applications_list/b;", "Lev/a;", "Lcom/avito/android/crm_candidates/link/JobCrmCandidatesDeeplink;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b extends AbstractC40161a<JobCrmCandidatesDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC18322a f129135f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.InterfaceC4053a f129136g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C25719a f129137h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final InterfaceC28373a f129138i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final E f129139j;

    @Inject
    public b(@k InterfaceC18322a interfaceC18322a, @k a.InterfaceC4053a interfaceC4053a, @k C25719a c25719a, @k InterfaceC28373a interfaceC28373a, @k E e12) {
        this.f129135f = interfaceC18322a;
        this.f129136g = interfaceC4053a;
        this.f129137h = c25719a;
        this.f129138i = interfaceC28373a;
        this.f129139j = e12;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JobCrmCandidatesDeeplink jobCrmCandidatesDeeplink = (JobCrmCandidatesDeeplink) deepLink;
        this.f129137h.b(jobCrmCandidatesDeeplink, this, null, new a(this, jobCrmCandidatesDeeplink));
    }
}
