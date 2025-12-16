package androidx.work.impl.model;

/* compiled from: WorkTagDao_Impl.java */
/* loaded from: classes10.dex */
class r0 extends androidx.room.L<p0> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N p0 p0Var) {
        p0 p0Var2 = p0Var;
        iVar.h4(1, p0Var2.f55879a);
        iVar.h4(2, p0Var2.f55880b);
    }
}
