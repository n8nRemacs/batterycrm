package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.IsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class Q extends androidx.room.L<O1> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR IGNORE INTO `message` (`local_id`,`channel_id`,`remote_id`,`created`,`type`,`user_id`,`from_id`,`json_body`,`is_read`,`is_spam`,`is_failed`,`read_timestamp`,`preview_text`,`is_supported`,`is_complete`,`is_read_status`,`read_locally_timestamp`,`qm_id`,`qm_from_id`,`qm_type`,`qm_json_body`,`qm_created`,`is_qm_body_complete`,`qm_chunk_index`,`x_hash`,`user_type`,`user_account_id`,`column_send_timestamp`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N O1 o12) {
        O1 o13 = o12;
        iVar.h4(1, o13.f215238a);
        iVar.h4(2, o13.f215239b);
        String str = o13.f215240c;
        if (str == null) {
            iVar.B4(3);
        } else {
            iVar.h4(3, str);
        }
        iVar.g1(4, o13.f215241d);
        iVar.h4(5, o13.f215242e);
        iVar.h4(6, o13.f215243f);
        iVar.h4(7, o13.f215244g);
        iVar.h4(8, o13.f215245h);
        iVar.g1(9, o13.f215246i ? 1L : 0L);
        iVar.g1(10, o13.f215247j ? 1L : 0L);
        iVar.g1(11, o13.f215248k ? 1L : 0L);
        Long l12 = o13.f215249l;
        if (l12 == null) {
            iVar.B4(12);
        } else {
            iVar.g1(12, l12.longValue());
        }
        String str2 = o13.f215250m;
        if (str2 == null) {
            iVar.B4(13);
        } else {
            iVar.h4(13, str2);
        }
        iVar.g1(14, o13.f215251n ? 1L : 0L);
        iVar.g1(15, o13.f215252o ? 1L : 0L);
        int i12 = IsReadStatus.a.f215179a;
        iVar.h4(16, o13.f215253p.name());
        Long l13 = o13.f215254q;
        if (l13 == null) {
            iVar.B4(17);
        } else {
            iVar.g1(17, l13.longValue());
        }
        String str3 = o13.f215255r;
        if (str3 == null) {
            iVar.B4(18);
        } else {
            iVar.h4(18, str3);
        }
        String str4 = o13.f215256s;
        if (str4 == null) {
            iVar.B4(19);
        } else {
            iVar.h4(19, str4);
        }
        String str5 = o13.f215257t;
        if (str5 == null) {
            iVar.B4(20);
        } else {
            iVar.h4(20, str5);
        }
        String str6 = o13.f215258u;
        if (str6 == null) {
            iVar.B4(21);
        } else {
            iVar.h4(21, str6);
        }
        Long l14 = o13.f215259v;
        if (l14 == null) {
            iVar.B4(22);
        } else {
            iVar.g1(22, l14.longValue());
        }
        Boolean bool = o13.f215260w;
        if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
            iVar.B4(23);
        } else {
            iVar.g1(23, r0.intValue());
        }
        if (o13.f215261x == null) {
            iVar.B4(24);
        } else {
            iVar.g1(24, r1.intValue());
        }
        String str7 = o13.f215262y;
        if (str7 == null) {
            iVar.B4(25);
        } else {
            iVar.h4(25, str7);
        }
        int i13 = UserEntityType.a.f215321a;
        iVar.h4(26, o13.f215263z.f215320b);
        iVar.h4(27, o13.f215236A);
        Long l15 = o13.f215237B;
        if (l15 == null) {
            iVar.B4(28);
        } else {
            iVar.g1(28, l15.longValue());
        }
    }
}
