package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.w0;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: KTypeParameterImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkotlin/reflect/jvm/internal/V;", "Lkotlin/reflect/s;", "Lkotlin/reflect/jvm/internal/v;", "Lkotlin/reflect/jvm/internal/W;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/g0;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/W;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class V implements kotlin.reflect.s, InterfaceC43012v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407068e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.g0 f407069b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z.a f407070c = Z.a(null, new b());

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final W f407071d;

    /* compiled from: KTypeParameterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
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

    /* compiled from: KTypeParameterImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/jvm/internal/T;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends T>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends T> invoke() {
            List<kotlin.reflect.jvm.internal.impl.types.O> upperBounds = V.this.f407069b.getUpperBounds();
            ArrayList arrayList = new ArrayList(C42745f0.q(upperBounds, 10));
            Iterator<T> it = upperBounds.iterator();
            while (it.hasNext()) {
                arrayList.add(new T((kotlin.reflect.jvm.internal.impl.types.O) it.next(), null, 2, null));
            }
            return arrayList;
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407068e = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(V.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};
    }

    public V(@Y61.l W w12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        Class<?> cls;
        r rVarA;
        Object objA;
        this.f407069b = g0Var;
        if (w12 == null) {
            InterfaceC42882k interfaceC42882kF = g0Var.f();
            if (interfaceC42882kF instanceof InterfaceC42851d) {
                objA = a((InterfaceC42851d) interfaceC42882kF);
            } else {
                if (!(interfaceC42882kF instanceof CallableMemberDescriptor)) {
                    throw new X("Unknown type parameter container: " + interfaceC42882kF);
                }
                InterfaceC42882k interfaceC42882kF2 = ((CallableMemberDescriptor) interfaceC42882kF).f();
                if (interfaceC42882kF2 instanceof InterfaceC42851d) {
                    rVarA = a((InterfaceC42851d) interfaceC42882kF2);
                } else {
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k kVar = interfaceC42882kF instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k ? (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.k) interfaceC42882kF : null;
                    if (kVar == null) {
                        throw new X("Non-class callable descriptor must be deserialized: " + interfaceC42882kF);
                    }
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.j jVarE = kVar.E();
                    kotlin.reflect.jvm.internal.impl.load.kotlin.t tVar = jVarE instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.t ? (kotlin.reflect.jvm.internal.impl.load.kotlin.t) jVarE : null;
                    Object obj = tVar != null ? tVar.f408546d : null;
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f fVar = obj instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) obj : null;
                    if (fVar == null || (cls = fVar.f407809a) == null) {
                        throw new X("Container of deserialized member is not resolved: " + kVar);
                    }
                    rVarA = (r) m0.f406844a.b(cls);
                }
                objA = interfaceC42882kF.A(new C42845g(rVarA), G0.f406611a);
            }
            w12 = (W) objA;
        }
        this.f407071d = w12;
    }

    public static r a(InterfaceC42851d interfaceC42851d) {
        Class<?> clsI = i0.i(interfaceC42851d);
        r rVar = (r) (clsI != null ? m0.f406844a.b(clsI) : null);
        if (rVar != null) {
            return rVar;
        }
        throw new X("Type parameter container is not resolved: " + interfaceC42851d.f());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof V) {
            V v12 = (V) obj;
            if (kotlin.jvm.internal.L.f(this.f407071d, v12.f407071d) && getName().equals(v12.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.InterfaceC43012v
    public final InterfaceC42853f getDescriptor() {
        return this.f407069b;
    }

    @Override // kotlin.reflect.s
    @Y61.k
    public final String getName() {
        return this.f407069b.getName().b();
    }

    @Override // kotlin.reflect.s
    @Y61.k
    public final List<kotlin.reflect.r> getUpperBounds() {
        kotlin.reflect.n<Object> nVar = f407068e[0];
        return (List) this.f407070c.invoke();
    }

    public final int hashCode() {
        return getName().hashCode() + (this.f407071d.hashCode() * 31);
    }

    @Override // kotlin.reflect.s
    @Y61.k
    public final KVariance o() {
        int iOrdinal = this.f407069b.o().ordinal();
        if (iOrdinal == 0) {
            return KVariance.f406947b;
        }
        if (iOrdinal == 1) {
            return KVariance.f406948c;
        }
        if (iOrdinal == 2) {
            return KVariance.f406949d;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Y61.k
    public final String toString() {
        w0.f406858c.getClass();
        return w0.a.a(this);
    }
}
