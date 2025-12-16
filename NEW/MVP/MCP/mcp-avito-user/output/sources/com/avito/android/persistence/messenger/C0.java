package com.avito.android.persistence.messenger;

/* compiled from: DbPurgeDao_Impl.java */
/* loaded from: classes15.dex */
class C0 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n        DELETE FROM message_meta_info\n        WHERE local_user_id = ?\n    ";
    }
}
