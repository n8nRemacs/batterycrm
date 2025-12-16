package androidx.compose.material3;

import androidx.compose.foundation.gestures.InterfaceC20432a1;
import androidx.compose.ui.unit.h;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SnapFlingBehavior.kt */
@InterfaceC21537e7
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/Lg;", "Landroidx/compose/foundation/gestures/a1;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Lg implements InterfaceC20432a1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.lazy.w0 f35073a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.animation.core.H<Float> f35074b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.animation.core.R0 f35075c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f35076d;

    /* renamed from: e, reason: collision with root package name */
    public final float f35077e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Kg f35078f = new Kg(this);

    /* renamed from: g, reason: collision with root package name */
    public final float f35079g = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public final float f35080h;

    /* compiled from: SnapFlingBehavior.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material3.SnapFlingBehavior", f = "SnapFlingBehavior.kt", i = {}, l = {83}, m = "performFling", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f35081q;

        /* renamed from: s, reason: collision with root package name */
        public int f35083s;

        public a(ContinuationImpl continuationImpl) {
            super(continuationImpl);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f35081q = obj;
            this.f35083s |= BeduinInputModel.MIN_TEXT_VERSION;
            return Lg.this.a(null, 0.0f, this);
        }
    }

    public Lg(@Y61.k androidx.compose.foundation.lazy.w0 w0Var, @Y61.k androidx.compose.animation.core.H h12, @Y61.k androidx.compose.animation.core.R0 r02, @Y61.k androidx.compose.ui.unit.d dVar) {
        this.f35073a = w0Var;
        this.f35074b = h12;
        this.f35075c = r02;
        this.f35076d = dVar;
        this.f35077e = dVar.M0(this.f35080h);
        float f12 = Constants.MINIMAL_ERROR_STATUS_CODE;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        this.f35080h = f12;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.material3.Lg r11, androidx.compose.foundation.gestures.G1 r12, float r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r11.getClass()
            boolean r0 = r14 instanceof androidx.compose.material3.Jg
            if (r0 == 0) goto L17
            r0 = r14
            androidx.compose.material3.Jg r0 = (androidx.compose.material3.Jg) r0
            int r1 = r0.f34963u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f34963u = r1
        L15:
            r7 = r0
            goto L1d
        L17:
            androidx.compose.material3.Jg r0 = new androidx.compose.material3.Jg
            r0.<init>(r11, r14)
            goto L15
        L1d:
            java.lang.Object r14 = r7.f34961s
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.f34963u
            r2 = 1
            r3 = 0
            r4 = 2
            if (r1 == 0) goto L45
            if (r1 == r2) goto L3b
            if (r1 != r4) goto L33
            kotlin.C42729a0.b(r14)
            goto Ld1
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            androidx.compose.foundation.gestures.G1 r12 = r7.f34960r
            androidx.compose.material3.Lg r11 = r7.f34959q
            kotlin.C42729a0.b(r14)
        L42:
            r1 = r11
            r2 = r12
            goto Laf
        L45:
            kotlin.C42729a0.b(r14)
            androidx.compose.animation.core.H<java.lang.Float> r14 = r11.f35074b
            float r14 = androidx.compose.animation.core.J.a(r14, r3, r13)
            float r14 = java.lang.Math.abs(r14)
            androidx.compose.foundation.lazy.w0 r1 = r11.f35073a
            androidx.compose.foundation.lazy.Y r5 = r1.j()
            java.util.List r5 = r5.h()
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L92
            androidx.compose.foundation.lazy.Y r5 = r1.j()
            java.util.List r5 = r5.h()
            int r6 = r5.size()
            r8 = 0
            r9 = r8
        L72:
            if (r8 >= r6) goto L82
            java.lang.Object r10 = r5.get(r8)
            androidx.compose.foundation.lazy.K r10 = (androidx.compose.foundation.lazy.K) r10
            int r10 = r10.getF28969q()
            int r9 = r9 + r10
            int r8 = r8 + 1
            goto L72
        L82:
            float r5 = (float) r9
            androidx.compose.foundation.lazy.Y r1 = r1.j()
            java.util.List r1 = r1.h()
            int r1 = r1.size()
            float r1 = (float) r1
            float r5 = r5 / r1
            goto L93
        L92:
            r5 = r3
        L93:
            float r14 = r14 - r5
            float r14 = kotlin.ranges.s.a(r14, r3)
            int r1 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r1 != 0) goto L9d
            goto La2
        L9d:
            float r1 = java.lang.Math.signum(r13)
            float r14 = r14 * r1
        La2:
            r7.f34959q = r11
            r7.f34960r = r12
            r7.f34963u = r2
            java.lang.Object r14 = r11.i(r12, r14, r13, r7)
            if (r14 != r0) goto L42
            goto Ld2
        Laf:
            androidx.compose.material3.Q r14 = (androidx.compose.material3.Q) r14
            java.lang.Float r11 = r14.f35322a
            float r11 = r11.floatValue()
            androidx.compose.animation.core.r<T, V extends androidx.compose.animation.core.x> r12 = r14.f35323b
            r13 = 30
            androidx.compose.animation.core.r r5 = androidx.compose.animation.core.C20315s.b(r12, r3, r3, r13)
            androidx.compose.animation.core.R0 r6 = r1.f35075c
            r12 = 0
            r7.f34959q = r12
            r7.f34960r = r12
            r7.f34963u = r4
            r3 = r11
            r4 = r11
            java.lang.Object r14 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r14 != r0) goto Ld1
            goto Ld2
        Ld1:
            r0 = r14
        Ld2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Lg.c(androidx.compose.material3.Lg, androidx.compose.foundation.gestures.G1, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static float f(float f12, float f13) {
        if (f13 == 0.0f) {
            return 0.0f;
        }
        return f13 > 0.0f ? kotlin.ranges.s.c(f12, f13) : kotlin.ranges.s.a(f12, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static float g(float r13, androidx.compose.foundation.lazy.w0 r14) {
        /*
            androidx.compose.foundation.lazy.Y r14 = r14.j()
            java.util.List r0 = r14.h()
            int r1 = r0.size()
            r2 = 2139095040(0x7f800000, float:Infinity)
            r3 = -8388608(0xffffffffff800000, float:-Infinity)
            r4 = 0
            r6 = r2
            r5 = r3
        L13:
            r7 = 0
            if (r4 >= r1) goto L6c
            java.lang.Object r8 = r0.get(r4)
            androidx.compose.foundation.lazy.K r8 = (androidx.compose.foundation.lazy.K) r8
            androidx.compose.foundation.gestures.Orientation r9 = r14.b()
            androidx.compose.foundation.gestures.Orientation r10 = androidx.compose.foundation.gestures.Orientation.f27425b
            if (r9 != r10) goto L32
            long r9 = r14.c()
            androidx.compose.ui.unit.u$a r11 = androidx.compose.ui.unit.u.f42871b
            r11 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r11
        L30:
            int r9 = (int) r9
            goto L3c
        L32:
            long r9 = r14.c()
            androidx.compose.ui.unit.u$a r11 = androidx.compose.ui.unit.u.f42871b
            r11 = 32
            long r9 = r9 >> r11
            goto L30
        L3c:
            int r10 = r14.d()
            int r9 = r9 - r10
            int r10 = r14.e()
            int r9 = r9 - r10
            float r9 = (float) r9
            r10 = 2
            float r10 = (float) r10
            float r9 = r9 / r10
            int r11 = r8.getF28969q()
            float r11 = (float) r11
            float r11 = r11 / r10
            float r9 = r9 - r11
            int r8 = r8.getF28968p()
            float r8 = (float) r8
            float r8 = r8 - r9
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 > 0) goto L60
            int r9 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r9 <= 0) goto L60
            r5 = r8
        L60:
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 < 0) goto L69
            int r7 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r7 >= 0) goto L69
            r6 = r8
        L69:
            int r4 = r4 + 1
            goto L13
        L6c:
            kotlin.ranges.f r14 = kotlin.ranges.s.m(r5, r6)
            java.lang.Comparable r0 = r14.d()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Comparable r14 = r14.g()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            float r13 = java.lang.Math.signum(r13)
            int r1 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r1 != 0) goto L99
            float r13 = java.lang.Math.abs(r14)
            float r1 = java.lang.Math.abs(r0)
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 > 0) goto La9
            goto L9f
        L99:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 != 0) goto La1
        L9f:
            r0 = r14
            goto La9
        La1:
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            if (r13 != 0) goto La8
            goto La9
        La8:
            r0 = r7
        La9:
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto Lae
            goto Lb4
        Lae:
            int r13 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r13 != 0) goto Lb3
            goto Lb4
        Lb3:
            r7 = r0
        Lb4:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Lg.g(float, androidx.compose.foundation.lazy.w0):float");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.InterfaceC20432a1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k androidx.compose.foundation.gestures.G1 r5, float r6, @Y61.k kotlin.coroutines.Continuation<? super java.lang.Float> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.Lg.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.Lg$a r0 = (androidx.compose.material3.Lg.a) r0
            int r1 = r0.f35083s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35083s = r1
            goto L1a
        L13:
            androidx.compose.material3.Lg$a r0 = new androidx.compose.material3.Lg$a
            kotlin.coroutines.jvm.internal.ContinuationImpl r7 = (kotlin.coroutines.jvm.internal.ContinuationImpl) r7
            r0.<init>(r7)
        L1a:
            java.lang.Object r7 = r0.f35081q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f35083s
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.C42729a0.b(r7)
            goto L3f
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.C42729a0.b(r7)
            r0.f35083s = r3
            java.lang.Object r7 = r4.h(r5, r6, r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            androidx.compose.material3.Q r7 = (androidx.compose.material3.Q) r7
            java.lang.Float r5 = r7.f35322a
            float r5 = r5.floatValue()
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 != 0) goto L4d
            goto L59
        L4d:
            androidx.compose.animation.core.r<T, V extends androidx.compose.animation.core.x> r5 = r7.f35323b
            java.lang.Object r5 = r5.a()
            java.lang.Number r5 = (java.lang.Number) r5
            float r6 = r5.floatValue()
        L59:
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Lg.a(androidx.compose.foundation.gestures.G1, float, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(androidx.compose.foundation.gestures.G1 r6, float r7, androidx.compose.animation.core.r r8, androidx.compose.animation.core.H r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof androidx.compose.material3.Dg
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material3.Dg r0 = (androidx.compose.material3.Dg) r0
            int r1 = r0.f34637v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34637v = r1
            goto L18
        L13:
            androidx.compose.material3.Dg r0 = new androidx.compose.material3.Dg
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f34635t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34637v
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            float r7 = r0.f34632q
            kotlin.jvm.internal.l0$e r6 = r0.f34634s
            androidx.compose.animation.core.r r8 = r0.f34633r
            kotlin.C42729a0.b(r10)
            goto L67
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            kotlin.C42729a0.b(r10)
            kotlin.jvm.internal.l0$e r10 = new kotlin.jvm.internal.l0$e
            r10.<init>()
            java.lang.Object r2 = r8.a()
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
            androidx.compose.material3.Eg r4 = new androidx.compose.material3.Eg
            r4.<init>(r7, r6, r5, r10)
            r0.f34633r = r8
            r0.f34634s = r10
            r0.f34632q = r7
            r0.f34637v = r3
            java.lang.Object r6 = androidx.compose.animation.core.C20273d1.e(r8, r9, r2, r4, r0)
            if (r6 != r1) goto L66
            return r1
        L66:
            r6 = r10
        L67:
            androidx.compose.material3.Q r9 = new androidx.compose.material3.Q
            float r6 = r6.f406839b
            float r7 = r7 - r6
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r7)
            r9.<init>(r6, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Lg.d(androidx.compose.foundation.gestures.G1, float, androidx.compose.animation.core.r, androidx.compose.animation.core.H, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(androidx.compose.foundation.gestures.G1 r10, float r11, float r12, androidx.compose.animation.core.r r13, androidx.compose.animation.core.R0 r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof androidx.compose.material3.Fg
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.material3.Fg r0 = (androidx.compose.material3.Fg) r0
            int r1 = r0.f34749x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f34749x = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.Fg r0 = new androidx.compose.material3.Fg
            r0.<init>(r9, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f34747v
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f34749x
            r7 = 0
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            float r10 = r6.f34746u
            float r11 = r6.f34745t
            kotlin.jvm.internal.l0$e r12 = r6.f34744s
            androidx.compose.animation.core.r r13 = r6.f34743r
            androidx.compose.material3.Lg r14 = r6.f34742q
            kotlin.C42729a0.b(r15)
            goto L85
        L36:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3e:
            kotlin.C42729a0.b(r15)
            kotlin.jvm.internal.l0$e r15 = new kotlin.jvm.internal.l0$e
            r15.<init>()
            java.lang.Object r1 = r13.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r8 = r1.floatValue()
            java.lang.Float r3 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)
            java.lang.Object r1 = r13.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 != 0) goto L64
            r1 = r2
            goto L65
        L64:
            r1 = 0
        L65:
            r4 = r1 ^ 1
            androidx.compose.material3.Gg r5 = new androidx.compose.material3.Gg
            r5.<init>(r12, r10, r9, r15)
            r6.f34742q = r9
            r6.f34743r = r13
            r6.f34744s = r15
            r6.f34745t = r11
            r6.f34746u = r8
            r6.f34749x = r2
            r1 = r13
            r2 = r3
            r3 = r14
            java.lang.Object r10 = androidx.compose.animation.core.C20273d1.f(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L82
            return r0
        L82:
            r14 = r9
            r12 = r15
            r10 = r8
        L85:
            java.lang.Object r15 = r13.a()
            java.lang.Number r15 = (java.lang.Number) r15
            float r15 = r15.floatValue()
            r14.getClass()
            float r10 = f(r15, r10)
            androidx.compose.material3.Q r14 = new androidx.compose.material3.Q
            float r12 = r12.f406839b
            float r11 = r11 - r12
            java.lang.Float r11 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r11)
            r12 = 29
            androidx.compose.animation.core.r r10 = androidx.compose.animation.core.C20315s.b(r13, r7, r10, r12)
            r14.<init>(r11, r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Lg.e(androidx.compose.foundation.gestures.G1, float, float, androidx.compose.animation.core.r, androidx.compose.animation.core.R0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final boolean equals(@Y61.l Object obj) {
        if (!(obj instanceof Lg)) {
            return false;
        }
        Lg lg2 = (Lg) obj;
        return lg2.f35075c.equals(this.f35075c) && lg2.f35074b.equals(this.f35074b) && lg2.f35073a.equals(this.f35073a) && kotlin.jvm.internal.L.f(lg2.f35076d, this.f35076d);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(androidx.compose.foundation.gestures.G1 r5, float r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof androidx.compose.material3.Hg
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.material3.Hg r0 = (androidx.compose.material3.Hg) r0
            int r1 = r0.f34860s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34860s = r1
            goto L18
        L13:
            androidx.compose.material3.Hg r0 = new androidx.compose.material3.Hg
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f34858q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f34860s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r7)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.C42729a0.b(r7)
            androidx.compose.material3.Ig r7 = new androidx.compose.material3.Ig
            r2 = 0
            r7.<init>(r6, r4, r5, r2)
            r0.f34860s = r3
            androidx.compose.material3.Kg r5 = r4.f35078f
            java.lang.Object r7 = kotlinx.coroutines.C43259k.g(r5, r7, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            androidx.compose.material3.Q r7 = (androidx.compose.material3.Q) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Lg.h(androidx.compose.foundation.gestures.G1, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final int hashCode() {
        return this.f35076d.hashCode() + ((this.f35073a.hashCode() + ((this.f35074b.hashCode() + (this.f35075c.hashCode() * 31)) * 31)) * 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(androidx.compose.foundation.gestures.G1 r8, float r9, float r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof androidx.compose.material3.Mg
            if (r0 == 0) goto L14
            r0 = r11
            androidx.compose.material3.Mg r0 = (androidx.compose.material3.Mg) r0
            int r1 = r0.f35147t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f35147t = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material3.Mg r0 = new androidx.compose.material3.Mg
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f35145r
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f35147t
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            androidx.compose.material3.Lg r8 = r6.f35144q
            kotlin.C42729a0.b(r11)
            goto L50
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.C42729a0.b(r11)
            r11 = 28
            r1 = 0
            androidx.compose.animation.core.r r4 = androidx.compose.animation.core.C20315s.a(r1, r10, r11)
            r6.f35144q = r7
            r6.f35147t = r2
            androidx.compose.animation.core.H<java.lang.Float> r5 = r7.f35074b
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r11 = r1.d(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L4f
            return r0
        L4f:
            r8 = r7
        L50:
            androidx.compose.material3.Q r11 = (androidx.compose.material3.Q) r11
            androidx.compose.animation.core.r<T, V extends androidx.compose.animation.core.x> r9 = r11.f35323b
            java.lang.Object r10 = r9.a()
            java.lang.Number r10 = (java.lang.Number) r10
            float r10 = r10.floatValue()
            androidx.compose.foundation.lazy.w0 r8 = r8.f35073a
            float r8 = g(r10, r8)
            androidx.compose.material3.Q r10 = new androidx.compose.material3.Q
            java.lang.Float r8 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r8)
            r10.<init>(r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.Lg.i(androidx.compose.foundation.gestures.G1, float, float, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
