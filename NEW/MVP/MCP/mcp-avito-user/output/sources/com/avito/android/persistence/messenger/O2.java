package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.List;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
public final class O2 implements InterfaceC33140y2 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215264a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<C33136x2> f215265b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.K<C33136x2> f215266c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.O0 f215267d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.room.O0 f215268e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.room.O0 f215269f;

    public O2(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215264a = messengerDatabase_Impl;
        this.f215265b = new F2(messengerDatabase_Impl);
        this.f215266c = new G2(messengerDatabase_Impl);
        this.f215267d = new H2(messengerDatabase_Impl);
        this.f215268e = new I2(messengerDatabase_Impl);
        this.f215269f = new J2(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final io.reactivex.rxjava3.internal.operators.completable.r a(List list) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new L2(this, list));
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final C41933a0 b(String str, String str2, String str3, long j12, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(5, "\n        SELECT * FROM message_upload_part\n        WHERE\n            local_user_id = ? AND\n            channel_id = ? AND\n            local_message_id = ? AND\n            part_number = ? AND \n            local_user_type = ?\n    ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        f0C.h4(3, str3);
        f0C.g1(4, j12);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(5, userEntityType.f215320b);
        B2 b22 = new B2(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215264a, false, new String[]{"message_upload_part"}, b22);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final io.reactivex.rxjava3.internal.operators.completable.r c(UserEntityType userEntityType, String str, String str2, String str3) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33144z2(this, str, str2, str3, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final io.reactivex.rxjava3.internal.operators.completable.r d(String str, String str2, String str3, long j12, TransferStatus transferStatus, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new M2(this, transferStatus, str, str2, str3, j12, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final C42006d e(String str) {
        androidx.room.F0 f0C = androidx.room.F0.c(1, "\n            SELECT EXISTS (\n                SELECT 1 FROM message_upload_part\n                    WHERE path = ?\n                LIMIT 1\n            )\n        ");
        f0C.h4(1, str);
        return androidx.room.rxjava3.g.b(new E2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final C42006d f() {
        return androidx.room.rxjava3.g.b(new D2(this, androidx.room.F0.c(0, "\n            SELECT * FROM message_upload_part AS mup\n            WHERE NOT EXISTS (\n                SELECT 1 FROM message_meta_info AS mi\n                WHERE \n                    mup.local_user_id = mi.local_user_id AND \n                    mup.channel_id = mi.channel_id AND \n                    mup.local_message_id = mi.local_message_id AND\n                    mup.local_user_type = mi.local_user_type\n                LIMIT 1\n            )\n        ")));
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final C42006d g(UserEntityType userEntityType, String str, String str2, String str3) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n        SELECT * FROM message_upload_part\n        WHERE\n            local_user_id = ? AND\n            channel_id = ? AND\n            local_message_id = ? AND\n            local_user_type = ?\n    ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        f0C.h4(3, str3);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        return androidx.room.rxjava3.g.b(new C2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final io.reactivex.rxjava3.internal.operators.completable.r h(String str, String str2, String str3, long j12, String str4, TransferStatus transferStatus, UserEntityType userEntityType) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new N2(this, str4, transferStatus, str, str2, str3, j12, userEntityType));
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33140y2
    public final io.reactivex.rxjava3.internal.operators.completable.r i(C33136x2 c33136x2) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new K2(this, c33136x2));
    }
}
