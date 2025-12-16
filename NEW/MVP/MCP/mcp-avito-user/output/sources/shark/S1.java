package shark;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.sequences.C43033p;
import shark.M1;

/* compiled from: HeapObject.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1$b;", "it", "", "invoke", "(Lshark/M1$b;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class S1 extends kotlin.jvm.internal.N implements Y41.l<M1.b, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ M1.b f438204l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(M1.b bVar) {
        super(1);
        this.f438204l = bVar;
    }

    @Override // Y41.l
    public final Boolean invoke(M1.b bVar) {
        boolean z12;
        M1.b bVar2 = bVar;
        long j12 = this.f438204l.f438147e;
        if (j12 != bVar2.f438147e) {
            Iterator it = C43033p.u(N1.f438163l, bVar2).iterator();
            while (it.hasNext()) {
                if (((M1.b) it.next()).f438147e == j12) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        } else {
            z12 = false;
        }
        return Boolean.valueOf(z12);
    }
}
