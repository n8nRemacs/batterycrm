package androidx.work.impl.model;

import androidx.room.O0;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes10.dex */
class j0 extends O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
    }
}
