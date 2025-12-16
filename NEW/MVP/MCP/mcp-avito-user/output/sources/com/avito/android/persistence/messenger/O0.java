package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import java.util.Iterator;
import java.util.List;

/* compiled from: DraftDao_Impl.java */
/* loaded from: classes15.dex */
public final class O0 implements G0 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215232a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<P0> f215233b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.O0 f215234c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.room.O0 f215235d;

    public O0(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215232a = messengerDatabase_Impl;
        this.f215233b = new H0(messengerDatabase_Impl);
        this.f215234c = new I0(messengerDatabase_Impl);
        this.f215235d = new J0(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.G0
    public final long a(P0 p02) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215232a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            long jF2 = this.f215233b.f(p02);
            messengerDatabase_Impl.s();
            return jF2;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.G0
    public final C41933a0 b(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n        SELECT * FROM draft \n        WHERE local_user_id = ? \n            AND channel_id = ?\n            AND local_user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        K0 k02 = new K0(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215232a, false, new String[]{"draft"}, k02);
    }

    @Override // com.avito.android.persistence.messenger.G0
    public final C41933a0 c(String str, List list, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n        SELECT * FROM draft\n        WHERE local_user_id = ?\n            AND channel_id IN (");
        int size = list.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("            AND local_user_type = ");
        int i12 = 2;
        int i13 = size + 2;
        androidx.room.F0 f0C = androidx.room.F0.c(i13, androidx.camera.camera2.internal.G.g(sbR, "?", "\n", "    "));
        f0C.h4(1, str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0C.h4(i12, (String) it.next());
            i12++;
        }
        int i14 = UserEntityType.a.f215321a;
        f0C.h4(i13, userEntityType.f215320b);
        N0 n02 = new N0(this, f0C);
        return androidx.room.rxjava3.g.a(this.f215232a, false, new String[]{"draft"}, n02);
    }

    @Override // com.avito.android.persistence.messenger.G0
    public final int d(String str, String str2, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215232a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215235d;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        iVarA.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(3, userEntityType.f215320b);
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

    @Override // com.avito.android.persistence.messenger.G0
    public final int e(String str, String str2, UserEntityType userEntityType) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215232a;
        messengerDatabase_Impl.b();
        androidx.room.O0 o02 = this.f215234c;
        Z1.i iVarA = o02.a();
        iVarA.h4(1, str);
        iVarA.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        iVarA.h4(3, userEntityType.f215320b);
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
