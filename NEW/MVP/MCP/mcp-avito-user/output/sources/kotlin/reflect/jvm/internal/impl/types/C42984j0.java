package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: TypeAliasExpansion.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.j0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42984j0 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final a f410219e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final C42984j0 f410220a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.f0 f410221b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<x0> f410222c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.descriptors.g0, x0> f410223d;

    /* compiled from: TypeAliasExpansion.kt */
    @kotlin.jvm.internal.s0
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static C42984j0 a(@Y61.l C42984j0 c42984j0, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.f0 f0Var, @Y61.k List list) {
            List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters = f0Var.l().getParameters();
            ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.g0) it.next()).n0());
            }
            return new C42984j0(c42984j0, f0Var, list, P0.p(C42745f0.T0(arrayList, list)), null);
        }

        public a() {
        }
    }

    public C42984j0() {
        throw null;
    }

    public C42984j0(C42984j0 c42984j0, kotlin.reflect.jvm.internal.impl.descriptors.f0 f0Var, List list, Map map, C42822w c42822w) {
        this.f410220a = c42984j0;
        this.f410221b = f0Var;
        this.f410222c = list;
        this.f410223d = map;
    }

    public final boolean a(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.f0 f0Var) {
        if (!kotlin.jvm.internal.L.f(this.f410221b, f0Var)) {
            C42984j0 c42984j0 = this.f410220a;
            if (!(c42984j0 != null ? c42984j0.a(f0Var) : false)) {
                return false;
            }
        }
        return true;
    }
}
