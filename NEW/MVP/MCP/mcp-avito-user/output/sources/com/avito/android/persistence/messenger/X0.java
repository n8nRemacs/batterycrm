package com.avito.android.persistence.messenger;

import androidx.room.InterfaceC23472t;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LastKnownUserEntity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/X0;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@androidx.room.J
/* loaded from: classes15.dex */
public final /* data */ class X0 {

    /* renamed from: a, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215344a;

    /* renamed from: b, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final String f215345b;

    /* renamed from: c, reason: collision with root package name */
    @InterfaceC23472t
    @Y61.k
    public final UserHashRotationGroup f215346c;

    /* compiled from: LastKnownUserEntity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/avito/android/persistence/messenger/X0$a;", "", "<init>", "()V", "", "TABLE_NAME", "Ljava/lang/String;", "USER_HASH_ID", "USER_HASH_ROTATION_GROUP", "USER_ID", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

    public X0(@Y61.k String str, @Y61.k String str2, @Y61.k UserHashRotationGroup userHashRotationGroup) {
        this.f215344a = str;
        this.f215345b = str2;
        this.f215346c = userHashRotationGroup;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X0)) {
            return false;
        }
        X0 x02 = (X0) obj;
        return kotlin.jvm.internal.L.f(this.f215344a, x02.f215344a) && kotlin.jvm.internal.L.f(this.f215345b, x02.f215345b) && this.f215346c == x02.f215346c;
    }

    public final int hashCode() {
        return this.f215346c.hashCode() + androidx.compose.foundation.H.d(this.f215344a.hashCode() * 31, 31, this.f215345b);
    }

    @Y61.k
    public final String toString() {
        return "LastKnownUserEntity(userId=" + this.f215344a + ", userHashId=" + this.f215345b + ", userHashRotationGroup=" + this.f215346c + ')';
    }
}
