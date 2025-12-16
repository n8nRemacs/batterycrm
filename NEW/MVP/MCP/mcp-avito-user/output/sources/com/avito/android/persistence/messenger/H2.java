package com.avito.android.persistence.messenger;

/* compiled from: MessageUploadPartDao_Impl.java */
/* loaded from: classes15.dex */
class H2 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            UPDATE message_upload_part \n                SET transfer_status = ?\n            WHERE\n                local_user_id = ? AND\n                channel_id = ? AND\n                local_message_id = ? AND\n                part_number = ? AND\n                local_user_type = ?\n       ";
    }
}
