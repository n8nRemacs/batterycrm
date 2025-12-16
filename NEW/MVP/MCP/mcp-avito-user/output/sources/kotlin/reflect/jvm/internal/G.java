package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;

/* compiled from: KParameterImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/G;", "Lkotlin/reflect/KParameter;", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class G implements KParameter {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407003f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AbstractC43003l<?> f407004b;

    /* renamed from: c, reason: collision with root package name */
    public final int f407005c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final KParameter.Kind f407006d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z.a f407007e;

    /* compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/G$a;", "Ljava/lang/reflect/Type;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Type {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Type[] f407008b;

        /* renamed from: c, reason: collision with root package name */
        public final int f407009c;

        public a(@Y61.k Type[] typeArr) {
            this.f407008b = typeArr;
            this.f407009c = Arrays.hashCode(typeArr);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof a) {
                if (Arrays.equals(this.f407008b, ((a) obj).f407008b)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.Type
        @Y61.k
        public final String getTypeName() {
            return C42756l.P(this.f407008b, ", ", "[", "]", null, 56);
        }

        /* renamed from: hashCode, reason: from getter */
        public final int getF407009c() {
            return this.f407009c;
        }

        @Y61.k
        public final String toString() {
            return getTypeName();
        }
    }

    /* compiled from: KParameterImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends Annotation>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends Annotation> invoke() {
            kotlin.reflect.n<Object>[] nVarArr = G.f407003f;
            return i0.d(G.this.h());
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407003f = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(G.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(G.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public G(@Y61.k AbstractC43003l<?> abstractC43003l, int i12, @Y61.k KParameter.Kind kind, @Y61.k Y41.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.Q> aVar) {
        this.f407004b = abstractC43003l;
        this.f407005c = i12;
        this.f407006d = kind;
        this.f407007e = Z.a(null, aVar);
        Z.a(null, new b());
    }

    public static final Type f(G g12, Type... typeArr) {
        g12.getClass();
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) C42756l.Z(typeArr);
        }
        throw new X41.r("Expected at least 1 type for compound type");
    }

    @Override // kotlin.reflect.KParameter
    public final boolean a() {
        kotlin.reflect.jvm.internal.impl.descriptors.Q qH2 = h();
        return (qH2 instanceof k0) && ((k0) qH2).S() != null;
    }

    @Override // kotlin.reflect.KParameter
    public final boolean b() {
        kotlin.reflect.jvm.internal.impl.descriptors.Q qH2 = h();
        k0 k0Var = qH2 instanceof k0 ? (k0) qH2 : null;
        if (k0Var != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.a(k0Var);
        }
        return false;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof G) {
            G g12 = (G) obj;
            if (kotlin.jvm.internal.L.f(this.f407004b, g12.f407004b)) {
                if (this.f407005c == g12.f407005c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    /* renamed from: getIndex, reason: from getter */
    public final int getF407005c() {
        return this.f407005c;
    }

    @Override // kotlin.reflect.KParameter
    @Y61.k
    /* renamed from: getKind, reason: from getter */
    public final KParameter.Kind getF407006d() {
        return this.f407006d;
    }

    @Override // kotlin.reflect.KParameter
    @Y61.l
    public final String getName() {
        kotlin.reflect.jvm.internal.impl.descriptors.Q qH2 = h();
        k0 k0Var = qH2 instanceof k0 ? (k0) qH2 : null;
        if (k0Var == null || k0Var.f().K()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.name.f name = k0Var.getName();
        if (name.f409253c) {
            return null;
        }
        return name.b();
    }

    @Override // kotlin.reflect.KParameter
    @Y61.k
    public final T getType() {
        return new T(h().getType(), new H(this));
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.Q h() {
        kotlin.reflect.n<Object> nVar = f407003f[0];
        return (kotlin.reflect.jvm.internal.impl.descriptors.Q) this.f407007e.invoke();
    }

    public final int hashCode() {
        return Integer.hashCode(this.f407005c) + (this.f407004b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        String strB;
        b0.f407078a.getClass();
        StringBuilder sb2 = new StringBuilder();
        int iOrdinal = this.f407006d.ordinal();
        if (iOrdinal == 0) {
            sb2.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb2.append("extension receiver parameter");
        } else if (iOrdinal == 2) {
            sb2.append("parameter #" + this.f407005c + ' ' + getName());
        }
        sb2.append(" of ");
        CallableMemberDescriptor callableMemberDescriptorN = this.f407004b.n();
        if (callableMemberDescriptorN instanceof kotlin.reflect.jvm.internal.impl.descriptors.U) {
            strB = b0.c((kotlin.reflect.jvm.internal.impl.descriptors.U) callableMemberDescriptorN);
        } else {
            if (!(callableMemberDescriptorN instanceof InterfaceC42905x)) {
                throw new IllegalStateException(("Illegal callable: " + callableMemberDescriptorN).toString());
            }
            strB = b0.b((InterfaceC42905x) callableMemberDescriptorN);
        }
        sb2.append(strB);
        return sb2.toString();
    }
}
