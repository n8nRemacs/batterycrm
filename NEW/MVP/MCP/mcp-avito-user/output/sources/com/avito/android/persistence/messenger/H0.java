package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: DraftDao_Impl.java */
/* loaded from: classes15.dex */
class H0 extends androidx.room.L<P0> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `draft` (`local_user_id`,`channel_id`,`interlocutor_id`,`text`,`local_user_type`) VALUES (?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N P0 p02) {
        P0 p03 = p02;
        iVar.h4(1, p03.f215277a);
        iVar.h4(2, p03.f215278b);
        iVar.h4(3, p03.f215279c);
        iVar.h4(4, p03.f215280d);
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(5, p03.f215281e.f215320b);
    }
}
