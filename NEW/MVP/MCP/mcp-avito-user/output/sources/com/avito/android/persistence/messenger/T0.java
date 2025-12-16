package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserHashRotationGroup;

/* compiled from: LastKnownUserDao_Impl.java */
/* loaded from: classes15.dex */
class T0 extends androidx.room.L<X0> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `last_known_user` (`user_id`,`user_hash_id`,`user_hash_rotation_group`) VALUES (?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N X0 x02) {
        X0 x03 = x02;
        iVar.h4(1, x03.f215344a);
        iVar.h4(2, x03.f215345b);
        int i12 = UserHashRotationGroup.a.f215327a;
        iVar.h4(3, x03.f215346c.f215326b);
    }
}
