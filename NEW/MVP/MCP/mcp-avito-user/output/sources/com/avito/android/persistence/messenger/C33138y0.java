package com.avito.android.persistence.messenger;

/* compiled from: DbPurgeDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.y0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33138y0 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n        DELETE FROM channel_meta_data\n        WHERE local_user_id = ?\n    ";
    }
}
