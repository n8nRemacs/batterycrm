package com.avito.android.persistence.messenger;

import java.util.Iterator;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UserEntityType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/persistence/messenger/UserEntityType;", "", "a", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserEntityType {

    /* renamed from: c, reason: collision with root package name */
    public static final UserEntityType f215315c;

    /* renamed from: d, reason: collision with root package name */
    public static final UserEntityType f215316d;

    /* renamed from: e, reason: collision with root package name */
    public static final UserEntityType f215317e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ UserEntityType[] f215318f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f215319g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f215320b;

    /* compiled from: UserEntityType.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/persistence/messenger/UserEntityType$a;", "", "<init>", "()V", "_avito-discouraged_persistence_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f215321a = 0;

        static {
            new a();
        }

        @X41.n
        @androidx.room.T0
        @Y61.k
        public static final UserEntityType a(@Y61.k String str) {
            Object next;
            Iterator<E> it = UserEntityType.f215319g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (kotlin.jvm.internal.L.f(((UserEntityType) next).f215320b, str)) {
                    break;
                }
            }
            UserEntityType userEntityType = (UserEntityType) next;
            return userEntityType == null ? UserEntityType.f215315c : userEntityType;
        }
    }

    static {
        UserEntityType userEntityType = new UserEntityType("DEFAULT", 0, "default");
        f215315c = userEntityType;
        UserEntityType userEntityType2 = new UserEntityType("EMPLOYEE_PERSONAL", 1, "employee_personal");
        f215316d = userEntityType2;
        UserEntityType userEntityType3 = new UserEntityType("EMPLOYEE_COMPANY", 2, "employee_company");
        f215317e = userEntityType3;
        UserEntityType[] userEntityTypeArr = {userEntityType, userEntityType2, userEntityType3};
        f215318f = userEntityTypeArr;
        f215319g = kotlin.enums.c.a(userEntityTypeArr);
    }

    public UserEntityType(String str, int i12, String str2) {
        this.f215320b = str2;
    }

    public static UserEntityType valueOf(String str) {
        return (UserEntityType) Enum.valueOf(UserEntityType.class, str);
    }

    public static UserEntityType[] values() {
        return (UserEntityType[]) f215318f.clone();
    }
}
