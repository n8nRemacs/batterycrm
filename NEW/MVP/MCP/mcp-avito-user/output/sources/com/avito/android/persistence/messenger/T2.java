package com.avito.android.persistence.messenger;

/* compiled from: UserDao_Impl.java */
/* loaded from: classes15.dex */
class T2 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            UPDATE user\n                SET last_action_time = ?,\n                    time_diff = ?\n            WHERE user_id = ?\n        ";
    }
}
