package kotlin.reflect.jvm.internal.impl.resolve.calls.inference;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.L;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.T;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: CapturedTypeConstructor.kt */
@s0
/* loaded from: classes8.dex */
public final class d {

    /* compiled from: CapturedTypeConstructor.kt */
    public static final class a extends N implements Y41.a<O> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ x0 f409582l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x0 x0Var) {
            super(0);
            this.f409582l = x0Var;
        }

        @Override // Y41.a
        public final O invoke() {
            return this.f409582l.getType();
        }
    }

    public static final x0 a(x0 x0Var, g0 g0Var) {
        return (g0Var == null || x0Var.a() == Variance.f410069d) ? x0Var : g0Var.o() == x0Var.a() ? x0Var.c() ? new z0(new T(f.f409976e, new a(x0Var))) : new z0(x0Var.getType()) : new z0(new kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a(x0Var, null, false, null, 14, null));
    }

    public static A0 b(A0 a02) {
        if (!(a02 instanceof L)) {
            return new e(a02);
        }
        L l12 = (L) a02;
        x0[] x0VarArr = l12.f410029c;
        g0[] g0VarArr = l12.f410028b;
        ArrayList arrayListN0 = C42756l.n0(x0VarArr, g0VarArr);
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListN0, 10));
        Iterator it = arrayListN0.iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            arrayList.add(a((x0) q12.f406619b, (g0) q12.f406620c));
        }
        return new L(g0VarArr, (x0[]) arrayList.toArray(new x0[0]), true);
    }
}
