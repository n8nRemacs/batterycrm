package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.Map;
import k51.InterfaceC42516a;
import k51.InterfaceC42517b;
import k51.m;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.n;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes8.dex */
public final class j extends c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f408030h;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408031g;

    /* compiled from: JavaAnnotationMapper.kt */
    @s0
    public static final class a extends N implements Y41.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {
        public a() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
        @Override // Y41.a
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
            KotlinRetention kotlinRetention;
            f fVar = f.f408022a;
            InterfaceC42517b interfaceC42517b = j.this.f408012d;
            fVar.getClass();
            Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> mapSingletonMap = null;
            m mVar = interfaceC42517b instanceof m ? (m) interfaceC42517b : null;
            kotlin.reflect.jvm.internal.impl.resolve.constants.k kVar = (mVar == null || (kotlinRetention = (KotlinRetention) f.f408024c.get(mVar.e().b())) == null) ? null : new kotlin.reflect.jvm.internal.impl.resolve.constants.k(kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407397w), kotlin.reflect.jvm.internal.impl.name.f.e(kotlinRetention.name()));
            if (kVar != null) {
                d.f408016a.getClass();
                mapSingletonMap = Collections.singletonMap(d.f408019d, kVar);
            }
            return mapSingletonMap == null ? P0.c() : mapSingletonMap;
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408030h = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(j.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public j(@Y61.k InterfaceC42516a interfaceC42516a, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar) {
        super(hVar, interfaceC42516a, n.a.f407398x);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        this.f408031g = cVar.f408076a.g(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        kotlin.reflect.n<Object> nVar = f408030h[0];
        return (Map) this.f408031g.invoke();
    }
}
