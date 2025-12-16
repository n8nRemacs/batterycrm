package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23472t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: MessageEntity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/O1;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.room.J
/* loaded from: classes15.dex */
public final /* data */ class O1 {

    /* renamed from: A, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215236A;

    /* renamed from: B, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215237B;

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215238a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215239b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215240c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    public final long f215241d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215242e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215243f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215244g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215245h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f215246i;

    /* renamed from: j, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f215247j;

    /* renamed from: k, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f215248k;

    /* renamed from: l, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215249l;

    /* renamed from: m, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215250m;

    /* renamed from: n, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f215251n;

    /* renamed from: o, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f215252o;

    /* renamed from: p, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final IsReadStatus f215253p;

    /* renamed from: q, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215254q;

    /* renamed from: r, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215255r;

    /* renamed from: s, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215256s;

    /* renamed from: t, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215257t;

    /* renamed from: u, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215258u;

    /* renamed from: v, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215259v;

    /* renamed from: w, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Boolean f215260w;

    /* renamed from: x, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Integer f215261x;

    /* renamed from: y, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215262y;

    /* renamed from: z, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserEntityType f215263z;

    /* compiled from: MessageEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/avito/android/persistence/messenger/O1$a;", "", "<init>", "()V", "", "COLUMN_CHANNEL_ID", "Ljava/lang/String;", "COLUMN_CREATED", "COLUMN_LOCAL_ID", "COLUMN_REMOTE_ID", "COLUMN_SEND_TIMESTAMP", "COLUMN_USER_ACCOUNT_ID", "COLUMN_USER_ID", "COLUMN_USER_TYPE", "TABLE_NAME", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public O1(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, long j12, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, @Y61.k String str7, boolean z12, boolean z13, boolean z14, @Y61.l Long l12, @Y61.l String str8, boolean z15, boolean z16, @Y61.k IsReadStatus isReadStatus, @Y61.l Long l13, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12, @Y61.l Long l14, @Y61.l Boolean bool, @Y61.l Integer num, @Y61.l String str13, @Y61.k UserEntityType userEntityType, @Y61.k String str14, @Y61.l Long l15) {
        this.f215238a = str;
        this.f215239b = str2;
        this.f215240c = str3;
        this.f215241d = j12;
        this.f215242e = str4;
        this.f215243f = str5;
        this.f215244g = str6;
        this.f215245h = str7;
        this.f215246i = z12;
        this.f215247j = z13;
        this.f215248k = z14;
        this.f215249l = l12;
        this.f215250m = str8;
        this.f215251n = z15;
        this.f215252o = z16;
        this.f215253p = isReadStatus;
        this.f215254q = l13;
        this.f215255r = str9;
        this.f215256s = str10;
        this.f215257t = str11;
        this.f215258u = str12;
        this.f215259v = l14;
        this.f215260w = bool;
        this.f215261x = num;
        this.f215262y = str13;
        this.f215263z = userEntityType;
        this.f215236A = str14;
        this.f215237B = l15;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O1)) {
            return false;
        }
        O1 o12 = (O1) obj;
        return kotlin.jvm.internal.L.f(this.f215238a, o12.f215238a) && kotlin.jvm.internal.L.f(this.f215239b, o12.f215239b) && kotlin.jvm.internal.L.f(this.f215240c, o12.f215240c) && this.f215241d == o12.f215241d && kotlin.jvm.internal.L.f(this.f215242e, o12.f215242e) && kotlin.jvm.internal.L.f(this.f215243f, o12.f215243f) && kotlin.jvm.internal.L.f(this.f215244g, o12.f215244g) && kotlin.jvm.internal.L.f(this.f215245h, o12.f215245h) && this.f215246i == o12.f215246i && this.f215247j == o12.f215247j && this.f215248k == o12.f215248k && kotlin.jvm.internal.L.f(this.f215249l, o12.f215249l) && kotlin.jvm.internal.L.f(this.f215250m, o12.f215250m) && this.f215251n == o12.f215251n && this.f215252o == o12.f215252o && this.f215253p == o12.f215253p && kotlin.jvm.internal.L.f(this.f215254q, o12.f215254q) && kotlin.jvm.internal.L.f(this.f215255r, o12.f215255r) && kotlin.jvm.internal.L.f(this.f215256s, o12.f215256s) && kotlin.jvm.internal.L.f(this.f215257t, o12.f215257t) && kotlin.jvm.internal.L.f(this.f215258u, o12.f215258u) && kotlin.jvm.internal.L.f(this.f215259v, o12.f215259v) && kotlin.jvm.internal.L.f(this.f215260w, o12.f215260w) && kotlin.jvm.internal.L.f(this.f215261x, o12.f215261x) && kotlin.jvm.internal.L.f(this.f215262y, o12.f215262y) && this.f215263z == o12.f215263z && kotlin.jvm.internal.L.f(this.f215236A, o12.f215236A) && kotlin.jvm.internal.L.f(this.f215237B, o12.f215237B);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f215238a.hashCode() * 31, 31, this.f215239b);
        String str = this.f215240c;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.appcompat.app.r.g((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f215241d), 31, this.f215242e), 31, this.f215243f), 31, this.f215244g), 31, this.f215245h), 31, this.f215246i), 31, this.f215247j), 31, this.f215248k);
        Long l12 = this.f215249l;
        int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str2 = this.f215250m;
        int iHashCode2 = (this.f215253p.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f215251n), 31, this.f215252o)) * 31;
        Long l13 = this.f215254q;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.f215255r;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f215256s;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f215257t;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f215258u;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Long l14 = this.f215259v;
        int iHashCode8 = (iHashCode7 + (l14 == null ? 0 : l14.hashCode())) * 31;
        Boolean bool = this.f215260w;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f215261x;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f215262y;
        int iD3 = androidx.compose.foundation.H.d((this.f215263z.hashCode() + ((iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31, 31, this.f215236A);
        Long l15 = this.f215237B;
        return iD3 + (l15 != null ? l15.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageEntity(localId=");
        sb2.append(this.f215238a);
        sb2.append(", channelId=");
        sb2.append(this.f215239b);
        sb2.append(", remoteId=");
        sb2.append(this.f215240c);
        sb2.append(", created=");
        sb2.append(this.f215241d);
        sb2.append(", type=");
        sb2.append(this.f215242e);
        sb2.append(", userId=");
        sb2.append(this.f215243f);
        sb2.append(", fromId=");
        sb2.append(this.f215244g);
        sb2.append(", jsonBody=");
        sb2.append(this.f215245h);
        sb2.append(", isRead=");
        sb2.append(this.f215246i);
        sb2.append(", isSpam=");
        sb2.append(this.f215247j);
        sb2.append(", isFailed=");
        sb2.append(this.f215248k);
        sb2.append(", readTimestamp=");
        sb2.append(this.f215249l);
        sb2.append(", preview=");
        sb2.append(this.f215250m);
        sb2.append(", isSupported=");
        sb2.append(this.f215251n);
        sb2.append(", isCompleteBody=");
        sb2.append(this.f215252o);
        sb2.append(", isReadStatus=");
        sb2.append(this.f215253p);
        sb2.append(", readLocallyTimestamp=");
        sb2.append(this.f215254q);
        sb2.append(", quotedMessageId=");
        sb2.append(this.f215255r);
        sb2.append(", quotedMessageFromId=");
        sb2.append(this.f215256s);
        sb2.append(", quotedMessageType=");
        sb2.append(this.f215257t);
        sb2.append(", quotedMessageJsonBody=");
        sb2.append(this.f215258u);
        sb2.append(", quotedMessageCreated=");
        sb2.append(this.f215259v);
        sb2.append(", isQuotedMessageBodyComplete=");
        sb2.append(this.f215260w);
        sb2.append(", quotedMessageChunkIndex=");
        sb2.append(this.f215261x);
        sb2.append(", xHash=");
        sb2.append(this.f215262y);
        sb2.append(", userType=");
        sb2.append(this.f215263z);
        sb2.append(", userAccountId=");
        sb2.append(this.f215236A);
        sb2.append(", sendTimeStamp=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.f215237B, ')');
    }

    public /* synthetic */ O1(String str, String str2, String str3, long j12, String str4, String str5, String str6, String str7, boolean z12, boolean z13, boolean z14, Long l12, String str8, boolean z15, boolean z16, IsReadStatus isReadStatus, Long l13, String str9, String str10, String str11, String str12, Long l14, Boolean bool, Integer num, String str13, UserEntityType userEntityType, String str14, Long l15, int i12, C42822w c42822w) {
        this(str, str2, str3, j12, str4, str5, str6, str7, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? false : z13, (i12 & 1024) != 0 ? false : z14, (i12 & 2048) != 0 ? null : l12, (i12 & 4096) != 0 ? null : str8, (i12 & 8192) != 0 ? true : z15, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? true : z16, (32768 & i12) != 0 ? IsReadStatus.IS_NOT_READ : isReadStatus, (65536 & i12) != 0 ? null : l13, (131072 & i12) != 0 ? null : str9, (262144 & i12) != 0 ? null : str10, (524288 & i12) != 0 ? null : str11, (1048576 & i12) != 0 ? null : str12, (2097152 & i12) != 0 ? null : l14, (4194304 & i12) != 0 ? null : bool, (8388608 & i12) != 0 ? null : num, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str13, userEntityType, str14, l15);
    }
}
