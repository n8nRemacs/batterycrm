package shark;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import shark.C48356w1;

/* compiled from: FilteringLeakingObjectFinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1;", "heapObject", "", "invoke", "(Lshark/M1;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* renamed from: shark.x1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C48360x1 extends kotlin.jvm.internal.N implements Y41.l<M1, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C48356w1 f438802l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C48360x1(C48356w1 c48356w1) {
        super(1);
        this.f438802l = c48356w1;
    }

    @Override // Y41.l
    public final Boolean invoke(M1 m12) {
        M1 m13 = m12;
        ArrayList arrayList = this.f438802l.f438797a;
        boolean z12 = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C48356w1.a) it.next()).a(m13)) {
                    z12 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
