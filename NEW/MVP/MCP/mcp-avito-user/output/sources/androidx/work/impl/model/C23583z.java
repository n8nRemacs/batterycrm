package androidx.work.impl.model;

/* compiled from: WorkNameDao_Impl.java */
/* renamed from: androidx.work.impl.model.z, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23583z extends androidx.room.L<C23581x> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N C23581x c23581x) {
        C23581x c23581x2 = c23581x;
        iVar.h4(1, c23581x2.f55891a);
        iVar.h4(2, c23581x2.f55892b);
    }
}
