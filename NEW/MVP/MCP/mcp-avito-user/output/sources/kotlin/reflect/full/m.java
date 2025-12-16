package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.InterfaceC42733c0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.InterfaceC43012v;
import kotlin.reflect.jvm.internal.T;
import kotlin.reflect.jvm.internal.X;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.C42974e0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.reflect.t;

/* compiled from: KClassifiers.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@X41.i
/* loaded from: classes8.dex */
public final class m {

    /* compiled from: KClassifiers.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f406963a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                KVariance kVariance = KVariance.f406947b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KVariance kVariance2 = KVariance.f406947b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KVariance kVariance3 = KVariance.f406947b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f406963a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC42733c0
    @Y61.k
    public static final T a(@Y61.k kotlin.reflect.d dVar, @Y61.k List list, boolean z12, @Y61.k List list2) {
        InterfaceC42853f descriptor;
        n0 n0Var;
        Object c42974e0;
        Y41.a aVar = null;
        Object[] objArr = 0;
        InterfaceC43012v interfaceC43012v = dVar instanceof InterfaceC43012v ? (InterfaceC43012v) dVar : null;
        if (interfaceC43012v == null || (descriptor = interfaceC43012v.getDescriptor()) == null) {
            throw new X("Cannot create type for an unsupported classifier: " + dVar + " (" + dVar.getClass() + ')');
        }
        q0 q0VarL = descriptor.l();
        List<g0> parameters = q0VarL.getParameters();
        if (parameters.size() != list.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            n0.f410236c.getClass();
            n0Var = n0.f410237d;
        } else {
            n0.f410236c.getClass();
            n0Var = n0.f410237d;
        }
        List<g0> parameters2 = q0VarL.getParameters();
        List list3 = list;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        Iterator it = list3.iterator();
        int i12 = 0;
        while (true) {
            int i13 = 2;
            if (!it.hasNext()) {
                return new T(P.e(n0Var, q0VarL, arrayList, z12, null), aVar, i13, objArr == true ? 1 : 0);
            }
            Object next = it.next();
            int i14 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            t tVar = (t) next;
            T t12 = (T) tVar.f410466b;
            O o12 = t12 != null ? t12.f407060b : null;
            KVariance kVariance = tVar.f410465a;
            int i15 = kVariance == null ? -1 : a.f406963a[kVariance.ordinal()];
            if (i15 == -1) {
                c42974e0 = new C42974e0(parameters2.get(i12));
            } else if (i15 == 1) {
                c42974e0 = new z0(o12, Variance.f410069d);
            } else if (i15 == 2) {
                c42974e0 = new z0(o12, Variance.f410070e);
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                c42974e0 = new z0(o12, Variance.f410071f);
            }
            arrayList.add(c42974e0);
            i12 = i14;
        }
    }
}
