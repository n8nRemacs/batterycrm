package d;

import gc1.InterfaceC40658b;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* renamed from: d.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C39442a {

    /* renamed from: a, reason: collision with root package name */
    public final G41.a f393105a;

    public C39442a(G41.a aVar) {
        this.f393105a = aVar;
    }

    public final void a(InterfaceC40658b interfaceC40658b) {
        String f396624i = interfaceC40658b.getF396624i();
        if (f396624i == null) {
            f396624i = interfaceC40658b.toString();
        }
        G41.i iVar = (G41.i) this.f393105a;
        D31.a aVar = iVar.f6330a;
        C43259k.d((T) ((D31.g) aVar).f2880a.getValue(), null, null, new G41.b(iVar, f396624i, null), 3);
        String f396624i2 = interfaceC40658b.getF396624i();
        if (f396624i2 == null) {
            f396624i2 = interfaceC40658b.toString();
        }
        C43259k.d((T) ((D31.g) aVar).f2880a.getValue(), null, null, new G41.c(iVar, f396624i2, null), 3);
        List<InterfaceC40658b> listA = interfaceC40658b.a();
        if (listA != null) {
            Iterator<T> it = listA.iterator();
            while (it.hasNext()) {
                a((InterfaceC40658b) it.next());
            }
        }
    }
}
