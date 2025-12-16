package net.bytebuddy.description.annotation;

import com.yandex.div2.D8;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.lang.annotation.Annotation;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.ElementType;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.build.k;
import net.bytebuddy.description.annotation.AnnotationValue;
import net.bytebuddy.description.enumeration.a;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.matcher.C44411u;

/* loaded from: classes8.dex */
public interface AnnotationDescription {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class RenderingDispatcher {

        /* renamed from: b, reason: collision with root package name */
        public static final RenderingDispatcher f416034b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ RenderingDispatcher[] f416035c;

        public enum a extends RenderingDispatcher {
            @Override // net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher
            public final void a(int i12, String str, StringBuilder sb2) {
                if (i12 > 1 || !str.equals("value")) {
                    sb2.append(str);
                    sb2.append('=');
                }
            }
        }

        public enum b extends RenderingDispatcher {
            @Override // net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher
            public final void a(int i12, String str, StringBuilder sb2) {
                if (i12 > 1 || !str.equals("value")) {
                    sb2.append(str);
                    sb2.append('=');
                }
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher
            public final void b(StringBuilder sb2, TypeDescription typeDescription) {
                sb2.append(typeDescription.s5());
            }
        }

        static {
            RenderingDispatcher renderingDispatcher = new RenderingDispatcher("LEGACY_VM", 0);
            a aVar = new a("JAVA_14_CAPABLE_VM", 1, null);
            b bVar = new b("JAVA_19_CAPABLE_VM", 2, null);
            f416035c = new RenderingDispatcher[]{renderingDispatcher, aVar, bVar};
            ClassFileVersion classFileVersionH = ClassFileVersion.h(ClassFileVersion.f415295g);
            if (classFileVersionH.c(ClassFileVersion.f415309u)) {
                f416034b = bVar;
            } else if (classFileVersionH.c(ClassFileVersion.f415304p)) {
                f416034b = aVar;
            } else {
                f416034b = renderingDispatcher;
            }
        }

        public RenderingDispatcher() {
            throw null;
        }

        public RenderingDispatcher(String str, int i12, a aVar) {
        }

        public static RenderingDispatcher valueOf(String str) {
            return (RenderingDispatcher) Enum.valueOf(RenderingDispatcher.class, str);
        }

        public static RenderingDispatcher[] values() {
            return (RenderingDispatcher[]) f416035c.clone();
        }

        public void a(int i12, String str, StringBuilder sb2) {
            sb2.append(str);
            sb2.append('=');
        }

        public void b(StringBuilder sb2, TypeDescription typeDescription) {
            sb2.append(typeDescription.getName());
        }
    }

    public static abstract class b implements AnnotationDescription {

        /* renamed from: b, reason: collision with root package name */
        public static final HashSet f416036b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        public static final a.d f416037c;

        /* renamed from: d, reason: collision with root package name */
        public static final a.d f416038d;

        /* renamed from: a, reason: collision with root package name */
        public transient /* synthetic */ int f416039a;

