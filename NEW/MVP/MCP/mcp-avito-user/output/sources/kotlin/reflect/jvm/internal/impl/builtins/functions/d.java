package kotlin.reflect.jvm.internal.impl.builtins.functions;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.H0;
import kotlin.collections.I0;
import kotlin.collections.J0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.P;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.V;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.util.q;

/* compiled from: FunctionInvokeDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class d extends P {

    /* renamed from: F, reason: collision with root package name */
    @k
    public static final a f407212F = new a(null);

    /* compiled from: FunctionInvokeDescriptor.kt */
    @s0
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static d a(@k b bVar, boolean z12) {
            d dVar = new d(bVar, null, CallableMemberDescriptor.Kind.f407408b, z12, null);
            X xP02 = bVar.p0();
            C42784z0 c42784z0 = C42784z0.f406748b;
            List<g0> list = bVar.f407210m;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((g0) obj).o() != Variance.f410070e) {
                    break;
                }
                arrayList.add(obj);
            }
            I0 i0S0 = C42745f0.S0(arrayList);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(i0S0, 10));
            Iterator it = i0S0.iterator();
            while (true) {
                J0 j02 = (J0) it;
                if (!j02.f406646b.hasNext()) {
                    C42784z0 c42784z02 = c42784z0;
                    dVar.I0(null, xP02, c42784z02, c42784z02, arrayList2, ((g0) C42745f0.Q(list)).q(), Modality.f407442f, r.f407789e);
                    dVar.f407726y = true;
                    return dVar;
                }
                H0 h02 = (H0) j02.next();
                a aVar = d.f407212F;
                int i12 = h02.f406643a;
                g0 g0Var = (g0) h02.f406644b;
                aVar.getClass();
                String strB = g0Var.getName().b();
                String lowerCase = strB.equals("T") ? "instance" : strB.equals("E") ? "receiver" : strB.toLowerCase(Locale.ROOT);
                g.f407522s2.getClass();
                C42784z0 c42784z03 = c42784z0;
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(new V(dVar, null, i12, g.a.f407524b, kotlin.reflect.jvm.internal.impl.name.f.e(lowerCase), g0Var.q(), false, false, false, null, b0.f407539a));
                arrayList2 = arrayList3;
                c42784z0 = c42784z03;
            }
        }

        public a() {
        }
    }

    public /* synthetic */ d(InterfaceC42882k interfaceC42882k, d dVar, CallableMemberDescriptor.Kind kind, boolean z12, C42822w c42822w) {
        this(interfaceC42882k, dVar, kind, z12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.P, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @k
    public final AbstractC42878w F0(@k CallableMemberDescriptor.Kind kind, @k InterfaceC42882k interfaceC42882k, @l InterfaceC42905x interfaceC42905x, @k b0 b0Var, @k g gVar, @l kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return new d(interfaceC42882k, (d) interfaceC42905x, kind, this.f407724w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    @l
    public final AbstractC42878w G0(@k AbstractC42878w.a aVar) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        d dVar = (d) super.G0(aVar);
        if (dVar == null) {
            return null;
        }
        List<k0> listG = dVar.g();
        if ((listG instanceof Collection) && listG.isEmpty()) {
            return dVar;
        }
        Iterator<T> it = listG.iterator();
        while (it.hasNext()) {
            if (kotlin.reflect.jvm.internal.impl.builtins.g.c(((k0) it.next()).getType()) != null) {
                List<k0> listG2 = dVar.g();
                ArrayList arrayList = new ArrayList(C42745f0.q(listG2, 10));
                Iterator<T> it2 = listG2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(kotlin.reflect.jvm.internal.impl.builtins.g.c(((k0) it2.next()).getType()));
                }
                int size = dVar.g().size() - arrayList.size();
                boolean z12 = true;
                if (size == 0) {
                    ArrayList arrayListT0 = C42745f0.T0(arrayList, dVar.g());
                    if (arrayListT0.isEmpty()) {
                        return dVar;
                    }
                    Iterator it3 = arrayListT0.iterator();
                    while (it3.hasNext()) {
                        Q q12 = (Q) it3.next();
                        if (!L.f((kotlin.reflect.jvm.internal.impl.name.f) q12.f406619b, ((k0) q12.f406620c).getName())) {
                        }
                    }
                    return dVar;
                }
                List<k0> listG3 = dVar.g();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(listG3, 10));
                for (k0 k0Var : listG3) {
                    kotlin.reflect.jvm.internal.impl.name.f name = k0Var.getName();
                    int index = k0Var.getIndex();
                    int i12 = index - size;
                    if (i12 >= 0 && (fVar = (kotlin.reflect.jvm.internal.impl.name.f) arrayList.get(i12)) != null) {
                        name = fVar;
                    }
                    arrayList2.add(k0Var.B(dVar, name, index));
                }
                AbstractC42878w.a aVarJ0 = dVar.J0(E0.f410009b);
                if (arrayList.isEmpty()) {
                    z12 = false;
                } else {
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        if (((kotlin.reflect.jvm.internal.impl.name.f) it4.next()) == null) {
                            break;
                        }
                    }
                    z12 = false;
                }
                aVarJ0.f407749v = Boolean.valueOf(z12);
                aVarJ0.f407734g = arrayList2;
                aVarJ0.f407732e = dVar.n0();
                return super.G0(aVarJ0);
            }
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean Z() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x
    public final boolean isInline() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InterfaceC42882k interfaceC42882k, d dVar, CallableMemberDescriptor.Kind kind, boolean z12) {
        super(interfaceC42882k, dVar, g.a.f407524b, q.f410313g, kind, b0.f407539a);
        g.f407522s2.getClass();
        this.f407715n = true;
        this.f407724w = z12;
        this.f407725x = false;
    }
}
