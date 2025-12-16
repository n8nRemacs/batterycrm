package androidx.work.impl.model;

import androidx.work.C23544h;

/* compiled from: WorkProgressDao_Impl.java */
/* loaded from: classes10.dex */
class D extends androidx.room.L<B> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N B b12) {
        B b13 = b12;
        iVar.h4(1, b13.f55787a);
        C23544h.f55508b.getClass();
        iVar.u4(2, C23544h.b.c(b13.f55788b));
    }
}
