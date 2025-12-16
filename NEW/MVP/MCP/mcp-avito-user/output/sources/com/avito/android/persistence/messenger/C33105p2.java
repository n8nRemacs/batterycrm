package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.p2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33105p2 extends androidx.room.K<Q1> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "DELETE FROM `message_meta_info` WHERE `local_user_id` = ? AND `channel_id` = ? AND `local_message_id` = ? AND `local_user_type` = ?";
    }

    @Override // androidx.room.K
    public final void d(@j.N Z1.i iVar, @j.N Q1 q12) {
        Q1 q13 = q12;
        iVar.h4(1, q13.f215282a);
        iVar.h4(2, q13.f215283b);
        iVar.h4(3, q13.f215284c);
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(4, q13.f215301t.f215320b);
    }
}
