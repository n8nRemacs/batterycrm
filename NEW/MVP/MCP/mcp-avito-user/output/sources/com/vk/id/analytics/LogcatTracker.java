package com.vk.id.analytics;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.vk.id.analytics.VKIDAnalytics;
import com.vk.id.common.InternalVKIDApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LogcatTracker.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/vk/id/analytics/LogcatTracker;", "Lcom/vk/id/analytics/VKIDAnalytics$Tracker;", "", "tag", "<init>", "(Ljava/lang/String;)V", "accessToken", "name", "", "Lcom/vk/id/analytics/VKIDAnalytics$EventParam;", "params", "Lkotlin/G0;", "trackEvent", "(Ljava/lang/String;Ljava/lang/String;[Lcom/vk/id/analytics/VKIDAnalytics$EventParam;)V", "Ljava/lang/String;", "analytics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogcatTracker implements VKIDAnalytics.Tracker {

    @k
    private final String tag;

    /* JADX WARN: Multi-variable type inference failed */
    public LogcatTracker() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.id.analytics.VKIDAnalytics.Tracker
    public void trackEvent(@l String accessToken, @k String name, @k VKIDAnalytics.EventParam... params) {
        int length = params.length;
        String strQ = "{ ";
        boolean z12 = true;
        int i12 = 0;
        while (i12 < length) {
            VKIDAnalytics.EventParam eventParam = params[i12];
            if (!z12) {
                strQ = r.q(strQ, ", ");
            }
            strQ = r.q(strQ, eventParam.getName());
            if (eventParam.getStrValue() != null) {
                strQ = r.q(r.q(strQ, ": "), eventParam.getStrValue());
            }
            if (eventParam.getIntValue() != null) {
                strQ = r.q(strQ, ": ") + eventParam.getIntValue();
            }
            i12++;
            z12 = false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strQ);
        sb2.append(" }");
    }

    public LogcatTracker(@k String str) {
        this.tag = str;
    }

    public /* synthetic */ LogcatTracker(String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "VKID Analytics" : str);
    }
}
