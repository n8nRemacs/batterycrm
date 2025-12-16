package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import g51.C40534a;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Collection;
import k51.InterfaceC42516a;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;

/* compiled from: ReflectJavaMember.kt */
@s0
/* loaded from: classes8.dex */
public abstract class B extends x implements InterfaceC42896h, D, k51.q {
    @Override // k51.InterfaceC42519d
    public final InterfaceC42516a F(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations = ((AnnotatedElement) p()).getDeclaredAnnotations();
        if (declaredAnnotations != null) {
            return C42897i.a(declaredAnnotations, cVar);
        }
        return null;
    }

    @Override // k51.s
    public final boolean b() {
        return Modifier.isStatic(p().getModifiers());
    }

    public final boolean equals(@Y61.l Object obj) {
        return (obj instanceof B) && L.f(p(), ((B) obj).p());
    }

    @Override // k51.InterfaceC42519d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations = ((AnnotatedElement) p()).getDeclaredAnnotations();
        return declaredAnnotations != null ? C42897i.b(declaredAnnotations) : C42784z0.f406748b;
    }

    @Override // k51.t
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        String name = p().getName();
        kotlin.reflect.jvm.internal.impl.name.f fVarE = name != null ? kotlin.reflect.jvm.internal.impl.name.f.e(name) : null;
        return fVarE == null ? kotlin.reflect.jvm.internal.impl.name.h.f409257b : fVarE;
    }

    @Override // k51.s
    @Y61.k
    public final p0 getVisibility() {
        int modifiers = p().getModifiers();
        return Modifier.isPublic(modifiers) ? o0.h.f407780c : Modifier.isPrivate(modifiers) ? o0.e.f407777c : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? C40534a.c.f396284c : C40534a.b.f396283c : C40534a.C11189a.f396282c;
    }

    public final int hashCode() {
        return p().hashCode();
    }

    @Override // k51.s
    public final boolean isAbstract() {
        return Modifier.isAbstract(p().getModifiers());
    }

    @Override // k51.s
    public final boolean isFinal() {
        return Modifier.isFinal(p().getModifiers());
    }

    @Override // k51.q
    public final t k() {
        return new t(p().getDeclaringClass());
    }

    @Y61.k
    public abstract Member p();

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList q(@Y61.k java.lang.reflect.Type[] r13, @Y61.k java.lang.annotation.Annotation[][] r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.B.q(java.lang.reflect.Type[], java.lang.annotation.Annotation[][], boolean):java.util.ArrayList");
    }

    @Y61.k
    public final String toString() {
        return getClass().getName() + ": " + p();
    }
}
