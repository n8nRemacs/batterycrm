package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: ValueParameterDescriptorImpl.kt */
@s0
/* loaded from: classes8.dex */
public class V extends X implements k0 {

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public static final a f407629m = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public final int f407630g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f407631h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f407632i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f407633j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.types.O f407634k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final k0 f407635l;

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ValueParameterDescriptorImpl.kt */
    public static final class b extends V {

        /* renamed from: n, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42726C f407636n;

        public b(@Y61.k InterfaceC42905x interfaceC42905x, @Y61.l k0 k0Var, int i12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.types.O o12, boolean z12, boolean z13, boolean z14, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o13, @Y61.k b0 b0Var, @Y61.k Y41.a aVar) {
            super(interfaceC42905x, k0Var, i12, gVar, fVar, o12, z12, z13, z14, o13, b0Var);
            this.f407636n = C42727D.c(aVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.V, kotlin.reflect.jvm.internal.impl.descriptors.k0
        @Y61.k
        public final k0 B(@Y61.k kotlin.reflect.jvm.internal.impl.builtins.functions.d dVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, int i12) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
            kotlin.reflect.jvm.internal.impl.types.O type = getType();
            boolean zK02 = k0();
            b0 b0Var = b0.f407539a;
            W w12 = new W(this);
            return new b(dVar, null, i12, annotations, fVar, type, zK02, this.f407632i, this.f407633j, this.f407634k, b0Var, w12);
        }
    }

    public V(@Y61.k InterfaceC42848a interfaceC42848a, @Y61.l k0 k0Var, int i12, @Y61.k kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k kotlin.reflect.jvm.internal.impl.types.O o12, boolean z12, boolean z13, boolean z14, @Y61.l kotlin.reflect.jvm.internal.impl.types.O o13, @Y61.k b0 b0Var) {
        super(interfaceC42848a, gVar, fVar, o12, b0Var);
        this.f407630g = i12;
        this.f407631h = z12;
        this.f407632i = z13;
        this.f407633j = z14;
        this.f407634k = o13;
        this.f407635l = k0Var == null ? this : k0Var;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(@Y61.k InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        return (R) interfaceC42884m.l(this, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    @Y61.k
    public k0 B(@Y61.k kotlin.reflect.jvm.internal.impl.builtins.functions.d dVar, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, int i12) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g annotations = getAnnotations();
        kotlin.reflect.jvm.internal.impl.types.O type = getType();
        boolean zK02 = k0();
        b0 b0Var = b0.f407539a;
        return new V(dVar, null, i12, annotations, fVar, type, zK02, this.f407632i, this.f407633j, this.f407634k, b0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g Q() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.types.O S() {
        return this.f407634k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final InterfaceC42883l b(E0 e02) {
        if (e02.f410010a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final boolean c0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final InterfaceC42848a f() {
        return (InterfaceC42848a) super.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    public final int getIndex() {
        return this.f407630g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        return kotlin.reflect.jvm.internal.impl.descriptors.r.f407790f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    public final boolean k0() {
        if (this.f407631h) {
            CallableMemberDescriptor.Kind kind = ((CallableMemberDescriptor) ((InterfaceC42848a) super.f())).getKind();
            kind.getClass();
            if (kind != CallableMemberDescriptor.Kind.f407409c) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @Y61.k
    public final Collection<k0> p() {
        Collection<? extends InterfaceC42848a> collectionP = ((InterfaceC42848a) super.f()).p();
        ArrayList arrayList = new ArrayList(C42745f0.q(collectionP, 10));
        Iterator<T> it = collectionP.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC42848a) it.next()).g().get(this.f407630g));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    public final boolean y0() {
        return this.f407633j;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    public final boolean z0() {
        return this.f407632i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final InterfaceC42882k f() {
        return (InterfaceC42848a) super.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X
    @Y61.k
    /* renamed from: a */
    public final k0 n0() {
        k0 k0Var = this.f407635l;
        return k0Var == this ? this : k0Var.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.X, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final m0 b(E0 e02) {
        if (e02.f410010a.e()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }
}
