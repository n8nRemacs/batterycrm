package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import g51.C40534a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k51.InterfaceC42516a;
import k51.InterfaceC42522g;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;
import kotlin.text.C43066x;

/* compiled from: ReflectJavaClass.kt */
@s0
/* loaded from: classes8.dex */
public final class t extends x implements InterfaceC42896h, D, InterfaceC42522g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Class<?> f407871a;

    public t(@Y61.k Class<?> cls) {
        this.f407871a = cls;
    }

    @Override // k51.InterfaceC42522g
    public final boolean A() {
        Boolean bool;
        C42890b.f407839a.getClass();
        Method method = C42890b.a().f407843c;
        if (method == null) {
            bool = null;
        } else {
            bool = (Boolean) method.invoke(this.f407871a, new Object[0]);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // k51.InterfaceC42522g
    public final boolean B() {
        Boolean bool;
        C42890b.f407839a.getClass();
        Method method = C42890b.a().f407841a;
        if (method == null) {
            bool = null;
        } else {
            bool = (Boolean) method.invoke(this.f407871a, new Object[0]);
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // k51.InterfaceC42522g
    @Y61.k
    public final Collection<k51.j> C() {
        Class cls;
        Class<?> cls2 = this.f407871a;
        cls = Object.class;
        if (L.f(cls2, cls)) {
            return C42784z0.f406748b;
        }
        t0 t0Var = new t0(2);
        Object genericSuperclass = cls2.getGenericSuperclass();
        t0Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
        t0Var.b(cls2.getGenericInterfaces());
        ArrayList<Object> arrayList = t0Var.f406850a;
        List listU = C42745f0.U(arrayList.toArray(new Type[arrayList.size()]));
        ArrayList arrayList2 = new ArrayList(C42745f0.q(listU, 10));
        Iterator it = listU.iterator();
        while (it.hasNext()) {
            arrayList2.add(new v((Type) it.next()));
        }
        return arrayList2;
    }

    @Override // k51.InterfaceC42522g
    public final boolean E() {
        return this.f407871a.isInterface();
    }

    @Override // k51.InterfaceC42519d
    public final InterfaceC42516a F(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.f407871a;
        if (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C42897i.a(declaredAnnotations, cVar);
    }

    @Override // k51.InterfaceC42522g
    public final Collection G() {
        return C43033p.D(new o0(C43033p.l(C42756l.f(this.f407871a.getDeclaredConstructors()), l.f407863b), m.f407864b));
    }

    @Override // k51.InterfaceC42522g
    public final boolean I() {
        return this.f407871a.isEnum();
    }

    @Override // k51.InterfaceC42522g
    public final Collection L() {
        return C43033p.D(new o0(C43033p.i(C42756l.f(this.f407871a.getDeclaredMethods()), new r(this)), s.f407870b));
    }

    @Override // k51.InterfaceC42522g
    public final t M() {
        Class<?> declaringClass = this.f407871a.getDeclaringClass();
        if (declaringClass != null) {
            return new t(declaringClass);
        }
        return null;
    }

    @Override // k51.InterfaceC42522g
    public final boolean N() {
        return this.f407871a.isAnnotation();
    }

    @Override // k51.InterfaceC42522g
    public final Collection O() {
        return C43033p.D(C43033p.y(C43033p.l(C42756l.f(this.f407871a.getDeclaredClasses()), p.f407867l), q.f407868l));
    }

    @Override // k51.InterfaceC42522g
    @Y61.k
    public final Collection<k51.j> P() {
        C42890b.f407839a.getClass();
        Method method = C42890b.a().f407842b;
        Class[] clsArr = method == null ? null : (Class[]) method.invoke(this.f407871a, new Object[0]);
        if (clsArr == null) {
            return C42784z0.f406748b;
        }
        ArrayList arrayList = new ArrayList(clsArr.length);
        for (Class cls : clsArr) {
            arrayList.add(new v(cls));
        }
        return arrayList;
    }

    @Override // k51.s
    public final boolean b() {
        return Modifier.isStatic(this.f407871a.getModifiers());
    }

    @Override // k51.InterfaceC42522g
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        return C42892d.a(this.f407871a).b();
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof t) {
            if (L.f(this.f407871a, ((t) obj).f407871a)) {
                return true;
            }
        }
        return false;
    }

    @Override // k51.InterfaceC42519d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        Class<?> cls = this.f407871a;
        return (cls == null || (declaredAnnotations = cls.getDeclaredAnnotations()) == null) ? C42784z0.f406748b : C42897i.b(declaredAnnotations);
    }

    @Override // k51.InterfaceC42522g
    public final Collection getFields() {
        return C43033p.D(new o0(C43033p.l(C42756l.f(this.f407871a.getDeclaredFields()), n.f407865b), o.f407866b));
    }

    @Override // k51.t
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        Class<?> cls = this.f407871a;
        if (!cls.isAnonymousClass()) {
            return kotlin.reflect.jvm.internal.impl.name.f.e(cls.getSimpleName());
        }
        String name = cls.getName();
        return kotlin.reflect.jvm.internal.impl.name.f.e(C43066x.o0(name, ".", name));
    }

    @Override // k51.z
    @Y61.k
    public final ArrayList getTypeParameters() {
        TypeVariable<Class<?>>[] typeParameters = this.f407871a.getTypeParameters();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Class<?>> typeVariable : typeParameters) {
            arrayList.add(new I(typeVariable));
        }
        return arrayList;
    }

    @Override // k51.s
    @Y61.k
    public final p0 getVisibility() {
        int modifiers = this.f407871a.getModifiers();
        return Modifier.isPublic(modifiers) ? o0.h.f407780c : Modifier.isPrivate(modifiers) ? o0.e.f407777c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C40534a.c.f396284c : C40534a.b.f396283c : C40534a.C11189a.f396282c;
    }

    public final int hashCode() {
        return this.f407871a.hashCode();
    }

    @Override // k51.s
    public final boolean isAbstract() {
        return Modifier.isAbstract(this.f407871a.getModifiers());
    }

    @Override // k51.s
    public final boolean isFinal() {
        return Modifier.isFinal(this.f407871a.getModifiers());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.compose.ui.graphics.colorspace.e.u(t.class, sb2, ": ");
        sb2.append(this.f407871a);
        return sb2.toString();
    }

    @Override // k51.InterfaceC42522g
    @Y61.k
    public final ArrayList z() {
        C42890b.f407839a.getClass();
        Method method = C42890b.a().f407844d;
        Object[] objArr = method == null ? null : (Object[]) method.invoke(this.f407871a, new Object[0]);
        if (objArr == null) {
            objArr = new Object[0];
        }
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(new G(obj));
        }
        return arrayList;
    }
}
