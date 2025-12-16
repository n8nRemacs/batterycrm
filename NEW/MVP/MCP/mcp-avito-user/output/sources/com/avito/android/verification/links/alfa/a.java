package com.avito.android.verification.links.alfa;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AlphaIdErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/links/alfa/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f324147b;

    public a(@k String str, @k Map<String, String> map, @k String str2) {
        Q q12 = new Q("deep_link", str);
        String str3 = map.get(MessageBody.SystemMessageBody.Platform.FLOW);
        Q q13 = new Q("s", str3 == null ? "" : str3);
        String str4 = map.get("type");
        this.f324147b = new ParametrizedClickStreamEvent(9924, 1, "verification_alfa_error", P0.g(q12, q13, new Q("verification_levels", str4 != null ? str4 : ""), new Q("errors_detailed", str2)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f324147b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f324147b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f324147b.f90248c;
    }
}
