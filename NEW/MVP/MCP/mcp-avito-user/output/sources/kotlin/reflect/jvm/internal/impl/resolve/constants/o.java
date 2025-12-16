package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.C0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: IntegerLiteralTypeConstructor.kt */
@s0
/* loaded from: classes8.dex */
public final class o implements q0 {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f409593f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f409594a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final E f409595b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Set<O> f409596c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Y f409597d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f409598e;

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    @s0
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: IntegerLiteralTypeConstructor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.o$a$a, reason: collision with other inner class name */
        public static final class EnumC11685a {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ EnumC11685a[] f409599b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f409600c;

            static {
                EnumC11685a[] enumC11685aArr = {new EnumC11685a("COMMON_SUPER_TYPE", 0), new EnumC11685a("INTERSECTION_TYPE", 1)};
                f409599b = enumC11685aArr;
                f409600c = kotlin.enums.c.a(enumC11685aArr);
            }

            public EnumC11685a() {
                throw null;
            }

            public static EnumC11685a valueOf(String str) {
                return (EnumC11685a) Enum.valueOf(EnumC11685a.class, str);
            }

            public static EnumC11685a[] values() {
                return (EnumC11685a[]) f409599b.clone();
            }
        }

        /* compiled from: IntegerLiteralTypeConstructor.kt */
        public /* synthetic */ class b {
            static {
                int[] iArr = new int[EnumC11685a.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    EnumC11685a[] enumC11685aArr = EnumC11685a.f409599b;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v16, types: [kotlin.reflect.jvm.internal.impl.types.Y] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.O, kotlin.reflect.jvm.internal.impl.types.Y] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        @Y61.l
        public static Y a(@Y61.k ArrayList arrayList) {
            EnumC11685a[] enumC11685aArr = EnumC11685a.f409599b;
            if (arrayList.isEmpty()) {
                return null;
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Y next = it.next();
            while (it.hasNext()) {
                Y y12 = (Y) it.next();
                next = next;
                o.f409593f.getClass();
                if (next != 0 && y12 != null) {
                    q0 q0VarH0 = next.H0();
                    q0 q0VarH02 = y12.H0();
                    boolean z12 = q0VarH0 instanceof o;
                    if (z12 && (q0VarH02 instanceof o)) {
                        o oVar = (o) q0VarH0;
                        Set<O> set = oVar.f409596c;
                        Set<O> set2 = ((o) q0VarH02).f409596c;
                        LinkedHashSet linkedHashSetO0 = C42745f0.O0(set);
                        C42745f0.h(set2, linkedHashSetO0);
                        o oVar2 = new o(oVar.f409594a, oVar.f409595b, linkedHashSetO0, null);
                        n0.f410236c.getClass();
                        n0 n0Var = n0.f410237d;
                        P p12 = P.f410039a;
                        next = P.f(C42784z0.f406748b, kotlin.reflect.jvm.internal.impl.types.error.h.a(ErrorScopeKind.f410137d, true, "unknown integer literal type"), n0Var, oVar2, false);
                    } else if (z12) {
                        if (!((o) q0VarH0).f409596c.contains(y12)) {
                            y12 = null;
                        }
                        next = y12;
                    } else if (!(q0VarH02 instanceof o) || !((o) q0VarH02).f409596c.contains(next)) {
                    }
                }
                next = 0;
            }
            return next;
        }

        public a() {
        }
    }

    /* compiled from: IntegerLiteralTypeConstructor.kt */
    public static final class b extends N implements Y41.a<List<Y>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<Y> invoke() {
            o oVar = o.this;
            E e12 = oVar.f409595b;
            ArrayList arrayListE0 = C42745f0.e0(C0.d(e12.m().j("Comparable").q(), Collections.singletonList(new z0(oVar.f409597d, Variance.f410070e)), null, 2));
            kotlin.reflect.jvm.internal.impl.builtins.k kVarM = e12.m();
            kVarM.getClass();
            Y yR2 = kVarM.r(PrimitiveType.f407164k);
            if (yR2 == null) {
                kotlin.reflect.jvm.internal.impl.builtins.k.a(59);
                throw null;
            }
            kotlin.reflect.jvm.internal.impl.builtins.k kVarM2 = e12.m();
            kVarM2.getClass();
            Y yR3 = kVarM2.r(PrimitiveType.f407166m);
            if (yR3 == null) {
                kotlin.reflect.jvm.internal.impl.builtins.k.a(60);
                throw null;
            }
            kotlin.reflect.jvm.internal.impl.builtins.k kVarM3 = e12.m();
            kVarM3.getClass();
            Y yR4 = kVarM3.r(PrimitiveType.f407162i);
            if (yR4 == null) {
                kotlin.reflect.jvm.internal.impl.builtins.k.a(57);
                throw null;
            }
            kotlin.reflect.jvm.internal.impl.builtins.k kVarM4 = e12.m();
            kVarM4.getClass();
            Y yR5 = kVarM4.r(PrimitiveType.f407163j);
            if (yR5 == null) {
                kotlin.reflect.jvm.internal.impl.builtins.k.a(58);
                throw null;
            }
            List listU = C42745f0.U(yR2, yR3, yR4, yR5);
            if (!(listU instanceof Collection) || !listU.isEmpty()) {
                Iterator it = listU.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (oVar.f409596c.contains((O) it.next())) {
                        Y yQ2 = e12.m().j("Number").q();
                        if (yQ2 == null) {
                            kotlin.reflect.jvm.internal.impl.builtins.k.a(56);
                            throw null;
                        }
                        arrayListE0.add(yQ2);
                    }
                }
            }
            return arrayListE0;
        }
    }

    public o() {
        throw null;
    }

    public o(long j12, E e12, Set set, C42822w c42822w) {
        n0.f410236c.getClass();
        n0 n0Var = n0.f410237d;
        P p12 = P.f410039a;
        this.f409597d = P.f(C42784z0.f406748b, kotlin.reflect.jvm.internal.impl.types.error.h.a(ErrorScopeKind.f410137d, true, "unknown integer literal type"), n0Var, this, false);
        this.f409598e = C42727D.c(new b());
        this.f409594a = j12;
        this.f409595b = e12;
        this.f409596c = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final Collection<O> C() {
        return (List) this.f409598e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.l
    public final InterfaceC42853f b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final boolean c() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final List<g0> getParameters() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        return this.f409595b.m();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntegerLiteralType");
        sb2.append("[" + C42745f0.O(this.f409596c, ",", null, null, p.f409602l, 30) + ']');
        return sb2.toString();
    }
}
