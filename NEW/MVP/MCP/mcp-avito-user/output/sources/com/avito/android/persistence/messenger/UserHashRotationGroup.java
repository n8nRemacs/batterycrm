package com.avito.android.persistence.messenger;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LastKnownUserEntity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/UserHashRotationGroup;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserHashRotationGroup {

    /* renamed from: c, reason: collision with root package name */
    public static final UserHashRotationGroup f215322c;

    /* renamed from: d, reason: collision with root package name */
    public static final UserHashRotationGroup f215323d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UserHashRotationGroup[] f215324e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f215325f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f215326b;

    /* compiled from: LastKnownUserEntity.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/UserHashRotationGroup$a;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f215327a = 0;

        static {
            new a();
        }
    }

    static {
        UserHashRotationGroup userHashRotationGroup = new UserHashRotationGroup("DEFAULT", 0, "hash_rotation_with_default");
        f215322c = userHashRotationGroup;
        UserHashRotationGroup userHashRotationGroup2 = new UserHashRotationGroup("EMPLOYEE_COMPANY", 1, "hash_rotation_with_company_hash");
        f215323d = userHashRotationGroup2;
        UserHashRotationGroup[] userHashRotationGroupArr = {userHashRotationGroup, userHashRotationGroup2};
        f215324e = userHashRotationGroupArr;
        f215325f = kotlin.enums.c.a(userHashRotationGroupArr);
    }

    public UserHashRotationGroup(String str, int i12, String str2) {
        this.f215326b = str2;
    }

    public static UserHashRotationGroup valueOf(String str) {
        return (UserHashRotationGroup) Enum.valueOf(UserHashRotationGroup.class, str);
    }

    public static UserHashRotationGroup[] values() {
        return (UserHashRotationGroup[]) f215324e.clone();
    }
}
