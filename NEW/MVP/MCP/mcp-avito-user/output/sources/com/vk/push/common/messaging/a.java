package com.vk.push.common.messaging;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationPayload.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/push/common/messaging/a;", "", "sdk-public-push-common_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f366995a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f366996b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f366997c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f366998d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f366999e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f367000f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f367001g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ClickActionType f367002h;

    public a(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l ClickActionType clickActionType) {
        this.f366995a = str;
        this.f366996b = str2;
        this.f366997c = str3;
        this.f366998d = str4;
        this.f366999e = str5;
        this.f367000f = str6;
        this.f367001g = str7;
        this.f367002h = clickActionType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f366995a, aVar.f366995a) && L.f(this.f366996b, aVar.f366996b) && L.f(this.f366997c, aVar.f366997c) && L.f(this.f366998d, aVar.f366998d) && L.f(this.f366999e, aVar.f366999e) && L.f(this.f367000f, aVar.f367000f) && L.f(this.f367001g, aVar.f367001g) && this.f367002h == aVar.f367002h;
    }

    public final int hashCode() {
        int iHashCode = this.f366995a.hashCode() * 31;
        String str = this.f366996b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f366997c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f366998d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f366999e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f367000f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f367001g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        ClickActionType clickActionType = this.f367002h;
        return iHashCode7 + (clickActionType != null ? clickActionType.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "NotificationPayload(title=" + this.f366995a + ", body=" + this.f366996b + ", icon=" + this.f366997c + ", color=" + this.f366998d + ", image=" + this.f366999e + ", channelId=" + this.f367000f + ", clickAction=" + this.f367001g + ", clickActionType=" + this.f367002h + ')';
    }
}
