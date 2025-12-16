package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23472t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DraftEntity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/P0;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.room.J
/* loaded from: classes15.dex */
public final /* data */ class P0 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215277a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215278b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215279c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215280d;

    /* renamed from: e, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserEntityType f215281e;

    /* compiled from: DraftEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/avito/android/persistence/messenger/P0$a;", "", "<init>", "()V", "", "COLUMN_CHANNEL_ID", "Ljava/lang/String;", "COLUMN_INTERLOCUTOR_ID", "COLUMN_LOCAL_USER_ID", "COLUMN_LOCAL_USER_TYPE", "COLUMN_TEXT", "TABLE_NAME", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public P0(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.k UserEntityType userEntityType) {
        this.f215277a = str;
        this.f215278b = str2;
        this.f215279c = str3;
        this.f215280d = str4;
        this.f215281e = userEntityType;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P0)) {
            return false;
        }
        P0 p02 = (P0) obj;
        return kotlin.jvm.internal.L.f(this.f215277a, p02.f215277a) && kotlin.jvm.internal.L.f(this.f215278b, p02.f215278b) && kotlin.jvm.internal.L.f(this.f215279c, p02.f215279c) && kotlin.jvm.internal.L.f(this.f215280d, p02.f215280d) && this.f215281e == p02.f215281e;
    }

    public final int hashCode() {
        return this.f215281e.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f215277a.hashCode() * 31, 31, this.f215278b), 31, this.f215279c), 31, this.f215280d);
    }

    @Y61.k
    public final String toString() {
        return "DraftEntity(localUserId=" + this.f215277a + ", channelId=" + this.f215278b + ", interlocutorId=" + this.f215279c + ", text=" + this.f215280d + ", localUserType=" + this.f215281e + ')';
    }
}
