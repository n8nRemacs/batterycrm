package androidx.work.impl.model;

/* compiled from: DependencyDao_Impl.java */
/* renamed from: androidx.work.impl.model.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23561c extends androidx.room.L<C23559a> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N C23559a c23559a) {
        C23559a c23559a2 = c23559a;
        iVar.h4(1, c23559a2.f55846a);
        iVar.h4(2, c23559a2.f55847b);
    }
}
