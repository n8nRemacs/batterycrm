package androidx.compose.foundation.gestures;

import androidx.compose.runtime.F3;
import kotlin.Metadata;

/* compiled from: TapGestureDetector.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/y1;", "Landroidx/compose/foundation/gestures/u1;", "Landroidx/compose/ui/unit/d;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20521y1 implements InterfaceC20509u1, androidx.compose.ui.unit.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.unit.d f28095b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28096c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f28097d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.sync.d f28098e = new kotlinx.coroutines.sync.d();

    public C20521y1(@Y61.k androidx.compose.ui.unit.d dVar) {
        this.f28095b = dVar;
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float A0(long j12) {
        return this.f28095b.A0(j12);
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final float E(long j12) {
        return this.f28095b.E(j12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float J(int i12) {
        return this.f28095b.J(i12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float K(float f12) {
        return this.f28095b.K(f12);
    }

    @Override // androidx.compose.ui.unit.n
    /* renamed from: K0 */
    public final float getF42847c() {
        return this.f28095b.getF42847c();
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long L(long j12) {
        return this.f28095b.L(j12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final float M0(float f12) {
        return this.f28095b.M0(f12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int O0(long j12) {
        return this.f28095b.O0(j12);
    }

    public final void f() {
        this.f28097d = true;
        kotlinx.coroutines.sync.d dVar = this.f28098e;
        if (dVar.a()) {
            dVar.d(null);
        }
    }

    @Override // androidx.compose.ui.unit.d
    /* renamed from: getDensity */
    public final float getF42846b() {
        return this.f28095b.getF42846b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC20509u1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k1(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.C20512v1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.v1 r0 = (androidx.compose.foundation.gestures.C20512v1) r0
            int r1 = r0.f28068s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28068s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.v1 r0 = new androidx.compose.foundation.gestures.v1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28066q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28068s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r5)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.C42729a0.b(r5)
            r0.f28068s = r3
            java.lang.Object r5 = r4.p0(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L48
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        L48:
            androidx.compose.foundation.gestures.GestureCancellationException r5 = new androidx.compose.foundation.gestures.GestureCancellationException
            java.lang.String r0 = "The press gesture was canceled."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20521y1.k1(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void m() {
        this.f28096c = true;
        kotlinx.coroutines.sync.d dVar = this.f28098e;
        if (dVar.a()) {
            dVar.d(null);
        }
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long n(long j12) {
        return this.f28095b.n(j12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final long o(float f12) {
        return this.f28095b.o(f12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC20509u1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.C20518x1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.x1 r0 = (androidx.compose.foundation.gestures.C20518x1) r0
            int r1 = r0.f28094t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28094t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.x1 r0 = new androidx.compose.foundation.gestures.x1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28092r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28094t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.foundation.gestures.y1 r0 = r0.f28091q
            kotlin.C42729a0.b(r5)
            goto L4c
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            boolean r5 = r4.f28096c
            if (r5 != 0) goto L53
            boolean r5 = r4.f28097d
            if (r5 != 0) goto L53
            kotlinx.coroutines.sync.d r5 = r4.f28098e
            r0.f28091q = r4
            r0.f28094t = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            kotlinx.coroutines.sync.d r5 = r0.f28098e
            r1 = 0
            r5.d(r1)
            goto L54
        L53:
            r0 = r4
        L54:
            boolean r5 = r0.f28096c
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20521y1.p0(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(@Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.gestures.C20515w1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.gestures.w1 r0 = (androidx.compose.foundation.gestures.C20515w1) r0
            int r1 = r0.f28085t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28085t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.w1 r0 = new androidx.compose.foundation.gestures.w1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f28083r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28085t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.foundation.gestures.y1 r0 = r0.f28082q
            kotlin.C42729a0.b(r5)
            goto L44
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            kotlin.C42729a0.b(r5)
            kotlinx.coroutines.sync.d r5 = r4.f28098e
            r0.f28082q = r4
            r0.f28085t = r3
            java.lang.Object r5 = r5.b(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            r5 = 0
            r0.f28096c = r5
            r0.f28097d = r5
            kotlin.G0 r5 = kotlin.G0.f406611a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20521y1.r(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.unit.n
    @F3
    public final long s(float f12) {
        return this.f28095b.s(f12);
    }

    @Override // androidx.compose.ui.unit.d
    @F3
    public final int y0(float f12) {
        return this.f28095b.y0(f12);
    }
}
