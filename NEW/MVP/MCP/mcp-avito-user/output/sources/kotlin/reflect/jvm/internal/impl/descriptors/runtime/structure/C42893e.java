package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import k51.InterfaceC42516a;
import kotlin.jvm.internal.InterfaceC42819t;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC42894f;

/* compiled from: ReflectJavaAnnotation.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42893e extends x implements InterfaceC42516a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Annotation f407855a;

    public C42893e(@Y61.k Annotation annotation) {
        this.f407855a = annotation;
    }

    @Override // k51.InterfaceC42516a
    @Y61.k
    public final ArrayList D() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Annotation annotation = this.f407855a;
        Method[] declaredMethods = ((InterfaceC42819t) X41.b.a(annotation)).f().getDeclaredMethods();
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC42894f.a aVar = AbstractC42894f.f407856b;
            Object objInvoke = method.invoke(annotation, new Object[0]);
            kotlin.reflect.jvm.internal.impl.name.f fVarE = kotlin.reflect.jvm.internal.impl.name.f.e(method.getName());
            aVar.getClass();
            arrayList.add(AbstractC42894f.a.a(objInvoke, fVarE));
        }
        return arrayList;
    }

    @Override // k51.InterfaceC42516a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b c() {
        return C42892d.a(((InterfaceC42819t) X41.b.a(this.f407855a)).f());
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof C42893e) {
            if (this.f407855a == ((C42893e) obj).f407855a) {
                return true;
            }
        }
        return false;
    }

    @Override // k51.InterfaceC42516a
    public final t f() {
        return new t(((InterfaceC42819t) X41.b.a(this.f407855a)).f());
    }

    public final int hashCode() {
        return System.identityHashCode(this.f407855a);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.compose.ui.graphics.colorspace.e.u(C42893e.class, sb2, ": ");
        sb2.append(this.f407855a);
        return sb2.toString();
    }
}
