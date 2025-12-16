package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.R1;
import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.w2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33132w2 implements R1 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215556a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<Q1> f215557b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.K<Q1> f215558c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.O0 f215559d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.room.O0 f215560e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.room.O0 f215561f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.room.O0 f215562g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.room.O0 f215563h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.room.O0 f215564i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.room.O0 f215565j;

    /* renamed from: k, reason: collision with root package name */
    public final androidx.room.O0 f215566k;

    /* renamed from: l, reason: collision with root package name */
    public final androidx.room.O0 f215567l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.room.O0 f215568m;

    public C33132w2(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215556a = messengerDatabase_Impl;
        new C33053c2(messengerDatabase_Impl);
        this.f215557b = new C33097n2(messengerDatabase_Impl);
        this.f215558c = new C33105p2(messengerDatabase_Impl);
        this.f215559d = new C33109q2(messengerDatabase_Impl);
        this.f215560e = new C33112r2(messengerDatabase_Impl);
        this.f215561f = new C33116s2(messengerDatabase_Impl);
        this.f215562g = new C33120t2(messengerDatabase_Impl);
        this.f215563h = new C33124u2(messengerDatabase_Impl);
        this.f215564i = new C33128v2(messengerDatabase_Impl);
        this.f215565j = new S1(messengerDatabase_Impl);
        this.f215566k = new T1(messengerDatabase_Impl);
        this.f215567l = new U1(messengerDatabase_Impl);
        this.f215568m = new V1(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r a(List list) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new X1(this, list));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final C42006d b() {
        return androidx.room.rxjava3.g.b(new CallableC33089l2(this, androidx.room.F0.c(0, "\n            SELECT * FROM message_meta_info AS mi\n            WHERE NOT EXISTS (\n                SELECT 1 FROM message AS m\n                WHERE \n                    m.user_id = mi.local_user_id AND \n                    m.channel_id = mi.channel_id AND \n                    m.local_id = mi.local_message_id AND\n                    m.user_type = mi.local_user_type\n                LIMIT 1\n            )\n        ")));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final void c(ArrayList arrayList) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215556a;
        messengerDatabase_Impl.c();
        try {
            R1.a.b(this, arrayList);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r d(String str, String str2, String str3, UserEntityType userEntityType, ArrayList arrayList) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33045a2(this, arrayList, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final void e(TransferStatus transferStatus, UserEntityType userEntityType, String str, String str2, String str3, String str4) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215556a;
        messengerDatabase_Impl.c();
        try {
            if (r(new Q1(str, str2, str3, null, null, 0L, transferStatus, null, null, 0L, null, 0L, 0L, null, null, null, false, null, null, userEntityType, str4, null, null, 6815616, null)) < 0) {
                new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33057d2(this, transferStatus, str, str2, str3, userEntityType)).i();
            }
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r f(String str, String str2, String str3, TransferStatus transferStatus, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33049b2(this, transferStatus, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final C42006d g(String str) {
        androidx.room.F0 f0C = androidx.room.F0.c(1, "\n            SELECT EXISTS (\n                SELECT 1 FROM message_meta_info\n                WHERE internal_path = ?\n                LIMIT 1\n            )\n        ");
        f0C.h4(1, str);
        return androidx.room.rxjava3.g.b(new CallableC33093m2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r h(String str, String str2, String str3, String str4, long j12, long j13, String str5, String str6, int i12, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33073h2(this, str4, j12, j13, str5, str6, i12, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final C41933a0 i(String str, String str2, List list, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT * FROM message_meta_info\n            WHERE\n                local_user_id = ? AND\n                channel_id = ? AND\n                local_message_id IN (");
        int size = list.size();
        V1.g.a(size, sbR);
        sbR.append(") AND");
        sbR.append("\n");
        sbR.append("                local_user_type = ");
        int i12 = 3;
        int i13 = size + 3;
        androidx.room.F0 f0C = androidx.room.F0.c(i13, androidx.camera.camera2.internal.G.g(sbR, "?", "\n", "        "));
        f0C.h4(1, str);
        f0C.h4(2, str2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0C.h4(i12, (String) it.next());
            i12++;
        }
        int i14 = UserEntityType.a.f215321a;
        f0C.h4(i13, userEntityType.f215320b);
        CallableC33085k2 callableC33085k2 = new CallableC33085k2(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215556a, false, new String[]{"message_meta_info"}, callableC33085k2);
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final C42006d j(String str) {
        androidx.room.F0 f0C = androidx.room.F0.c(1, "\n            SELECT EXISTS (\n                SELECT 1 FROM message_meta_info\n                WHERE recorded_video_internal_path = ?\n                LIMIT 1\n            )\n        ");
        f0C.h4(1, str);
        return androidx.room.rxjava3.g.b(new CallableC33101o2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r k(TransferStatus transferStatus, UserEntityType userEntityType, String str, String str2, String str3, String str4) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33065f2(this, transferStatus, str4, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r l(String str, String str2, String str3, String str4, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new Z1(this, str4, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r m(String str, String str2, String str3, TransferStatus transferStatus, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new Y1(this, transferStatus, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r n(String str, String str2, String str3, String str4, String str5, String str6, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33069g2(this, str4, str5, str6, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final void o(String str, String str2, String str3, UserEntityType userEntityType, String str4, List list, int i12, TransferStatus transferStatus) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215556a;
        messengerDatabase_Impl.c();
        try {
            R1.a.a(this, str, str2, str3, userEntityType, str4, list, i12, transferStatus);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final io.reactivex.rxjava3.internal.operators.completable.r p(String str, String str2, String str3, String str4, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33061e2(this, str4, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.R1
    public final C41933a0 q(UserEntityType userEntityType, String str, String str2, String str3) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n            SELECT * FROM message_meta_info\n            WHERE\n                local_user_id = ? AND\n                channel_id = ? AND\n                local_message_id = ? AND\n                local_user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        f0C.h4(3, str3);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        CallableC33081j2 callableC33081j2 = new CallableC33081j2(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215556a, false, new String[]{"message_meta_info"}, callableC33081j2);
    }

    public final long r(Q1 q12) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215556a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            long jF2 = this.f215557b.f(q12);
            messengerDatabase_Impl.s();
            return jF2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }
}
