package com.avito.android.remote.notification;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: VoipPushNotification.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/notification/U;", "", "Lcom/google/gson/i;", "payload", "", "", "analytics", "Lcom/avito/android/remote/notification/TrackingInfo;", "trackingInfo", "<init>", "(Lcom/google/gson/i;Ljava/util/Map;Lcom/avito/android/remote/notification/TrackingInfo;)V", "Lcom/google/gson/i;", "b", "()Lcom/google/gson/i;", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "Lcom/avito/android/remote/notification/TrackingInfo;", "c", "()Lcom/avito/android/remote/notification/TrackingInfo;", "_avito-discouraged_avito-api_notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class U {

    @com.google.gson.annotations.c("analytics")
    @Y61.l
    private final Map<String, Object> analytics;

    @com.google.gson.annotations.c("payload")
    @Y61.l
    private final com.google.gson.i payload;

    @com.google.gson.annotations.c("tracking")
    @Y61.l
    private final TrackingInfo trackingInfo;

    public U(@Y61.l com.google.gson.i iVar, @Y61.l Map<String, ? extends Object> map, @Y61.l TrackingInfo trackingInfo) {
        this.payload = iVar;
        this.analytics = map;
        this.trackingInfo = trackingInfo;
    }

    @Y61.l
    public final Map<String, Object> a() {
        return this.analytics;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final com.google.gson.i getPayload() {
        return this.payload;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u12 = (U) obj;
        return kotlin.jvm.internal.L.f(this.payload, u12.payload) && kotlin.jvm.internal.L.f(this.analytics, u12.analytics) && kotlin.jvm.internal.L.f(this.trackingInfo, u12.trackingInfo);
    }

    public final int hashCode() {
        com.google.gson.i iVar = this.payload;
        int iHashCode = (iVar == null ? 0 : iVar.hashCode()) * 31;
        Map<String, Object> map = this.analytics;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        TrackingInfo trackingInfo = this.trackingInfo;
        return iHashCode2 + (trackingInfo != null ? trackingInfo.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "VoipPushNotification(payload=" + this.payload + ", analytics=" + this.analytics + ", trackingInfo=" + this.trackingInfo + ')';
    }

    public /* synthetic */ U(com.google.gson.i iVar, Map map, TrackingInfo trackingInfo, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : iVar, map, trackingInfo);
    }
}
