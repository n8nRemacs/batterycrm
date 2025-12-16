package androidx.compose.material.ripple;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20274e;
import androidx.compose.animation.core.C20318t;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.S;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.drawscope.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.InterfaceC43314z;

/* compiled from: RippleAnimation.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/material/ripple/p;", "", "Ll0/g;", "origin", "", "radius", "", "bounded", "<init>", "(Ll0/g;FZLkotlin/jvm/internal/w;)V", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public l0.g f34117a;

    /* renamed from: b, reason: collision with root package name */
    public final float f34118b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f34119c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Float f34120d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public l0.g f34121e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final C20268c<Float, C20318t> f34122f = C20274e.a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C20268c<Float, C20318t> f34123g = C20274e.a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final C20268c<Float, C20318t> f34124h = C20274e.a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43314z<G0> f34125i = kotlinx.coroutines.B.a();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f34126j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f34127k;

    public p(l0.g gVar, float f12, boolean z12, C42822w c42822w) {
        this.f34117a = gVar;
        this.f34118b = f12;
        this.f34119c = z12;
        Boolean bool = Boolean.FALSE;
        this.f34126j = C22126m3.g(bool);
        this.f34127k = C22126m3.g(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.material.ripple.m
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.material.ripple.m r0 = (androidx.compose.material.ripple.m) r0
            int r1 = r0.f34104t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34104t = r1
            goto L18
        L13:
            androidx.compose.material.ripple.m r0 = new androidx.compose.material.ripple.m
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f34102r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34104t
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            kotlin.C42729a0.b(r8)
            goto L93
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            androidx.compose.material.ripple.p r2 = r0.f34101q
            kotlin.C42729a0.b(r8)
            goto L77
        L3e:
            androidx.compose.material.ripple.p r2 = r0.f34101q
            kotlin.C42729a0.b(r8)
            goto L61
        L44:
            kotlin.C42729a0.b(r8)
            r0.f34101q = r7
            r0.f34104t = r5
            androidx.compose.material.ripple.n r8 = new androidx.compose.material.ripple.n
            r8.<init>(r7, r6)
            java.lang.Object r8 = kotlinx.coroutines.U.c(r8, r0)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r2) goto L5b
            goto L5d
        L5b:
            kotlin.G0 r8 = kotlin.G0.f406611a
        L5d:
            if (r8 != r1) goto L60
            return r1
        L60:
            r2 = r7
        L61:
            androidx.compose.runtime.y1 r8 = r2.f34126j
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            androidx.compose.runtime.i3 r8 = (androidx.compose.runtime.C22082i3) r8
            r8.setValue(r5)
            kotlinx.coroutines.z<kotlin.G0> r8 = r2.f34125i
            r0.f34101q = r2
            r0.f34104t = r4
            java.lang.Object r8 = r8.F(r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            r0.f34101q = r6
            r0.f34104t = r3
            r2.getClass()
            androidx.compose.material.ripple.o r8 = new androidx.compose.material.ripple.o
            r8.<init>(r2, r6)
            java.lang.Object r8 = kotlinx.coroutines.U.c(r8, r0)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r0) goto L8e
            goto L90
        L8e:
            kotlin.G0 r8 = kotlin.G0.f406611a
        L90:
            if (r8 != r1) goto L93
            return r1
        L93:
            kotlin.G0 r8 = kotlin.G0.f406611a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ripple.p.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b(@Y61.k androidx.compose.ui.graphics.drawscope.d dVar, long j12) {
        if (this.f34120d == null) {
            long jI2 = dVar.i();
            float f12 = q.f34128a;
            this.f34120d = Float.valueOf(Math.max(l0.n.e(jI2), l0.n.c(jI2)) * 0.3f);
        }
        if (this.f34117a == null) {
            this.f34117a = l0.g.a(dVar.v1());
        }
        if (this.f34121e == null) {
            this.f34121e = l0.g.a(l0.h.a(l0.n.e(dVar.i()) / 2.0f, l0.n.c(dVar.i()) / 2.0f));
        }
        float fFloatValue = (!((Boolean) ((C22082i3) this.f34127k).getF42167b()).booleanValue() || ((Boolean) ((C22082i3) this.f34126j).getF42167b()).booleanValue()) ? this.f34122f.f().floatValue() : 1.0f;
        float fB2 = E0.e.b(this.f34120d.floatValue(), this.f34118b, this.f34123g.f().floatValue());
        float fG2 = l0.g.g(this.f34117a.f413387a);
        float fG3 = l0.g.g(this.f34121e.f413387a);
        C20268c<Float, C20318t> c20268c = this.f34124h;
        long jA2 = l0.h.a(E0.e.b(fG2, fG3, c20268c.f().floatValue()), E0.e.b(l0.g.h(this.f34117a.f413387a), l0.g.h(this.f34121e.f413387a), c20268c.f().floatValue()));
        long jC2 = T.c(j12, T.e(j12) * fFloatValue);
        if (!this.f34119c) {
            androidx.compose.ui.graphics.drawscope.g.U(dVar, jC2, fB2, jA2, 0.0f, null, 0, 120);
            return;
        }
        float fE2 = l0.n.e(dVar.i());
        float fC2 = l0.n.c(dVar.i());
        S.f39317b.getClass();
        int i12 = S.f39318c;
        a.b f39478c = dVar.getF39478c();
        long jE2 = f39478c.e();
        f39478c.a().k();
        try {
            f39478c.f39485a.b(0.0f, 0.0f, fE2, fC2, i12);
            androidx.compose.ui.graphics.drawscope.g.U(dVar, jC2, fB2, jA2, 0.0f, null, 0, 120);
        } finally {
            H.C(f39478c, jE2);
        }
    }

    public final void c() {
        ((C22082i3) this.f34127k).setValue(Boolean.TRUE);
        this.f34125i.n(G0.f406611a);
    }
}
