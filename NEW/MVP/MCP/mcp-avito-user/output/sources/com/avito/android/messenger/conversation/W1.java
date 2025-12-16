package com.avito.android.messenger.conversation;

import com.avito.android.messenger.conversation.ChannelActivityArguments;
import kotlin.Metadata;

/* compiled from: ChannelParams.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/W1;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class W1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f189238a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f189239b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f189240c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f189241d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f189242e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f189243f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f189244g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ChannelActivityArguments.PerformanceParams f189245h;

    public W1(@Y61.k String str, @Y61.l Integer num, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5, @Y61.l ChannelActivityArguments.PerformanceParams performanceParams) {
        this.f189238a = str;
        this.f189239b = num;
        this.f189240c = str2;
        this.f189241d = str3;
        this.f189242e = z12;
        this.f189243f = str4;
        this.f189244g = str5;
        this.f189245h = performanceParams;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1)) {
            return false;
        }
        W1 w12 = (W1) obj;
        return kotlin.jvm.internal.L.f(this.f189238a, w12.f189238a) && kotlin.jvm.internal.L.f(this.f189239b, w12.f189239b) && kotlin.jvm.internal.L.f(this.f189240c, w12.f189240c) && kotlin.jvm.internal.L.f(this.f189241d, w12.f189241d) && this.f189242e == w12.f189242e && kotlin.jvm.internal.L.f(this.f189243f, w12.f189243f) && kotlin.jvm.internal.L.f(this.f189244g, w12.f189244g) && kotlin.jvm.internal.L.f(this.f189245h, w12.f189245h);
    }

    public final int hashCode() {
        int iHashCode = this.f189238a.hashCode() * 31;
        Integer num = this.f189239b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f189240c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f189241d;
        int i12 = androidx.appcompat.app.r.i((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f189242e);
        String str3 = this.f189243f;
        int iHashCode4 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f189244g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        ChannelActivityArguments.PerformanceParams performanceParams = this.f189245h;
        return iHashCode5 + (performanceParams != null ? performanceParams.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "ChannelParams(channelId=" + this.f189238a + ", numberInList=" + this.f189239b + ", messageId=" + this.f189240c + ", searchQuery=" + this.f189241d + ", sendDraftMessageImmediately=" + this.f189242e + ", xHash=" + this.f189243f + ", flowId=" + this.f189244g + ", performanceParams=" + this.f189245h + ')';
    }
}
