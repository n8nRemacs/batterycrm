package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import f51.InterfaceC40235a;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;

/* compiled from: JvmBuiltIns.kt */
@s0
/* loaded from: classes8.dex */
public final class JvmBuiltIns extends kotlin.reflect.jvm.internal.impl.builtins.k {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407228i;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Y41.a<a> f407229g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407230h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JvmBuiltIns.kt */
    public static final class Kind {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Kind[] f407231b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f407232c;

        static {
            Kind[] kindArr = {new Kind("FROM_DEPENDENCIES", 0), new Kind("FROM_CLASS_LOADER", 1), new Kind("FALLBACK", 2)};
            f407231b = kindArr;
            f407232c = kotlin.enums.c.a(kindArr);
        }

        public Kind() {
            throw null;
        }

        public static Kind valueOf(String str) {
            return (Kind) Enum.valueOf(Kind.class, str);
        }

        public static Kind[] values() {
            return (Kind[]) f407231b.clone();
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final G f407233a;

        public a(@Y61.k G g12) {
            this.f407233a = g12;
        }
    }

    /* compiled from: JvmBuiltIns.kt */
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[Kind.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Kind[] kindArr = Kind.f407231b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Kind[] kindArr2 = Kind.f407231b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407228i = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(JvmBuiltIns.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmBuiltIns(@Y61.k kotlin.reflect.jvm.internal.impl.storage.f fVar) {
        super(fVar);
        Kind[] kindArr = Kind.f407231b;
        this.f407230h = fVar.g(new h(this, fVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final l J() {
        kotlin.reflect.n<Object> nVar = f407228i[0];
        return (l) this.f407230h.invoke();
    }

    public final void K(@Y61.k G g12) {
        this.f407229g = new i(g12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.k
    @Y61.k
    public final InterfaceC40235a d() {
        return J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.k
    public final Iterable l() {
        return C42745f0.g0(super.l(), new e(this.f407316e, k(), null, 4, null));
    }

    @Override // kotlin.reflect.jvm.internal.impl.builtins.k
    @Y61.k
    public final f51.c o() {
        return J();
    }
}