        static {
            for (ElementType elementType : ElementType.values()) {
                if (!elementType.name().equals("TYPE_PARAMETER")) {
                    f416036b.add(elementType);
                }
            }
            f416037c = (a.d) TypeDescription.d.A0(Retention.class).q().P1(C44411u.x("value")).M2();
            f416038d = (a.d) TypeDescription.d.A0(Target.class).q().P1(C44411u.x("value")).M2();
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final boolean b(ElementType elementType) {
            return f(elementType.name());
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final boolean e() {
            return a().getDeclaredAnnotations().isAnnotationPresent(Inherited.class);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AnnotationDescription)) {
                return false;
            }
            AnnotationDescription annotationDescription = (AnnotationDescription) obj;
            TypeDescription typeDescriptionA = a();
            if (!annotationDescription.a().equals(typeDescriptionA)) {
                return false;
            }
            for (a.d dVar : typeDescriptionA.q()) {
                if (!d(dVar).equals(annotationDescription.d(dVar))) {
                    return false;
                }
            }
            return true;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final boolean f(String str) {
            g gVarM6 = a().getDeclaredAnnotations().m6(Target.class);
            if (gVarM6 != null) {
                for (net.bytebuddy.description.enumeration.a aVar : (net.bytebuddy.description.enumeration.a[]) gVarM6.d(f416038d).b(net.bytebuddy.description.enumeration.a[].class)) {
                    if (aVar.getValue().equals(str)) {
                        return true;
                    }
                }
            } else {
                if (str.equals("TYPE_USE")) {
                    return true;
                }
                Iterator it = f416036b.iterator();
                while (it.hasNext()) {
                    if (((ElementType) it.next()).name().equals(str)) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final RetentionPolicy g() {
            g gVarM6 = a().getDeclaredAnnotations().m6(Retention.class);
            return gVarM6 == null ? RetentionPolicy.CLASS : (RetentionPolicy) gVarM6.d(f416037c).r(null).b(RetentionPolicy.class);
        }

        @k.c
        public final int hashCode() {
            int iHashCode = 0;
            if (this.f416039a == 0) {
                Iterator<a.d> it = a().q().iterator();
                while (it.hasNext()) {
                    iHashCode += d(it.next()).hashCode() * 31;
                }
            }
            if (iHashCode == 0) {
                return this.f416039a;
            }
            this.f416039a = iHashCode;
            return iHashCode;
        }

        public final String toString() {
            TypeDescription typeDescriptionA = a();
            StringBuilder sb2 = new StringBuilder();
            sb2.append('@');
            RenderingDispatcher.f416034b.b(sb2, typeDescriptionA);
            sb2.append('(');
            boolean z12 = true;
            for (a.d dVar : typeDescriptionA.q()) {
                AnnotationValue<?, ?> annotationValueD = d(dVar);
                if (annotationValueD.getState() != AnnotationValue.State.f416102b) {
                    if (z12) {
                        z12 = false;
                    } else {
                        sb2.append(", ");
                    }
                    RenderingDispatcher.f416034b.a(typeDescriptionA.q().size(), dVar.getName(), sb2);
                    sb2.append(annotationValueD);
                }
            }
            sb2.append(')');
            return sb2.toString();
        }
    }

    public static class c<T extends Annotation> implements InvocationHandler {

        /* renamed from: d, reason: collision with root package name */
        public static final Object[] f416040d = new Object[0];

        /* renamed from: a, reason: collision with root package name */
        public final Class<? extends Annotation> f416041a;

        /* renamed from: b, reason: collision with root package name */
        public final LinkedHashMap<Method, AnnotationValue.k<?>> f416042b;

        /* renamed from: c, reason: collision with root package name */
        public transient /* synthetic */ int f416043c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Class<T> cls, LinkedHashMap<Method, AnnotationValue.k<?>> linkedHashMap) {
            this.f416041a = cls;
            this.f416042b = linkedHashMap;
        }

        public static <S extends Annotation> S a(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Class<S> cls, Map<String, ? extends AnnotationValue<?, ?>> map) throws SecurityException {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Method method : cls.getDeclaredMethods()) {
                AnnotationValue<?, ?> annotationValue = map.get(method.getName());
                if (annotationValue == null) {
                    Object defaultValue = method.getDefaultValue();
                    linkedHashMap.put(method, (defaultValue == null ? new AnnotationValue.i(method.getName(), new TypeDescription.d(method.getDeclaringClass())) : e.i(method.getReturnType(), defaultValue)).r(classLoader));
                } else {
                    linkedHashMap.put(method, annotationValue.q(new a.c(method)).r(classLoader));
                }
            }
            return (S) Proxy.newProxyInstance(classLoader, new Class[]{cls}, new c(cls, linkedHashMap));
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f416041a.equals(cVar.f416041a)) {
                return false;
            }
            for (Map.Entry<Method, AnnotationValue.k<?>> entry : this.f416042b.entrySet()) {
                if (!entry.getValue().equals(cVar.f416042b.get(entry.getKey()))) {
                    return false;
                }
            }
            return true;
        }

        @k.c
        public final int hashCode() {
            int i12;
            if (this.f416043c != 0) {
                i12 = 0;
            } else {
                int iHashCode = this.f416041a.hashCode() * 31;
                LinkedHashMap<Method, AnnotationValue.k<?>> linkedHashMap = this.f416042b;
                int iHashCode2 = linkedHashMap.hashCode() + iHashCode;
                Iterator<Map.Entry<Method, AnnotationValue.k<?>>> it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    iHashCode2 = (iHashCode2 * 31) + it.next().getValue().hashCode();
                }
                i12 = iHashCode2;
            }
            if (i12 == 0) {
                return this.f416043c;
            }
            this.f416043c = i12;
            return i12;
        }

