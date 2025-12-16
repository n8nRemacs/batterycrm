package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;

/* compiled from: ReflectionObjectRenderer.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/b0;", "", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final b0 f407078a = new b0();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.renderer.c f407079b = kotlin.reflect.jvm.internal.impl.renderer.b.f409469b;

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KParameter.Kind kind = KParameter.Kind.f406942b;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                KParameter.Kind kind2 = KParameter.Kind.f406942b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: ReflectionObjectRenderer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/k0;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Lkotlin/reflect/jvm/internal/impl/descriptors/k0;)Ljava/lang/CharSequence;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<k0, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f407080l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final CharSequence invoke(k0 k0Var) {
            b0 b0Var = b0.f407078a;
            kotlin.reflect.jvm.internal.impl.types.O type = k0Var.getType();
            b0Var.getClass();
            return b0.f407079b.Y(type);
        }
    }

    public static void a(StringBuilder sb2, CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
        kotlin.reflect.jvm.internal.impl.descriptors.X xP02 = callableMemberDescriptor.F() != null ? ((InterfaceC42851d) callableMemberDescriptor.f()).p0() : null;
        kotlin.reflect.jvm.internal.impl.descriptors.X xH2 = callableMemberDescriptor.H();
        kotlin.reflect.jvm.internal.impl.renderer.c cVar2 = f407079b;
        if (xP02 != null) {
            sb2.append(cVar2.Y(xP02.getType()));
            sb2.append(".");
        }
        boolean z12 = (xP02 == null || xH2 == null) ? false : true;
        if (z12) {
            sb2.append("(");
        }
        if (xH2 != null) {
            sb2.append(cVar2.Y(xH2.getType()));
            sb2.append(".");
        }
        if (z12) {
            sb2.append(")");
        }
    }

    @Y61.k
    public static String b(@Y61.k InterfaceC42905x interfaceC42905x) {
        StringBuilder sbR = androidx.compose.foundation.H.r("fun ");
        f407078a.getClass();
        a(sbR, interfaceC42905x);
        kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42905x.getName();
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = f407079b;
        sbR.append(cVar.Q(name, true));
        C42745f0.N(interfaceC42905x.g(), sbR, ", ", "(", ")", b.f407080l, 48);
        sbR.append(": ");
        sbR.append(cVar.Y(interfaceC42905x.getReturnType()));
        return sbR.toString();
    }

    @Y61.k
    public static String c(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.U u12) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u12.c0() ? "var " : "val ");
        f407078a.getClass();
        a(sb2, u12);
        kotlin.reflect.jvm.internal.impl.name.f name = u12.getName();
        kotlin.reflect.jvm.internal.impl.renderer.c cVar = f407079b;
        sb2.append(cVar.Q(name, true));
        sb2.append(": ");
        sb2.append(cVar.Y(u12.getType()));
        return sb2.toString();
    }
}
