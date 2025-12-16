package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.List;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.q0;

/* compiled from: AbstractTypeAliasDescriptor.kt */
@s0
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42861e extends AbstractC42871o implements f0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407650k;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.p f407651f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final AbstractC42887p f407652g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f407653h;

    /* renamed from: i, reason: collision with root package name */
    public List<? extends g0> f407654i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C42863g f407655j;

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, kotlin.reflect.jvm.internal.impl.types.Y> {
        @Override // Y41.l
        public final kotlin.reflect.jvm.internal.impl.types.Y invoke(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            iVar.getClass();
            return null;
        }
    }

    /* compiled from: AbstractTypeAliasDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.e$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<J0, Boolean> {
        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(kotlin.reflect.jvm.internal.impl.types.J0 r2) {
            /*
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.J0 r2 = (kotlin.reflect.jvm.internal.impl.types.J0) r2
                boolean r0 = kotlin.reflect.jvm.internal.impl.types.Q.a(r2)
                if (r0 != 0) goto L24
                kotlin.reflect.jvm.internal.impl.types.q0 r2 = r2.H0()
                kotlin.reflect.jvm.internal.impl.descriptors.f r2 = r2.b()
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0
                if (r0 == 0) goto L24
                kotlin.reflect.jvm.internal.impl.descriptors.g0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.g0) r2
                kotlin.reflect.jvm.internal.impl.descriptors.k r2 = r2.f()
                kotlin.reflect.jvm.internal.impl.descriptors.impl.e r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42861e.this
                boolean r2 = kotlin.jvm.internal.L.f(r2, r0)
                if (r2 != 0) goto L24
                r2 = 1
                goto L25
            L24:
                r2 = 0
            L25:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42861e.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407650k = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(AbstractC42861e.class), "constructors", "getConstructors()Ljava/util/Collection;"))};
    }

    public AbstractC42861e(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar, @Y61.k InterfaceC42882k interfaceC42882k, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k b0 b0Var, @Y61.k AbstractC42887p abstractC42887p) {
        super(interfaceC42882k, gVar, fVar, b0Var);
        this.f407651f = pVar;
        this.f407652g = abstractC42887p;
        this.f407653h = pVar.g(new C42862f(this));
        this.f407655j = new C42863g(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(@Y61.k InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.d(this, d12);
    }

    @Y61.k
    public abstract List<g0> F0();

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    public final boolean Y() {
        kotlin.reflect.jvm.internal.impl.types.Y y12 = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.z) this).f409893q;
        if (y12 == null) {
            y12 = null;
        }
        return G0.d(y12, new b(), null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42853f n0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        return this.f407652g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        return this.f407655j;
    }

    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.Y n0() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarG0;
        InterfaceC42851d interfaceC42851dK = ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.z) this).k();
        if (interfaceC42851dK == null || (jVarG0 = interfaceC42851dK.g0()) == null) {
            jVarG0 = j.c.f409687b;
        }
        a aVar = new a(1);
        kotlin.reflect.jvm.internal.impl.types.error.f fVar = G0.f410019a;
        return kotlin.reflect.jvm.internal.impl.types.error.h.e(this) ? kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410160l, toString()) : G0.m(l(), jVarG0, aVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    @Y61.k
    public final List<g0> r() {
        List list = this.f407654i;
        if (list == null) {
            return null;
        }
        return list;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n
    @Y61.k
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42882k n0() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o
    /* renamed from: U */
    public final InterfaceC42885n n0() {
        return this;
    }
}
