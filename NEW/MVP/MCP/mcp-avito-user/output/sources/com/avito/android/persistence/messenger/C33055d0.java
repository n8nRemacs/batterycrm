package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: ChannelMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.d0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33055d0 extends androidx.room.L<Z> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `channel_meta_data` (`local_user_id`,`channel_id`,`last_synced_message_timestamp`,`sellers_suggests_enabled`,`deleted_locally_timestamp`,`local_user_type`,`local_user_account_id`) VALUES (?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N Z z12) {
        Z z13 = z12;
        iVar.h4(1, z13.f215381a);
        iVar.h4(2, z13.f215382b);
        Long l12 = z13.f215383c;
        if (l12 == null) {
            iVar.B4(3);
        } else {
            iVar.g1(3, l12.longValue());
        }
        iVar.g1(4, z13.f215384d ? 1L : 0L);
        Long l13 = z13.f215385e;
        if (l13 == null) {
            iVar.B4(5);
        } else {
            iVar.g1(5, l13.longValue());
        }
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(6, z13.f215386f.f215320b);
        iVar.h4(7, z13.f215387g);
    }
}
