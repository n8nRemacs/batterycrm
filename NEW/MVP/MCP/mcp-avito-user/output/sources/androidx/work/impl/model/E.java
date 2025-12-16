package androidx.work.impl.model;

import androidx.room.O0;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes10.dex */
class E extends O0 {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
