package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.C42997w;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.V;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;
import u51.C48799a;
import u51.InterfaceC48800b;
import u51.InterfaceC48801c;
import u51.InterfaceC48802d;
import u51.InterfaceC48804f;
import u51.InterfaceC48806h;

/* compiled from: NewKotlinTypeChecker.kt */
/* loaded from: classes8.dex */
public final class u implements InterfaceC42966b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final u f410124a = new u();

    @Override // u51.s
    public final boolean A(@Y61.k u51.i iVar, @Y61.k u51.i iVar2) {
        return InterfaceC42966b.a.w(iVar, iVar2);
    }

    @Override // u51.p
    @Y61.k
    public final Collection<InterfaceC48806h> B(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.T(this, iVar);
    }

    @Override // u51.p
    @Y61.k
    public final m C(@Y61.k InterfaceC48801c interfaceC48801c) {
        return InterfaceC42966b.a.Y(interfaceC48801c);
    }

    @Override // u51.p
    public final int D(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.S(mVar);
    }

    @Override // u51.p
    @Y61.k
    public final u51.l E(@Y61.k InterfaceC48806h interfaceC48806h, int i12) {
        return InterfaceC42966b.a.m(interfaceC48806h, i12);
    }

    @Override // u51.p
    @Y61.k
    public final List<u51.l> F(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.n(interfaceC48806h);
    }

    @Override // u51.p
    @Y61.k
    public final C42967c G(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.V(this, iVar);
    }

    @Override // u51.p
    @Y61.k
    public final z0 H(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.i(interfaceC48806h);
    }

    @Override // u51.p
    @Y61.k
    public final u51.k I(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.c(iVar);
    }

    @Override // u51.p
    @Y61.k
    public final J0 J(@Y61.k ArrayList arrayList) {
        return C42969e.a(arrayList);
    }

    @Override // u51.p
    public final boolean K(@Y61.k InterfaceC48806h interfaceC48806h) {
        return interfaceC48806h instanceof V;
    }

    @Override // u51.p
    @Y61.l
    public final Y L(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.h(interfaceC48806h);
    }

    @Override // u51.p
    @Y61.l
    public final Y M(@Y61.k u51.i iVar) {
        CaptureStatus captureStatus = CaptureStatus.f410226b;
        return InterfaceC42966b.a.j(iVar);
    }

    @Override // u51.p
    @Y61.l
    public final InterfaceC48801c N(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.d(this, iVar);
    }

    @Override // u51.p
    public final int O(u51.k kVar) {
        if (kVar instanceof u51.i) {
            return InterfaceC42966b.a.b((InterfaceC48806h) kVar);
        }
        if (kVar instanceof C48799a) {
            return ((C48799a) kVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + m0.f406844a.b(kVar.getClass())).toString());
    }

    @Override // u51.p
    @Y61.k
    public final u51.n P(@Y61.k u51.m mVar, int i12) {
        return InterfaceC42966b.a.o(mVar, i12);
    }

    @Override // u51.p
    public final boolean Q(InterfaceC48806h interfaceC48806h) {
        H hG2 = InterfaceC42966b.a.g(interfaceC48806h);
        return (hG2 != null ? InterfaceC42966b.a.f(hG2) : null) != null;
    }

    @Override // u51.p
    @Y61.k
    public final J0 R(@Y61.k u51.l lVar) {
        return InterfaceC42966b.a.q(lVar);
    }

    @Override // u51.p
    @Y61.k
    public final TypeVariance S(@Y61.k u51.l lVar) {
        return InterfaceC42966b.a.t(lVar);
    }

    @Override // u51.p
    @Y61.l
    public final u51.l T(u51.i iVar, int i12) {
        if (i12 < 0 || i12 >= InterfaceC42966b.a.b(iVar)) {
            return null;
        }
        return InterfaceC42966b.a.m(iVar, i12);
    }

    @Override // u51.p
    @Y61.k
    public final q0 U(InterfaceC48806h interfaceC48806h) {
        Y yH2 = InterfaceC42966b.a.h(interfaceC48806h);
        if (yH2 == null) {
            yH2 = i(interfaceC48806h);
        }
        return InterfaceC42966b.a.X(yH2);
    }

    @Override // u51.p
    @Y61.l
    public final J0 V(@Y61.k InterfaceC48801c interfaceC48801c) {
        return InterfaceC42966b.a.P(interfaceC48801c);
    }

    @Override // u51.p
    @Y61.k
    public final u51.l W(u51.k kVar, int i12) {
        if (kVar instanceof u51.i) {
            return InterfaceC42966b.a.m((InterfaceC48806h) kVar, i12);
        }
        if (kVar instanceof C48799a) {
            return ((C48799a) kVar).get(i12);
        }
        throw new IllegalStateException(("unknown type argument list type: " + kVar + ", " + m0.f406844a.b(kVar.getClass())).toString());
    }

    @Override // u51.p
    @Y61.l
    public final g0 X(@Y61.k u51.t tVar) {
        return InterfaceC42966b.a.r(tVar);
    }

    @Override // u51.p
    public final boolean Y(u51.i iVar) {
        return InterfaceC42966b.a.G(U(iVar)) && !InterfaceC42966b.a.H(iVar);
    }

    @Override // u51.p
    public final boolean Z(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.D(mVar);
    }

    @Override // u51.p
    public final boolean a(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.E(mVar);
    }

    @Override // u51.p
    public final boolean a0(u51.i iVar) {
        return InterfaceC42966b.a.y(InterfaceC42966b.a.X(iVar));
    }

    @Override // u51.p
    @Y61.k
    public final CaptureStatus b(@Y61.k InterfaceC48801c interfaceC48801c) {
        return InterfaceC42966b.a.k(interfaceC48801c);
    }

    @Override // u51.p
    public final boolean b0(@Y61.k u51.n nVar, @Y61.l u51.m mVar) {
        return InterfaceC42966b.a.v(nVar, mVar);
    }

    @Override // u51.p
    @Y61.k
    public final Y c(@Y61.k InterfaceC48804f interfaceC48804f) {
        return InterfaceC42966b.a.O(interfaceC48804f);
    }

    @Override // u51.p
    @Y61.k
    public final TypeVariance c0(@Y61.k u51.n nVar) {
        return InterfaceC42966b.a.u(nVar);
    }

    @Override // u51.p
    public final boolean d(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.y(mVar);
    }

    @Override // u51.p
    public final int d0(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.b(interfaceC48806h);
    }

    @Override // u51.p
    @Y61.k
    public final Y e(@Y61.k InterfaceC48802d interfaceC48802d) {
        return InterfaceC42966b.a.R(interfaceC48802d);
    }

    @Override // u51.p
    public final boolean e0(@Y61.k u51.m mVar, @Y61.k u51.m mVar2) {
        return InterfaceC42966b.a.a(mVar, mVar2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42966b
    @Y61.k
    public final J0 f(@Y61.k u51.i iVar, @Y61.k u51.i iVar2) {
        return InterfaceC42966b.a.l(this, iVar, iVar2);
    }

    @Override // u51.p
    public final boolean f0(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.K(interfaceC48806h);
    }

    @Override // u51.p
    public final boolean g(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.F(iVar);
    }

    @Override // u51.p
    public final boolean g0(InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.F(i(interfaceC48806h)) != InterfaceC42966b.a.F(i0(interfaceC48806h));
    }

    @Override // u51.p
    public final boolean h(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.G(mVar);
    }

    @Override // u51.p
    @Y61.k
    public final J0 h0(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.Q(interfaceC48806h);
    }

    @Override // u51.p
    @Y61.k
    public final Y i(InterfaceC48806h interfaceC48806h) {
        Y yO2;
        H hG2 = InterfaceC42966b.a.g(interfaceC48806h);
        return (hG2 == null || (yO2 = InterfaceC42966b.a.O(hG2)) == null) ? InterfaceC42966b.a.h(interfaceC48806h) : yO2;
    }

    @Override // u51.p
    @Y61.k
    public final Y i0(InterfaceC48806h interfaceC48806h) {
        Y yZ2;
        H hG2 = InterfaceC42966b.a.g(interfaceC48806h);
        return (hG2 == null || (yZ2 = InterfaceC42966b.a.Z(hG2)) == null) ? InterfaceC42966b.a.h(interfaceC48806h) : yZ2;
    }

    @Override // u51.p
    public final boolean j(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.M(iVar);
    }

    @Override // u51.p
    public final boolean j0(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.N(iVar);
    }

    @Override // u51.p
    public final boolean k(@Y61.k InterfaceC48801c interfaceC48801c) {
        return interfaceC48801c instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.a;
    }

    @Override // u51.p
    public final boolean k0(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.x(mVar);
    }

    @Override // u51.p
    public final boolean l(InterfaceC48806h interfaceC48806h) {
        Y yH2 = InterfaceC42966b.a.h(interfaceC48806h);
        return (yH2 != null ? InterfaceC42966b.a.e(yH2) : null) != null;
    }

    @Override // u51.p
    @Y61.l
    public final C42997w l0(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.e(iVar);
    }

    @Override // u51.p
    public final boolean m(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.A(mVar);
    }

    @Override // u51.p
    @Y61.k
    public final List<u51.n> m0(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.p(mVar);
    }

    @Override // u51.p
    public final boolean n(@Y61.k InterfaceC48801c interfaceC48801c) {
        return InterfaceC42966b.a.J(interfaceC48801c);
    }

    @Override // u51.p
    @Y61.k
    public final Collection<InterfaceC48806h> n0(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.W(mVar);
    }

    @Override // u51.p
    @Y61.l
    public final H o(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.g(interfaceC48806h);
    }

    public final boolean o0(@Y61.k InterfaceC48806h interfaceC48806h, @Y61.k kotlin.reflect.jvm.internal.impl.name.c cVar) {
        O o12 = (O) interfaceC48806h;
        if (o12 != null) {
            return o12.getAnnotations().i3(cVar);
        }
        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb2.append(o12);
        sb2.append(", ");
        throw new IllegalArgumentException(com.avito.android.authorization.auto_recovery.phone_confirm.b.j(m0.f406844a, o12.getClass(), sb2).toString());
    }

    @Override // u51.p
    public final boolean p(u51.i iVar) {
        Y yH2 = InterfaceC42966b.a.h(iVar);
        return (yH2 != null ? InterfaceC42966b.a.d(this, yH2) : null) != null;
    }

    @Y61.k
    public final InterfaceC48806h p0(InterfaceC48806h interfaceC48806h) {
        Y yA02;
        Y yH2 = InterfaceC42966b.a.h(interfaceC48806h);
        return (yH2 == null || (yA02 = InterfaceC42966b.a.a0(yH2, true)) == null) ? interfaceC48806h : yA02;
    }

    @Override // u51.p
    public final boolean q(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.B(interfaceC48806h);
    }

    @Override // u51.p
    @Y61.k
    public final Y r(@Y61.k InterfaceC48804f interfaceC48804f) {
        return InterfaceC42966b.a.Z(interfaceC48804f);
    }

    @Override // u51.p
    @Y61.k
    public final x0 s(@Y61.k InterfaceC48800b interfaceC48800b) {
        return InterfaceC42966b.a.U(interfaceC48800b);
    }

    @Override // u51.p
    public final boolean t(@Y61.k u51.l lVar) {
        return InterfaceC42966b.a.L(lVar);
    }

    @Override // u51.p
    @Y61.k
    public final u51.i u(u51.i iVar) {
        Y yR2;
        C42997w c42997wE = InterfaceC42966b.a.e(iVar);
        return (c42997wE == null || (yR2 = InterfaceC42966b.a.R(c42997wE)) == null) ? iVar : yR2;
    }

    @Override // u51.p
    @Y61.k
    public final InterfaceC48806h v(@Y61.k InterfaceC48806h interfaceC48806h) {
        return InterfaceC42966b.a.b0(this, interfaceC48806h);
    }

    @Override // u51.p
    @Y61.k
    public final q0 w(@Y61.k u51.i iVar) {
        return InterfaceC42966b.a.X(iVar);
    }

    @Override // u51.p
    public final boolean x(@Y61.k u51.m mVar) {
        return InterfaceC42966b.a.z(mVar);
    }

    @Override // u51.p
    public final boolean y(u51.i iVar) {
        return InterfaceC42966b.a.D(InterfaceC42966b.a.X(iVar));
    }

    @Override // u51.p
    @Y61.k
    public final Y z(@Y61.k u51.i iVar, boolean z12) {
        return InterfaceC42966b.a.a0(iVar, z12);
    }
}
