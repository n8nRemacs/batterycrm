package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.X;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.text.C43066x;

/* compiled from: RawType.kt */
@s0
/* loaded from: classes8.dex */
public final class i extends H implements X {
    public i(Y y12, Y y13, int i12) {
        super(y12, y13);
        InterfaceC42970f.f410097a.d(y12, y13);
    }

    public static final ArrayList Q0(kotlin.reflect.jvm.internal.impl.renderer.c cVar, O o12) {
        List<x0> listF0 = o12.F0();
        ArrayList arrayList = new ArrayList(C42745f0.q(listF0, 10));
        Iterator<T> it = listF0.iterator();
        while (it.hasNext()) {
            arrayList.add(cVar.e0((x0) it.next()));
        }
        return arrayList;
    }

    public static final String R0(String str, String str2) {
        if (!C43066x.r(str, '<')) {
            return str;
        }
        return C43066x.p0(str, '<') + '<' + str2 + '>' + C43066x.n0('>', str, str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final O J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new i((Y) iVar.c(this.f410024c), (Y) iVar.c(this.f410025d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 L0(boolean z12) {
        return new i(this.f410024c.L0(z12), this.f410025d.L0(z12), 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    /* renamed from: M0 */
    public final J0 J0(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return new i((Y) iVar.c(this.f410024c), (Y) iVar.c(this.f410025d));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 N0(n0 n0Var) {
        return new i(this.f410024c.N0(n0Var), this.f410025d.N0(n0Var), 0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @k
    public final Y O0() {
        return this.f410024c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.types.H
    @k
    public final String P0(@k kotlin.reflect.jvm.internal.impl.renderer.c cVar, @k kotlin.reflect.jvm.internal.impl.renderer.c cVar2) {
        Y y12 = this.f410024c;
        String strY = cVar.Y(y12);
        Y y13 = this.f410025d;
        String strY2 = cVar.Y(y13);
        if (cVar2.f409484e.p()) {
            return "raw (" + strY + ".." + strY2 + ')';
        }
        if (y13.F0().isEmpty()) {
            return cVar.G(strY, strY2, H0().m());
        }
        ArrayList arrayListQ0 = Q0(cVar, y12);
        ArrayList arrayListQ02 = Q0(cVar, y13);
        String strO = C42745f0.O(arrayListQ0, ", ", null, null, h.f408292l, 30);
        ArrayList arrayListT0 = C42745f0.T0(arrayListQ0, arrayListQ02);
        if (arrayListT0.isEmpty()) {
            strY2 = R0(strY2, strO);
        } else {
            Iterator it = arrayListT0.iterator();
            while (it.hasNext()) {
                Q q12 = (Q) it.next();
                String str = (String) q12.f406619b;
                String str2 = (String) q12.f406620c;
                if (!L.f(str, C43066x.U("out ", str2)) && !L.f(str2, "*")) {
                    break;
                }
            }
            strY2 = R0(strY2, strO);
        }
        String strR0 = R0(strY, strO);
        return L.f(strR0, strY2) ? strR0 : cVar.G(strR0, strY2, H0().m());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.H, kotlin.reflect.jvm.internal.impl.types.O
    @k
    public final j n() {
        InterfaceC42853f interfaceC42853fB = H0().b();
        InterfaceC42851d interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
        if (interfaceC42851d != null) {
            return interfaceC42851d.R(new g(null, 1, null));
        }
        throw new IllegalStateException(("Incorrect classifier: " + H0().b()).toString());
    }
}
