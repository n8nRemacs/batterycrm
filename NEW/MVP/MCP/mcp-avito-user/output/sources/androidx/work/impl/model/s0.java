package androidx.work.impl.model;

import androidx.room.O0;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes10.dex */
class s0 extends O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "DELETE FROM worktag WHERE work_spec_id=?";
    }
}
