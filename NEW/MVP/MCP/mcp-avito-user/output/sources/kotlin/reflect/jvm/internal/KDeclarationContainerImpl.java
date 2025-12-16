package kotlin.reflect.jvm.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: KDeclarationContainerImpl.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/jvm/internal/t;", "<init>", "()V", "a", "b", "MemberBelonginess", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class KDeclarationContainerImpl implements InterfaceC42819t {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f407017b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final Class<?> f407018c = C42822w.class;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C43059p f407019d = new C43059p("<v#(\\d+)>");

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$MemberBelonginess;", "", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class MemberBelonginess {

        /* renamed from: b, reason: collision with root package name */
        public static final MemberBelonginess f407020b;

        /* renamed from: c, reason: collision with root package name */
        public static final MemberBelonginess f407021c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ MemberBelonginess[] f407022d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f407023e;

        static {
            MemberBelonginess memberBelonginess = new MemberBelonginess("DECLARED", 0);
            f407020b = memberBelonginess;
            MemberBelonginess memberBelonginess2 = new MemberBelonginess("INHERITED", 1);
            f407021c = memberBelonginess2;
            MemberBelonginess[] memberBelonginessArr = {memberBelonginess, memberBelonginess2};
            f407022d = memberBelonginessArr;
            f407023e = kotlin.enums.c.a(memberBelonginessArr);
        }

        public MemberBelonginess() {
            throw null;
        }

        public static MemberBelonginess valueOf(String str) {
            return (MemberBelonginess) Enum.valueOf(MemberBelonginess.class, str);
        }

        public static MemberBelonginess[] values() {
            return (MemberBelonginess[]) f407022d.clone();
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0006\u001a\u0012\u0012\u0002\b\u0003 \u0005*\b\u0012\u0002\b\u0003\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$a;", "", "<init>", "()V", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "DEFAULT_CONSTRUCTOR_MARKER", "Ljava/lang/Class;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b¦\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$b;", "", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public abstract class b {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f407024b;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Z.a f407025a;

        /* compiled from: KDeclarationContainerImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/k;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ KDeclarationContainerImpl f407026l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(KDeclarationContainerImpl kDeclarationContainerImpl) {
                super(0);
                this.f407026l = kDeclarationContainerImpl;
            }

            @Override // Y41.a
            public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k invoke() {
                return Y.a(this.f407026l.f());
            }
        }

        static {
            n0 n0Var = m0.f406844a;
            f407024b = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(b.class), "moduleData", "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"))};
        }

        public b(KDeclarationContainerImpl kDeclarationContainerImpl) {
            this.f407025a = Z.a(null, new a(kDeclarationContainerImpl));
        }
    }

    /* compiled from: KDeclarationContainerImpl.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"kotlin/reflect/jvm/internal/KDeclarationContainerImpl$c", "Lkotlin/reflect/jvm/internal/g;", "Lkotlin/reflect/jvm/internal/impl/descriptors/j;", "descriptor", "Lkotlin/G0;", "data", "Lkotlin/reflect/jvm/internal/l;", "visitConstructorDescriptor", "(Lorg/jetbrains/kotlin/descriptors/ConstructorDescriptor;Lkotlin/G0;)Lkotlin/reflect/jvm/internal/l;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends C42845g {
        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.C42872p, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m
        public final Object g(C42866j c42866j, Object obj) {
            throw new IllegalStateException("No constructors should appear here: " + c42866j);
        }
    }

    public static Method r(Class cls, String str, Class[] clsArr, Class cls2, boolean z12) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method methodR;
        if (z12) {
            clsArr[0] = cls;
        }
        Method methodU = u(cls, str, clsArr, cls2);
        if (methodU != null) {
            return methodU;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodR = r(superclass, str, clsArr, cls2, z12)) != null) {
            return methodR;
        }
        Class<?>[] interfaces = cls.getInterfaces();
        int length = interfaces.length;
        int i12 = 0;
        while (true) {
            Class<?> cls3 = null;
            if (i12 >= length) {
                return null;
            }
            Class<?> cls4 = interfaces[i12];
            Method methodR2 = r(cls4, str, clsArr, cls2, z12);
            if (methodR2 != null) {
                return methodR2;
            }
            if (z12) {
                List<kotlin.reflect.d<? extends Object>> list = C42892d.f407849a;
                ClassLoader classLoader = cls4.getClassLoader();
                if (classLoader == null) {
                    classLoader = ClassLoader.getSystemClassLoader();
                }
                try {
                    cls3 = Class.forName(cls4.getName().concat("$DefaultImpls"), false, classLoader);
                } catch (ClassNotFoundException unused) {
                }
                if (cls3 != null) {
                    clsArr[0] = cls4;
                    Method methodU2 = u(cls3, str, clsArr, cls2);
                    if (methodU2 != null) {
                        return methodU2;
                    }
                } else {
                    continue;
                }
            }
            i12++;
        }
    }

    public static Constructor t(Class cls, ArrayList arrayList) {
        try {
            Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method u(Class cls, String str, Class[] clsArr, Class cls2) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (kotlin.jvm.internal.L.f(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            for (Method method : cls.getDeclaredMethods()) {
                if (kotlin.jvm.internal.L.f(method.getName(), str) && kotlin.jvm.internal.L.f(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final void h(String str, ArrayList arrayList, boolean z12) {
        ArrayList arrayListQ = q(str);
        arrayList.addAll(arrayListQ);
        int size = (arrayListQ.size() + 31) / 32;
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(Integer.TYPE);
        }
        if (!z12) {
            arrayList.add(Object.class);
            return;
        }
        Class<?> cls = f407018c;
        arrayList.remove(cls);
        arrayList.add(cls);
    }

    @Y61.l
    public final Method i(@Y61.k String str, @Y61.k String str2) throws NoSuchMethodException, SecurityException, ClassNotFoundException {
        Method methodR;
        if (str.equals("<init>")) {
            return null;
        }
        Class[] clsArr = (Class[]) q(str2).toArray(new Class[0]);
        Class clsS = s(C43066x.H(')', 0, 6, str2) + 1, str2.length(), str2);
        Method methodR2 = r(n(), str, clsArr, clsS, false);
        if (methodR2 != null) {
            return methodR2;
        }
        if (!n().isInterface() || (methodR = r(Object.class, str, clsArr, clsS, false)) == null) {
            return null;
        }
        return methodR;
    }

    @Y61.k
    public abstract Collection<InterfaceC42881j> j();

    @Y61.k
    public abstract Collection<InterfaceC42905x> k(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

    @Y61.l
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.U l(int i12);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<kotlin.reflect.jvm.internal.AbstractC43003l<?>> m(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.j r9, @Y61.k kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r10) {
        /*
            r8 = this;
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c
            r0.<init>(r8)
            r1 = 0
            r2 = 3
            java.util.Collection r9 = kotlin.reflect.jvm.internal.impl.resolve.scopes.m.a.a(r9, r1, r2)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L16:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r9.next()
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = (kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L55
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r6 = kotlin.reflect.jvm.internal.impl.descriptors.r.f407792h
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
            if (r5 != 0) goto L55
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = r4.getKind()
            r4.getClass()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r5 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.f407409c
            r6 = 0
            r7 = 1
            if (r4 == r5) goto L44
            r4 = r7
            goto L45
        L44:
            r4 = r6
        L45:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r5 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.f407020b
            if (r10 != r5) goto L4a
            r6 = r7
        L4a:
            if (r4 != r6) goto L55
            kotlin.G0 r4 = kotlin.G0.f406611a
            java.lang.Object r3 = r3.A(r0, r4)
            kotlin.reflect.jvm.internal.l r3 = (kotlin.reflect.jvm.internal.AbstractC43003l) r3
            goto L56
        L55:
            r3 = r1
        L56:
            if (r3 == 0) goto L16
            r2.add(r3)
            goto L16
        L5c:
            java.util.List r9 = kotlin.collections.C42745f0.M0(r2)
            java.util.Collection r9 = (java.util.Collection) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KDeclarationContainerImpl.m(kotlin.reflect.jvm.internal.impl.resolve.scopes.j, kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess):java.util.Collection");
    }

    @Y61.k
    public Class<?> n() {
        Class<? extends Object> cls = C42892d.f407851c.get(f());
        return cls == null ? f() : cls;
    }

    @Y61.k
    public abstract Collection<kotlin.reflect.jvm.internal.impl.descriptors.U> p(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

    public final ArrayList q(String str) {
        int iH2;
        ArrayList arrayList = new ArrayList();
        int i12 = 1;
        while (str.charAt(i12) != ')') {
            int i13 = i12;
            while (str.charAt(i13) == '[') {
                i13++;
            }
            char cCharAt = str.charAt(i13);
            if (C43066x.r("VZCBSIFJD", cCharAt)) {
                iH2 = i13 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new X("Unknown type prefix in the method signature: ".concat(str));
                }
                iH2 = C43066x.H(';', i12, 4, str) + 1;
            }
            arrayList.add(s(i12, iH2, str));
            i12 = iH2;
        }
        return arrayList;
    }

    public final Class s(int i12, int i13, String str) {
        char cCharAt = str.charAt(i12);
        if (cCharAt == 'L') {
            Class<?> clsF = f();
            List<kotlin.reflect.d<? extends Object>> list = C42892d.f407849a;
            ClassLoader classLoader = clsF.getClassLoader();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            return classLoader.loadClass(str.substring(i12 + 1, i13 - 1).replace('/', '.'));
        }
        if (cCharAt == '[') {
            Class clsS = s(i12 + 1, i13, str);
            kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
            return Array.newInstance((Class<?>) clsS, 0).getClass();
        }
        if (cCharAt == 'V') {
            return Void.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == 'C') {
            return Character.TYPE;
        }
        if (cCharAt == 'B') {
            return Byte.TYPE;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'D') {
            return Double.TYPE;
        }
        throw new X("Unknown type prefix in the method signature: ".concat(str));
    }
}
