package androidx.work.impl.model;

import androidx.room.O0;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes10.dex */
class Q extends O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
