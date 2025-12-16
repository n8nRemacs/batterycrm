package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.List;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.m;
import kotlin.reflect.jvm.internal.impl.types.checker.m.b;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import u51.InterfaceC48801c;

/* compiled from: NewCapturedType.kt */
@s0
/* loaded from: classes8.dex */
public final class k extends Y implements InterfaceC48801c {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final CaptureStatus f410101c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final m f410102d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final J0 f410103e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final n0 f410104f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f410105g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f410106h;

    /* JADX WARN: Illegal instructions before constructor call */
    public k(CaptureStatus captureStatus, m mVar, J0 j02, n0 n0Var, boolean z12, boolean z13, int i12, C42822w c42822w) {
        if ((i12 & 8) != 0) {
            n0.f410236c.getClass();
            n0Var = n0.f410237d;
        }
        this(captureStatus, mVar, j02, n0Var, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? false : z13);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final List<x0> F0() {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final n0 G0() {
        return this.f410104f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final q0 H0() {
        return this.f410102d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    public final boolean I0() {
        return this.f410105g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.J0
    public final J0 L0(boolean z12) {
        return new k(this.f410101c, this.f410102d, this.f410103e, this.f410104f, z12, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    /* renamed from: O0 */
    public final Y L0(boolean z12) {
        return new k(this.f410101c, this.f410102d, this.f410103e, this.f410104f, z12, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.Y
    @Y61.k
    /* renamed from: P0 */
    public final Y N0(@Y61.k n0 n0Var) {
        return new k(this.f410101c, this.f410102d, this.f410103e, n0Var, this.f410105g, this.f410106h);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.J0
    @Y61.k
    /* renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final k J0(@Y61.k i iVar) {
        m mVar = this.f410102d;
        x0 x0VarB = mVar.f410108a.b(iVar);
        m.b bVar = mVar.f410109b != null ? mVar.new b(iVar) : null;
        m mVar2 = mVar.f410110c;
        if (mVar2 == null) {
            mVar2 = mVar;
        }
        m mVar3 = new m(x0VarB, bVar, mVar2, mVar.f410111d);
        J0 j02 = this.f410103e;
        return new k(this.f410101c, mVar3, j02 != null ? iVar.c(j02).K0() : null, this.f410104f, this.f410105g, false, 32, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.O
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        return kotlin.reflect.jvm.internal.impl.types.error.h.a(ErrorScopeKind.f410136c, true, new String[0]);
    }

    public k(@Y61.k CaptureStatus captureStatus, @Y61.k m mVar, @Y61.l J0 j02, @Y61.k n0 n0Var, boolean z12, boolean z13) {
        this.f410101c = captureStatus;
        this.f410102d = mVar;
        this.f410103e = j02;
        this.f410104f = n0Var;
        this.f410105g = z12;
        this.f410106h = z13;
    }
}
