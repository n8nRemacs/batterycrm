package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.Iterator;
import k51.InterfaceC42516a;
import k51.InterfaceC42519d;
import kotlin.collections.C42770s0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.sequences.C43025h;
import kotlin.sequences.C43033p;
import kotlin.sequences.o0;

/* compiled from: LazyJavaAnnotations.kt */
/* loaded from: classes8.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h f408244b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42519d f408245c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f408246d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j<InterfaceC42516a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> f408247e;

    /* compiled from: LazyJavaAnnotations.kt */
    public static final class a extends N implements Y41.l<InterfaceC42516a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c invoke(InterfaceC42516a interfaceC42516a) {
            kotlin.reflect.jvm.internal.impl.load.java.components.d dVar = kotlin.reflect.jvm.internal.impl.load.java.components.d.f408016a;
            e eVar = e.this;
            h hVar = eVar.f408244b;
            dVar.getClass();
            return kotlin.reflect.jvm.internal.impl.load.java.components.d.b(interfaceC42516a, hVar, eVar.f408246d);
        }
    }

    public e(@Y61.k h hVar, @Y61.k InterfaceC42519d interfaceC42519d, boolean z12) {
        this.f408244b = hVar;
        this.f408245c = interfaceC42519d;
        this.f408246d = z12;
        c cVar = hVar.f408253a;
        this.f408247e = cVar.f408076a.b(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c F(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarInvoke;
        InterfaceC42519d interfaceC42519d = this.f408245c;
        InterfaceC42516a interfaceC42516aF = interfaceC42519d.F(cVar);
        if (interfaceC42516aF != null && (cVarInvoke = this.f408247e.invoke(interfaceC42516aF)) != null) {
            return cVarInvoke;
        }
        kotlin.reflect.jvm.internal.impl.load.java.components.d.f408016a.getClass();
        return kotlin.reflect.jvm.internal.impl.load.java.components.d.a(cVar, interfaceC42519d, this.f408244b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean i3(@Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        return F(cVar) != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public final boolean isEmpty() {
        return this.f408245c.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> iterator() {
        InterfaceC42519d interfaceC42519d = this.f408245c;
        o0 o0Var = new o0(new C42770s0(interfaceC42519d.getAnnotations()), this.f408247e);
        kotlin.reflect.jvm.internal.impl.load.java.components.d dVar = kotlin.reflect.jvm.internal.impl.load.java.components.d.f408016a;
        kotlin.reflect.jvm.internal.impl.name.c cVar = n.a.f407388n;
        dVar.getClass();
        return new C43025h.a(C43033p.m(C43033p.B(o0Var, kotlin.reflect.jvm.internal.impl.load.java.components.d.a(cVar, interfaceC42519d, this.f408244b))));
    }

    public /* synthetic */ e(h hVar, InterfaceC42519d interfaceC42519d, boolean z12, int i12, C42822w c42822w) {
        this(hVar, interfaceC42519d, (i12 & 4) != 0 ? false : z12);
    }
}