        /* JADX WARN: Removed duplicated region for block: B:62:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, @net.bytebuddy.utility.nullability.b java.lang.Object[] r10) throws java.lang.IllegalArgumentException {
            /*
                Method dump skipped, instructions count: 374
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.description.annotation.AnnotationDescription.c.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d {
        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            D8.j(null, getClass().hashCode() * 31, 31);
            throw null;
        }
    }

    public static class e<S extends Annotation> extends b implements g<S> {

        /* renamed from: g, reason: collision with root package name */
        public static final Object[] f416044g;

        /* renamed from: h, reason: collision with root package name */
        public static final boolean f416045h;

        /* renamed from: e, reason: collision with root package name */
        public final S f416046e;

        /* renamed from: f, reason: collision with root package name */
        public final Class<S> f416047f;

        static {
            try {
                Class.forName("java.security.AccessController", false, null);
                f416045h = Boolean.parseBoolean(System.getProperty("net.bytebuddy.securitymanager", "true"));
            } catch (ClassNotFoundException unused) {
                f416045h = false;
            } catch (SecurityException unused2) {
                f416045h = true;
            }
            f416044g = new Object[0];
        }

        public e() {
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public e(Class cls, Annotation annotation) {
            this.f416046e = annotation;
            this.f416047f = cls;
        }

        public static HashMap h(Annotation annotation) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            HashMap map = new HashMap();
            for (Method method : annotation.annotationType().getDeclaredMethods()) {
                try {
                    map.put(method.getName(), i(method.getReturnType(), method.invoke(annotation, f416044g)));
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException("Cannot access " + method, e12);
                } catch (InvocationTargetException e13) {
                    Throwable targetException = e13.getTargetException();
                    if (targetException instanceof TypeNotPresentException) {
                        map.put(method.getName(), new AnnotationValue.h(((TypeNotPresentException) targetException).typeName()));
                    } else if (targetException instanceof EnumConstantNotPresentException) {
                        EnumConstantNotPresentException enumConstantNotPresentException = (EnumConstantNotPresentException) targetException;
                        map.put(method.getName(), new AnnotationValue.e.b(enumConstantNotPresentException.constantName(), new TypeDescription.d(enumConstantNotPresentException.enumType())));
                    } else if (targetException instanceof AnnotationTypeMismatchException) {
                        AnnotationTypeMismatchException annotationTypeMismatchException = (AnnotationTypeMismatchException) targetException;
                        map.put(method.getName(), new AnnotationValue.g(new a.c(annotationTypeMismatchException.element()), annotationTypeMismatchException.foundType()));
                    } else if (!(targetException instanceof IncompleteAnnotationException)) {
                        throw new IllegalStateException("Cannot read " + method, targetException);
                    }
                }
            }
            return map;
        }

