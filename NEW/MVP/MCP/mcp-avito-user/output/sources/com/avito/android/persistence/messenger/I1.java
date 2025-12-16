package com.avito.android.persistence.messenger;

/* compiled from: MessageDao_Impl.java */
/* loaded from: classes15.dex */
class I1 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n        DELETE FROM message_meta_info\n        WHERE \n            local_user_id = ? AND\n            channel_id = ? AND\n            local_message_id = ? AND\n            local_user_type = ?\n        ";
    }
}
