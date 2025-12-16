package com.avito.android.persistence.messenger;

import android.database.Cursor;
import com.avito.android.persistence.messenger.IsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;

/* compiled from: MessageDao_Impl.java */
/* loaded from: classes15.dex */
public final class N1 implements Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215213a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<O1> f215214b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.L<Q1> f215215c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.K<O1> f215216d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.room.O0 f215217e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.room.O0 f215218f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.room.O0 f215219g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.room.O0 f215220h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.room.O0 f215221i;

    public N1(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215213a = messengerDatabase_Impl;
        this.f215214b = new C33080j1(messengerDatabase_Impl);
        this.f215215c = new C33123u1(messengerDatabase_Impl);
        this.f215216d = new F1(messengerDatabase_Impl);
        this.f215217e = new H1(messengerDatabase_Impl);
        this.f215218f = new I1(messengerDatabase_Impl);
        this.f215219g = new J1(messengerDatabase_Impl);
        this.f215220h = new K1(messengerDatabase_Impl);
        this.f215221i = new L1(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final int A(String str, List<String> list, long j12, IsReadStatus isReadStatus, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        update message\n        set\n            read_timestamp = ?,\n            is_read = 1,\n            is_read_status = ?\n        where\n            user_id = ?\n            and remote_id in (");
        int size = list.size();
        V1.g.a(size, sb2);
        sb2.append(")");
        sb2.append("\n");
        sb2.append("            and user_type = ");
        sb2.append("?");
        sb2.append("\n");
        sb2.append("        ");
        Z1.i iVarE = messengerDatabase_Impl.e(sb2.toString());
        iVarE.g1(1, j12);
        int i12 = IsReadStatus.a.f215179a;
        iVarE.h4(2, isReadStatus.name());
        iVarE.h4(3, str);
        Iterator<String> it = list.iterator();
        int i13 = 4;
        while (it.hasNext()) {
            iVarE.h4(i13, it.next());
            i13++;
        }
        int i14 = UserEntityType.a.f215321a;
        iVarE.h4(size + 4, userEntityType.f215320b);
        messengerDatabase_Impl.c();
        try {
            int iB3 = iVarE.B3();
            messengerDatabase_Impl.s();
            return iB3;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 B(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n        select count(*) from message \n        where user_id = ? \n            and channel_id = ? \n            and user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        D1 d12 = new D1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, true, new String[]{"message"}, d12);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C42006d C(UserEntityType userEntityType, String str, String str2, String str3) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        SELECT * FROM message\n        WHERE \n            user_id = ?\n            AND user_type = ?\n            AND channel_id = ?\n            AND remote_id = ?\n    ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        f0C.h4(3, str2);
        f0C.h4(4, str3);
        return androidx.room.rxjava3.g.b(new A1(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 D(String str, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(2, "\n            select count(*) from message\n            where\n                user_id = ?\n                and remote_id is null\n                and is_failed = 0\n                and user_type = ?\n            order by created asc\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        CallableC33111r1 callableC33111r1 = new CallableC33111r1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33111r1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 E(long j12, UserEntityType userEntityType, String str, String str2) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        select *\n        from message\n        where\n            user_id = ?\n            and channel_id = ?\n            and user_type = ?\n        order by (remote_id is null and is_failed == 0) desc, created desc\n        limit ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        f0C.g1(4, j12);
        CallableC33048b1 callableC33048b1 = new CallableC33048b1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, true, new String[]{"message"}, callableC33048b1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final Long F(String str, String str2, int i12, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        select min(created) from (\n            select created from message\n            where\n                user_id = ?\n                and channel_id = ?\n                and user_type = ?\n            order by created desc\n            limit ?\n        )\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i13 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        f0C.g1(4, i12);
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        Cursor cursorP = messengerDatabase_Impl.p(f0C);
        try {
            Long lValueOf = null;
            if (cursorP.moveToFirst() && !cursorP.isNull(0)) {
                lValueOf = Long.valueOf(cursorP.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    public final int G(UserEntityType userEntityType, String str, String str2, String str3) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215217e;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        iVarA.h4(2, str2);
        iVarA.h4(3, str3);
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

    @Override // com.avito.android.persistence.messenger.Y0
    public final int a(long j12, String... strArr) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        update message\n        set is_failed = 0, created = ?\n        where remote_id is null and local_id in (");
        V1.g.a(strArr.length, sb2);
        sb2.append(")");
        sb2.append("\n");
        sb2.append("        ");
        Z1.i iVarE = messengerDatabase_Impl.e(sb2.toString());
        iVarE.g1(1, j12);
        int i12 = 2;
        for (String str : strArr) {
            iVarE.h4(i12, str);
            i12++;
        }
        messengerDatabase_Impl.c();
        try {
            int iB3 = iVarE.B3();
            messengerDatabase_Impl.s();
            return iB3;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final int b(String str, String str2, long j12, IsReadStatus isReadStatus, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215219g;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, j12);
        int i12 = IsReadStatus.a.f215179a;
        iVarA.h4(2, isReadStatus.name());
        iVarA.h4(3, str);
        iVarA.h4(4, str2);
        iVarA.h4(5, str);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(6, userEntityType.f215320b);
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

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 c(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        select * from message\n        where\n            user_id = ?\n            and channel_id = ?\n            and is_complete = 0\n            and user_type = ?\n        order by created desc\n        limit ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        f0C.g1(4, 100L);
        CallableC33115s1 callableC33115s1 = new CallableC33115s1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33115s1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 d() {
        CallableC33060e1 callableC33060e1 = new CallableC33060e1(this, androidx.room.F0.c(0, "\n        select *\n        from message\n        where remote_id is null and is_failed = 0\n        order by created asc\n        "));
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33060e1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final long e(String str, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(2, "select count(*) from message where user_id = ? and user_type = ?");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        Cursor cursorP = messengerDatabase_Impl.p(f0C);
        try {
            return cursorP.moveToFirst() ? cursorP.getLong(0) : 0L;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 f(String str, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(2, "\n            select * from message\n            where\n                user_id = ?\n                and remote_id is null\n                and is_failed = 0\n                and user_type = ?\n            order by created asc\n            limit 1\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        CallableC33108q1 callableC33108q1 = new CallableC33108q1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33108q1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final int g(String str, String str2, IsReadStatus isReadStatus, IsReadStatus isReadStatus2, Long l12, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215221i;
        Z1.i iVarA = o02.a();
        int i12 = IsReadStatus.a.f215179a;
        iVarA.h4(1, isReadStatus2.name());
        iVarA.g1(2, l12.longValue());
        iVarA.h4(3, str);
        iVarA.h4(4, str2);
        iVarA.h4(5, isReadStatus.name());
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(6, userEntityType.f215320b);
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

    @Override // com.avito.android.persistence.messenger.Y0
    public final C42006d h(long j12, UserEntityType userEntityType, String str, String str2) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        select count(*)\n        from message\n        where\n            user_id = ?\n            and channel_id = ?\n            and created >= ?\n            and user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        f0C.g1(3, j12);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        return androidx.room.rxjava3.g.b(new G1(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final int i(UserEntityType userEntityType, String str, String str2, String str3) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215218f;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        iVarA.h4(2, str2);
        iVarA.h4(3, str3);
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

    @Override // com.avito.android.persistence.messenger.Y0
    public final int j(O1 o12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            androidx.room.K<O1> k12 = this.f215216d;
            Z1.i iVarA = k12.a();
            try {
                k12.d(iVarA, o12);
                int iB3 = iVarA.B3();
                k12.c(iVarA);
                messengerDatabase_Impl.s();
                return iB3;
            } catch (Throwable th2) {
                k12.c(iVarA);
                throw th2;
            }
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 k(String str, IsReadStatus isReadStatus, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n            select *\n            from message\n            where\n                user_id = ?\n                and from_id != ?\n                and is_read_status = ?\n                and user_type = ?\n            order by created desc\n            limit 1\n            ");
        f0C.h4(1, str);
        f0C.h4(2, str);
        int i12 = IsReadStatus.a.f215179a;
        f0C.h4(3, isReadStatus.name());
        int i13 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        CallableC33135x1 callableC33135x1 = new CallableC33135x1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33135x1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C42006d l(String str, List list, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n        SELECT * FROM message\n        WHERE \n            user_id = ?\n            AND user_type = ?\n            AND remote_id in (");
        int size = list.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("    ");
        androidx.room.F0 f0C = androidx.room.F0.c(size + 2, sbR.toString());
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        Iterator it = list.iterator();
        int i13 = 3;
        while (it.hasNext()) {
            f0C.h4(i13, (String) it.next());
            i13++;
        }
        return androidx.room.rxjava3.g.b(new B1(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C42006d m(long j12, UserEntityType userEntityType, String str, String str2) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        select remote_id\n        from message\n        where\n            user_id = ?\n            and channel_id = ?\n            and user_type = ?\n        order by (remote_id is null and is_failed == 0) desc, created desc\n        limit ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        f0C.g1(4, j12);
        return androidx.room.rxjava3.g.b(new CallableC33056d1(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C42006d n(long j12, UserEntityType userEntityType, String str, String str2) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n            SELECT remote_id FROM message\n            WHERE\n                user_id = ?\n                AND user_type = ?\n                AND channel_id = ?\n                AND remote_id IS NOT NULL\n                AND created < ?\n        ");
        f0C.h4(1, str);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(2, userEntityType.f215320b);
        f0C.h4(3, str2);
        f0C.g1(4, j12);
        return androidx.room.rxjava3.g.b(new CallableC33104p1(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final int o(String str, String str2, long j12, IsReadStatus isReadStatus, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215220h;
        Z1.i iVarA = o02.a();
        iVarA.g1(1, j12);
        int i12 = IsReadStatus.a.f215179a;
        iVarA.h4(2, isReadStatus.name());
        iVarA.h4(3, str);
        iVarA.h4(4, str2);
        iVarA.h4(5, str);
        int i13 = UserEntityType.a.f215321a;
        iVarA.h4(6, userEntityType.f215320b);
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

    @Override // com.avito.android.persistence.messenger.Y0
    public final void p(O1 o12, Q1 q12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.c();
        try {
            w(o12);
            messengerDatabase_Impl.b();
            messengerDatabase_Impl.c();
            this.f215215c.f(q12);
            messengerDatabase_Impl.s();
            messengerDatabase_Impl.l();
            messengerDatabase_Impl.s();
        } catch (Throwable th2) {
            throw th2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 q(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n            SELECT * FROM message\n            WHERE\n                message.user_id = ?\n                AND message.channel_id = ?\n                AND message.user_type = ?\n            ORDER BY message.created DESC\n            LIMIT 1\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        CallableC33064f1 callableC33064f1 = new CallableC33064f1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33064f1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final long r(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n        select count(*) from message \n        where user_id = ? \n            and channel_id = ? \n            and user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        Cursor cursorP = messengerDatabase_Impl.p(f0C);
        try {
            return cursorP.moveToFirst() ? cursorP.getLong(0) : 0L;
        } finally {
            cursorP.close();
            f0C.d();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 s(String str, String str2, UserEntityType userEntityType, IsReadStatus isReadStatus) {
        androidx.room.F0 f0C = androidx.room.F0.c(5, "\n            select *\n            from message\n            where\n                user_id = ?\n                and channel_id = ?\n                and from_id != ?\n                and is_read_status = ?\n                and user_type = ?\n                order by created desc   \n            ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        f0C.h4(3, str);
        int i12 = IsReadStatus.a.f215179a;
        f0C.h4(4, isReadStatus.name());
        int i13 = UserEntityType.a.f215321a;
        f0C.h4(5, userEntityType.f215320b);
        CallableC33127v1 callableC33127v1 = new CallableC33127v1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33127v1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 t(UserEntityType userEntityType, String str, String str2, String str3) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        SELECT * FROM message\n        WHERE\n            user_id = ? AND\n            channel_id = ? AND\n            local_id = ? AND\n            user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        f0C.h4(3, str3);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        CallableC33139y1 callableC33139y1 = new CallableC33139y1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33139y1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final int u(String... strArr) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n        update message\n        set is_failed = 1, COLUMN_SEND_TIMESTAMP = null\n        where remote_id is null and local_id in (");
        V1.g.a(strArr.length, sb2);
        sb2.append(")");
        sb2.append("\n");
        sb2.append("        ");
        Z1.i iVarE = messengerDatabase_Impl.e(sb2.toString());
        int i12 = 1;
        for (String str : strArr) {
            iVarE.h4(i12, str);
            i12++;
        }
        messengerDatabase_Impl.c();
        try {
            int iB3 = iVarE.B3();
            messengerDatabase_Impl.s();
            return iB3;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C42006d v(long j12, String str, String str2, long j13, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(5, "\n        select remote_id from message\n        where\n            created < ?\n            and user_id = ?\n            and channel_id = ?\n            and user_type = ?\n         order by (remote_id is null and is_failed == 0) desc, created desc\n         limit ?\n        ");
        f0C.g1(1, j12);
        f0C.h4(2, str);
        f0C.h4(3, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        f0C.g1(5, j13);
        return androidx.room.rxjava3.g.b(new CallableC33076i1(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final long w(O1 o12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            long jF2 = this.f215214b.f(o12);
            messengerDatabase_Impl.s();
            return jF2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final ArrayList x(ArrayList arrayList) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.c();
        try {
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(w((O1) it.next())));
            }
            messengerDatabase_Impl.s();
            return arrayList2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final C41933a0 y(String str, Collection collection, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT msg.*\n            FROM message AS msg\n            INNER JOIN\n                (\n                    SELECT \n                        m.user_id,\n                        m.channel_id,\n                        max(m.created) AS max_created\n                    FROM message AS m\n                    WHERE \n                        user_id = ?\n                        AND channel_id IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                        AND user_type = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "                    GROUP BY m.channel_id", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                ) AS t", "\n", "            ON ", "\n");
        androidx.media3.exoplayer.analytics.m.p(sbR, "                msg.user_id = t.user_id", "\n", "                AND msg.channel_id = t.channel_id", "\n");
        int i12 = 2;
        int i13 = size + 2;
        androidx.room.F0 f0C = androidx.room.F0.c(i13, androidx.camera.camera2.internal.G.g(sbR, "                AND msg.created = t.max_created", "\n", "        "));
        f0C.h4(1, str);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f0C.h4(i12, (String) it.next());
            i12++;
        }
        int i14 = UserEntityType.a.f215321a;
        f0C.h4(i13, userEntityType.f215320b);
        CallableC33096n1 callableC33096n1 = new CallableC33096n1(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215213a, false, new String[]{"message"}, callableC33096n1);
    }

    @Override // com.avito.android.persistence.messenger.Y0
    public final void z(UserEntityType userEntityType, String str, String str2, String str3) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215213a;
        messengerDatabase_Impl.c();
        try {
            G(userEntityType, str, str2, str3);
            i(userEntityType, str, str2, str3);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }
}
