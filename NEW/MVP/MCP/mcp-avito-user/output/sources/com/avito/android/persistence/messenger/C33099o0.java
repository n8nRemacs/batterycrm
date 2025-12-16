package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: ChannelTagDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.o0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33099o0 extends androidx.room.L<C33091m0> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `channel_tag` (`local_user_id`,`channel_id`,`tag`,`local_user_type`) VALUES (?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N C33091m0 c33091m0) {
        C33091m0 c33091m02 = c33091m0;
        iVar.h4(1, c33091m02.f215514a);
        iVar.h4(2, c33091m02.f215515b);
        iVar.h4(3, c33091m02.f215516c);
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(4, c33091m02.f215517d.f215320b);
    }
}
