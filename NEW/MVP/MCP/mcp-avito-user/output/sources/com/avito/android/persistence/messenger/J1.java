package com.avito.android.persistence.messenger;

/* compiled from: MessageDao_Impl.java */
/* loaded from: classes15.dex */
class J1 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            update message\n            set\n                read_timestamp = ?,\n                is_read = 1,\n                is_read_status = ?\n            where\n                user_id = ?\n                and channel_id = ?\n                and from_id = ?\n                and read_timestamp is null\n                and user_type = ?\n            ";
    }
}
