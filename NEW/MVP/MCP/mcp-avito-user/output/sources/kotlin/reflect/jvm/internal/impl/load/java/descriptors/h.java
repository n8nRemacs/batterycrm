package kotlin.reflect.jvm.internal.impl.load.java.descriptors;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.z;
import kotlin.reflect.jvm.internal.impl.resolve.j;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: util.kt */
@s0
/* loaded from: classes8.dex */
public final class h {
    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final ArrayList a(@k List list, @k Collection collection, @k InterfaceC42905x interfaceC42905x) {
        O oF2;
        list.size();
        collection.size();
        ArrayList arrayListT0 = C42745f0.T0(list, collection);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListT0, 10));
        Iterator it = arrayListT0.iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            O o12 = (O) q12.f406619b;
            k0 k0Var = (k0) q12.f406620c;
            int index = k0Var.getIndex();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = k0Var.getAnnotations();
            kotlin.reflect.jvm.internal.impl.name.f name = k0Var.getName();
            boolean zK02 = k0Var.k0();
            boolean zZ02 = k0Var.z0();
            boolean zY02 = k0Var.y0();
            if (k0Var.S() != null) {
                int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
                oF2 = j.d(interfaceC42905x).m().f(o12);
            } else {
                oF2 = null;
            }
            arrayList.add(new V(interfaceC42905x, null, index, annotations, name, o12, zK02, zZ02, zY02, oF2, k0Var.e()));
        }
        return arrayList;
    }

    @l
    public static final z b(@k InterfaceC42851d interfaceC42851d) {
        InterfaceC42851d interfaceC42851d2;
        InterfaceC42853f interfaceC42853fB;
        int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
        Iterator<O> it = interfaceC42851d.q().H0().C().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC42851d2 = null;
                break;
            }
            O next = it.next();
            if (!kotlin.reflect.jvm.internal.impl.builtins.k.w(next)) {
                interfaceC42853fB = next.H0().b();
                int i13 = j.f409625a;
                if (j.n(interfaceC42853fB, ClassKind.f407413b) || j.n(interfaceC42853fB, ClassKind.f407415d)) {
                    break;
                }
            }
        }
        interfaceC42851d2 = (InterfaceC42851d) interfaceC42853fB;
        if (interfaceC42851d2 == null) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarP = interfaceC42851d2.P();
        z zVar = jVarP instanceof z ? (z) jVarP : null;
        return zVar == null ? b(interfaceC42851d2) : zVar;
    }
}
