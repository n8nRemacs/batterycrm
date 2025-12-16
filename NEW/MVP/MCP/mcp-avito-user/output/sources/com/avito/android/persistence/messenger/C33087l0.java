package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;

/* compiled from: ChannelMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.l0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33087l0 implements InterfaceC33043a0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215506a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<Z> f215507b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.O0 f215508c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.O0 f215509d;

    public C33087l0(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215506a = messengerDatabase_Impl;
        this.f215507b = new C33051c0(messengerDatabase_Impl);
        new C33055d0(messengerDatabase_Impl);
        new C33059e0(messengerDatabase_Impl);
        new C33063f0(messengerDatabase_Impl);
        this.f215508c = new C33067g0(messengerDatabase_Impl);
        this.f215509d = new C33071h0(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33043a0
    public final C41933a0 a(String str, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(2, "\n            SELECT channel_id\n            FROM channel_meta_data\n            WHERE\n                local_user_id = ?\n                AND local_user_type = ?\n                AND deleted_locally_timestamp IS NOT NULL\n            ORDER BY deleted_locally_timestamp ASC\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        CallableC33047b0 callableC33047b0 = new CallableC33047b0(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215506a, false, new String[]{"channel_meta_data"}, callableC33047b0);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33043a0
    public final void b(UserEntityType userEntityType, String str, String str2, String str3) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215506a;
        messengerDatabase_Impl.c();
        try {
            if (f(new Z(str, str2, null, false, null, userEntityType, str3, 20, null)) < 0) {
                h(str, str2, userEntityType);
            }
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33043a0
    public final C41933a0 c(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n        select sellers_suggests_enabled from channel_meta_data\n        where\n            local_user_id = ?\n            and channel_id = ?\n            and local_user_type = ?\n    ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        CallableC33079j0 callableC33079j0 = new CallableC33079j0(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215506a, false, new String[]{"channel_meta_data"}, callableC33079j0);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33043a0
    public final C41933a0 d(String str, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(2, "\n            SELECT *\n            FROM channel_meta_data\n            WHERE\n                local_user_id = ?\n                AND local_user_type = ?\n                AND deleted_locally_timestamp IS NOT NULL\n            ORDER BY deleted_locally_timestamp DESC\n            limit 1\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        CallableC33083k0 callableC33083k0 = new CallableC33083k0(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215506a, false, new String[]{"channel_meta_data"}, callableC33083k0);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33043a0
    public final void e(String str, String str2, Long l12, UserEntityType userEntityType, String str3) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215506a;
        messengerDatabase_Impl.c();
        try {
            if (f(new Z(str, str2, null, false, l12, userEntityType, str3, 12, null)) < 0) {
                g(str, str2, l12, userEntityType);
            }
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    public final long f(Z z12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215506a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            long jF2 = this.f215507b.f(z12);
            messengerDatabase_Impl.s();
            return jF2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    public final int g(String str, String str2, Long l12, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215506a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215509d;
        Z1.i iVarA = o02.a();
        if (l12 == null) {
            iVarA.B4(1);
        } else {
            iVarA.g1(1, l12.longValue());
        }
        iVarA.h4(2, str);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(3, userEntityType.f215320b);
        iVarA.h4(4, str2);
        try {
            messengerDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                messengerDatabase_Impl.s();
                return iB3;
            } finally {
                messengerDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }

    public final int h(String str, String str2, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215506a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215508c;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, 0);
        iVarA.h4(2, str);
        iVarA.h4(3, str2);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(4, userEntityType.f215320b);
        try {
            messengerDatabase_Impl.c();
            try {
                int iB3 = iVarA.B3();
                messengerDatabase_Impl.s();
                return iB3;
            } finally {
                messengerDatabase_Impl.l();
            }
        } finally {
            o02.c(iVarA);
        }
    }
}
