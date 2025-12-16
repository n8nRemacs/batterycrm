package com.avito.android.persistence.messenger;

/* compiled from: MessageMetaInfoDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.s2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33116s2 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            UPDATE message_meta_info\n                SET local_file_chunks = ?\n            WHERE\n                local_user_id = ? AND\n                channel_id = ? AND\n                local_message_id = ? AND\n                local_user_type = ?\n        ";
    }
}
