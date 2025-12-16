package net.bytebuddy.dynamic;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Collections;
import net.bytebuddy.build.HashCodeAndEqualsPlugin;
import net.bytebuddy.description.method.a;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.loading.ClassInjector;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.implementation.bytecode.Removal;
import net.bytebuddy.implementation.bytecode.StackManipulation;
import net.bytebuddy.implementation.bytecode.a;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import net.bytebuddy.implementation.bytecode.collection.ArrayFactory.a;
import net.bytebuddy.implementation.bytecode.constant.ClassConstant;
import net.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import net.bytebuddy.implementation.bytecode.constant.NullConstant;
import net.bytebuddy.implementation.bytecode.member.MethodInvocation;
import net.bytebuddy.jar.asm.s;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes8.dex */
public class NexusAccessor {

    /* renamed from: a, reason: collision with root package name */
    public static final Dispatcher f416586a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f416587b;

    public interface Dispatcher {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class CreationAction implements PrivilegedAction<Dispatcher> {

            /* renamed from: b, reason: collision with root package name */
            public static final CreationAction f416588b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ CreationAction[] f416589c;

            static {
                CreationAction creationAction = new CreationAction("INSTANCE", 0);
                f416588b = creationAction;
                f416589c = new CreationAction[]{creationAction};
            }

            public CreationAction() {
                throw null;
            }

            public static CreationAction valueOf(String str) {
                return (CreationAction) Enum.valueOf(CreationAction.class, str);
            }

            public static CreationAction[] values() {
                return (CreationAction[]) f416589c.clone();
            }

