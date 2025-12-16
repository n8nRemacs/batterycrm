package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C21045x;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* compiled from: SelectionManager.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/L0;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public l0.g f31851a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.A f31852b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public InterfaceC21023l0 f31853c;

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    final /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.a<kotlin.G0> {
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            L0 l02 = (L0) this.receiver;
            l02.b();
            l02.g();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: SelectionManager.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    final /* synthetic */ class b extends kotlin.jvm.internal.H implements Y41.a<kotlin.G0> {
        @Override // Y41.a
        public final kotlin.G0 invoke() {
            ((L0) this.receiver).i();
            return kotlin.G0.f406611a;
        }
    }

    public static final long a(L0 l02, androidx.compose.ui.layout.A a12, long j12) {
        androidx.compose.ui.layout.A a13 = l02.f31852b;
        if (a13 != null && a13.m()) {
            return l02.h().z(a12, j12);
        }
        l0.g.f413384b.getClass();
        return l0.g.f413386d;
    }

    public final void b() {
        if (e() != null) {
            throw null;
        }
    }

    @Y61.l
    public final InterfaceC21041v c(@Y61.k C21045x.a aVar) {
        throw null;
    }

    @Y61.l
    public final Handle d() {
        throw null;
    }

    @Y61.l
    public final C21045x e() {
        throw null;
    }

    public final boolean f() {
        throw null;
    }

    public final void g() {
        androidx.collection.H0 h02 = androidx.collection.Z.f25658a;
        throw null;
    }

    @Y61.k
    public final androidx.compose.ui.layout.A h() {
        androidx.compose.ui.layout.A a12 = this.f31852b;
        if (a12 == null) {
            androidx.compose.foundation.internal.e.b("null coordinates");
            throw new KotlinNothingValueException();
        }
        if (!a12.m()) {
            androidx.compose.foundation.internal.e.a("unattached coordinates");
        }
        return a12;
    }

    public final void i() {
        h();
        throw null;
    }

    public final void j(boolean z12) {
        throw null;
    }

    public final void k(@Y61.l C21045x c21045x) {
        throw null;
    }

    public final void l(boolean z12) {
        throw null;
    }

    public final void m() {
        C21045x.a aVar;
        C21045x.a aVar2;
        C21045x c21045xE = e();
        androidx.compose.ui.layout.A a12 = this.f31852b;
        InterfaceC21041v interfaceC21041vC = (c21045xE == null || (aVar2 = c21045xE.f32156a) == null) ? null : c(aVar2);
        InterfaceC21041v interfaceC21041vC2 = (c21045xE == null || (aVar = c21045xE.f32157b) == null) ? null : c(aVar);
        androidx.compose.ui.layout.A aC2 = interfaceC21041vC != null ? interfaceC21041vC.c() : null;
        androidx.compose.ui.layout.A aC3 = interfaceC21041vC2 != null ? interfaceC21041vC2.c() : null;
        if (c21045xE == null || a12 == null || !a12.m() || (aC2 == null && aC3 == null)) {
            throw null;
        }
        l0.j jVarC = M0.c(a12);
        if (aC2 != null) {
            long jD2 = interfaceC21041vC.d(c21045xE, true);
            if ((9223372034707292159L & jD2) != 9205357640488583168L) {
                l0.g gVarA = l0.g.a(a12.z(aC2, jD2));
                if (d() != Handle.f30329c) {
                    M0.a(gVarA.f413387a, jVarC);
                }
            }
        }
        throw null;
    }

    public final boolean n(long j12, long j13, boolean z12, @Y61.k InterfaceC21049z interfaceC21049z) {
        if (z12) {
            Handle handle = Handle.f30329c;
        } else {
            Handle handle2 = Handle.f30330d;
        }
        throw null;
    }
}
