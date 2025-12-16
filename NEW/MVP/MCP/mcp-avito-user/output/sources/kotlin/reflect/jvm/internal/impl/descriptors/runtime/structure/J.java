package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.util.Collection;
import k51.InterfaceC42513B;
import k51.InterfaceC42516a;
import kotlin.jvm.internal.s0;

/* compiled from: ReflectJavaValueParameter.kt */
@s0
/* loaded from: classes8.dex */
public final class J extends x implements InterfaceC42513B {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final H f407829a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Annotation[] f407830b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f407831c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f407832d;

    public J(@Y61.k H h12, @Y61.k Annotation[] annotationArr, @Y61.l String str, boolean z12) {
        this.f407829a = h12;
        this.f407830b = annotationArr;
        this.f407831c = str;
        this.f407832d = z12;
    }

    @Override // k51.InterfaceC42519d
    public final InterfaceC42516a F(kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return C42897i.a(this.f407830b, cVar);
    }

    @Override // k51.InterfaceC42513B
    public final boolean a() {
        return this.f407832d;
    }

    @Override // k51.InterfaceC42519d
    public final Collection getAnnotations() {
        return C42897i.b(this.f407830b);
    }

    @Override // k51.InterfaceC42513B
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        String str = this.f407831c;
        if (str != null) {
            return kotlin.reflect.jvm.internal.impl.name.f.d(str);
        }
        return null;
    }

    @Override // k51.InterfaceC42513B
    public final k51.x getType() {
        return this.f407829a;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.compose.ui.graphics.colorspace.e.u(J.class, sb2, ": ");
        sb2.append(this.f407832d ? "vararg " : "");
        sb2.append(getName());
        sb2.append(": ");
        sb2.append(this.f407829a);
        return sb2.toString();
    }
}
