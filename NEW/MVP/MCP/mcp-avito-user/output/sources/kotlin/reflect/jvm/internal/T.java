package kotlin.reflect.jvm.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.t;

/* compiled from: KTypeImpl.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b²\u0006\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/T;", "Lkotlin/jvm/internal/M;", "Lkotlin/reflect/jvm/internal/impl/types/O;", "type", "Lkotlin/Function0;", "Ljava/lang/reflect/Type;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;LY41/a;)V", "", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class T implements kotlin.jvm.internal.M {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407059f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.O f407060b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final Z.a<Type> f407061c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z.a f407062d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z.a f407063e;

    /* compiled from: KTypeImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/t;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<List<? extends kotlin.reflect.t>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<Type> f407065m;

        /* compiled from: KTypeImpl.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: kotlin.reflect.jvm.internal.T$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C11642a {
            static {
                int[] iArr = new int[Variance.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Variance variance = Variance.f410069d;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    Variance variance2 = Variance.f410069d;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.a<? extends Type> aVar) {
            super(0);
            this.f407065m = aVar;
        }

        @Override // Y41.a
        public final List<? extends kotlin.reflect.t> invoke() {
            kotlin.reflect.t tVarA;
            T t12 = T.this;
            List<x0> listF0 = t12.f407060b.F0();
            if (listF0.isEmpty()) {
                return C42784z0.f406748b;
            }
            InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406615c, new U(t12));
            List<x0> list = listF0;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            int i12 = 0;
            for (Object obj : list) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                x0 x0Var = (x0) obj;
                if (x0Var.c()) {
                    kotlin.reflect.t.f410463c.getClass();
                    tVarA = kotlin.reflect.t.f410464d;
                } else {
                    T t13 = new T(x0Var.getType(), this.f407065m != null ? new S(t12, i12, interfaceC42726CB) : null);
                    int iOrdinal = x0Var.a().ordinal();
                    if (iOrdinal == 0) {
                        kotlin.reflect.t.f410463c.getClass();
                        tVarA = t.a.a(t13);
                    } else if (iOrdinal == 1) {
                        kotlin.reflect.t.f410463c.getClass();
                        tVarA = new kotlin.reflect.t(KVariance.f406948c, t13);
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        kotlin.reflect.t.f410463c.getClass();
                        tVarA = new kotlin.reflect.t(KVariance.f406949d, t13);
                    }
                }
                arrayList.add(tVarA);
                i12 = i13;
            }
            return arrayList;
        }
    }

    /* compiled from: KTypeImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/g;", "invoke", "()Lkotlin/reflect/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.g> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.g invoke() {
            T t12 = T.this;
            return t12.f(t12.f407060b);
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407059f = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(T.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(T.class), "arguments", "getArguments()Ljava/util/List;"))};
    }

    public T(@Y61.k kotlin.reflect.jvm.internal.impl.types.O o12, @Y61.l Y41.a<? extends Type> aVar) {
        this.f407060b = o12;
        Z.a<Type> aVar2 = aVar instanceof Z.a ? (Z.a) aVar : null;
        this.f407061c = aVar2 == null ? aVar != null ? Z.a(null, aVar) : null : aVar2;
        this.f407062d = Z.a(null, new b());
        this.f407063e = Z.a(null, new a(aVar));
    }

    @Override // kotlin.reflect.r
    @Y61.k
    public final List<kotlin.reflect.t> D() {
        kotlin.reflect.n<Object> nVar = f407059f[1];
        return (List) this.f407063e.invoke();
    }

    @Override // kotlin.reflect.r
    @Y61.l
    /* renamed from: K */
    public final kotlin.reflect.g getF406862b() {
        kotlin.reflect.n<Object> nVar = f407059f[0];
        return (kotlin.reflect.g) this.f407062d.invoke();
    }

    @Override // kotlin.reflect.r
    public final boolean d() {
        return this.f407060b.I0();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof T) {
            T t12 = (T) obj;
            if (kotlin.jvm.internal.L.f(this.f407060b, t12.f407060b) && kotlin.jvm.internal.L.f(getF406862b(), t12.getF406862b()) && D().equals(t12.D())) {
                return true;
            }
        }
        return false;
    }

    public final kotlin.reflect.g f(kotlin.reflect.jvm.internal.impl.types.O o12) {
        kotlin.reflect.jvm.internal.impl.types.O type;
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (!(interfaceC42853fB instanceof InterfaceC42851d)) {
            if (interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) {
                return new V(null, (kotlin.reflect.jvm.internal.impl.descriptors.g0) interfaceC42853fB);
            }
            if (interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0) {
                throw new kotlin.G("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class<?> clsI = i0.i((InterfaceC42851d) interfaceC42853fB);
        if (clsI == null) {
            return null;
        }
        if (!clsI.isArray()) {
            if (G0.f(o12)) {
                return new r(clsI);
            }
            Class<? extends Object> cls = C42892d.f407850b.get(clsI);
            if (cls != null) {
                clsI = cls;
            }
            return new r(clsI);
        }
        x0 x0Var = (x0) C42745f0.w0(o12.F0());
        if (x0Var == null || (type = x0Var.getType()) == null) {
            return new r(clsI);
        }
        kotlin.reflect.g gVarF = f(type);
        if (gVarF != null) {
            return new r(Array.newInstance(((InterfaceC42819t) kotlin.reflect.jvm.d.a(gVarF)).f(), 0).getClass());
        }
        throw new X("Cannot determine classifier for array element type: " + this);
    }

    @Override // kotlin.jvm.internal.M
    @Y61.l
    public final Type g() {
        Z.a<Type> aVar = this.f407061c;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f407060b.hashCode() * 31;
        kotlin.reflect.g gVarK = getF406862b();
        return D().hashCode() + ((iHashCode + (gVarK != null ? gVarK.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        b0.f407078a.getClass();
        return b0.f407079b.Y(this.f407060b);
    }

    public /* synthetic */ T(kotlin.reflect.jvm.internal.impl.types.O o12, Y41.a aVar, int i12, C42822w c42822w) {
        this(o12, (i12 & 2) != 0 ? null : aVar);
    }
}
