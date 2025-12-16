package kotlin.reflect.jvm.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.C0;

/* compiled from: KCallableImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlin/reflect/jvm/internal/l;", "R", "Lkotlin/reflect/c;", "Lkotlin/reflect/jvm/internal/W;", "<init>", "()V", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kotlin.reflect.jvm.internal.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43003l<R> implements kotlin.reflect.c<R>, W {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z.a<List<Annotation>> f410395b = Z.a(null, new b(this));

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z.a<ArrayList<KParameter>> f410396c = Z.a(null, new c(this));

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Z.a<T> f410397d = Z.a(null, new d(this));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Z.a<List<V>> f410398e = Z.a(null, new e(this));

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Z.a<Object[]> f410399f = Z.a(null, new a(this));

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f410400g = C42727D.b(LazyThreadSafetyMode.f406615c, new f(this));

    /* compiled from: KCallableImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0000\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0002 \u0003*\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "R", "invoke", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.l$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Object[]> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC43003l<R> f410401l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(AbstractC43003l<? extends R> abstractC43003l) {
            super(0);
            this.f410401l = abstractC43003l;
        }

        /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final Object[] invoke() {
            int iO2;
            AbstractC43003l<R> abstractC43003l = this.f410401l;
            List<KParameter> parameters = abstractC43003l.getParameters();
            int size = (abstractC43003l.isSuspend() ? 1 : 0) + parameters.size();
            if (((Boolean) abstractC43003l.f410400g.getValue()).booleanValue()) {
                iO2 = 0;
                for (KParameter kParameter : parameters) {
                    iO2 += kParameter.getF407006d() == KParameter.Kind.f406944d ? abstractC43003l.o(kParameter) : 0;
                }
            } else {
                List<KParameter> list = parameters;
                if ((list instanceof Collection) && list.isEmpty()) {
                    iO2 = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    iO2 = 0;
                    while (it.hasNext()) {
                        if (((KParameter) it.next()).getF407006d() == KParameter.Kind.f406944d && (iO2 = iO2 + 1) < 0) {
                            C42745f0.G0();
                            throw null;
                        }
                    }
                }
            }
            int i12 = (iO2 + 31) / 32;
            Object[] objArr = new Object[size + i12 + 1];
            for (KParameter kParameter2 : parameters) {
                if (kParameter2.b()) {
                    T type = kParameter2.getType();
                    kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
                    kotlin.reflect.jvm.internal.impl.types.O o12 = type.f407060b;
                    if (o12 != null) {
                        int i13 = kotlin.reflect.jvm.internal.impl.resolve.k.f409643a;
                        InterfaceC42853f interfaceC42853fB = o12.H0().b();
                        if (interfaceC42853fB != null ? kotlin.reflect.jvm.internal.impl.resolve.k.b(interfaceC42853fB) : false) {
                        }
                    }
                    int index = kParameter2.getF407005c();
                    T type2 = kParameter2.getType();
                    Type typeG = type2.g();
                    if (typeG == null) {
                        typeG = kotlin.reflect.y.d(type2);
                    }
                    objArr[index] = i0.e(typeG);
                }
                if (kParameter2.a()) {
                    objArr[kParameter2.getF407005c()] = AbstractC43003l.f(kParameter2.getType());
                }
            }
            for (int i14 = 0; i14 < i12; i14++) {
                objArr[size + i14] = 0;
            }
            return objArr;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "kotlin.jvm.PlatformType", "R", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.l$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<List<? extends Annotation>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC43003l<R> f410402l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(AbstractC43003l<? extends R> abstractC43003l) {
            super(0);
            this.f410402l = abstractC43003l;
        }

        @Override // Y41.a
        public final List<? extends Annotation> invoke() {
            return i0.d(this.f410402l.n());
        }
    }

    /* compiled from: KCallableImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a,\u0012\u0004\u0012\u00020\u0002 \u0004*\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00030\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003\"\u0006\b\u0000\u0010\u0005 \u0001H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "Lkotlin/collections/ArrayList;", "kotlin.jvm.PlatformType", "R", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.l$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<ArrayList<KParameter>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC43003l<R> f410403l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(AbstractC43003l<? extends R> abstractC43003l) {
            super(0);
            this.f410403l = abstractC43003l;
        }

        @Override // Y41.a
        public final ArrayList<KParameter> invoke() {
            int i12;
            AbstractC43003l<R> abstractC43003l = this.f410403l;
            CallableMemberDescriptor callableMemberDescriptorN = abstractC43003l.n();
            ArrayList<KParameter> arrayList = new ArrayList<>();
            int i13 = 0;
            if (abstractC43003l.q()) {
                i12 = 0;
            } else {
                kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
                kotlin.reflect.jvm.internal.impl.descriptors.X xP02 = callableMemberDescriptorN.F() != null ? ((InterfaceC42851d) callableMemberDescriptorN.f()).p0() : null;
                if (xP02 != null) {
                    arrayList.add(new G(abstractC43003l, 0, KParameter.Kind.f406942b, new C43004m(xP02)));
                    i12 = 1;
                } else {
                    i12 = 0;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.X xH2 = callableMemberDescriptorN.H();
                if (xH2 != null) {
                    arrayList.add(new G(abstractC43003l, i12, KParameter.Kind.f406943c, new C43005n(xH2)));
                    i12++;
                }
            }
            int size = callableMemberDescriptorN.g().size();
            while (i13 < size) {
                arrayList.add(new G(abstractC43003l, i12, KParameter.Kind.f406944d, new C43006o(callableMemberDescriptorN, i13)));
                i13++;
                i12++;
            }
            if (abstractC43003l.p() && (callableMemberDescriptorN instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.a) && arrayList.size() > 1) {
                C42745f0.z0(arrayList, new C43007p());
            }
            arrayList.trimToSize();
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lkotlin/reflect/jvm/internal/T;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/T;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.l$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC43003l<R> f410404l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(AbstractC43003l<? extends R> abstractC43003l) {
            super(0);
            this.f410404l = abstractC43003l;
        }

        @Override // Y41.a
        public final T invoke() {
            AbstractC43003l<R> abstractC43003l = this.f410404l;
            return new T(abstractC43003l.n().getReturnType(), new C43008q(abstractC43003l));
        }
    }

    /* compiled from: KCallableImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0000 \u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "Lkotlin/reflect/jvm/internal/V;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: kotlin.reflect.jvm.internal.l$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<List<? extends V>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC43003l<R> f410405l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(AbstractC43003l<? extends R> abstractC43003l) {
            super(0);
            this.f410405l = abstractC43003l;
        }

        @Override // Y41.a
        public final List<? extends V> invoke() {
            AbstractC43003l<R> abstractC43003l = this.f410405l;
            List<kotlin.reflect.jvm.internal.impl.descriptors.g0> typeParameters = abstractC43003l.n().getTypeParameters();
            ArrayList arrayList = new ArrayList(C42745f0.q(typeParameters, 10));
            Iterator<T> it = typeParameters.iterator();
            while (it.hasNext()) {
                arrayList.add(new V(abstractC43003l, (kotlin.reflect.jvm.internal.impl.descriptors.g0) it.next()));
            }
            return arrayList;
        }
    }

    /* compiled from: KCallableImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002 \u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "R", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.l$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ AbstractC43003l<R> f410406l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(AbstractC43003l<? extends R> abstractC43003l) {
            super(0);
            this.f410406l = abstractC43003l;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            List<KParameter> parameters = this.f410406l.getParameters();
            boolean z12 = false;
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it = parameters.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T type = ((KParameter) it.next()).getType();
                    kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
                    kotlin.reflect.jvm.internal.impl.types.O o12 = type.f407060b;
                    if (o12 != null && kotlin.reflect.jvm.internal.impl.resolve.k.f(o12)) {
                        z12 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z12);
        }
    }

    public static Object f(kotlin.reflect.r rVar) {
        Class<?> clsF = ((InterfaceC42819t) kotlin.reflect.jvm.d.b(rVar)).f();
        if (clsF.isArray()) {
            return Array.newInstance(clsF.getComponentType(), 0);
        }
        throw new X("Cannot instantiate the default empty array of type " + clsF.getSimpleName() + ", because it is not an array type");
    }

    @Override // kotlin.reflect.c
    public final R call(@Y61.k Object... objArr) throws IllegalCallableAccessException {
        try {
            return (R) j().call(objArr);
        } catch (IllegalAccessException e12) {
            throw new IllegalCallableAccessException(e12);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.c
    public final R callBy(@Y61.k Map<KParameter, ? extends Object> map) throws IllegalCallableAccessException {
        Object objF;
        boolean z12 = false;
        if (p()) {
            List<KParameter> parameters = getParameters();
            ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
            for (KParameter kParameter : parameters) {
                if (map.containsKey(kParameter)) {
                    objF = map.get(kParameter);
                    if (objF == null) {
                        throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + ')');
                    }
                } else if (kParameter.b()) {
                    objF = null;
                } else {
                    if (!kParameter.a()) {
                        throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                    }
                    objF = f(kParameter.getType());
                }
                arrayList.add(objF);
            }
            kotlin.reflect.jvm.internal.calls.e<?> eVarM = m();
            if (eVarM != null) {
                try {
                    return (R) eVarM.call(arrayList.toArray(new Object[0]));
                } catch (IllegalAccessException e12) {
                    throw new IllegalCallableAccessException(e12);
                }
            }
            throw new X("This callable does not support a default call: " + n());
        }
        List<KParameter> parameters2 = getParameters();
        if (parameters2.isEmpty()) {
            try {
                return (R) j().call(isSuspend() ? new Continuation[]{null} : new Continuation[0]);
            } catch (IllegalAccessException e13) {
                throw new IllegalCallableAccessException(e13);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters2.size();
        Object[] objArr = (Object[]) this.f410399f.invoke().clone();
        if (isSuspend()) {
            objArr[parameters2.size()] = null;
        }
        boolean zBooleanValue = ((Boolean) this.f410400g.getValue()).booleanValue();
        int i12 = 0;
        for (KParameter kParameter2 : parameters2) {
            int iO2 = zBooleanValue ? o(kParameter2) : 1;
            if (map.containsKey(kParameter2)) {
                objArr[kParameter2.getF407005c()] = map.get(kParameter2);
            } else if (kParameter2.b()) {
                if (zBooleanValue) {
                    int i13 = i12 + iO2;
                    for (int i14 = i12; i14 < i13; i14++) {
                        int i15 = (i14 / 32) + size;
                        objArr[i15] = Integer.valueOf(((Integer) objArr[i15]).intValue() | (1 << (i14 % 32)));
                    }
                } else {
                    int i16 = (i12 / 32) + size;
                    objArr[i16] = Integer.valueOf(((Integer) objArr[i16]).intValue() | (1 << (i12 % 32)));
                }
                z12 = true;
            } else if (!kParameter2.a()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter2);
            }
            if (kParameter2.getF407006d() == KParameter.Kind.f406944d) {
                i12 += iO2;
            }
        }
        if (!z12) {
            try {
                return (R) j().call(Arrays.copyOf(objArr, size));
            } catch (IllegalAccessException e14) {
                throw new IllegalCallableAccessException(e14);
            }
        }
        kotlin.reflect.jvm.internal.calls.e<?> eVarM2 = m();
        if (eVarM2 != null) {
            try {
                return (R) eVarM2.call(objArr);
            } catch (IllegalAccessException e15) {
                throw new IllegalCallableAccessException(e15);
            }
        }
        throw new X("This callable does not support a default call: " + n());
    }

    @Override // kotlin.reflect.b
    @Y61.k
    public final List<Annotation> getAnnotations() {
        return this.f410395b.invoke();
    }

    @Override // kotlin.reflect.c
    @Y61.k
    public final List<KParameter> getParameters() {
        return this.f410396c.invoke();
    }

    @Override // kotlin.reflect.c
    @Y61.k
    public final kotlin.reflect.r getReturnType() {
        return this.f410397d.invoke();
    }

    @Override // kotlin.reflect.c
    @Y61.k
    public final List<kotlin.reflect.s> getTypeParameters() {
        return this.f410398e.invoke();
    }

    @Override // kotlin.reflect.c
    @Y61.l
    public final KVisibility getVisibility() {
        AbstractC42900s visibility = n().getVisibility();
        kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
        if (visibility.equals(kotlin.reflect.jvm.internal.impl.descriptors.r.f407789e)) {
            return KVisibility.f406952b;
        }
        if (visibility.equals(kotlin.reflect.jvm.internal.impl.descriptors.r.f407787c)) {
            return KVisibility.f406953c;
        }
        if (visibility.equals(kotlin.reflect.jvm.internal.impl.descriptors.r.f407788d)) {
            return KVisibility.f406954d;
        }
        if (visibility.equals(kotlin.reflect.jvm.internal.impl.descriptors.r.f407785a) ? true : visibility.equals(kotlin.reflect.jvm.internal.impl.descriptors.r.f407786b)) {
            return KVisibility.f406955e;
        }
        return null;
    }

    @Override // kotlin.reflect.c
    public final boolean isAbstract() {
        return n().i() == Modality.f407442f;
    }

    @Override // kotlin.reflect.c
    public final boolean isFinal() {
        return n().i() == Modality.f407439c;
    }

    @Override // kotlin.reflect.c
    public final boolean isOpen() {
        return n().i() == Modality.f407441e;
    }

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.calls.e<?> j();

    @Y61.k
    /* renamed from: l */
    public abstract KDeclarationContainerImpl getF407038h();

    @Y61.l
    public abstract kotlin.reflect.jvm.internal.calls.e<?> m();

    @Y61.k
    public abstract CallableMemberDescriptor n();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    public final int o(KParameter kParameter) {
        if (!((Boolean) this.f410400g.getValue()).booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before");
        }
        T type = kParameter.getType();
        kotlin.reflect.jvm.internal.impl.name.c cVar = i0.f407157a;
        kotlin.reflect.jvm.internal.impl.types.O o12 = type.f407060b;
        if (o12 == null || !kotlin.reflect.jvm.internal.impl.resolve.k.f(o12)) {
            return 1;
        }
        return kotlin.reflect.jvm.internal.calls.l.e(C0.a(kParameter.getType().f407060b)).size();
    }

    public final boolean p() {
        return kotlin.jvm.internal.L.f(getF407039i(), "<init>") && getF407038h().f().isAnnotation();
    }

    public abstract boolean q();
}
