package com.avito.android.persistence.messenger;

/* compiled from: DbPurgeDao_Impl.java */
/* renamed from: com.avito.android.persistence.messenger.x0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C33134x0 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n        DELETE FROM channel\n        WHERE user_id = ?\n    ";
    }
}
