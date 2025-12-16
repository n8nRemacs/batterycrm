package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23472t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ChannelTag.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/m0;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.room.J
/* renamed from: com.avito.android.persistence.messenger.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C33091m0 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215514a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215515b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215516c;

    /* renamed from: d, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserEntityType f215517d;

    /* compiled from: ChannelTag.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/persistence/messenger/m0$a;", "", "<init>", "()V", "", "COLUMN_CHANNEL_ID", "Ljava/lang/String;", "COLUMN_LOCAL_USER_ID", "COLUMN_LOCAL_USER_TYPE", "COLUMN_TAG", "TABLE_NAME", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.persistence.messenger.m0$a */
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

    public C33091m0(@Y61.k UserEntityType userEntityType, @Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        this.f215514a = str;
        this.f215515b = str2;
        this.f215516c = str3;
        this.f215517d = userEntityType;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33091m0)) {
            return false;
        }
        C33091m0 c33091m0 = (C33091m0) obj;
        return kotlin.jvm.internal.L.f(this.f215514a, c33091m0.f215514a) && kotlin.jvm.internal.L.f(this.f215515b, c33091m0.f215515b) && kotlin.jvm.internal.L.f(this.f215516c, c33091m0.f215516c) && this.f215517d == c33091m0.f215517d;
    }

    public final int hashCode() {
        return this.f215517d.hashCode() + androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f215514a.hashCode() * 31, 31, this.f215515b), 31, this.f215516c);
    }

    @Y61.k
    public final String toString() {
        return "ChannelTag(localUserId=" + this.f215514a + ", channelId=" + this.f215515b + ", tag=" + this.f215516c + ", localUserType=" + this.f215517d + ')';
    }
}
