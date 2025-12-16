package androidx.work.impl.model;

/* compiled from: PreferenceDao_Impl.java */
/* renamed from: androidx.work.impl.model.g, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
class C23565g extends androidx.room.L<C23563e> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N C23563e c23563e) {
        C23563e c23563e2 = c23563e;
        iVar.h4(1, c23563e2.f55852a);
        iVar.g1(2, c23563e2.f55853b.longValue());
    }
}
