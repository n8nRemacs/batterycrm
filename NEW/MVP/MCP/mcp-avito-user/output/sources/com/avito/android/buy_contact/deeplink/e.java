package com.avito.android.buy_contact.deeplink;

import Fk.InterfaceC13809a;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import bv.C25719a;
import com.avito.android.buy_contact_link.link.JobBuyContactLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;

/* compiled from: BuyContactDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/buy_contact/deeplink/e;", "Lev/a;", "Lcom/avito/android/buy_contact_link/link/JobBuyContactLink;", "_avito_job_buy-contact-link_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e extends AbstractC40161a<JobBuyContactLink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C25719a f108780f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC13809a f108781g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f108782h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final C43238h f108783i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public String f108784j;

    @Inject
    public e(@k C25719a c25719a, @k InterfaceC13809a interfaceC13809a, @k com.avito.android.deeplink_handler.handler.composite.a aVar, @k R0 r02) {
        this.f108780f = c25719a;
        this.f108781g = interfaceC13809a;
        this.f108782h = aVar;
        this.f108783i = U.a(r02.c());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JobBuyContactLink jobBuyContactLink = (JobBuyContactLink) deepLink;
        C43175k.K(new C43197r1(new b(2, this, e.class, "processDeeplinkResult", "processDeeplinkResult(Lcom/avito/android/deeplink_handler/handler/result/DeeplinkResultEvent;)V", 4), new a(y.a(this.f108782h.d9()), this)), this.f108783i);
        this.f108780f.b(jobBuyContactLink, this, null, new d(this, jobBuyContactLink));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f108783i, null);
    }
}
