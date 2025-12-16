package shark;

import kotlin.Metadata;
import shark.M1;

/* compiled from: KeyedWeakReferenceFinder.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class D2 extends kotlin.jvm.internal.N implements Y41.a<Long> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L1 f438015l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D2(L1 l12) {
        super(0);
        this.f438015l = l12;
    }

    @Override // Y41.a
    public final Long invoke() {
        K1 k1L;
        M1.b bVarC = this.f438015l.c("leakcanary.KeyedWeakReference");
        Long lC2 = null;
        if (bVarC != null && (k1L = bVarC.l("heapDumpUptimeMillis")) != null) {
            lC2 = k1L.f438095c.c();
        }
        if (lC2 == null) {
            j3.f438639b.getClass();
            leakcanary.u uVar = j3.f438638a;
            if (uVar != null) {
                uVar.a("leakcanary.KeyedWeakReference.heapDumpUptimeMillis field not found");
            }
        }
        return lC2;
    }
}
