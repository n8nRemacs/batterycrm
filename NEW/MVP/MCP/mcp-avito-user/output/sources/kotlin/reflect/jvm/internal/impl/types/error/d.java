package kotlin.reflect.jvm.internal.impl.types.error;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42883l;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42884m;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42903v;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.W;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.L;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.M;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.O;

/* compiled from: ErrorPropertyDescriptor.kt */
/* loaded from: classes8.dex */
public final class d implements U {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ L f410183b;

    public d() {
        h.f410195a.getClass();
        a aVar = h.f410197c;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
        g.a.C11652a c11652a = g.a.f407524b;
        Modality modality = Modality.f407441e;
        AbstractC42900s abstractC42900s = r.f407789e;
        ErrorEntity[] errorEntityArr = ErrorEntity.f410134b;
        L lH02 = L.H0(aVar, c11652a, modality, abstractC42900s, true, kotlin.reflect.jvm.internal.impl.name.f.h("<Error property>"), CallableMemberDescriptor.Kind.f407408b, b0.f407539a);
        f fVar = h.f410199e;
        C42784z0 c42784z0 = C42784z0.f406748b;
        lH02.L0(fVar, c42784z0, null, null, c42784z0);
        this.f410183b = lH02;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    public final <R, D> R A(InterfaceC42884m<R, D> interfaceC42884m, D d12) {
        L l12 = this.f410183b;
        l12.getClass();
        return (R) interfaceC42884m.a(l12, d12);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final boolean D0() {
        return this.f410183b.f407588o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @l
    public final X F() {
        return this.f410183b.f407594u;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @l
    public final X H() {
        return this.f410183b.f407595v;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    public final boolean K() {
        this.f410183b.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return this.f410183b.f407590q;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @l
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> Q() {
        return this.f410183b.Q();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @k
    public final List<X> T() {
        return this.f410183b.T();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @k
    /* renamed from: V */
    public final CallableMemberDescriptor n0(InterfaceC42851d interfaceC42851d, Modality modality, AbstractC42887p abstractC42887p) {
        return this.f410183b.V(interfaceC42851d, modality, abstractC42887p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @k
    public final ArrayList X() {
        return this.f410183b.X();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42848a n0() {
        return this.f410183b.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final InterfaceC42883l b(E0 e02) {
        return this.f410183b.b(e02);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final m0 b(E0 e02) {
        throw null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @l
    public final W c() {
        return this.f410183b.f407598y;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final boolean c0() {
        return this.f410183b.f407639g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @l
    public final InterfaceC42903v d0() {
        return this.f410183b.f407582A;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @k
    public final b0 e() {
        return this.f410183b.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @k
    public final InterfaceC42882k f() {
        return this.f410183b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @k
    public final List<k0> g() {
        return this.f410183b.g();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f410183b.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @l
    public final M getGetter() {
        return this.f410183b.f407597x;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    @k
    public final CallableMemberDescriptor.Kind getKind() {
        return this.f410183b.getKind();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.G
    @k
    public final kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f410183b.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @l
    public final O getReturnType() {
        return this.f410183b.getReturnType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    @k
    public final O getType() {
        return this.f410183b.getType();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @k
    public final List<g0> getTypeParameters() {
        return this.f410183b.getTypeParameters();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @k
    public final AbstractC42900s getVisibility() {
        return this.f410183b.getVisibility();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    @k
    public final Modality i() {
        return this.f410183b.i();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final boolean isConst() {
        return this.f410183b.isConst();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return this.f410183b.isExternal();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U
    @l
    public final InterfaceC42903v j0() {
        return this.f410183b.f407599z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public final void l0(@k Collection<? extends CallableMemberDescriptor> collection) {
        this.f410183b.f407585l = collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @k
    public final Collection<? extends U> p() {
        return this.f410183b.p();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n0
    public final boolean r0() {
        return this.f410183b.f407592s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        this.f410183b.getClass();
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a
    @l
    public final <V> V x(InterfaceC42848a.InterfaceC11651a<V> interfaceC11651a) {
        this.f410183b.getClass();
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final CallableMemberDescriptor n0() {
        return this.f410183b.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U, kotlin.reflect.jvm.internal.impl.descriptors.d0, kotlin.reflect.jvm.internal.impl.descriptors.m0
    public final U b(@k E0 e02) {
        return this.f410183b.b(e02);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    /* renamed from: a */
    public final InterfaceC42882k n0() {
        return this.f410183b.n0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.U, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @k
    /* renamed from: a */
    public final U n0() {
        return this.f410183b.n0();
    }
}
