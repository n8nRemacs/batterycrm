package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C20981p1;
import androidx.compose.foundation.text.input.internal.k1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.Metadata;

/* compiled from: TextLayoutState.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/p1;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final k1 f31200a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final k1 f31201b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31202c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31203d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31204e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31205f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.relocation.a f31206g;

    public p1() {
        k1 k1Var = new k1();
        this.f31200a = k1Var;
        this.f31201b = k1Var;
        this.f31202c = C22126m3.f(null, C22126m3.h());
        this.f31203d = C22126m3.f(null, C22126m3.h());
        this.f31204e = C22126m3.f(null, C22126m3.h());
        this.f31205f = C22126m3.g(androidx.compose.ui.unit.h.a(0));
        this.f31206g = androidx.compose.foundation.relocation.e.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r4) {
        /*
            r3 = this;
            androidx.compose.ui.layout.A r0 = r3.c()
            if (r0 == 0) goto L29
            boolean r1 = r0.m()
            if (r1 == 0) goto L20
            androidx.compose.runtime.y1 r1 = r3.f31204e
            androidx.compose.runtime.i3 r1 = (androidx.compose.runtime.C22082i3) r1
            java.lang.Object r1 = r1.getF42167b()
            androidx.compose.ui.layout.A r1 = (androidx.compose.ui.layout.A) r1
            if (r1 == 0) goto L1e
            r2 = 1
            l0.j r0 = r1.P(r0, r2)
            goto L27
        L1e:
            r0 = 0
            goto L27
        L20:
            l0.j$a r0 = l0.j.f413388e
            r0.getClass()
            l0.j r0 = l0.j.f413389f
        L27:
            if (r0 != 0) goto L30
        L29:
            l0.j$a r0 = l0.j.f413388e
            r0.getClass()
            l0.j r0 = l0.j.f413389f
        L30:
            long r4 = androidx.compose.foundation.text.input.internal.q1.a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.p1.a(long):long");
    }

    @Y61.l
    public final androidx.compose.ui.text.o0 b() {
        return (androidx.compose.ui.text.o0) this.f31201b.getF42167b();
    }

    @Y61.l
    public final androidx.compose.ui.layout.A c() {
        return (androidx.compose.ui.layout.A) ((C22082i3) this.f31202c).getF42167b();
    }

    public final boolean d(long j12) {
        androidx.compose.ui.text.o0 o0VarB = b();
        if (o0VarB == null) {
            return false;
        }
        long jB2 = q1.b(this, a(j12));
        int iE2 = o0VarB.f42527b.e(Float.intBitsToFloat((int) (4294967295L & jB2)));
        int i12 = (int) (jB2 >> 32);
        return Float.intBitsToFloat(i12) >= o0VarB.g(iE2) && Float.intBitsToFloat(i12) <= o0VarB.h(iE2);
    }

    public final void e(@Y61.k t1 t1Var, @Y61.k androidx.compose.ui.text.x0 x0Var, boolean z12, boolean z13, @Y61.k C20981p1 c20981p1) {
        k1 k1Var = this.f31200a;
        k1Var.getClass();
        int i12 = c20981p1.f31767c;
        androidx.compose.ui.text.input.C.f42345b.getClass();
        ((C22082i3) k1Var.f31133b).setValue(new k1.c(t1Var, x0Var, z12, z13, androidx.compose.ui.text.input.C.b(i12, androidx.compose.ui.text.input.C.f42349f)));
    }
}
