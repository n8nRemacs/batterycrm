package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.load.kotlin.z;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes8.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final c f407806a = new c();

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object, kotlin.C] */
    public static kotlin.reflect.jvm.internal.impl.resolve.constants.f a(Class cls) {
        int i12 = 0;
        while (cls.isArray()) {
            i12++;
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls.equals(Void.TYPE)) {
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407379e.g()), i12);
            }
            PrimitiveType primitiveTypeD = JvmPrimitiveType.b(cls.getName()).d();
            return i12 > 0 ? new kotlin.reflect.jvm.internal.impl.resolve.constants.f(kotlin.reflect.jvm.internal.impl.name.b.j((kotlin.reflect.jvm.internal.impl.name.c) primitiveTypeD.f407173e.getValue()), i12 - 1) : new kotlin.reflect.jvm.internal.impl.resolve.constants.f(kotlin.reflect.jvm.internal.impl.name.b.j((kotlin.reflect.jvm.internal.impl.name.c) primitiveTypeD.f407172d.getValue()), i12);
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarA = C42892d.a(cls);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407238a;
        kotlin.reflect.jvm.internal.impl.name.c cVarB = bVarA.b();
        cVar.getClass();
        kotlin.reflect.jvm.internal.impl.name.b bVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f407246i.get(cVarB.i());
        if (bVar != null) {
            bVarA = bVar;
        }
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.f(bVarA, i12);
    }

    public static void b(@Y61.k Class cls, @Y61.k z.c cVar) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        for (Annotation annotation : cls.getDeclaredAnnotations()) {
            c(cVar, annotation);
        }
        cVar.a();
    }

    public static void c(z.c cVar, Annotation annotation) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsF = ((InterfaceC42819t) X41.b.a(annotation)).f();
        z.a aVarB = cVar.b(C42892d.a(clsF), new b(annotation));
        if (aVarB != null) {
            f407806a.getClass();
            d(aVarB, annotation, clsF);
        }
    }

    public static void d(z.a aVar, Annotation annotation, Class cls) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        for (Method method : cls.getDeclaredMethods()) {
            try {
                Object objInvoke = method.invoke(annotation, new Object[0]);
                kotlin.reflect.jvm.internal.impl.name.f fVarE = kotlin.reflect.jvm.internal.impl.name.f.e(method.getName());
                Class<?> enclosingClass = objInvoke.getClass();
                if (enclosingClass.equals(Class.class)) {
                    aVar.f(fVarE, a((Class) objInvoke));
                } else if (i.f407813a.contains(enclosingClass)) {
                    aVar.b(objInvoke, fVarE);
                } else {
                    List<kotlin.reflect.d<? extends Object>> list = C42892d.f407849a;
                    if (Enum.class.isAssignableFrom(enclosingClass)) {
                        if (!enclosingClass.isEnum()) {
                            enclosingClass = enclosingClass.getEnclosingClass();
                        }
                        aVar.e(fVarE, C42892d.a(enclosingClass), kotlin.reflect.jvm.internal.impl.name.f.e(((Enum) objInvoke).name()));
                    } else if (Annotation.class.isAssignableFrom(enclosingClass)) {
                        Class cls2 = (Class) C42756l.Z(enclosingClass.getInterfaces());
                        z.a aVarD = aVar.d(C42892d.a(cls2), fVarE);
                        if (aVarD != null) {
                            d(aVarD, (Annotation) objInvoke, cls2);
                        }
                    } else {
                        if (!enclosingClass.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + enclosingClass + "): " + objInvoke);
                        }
                        z.b bVarC = aVar.c(fVarE);
                        if (bVarC != null) {
                            Class<?> componentType = enclosingClass.getComponentType();
                            if (componentType.isEnum()) {
                                kotlin.reflect.jvm.internal.impl.name.b bVarA = C42892d.a(componentType);
                                for (Object obj : (Object[]) objInvoke) {
                                    bVarC.d(bVarA, kotlin.reflect.jvm.internal.impl.name.f.e(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) objInvoke) {
                                    bVarC.e(a((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) objInvoke) {
                                    z.a aVarC = bVarC.c(C42892d.a(componentType));
                                    if (aVarC != null) {
                                        d(aVarC, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) objInvoke) {
                                    bVarC.b(obj4);
                                }
                            }
                            bVarC.a();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.a();
    }
}
