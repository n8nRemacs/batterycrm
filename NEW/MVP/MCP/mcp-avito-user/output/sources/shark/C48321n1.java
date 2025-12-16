package shark;

import java.util.List;
import kotlin.Metadata;
import kotlin.sequences.C43033p;
import shark.M1;

/* compiled from: AndroidServices.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "", "invoke"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.n1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48321n1 extends kotlin.jvm.internal.N implements Y41.a<List<? extends Long>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L1 f438658l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48321n1(L1 l12) {
        super(0);
        this.f438658l = l12;
    }

    @Override // Y41.a
    public final List<? extends Long> invoke() {
        M1.b bVarC = this.f438658l.c("android.app.ActivityThread");
        if (bVarC == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        K1 k1L = bVarC.l("sCurrentActivityThread");
        if (k1L == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA = k1L.a();
        if (cVarA == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        K1 k1J = cVarA.j("android.app.ActivityThread", "mServices");
        if (k1J == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.c cVarA2 = k1J.a();
        if (cVarA2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        K1 k1J2 = cVarA2.j("android.util.ArrayMap", "mArray");
        if (k1J2 == null) {
            kotlin.jvm.internal.L.k();
            throw null;
        }
        M1.d dVarB = k1J2.b();
        if (dVarB != null) {
            return C43033p.D(new kotlin.sequences.o0(C43033p.j(dVarB.f(), C48313l1.f438649l), C48317m1.f438654l));
        }
        kotlin.jvm.internal.L.k();
        throw null;
    }
}
