package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Collections;
import java.util.Map;
import k51.InterfaceC42516a;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.resolve.constants.x;
import kotlin.reflect.n;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes8.dex */
public final class g extends c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f408025h;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408026g;

    /* compiled from: JavaAnnotationMapper.kt */
    public static final class a extends N implements Y41.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends x>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f408027l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends x> invoke() {
            d.f408016a.getClass();
            return Collections.singletonMap(d.f408017b, new x("Deprecated in Java"));
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408025h = new n[]{n0Var.i(new h0(n0Var.b(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public g(@Y61.l InterfaceC42516a interfaceC42516a, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar) {
        super(hVar, interfaceC42516a, n.a.f407388n);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        this.f408026g = cVar.f408076a.g(a.f408027l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        kotlin.reflect.n<Object> nVar = f408025h[0];
        return (Map) this.f408026g.invoke();
    }
}
