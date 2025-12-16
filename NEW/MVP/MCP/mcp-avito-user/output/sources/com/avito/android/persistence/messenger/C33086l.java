package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.ChannelIsReadStatus;
import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: ChannelDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.l, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33086l extends androidx.room.L<Y> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `channel` (`user_id`,`channel_id`,`type`,`created`,`updated`,`context_type`,`json_context`,`json_read_only_state`,`is_deleted`,`is_read`,`is_read_status`,`is_spam`,`is_answered`,`json_context_actions`,`flow`,`suspect_message_id`,`item_id`,`interlocutor_id`,`json_display_info`,`json_input_state`,`pin_order`,`user_type`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N Y y12) {
        Y y13 = y12;
        iVar.h4(1, y13.f215351a);
        iVar.h4(2, y13.f215352b);
        iVar.h4(3, y13.f215353c);
        iVar.g1(4, y13.f215354d);
        iVar.g1(5, y13.f215355e);
        iVar.h4(6, y13.f215356f);
        iVar.h4(7, y13.f215357g);
        String str = y13.f215358h;
        if (str == null) {
            iVar.B4(8);
        } else {
            iVar.h4(8, str);
        }
        iVar.g1(9, y13.f215359i ? 1L : 0L);
        iVar.g1(10, y13.f215360j ? 1L : 0L);
        int i12 = ChannelIsReadStatus.a.f215155a;
        iVar.h4(11, y13.f215361k.name());
        iVar.g1(12, y13.f215362l ? 1L : 0L);
        iVar.g1(13, y13.f215363m ? 1L : 0L);
        String str2 = y13.f215364n;
        if (str2 == null) {
            iVar.B4(14);
        } else {
            iVar.h4(14, str2);
        }
        String str3 = y13.f215365o;
        if (str3 == null) {
            iVar.B4(15);
        } else {
            iVar.h4(15, str3);
        }
        String str4 = y13.f215366p;
        if (str4 == null) {
            iVar.B4(16);
        } else {
            iVar.h4(16, str4);
        }
        String str5 = y13.f215367q;
        if (str5 == null) {
            iVar.B4(17);
        } else {
            iVar.h4(17, str5);
        }
        String str6 = y13.f215368r;
        if (str6 == null) {
            iVar.B4(18);
        } else {
            iVar.h4(18, str6);
        }
        iVar.h4(19, y13.f215369s);
        String str7 = y13.f215370t;
        if (str7 == null) {
            iVar.B4(20);
        } else {
            iVar.h4(20, str7);
        }
        Long l12 = y13.f215371u;
        if (l12 == null) {
            iVar.B4(21);
        } else {
            iVar.g1(21, l12.longValue());
        }
        int i13 = UserEntityType.a.f215321a;
        iVar.h4(22, y13.f215372v.f215320b);
    }
}
