package kotlin.reflect.jvm.internal;

import androidx.media3.common.C23088b;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.AbstractC42817q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.AbstractC43001j;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.f;
import kotlin.reflect.jvm.internal.calls.j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.text.C43066x;
import m51.C43888b;
import m51.d;

/* compiled from: KFunctionImpl.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB7\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/reflect/jvm/internal/A;", "Lkotlin/reflect/jvm/internal/l;", "", "Lkotlin/reflect/i;", "Lkotlin/jvm/internal/E;", "Lkotlin/reflect/jvm/internal/i;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/x;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "", "name", "signature", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class A extends AbstractC43003l<Object> implements kotlin.jvm.internal.E<Object>, kotlin.reflect.i<Object>, InterfaceC42847i {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f406966n;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final KDeclarationContainerImpl f406967h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f406968i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Object f406969j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Z.a f406970k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final Object f406971l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final Object f406972m;

    /* compiled from: KFunctionImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Executable;", "invoke", "()Lkotlin/reflect/jvm/internal/calls/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.calls.e<? extends Executable>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.calls.e<? extends Executable> invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            Object objI;
            kotlin.reflect.jvm.internal.calls.f aVar;
            d0 d0Var = d0.f407150a;
            A a12 = A.this;
            InterfaceC42905x interfaceC42905xN = a12.n();
            d0Var.getClass();
            AbstractC43001j abstractC43001jC = d0.c(interfaceC42905xN);
            boolean z12 = abstractC43001jC instanceof AbstractC43001j.d;
            KDeclarationContainerImpl kDeclarationContainerImpl = a12.f406967h;
            if (z12) {
                if (a12.p()) {
                    Class<?> clsF = kDeclarationContainerImpl.f();
                    List<KParameter> parameters = a12.getParameters();
                    ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((KParameter) it.next()).getName());
                    }
                    return new AnnotationConstructorCaller(clsF, arrayList, AnnotationConstructorCaller.CallMode.f407100c, AnnotationConstructorCaller.Origin.f407104c, null, 16, null);
                }
                objI = KDeclarationContainerImpl.t(kDeclarationContainerImpl.f(), kDeclarationContainerImpl.q(((AbstractC43001j.d) abstractC43001jC).f410378a.f414318b));
            } else if (abstractC43001jC instanceof AbstractC43001j.e) {
                InterfaceC42905x interfaceC42905xN2 = a12.n();
                if (kotlin.reflect.jvm.internal.impl.resolve.k.c(interfaceC42905xN2.f()) && (interfaceC42905xN2 instanceof InterfaceC42881j) && ((InterfaceC42881j) interfaceC42905xN2).J()) {
                    return new j.b(a12.n(), kDeclarationContainerImpl, ((AbstractC43001j.e) abstractC43001jC).f410380a.f414318b, a12.n().g());
                }
                d.b bVar = ((AbstractC43001j.e) abstractC43001jC).f410380a;
                objI = kDeclarationContainerImpl.i(bVar.f414317a, bVar.f414318b);
            } else if (abstractC43001jC instanceof AbstractC43001j.c) {
                objI = ((AbstractC43001j.c) abstractC43001jC).f410377a;
            } else {
                if (!(abstractC43001jC instanceof AbstractC43001j.b)) {
                    if (!(abstractC43001jC instanceof AbstractC43001j.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Class<?> clsF2 = kDeclarationContainerImpl.f();
                    List<Method> list = ((AbstractC43001j.a) abstractC43001jC).f410373a;
                    List<Method> list2 = list;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                    Iterator<T> it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(clsF2, arrayList2, AnnotationConstructorCaller.CallMode.f407100c, AnnotationConstructorCaller.Origin.f407103b, list);
                }
                objI = ((AbstractC43001j.b) abstractC43001jC).f410375a;
            }
            if (objI instanceof Constructor) {
                aVar = A.r(a12, (Constructor) objI, a12.n(), false);
            } else {
                if (!(objI instanceof Method)) {
                    throw new X("Could not compute caller for function: " + a12.n() + " (member = " + objI + ')');
                }
                Method method = (Method) objI;
                boolean zIsStatic = Modifier.isStatic(method.getModifiers());
                Object obj = a12.f406969j;
                aVar = !zIsStatic ? a12.q() ? new f.h.a(kotlin.reflect.jvm.internal.calls.l.a(obj, a12.n()), method) : new f.h.e(method) : a12.n().getAnnotations().F(i0.f407157a) != null ? a12.q() ? new f.h.b(method) : new f.h.C11646f(method) : a12.q() ? new f.h.c(kotlin.reflect.jvm.internal.calls.l.a(obj, a12.n()), method) : new f.h.g(method);
            }
            return kotlin.reflect.jvm.internal.calls.l.b(aVar, a12.n(), false);
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/e;", "Ljava/lang/reflect/Executable;", "invoke", "()Lkotlin/reflect/jvm/internal/calls/e;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.calls.e<? extends Executable>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.calls.e<? extends Executable> invoke() throws NoSuchMethodException, SecurityException, ClassNotFoundException {
            GenericDeclaration genericDeclarationT;
            kotlin.reflect.jvm.internal.calls.f fVarR;
            kotlin.reflect.jvm.internal.calls.f cVar;
            d0 d0Var = d0.f407150a;
            A a12 = A.this;
            InterfaceC42905x interfaceC42905xN = a12.n();
            d0Var.getClass();
            AbstractC43001j abstractC43001jC = d0.c(interfaceC42905xN);
            boolean z12 = abstractC43001jC instanceof AbstractC43001j.e;
            KDeclarationContainerImpl kDeclarationContainerImpl = a12.f406967h;
            if (z12) {
                InterfaceC42905x interfaceC42905xN2 = a12.n();
                if (kotlin.reflect.jvm.internal.impl.resolve.k.c(interfaceC42905xN2.f()) && (interfaceC42905xN2 instanceof InterfaceC42881j) && ((InterfaceC42881j) interfaceC42905xN2).J()) {
                    throw new X(a12.n().f() + " cannot have default arguments");
                }
                d.b bVar = ((AbstractC43001j.e) abstractC43001jC).f410380a;
                String str = bVar.f414317a;
                boolean zIsStatic = Modifier.isStatic(a12.j().b().getModifiers());
                boolean z13 = !zIsStatic;
                kDeclarationContainerImpl.getClass();
                if (str.equals("<init>")) {
                    genericDeclarationT = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    if (!zIsStatic) {
                        arrayList.add(kDeclarationContainerImpl.f());
                    }
                    String str2 = bVar.f414318b;
                    kDeclarationContainerImpl.h(str2, arrayList, false);
                    genericDeclarationT = KDeclarationContainerImpl.r(kDeclarationContainerImpl.n(), str.concat("$default"), (Class[]) arrayList.toArray(new Class[0]), kDeclarationContainerImpl.s(C43066x.H(')', 0, 6, str2) + 1, str2.length(), str2), z13);
                }
            } else if (!(abstractC43001jC instanceof AbstractC43001j.d)) {
                if (abstractC43001jC instanceof AbstractC43001j.a) {
                    Class<?> clsF = kDeclarationContainerImpl.f();
                    List<Method> list = ((AbstractC43001j.a) abstractC43001jC).f410373a;
                    List<Method> list2 = list;
                    ArrayList arrayList2 = new ArrayList(C42745f0.q(list2, 10));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((Method) it.next()).getName());
                    }
                    return new AnnotationConstructorCaller(clsF, arrayList2, AnnotationConstructorCaller.CallMode.f407099b, AnnotationConstructorCaller.Origin.f407103b, list);
                }
                genericDeclarationT = null;
            } else {
                if (a12.p()) {
                    Class<?> clsF2 = kDeclarationContainerImpl.f();
                    List<KParameter> parameters = a12.getParameters();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(parameters, 10));
                    Iterator<T> it2 = parameters.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((KParameter) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(clsF2, arrayList3, AnnotationConstructorCaller.CallMode.f407099b, AnnotationConstructorCaller.Origin.f407104c, null, 16, null);
                }
                String str3 = ((AbstractC43001j.d) abstractC43001jC).f410378a.f414318b;
                Class<?> clsF3 = kDeclarationContainerImpl.f();
                ArrayList arrayList4 = new ArrayList();
                kDeclarationContainerImpl.h(str3, arrayList4, true);
                G0 g02 = G0.f406611a;
                genericDeclarationT = KDeclarationContainerImpl.t(clsF3, arrayList4);
            }
            if (genericDeclarationT instanceof Constructor) {
                fVarR = A.r(a12, (Constructor) genericDeclarationT, a12.n(), true);
            } else if (genericDeclarationT instanceof Method) {
                if (a12.n().getAnnotations().F(i0.f407157a) == null || ((InterfaceC42851d) a12.n().f()).v0()) {
                    Method method = (Method) genericDeclarationT;
                    cVar = a12.q() ? new f.h.c(kotlin.reflect.jvm.internal.calls.l.a(a12.f406969j, a12.n()), method) : new f.h.g(method);
                } else {
                    Method method2 = (Method) genericDeclarationT;
                    cVar = a12.q() ? new f.h.b(method2) : new f.h.C11646f(method2);
                }
                fVarR = cVar;
            } else {
                fVarR = null;
            }
            return fVarR != null ? kotlin.reflect.jvm.internal.calls.l.b(fVarR, a12.n(), true) : null;
        }
    }

    /* compiled from: KFunctionImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/x;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/x;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<InterfaceC42905x> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f406976m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f406976m = str;
        }

        @Override // Y41.a
        public final InterfaceC42905x invoke() {
            List listK;
            ArrayList arrayList;
            String strA;
            A a12 = A.this;
            KDeclarationContainerImpl kDeclarationContainerImpl = a12.f406967h;
            kDeclarationContainerImpl.getClass();
            String str = this.f406976m;
            boolean zEquals = str.equals("<init>");
            String str2 = a12.f406968i;
            if (zEquals) {
                listK = C42745f0.M0(kDeclarationContainerImpl.j());
                arrayList = new ArrayList();
                for (Object obj : listK) {
                    InterfaceC42881j interfaceC42881j = (InterfaceC42881j) obj;
                    if (interfaceC42881j.J() && kotlin.reflect.jvm.internal.impl.resolve.k.c(interfaceC42881j.f())) {
                        d0.f407150a.getClass();
                        String strA2 = d0.c(interfaceC42881j).getF410381b();
                        if (!C43066x.h0(strA2, "constructor-impl", false) || !C43066x.z(strA2, ")V", false)) {
                            throw new IllegalArgumentException(("Invalid signature of " + interfaceC42881j + ": " + strA2).toString());
                        }
                        strA = C43066x.X("V", strA2) + C43888b.b(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(interfaceC42881j.f()).c());
                    } else {
                        d0.f407150a.getClass();
                        strA = d0.c(interfaceC42881j).getF410381b();
                    }
                    if (kotlin.jvm.internal.L.f(strA, str2)) {
                        arrayList.add(obj);
                    }
                }
            } else {
                listK = kDeclarationContainerImpl.k(kotlin.reflect.jvm.internal.impl.name.f.e(str));
                arrayList = new ArrayList();
                for (Object obj2 : listK) {
                    d0.f407150a.getClass();
                    if (kotlin.jvm.internal.L.f(d0.c((InterfaceC42905x) obj2).getF410381b(), str2)) {
                        arrayList.add(obj2);
                    }
                }
            }
            if (arrayList.size() == 1) {
                return (InterfaceC42905x) C42745f0.u0(arrayList);
            }
            String strO = C42745f0.O(listK, "\n", null, null, C43014x.f410460l, 30);
            StringBuilder sbB = C23088b.b("Function '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbB.append(kDeclarationContainerImpl);
            sbB.append(':');
            sbB.append(strO.length() == 0 ? " no members found" : "\n".concat(strO));
            throw new X(sbB.toString());
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f406966n = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(A.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};
    }

    public /* synthetic */ A(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC42905x interfaceC42905x, Object obj, int i12, C42822w c42822w) {
        this(kDeclarationContainerImpl, str, str2, interfaceC42905x, (i12 & 16) != 0 ? AbstractC42817q.NO_RECEIVER : obj);
    }

    public static final kotlin.reflect.jvm.internal.calls.f r(A a12, Constructor constructor, InterfaceC42905x interfaceC42905x, boolean z12) {
        if (!z12) {
            a12.getClass();
            InterfaceC42850c interfaceC42850c = interfaceC42905x instanceof InterfaceC42850c ? (InterfaceC42850c) interfaceC42905x : null;
            if (interfaceC42850c != null && !kotlin.reflect.jvm.internal.impl.descriptors.r.e(interfaceC42850c.getVisibility()) && !kotlin.reflect.jvm.internal.impl.resolve.k.e(interfaceC42850c.h0()) && !kotlin.reflect.jvm.internal.impl.resolve.j.q(interfaceC42850c.h0())) {
                List<k0> listG = interfaceC42850c.g();
                if (!(listG instanceof Collection) || !listG.isEmpty()) {
                    Iterator<T> it = listG.iterator();
                    while (it.hasNext()) {
                        if (p51.b.a(((k0) it.next()).getType())) {
                            if (a12.q()) {
                                return new f.a(constructor, kotlin.reflect.jvm.internal.calls.l.a(a12.f406969j, a12.n()));
                            }
                            Class declaringClass = constructor.getDeclaringClass();
                            Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                            return new f.b(constructor, declaringClass, null, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : C42756l.w(0, genericParameterTypes.length - 1, genericParameterTypes)), null);
                        }
                    }
                }
            }
        }
        if (a12.q()) {
            return new f.c(constructor, kotlin.reflect.jvm.internal.calls.l.a(a12.f406969j, a12.n()));
        }
        Class declaringClass2 = constructor.getDeclaringClass();
        Class declaringClass3 = constructor.getDeclaringClass();
        Class<?> declaringClass4 = declaringClass3.getDeclaringClass();
        return new f.e(constructor, declaringClass2, (declaringClass4 == null || Modifier.isStatic(declaringClass3.getModifiers())) ? null : declaringClass4, constructor.getGenericParameterTypes(), null);
    }

    public final boolean equals(@Y61.l Object obj) {
        A aB2 = i0.b(obj);
        return aB2 != null && kotlin.jvm.internal.L.f(this.f406967h, aB2.f406967h) && getF407039i().equals(aB2.getF407039i()) && kotlin.jvm.internal.L.f(this.f406968i, aB2.f406968i) && kotlin.jvm.internal.L.f(this.f406969j, aB2.f406969j);
    }

    @Override // kotlin.jvm.internal.E
    public final int getArity() {
        return j().a().size();
    }

    @Override // kotlin.reflect.c
    @Y61.k
    /* renamed from: getName */
    public final String getF407039i() {
        return n().getName().b();
    }

    public final int hashCode() {
        return this.f406968i.hashCode() + ((getF407039i().hashCode() + (this.f406967h.hashCode() * 31)) * 31);
    }

    @Override // Y41.u
    @Y61.l
    public final Object i(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3, @Y61.l Object obj4, @Y61.l Object obj5, @Y61.l Object obj6, @Y61.l Serializable serializable) {
        return call(obj, obj2, obj3, obj4, obj5, obj6, serializable);
    }

    @Override // Y41.a
    @Y61.l
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // kotlin.reflect.i
    public final boolean isExternal() {
        return n().isExternal();
    }

    @Override // kotlin.reflect.i
    public final boolean isInfix() {
        return n().isInfix();
    }

    @Override // kotlin.reflect.i
    public final boolean isInline() {
        return n().isInline();
    }

    @Override // kotlin.reflect.i
    public final boolean isOperator() {
        return n().isOperator();
    }

    @Override // kotlin.reflect.c, kotlin.reflect.i
    public final boolean isSuspend() {
        return n().isSuspend();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.k
    public final kotlin.reflect.jvm.internal.calls.e<?> j() {
        return (kotlin.reflect.jvm.internal.calls.e) this.f406971l.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.k
    /* renamed from: l, reason: from getter */
    public final KDeclarationContainerImpl getF407038h() {
        return this.f406967h;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.l
    public final kotlin.reflect.jvm.internal.calls.e<?> m() {
        return (kotlin.reflect.jvm.internal.calls.e) this.f406972m.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    public final boolean q() {
        return !kotlin.jvm.internal.L.f(this.f406969j, AbstractC42817q.NO_RECEIVER);
    }

    @Override // kotlin.reflect.jvm.internal.AbstractC43003l
    @Y61.k
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final InterfaceC42905x n() {
        kotlin.reflect.n<Object> nVar = f406966n[0];
        return (InterfaceC42905x) this.f406970k.invoke();
    }

    @Y61.k
    public final String toString() {
        b0 b0Var = b0.f407078a;
        InterfaceC42905x interfaceC42905xN = n();
        b0Var.getClass();
        return b0.b(interfaceC42905xN);
    }

    @Override // Y41.l
    @Y61.l
    public final Object invoke(@Y61.l Object obj) {
        return call(obj);
    }

    public A(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, InterfaceC42905x interfaceC42905x, Object obj) {
        this.f406967h = kDeclarationContainerImpl;
        this.f406968i = str2;
        this.f406969j = obj;
        this.f406970k = Z.a(interfaceC42905x, new c(str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
        this.f406971l = C42727D.b(lazyThreadSafetyMode, new a());
        this.f406972m = C42727D.b(lazyThreadSafetyMode, new b());
    }

    @Override // Y41.p
    @Y61.l
    public final Object invoke(@Y61.l Object obj, @Y61.l Object obj2) {
        return call(obj, obj2);
    }

    @Override // Y41.q
    @Y61.l
    public final Object invoke(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // Y41.r
    @Y61.l
    public final Object invoke(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3, @Y61.l Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    @Override // Y41.s
    @Y61.l
    public final Object invoke(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3, @Y61.l Object obj4, @Y61.l Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // Y41.t
    @Y61.l
    public final Object invoke(@Y61.l Object obj, @Y61.l Object obj2, @Y61.l Object obj3, @Y61.l Object obj4, @Y61.l Object obj5, @Y61.l Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public A(@Y61.k KDeclarationContainerImpl kDeclarationContainerImpl, @Y61.k InterfaceC42905x interfaceC42905x) {
        String strB = interfaceC42905x.getName().b();
        d0.f407150a.getClass();
        this(kDeclarationContainerImpl, strB, d0.c(interfaceC42905x).getF410381b(), interfaceC42905x, null, 16, null);
    }
}
