package com.avito.android.messenger.analytics;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: FileUploadedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/analytics/p;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.analytics.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31660p implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f186303b;

    public C31660p(String str, String str2, String str3, String str4, String str5, Long l12, String str6, Long l13, int i12, C42822w c42822w) {
        this.f186303b = new ParametrizedClickStreamEvent(4844, 6, C35755b0.c(P0.g(new kotlin.Q("chatid", str), new kotlin.Q("size", (i12 & 32) != 0 ? null : l12), new kotlin.Q("msg_file", (i12 & 2) != 0 ? null : str2), new kotlin.Q("video_id", (i12 & 4) != 0 ? null : str3), new kotlin.Q("file_extension", (i12 & 8) != 0 ? null : str4), new kotlin.Q("video_quality", (i12 & 16) != 0 ? null : str5), new kotlin.Q("msg_voice_id", (i12 & 64) != 0 ? null : str6), new kotlin.Q("voice_length", (i12 & 128) == 0 ? l13 : null))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f186303b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f186303b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f186303b.f90248c;
    }
}
