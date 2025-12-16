package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.TransferStatus;
import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class F2 extends androidx.room.L<C33136x2> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `message_upload_part` (`local_user_id`,`channel_id`,`local_message_id`,`part_number`,`total_number_of_parts`,`path`,`transfer_status`,`hash`,`e_tag`,`local_user_type`) VALUES (?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N C33136x2 c33136x2) {
        C33136x2 c33136x22 = c33136x2;
        iVar.h4(1, c33136x22.f215571a);
        iVar.h4(2, c33136x22.f215572b);
        iVar.h4(3, c33136x22.f215573c);
        iVar.g1(4, c33136x22.f215574d);
        iVar.g1(5, c33136x22.f215575e);
        iVar.h4(6, c33136x22.f215576f);
        int i12 = TransferStatus.a.f215308a;
        iVar.h4(7, c33136x22.f215577g.name());
        String str = c33136x22.f215578h;
        if (str == null) {
            iVar.B4(8);
        } else {
            iVar.h4(8, str);
        }
        String str2 = c33136x22.f215579i;
        if (str2 == null) {
            iVar.B4(9);
        } else {
            iVar.h4(9, str2);
        }
        int i13 = UserEntityType.a.f215321a;
        iVar.h4(10, c33136x22.f215580j.f215320b);
    }
}
