package androidx.compose.runtime;

import androidx.compose.runtime.A;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

@Metadata(d1 = {"androidx/compose/runtime/n3", "androidx/compose/runtime/t3", "androidx/compose/runtime/w3", "androidx/compose/runtime/x3", "androidx/compose/runtime/y3"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.m3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22126m3 {
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.runtime.InterfaceC22204y1 a(@Y61.k kotlinx.coroutines.flow.InterfaceC43160i r3, java.lang.Object r4, @Y61.l kotlin.coroutines.CoroutineContext r5, @Y61.l androidx.compose.runtime.A r6, int r7, int r8) {
        /*
            r7 = r8 & 2
            if (r7 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r5 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            boolean r7 = r6.u(r5)
            boolean r8 = r6.u(r3)
            r7 = r7 | r8
            java.lang.Object r8 = r6.t()
            r0 = 0
            androidx.compose.runtime.A$a r1 = androidx.compose.runtime.A.f37866a
            if (r7 != 0) goto L1f
            r1.getClass()
            androidx.compose.runtime.A$a$a r7 = androidx.compose.runtime.A.a.f37868b
            if (r8 != r7) goto L27
        L1f:
            androidx.compose.runtime.u3 r8 = new androidx.compose.runtime.u3
            r8.<init>(r5, r3, r0)
            r6.H(r8)
        L27:
            Y41.p r8 = (Y41.p) r8
            java.lang.Object r7 = r6.t()
            r1.getClass()
            androidx.compose.runtime.A$a$a r1 = androidx.compose.runtime.A.a.f37868b
            if (r7 != r1) goto L3b
            androidx.compose.runtime.y1 r7 = g(r4)
            r6.H(r7)
        L3b:
            androidx.compose.runtime.y1 r7 = (androidx.compose.runtime.InterfaceC22204y1) r7
            boolean r4 = r6.u(r8)
            java.lang.Object r2 = r6.t()
            if (r4 != 0) goto L49
            if (r2 != r1) goto L51
        L49:
            androidx.compose.runtime.q3 r2 = new androidx.compose.runtime.q3
            r2.<init>(r8, r7, r0)
            r6.H(r2)
        L51:
            Y41.p r2 = (Y41.p) r2
            androidx.compose.runtime.C22187u0.e(r3, r5, r2, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C22126m3.a(kotlinx.coroutines.flow.i, java.lang.Object, kotlin.coroutines.CoroutineContext, androidx.compose.runtime.A, int, int):androidx.compose.runtime.y1");
    }

    @InterfaceC22132o
    @Y61.k
    public static final InterfaceC22204y1 b(@Y61.k kotlinx.coroutines.flow.n2 n2Var, @Y61.l A a12) {
        return a(n2Var, n2Var.getValue(), EmptyCoroutineContext.INSTANCE, a12, 8, 0);
    }

    @Y61.k
    public static final androidx.compose.runtime.collection.e<InterfaceC22079i0> c() {
        androidx.compose.runtime.internal.N<androidx.compose.runtime.collection.e<InterfaceC22079i0>> n12 = C22131n3.f38511b;
        androidx.compose.runtime.collection.e<InterfaceC22079i0> eVarA = n12.a();
        if (eVarA != null) {
            return eVarA;
        }
        androidx.compose.runtime.collection.e<InterfaceC22079i0> eVar = new androidx.compose.runtime.collection.e<>(new InterfaceC22079i0[0], 0);
        n12.b(eVar);
        return eVar;
    }

    @androidx.compose.runtime.snapshots.N
    @Y61.k
    public static final <T> I3<T> d(@Y61.k Y41.a<? extends T> aVar) {
        androidx.compose.runtime.internal.N<androidx.compose.runtime.internal.D> n12 = C22131n3.f38510a;
        return new C22069g0(aVar, null);
    }

    @androidx.compose.runtime.snapshots.N
    @Y61.k
    public static final I3 e(@Y61.k Y41.a aVar, @Y61.k InterfaceC22116k3 interfaceC22116k3) {
        androidx.compose.runtime.internal.N<androidx.compose.runtime.internal.D> n12 = C22131n3.f38510a;
        return new C22069g0(aVar, interfaceC22116k3);
    }

    @androidx.compose.runtime.snapshots.N
    @Y61.k
    public static final <T> InterfaceC22204y1<T> f(T t12, @Y61.k InterfaceC22116k3<T> interfaceC22116k3) {
        return new ParcelableSnapshotMutableState(t12, interfaceC22116k3);
    }

    public static InterfaceC22204y1 g(Object obj) {
        return new ParcelableSnapshotMutableState(obj, L3.f38023a);
    }

    @Y61.k
    public static final <T> InterfaceC22116k3<T> h() {
        return B1.f37929a;
    }

    @InterfaceC22132o
    @Y61.k
    public static final InterfaceC22204y1 i(@Y61.k Y41.p pVar, @Y61.l A a12, Object obj) {
        Object objT = a12.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = g(obj);
            a12.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        kotlin.G0 g02 = kotlin.G0.f406611a;
        boolean zU2 = a12.u(pVar);
        Object objT2 = a12.t();
        if (zU2 || objT2 == c1651a) {
            objT2 = new C22136o3(pVar, interfaceC22204y1, null);
            a12.H(objT2);
        }
        C22187u0.d((Y41.p) objT2, a12, g02);
        return interfaceC22204y1;
    }

    @InterfaceC22132o
    @Y61.k
    public static final InterfaceC22204y1 j(Object obj, @Y61.l Object obj2, @Y61.k Y41.p pVar, @Y61.l A a12) {
        Object objT = a12.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = g(obj);
            a12.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        boolean zU2 = a12.u(pVar);
        Object objT2 = a12.t();
        if (zU2 || objT2 == c1651a) {
            objT2 = new C22141p3(pVar, interfaceC22204y1, null);
            a12.H(objT2);
        }
        C22187u0.d((Y41.p) objT2, a12, obj2);
        return interfaceC22204y1;
    }

    @InterfaceC22132o
    @Y61.k
    public static final InterfaceC22204y1 k(Object obj, @Y61.k Object[] objArr, @Y61.k Y41.p pVar, @Y61.l A a12) {
        Object objT = a12.t();
        A.f37866a.getClass();
        A.a.C1651a c1651a = A.a.f37868b;
        if (objT == c1651a) {
            objT = g(obj);
            a12.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zU2 = a12.u(pVar);
        Object objT2 = a12.t();
        if (zU2 || objT2 == c1651a) {
            objT2 = new C22155s3(pVar, interfaceC22204y1, null);
            a12.H(objT2);
        }
        C22187u0.g(objArrCopyOf, (Y41.p) objT2, a12);
        return interfaceC22204y1;
    }

    @Y61.k
    public static final <T> InterfaceC22116k3<T> l() {
        return C22205y2.f38805a;
    }

    @InterfaceC22132o
    @Y61.k
    public static final InterfaceC22204y1 m(Object obj, @Y61.l A a12) {
        Object objT = a12.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = g(obj);
            a12.H(objT);
        }
        InterfaceC22204y1 interfaceC22204y1 = (InterfaceC22204y1) objT;
        interfaceC22204y1.setValue(obj);
        return interfaceC22204y1;
    }

    @Y61.k
    public static final <T> InterfaceC43160i<T> n(@Y61.k Y41.a<? extends T> aVar) {
        return C43175k.G(new v3(aVar, null));
    }

    @Y61.k
    public static final <T> InterfaceC22116k3<T> o() {
        return L3.f38023a;
    }
}
