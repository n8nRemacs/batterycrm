package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;

/* compiled from: JavaToKotlinClassMapper.kt */
@s0
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f407256a = new d();

    @Y61.k
    public static InterfaceC42851d a(@Y61.k InterfaceC42851d interfaceC42851d) {
        kotlin.reflect.jvm.internal.impl.name.d dVarG = kotlin.reflect.jvm.internal.impl.resolve.j.g(interfaceC42851d);
        c.f407238a.getClass();
        kotlin.reflect.jvm.internal.impl.name.c cVar = c.f407249l.get(dVarG);
        if (cVar != null) {
            return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(interfaceC42851d).i(cVar);
        }
        throw new IllegalArgumentException("Given class " + interfaceC42851d + " is not a read-only collection");
    }

    public static InterfaceC42851d b(d dVar, kotlin.reflect.jvm.internal.impl.name.c cVar, kotlin.reflect.jvm.internal.impl.builtins.k kVar) {
        dVar.getClass();
        c.f407238a.getClass();
        kotlin.reflect.jvm.internal.impl.name.b bVar = c.f407246i.get(cVar.i());
        if (bVar != null) {
            return kVar.i(bVar.b());
        }
        return null;
    }
}
