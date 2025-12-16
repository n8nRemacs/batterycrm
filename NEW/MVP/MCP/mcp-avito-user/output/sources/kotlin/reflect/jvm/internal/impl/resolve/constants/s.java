package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.E;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: constantValues.kt */
/* loaded from: classes8.dex */
public final class s extends g<b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f409603b = new a(null);

    /* compiled from: constantValues.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: constantValues.kt */
    public static abstract class b {

        /* compiled from: constantValues.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final O f409604a;

            public a(@Y61.k O o12) {
                super(null);
                this.f409604a = o12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f409604a, ((a) obj).f409604a);
            }

            public final int hashCode() {
                return this.f409604a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "LocalClass(type=" + this.f409604a + ')';
            }
        }

        /* compiled from: constantValues.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.constants.s$b$b, reason: collision with other inner class name */
        public static final class C11686b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final f f409605a;

            public C11686b(@Y61.k f fVar) {
                super(null);
                this.f409605a = fVar;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C11686b) && L.f(this.f409605a, ((C11686b) obj).f409605a);
            }

            public final int hashCode() {
                return this.f409605a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return "NormalClass(value=" + this.f409605a + ')';
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public s(@Y61.k f fVar) {
        super(new b.C11686b(fVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.constants.g
    @Y61.k
    public final O a(@Y61.k E e12) {
        O oB2;
        n0.f410236c.getClass();
        n0 n0Var = n0.f410237d;
        kotlin.reflect.jvm.internal.impl.builtins.k kVarM = e12.m();
        kVarM.getClass();
        InterfaceC42851d interfaceC42851dI = kVarM.i(n.a.f407361Q.g());
        T t12 = this.f409586a;
        b bVar = (b) t12;
        if (bVar instanceof b.a) {
            oB2 = ((b.a) t12).f409604a;
        } else {
            if (!(bVar instanceof b.C11686b)) {
                throw new NoWhenBranchMatchedException();
            }
            f fVar = ((b.C11686b) t12).f409605a;
            kotlin.reflect.jvm.internal.impl.name.b bVar2 = fVar.f409584a;
            InterfaceC42851d interfaceC42851dA = C42904w.a(e12, bVar2);
            int i12 = fVar.f409585b;
            if (interfaceC42851dA == null) {
                oB2 = kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410153e, bVar2.toString(), String.valueOf(i12));
            } else {
                J0 j0J = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.j(interfaceC42851dA.q());
                for (int i13 = 0; i13 < i12; i13++) {
                    kotlin.reflect.jvm.internal.impl.builtins.k kVarM2 = e12.m();
                    Variance variance = Variance.f410069d;
                    j0J = kVarM2.g(j0J);
                }
                oB2 = j0J;
            }
        }
        List listSingletonList = Collections.singletonList(new z0(oB2));
        P p12 = P.f410039a;
        return P.e(n0Var, interfaceC42851dI.l(), listSingletonList, false, null);
    }

    public s(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar, int i12) {
        this(new f(bVar, i12));
    }
}
