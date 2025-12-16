package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: ChannelTagDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.p0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33103p0 extends androidx.room.K<C33091m0> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "DELETE FROM `channel_tag` WHERE `local_user_id` = ? AND `channel_id` = ? AND `tag` = ? AND `local_user_type` = ?";
    }

    @Override // androidx.room.K
    public final void d(@j.N Z1.i iVar, @j.N C33091m0 c33091m0) {
        C33091m0 c33091m02 = c33091m0;
        iVar.h4(1, c33091m02.f215514a);
        iVar.h4(2, c33091m02.f215515b);
        iVar.h4(3, c33091m02.f215516c);
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(4, c33091m02.f215517d.f215320b);
    }
}
