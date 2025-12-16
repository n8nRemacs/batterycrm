package kotlin.reflect.jvm.internal;

import i51.InterfaceC41229c;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42869m;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.load.java.C42911d;
import kotlin.reflect.jvm.internal.impl.load.java.components.h;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.d;
import kotlin.reflect.jvm.internal.impl.load.java.s;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C42930h;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C42934l;
import kotlin.reflect.jvm.internal.impl.load.kotlin.F;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42945d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42957n;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42953j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.InterfaceC42955l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.x;
import kotlin.reflect.jvm.internal.impl.types.C42996v;
import kotlin.reflect.jvm.internal.impl.types.checker.p;
import q51.C47206b;
import t51.C48505a;

/* compiled from: moduleByClassLoader.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final ConcurrentHashMap f407073a = new ConcurrentHashMap();

    @Y61.k
    public static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a(@Y61.k Class<?> cls) {
        List<kotlin.reflect.d<? extends Object>> list = C42892d.f407849a;
        ClassLoader classLoader = cls.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        j0 j0Var = new j0(classLoader);
        ConcurrentHashMap concurrentHashMap = f407073a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(j0Var);
        if (weakReference != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentHashMap.remove(j0Var, weakReference);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k.f407815c.getClass();
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g(classLoader);
        C42934l.a aVar = C42934l.f408532b;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g gVar2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.g(G0.class.getClassLoader());
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.d dVar = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.d(classLoader);
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j jVar = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.j.f407814b;
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l lVar = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l.f407818a;
        aVar.getClass();
        kotlin.reflect.jvm.internal.impl.storage.f fVar = new kotlin.reflect.jvm.internal.impl.storage.f("DeserializationComponentsForJava.ModuleData");
        JvmBuiltIns.Kind[] kindArr = JvmBuiltIns.Kind.f407231b;
        JvmBuiltIns jvmBuiltIns = new JvmBuiltIns(fVar);
        kotlin.reflect.jvm.internal.impl.descriptors.impl.G g12 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.G(kotlin.reflect.jvm.internal.impl.name.f.h("<" + ("runtime module for " + classLoader) + '>'), fVar, jvmBuiltIns, null, null, null, 56, null);
        jvmBuiltIns.I(g12);
        jvmBuiltIns.K(g12);
        kotlin.reflect.jvm.internal.impl.load.kotlin.o oVar = new kotlin.reflect.jvm.internal.impl.load.kotlin.o();
        kotlin.reflect.jvm.internal.impl.load.java.lazy.l lVar2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.l();
        kotlin.reflect.jvm.internal.impl.descriptors.H h12 = new kotlin.reflect.jvm.internal.impl.descriptors.H(fVar, g12);
        F.a aVar2 = F.a.f408432a;
        kotlin.reflect.jvm.internal.impl.load.java.components.l lVar3 = kotlin.reflect.jvm.internal.impl.load.java.components.l.f408036a;
        kotlin.reflect.jvm.internal.impl.load.java.components.i iVar = kotlin.reflect.jvm.internal.impl.load.java.components.i.f408029a;
        h.a aVar3 = h.a.f408028a;
        C42784z0 c42784z0 = C42784z0.f406748b;
        C47206b c47206b = new C47206b(fVar, c42784z0);
        e0.a aVar4 = e0.a.f407541a;
        InterfaceC41229c.a aVar5 = InterfaceC41229c.a.f398361a;
        kotlin.reflect.jvm.internal.impl.builtins.l lVar4 = new kotlin.reflect.jvm.internal.impl.builtins.l(g12, h12);
        j0 j0Var2 = j0Var;
        kotlin.reflect.jvm.internal.impl.load.java.z.f408422d.getClass();
        ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
        kotlin.reflect.jvm.internal.impl.load.java.z zVar = kotlin.reflect.jvm.internal.impl.load.java.z.f408423e;
        C42911d c42911d = new C42911d(zVar);
        d.b bVar = d.b.f408100a;
        kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r rVar = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.r(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.g(bVar));
        s.a aVar6 = s.a.f408301a;
        kotlin.reflect.jvm.internal.impl.types.checker.p.f410117b.getClass();
        kotlin.reflect.jvm.internal.impl.types.checker.q qVar = p.a.f410119b;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.g gVar3 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.g(new kotlin.reflect.jvm.internal.impl.load.java.lazy.c(fVar, dVar, gVar, oVar, lVar3, jVar, iVar, aVar3, c47206b, lVar, lVar2, aVar2, aVar4, aVar5, g12, lVar4, c42911d, rVar, aVar6, bVar, qVar, zVar, new kotlin.reflect.jvm.internal.impl.load.kotlin.m(), null, 8388608, null));
        m51.e eVar = m51.e.f414319g;
        kotlin.reflect.jvm.internal.impl.load.kotlin.q qVar2 = new kotlin.reflect.jvm.internal.impl.load.kotlin.q(gVar, oVar);
        C42930h c42930h = new C42930h(g12, h12, fVar, gVar);
        c42930h.f408474h = eVar;
        InterfaceC42955l.a aVar7 = InterfaceC42955l.a.f409935a;
        InterfaceC42953j.f409911a.getClass();
        InterfaceC42953j.a.C11692a c11692a = InterfaceC42953j.a.f409913b;
        C42954k c42954k = new C42934l(fVar, g12, aVar7, qVar2, c42930h, gVar3, h12, jVar, aVar5, c11692a, qVar, new C48505a(Collections.singletonList(C42996v.f410262a))).f408533a;
        oVar.f408539a = c42954k;
        lVar2.f408264a = new p51.c(gVar3, iVar);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.l lVarJ = jvmBuiltIns.J();
        kotlin.reflect.jvm.internal.impl.builtins.jvm.l lVarJ2 = jvmBuiltIns.J();
        C47206b c47206b2 = new C47206b(fVar, c42784z0);
        kotlin.reflect.jvm.internal.impl.builtins.jvm.v vVar = new kotlin.reflect.jvm.internal.impl.builtins.jvm.v(fVar, gVar2, g12);
        C42957n c42957n = new C42957n(vVar);
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a aVar8 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.f409779m;
        vVar.f409777d = new C42954k(fVar, g12, aVar7, c42957n, new C42945d(g12, h12, aVar8), vVar, x.a.f409964a, kotlin.reflect.jvm.internal.impl.serialization.deserialization.s.f409955a, aVar5, t.a.f409956a, C42745f0.U(new kotlin.reflect.jvm.internal.impl.builtins.functions.a(fVar, g12), new kotlin.reflect.jvm.internal.impl.builtins.jvm.e(fVar, g12, null, 4, null)), h12, c11692a, lVarJ, lVarJ2, aVar8.f437473a, qVar, c47206b2, null, kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.f409963a, 262144, null);
        List listG0 = C42756l.g0(new kotlin.reflect.jvm.internal.impl.descriptors.impl.G[]{g12});
        B0 b02 = B0.f406639b;
        g12.f407556h = new kotlin.reflect.jvm.internal.impl.descriptors.impl.D(listG0, b02, c42784z0, b02);
        g12.f407557i = new C42869m(C42745f0.U(gVar3, vVar), "CompositeProvider@RuntimeModuleData for " + g12);
        kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar2 = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k(c42954k, new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a(gVar, oVar), null);
        while (true) {
            j0 j0Var3 = j0Var2;
            ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
            WeakReference weakReference2 = (WeakReference) concurrentHashMap3.putIfAbsent(j0Var3, new WeakReference(kVar2));
            if (weakReference2 == null) {
                return kVar2;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k kVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) weakReference2.get();
            if (kVar3 != null) {
                return kVar3;
            }
            concurrentHashMap3.remove(j0Var3, weakReference2);
            j0Var2 = j0Var3;
            concurrentHashMap2 = concurrentHashMap3;
        }
    }
}
