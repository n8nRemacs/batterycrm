package androidx.compose.runtime.internal;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22034b2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22194w;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ComposableLambda.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Object f38478a = new Object();

    public static final int a(int i12, int i13) {
        return i12 << (((i13 % 10) * 3) + 1);
    }

    @InterfaceC22194w
    @Y61.k
    public static final C22096n b(@Y61.k androidx.compose.runtime.A a12, int i12, @Y61.k InterfaceC43072x interfaceC43072x) {
        C22096n c22096n;
        a12.K(Integer.rotateLeft(i12, 1), f38478a);
        Object objT = a12.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            c22096n = new C22096n(i12, interfaceC43072x, true);
            a12.H(c22096n);
        } else {
            c22096n = (C22096n) objT;
            c22096n.m(interfaceC43072x);
        }
        a12.N();
        return c22096n;
    }

    @InterfaceC22132o
    @InterfaceC22194w
    @Y61.k
    public static final C22096n c(int i12, @Y61.k kotlin.jvm.internal.N n12, @Y61.l androidx.compose.runtime.A a12) {
        Object objT = a12.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new C22096n(i12, n12, true);
            a12.H(objT);
        }
        C22096n c22096n = (C22096n) objT;
        c22096n.m(n12);
        return c22096n;
    }

    public static final boolean d(@Y61.l InterfaceC22034b2 interfaceC22034b2, @Y61.k InterfaceC22034b2 interfaceC22034b22) {
        if (interfaceC22034b2 != null) {
            if ((interfaceC22034b2 instanceof C22039c2) && (interfaceC22034b22 instanceof C22039c2)) {
                C22039c2 c22039c2 = (C22039c2) interfaceC22034b2;
                if (!c22039c2.a() || interfaceC22034b2.equals(interfaceC22034b22) || kotlin.jvm.internal.L.f(c22039c2.f38183c, ((C22039c2) interfaceC22034b22).f38183c)) {
                }
            }
            return false;
        }
        return true;
    }
}
