package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: UserDao_Impl.java */
/* loaded from: classes15.dex */
class S2 extends androidx.room.L<c3> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `user` (`local_user_id`,`user_id`,`channel_id`,`name`,`label`,`last_action_time`,`time_diff`,`json_public_profile`,`local_user_type`) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N c3 c3Var) {
        c3 c3Var2 = c3Var;
        iVar.h4(1, c3Var2.f215420a);
        iVar.h4(2, c3Var2.f215421b);
        iVar.h4(3, c3Var2.f215422c);
        String str = c3Var2.f215423d;
        if (str == null) {
            iVar.B4(4);
        } else {
            iVar.h4(4, str);
        }
        String str2 = c3Var2.f215424e;
        if (str2 == null) {
            iVar.B4(5);
        } else {
            iVar.h4(5, str2);
        }
        Long l12 = c3Var2.f215425f;
        if (l12 == null) {
            iVar.B4(6);
        } else {
            iVar.g1(6, l12.longValue());
        }
        Long l13 = c3Var2.f215426g;
        if (l13 == null) {
            iVar.B4(7);
        } else {
            iVar.g1(7, l13.longValue());
        }
        String str3 = c3Var2.f215427h;
        if (str3 == null) {
            iVar.B4(8);
        } else {
            iVar.h4(8, str3);
        }
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(9, c3Var2.f215428i.f215320b);
    }
}
