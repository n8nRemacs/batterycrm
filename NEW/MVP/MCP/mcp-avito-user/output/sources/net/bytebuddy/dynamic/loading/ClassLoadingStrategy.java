package net.bytebuddy.dynamic.loading;

import androidx.camera.view.k;
import com.yandex.div2.D8;
import java.lang.ClassLoader;
import java.security.ProtectionDomain;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.loading.ByteArrayClassLoader;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy;
import net.bytebuddy.utility.GraalImageCode;
import net.bytebuddy.utility.JavaType;
import net.bytebuddy.utility.g;

/* loaded from: classes8.dex */
public interface ClassLoadingStrategy<T extends ClassLoader> {

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class Default implements a<ClassLoader> {

        /* renamed from: c, reason: collision with root package name */
        public static final Default f416767c;

        /* renamed from: d, reason: collision with root package name */
        public static final Default f416768d;

        /* renamed from: e, reason: collision with root package name */
        public static final Default f416769e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Default[] f416770f;

        /* renamed from: b, reason: collision with root package name */
        public final a<ClassLoader> f416771b;

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements a<ClassLoader> {

            /* renamed from: b, reason: collision with root package name */
            @HashCodeAndEqualsPlugin.ValueHandling
            @net.bytebuddy.utility.nullability.b
            public final ProtectionDomain f416772b;

            /* renamed from: c, reason: collision with root package name */
            public final PackageDefinitionStrategy.NoOp f416773c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f416774d;

            public a() {
                this(null, PackageDefinitionStrategy.NoOp.f416804b, true);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.a
            public final a<ClassLoader> a(ProtectionDomain protectionDomain) {
                return new a(protectionDomain, this.f416773c, this.f416774d);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
                if (classLoader == null) {
                    throw new IllegalArgumentException("Cannot inject classes into the bootstrap class loader");
                }
                return new ClassInjector.UsingReflection(classLoader, this.f416772b, this.f416773c, this.f416774d).a(map);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
            
                if (r2 != null) goto L21;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$a r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.a) r5
                    boolean r2 = r5.f416774d
                    boolean r3 = r4.f416774d
                    if (r3 == r2) goto L1c
                    return r1
                L1c:
                    java.security.ProtectionDomain r2 = r4.f416772b
                    java.security.ProtectionDomain r3 = r5.f416772b
                    if (r3 == 0) goto L2b
                    if (r2 == 0) goto L2d
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2e
                    return r1
                L2b:
                    if (r2 == 0) goto L2e
                L2d:
                    return r1
                L2e:
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp r2 = r4.f416773c
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$NoOp r5 = r5.f416773c
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L39
                    return r1
                L39:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.a.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                int iHashCode = getClass().hashCode() * 31;
                ProtectionDomain protectionDomain = this.f416772b;
                if (protectionDomain != null) {
                    iHashCode += protectionDomain.hashCode();
                }
                return ((this.f416773c.hashCode() + (iHashCode * 31)) * 31) + (this.f416774d ? 1 : 0);
            }

            public a(@net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain, PackageDefinitionStrategy.NoOp noOp, boolean z12) {
                this.f416772b = protectionDomain;
                this.f416773c = noOp;
                this.f416774d = z12;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements a<ClassLoader> {

            /* renamed from: b, reason: collision with root package name */
            @HashCodeAndEqualsPlugin.ValueHandling
            @net.bytebuddy.utility.nullability.b
            public final ProtectionDomain f416775b;

            /* renamed from: c, reason: collision with root package name */
            public final ByteArrayClassLoader.PersistenceHandler f416776c;

            /* renamed from: d, reason: collision with root package name */
            public final PackageDefinitionStrategy.Trivial f416777d;

            /* renamed from: e, reason: collision with root package name */
            public final boolean f416778e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f416779f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f416780g;

            public b(ByteArrayClassLoader.PersistenceHandler persistenceHandler, boolean z12) {
                this(null, PackageDefinitionStrategy.Trivial.f416806b, persistenceHandler, z12, true, true);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.a
            public final a<ClassLoader> a(ProtectionDomain protectionDomain) {
                return new b(protectionDomain, this.f416777d, this.f416776c, this.f416778e, this.f416779f, this.f416780g);
            }

            @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
            public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) throws ClassNotFoundException {
                LinkedHashMap linkedHashMap;
                boolean z12 = this.f416778e;
                boolean z13 = this.f416779f;
                if (z12) {
                    int i12 = ByteArrayClassLoader.b.f416692k;
                    HashMap map2 = new HashMap();
                    for (Map.Entry<TypeDescription, byte[]> entry : map.entrySet()) {
                        map2.put(entry.getKey().getName(), entry.getValue());
                    }
                    ByteArrayClassLoader.b bVar = new ByteArrayClassLoader.b(classLoader, this.f416780g, map2, this.f416775b, this.f416776c, this.f416777d);
                    linkedHashMap = new LinkedHashMap();
                    for (TypeDescription typeDescription : map.keySet()) {
                        try {
                            Class<?> cls = Class.forName(typeDescription.getName(), false, bVar);
                            if (!GraalImageCode.a().f418862c && z13 && cls.getClassLoader() != bVar) {
                                throw new IllegalStateException("Class already loaded: " + cls);
                            }
                            linkedHashMap.put(typeDescription, cls);
                        } catch (ClassNotFoundException e12) {
                            throw new IllegalStateException(D8.o("Cannot load class ", typeDescription), e12);
                        }
                    }
                } else {
                    ByteArrayClassLoader.PackageLookupStrategy packageLookupStrategy = ByteArrayClassLoader.f416660h;
                    HashMap map3 = new HashMap();
                    for (Map.Entry<TypeDescription, byte[]> entry2 : map.entrySet()) {
                        map3.put(entry2.getKey().getName(), entry2.getValue());
                    }
                    ByteArrayClassLoader byteArrayClassLoader = new ByteArrayClassLoader(classLoader, this.f416780g, map3, this.f416775b, this.f416776c, this.f416777d);
                    linkedHashMap = new LinkedHashMap();
                    for (TypeDescription typeDescription2 : map.keySet()) {
                        try {
                            Class<?> cls2 = Class.forName(typeDescription2.getName(), false, byteArrayClassLoader);
                            if (!GraalImageCode.a().f418862c && z13 && cls2.getClassLoader() != byteArrayClassLoader) {
                                throw new IllegalStateException("Class already loaded: " + cls2);
                            }
                            linkedHashMap.put(typeDescription2, cls2);
                        } catch (ClassNotFoundException e13) {
                            throw new IllegalStateException(D8.o("Cannot load class ", typeDescription2), e13);
                        }
                    }
                }
                return linkedHashMap;
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
            
                if (r2 != null) goto L30;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean equals(@net.bytebuddy.utility.nullability.b java.lang.Object r5) {
                /*
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    r1 = 0
                    if (r5 != 0) goto L8
                    return r1
                L8:
                    java.lang.Class r2 = r4.getClass()
                    java.lang.Class r3 = r5.getClass()
                    if (r2 == r3) goto L13
                    return r1
                L13:
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default$b r5 = (net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.b) r5
                    boolean r2 = r5.f416778e
                    boolean r3 = r4.f416778e
                    if (r3 == r2) goto L1c
                    return r1
                L1c:
                    boolean r2 = r4.f416779f
                    boolean r3 = r5.f416779f
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    boolean r2 = r4.f416780g
                    boolean r3 = r5.f416780g
                    if (r2 == r3) goto L2a
                    return r1
                L2a:
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r2 = r4.f416776c
                    net.bytebuddy.dynamic.loading.ByteArrayClassLoader$PersistenceHandler r3 = r5.f416776c
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L35
                    return r1
                L35:
                    java.security.ProtectionDomain r2 = r4.f416775b
                    java.security.ProtectionDomain r3 = r5.f416775b
                    if (r3 == 0) goto L44
                    if (r2 == 0) goto L46
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L47
                    return r1
                L44:
                    if (r2 == 0) goto L47
                L46:
                    return r1
                L47:
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r2 = r4.f416777d
                    net.bytebuddy.dynamic.loading.PackageDefinitionStrategy$Trivial r5 = r5.f416777d
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L52
                    return r1
                L52:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                int iHashCode = getClass().hashCode() * 31;
                ProtectionDomain protectionDomain = this.f416775b;
                if (protectionDomain != null) {
                    iHashCode += protectionDomain.hashCode();
                }
                return ((((((this.f416777d.hashCode() + ((this.f416776c.hashCode() + (iHashCode * 31)) * 31)) * 31) + (this.f416778e ? 1 : 0)) * 31) + (this.f416779f ? 1 : 0)) * 31) + (this.f416780g ? 1 : 0);
            }

            public b(@net.bytebuddy.utility.nullability.b ProtectionDomain protectionDomain, PackageDefinitionStrategy.Trivial trivial, ByteArrayClassLoader.PersistenceHandler persistenceHandler, boolean z12, boolean z13, boolean z14) {
                this.f416775b = protectionDomain;
                this.f416777d = trivial;
                this.f416776c = persistenceHandler;
                this.f416778e = z12;
                this.f416779f = z13;
                this.f416780g = z14;
            }
        }

        static {
            ByteArrayClassLoader.PersistenceHandler persistenceHandler = ByteArrayClassLoader.PersistenceHandler.f416677d;
            Default r02 = new Default("WRAPPER", 0, new b(persistenceHandler, false));
            f416767c = r02;
            ByteArrayClassLoader.PersistenceHandler persistenceHandler2 = ByteArrayClassLoader.PersistenceHandler.f416676c;
            Default r12 = new Default("WRAPPER_PERSISTENT", 1, new b(persistenceHandler2, false));
            f416768d = r12;
            Default r32 = new Default("CHILD_FIRST", 2, new b(persistenceHandler, true));
            Default r22 = new Default("CHILD_FIRST_PERSISTENT", 3, new b(persistenceHandler2, true));
            Default r42 = new Default("INJECTION", 4, new a());
            f416769e = r42;
            f416770f = new Default[]{r02, r12, r32, r22, r42};
        }

        public Default(String str, int i12, a aVar) {
            this.f416771b = aVar;
        }

        public static Default valueOf(String str) {
            return (Default) Enum.valueOf(Default.class, str);
        }

        public static Default[] values() {
            return (Default[]) f416770f.clone();
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy.a
        public final a<ClassLoader> a(ProtectionDomain protectionDomain) {
            return this.f416771b.a(protectionDomain);
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return this.f416771b.b(classLoader, map);
        }
    }

    public interface a<S extends ClassLoader> extends ClassLoadingStrategy<S> {
        a<S> a(ProtectionDomain protectionDomain);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class b implements ClassLoadingStrategy<ClassLoader> {
        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return (classLoader == null ? new ClassInjector.UsingInstrumentation(ClassInjector.UsingInstrumentation.Target.f416706c, new g()) : new ClassInjector.UsingReflection(classLoader)).a(map);
        }

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
            getClass().hashCode();
            throw null;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class c implements ClassLoadingStrategy<ClassLoader> {
        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return new ClassInjector.UsingUnsafe(classLoader).a(map);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return getClass().hashCode() * 31;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class d implements ClassLoadingStrategy<ClassLoader> {
        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return new ClassInjector.UsingUnsafe(classLoader).a(map);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return getClass().hashCode() * 31;
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class e implements ClassLoadingStrategy<ClassLoader> {

        /* renamed from: b, reason: collision with root package name */
        public final ClassInjector.c f416781b;

        public e(ClassInjector.c cVar) {
            this.f416781b = cVar;
        }

        public static e c(Object obj) {
            ClassInjector.c.a aVar = ClassInjector.c.f416763c;
            if (!JavaType.f418907k.a()) {
                throw new IllegalStateException("The current VM does not support class definition via method handle lookups");
            }
            if (!JavaType.f418904h.b(obj)) {
                throw new IllegalArgumentException(k.a(obj, "Not a method handle lookup: "));
            }
            if ((ClassInjector.c.f416764d.c() & 8) != 0) {
                return new e(new ClassInjector.c(obj));
            }
            throw new IllegalArgumentException(k.a(obj, "Lookup does not imply package-access: "));
        }

        @Override // net.bytebuddy.dynamic.loading.ClassLoadingStrategy
        public final Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b ClassLoader classLoader, Map<TypeDescription, byte[]> map) {
            return this.f416781b.a(map);
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416781b.equals(((e) obj).f416781b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f416781b.hashCode() + (getClass().hashCode() * 31);
        }
    }

    Map<TypeDescription, Class<?>> b(@net.bytebuddy.utility.nullability.b T t12, Map<TypeDescription, byte[]> map);
}
