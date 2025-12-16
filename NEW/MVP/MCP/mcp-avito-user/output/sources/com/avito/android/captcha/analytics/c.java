package com.avito.android.captcha.analytics;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.captcha.q;
import com.avito.android.remote.captcha.model.CaptchaType;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CaptchaEventsTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/analytics/c;", "Lcom/avito/android/captcha/analytics/b;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f114964a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e f114965b;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a, @k e eVar) {
        this.f114964a = interfaceC28373a;
        this.f114965b = eVar;
    }

    @Override // com.avito.android.captcha.analytics.b
    public final void a(@k q qVar) {
        boolean z12 = qVar instanceof q.c;
        InterfaceC28373a interfaceC28373a = this.f114964a;
        if (z12) {
            q.c cVar = (q.c) qVar;
            this.f114965b.getClass();
            int iOrdinal = cVar.f115131c.ordinal();
            interfaceC28373a.c(new a(null, cVar.f115126a, Integer.valueOf(((iOrdinal == 0 || iOrdinal == 1) ? CaptchaAnalyticsError.f114957c : iOrdinal != 2 ? CaptchaAnalyticsError.f114959e : CaptchaAnalyticsError.f114958d).f114962b), cVar.f115132d.toString(), 1, null));
            return;
        }
        if (!(qVar instanceof q.b)) {
            boolean z13 = qVar instanceof q.a;
            return;
        }
        q.b bVar = (q.b) qVar;
        CaptchaAnalyticsError captchaAnalyticsError = CaptchaAnalyticsError.f114957c;
        CaptchaType captchaType = bVar.f115129c;
        interfaceC28373a.c(new a(null, bVar.f115126a, -1, captchaType != null ? captchaType.toString() : null, 1, null));
    }
}
