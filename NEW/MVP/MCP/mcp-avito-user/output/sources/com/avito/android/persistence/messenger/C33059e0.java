package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: ChannelMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.e0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33059e0 extends androidx.room.K<Z> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "DELETE FROM `channel_meta_data` WHERE `local_user_id` = ? AND `channel_id` = ? AND `local_user_type` = ?";
    }

    @Override // androidx.room.K
    public final void d(@j.N Z1.i iVar, @j.N Z z12) {
        Z z13 = z12;
        iVar.h4(1, z13.f215381a);
        iVar.h4(2, z13.f215382b);
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(3, z13.f215386f.f215320b);
    }
}
