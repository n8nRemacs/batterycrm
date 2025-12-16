package d;

import gc1.InterfaceC40658b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.L;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final G41.a f393143a;

    public k(G41.a aVar) {
        this.f393143a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(InterfaceC40658b interfaceC40658b, Cc1.b bVar) {
        boolean z12 = interfaceC40658b instanceof InterfaceC40658b.k;
        G41.a aVar = this.f393143a;
        boolean z13 = z12 && L.f(((HashMap) ((G41.i) aVar).f6344o.getValue()).get(((InterfaceC40658b.k) interfaceC40658b).f396574b), Boolean.TRUE);
        if (!z12 || z13) {
            bVar.invoke(interfaceC40658b);
        }
        List<InterfaceC40658b> listA = interfaceC40658b.a();
        if (listA == null) {
            InterfaceC40658b interfaceC40658b2 = (InterfaceC40658b) ((HashMap) ((G41.i) aVar).f6338i.getValue()).get(interfaceC40658b.getF396624i());
            listA = interfaceC40658b2 != null ? interfaceC40658b2.a() : null;
        }
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                a((InterfaceC40658b) it.next(), bVar);
            }
        }
    }
}
