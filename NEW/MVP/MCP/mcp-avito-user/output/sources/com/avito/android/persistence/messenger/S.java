package com.avito.android.persistence.messenger;

/* compiled from: ChannelDao_Impl.java */
/* loaded from: classes15.dex */
class S extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            UPDATE channel\n                SET is_read = 1,\n                    is_read_status = ?\n            WHERE \n                user_id = ?\n                AND user_type = ?\n                AND channel_id = ?\n        ";
    }
}
