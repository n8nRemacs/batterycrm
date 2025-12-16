package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k51.InterfaceC42516a;
import k51.InterfaceC42517b;
import k51.InterfaceC42520e;
import k51.m;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42939b;
import kotlin.reflect.n;

/* compiled from: JavaAnnotationMapper.kt */
/* loaded from: classes8.dex */
public final class k extends c {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f408033h;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408034g;

    /* compiled from: JavaAnnotationMapper.kt */
    @s0
    public static final class a extends N implements Y41.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<? extends Object>>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<? extends Object>> invoke() {
            C42939b c42939bA;
            InterfaceC42517b interfaceC42517b = k.this.f408012d;
            Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<? extends Object>> mapSingletonMap = null;
            if (interfaceC42517b instanceof InterfaceC42520e) {
                f fVar = f.f408022a;
                ArrayList arrayListA = ((InterfaceC42520e) interfaceC42517b).a();
                fVar.getClass();
                c42939bA = f.a(arrayListA);
            } else if (interfaceC42517b instanceof m) {
                f fVar2 = f.f408022a;
                List listSingletonList = Collections.singletonList(interfaceC42517b);
                fVar2.getClass();
                c42939bA = f.a(listSingletonList);
            } else {
                c42939bA = null;
            }
            if (c42939bA != null) {
                d.f408016a.getClass();
                mapSingletonMap = Collections.singletonMap(d.f408018c, c42939bA);
            }
            return mapSingletonMap == null ? P0.c() : mapSingletonMap;
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408033h = new n[]{n0Var.i(new h0(n0Var.b(k.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public k(@Y61.k InterfaceC42516a interfaceC42516a, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar) {
        super(hVar, interfaceC42516a, n.a.f407395u);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        this.f408034g = cVar.f408076a.g(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<Object>> b() {
        kotlin.reflect.n<Object> nVar = f408033h[0];
        return (Map) this.f408034g.invoke();
    }
}
