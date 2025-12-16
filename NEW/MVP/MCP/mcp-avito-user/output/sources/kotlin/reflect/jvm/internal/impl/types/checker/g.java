package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42990o;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.I0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.M;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import u51.InterfaceC48806h;

/* compiled from: KotlinTypePreparator.kt */
@s0
/* loaded from: classes8.dex */
public abstract class g extends AbstractC42990o {

    /* compiled from: KotlinTypePreparator.kt */
    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f410098a = new a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Y b(Y y12) {
        O type;
        q0 q0VarH0 = y12.H0();
        if (q0VarH0 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) {
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c cVar = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) q0VarH0;
            x0 x0Var = cVar.f409580a;
            if (x0Var.a() != Variance.f410070e) {
                x0Var = null;
            }
            if (x0Var != null && (type = x0Var.getType()) != null) {
                j0H = type.K0();
            }
            J0 j02 = j0H;
            if (cVar.f409581b == null) {
                Collection<O> collectionC = cVar.C();
                ArrayList arrayList = new ArrayList(C42745f0.q(collectionC, 10));
                Iterator<T> it = collectionC.iterator();
                while (it.hasNext()) {
                    arrayList.add(((O) it.next()).K0());
                }
                cVar.f409581b = new m(cVar.f409580a, arrayList, null, 4, null);
            }
            return new k(CaptureStatus.f410226b, cVar.f409581b, j02, y12.G0(), y12.I0(), false, 32, null);
        }
        if (q0VarH0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.r) {
            ((kotlin.reflect.jvm.internal.impl.resolve.constants.r) q0VarH0).getClass();
            new ArrayList(C42745f0.q(null, 10));
            throw null;
        }
        if (!(q0VarH0 instanceof M) || !y12.I0()) {
            return y12;
        }
        M m12 = (M) q0VarH0;
        LinkedHashSet<O> linkedHashSet = m12.f410032b;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(linkedHashSet, 10));
        Iterator<T> it2 = linkedHashSet.iterator();
        boolean z12 = false;
        while (it2.hasNext()) {
            arrayList2.add(G0.h((O) it2.next(), true));
            z12 = true;
        }
        if (z12) {
            O o12 = m12.f410031a;
            j0H = o12 != null ? G0.h(o12, true) : null;
            M m13 = new M(new M(arrayList2).f410032b);
            m13.f410031a = j0H;
            j0H = m13;
        }
        if (j0H != null) {
            m12 = j0H;
        }
        return m12.d();
    }

    @Y61.k
    public final J0 a(@Y61.k InterfaceC48806h interfaceC48806h) {
        J0 j0C;
        if (!(interfaceC48806h instanceof O)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        J0 j0K0 = ((O) interfaceC48806h).K0();
        if (j0K0 instanceof Y) {
            j0C = b((Y) j0K0);
        } else {
            if (!(j0K0 instanceof H)) {
                throw new NoWhenBranchMatchedException();
            }
            H h12 = (H) j0K0;
            Y y12 = h12.f410024c;
            Y yB2 = b(y12);
            Y y13 = h12.f410025d;
            Y yB3 = b(y13);
            j0C = (yB2 == y12 && yB3 == y13) ? j0K0 : P.c(yB2, yB3);
        }
        h hVar = new h(1, this);
        O oA2 = I0.a(j0K0);
        return I0.b(j0C, oA2 != null ? (O) hVar.invoke(oA2) : null);
    }
}
