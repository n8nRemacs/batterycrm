package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23472t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MessageUploadPart.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/x2;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.room.J
/* renamed from: com.avito.android.persistence.messenger.x2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C33136x2 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215571a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215572b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215573c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    public final long f215574d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    public final long f215575e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215576f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final TransferStatus f215577g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215578h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215579i;

    /* renamed from: j, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserEntityType f215580j;

    /* compiled from: MessageUploadPart.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/avito/android/persistence/messenger/x2$a;", "", "<init>", "()V", "", "COLUMN_CHANNEL_ID", "Ljava/lang/String;", "COLUMN_E_TAG", "COLUMN_HASH", "COLUMN_LOCAL_MESSAGE_ID", "COLUMN_LOCAL_USER_ID", "COLUMN_LOCAL_USER_TYPE", "COLUMN_PART_NUMBER", "COLUMN_PATH", "COLUMN_TOTAL_NUMBER_OF_PARTS", "COLUMN_TRANSFER_STATUS", "TABLE_NAME", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.persistence.messenger.x2$a */
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

    public C33136x2(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, long j13, @Y61.k String str4, @Y61.k TransferStatus transferStatus, @Y61.l String str5, @Y61.l String str6, @Y61.k UserEntityType userEntityType) {
        this.f215571a = str;
        this.f215572b = str2;
        this.f215573c = str3;
        this.f215574d = j12;
        this.f215575e = j13;
        this.f215576f = str4;
        this.f215577g = transferStatus;
        this.f215578h = str5;
        this.f215579i = str6;
        this.f215580j = userEntityType;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33136x2)) {
            return false;
        }
        C33136x2 c33136x2 = (C33136x2) obj;
        return kotlin.jvm.internal.L.f(this.f215571a, c33136x2.f215571a) && kotlin.jvm.internal.L.f(this.f215572b, c33136x2.f215572b) && kotlin.jvm.internal.L.f(this.f215573c, c33136x2.f215573c) && this.f215574d == c33136x2.f215574d && this.f215575e == c33136x2.f215575e && kotlin.jvm.internal.L.f(this.f215576f, c33136x2.f215576f) && this.f215577g == c33136x2.f215577g && kotlin.jvm.internal.L.f(this.f215578h, c33136x2.f215578h) && kotlin.jvm.internal.L.f(this.f215579i, c33136x2.f215579i) && this.f215580j == c33136x2.f215580j;
    }

    public final int hashCode() {
        int iHashCode = (this.f215577g.hashCode() + androidx.compose.foundation.H.d(androidx.appcompat.app.r.g(androidx.appcompat.app.r.g(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f215571a.hashCode() * 31, 31, this.f215572b), 31, this.f215573c), 31, this.f215574d), 31, this.f215575e), 31, this.f215576f)) * 31;
        String str = this.f215578h;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215579i;
        return this.f215580j.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "MessageUploadPart(localUserId=" + this.f215571a + ", channelId=" + this.f215572b + ", localMessageId=" + this.f215573c + ", partNumber=" + this.f215574d + ", totalNumberOfParts=" + this.f215575e + ", path=" + this.f215576f + ", transferStatus=" + this.f215577g + ", hash=" + this.f215578h + ", eTag=" + this.f215579i + ", localUserType=" + this.f215580j + ')';
    }

    public /* synthetic */ C33136x2(String str, String str2, String str3, long j12, long j13, String str4, TransferStatus transferStatus, String str5, String str6, UserEntityType userEntityType, int i12, C42822w c42822w) {
        this(str, str2, str3, j12, j13, str4, (i12 & 64) != 0 ? TransferStatus.NONE : transferStatus, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? null : str6, userEntityType);
    }
}
