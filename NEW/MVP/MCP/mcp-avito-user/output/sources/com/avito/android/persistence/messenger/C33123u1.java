package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;
import java.util.List;

/* compiled from: MessageDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.u1, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33123u1 extends androidx.room.L<Q1> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `message_meta_info` (`local_user_id`,`channel_id`,`local_message_id`,`path`,`internal_path`,`progress`,`transfer_status`,`file_id`,`video_id`,`duration`,`upload_session_id`,`size_in_bytes`,`chunk_count`,`original_file_name`,`resolution`,`extension`,`compression_failed`,`file_hash`,`recorded_video_internal_path`,`local_user_type`,`local_user_account_id`,`local_file_chunks`,`local_voice_error`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N Q1 q12) {
        String strL;
        Q1 q13 = q12;
        iVar.h4(1, q13.f215282a);
        iVar.h4(2, q13.f215283b);
        iVar.h4(3, q13.f215284c);
        String str = q13.f215285d;
        if (str == null) {
            iVar.B4(4);
        } else {
            iVar.h4(4, str);
        }
        String str2 = q13.f215286e;
        if (str2 == null) {
            iVar.B4(5);
        } else {
            iVar.h4(5, str2);
        }
        iVar.g1(6, q13.f215287f);
        int i12 = TransferStatus.a.f215308a;
        iVar.h4(7, q13.f215288g.name());
        String str3 = q13.f215289h;
        if (str3 == null) {
            iVar.B4(8);
        } else {
            iVar.h4(8, str3);
        }
        String str4 = q13.f215290i;
        if (str4 == null) {
            iVar.B4(9);
        } else {
            iVar.h4(9, str4);
        }
        iVar.g1(10, q13.f215291j);
        String str5 = q13.f215292k;
        if (str5 == null) {
            iVar.B4(11);
        } else {
            iVar.h4(11, str5);
        }
        iVar.g1(12, q13.f215293l);
        iVar.g1(13, q13.f215294m);
        String str6 = q13.f215295n;
        if (str6 == null) {
            iVar.B4(14);
        } else {
            iVar.h4(14, str6);
        }
        String str7 = q13.f215296o;
        if (str7 == null) {
            iVar.B4(15);
        } else {
            iVar.h4(15, str7);
        }
        String str8 = q13.f215297p;
        if (str8 == null) {
            iVar.B4(16);
        } else {
            iVar.h4(16, str8);
        }
        iVar.g1(17, q13.f215298q ? 1L : 0L);
        String str9 = q13.f215299r;
        if (str9 == null) {
            iVar.B4(18);
        } else {
            iVar.h4(18, str9);
        }
        String str10 = q13.f215300s;
        if (str10 == null) {
            iVar.B4(19);
        } else {
            iVar.h4(19, str10);
        }
        int i13 = UserEntityType.a.f215321a;
        iVar.h4(20, q13.f215301t.f215320b);
        iVar.h4(21, q13.f215302u);
        List<FileChunkMetaInfo> list = q13.f215303v;
        if (list == null) {
            strL = null;
        } else {
            int i14 = R0.f215305a;
            strL = new com.google.gson.d().a().l(list);
        }
        if (strL == null) {
            iVar.B4(22);
        } else {
            iVar.h4(22, strL);
        }
        String str11 = q13.f215304w;
        if (str11 == null) {
            iVar.B4(23);
        } else {
            iVar.h4(23, str11);
        }
    }
}
