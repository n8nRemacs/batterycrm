package com.avito.android.publish.deeplink;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.publish.links.JobEnrichmentFeedbackDeeplink;
import com.avito.android.util.R0;
import dl0.InterfaceC39749a;
import ev.AbstractC40161a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: JobEnrichmentFeedbackDeeplinkHandler.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/publish/deeplink/D;", "Lev/a;", "Lcom/avito/android/publish/links/JobEnrichmentFeedbackDeeplink;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class D extends AbstractC40161a<JobEnrichmentFeedbackDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f232528f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39749a f232529g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C43238h f232530h;

    @Inject
    public D(@Y61.k a.d dVar, @Y61.k R0 r02, @Y61.k InterfaceC39749a interfaceC39749a) {
        this.f232528f = dVar;
        this.f232529g = interfaceC39749a;
        this.f232530h = U.a(CoroutineContext.Element.DefaultImpls.plus(Q0.a(), r02.b()));
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        this.f232528f.k0(new B(this));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f232530h, null);
    }
}
