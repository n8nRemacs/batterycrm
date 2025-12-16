package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import k51.InterfaceC42516a;
import k51.InterfaceC42517b;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.n;

/* compiled from: JavaAnnotationMapper.kt */
@s0
/* loaded from: classes8.dex */
public class c implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f408008f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c f408009a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final b0 f408010b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408011c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final InterfaceC42517b f408012d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f408013e;

    /* compiled from: JavaAnnotationMapper.kt */
    public static final class a extends N implements Y41.a<Y> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408014l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ c f408015m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, c cVar) {
            super(0);
            this.f408014l = hVar;
            this.f408015m = cVar;
        }

        @Override // Y41.a
        public final Y invoke() {
            return this.f408014l.f408253a.f408090o.m().i(this.f408015m.f408009a).q();
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408008f = new n[]{n0Var.i(new h0(n0Var.b(c.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public c(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.l InterfaceC42516a interfaceC42516a, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        this.f408009a = cVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar2 = hVar.f408253a;
        this.f408010b = interfaceC42516a != null ? cVar2.f408085j.a(interfaceC42516a) : b0.f407539a;
        this.f408011c = cVar2.f408076a.g(new a(hVar, this));
        this.f408012d = interfaceC42516a != null ? (InterfaceC42517b) C42745f0.F(interfaceC42516a.D()) : null;
        this.f408013e = false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public final boolean a() {
        return this.f408013e;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        return P0.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        return this.f408009a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final b0 e() {
        return this.f408010b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public final O getType() {
        n<Object> nVar = f408008f[0];
        return (Y) this.f408011c.invoke();
    }
}
