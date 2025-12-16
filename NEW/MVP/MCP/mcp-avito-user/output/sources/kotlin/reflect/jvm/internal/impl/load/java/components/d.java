package kotlin.reflect.jvm.internal.impl.load.java.components;

import k51.InterfaceC42516a;
import k51.InterfaceC42519d;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.load.java.E;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final d f408016a = new d();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f408017b = kotlin.reflect.jvm.internal.impl.name.f.e("message");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f408018c = kotlin.reflect.jvm.internal.impl.name.f.e("allowedTargets");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.name.f f408019d = kotlin.reflect.jvm.internal.impl.name.f.e("value");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final Object f408020e = P0.g(new Q(n.a.f407395u, E.f407916c), new Q(n.a.f407398x, E.f407917d), new Q(n.a.f407399y, E.f407919f));

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
    @Y61.l
    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.g a(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar, @Y61.k InterfaceC42519d interfaceC42519d, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar) {
        InterfaceC42516a interfaceC42516aF;
        InterfaceC42516a interfaceC42516aF2;
        if (cVar.equals(n.a.f407388n) && (interfaceC42516aF2 = interfaceC42519d.F(E.f407918e)) != null) {
            return new g(interfaceC42516aF2, hVar);
        }
        kotlin.reflect.jvm.internal.impl.name.c cVar2 = (kotlin.reflect.jvm.internal.impl.name.c) f408020e.get(cVar);
        if (cVar2 == null || (interfaceC42516aF = interfaceC42519d.F(cVar2)) == null) {
            return null;
        }
        f408016a.getClass();
        return b(interfaceC42516aF, hVar, false);
    }

    @Y61.l
    public static kotlin.reflect.jvm.internal.impl.load.java.descriptors.g b(@Y61.k InterfaceC42516a interfaceC42516a, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, boolean z12) {
        kotlin.reflect.jvm.internal.impl.name.b bVarC = interfaceC42516a.c();
        if (bVarC.equals(kotlin.reflect.jvm.internal.impl.name.b.j(E.f407916c))) {
            return new k(interfaceC42516a, hVar);
        }
        if (bVarC.equals(kotlin.reflect.jvm.internal.impl.name.b.j(E.f407917d))) {
            return new j(interfaceC42516a, hVar);
        }
        if (bVarC.equals(kotlin.reflect.jvm.internal.impl.name.b.j(E.f407919f))) {
            return new c(hVar, interfaceC42516a, n.a.f407399y);
        }
        if (bVarC.equals(kotlin.reflect.jvm.internal.impl.name.b.j(E.f407918e))) {
            return null;
        }
        return new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.e(interfaceC42516a, hVar, z12);
    }
}