            @Override // java.security.PrivilegedAction
            @SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
            public final Dispatcher run() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
                if (Boolean.getBoolean("net.bytebuddy.nexus.disabled")) {
                    return new b("Nexus injection was explicitly disabled");
                }
                try {
                    ClassInjector.UsingReflection usingReflection = new ClassInjector.UsingReflection(ClassLoader.getSystemClassLoader());
                    TypeDescription typeDescriptionA0 = TypeDescription.d.A0(net.bytebuddy.dynamic.b.class);
                    ClassLoader classLoader = ClassFileLocator.ForClassLoader.f416564c;
                    try {
                        ClassLoader classLoader2 = net.bytebuddy.dynamic.b.class.getClassLoader();
                        if (classLoader2 == null) {
                            classLoader2 = ClassFileLocator.ForClassLoader.f416564c;
                        }
                        Class cls = (Class) usingReflection.a(Collections.singletonMap(typeDescriptionA0, ClassFileLocator.ForClassLoader.a(classLoader2, TypeDescription.d.z0(net.bytebuddy.dynamic.b.class)).a())).get(TypeDescription.d.A0(net.bytebuddy.dynamic.b.class));
                        return new a(cls.getMethod("register", String.class, ClassLoader.class, ReferenceQueue.class, Integer.TYPE, Object.class), cls.getMethod("clean", Reference.class));
                    } catch (IOException e12) {
                        throw new IllegalStateException("Cannot read class file for " + net.bytebuddy.dynamic.b.class, e12);
                    }
                } catch (Exception e13) {
                    try {
                        Class<?> clsLoadClass = ClassLoader.getSystemClassLoader().loadClass(net.bytebuddy.dynamic.b.class.getName());
                        try {
                            net.bytebuddy.utility.d dVarC = net.bytebuddy.utility.d.c(NexusAccessor.class);
                            net.bytebuddy.utility.d dVarC2 = net.bytebuddy.utility.d.c(clsLoadClass);
                            if (dVarC != null) {
                                AnnotatedElement annotatedElement = dVarC2.f418924b;
                                if (!net.bytebuddy.utility.d.f418922d.c()) {
                                    Class<?> cls2 = Class.forName("java.lang.Module");
                                    cls2.getMethod("addReads", cls2).invoke(dVarC.f418924b, dVarC2.f418924b);
                                }
                            }
                            return new a(clsLoadClass.getMethod("register", String.class, ClassLoader.class, ReferenceQueue.class, Integer.TYPE, Object.class), clsLoadClass.getMethod("clean", Reference.class));
                        } catch (Exception e14) {
                            return new b(e14.toString());
                        }
                    } catch (Exception unused) {
                        return new b(e13.toString());
                    }
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class a implements Dispatcher {

            /* renamed from: a, reason: collision with root package name */
            public final Method f416590a;

            /* renamed from: b, reason: collision with root package name */
            public final Method f416591b;

            public a(Method method, Method method2) {
                this.f416590a = method;
                this.f416591b = method2;
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public final void a(String str, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, int i12, LoadedTypeInitializer loadedTypeInitializer) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                try {
                    this.f416590a.invoke(null, str, classLoader, null, Integer.valueOf(i12), loadedTypeInitializer);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(e13.getTargetException());
                }
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f416590a.equals(aVar.f416590a) && this.f416591b.equals(aVar.f416591b);
            }

            public final int hashCode() {
                return this.f416591b.hashCode() + ((this.f416590a.hashCode() + (getClass().hashCode() * 31)) * 31);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class b implements Dispatcher {

            /* renamed from: a, reason: collision with root package name */
            public final String f416592a;

            public b(String str) {
                this.f416592a = str;
            }

            @Override // net.bytebuddy.dynamic.NexusAccessor.Dispatcher
            public final void a(String str, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, int i12, LoadedTypeInitializer loadedTypeInitializer) {
                throw new UnsupportedOperationException("Could not initialize Nexus accessor: " + this.f416592a);
            }

            public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj != null && getClass() == obj.getClass()) {
                    return this.f416592a.equals(((b) obj).f416592a);
                }
                return false;
            }

            public final int hashCode() {
                return this.f416592a.hashCode() + (getClass().hashCode() * 31);
            }
        }

        void a(String str, @net.bytebuddy.utility.nullability.b ClassLoader classLoader, int i12, LoadedTypeInitializer loadedTypeInitializer);
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class a implements net.bytebuddy.implementation.bytecode.a {

        /* renamed from: b, reason: collision with root package name */
        public final int f416593b;

        public a(int i12) {
            this.f416593b = i12;
        }

        public final boolean equals(@net.bytebuddy.utility.nullability.b Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f416593b == ((a) obj).f416593b;
            }
            return false;
        }

        @Override // net.bytebuddy.implementation.bytecode.a
        public final a.c h(s sVar, Implementation.Context context, net.bytebuddy.description.method.a aVar) {
            try {
                MethodInvocation.e eVarA = MethodInvocation.a(new a.c(ClassLoader.class.getMethod("getSystemClassLoader", new Class[0])));
                net.bytebuddy.implementation.bytecode.constant.c cVar = new net.bytebuddy.implementation.bytecode.constant.c(b.class.getName());
                MethodInvocation.e eVarA2 = MethodInvocation.a(new a.c(ClassLoader.class.getMethod("loadClass", String.class)));
                net.bytebuddy.implementation.bytecode.constant.c cVar2 = new net.bytebuddy.implementation.bytecode.constant.c("initialize");
                ArrayFactory arrayFactoryA = ArrayFactory.a(TypeDescription.Generic.f416324y2);
                StackManipulation stackManipulationC = ClassConstant.c(TypeDescription.f416319C2);
                Class cls = Integer.TYPE;
                return new a.b(new StackManipulation.b(eVarA, cVar, eVarA2, cVar2, arrayFactoryA.new a(Arrays.asList(stackManipulationC, ClassConstant.c(TypeDescription.d.A0(cls)))), MethodInvocation.a(new a.c(Class.class.getMethod("getMethod", String.class, Class[].class))), NullConstant.f418029b, ArrayFactory.a(TypeDescription.Generic.f416323x2).new a(Arrays.asList(ClassConstant.c(aVar.n().f5()), new StackManipulation.b(IntegerConstant.c(this.f416593b), MethodInvocation.a(new a.c(Integer.class.getMethod("valueOf", cls)))))), MethodInvocation.a(new a.c(Method.class.getMethod("invoke", Object.class, Object[].class))), Removal.f417810e)).h(sVar, context, aVar);
            } catch (NoSuchMethodException e12) {
                throw new IllegalStateException("Cannot locate method", e12);
            }
        }

        public final int hashCode() {
            return (getClass().hashCode() * 31) + this.f416593b;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "java.security.AccessController"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r1 = "net.bytebuddy.securitymanager"
            java.lang.String r2 = "true"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.dynamic.NexusAccessor.f416587b = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r0 = 1
        L17:
            net.bytebuddy.dynamic.NexusAccessor.f416587b = r0
        L19:
            net.bytebuddy.dynamic.NexusAccessor$Dispatcher$CreationAction r0 = net.bytebuddy.dynamic.NexusAccessor.Dispatcher.CreationAction.f416588b
            boolean r1 = net.bytebuddy.dynamic.NexusAccessor.f416587b
            if (r1 == 0) goto L24
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)
            goto L28
        L24:
            java.lang.Object r0 = r0.run()
        L28:
            net.bytebuddy.dynamic.NexusAccessor$Dispatcher r0 = (net.bytebuddy.dynamic.NexusAccessor.Dispatcher) r0
            net.bytebuddy.dynamic.NexusAccessor.f416586a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: net.bytebuddy.dynamic.NexusAccessor.<clinit>():void");
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
