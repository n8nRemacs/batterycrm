package com.avito.android.persistence.messenger;

/* compiled from: MessageDao_Impl.java */
/* loaded from: classes15.dex */
class L1 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n        update message\n        set\n            is_read = 1,\n            is_read_status = ?,\n            read_locally_timestamp = ?\n        where\n            user_id = ?\n            and channel_id = ?\n            and is_read_status = ?\n            and user_type = ?\n        ";
    }
}
