package shark;

import kotlin.Metadata;
import shark.M1;

/* compiled from: AndroidBuildMirror.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lshark/b;", "invoke", "()Lshark/b;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48229a extends kotlin.jvm.internal.N implements Y41.a<C48233b> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L1 f438233l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48229a(L1 l12) {
        super(0);
        this.f438233l = l12;
    }

    @Override // Y41.a
    public final C48233b invoke() {
        L1 l12 = this.f438233l;
        M1.b bVarC = l12.c("android.os.Build");
        if (bVarC == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.b bVarC2 = l12.c("android.os.Build$VERSION");
        if (bVarC2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        K1 k1L = bVarC.l("MANUFACTURER");
        if (k1L == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        String strI = k1L.f438095c.i();
        if (strI == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        K1 k1L2 = bVarC2.l("SDK_INT");
        if (k1L2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        Integer numB = k1L2.f438095c.b();
        if (numB == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        int iIntValue = numB.intValue();
        K1 k1L3 = bVarC.l("ID");
        if (k1L3 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        String strI2 = k1L3.f438095c.i();
        if (strI2 != null) {
            return new C48233b(strI, iIntValue, strI2);
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
