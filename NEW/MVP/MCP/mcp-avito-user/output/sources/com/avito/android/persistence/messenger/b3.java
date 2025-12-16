package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import io.reactivex.rxjava3.internal.operators.observable.C41933a0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: UserDao_Impl.java */
/* loaded from: classes15.dex */
public final class b3 extends Q2 {

    /* renamed from: a, reason: collision with root package name */
    public final MessengerDatabase_Impl f215412a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.room.L<c3> f215413b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.room.O0 f215414c;

    public b3(@j.N MessengerDatabase_Impl messengerDatabase_Impl) {
        this.f215412a = messengerDatabase_Impl;
        this.f215413b = new S2(messengerDatabase_Impl);
        this.f215414c = new T2(messengerDatabase_Impl);
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final C41933a0 a(long j12, Collection collection) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT DISTINCT user_id\n            FROM user\n            WHERE \n                ((last_action_time IS NULL) OR\n                (last_action_time <= ?)) AND\n                user_id IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("        ");
        androidx.room.F0 f0C = androidx.room.F0.c(size + 1, sbR.toString());
        f0C.g1(1, j12);
        Iterator it = collection.iterator();
        int i12 = 2;
        while (it.hasNext()) {
            f0C.h4(i12, (String) it.next());
            i12++;
        }
        return androidx.room.rxjava3.g.a(this.f215412a, false, new String[]{ChannelContext.UserToUser.TYPE}, new a3(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final C42006d b(UserEntityType userEntityType, String str, String str2, String str3) {
        androidx.room.F0 f0C = androidx.room.F0.c(4, "\n            SELECT user.* \n            FROM user\n            WHERE\n                user.local_user_id = ?\n                AND user.channel_id = ?\n                AND user.user_id = ?\n                AND user.local_user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str3);
        f0C.h4(3, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(4, userEntityType.f215320b);
        return androidx.room.rxjava3.g.b(new Y2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final C42006d c(String str, String str2, Collection collection, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n            SELECT * \n            FROM user\n            WHERE user_id IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(") ");
        sbR.append("\n");
        sbR.append("            AND channel_id = ");
        androidx.media3.exoplayer.analytics.m.p(sbR, "?", "\n", "            AND local_user_id = ", "?");
        androidx.media3.exoplayer.analytics.m.p(sbR, "\n", "            AND local_user_type = ", "?", "\n");
        sbR.append("        ");
        int i12 = size + 3;
        androidx.room.F0 f0C = androidx.room.F0.c(i12, sbR.toString());
        Iterator it = collection.iterator();
        int i13 = 1;
        while (it.hasNext()) {
            f0C.h4(i13, (String) it.next());
            i13++;
        }
        f0C.h4(1 + size, str2);
        f0C.h4(size + 2, str);
        int i14 = UserEntityType.a.f215321a;
        f0C.h4(i12, userEntityType.f215320b);
        return androidx.room.rxjava3.g.b(new R2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final C41933a0 d(String str, String str2, UserEntityType userEntityType) {
        androidx.room.F0 f0C = androidx.room.F0.c(3, "\n            SELECT user.* \n            FROM user\n            WHERE\n                user.local_user_id = ?\n                AND user.channel_id = ?\n                AND user.local_user_type = ?\n        ");
        f0C.h4(1, str);
        f0C.h4(2, str2);
        int i12 = UserEntityType.a.f215321a;
        f0C.h4(3, userEntityType.f215320b);
        return androidx.room.rxjava3.g.a(this.f215412a, false, new String[]{ChannelContext.UserToUser.TYPE}, new X2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final C41933a0 e(String str, Collection collection, UserEntityType userEntityType) {
        StringBuilder sbR = androidx.compose.foundation.H.r("\n        SELECT * FROM user\n        WHERE\n            local_user_id = ?\n            AND channel_id IN (");
        int size = collection.size();
        V1.g.a(size, sbR);
        sbR.append(")");
        sbR.append("\n");
        sbR.append("            AND local_user_type = ");
        int i12 = 2;
        int i13 = size + 2;
        androidx.room.F0 f0C = androidx.room.F0.c(i13, androidx.camera.camera2.internal.G.g(sbR, "?", "\n", "    "));
        f0C.h4(1, str);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            f0C.h4(i12, (String) it.next());
            i12++;
        }
        int i14 = UserEntityType.a.f215321a;
        f0C.h4(i13, userEntityType.f215320b);
        return androidx.room.rxjava3.g.a(this.f215412a, false, new String[]{ChannelContext.UserToUser.TYPE}, new W2(this, f0C));
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final kotlin.collections.builders.b f(ArrayList arrayList) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215412a;
        messengerDatabase_Impl.b();
        messengerDatabase_Impl.c();
        try {
            kotlin.collections.builders.b bVarG = this.f215413b.g(arrayList);
            messengerDatabase_Impl.s();
            return bVarG;
        } finally {
            messengerDatabase_Impl.l();
        }
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final io.reactivex.rxjava3.internal.operators.completable.r g(Long l12, Long l13, String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new U2(this, l12, l13, str));
    }

    @Override // com.avito.android.persistence.messenger.Q2
    public final void h(Collection<d3> collection) {
        MessengerDatabase_Impl messengerDatabase_Impl = this.f215412a;
        messengerDatabase_Impl.c();
        try {
            super.h(collection);
            messengerDatabase_Impl.s();
        } finally {
            messengerDatabase_Impl.l();
        }
    }
}
