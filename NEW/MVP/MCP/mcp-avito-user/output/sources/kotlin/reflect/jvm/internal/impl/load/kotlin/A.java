package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;

/* compiled from: KotlinJvmBinaryPackageSourceElement.kt */
/* loaded from: classes8.dex */
public final class A implements b0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n f408428b;

    public A(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n nVar) {
        this.f408428b = nVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.b0
    @Y61.k
    public final c0 a() {
        return c0.f407540a;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n nVar = this.f408428b;
        sb2.append(nVar);
        sb2.append(": ");
        nVar.getClass();
        kotlin.reflect.n<Object> nVar2 = kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.n.f408174p[0];
        sb2.append(((Map) nVar.f408178k.invoke()).keySet());
        return sb2.toString();
    }
}
