package com.avito.android.persistence.messenger;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* loaded from: classes15.dex */
class T1 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            UPDATE message_meta_info\n                SET file_id = ?,\n                    video_id = ?,\n                    upload_session_id = ?\n            WHERE \n                local_user_id = ? AND\n                channel_id = ? AND\n                local_message_id = ? AND\n                local_user_type = ?\n        ";
    }
}
