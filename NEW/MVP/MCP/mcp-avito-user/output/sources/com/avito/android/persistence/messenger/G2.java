package com.avito.android.persistence.messenger;

import com.avito.android.persistence.messenger.UserEntityType;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class G2 extends androidx.room.K<C33136x2> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "DELETE FROM `message_upload_part` WHERE `local_user_id` = ? AND `channel_id` = ? AND `local_message_id` = ? AND `part_number` = ? AND `local_user_type` = ?";
    }

    @Override // androidx.room.K
    public final void d(@j.N Z1.i iVar, @j.N C33136x2 c33136x2) {
        C33136x2 c33136x22 = c33136x2;
        iVar.h4(1, c33136x22.f215571a);
        iVar.h4(2, c33136x22.f215572b);
        iVar.h4(3, c33136x22.f215573c);
        iVar.g1(4, c33136x22.f215574d);
        int i12 = UserEntityType.a.f215321a;
        iVar.h4(5, c33136x22.f215580j.f215320b);
    }
}
