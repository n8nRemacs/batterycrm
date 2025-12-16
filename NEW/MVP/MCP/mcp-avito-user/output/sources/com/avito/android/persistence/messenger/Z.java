package com.avito.android.persistence.messenger;

import androidx.compose.runtime.C22026a;
import androidx.room.InterfaceC23472t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChannelMetaInfo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/Z;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.room.J
/* loaded from: classes15.dex */
public final /* data */ class Z {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215381a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215382b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215383c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    public final boolean f215384d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215385e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserEntityType f215386f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215387g;

    /* compiled from: ChannelMetaInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/persistence/messenger/Z$a;", "", "<init>", "()V", "", "COLUMN_CHANNEL_ID", "Ljava/lang/String;", "COLUMN_DELETED_LOCALLY_TIMESTAMP", "COLUMN_LAST_SYNCED_MESSAGE_TIMESTAMP", "COLUMN_LOCAL_USER_ACCOUNT_ID", "COLUMN_LOCAL_USER_ID", "COLUMN_LOCAL_USER_TYPE", "COLUMN_SELLERS_SUGGESTS_ENABLED", "TABLE_NAME", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public Z(@Y61.k String str, @Y61.k String str2, @Y61.l Long l12, boolean z12, @Y61.l Long l13, @Y61.k UserEntityType userEntityType, @Y61.k String str3) {
        this.f215381a = str;
        this.f215382b = str2;
        this.f215383c = l12;
        this.f215384d = z12;
        this.f215385e = l13;
        this.f215386f = userEntityType;
        this.f215387g = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z12 = (Z) obj;
        return kotlin.jvm.internal.L.f(this.f215381a, z12.f215381a) && kotlin.jvm.internal.L.f(this.f215382b, z12.f215382b) && kotlin.jvm.internal.L.f(this.f215383c, z12.f215383c) && this.f215384d == z12.f215384d && kotlin.jvm.internal.L.f(this.f215385e, z12.f215385e) && this.f215386f == z12.f215386f && kotlin.jvm.internal.L.f(this.f215387g, z12.f215387g);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f215381a.hashCode() * 31, 31, this.f215382b);
        Long l12 = this.f215383c;
        int i12 = androidx.appcompat.app.r.i((iD2 + (l12 == null ? 0 : l12.hashCode())) * 31, 31, this.f215384d);
        Long l13 = this.f215385e;
        return this.f215387g.hashCode() + ((this.f215386f.hashCode() + ((i12 + (l13 != null ? l13.hashCode() : 0)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChannelMetaInfo(localUserId=");
        sb2.append(this.f215381a);
        sb2.append(", channelId=");
        sb2.append(this.f215382b);
        sb2.append(", lastSyncedMessageTimeStamp=");
        sb2.append(this.f215383c);
        sb2.append(", sellersSuggestsEnabled=");
        sb2.append(this.f215384d);
        sb2.append(", deletedLocallyTimeStamp=");
        sb2.append(this.f215385e);
        sb2.append(", localUserType=");
        sb2.append(this.f215386f);
        sb2.append(", localUserAccountId=");
        return C22026a.c(sb2, this.f215387g, ')');
    }

    public /* synthetic */ Z(String str, String str2, Long l12, boolean z12, Long l13, UserEntityType userEntityType, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : l12, (i12 & 8) != 0 ? true : z12, (i12 & 16) != 0 ? null : l13, userEntityType, str3);
    }
}
