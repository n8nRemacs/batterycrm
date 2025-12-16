package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes8.dex */
public abstract class s0 extends A0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f410245b = new a(null);

    /* compiled from: TypeSubstitution.kt */
    @kotlin.jvm.internal.s0
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static r0 b(a aVar, Map map) {
            aVar.getClass();
            return new r0(map);
        }

        @X41.n
        @Y61.k
        public final A0 a(@Y61.k q0 q0Var, @Y61.k List<? extends x0> list) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters = q0Var.getParameters();
            kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var = (kotlin.reflect.jvm.internal.impl.descriptors.g0) C42745f0.S(parameters);
            if (g0Var == null || !g0Var.u()) {
                return new L((kotlin.reflect.jvm.internal.impl.descriptors.g0[]) parameters.toArray(new kotlin.reflect.jvm.internal.impl.descriptors.g0[0]), (x0[]) list.toArray(new x0[0]), false, 4, null);
            }
            List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters2 = q0Var.getParameters();
            ArrayList arrayList = new ArrayList(C42745f0.q(parameters2, 10));
            Iterator<T> it = parameters2.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.g0) it.next()).l());
            }
            return new r0(P0.p(C42745f0.T0(arrayList, list)));
        }

        public a() {
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    @Y61.l
    public final x0 d(@Y61.k O o12) {
        return g(o12.H0());
    }

    @Y61.l
    public abstract x0 g(@Y61.k q0 q0Var);
}
