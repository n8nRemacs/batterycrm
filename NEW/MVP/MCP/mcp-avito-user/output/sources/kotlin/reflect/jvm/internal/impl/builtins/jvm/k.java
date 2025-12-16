package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.utils.b;

/* loaded from: classes8.dex */
class k implements b.d {

    /* renamed from: a, reason: collision with root package name */
    public final l f407273a;

    public k(l lVar) {
        this.f407273a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [kotlin.reflect.jvm.internal.impl.descriptors.d] */
    @Override // kotlin.reflect.jvm.internal.impl.utils.b.d
    public final Iterable a(Object obj) {
        kotlin.reflect.n<Object>[] nVarArr = l.f407274i;
        Collection<O> collectionC = ((InterfaceC42851d) obj).l().C();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            InterfaceC42853f interfaceC42853fB = ((O) it.next()).H0().b();
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVarF = null;
            InterfaceC42853f interfaceC42853fN0 = interfaceC42853fB != null ? interfaceC42853fB.n0() : null;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.f fVar = interfaceC42853fN0 instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fN0 : null;
            if (fVar != null && (fVarF = this.f407273a.f(fVar)) == null) {
                fVarF = fVar;
            }
            if (fVarF != null) {
                arrayList.add(fVarF);
            }
        }
        return arrayList;
    }
}
