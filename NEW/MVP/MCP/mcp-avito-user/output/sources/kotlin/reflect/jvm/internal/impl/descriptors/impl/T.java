package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: TypeAliasConstructorDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class T extends AbstractC42878w implements S {

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public static final a f407619J;

    /* renamed from: K, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f407620K;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.p f407621F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final f0 f407622G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.l f407623H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public InterfaceC42850c f407624I;

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    @s0
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TypeAliasConstructorDescriptor.kt */
    @s0
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<T> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42850c f407626m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC42850c interfaceC42850c) {
            super(0);
            this.f407626m = interfaceC42850c;
        }

        @Override // Y41.a
        public final T invoke() {
            T t12 = T.this;
            kotlin.reflect.jvm.internal.impl.storage.p pVar = t12.f407621F;
            InterfaceC42850c interfaceC42850c = this.f407626m;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = interfaceC42850c.getAnnotations();
            CallableMemberDescriptor.Kind kind = interfaceC42850c.getKind();
            f0 f0Var = t12.f407622G;
            T t13 = new T(pVar, t12.f407622G, interfaceC42850c, t12, annotations, kind, f0Var.e(), null);
            T.f407619J.getClass();
            E0 e0D = f0Var.k() == null ? null : E0.d(f0Var.C());
            if (e0D == null) {
                return null;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.X xF2 = interfaceC42850c.F();
            AbstractC42860d abstractC42860dB = xF2 != null ? xF2.b(e0D) : null;
            List<kotlin.reflect.jvm.internal.impl.descriptors.X> listT = interfaceC42850c.T();
            ArrayList arrayList = new ArrayList(C42745f0.q(listT, 10));
            Iterator<T> it = listT.iterator();
            while (it.hasNext()) {
                arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.X) it.next()).b(e0D));
            }
            t13.I0(null, abstractC42860dB, arrayList, f0Var.r(), t12.g(), t12.f407709h, Modality.f407439c, f0Var.getVisibility());
            return t13;
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f407620K = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(T.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};
        f407619J = new a(null);
    }

    public /* synthetic */ T(kotlin.reflect.jvm.internal.impl.storage.p pVar, f0 f0Var, InterfaceC42850c interfaceC42850c, S s5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, CallableMemberDescriptor.Kind kind, b0 b0Var, C42822w c42822w) {
        this(pVar, f0Var, interfaceC42850c, s5, gVar, kind, b0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    public final AbstractC42878w F0(CallableMemberDescriptor.Kind kind, InterfaceC42882k interfaceC42882k, InterfaceC42905x interfaceC42905x, b0 b0Var, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.name.f fVar) {
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.f407408b;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.f407411e;
        }
        return new T(this.f407621F, this.f407622G, this.f407624I, this, gVar, kind2, b0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j
    public final boolean J() {
        return this.f407624I.J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    @Y61.l
    /* renamed from: O0, reason: merged with bridge method [inline-methods] */
    public final T b(@Y61.k E0 e02) {
        T t12 = (T) super.b(e02);
        InterfaceC42850c interfaceC42850cB = this.f407624I.n0().b(E0.d(t12.f407709h));
        if (interfaceC42850cB == null) {
            return null;
        }
        t12.f407624I = interfaceC42850cB;
        return t12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o
    /* renamed from: U */
    public final InterfaceC42885n n0() {
        return (S) super.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* renamed from: V */
    public final CallableMemberDescriptor n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f407409c;
        AbstractC42878w.a aVarJ0 = J0(E0.f410009b);
        aVarJ0.f407729b = interfaceC42851d;
        aVarJ0.f407730c = modality;
        aVarJ0.f407731d = abstractC42887p;
        aVarJ0.f407733f = kind;
        aVarJ0.f407740m = false;
        return (S) aVarJ0.f407751x.G0(aVarJ0);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42848a n0() {
        return (S) super.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final /* bridge */ /* synthetic */ InterfaceC42881j b(E0 e02) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.S
    @Y61.k
    public final InterfaceC42850c e0() {
        return this.f407624I;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final InterfaceC42854g f() {
        return this.f407622G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.types.O getReturnType() {
        return this.f407709h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j
    @Y61.k
    public final InterfaceC42851d h0() {
        return this.f407624I.h0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w
    public final InterfaceC42905x n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        CallableMemberDescriptor.Kind kind = CallableMemberDescriptor.Kind.f407409c;
        AbstractC42878w.a aVarJ0 = J0(E0.f410009b);
        aVarJ0.f407729b = interfaceC42851d;
        aVarJ0.f407730c = modality;
        aVarJ0.f407731d = abstractC42887p;
        aVarJ0.f407733f = kind;
        aVarJ0.f407740m = false;
        return (S) aVarJ0.f407751x.G0(aVarJ0);
    }

    public T(kotlin.reflect.jvm.internal.impl.storage.p pVar, f0 f0Var, InterfaceC42850c interfaceC42850c, S s5, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, CallableMemberDescriptor.Kind kind, b0 b0Var) {
        super(kind, f0Var, s5, b0Var, gVar, kotlin.reflect.jvm.internal.impl.name.h.f409261f);
        this.f407621F = pVar;
        this.f407622G = f0Var;
        this.f407721t = f0Var.t0();
        this.f407623H = pVar.f(new b(interfaceC42850c));
        this.f407624I = interfaceC42850c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final CallableMemberDescriptor n0() {
        return (S) super.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final InterfaceC42882k f() {
        return this.f407622G;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42882k n0() {
        return (S) super.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42878w, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42905x n0() {
        return (S) super.n0();
    }
}