        public static AnnotationValue.b i(Class cls, Object obj) {
            if (Enum.class.isAssignableFrom(cls)) {
                return new AnnotationValue.e(new a.b((Enum) obj));
            }
            int i12 = 0;
            if (Enum[].class.isAssignableFrom(cls)) {
                Enum[] enumArr = (Enum[]) obj;
                int length = enumArr.length;
                net.bytebuddy.description.enumeration.a[] aVarArr = new net.bytebuddy.description.enumeration.a[length];
                int length2 = enumArr.length;
                int i13 = 0;
                int i14 = 0;
                while (i13 < length2) {
                    aVarArr[i14] = new a.b(enumArr[i13]);
                    i13++;
                    i14++;
                }
                TypeDescription typeDescriptionA0 = TypeDescription.d.A0(cls.getComponentType());
                ArrayList arrayList = new ArrayList(length);
                while (i12 < length) {
                    net.bytebuddy.description.enumeration.a aVar = aVarArr[i12];
                    if (!aVar.w().equals(typeDescriptionA0)) {
                        throw new IllegalArgumentException(aVar + " is not of " + typeDescriptionA0);
                    }
                    arrayList.add(new AnnotationValue.e(aVar));
                    i12++;
                }
                return new AnnotationValue.d(net.bytebuddy.description.enumeration.a.class, typeDescriptionA0, arrayList);
            }
            if (Annotation.class.isAssignableFrom(cls)) {
                return new AnnotationValue.c(new f(TypeDescription.d.A0(cls), h((Annotation) obj)));
            }
            if (!Annotation[].class.isAssignableFrom(cls)) {
                if (Class.class.isAssignableFrom(cls)) {
                    return new AnnotationValue.j(TypeDescription.d.A0((Class) obj));
                }
                if (!Class[].class.isAssignableFrom(cls)) {
                    return AnnotationValue.ForConstant.c(obj);
                }
                Class[] clsArr = (Class[]) obj;
                int length3 = clsArr.length;
                TypeDescription[] typeDescriptionArr = new TypeDescription[length3];
                int length4 = clsArr.length;
                int i15 = 0;
                int i16 = 0;
                while (i15 < length4) {
                    typeDescriptionArr[i16] = TypeDescription.d.A0(clsArr[i15]);
                    i15++;
                    i16++;
                }
                ArrayList arrayList2 = new ArrayList(length3);
                while (i12 < length3) {
                    arrayList2.add(new AnnotationValue.j(typeDescriptionArr[i12]));
                    i12++;
                }
                return new AnnotationValue.d(TypeDescription.class, TypeDescription.f416319C2, arrayList2);
            }
            Annotation[] annotationArr = (Annotation[]) obj;
            int length5 = annotationArr.length;
            AnnotationDescription[] annotationDescriptionArr = new AnnotationDescription[length5];
            int length6 = annotationArr.length;
            int i17 = 0;
            int i18 = 0;
            while (i17 < length6) {
                annotationDescriptionArr[i18] = new f(TypeDescription.d.A0(cls.getComponentType()), h(annotationArr[i17]));
                i17++;
                i18++;
            }
            TypeDescription typeDescriptionA02 = TypeDescription.d.A0(cls.getComponentType());
            ArrayList arrayList3 = new ArrayList(length5);
            while (i12 < length5) {
                AnnotationDescription annotationDescription = annotationDescriptionArr[i12];
                if (!annotationDescription.a().equals(typeDescriptionA02)) {
                    throw new IllegalArgumentException(annotationDescription + " is not of " + typeDescriptionA02);
                }
                arrayList3.add(new AnnotationValue.c(annotationDescription));
                i12++;
            }
            return new AnnotationValue.d(AnnotationDescription.class, typeDescriptionA02, arrayList3);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final TypeDescription a() {
            return TypeDescription.d.A0(this.f416046e.annotationType());
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final <T extends Annotation> g<T> c(Class<T> cls) {
            S s5 = this.f416046e;
            if (s5.annotationType().getName().equals(cls.getName())) {
                return cls == s5.annotationType() ? this : new e(cls, s5);
            }
            throw new IllegalArgumentException(cls + " does not represent " + s5.annotationType());
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        @SuppressFBWarnings(justification = "Exception should always be wrapped for clarity.", value = {"REC_CATCH_EXCEPTION"})
        public final AnnotationValue<?, ?> d(a.d dVar) throws NoSuchMethodException, SecurityException {
            TypeDescription typeDescriptionN = dVar.n();
            S s5 = this.f416046e;
            if (!typeDescriptionN.Q2(s5.annotationType())) {
                throw new IllegalArgumentException(dVar + " does not represent " + s5.annotationType());
            }
            try {
                boolean zE02 = dVar.n().e0();
                Method method = dVar instanceof a.c ? (Method) ((a.c) dVar).f416177c : null;
                if (method == null || method.getDeclaringClass() != s5.annotationType() || (!zE02 && !method.isAccessible())) {
                    method = s5.annotationType().getMethod(dVar.getName(), new Class[0]);
                    if (!zE02) {
                        net.bytebuddy.utility.privilege.c cVar = new net.bytebuddy.utility.privilege.c(method);
                        if (f416045h) {
                            AccessController.doPrivileged(cVar);
                        } else {
                            cVar.run();
                        }
                    }
                }
                return i(method.getReturnType(), method.invoke(s5, f416044g)).p(dVar, dVar.getReturnType());
            } catch (InvocationTargetException e12) {
                Throwable targetException = e12.getTargetException();
                if (targetException instanceof TypeNotPresentException) {
                    return new AnnotationValue.h(((TypeNotPresentException) targetException).typeName());
                }
                if (targetException instanceof EnumConstantNotPresentException) {
                    EnumConstantNotPresentException enumConstantNotPresentException = (EnumConstantNotPresentException) targetException;
                    return new AnnotationValue.e.b(enumConstantNotPresentException.constantName(), new TypeDescription.d(enumConstantNotPresentException.enumType()));
                }
                if (targetException instanceof AnnotationTypeMismatchException) {
                    AnnotationTypeMismatchException annotationTypeMismatchException = (AnnotationTypeMismatchException) targetException;
                    return new AnnotationValue.g(new a.c(annotationTypeMismatchException.element()), annotationTypeMismatchException.foundType());
                }
                if (targetException instanceof IncompleteAnnotationException) {
                    IncompleteAnnotationException incompleteAnnotationException = (IncompleteAnnotationException) targetException;
                    return new AnnotationValue.i(incompleteAnnotationException.elementName(), new TypeDescription.d(incompleteAnnotationException.annotationType()));
                }
                throw new IllegalStateException("Error reading annotation property " + dVar, targetException);
            } catch (Exception e13) {
                throw new IllegalStateException("Cannot access annotation property " + dVar, e13);
            }
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription.g
        public final S load() {
            S s5 = this.f416046e;
            Class<? extends Annotation> clsAnnotationType = s5.annotationType();
            Class<S> cls = this.f416047f;
            return cls == clsAnnotationType ? s5 : (S) c.a(cls.getClassLoader(), cls, h(s5));
        }
    }

    public static class f extends b {

        /* renamed from: e, reason: collision with root package name */
        public final TypeDescription f416048e;

        /* renamed from: f, reason: collision with root package name */
        public final Map<String, ? extends AnnotationValue<?, ?>> f416049f;

        public class a<S extends Annotation> extends b implements g<S> {

            /* renamed from: e, reason: collision with root package name */
            public final Class<S> f416050e;

            public a(Class<S> cls) {
                this.f416050e = cls;
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription
            public final TypeDescription a() {
                return TypeDescription.d.A0(this.f416050e);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription
            public final <T extends Annotation> g<T> c(Class<T> cls) {
                return f.this.c(cls);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription
            public final AnnotationValue<?, ?> d(a.d dVar) {
                return f.this.d(dVar);
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription.g
            public final S load() {
                Class<S> cls = this.f416050e;
                return (S) c.a(cls.getClassLoader(), cls, f.this.f416049f);
            }
        }

        public f(TypeDescription typeDescription, Map<String, ? extends AnnotationValue<?, ?>> map) {
            this.f416048e = typeDescription;
            this.f416049f = map;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final TypeDescription a() {
            return this.f416048e;
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public final AnnotationValue<?, ?> d(a.d dVar) {
            TypeDescription typeDescriptionN = dVar.n();
            TypeDescription typeDescription = this.f416048e;
            if (typeDescriptionN.equals(typeDescription)) {
                AnnotationValue<?, ?> annotationValue = this.f416049f.get(dVar.getName());
                if (annotationValue != null) {
                    return annotationValue.q(dVar);
                }
                AnnotationValue<?, ?> defaultValue = dVar.getDefaultValue();
                return defaultValue == null ? new AnnotationValue.i(dVar.getName(), typeDescription) : defaultValue;
            }
            throw new IllegalArgumentException("Not a property of " + typeDescription + ": " + dVar);
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public final <T extends Annotation> a<T> c(Class<T> cls) {
            TypeDescription typeDescription = this.f416048e;
            if (typeDescription.Q2(cls)) {
                return new a<>(cls);
            }
            throw new IllegalArgumentException(cls + " does not represent " + typeDescription);
        }
    }

    public interface g<S extends Annotation> extends AnnotationDescription {
        S load();
    }

    TypeDescription a();

    boolean b(ElementType elementType);

    <T extends Annotation> g<T> c(Class<T> cls);

    AnnotationValue<?, ?> d(a.d dVar);

    boolean e();

    boolean f(String str);

    RetentionPolicy g();
}
