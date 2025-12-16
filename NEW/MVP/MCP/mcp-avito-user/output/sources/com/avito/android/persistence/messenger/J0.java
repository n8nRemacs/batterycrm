package com.avito.android.persistence.messenger;

/* compiled from: DraftDao_Impl.java */
/* loaded from: classes15.dex */
class J0 extends androidx.room.O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "\n            DELETE FROM draft \n            WHERE \n                local_user_id = ? \n                AND interlocutor_id = ?\n                AND local_user_type = ?\n            ";
    }
}
