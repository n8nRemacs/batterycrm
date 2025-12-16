package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: ChannelTagDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.u0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C33122u0 implements InterfaceC33095n0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215550a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.K<C33091m0> f215551b;

    public C33122u0(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215550a = messengerDatabase_Impl;
        new C33099o0(messengerDatabase_Impl);
        this.f215551b = new C33103p0(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33095n0
    public final C41933a0 a(String str, Collection collection, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT * FROM channel_tag\n            WHERE \n                local_user_id = ?\n                AND channel_id IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("                AND local_user_type = ");
        int i12 = 2;
        int i13 = size + 2;
        androidx.room.F0 f0C = androidx.room.F0.c(i13, androidx.camera.camera2.internal.G.g(sbR, "?", "\n", "        "));
        f0C.h4(1, str);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f0C.h4(i12, (String) it.next());
            i12++;
        }
        int i14 = UserEntityType.a.f215321a;
        f0C.h4(i13, userEntityType.f215320b);
        CallableC33118t0 callableC33118t0 = new CallableC33118t0(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215550a, false, new String[]{"channel_tag"}, callableC33118t0);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33095n0
    public final C41933a0 b(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n            SELECT * FROM channel_tag\n            WHERE \n                local_user_id = ? \n                AND channel_id = ?\n                AND local_user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        CallableC33114s0 callableC33114s0 = new CallableC33114s0(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215550a, false, new String[]{"channel_tag"}, callableC33114s0);
    }

    @Override // com.avito.android.persistence.messenger.InterfaceC33095n0
    public final io.reactivex.rxjava3.internal.operators.completable.r c(LinkedHashSet linkedHashSet) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new CallableC33107q0(this, linkedHashSet));
    }
}
