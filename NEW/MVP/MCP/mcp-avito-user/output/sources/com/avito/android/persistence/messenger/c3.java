package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23472t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UserEntity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/c3;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.room.J
/* loaded from: classes15.dex */
public final /* data */ class c3 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215420a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215421b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215422c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215423d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215424e;

    /* renamed from: f, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215425f;

    /* renamed from: g, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final Long f215426g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.l
    public final String f215427h;

    /* renamed from: i, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserEntityType f215428i;

    /* compiled from: UserEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/avito/android/persistence/messenger/c3$a;", "", "<init>", "()V", "", "COLUMN_CHANNEL_ID", "Ljava/lang/String;", "COLUMN_JSON_PUBLIC_PROFILE", "COLUMN_LABEL", "COLUMN_LAST_ACTION_TIME", "COLUMN_LOCAL_USER_ID", "COLUMN_LOCAL_USER_TYPE", "COLUMN_NAME", "COLUMN_TIME_DIFF", "COLUMN_USER_ID", "TABLE_NAME", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public c3(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Long l12, @Y61.l Long l13, @Y61.l String str6, @Y61.k UserEntityType userEntityType) {
        this.f215420a = str;
        this.f215421b = str2;
        this.f215422c = str3;
        this.f215423d = str4;
        this.f215424e = str5;
        this.f215425f = l12;
        this.f215426g = l13;
        this.f215427h = str6;
        this.f215428i = userEntityType;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3)) {
            return false;
        }
        c3 c3Var = (c3) obj;
        return kotlin.jvm.internal.L.f(this.f215420a, c3Var.f215420a) && kotlin.jvm.internal.L.f(this.f215421b, c3Var.f215421b) && kotlin.jvm.internal.L.f(this.f215422c, c3Var.f215422c) && kotlin.jvm.internal.L.f(this.f215423d, c3Var.f215423d) && kotlin.jvm.internal.L.f(this.f215424e, c3Var.f215424e) && kotlin.jvm.internal.L.f(this.f215425f, c3Var.f215425f) && kotlin.jvm.internal.L.f(this.f215426g, c3Var.f215426g) && kotlin.jvm.internal.L.f(this.f215427h, c3Var.f215427h) && this.f215428i == c3Var.f215428i;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f215420a.hashCode() * 31, 31, this.f215421b), 31, this.f215422c);
        String str = this.f215423d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f215424e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l12 = this.f215425f;
        int iHashCode3 = (iHashCode2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f215426g;
        int iHashCode4 = (iHashCode3 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str3 = this.f215427h;
        return this.f215428i.hashCode() + ((iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "UserEntity(localUserId=" + this.f215420a + ", userId=" + this.f215421b + ", channelId=" + this.f215422c + ", name=" + this.f215423d + ", label=" + this.f215424e + ", lastActionTime=" + this.f215425f + ", timeDiff=" + this.f215426g + ", jsonPublicProfile=" + this.f215427h + ", localUserType=" + this.f215428i + ')';
    }

    public /* synthetic */ c3(String str, String str2, String str3, String str4, String str5, Long l12, Long l13, String str6, UserEntityType userEntityType, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, (i12 & 32) != 0 ? null : l12, (i12 & 64) != 0 ? null : l13, (i12 & 128) != 0 ? null : str6, userEntityType);
    }
}
