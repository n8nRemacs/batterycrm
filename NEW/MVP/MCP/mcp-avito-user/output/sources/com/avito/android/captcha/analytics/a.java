package com.avito.android.captcha.analytics;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: CaptchaErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/captcha/analytics/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_captcha"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f114963b;

    public a() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f114963b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f114963b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f114963b.f90248c;
    }

    public a(String str, String str2, Integer num, String str3, int i12, C42822w c42822w) {
        this.f114963b = new ParametrizedClickStreamEvent(7589, 7, C35755b0.c(P0.g(new Q("user_id", (i12 & 1) != 0 ? null : str), new Q("errors_detailed", (i12 & 2) != 0 ? null : str2), new Q("firewall_hcaptcha_error", String.valueOf((i12 & 4) != 0 ? null : num)), new Q("type_internal_captcha", (i12 & 8) != 0 ? null : str3))), null, 8, null);
    }
}
