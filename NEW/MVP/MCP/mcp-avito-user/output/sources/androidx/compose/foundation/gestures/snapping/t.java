package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.C20304o;
import androidx.compose.foundation.N0;
import androidx.compose.foundation.gestures.G1;
import androidx.compose.foundation.gestures.snapping.l;
import androidx.compose.ui.unit.h;
import com.adjust.sdk.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SnapFlingBehavior.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final float f28054a;

    static {
        float f12 = Constants.MINIMAL_ERROR_STATUS_CODE;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f28054a = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(androidx.compose.foundation.gestures.G1 r5, float r6, androidx.compose.animation.core.r r7, androidx.compose.animation.core.H r8, Y41.l r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.gestures.snapping.p
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.foundation.gestures.snapping.p r0 = (androidx.compose.foundation.gestures.snapping.p) r0
            int r1 = r0.f28039u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28039u = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.snapping.p r0 = new androidx.compose.foundation.gestures.snapping.p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f28038t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f28039u
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            float r6 = r0.f28035q
            kotlin.jvm.internal.l0$e r5 = r0.f28037s
            androidx.compose.animation.core.r r7 = r0.f28036r
            kotlin.C42729a0.b(r10)
            goto L67
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.C42729a0.b(r10)
            kotlin.jvm.internal.l0$e r10 = new kotlin.jvm.internal.l0$e
            r10.<init>()
            java.lang.Object r2 = r7.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L50
            r2 = r3
            goto L51
        L50:
            r2 = 0
        L51:
            r2 = r2 ^ r3
            androidx.compose.foundation.gestures.snapping.q r4 = new androidx.compose.foundation.gestures.snapping.q
            r4.<init>(r6, r10, r5, r9)
            r0.f28036r = r7
            r0.f28037s = r10
            r0.f28035q = r6
            r0.f28039u = r3
            java.lang.Object r5 = androidx.compose.animation.core.C20273d1.e(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L66
            goto L73
        L66:
            r5 = r10
        L67:
            androidx.compose.foundation.gestures.snapping.a r1 = new androidx.compose.foundation.gestures.snapping.a
            float r5 = r5.f406839b
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r6)
            r1.<init>(r5, r7)
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.t.a(androidx.compose.foundation.gestures.G1, float, androidx.compose.animation.core.r, androidx.compose.animation.core.H, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void b(C20304o c20304o, G1 g12, Y41.l lVar, float f12) {
        float fA2;
        if (N0.f26803a) {
            try {
                fA2 = g12.a(f12);
            } catch (CancellationException unused) {
                c20304o.a();
                fA2 = 0.0f;
            }
        } else {
            fA2 = g12.a(f12);
        }
        ((l.b) lVar).invoke(Float.valueOf(fA2));
        if (Math.abs(f12 - fA2) > 0.5f) {
            c20304o.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.G1 r9, float r10, float r11, androidx.compose.animation.core.r r12, androidx.compose.animation.core.V r13, Y41.l r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.snapping.r
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.foundation.gestures.snapping.r r0 = (androidx.compose.foundation.gestures.snapping.r) r0
            int r1 = r0.f28049v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f28049v = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.gestures.snapping.r r0 = new androidx.compose.foundation.gestures.snapping.r
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f28048u
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f28049v
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 != r2) goto L34
            float r9 = r6.f28045r
            float r10 = r6.f28044q
            kotlin.jvm.internal.l0$e r11 = r6.f28047t
            androidx.compose.animation.core.r r12 = r6.f28046s
            kotlin.C42729a0.b(r15)
            goto L80
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            kotlin.C42729a0.b(r15)
            kotlin.jvm.internal.l0$e r15 = new kotlin.jvm.internal.l0$e
            r15.<init>()
            java.lang.Object r1 = r12.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)
            java.lang.Object r1 = r12.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L62
            r1 = r2
            goto L63
        L62:
            r1 = 0
        L63:
            r4 = r1 ^ 1
            androidx.compose.foundation.gestures.snapping.s r5 = new androidx.compose.foundation.gestures.snapping.s
            r5.<init>(r11, r15, r9, r14)
            r6.f28046s = r12
            r6.f28047t = r15
            r6.f28044q = r10
            r6.f28045r = r8
            r6.f28049v = r2
            r1 = r12
            r2 = r3
            r3 = r13
            java.lang.Object r9 = androidx.compose.animation.core.C20273d1.f(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto L7e
            goto La0
        L7e:
            r11 = r15
            r9 = r8
        L80:
            java.lang.Object r13 = r12.a()
            java.lang.Number r13 = (java.lang.Number) r13
            float r13 = r13.floatValue()
            float r9 = d(r13, r9)
            androidx.compose.foundation.gestures.snapping.a r0 = new androidx.compose.foundation.gestures.snapping.a
            float r11 = r11.f406839b
            float r10 = r10 - r11
            java.lang.Float r10 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r10)
            r11 = 29
            androidx.compose.animation.core.r r9 = androidx.compose.animation.core.C20315s.b(r12, r7, r9, r11)
            r0.<init>(r10, r9)
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.t.c(androidx.compose.foundation.gestures.G1, float, float, androidx.compose.animation.core.r, androidx.compose.animation.core.V, Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final float d(float f12, float f13) {
        if (f13 == 0.0f) {
            return 0.0f;
        }
        return f13 > 0.0f ? kotlin.ranges.s.c(f12, f13) : kotlin.ranges.s.a(f12, f13);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @androidx.compose.runtime.InterfaceC22132o
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.foundation.gestures.InterfaceC20481m2 e(@Y61.k androidx.compose.foundation.gestures.snapping.u r3, @Y61.l androidx.compose.runtime.A r4, int r5) {
        /*
            androidx.compose.runtime.J3 r0 = androidx.compose.ui.platform.Q0.f41199h
            java.lang.Object r0 = r4.o(r0)
            androidx.compose.ui.unit.d r0 = (androidx.compose.ui.unit.d) r0
            androidx.compose.animation.core.H r1 = androidx.compose.animation.x2.a(r4)
            r5 = r5 & 14
            r5 = r5 ^ 6
            r2 = 4
            if (r5 <= r2) goto L1c
            boolean r5 = r4.B(r3)
            if (r5 != 0) goto L1a
            goto L1c
        L1a:
            r5 = 1
            goto L1d
        L1c:
            r5 = 0
        L1d:
            boolean r2 = r4.B(r1)
            r5 = r5 | r2
            boolean r0 = r4.B(r0)
            r5 = r5 | r0
            java.lang.Object r0 = r4.t()
            if (r5 != 0) goto L36
            androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
            r5.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r0 != r5) goto L46
        L36:
            r5 = 5
            r0 = 0
            r2 = 1137180672(0x43c80000, float:400.0)
            androidx.compose.animation.core.R0 r5 = androidx.compose.animation.core.C20310q.d(r2, r5, r0)
            androidx.compose.foundation.gestures.snapping.o r0 = new androidx.compose.foundation.gestures.snapping.o
            r0.<init>(r3, r1, r5)
            r4.H(r0)
        L46:
            androidx.compose.foundation.gestures.m2 r0 = (androidx.compose.foundation.gestures.InterfaceC20481m2) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.t.e(androidx.compose.foundation.gestures.snapping.u, androidx.compose.runtime.A, int):androidx.compose.foundation.gestures.m2");
    }
}
