package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.H;
import androidx.compose.animation.core.V;
import androidx.compose.foundation.gestures.InterfaceC20481m2;
import androidx.compose.foundation.gestures.K1;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SnapFlingBehavior.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/o;", "Landroidx/compose/foundation/gestures/m2;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o implements InterfaceC20481m2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final u f28031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final H<Float> f28032b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final V f28033c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final K1.b f28034d = K1.f27310c;

    public o(@Y61.k u uVar, @Y61.k H h12, @Y61.k V v12) {
        this.f28031a = uVar;
        this.f28032b = h12;
        this.f28033c = v12;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.snapping.o r7, androidx.compose.foundation.gestures.G1 r8, float r9, float r10, Y41.l r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            r7.getClass()
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.snapping.n
            if (r0 == 0) goto L17
            r0 = r12
            androidx.compose.foundation.gestures.snapping.n r0 = (androidx.compose.foundation.gestures.snapping.n) r0
            int r1 = r0.f28030s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f28030s = r1
        L15:
            r6 = r0
            goto L1d
        L17:
            androidx.compose.foundation.gestures.snapping.n r0 = new androidx.compose.foundation.gestures.snapping.n
            r0.<init>(r7, r12)
            goto L15
        L1d:
            java.lang.Object r12 = r6.f28028q
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f28030s
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            kotlin.C42729a0.b(r12)
            goto L89
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.C42729a0.b(r12)
            float r12 = java.lang.Math.abs(r9)
            r1 = 0
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L43
            goto L4b
        L43:
            float r12 = java.lang.Math.abs(r10)
            int r12 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r12 != 0) goto L53
        L4b:
            r7 = 28
            androidx.compose.animation.core.r r7 = androidx.compose.animation.core.C20315s.a(r9, r10, r7)
        L51:
            r0 = r7
            goto L8e
        L53:
            r6.f28030s = r2
            androidx.compose.animation.core.H<java.lang.Float> r12 = r7.f28032b
            float r1 = androidx.compose.animation.core.J.a(r12, r1, r10)
            float r1 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r9)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 < 0) goto L6e
            androidx.compose.foundation.gestures.snapping.c r7 = new androidx.compose.foundation.gestures.snapping.c
            r7.<init>(r12)
            r1 = r7
            goto L76
        L6e:
            androidx.compose.foundation.gestures.snapping.x r12 = new androidx.compose.foundation.gestures.snapping.x
            androidx.compose.animation.core.V r7 = r7.f28033c
            r12.<init>(r7)
            r1 = r12
        L76:
            float r7 = androidx.compose.foundation.gestures.snapping.t.f28054a
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r9)
            java.lang.Float r4 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)
            r2 = r8
            r5 = r11
            java.lang.Object r12 = r1.a(r2, r3, r4, r5, r6)
            if (r12 != r0) goto L89
            goto L8e
        L89:
            androidx.compose.foundation.gestures.snapping.a r12 = (androidx.compose.foundation.gestures.snapping.a) r12
            androidx.compose.animation.core.r<T, V extends androidx.compose.animation.core.x> r7 = r12.f28001b
            goto L51
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.o.c(androidx.compose.foundation.gestures.snapping.o, androidx.compose.foundation.gestures.G1, float, float, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC20481m2
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k androidx.compose.foundation.gestures.G1 r5, float r6, @Y61.k Y41.l r7, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.snapping.m
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.gestures.snapping.m r0 = (androidx.compose.foundation.gestures.snapping.m) r0
            int r1 = r0.f28027s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28027s = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.m r0 = new androidx.compose.foundation.gestures.snapping.m
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f28025q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28027s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r8)
            goto L3d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r8)
            r0.f28027s = r3
            java.lang.Object r8 = r4.d(r5, r6, r7, r0)
            if (r8 != r1) goto L3d
            return r1
        L3d:
            androidx.compose.foundation.gestures.snapping.a r8 = (androidx.compose.foundation.gestures.snapping.a) r8
            java.lang.Float r5 = r8.f28000a
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L4b
            goto L57
        L4b:
            androidx.compose.animation.core.r<T, V extends androidx.compose.animation.core.x> r5 = r8.f28001b
            java.lang.Object r5 = r5.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L57:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.o.b(androidx.compose.foundation.gestures.G1, float, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(androidx.compose.foundation.gestures.G1 r11, float r12, Y41.l r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof androidx.compose.foundation.gestures.snapping.k
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.foundation.gestures.snapping.k r0 = (androidx.compose.foundation.gestures.snapping.k) r0
            int r1 = r0.f28014t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28014t = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.k r0 = new androidx.compose.foundation.gestures.snapping.k
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.f28012r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28014t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            Y41.l r11 = r0.f28011q
            r13 = r11
            Y41.l r13 = (Y41.l) r13
            kotlin.C42729a0.b(r14)
            goto L51
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            kotlin.C42729a0.b(r14)
            androidx.compose.foundation.gestures.K1$b r14 = r10.f28034d
            androidx.compose.foundation.gestures.snapping.l r2 = new androidx.compose.foundation.gestures.snapping.l
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r12
            r7 = r13
            r8 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f28011q = r13
            r0.f28014t = r3
            java.lang.Object r14 = kotlinx.coroutines.C43259k.g(r14, r2, r0)
            if (r14 != r1) goto L51
            return r1
        L51:
            androidx.compose.foundation.gestures.snapping.a r14 = (androidx.compose.foundation.gestures.snapping.a) r14
            r11 = 0
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)
            r13.invoke(r11)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.o.d(androidx.compose.foundation.gestures.G1, float, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(oVar.f28033c, this.f28033c) && L.f(oVar.f28032b, this.f28032b) && L.f(oVar.f28031a, this.f28031a);
    }

    public final int hashCode() {
        return this.f28031a.hashCode() + ((this.f28032b.hashCode() + (this.f28033c.hashCode() * 31)) * 31);
    }
}
