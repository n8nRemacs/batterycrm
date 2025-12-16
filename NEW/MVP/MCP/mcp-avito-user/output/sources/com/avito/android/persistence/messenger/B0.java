package com.avito.android.persistence.messenger;

/* compiled from: DbPurgeDao_Impl.java */
/* loaded from: classes15.dex */
class B0 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n        DELETE FROM message\n        WHERE user_id = ?\n    ";
    }
}
