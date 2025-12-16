package com.avito.android.persistence.messenger;

/* compiled from: MessageDao_Impl.java */
/* loaded from: classes15.dex */
class H1 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n        DELETE FROM message \n        WHERE \n            user_id = ? AND\n            channel_id = ? AND\n            local_id = ? AND\n            user_type = ?\n        ";
    }
}
