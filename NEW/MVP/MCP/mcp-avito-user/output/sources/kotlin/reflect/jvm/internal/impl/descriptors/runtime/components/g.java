package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import k51.InterfaceC42522g;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;

/* compiled from: ReflectKotlinClassFinder.kt */
@s0
/* loaded from: classes8.dex */
public final class g implements x {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ClassLoader f407811a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.e f407812b = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.e();

    public g(@Y61.k ClassLoader classLoader) {
        this.f407811a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
    @Y61.l
    public final x.a.b a(@Y61.k kotlin.reflect.jvm.internal.impl.name.b bVar) throws ClassNotFoundException {
        Class<?> cls;
        String strReplace = bVar.h().b().replace('.', '$');
        if (!bVar.g().d()) {
            strReplace = bVar.g() + '.' + strReplace;
        }
        try {
            cls = Class.forName(strReplace, false, this.f407811a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        f.f407808c.getClass();
        f fVarA = f.a.a(cls);
        if (fVarA != null) {
            return new x.a.b(fVarA, null, 2, null);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.x
    @Y61.l
    public final x.a.b b(@Y61.k InterfaceC42522g interfaceC42522g) throws ClassNotFoundException {
        Class<?> cls;
        try {
            cls = Class.forName(interfaceC42522g.d().b(), false, this.f407811a);
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        f.f407808c.getClass();
        f fVarA = f.a.a(cls);
        if (fVarA != null) {
            return new x.a.b(fVarA, null, 2, null);
        }
        return null;
    }
}
