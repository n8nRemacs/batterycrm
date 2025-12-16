package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.E;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t;
import kotlin.reflect.jvm.internal.impl.load.java.r;

/* compiled from: ReflectJavaClassFinder.kt */
/* loaded from: classes8.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClassLoader f407807a;

    public d(@Y61.k ClassLoader classLoader) {
        this.f407807a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.r
    @Y61.l
    public final E a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return new E(cVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.r
    @Y61.l
    public final t b(@Y61.k r.a aVar) throws ClassNotFoundException {
        Class<?> cls;
        kotlin.reflect.jvm.internal.impl.name.b bVar = aVar.f408298a;
        kotlin.reflect.jvm.internal.impl.name.c cVarG = bVar.g();
        String strReplace = bVar.h().b().replace('.', '$');
        if (!cVarG.d()) {
            strReplace = cVarG.b() + '.' + strReplace;
        }
        try {
            cls = Class.forName(strReplace, false, this.f407807a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls != null) {
            return new t(cls);
        }
        return null;
    }
}
