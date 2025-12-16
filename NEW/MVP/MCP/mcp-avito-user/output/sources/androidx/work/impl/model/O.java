package androidx.work.impl.model;

import androidx.room.O0;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes10.dex */
class O extends O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
    }
}
