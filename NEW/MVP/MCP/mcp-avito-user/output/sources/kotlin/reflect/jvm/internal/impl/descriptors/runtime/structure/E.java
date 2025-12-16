package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import k51.InterfaceC42516a;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: ReflectJavaPackage.kt */
/* loaded from: classes8.dex */
public final class E extends x implements k51.u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f407823a;

    public E(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        this.f407823a = cVar;
    }

    @Override // k51.InterfaceC42519d
    @Y61.l
    public final InterfaceC42516a F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return null;
    }

    @Override // k51.u
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        return this.f407823a;
    }

    @Override // k51.u
    @Y61.k
    public final C42784z0 e() {
        return C42784z0.f406748b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof E) {
            if (L.f(this.f407823a, ((E) obj).f407823a)) {
                return true;
            }
        }
        return false;
    }

    @Override // k51.InterfaceC42519d
    public final Collection getAnnotations() {
        return C42784z0.f406748b;
    }

    public final int hashCode() {
        return this.f407823a.hashCode();
    }

    @Override // k51.u
    @Y61.k
    public final C42784z0 j() {
        return C42784z0.f406748b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.compose.ui.graphics.colorspace.e.u(E.class, sb2, ": ");
        sb2.append(this.f407823a);
        return sb2.toString();
    }
}
