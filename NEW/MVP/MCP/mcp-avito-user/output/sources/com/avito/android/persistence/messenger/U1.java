package com.avito.android.persistence.messenger;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* loaded from: classes15.dex */
class U1 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            UPDATE message_meta_info\n                SET internal_path = ?,\n                    size_in_bytes = ?,\n                    chunk_count = ?,\n                    resolution = ?,\n                    extension = ?,\n                    compression_failed = ?\n            WHERE \n                local_user_id = ? AND\n                channel_id = ? AND\n                local_message_id = ? AND\n                local_user_type = ?\n        ";
    }
}
