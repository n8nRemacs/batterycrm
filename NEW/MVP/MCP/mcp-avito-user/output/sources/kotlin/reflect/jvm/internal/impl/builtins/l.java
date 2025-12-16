package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.H;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.G;

/* compiled from: ReflectionTypes.kt */
@s0
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final b f407322d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407323e;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f407324a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f407325b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f407326c = new a();

    /* compiled from: ReflectionTypes.kt */
    public static final class a {
    }

    /* compiled from: ReflectionTypes.kt */
    @s0
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407323e = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(l.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new h0(n0Var.b(l.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new h0(n0Var.b(l.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new h0(n0Var.b(l.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new h0(n0Var.b(l.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new h0(n0Var.b(l.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new h0(n0Var.b(l.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), n0Var.i(new h0(n0Var.b(l.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
        f407322d = new b(null);
    }

    public l(@Y61.k G g12, @Y61.k H h12) {
        this.f407324a = h12;
        this.f407325b = C42727D.b(LazyThreadSafetyMode.f406615c, new m(g12));
    }
}
