package androidx.work.impl.model;

/* compiled from: SystemIdInfoDao_Impl.java */
/* loaded from: classes10.dex */
class r extends androidx.room.L<C23574p> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N C23574p c23574p) {
        iVar.h4(1, c23574p.f55876a);
        iVar.g1(2, r5.f55877b);
        iVar.g1(3, r5.f55878c);
    }
}
