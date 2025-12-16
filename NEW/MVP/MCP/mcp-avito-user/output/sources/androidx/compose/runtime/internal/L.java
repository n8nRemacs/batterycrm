package androidx.compose.runtime.internal;

import android.os.Trace;
import androidx.collection.C20247y0;
import androidx.collection.R0;
import androidx.collection.S0;
import androidx.collection.j1;
import androidx.compose.runtime.A2;
import androidx.compose.runtime.B2;
import androidx.compose.runtime.C2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.InterfaceC22198x;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: RememberEventDispatcher.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/internal/L;", "Landroidx/compose/runtime/A2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L implements A2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Set<B2> f38428a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<C2> f38429b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public androidx.compose.runtime.collection.e<C2> f38430c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<Object> f38431d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<Y41.a<G0>> f38432e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public S0<InterfaceC22198x> f38433f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public R0<C22039c2, I> f38434g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ArrayList f38435h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C20247y0 f38436i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C20247y0 f38437j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public ArrayList f38438k;

    public L(@Y61.k Set<B2> set) {
        this.f38428a = set;
        androidx.compose.runtime.collection.e<C2> eVar = new androidx.compose.runtime.collection.e<>(new C2[16], 0);
        this.f38429b = eVar;
        this.f38430c = eVar;
        this.f38431d = new androidx.compose.runtime.collection.e<>(new Object[16], 0);
        this.f38432e = new androidx.compose.runtime.collection.e<>(new Y41.a[16], 0);
        this.f38435h = new ArrayList();
        this.f38436i = new C20247y0(0, 1, null);
        this.f38437j = new C20247y0(0, 1, null);
    }

    public final void a() {
        Set<B2> set = this.f38428a;
        if (set.isEmpty()) {
            return;
        }
        U.f38447a.getClass();
        Trace.beginSection("Compose:abandons");
        try {
            Iterator<B2> it = set.iterator();
            while (it.hasNext()) {
                B2 next = it.next();
                it.remove();
                next.b();
            }
            G0 g02 = G0.f406611a;
            U.f38447a.getClass();
            Trace.endSection();
        } catch (Throwable th2) {
            U.f38447a.getClass();
            Trace.endSection();
            throw th2;
        }
    }

    public final void b() {
        d(BeduinInputModel.MIN_TEXT_VERSION);
        androidx.compose.runtime.collection.e<Object> eVar = this.f38431d;
        int i12 = eVar.f38262d;
        Set<B2> set = this.f38428a;
        if (i12 != 0) {
            U.f38447a.getClass();
            Trace.beginSection("Compose:onForgotten");
            try {
                j1 j1Var = this.f38433f;
                for (int i13 = eVar.f38262d - 1; -1 < i13; i13--) {
                    Object obj = eVar.f38260b[i13];
                    if (obj instanceof C2) {
                        B2 b22 = ((C2) obj).f37941a;
                        set.remove(b22);
                        b22.e();
                    }
                    if (obj instanceof InterfaceC22198x) {
                        if (j1Var == null || !j1Var.b(obj)) {
                            ((InterfaceC22198x) obj).i();
                        } else {
                            ((InterfaceC22198x) obj).c();
                        }
                    }
                }
                G0 g02 = G0.f406611a;
            } finally {
            }
        }
        androidx.compose.runtime.collection.e<C2> eVar2 = this.f38429b;
        if (eVar2.f38262d != 0) {
            U.f38447a.getClass();
            Trace.beginSection("Compose:onRemembered");
            try {
                C2[] c2Arr = eVar2.f38260b;
                int i14 = eVar2.f38262d;
                for (int i15 = 0; i15 < i14; i15++) {
                    B2 b23 = c2Arr[i15].f37941a;
                    set.remove(b23);
                    b23.c();
                }
                G0 g03 = G0.f406611a;
            } finally {
                U.f38447a.getClass();
                Trace.endSection();
            }
        }
    }

    public final void c() {
        androidx.compose.runtime.collection.e<Y41.a<G0>> eVar = this.f38432e;
        if (eVar.f38262d != 0) {
            U.f38447a.getClass();
            Trace.beginSection("Compose:sideeffects");
            try {
                Y41.a<G0>[] aVarArr = eVar.f38260b;
                int i12 = eVar.f38262d;
                for (int i13 = 0; i13 < i12; i13++) {
                    aVarArr[i13].invoke();
                }
                eVar.g();
                G0 g02 = G0.f406611a;
                U.f38447a.getClass();
                Trace.endSection();
            } catch (Throwable th2) {
                U.f38447a.getClass();
                Trace.endSection();
                throw th2;
            }
        }
    }

    public final void d(int i12) {
        ArrayList arrayList = this.f38435h;
        if (arrayList.isEmpty()) {
            return;
        }
        int i13 = 0;
        int i14 = 0;
        ArrayList arrayListE0 = null;
        C20247y0 c20247y0 = null;
        C20247y0 c20247y02 = null;
        while (true) {
            C20247y0 c20247y03 = this.f38437j;
            if (i14 >= c20247y03.f25545b) {
                break;
            }
            if (i12 <= c20247y03.a(i14)) {
                Object objRemove = arrayList.remove(i14);
                int iF2 = c20247y03.f(i14);
                int iF3 = this.f38436i.f(i14);
                if (arrayListE0 == null) {
                    arrayListE0 = C42745f0.e0(objRemove);
                    c20247y02 = new C20247y0(0, 1, null);
                    c20247y02.d(iF2);
                    c20247y0 = new C20247y0(0, 1, null);
                    c20247y0.d(iF3);
                } else {
                    arrayListE0.add(objRemove);
                    c20247y02.d(iF2);
                    c20247y0.d(iF3);
                }
            } else {
                i14++;
            }
        }
        if (arrayListE0 != null) {
            int size = arrayListE0.size() - 1;
            while (i13 < size) {
                int i15 = i13 + 1;
                int size2 = arrayListE0.size();
                for (int i16 = i15; i16 < size2; i16++) {
                    int iA2 = c20247y02.a(i13);
                    int iA3 = c20247y02.a(i16);
                    if (iA2 < iA3 || (iA3 == iA2 && c20247y0.a(i13) < c20247y0.a(i16))) {
                        Object obj = arrayListE0.get(i13);
                        arrayListE0.set(i13, arrayListE0.get(i16));
                        arrayListE0.set(i16, obj);
                        int iA4 = c20247y0.a(i13);
                        c20247y0.g(i13, c20247y0.a(i16));
                        c20247y0.g(i16, iA4);
                        int iA5 = c20247y02.a(i13);
                        c20247y02.g(i13, c20247y02.a(i16));
                        c20247y02.g(i16, iA5);
                    }
                }
                i13 = i15;
            }
            androidx.compose.runtime.collection.e<Object> eVar = this.f38431d;
            eVar.d(eVar.f38262d, arrayListE0);
        }
    }

    public final void e(Object obj, int i12, int i13, int i14) {
        d(i12);
        if (i14 < 0 || i14 >= i12) {
            this.f38431d.b(obj);
            return;
        }
        this.f38435h.add(obj);
        this.f38436i.d(i13);
        this.f38437j.d(i14);
    }

    public final void f(@Y61.k C2 c22) {
        this.f38430c.b(c22);
    }
}
