package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;
import k51.InterfaceC42516a;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ReflectJavaTypeParameter.kt */
@s0
/* loaded from: classes8.dex */
public final class I extends x implements InterfaceC42896h, k51.y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TypeVariable<?> f407828a;

    public I(@Y61.k TypeVariable<?> typeVariable) {
        this.f407828a = typeVariable;
    }

    @Override // k51.InterfaceC42519d
    public final InterfaceC42516a F(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.f407828a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return C42897i.a(declaredAnnotations, cVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof I) {
            if (L.f(this.f407828a, ((I) obj).f407828a)) {
                return true;
            }
        }
        return false;
    }

    @Override // k51.InterfaceC42519d
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable<?> typeVariable = this.f407828a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? C42784z0.f406748b : C42897i.b(declaredAnnotations);
    }

    @Override // k51.t
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        return kotlin.reflect.jvm.internal.impl.name.f.e(this.f407828a.getName());
    }

    @Override // k51.y
    public final Collection getUpperBounds() {
        Type[] bounds = this.f407828a.getBounds();
        ArrayList arrayList = new ArrayList(bounds.length);
        for (Type type : bounds) {
            arrayList.add(new v(type));
        }
        v vVar = (v) C42745f0.w0(arrayList);
        RandomAccess randomAccess = arrayList;
        if (L.f(vVar != null ? vVar.f407873b : null, Object.class)) {
            randomAccess = C42784z0.f406748b;
        }
        return (Collection) randomAccess;
    }

    public final int hashCode() {
        return this.f407828a.hashCode();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.compose.ui.graphics.colorspace.e.u(I.class, sb2, ": ");
        sb2.append(this.f407828a);
        return sb2.toString();
    }
}
