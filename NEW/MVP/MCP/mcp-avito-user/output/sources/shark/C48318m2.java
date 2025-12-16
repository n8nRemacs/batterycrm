package shark;

import kotlin.Metadata;
import shark.AbstractC48345t2;

/* compiled from: HprofHeapGraph.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lshark/u2;", "Lshark/t2$b$c$c;", "invoke", "(Lshark/u2;)Lshark/t2$b$c$c;", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.m2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48318m2 extends kotlin.jvm.internal.N implements Y41.l<C48349u2, AbstractC48345t2.b.c.C12639c> {

    /* renamed from: l, reason: collision with root package name */
    public static final C48318m2 f438655l = new C48318m2();

    public C48318m2() {
        super(1);
    }

    @Override // Y41.l
    public final AbstractC48345t2.b.c.C12639c invoke(C48349u2 c48349u2) {
        C48349u2 c48349u22 = c48349u2;
        long jC2 = c48349u22.c();
        int iD2 = c48349u22.d();
        int iD3 = c48349u22.d();
        long jC3 = c48349u22.c();
        long[] jArr = new long[iD3];
        for (int i12 = 0; i12 < iD3; i12++) {
            jArr[i12] = c48349u22.c();
        }
        return new AbstractC48345t2.b.c.C12639c(jC2, iD2, jC3, jArr);
    }
}
