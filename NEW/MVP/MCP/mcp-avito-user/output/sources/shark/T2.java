package shark;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import shark.q3;

/* compiled from: ObjectInspectors.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lshark/M1;", "heapObject", "", "invoke", "(Lshark/M1;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 1})
/* loaded from: classes9.dex */
final class T2 extends kotlin.jvm.internal.N implements Y41.l<M1, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final T2 f438210l = new T2();

    public T2() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(M1 m12) {
        M1 m13 = m12;
        C2 c22 = C2.f438011a;
        C48240c2 f438155c = m13.getF438155c();
        c22.getClass();
        List listB = C2.b(f438155c);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listB) {
            shark.internal.r0 r0Var = (shark.internal.r0) obj;
            if (r0Var.f438589a && r0Var.f438590b) {
                arrayList.add(obj);
            }
        }
        boolean z12 = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                q3.i iVar = ((shark.internal.r0) it.next()).f438591c;
                if (iVar.f438688a == m13.getF438157e()) {
                    z12 = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z12);
    }
}
