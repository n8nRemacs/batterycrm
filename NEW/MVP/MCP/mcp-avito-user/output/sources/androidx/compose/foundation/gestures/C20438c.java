package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20273d1;
import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.C22040c3;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.bottom_sheet.SheetValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: AnchoredDraggable.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.gestures.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20438c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<androidx.compose.ui.input.pointer.C, Boolean> f27581a = a.f27584l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<Integer, Float> f27582b = b.f27585l;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.animation.core.H<Float> f27583c;

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "", "invoke", "(Landroidx/compose/ui/input/pointer/C;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.gestures.c$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f27584l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Boolean invoke(androidx.compose.ui.input.pointer.C c12) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.c$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Integer, Float> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f27585l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Float invoke(Integer num) {
            num.intValue();
            return Float.valueOf(Float.NaN);
        }
    }

    /* compiled from: AnchoredDraggable.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/gestures/c$c", "Landroidx/compose/animation/core/X;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    public static final class C1576c implements androidx.compose.animation.core.X {
        @Override // androidx.compose.animation.core.X
        /* renamed from: a */
        public final float getF26186a() {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.X
        public final long b(float f12) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.X
        public final float c(float f12, float f13) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.X
        public final float d(float f12, float f13, long j12) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.X
        public final float e(long j12, float f12) {
            return 0.0f;
        }
    }

    static {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f27583c = androidx.compose.animation.core.J.c(new C1576c());
    }

    @Y61.k
    public static final <T> T0<T> a(@Y61.k Y41.l<? super U0<T>, kotlin.G0> lVar) {
        U0 u02 = new U0();
        lVar.invoke(u02);
        ArrayList arrayList = u02.f27497a;
        return new Q(arrayList, C42756l.v(arrayList.size(), u02.f27498b));
    }

    public static final Object b(C20501s c20501s, float f12, InterfaceC20430a interfaceC20430a, T0 t02, Object obj, InterfaceC20307p interfaceC20307p, SuspendLambda suspendLambda) {
        Object objA;
        float fC2 = t02.c(obj);
        l0.e eVar = new l0.e();
        eVar.f406839b = Float.isNaN(((C22040c3) c20501s.f27971j).f()) ? 0.0f : ((C22040c3) c20501s.f27971j).f();
        if (!Float.isNaN(fC2)) {
            float f13 = eVar.f406839b;
            if (f13 != fC2 && (objA = C20273d1.a(f13, fC2, f12, interfaceC20307p, new C20458h(interfaceC20430a, eVar), suspendLambda)) == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return objA;
            }
        }
        return kotlin.G0.f406611a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:
    
        if (r1 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r1 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(androidx.compose.foundation.gestures.T0 r5, float r6, float r7, Y41.l r8, Y41.a r9) {
        /*
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L88
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L1c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r0 != 0) goto L24
            java.lang.Object r5 = r5.a(r6)
            goto L81
        L24:
            float r7 = java.lang.Math.abs(r7)
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L3f
            java.lang.Object r5 = r5.b(r6, r1)
            goto L81
        L3f:
            java.lang.Object r7 = r5.b(r6, r2)
            float r9 = r5.c(r7)
            java.lang.Object r0 = r5.b(r6, r3)
            float r5 = r5.c(r0)
            float r4 = r9 - r5
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r8.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = java.lang.Math.abs(r8)
            if (r1 == 0) goto L6a
            goto L6b
        L6a:
            r9 = r5
        L6b:
            float r9 = r9 - r6
            float r5 = java.lang.Math.abs(r9)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L75
            r2 = r3
        L75:
            if (r2 != r3) goto L7a
            if (r1 == 0) goto L7e
            goto L80
        L7a:
            if (r2 != 0) goto L82
            if (r1 == 0) goto L80
        L7e:
            r5 = r7
            goto L81
        L80:
            r5 = r0
        L81:
            return r5
        L82:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L88:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20438c.c(androidx.compose.foundation.gestures.T0, float, float, Y41.l, Y41.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(Y41.a r4, Y41.p r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.C20474l
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.l r0 = (androidx.compose.foundation.gestures.C20474l) r0
            int r1 = r0.f27829r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27829r = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.l r0 = new androidx.compose.foundation.gestures.l
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f27828q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27829r
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.C42729a0.b(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.C42729a0.b(r6)
            androidx.compose.foundation.gestures.m r6 = new androidx.compose.foundation.gestures.m     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r0.f27829r = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = kotlinx.coroutines.U.c(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            goto L45
        L43:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20438c.d(Y41.a, Y41.p, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static androidx.compose.ui.v e(androidx.compose.ui.v vVar, C20501s c20501s, boolean z12) {
        return vVar.d0(new AnchoredDraggableElement(c20501s, Orientation.f27425b, z12, null, null, null, null, null, 32, null));
    }

    public static Object f(C20501s c20501s, SheetValue sheetValue, Continuation continuation) {
        androidx.compose.animation.core.G1 g12;
        if (c20501s.d()) {
            g12 = c20501s.f27965d;
            if (g12 == null) {
                g12 = null;
            }
        } else {
            C20434b.f27562a.getClass();
            g12 = C20434b.f27563b;
        }
        C20462i c20462i = new C20462i(c20501s, g12, null);
        int i12 = C20501s.f27961p;
        Object objA = c20501s.a(sheetValue, MutatePriority.f26797b, c20462i, continuation);
        return objA == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objA : kotlin.G0.f406611a;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(@Y61.k androidx.compose.foundation.gestures.C20501s r13, java.lang.Object r14, float r15, @Y61.k androidx.compose.animation.core.InterfaceC20307p r16, @Y61.k androidx.compose.animation.core.H r17, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r7 = r15
            r0 = r18
            boolean r1 = r0 instanceof androidx.compose.foundation.gestures.C20466j
            if (r1 == 0) goto L17
            r1 = r0
            androidx.compose.foundation.gestures.j r1 = (androidx.compose.foundation.gestures.C20466j) r1
            int r2 = r1.f27770t
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f27770t = r2
        L15:
            r8 = r1
            goto L1d
        L17:
            androidx.compose.foundation.gestures.j r1 = new androidx.compose.foundation.gestures.j
            r1.<init>(r0)
            goto L15
        L1d:
            java.lang.Object r0 = r8.f27769s
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.f27770t
            r10 = 1
            if (r1 == 0) goto L3a
            if (r1 != r10) goto L32
            float r1 = r8.f27767q
            kotlin.jvm.internal.l0$e r2 = r8.f27768r
            kotlin.C42729a0.b(r0)
            goto L67
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.C42729a0.b(r0)
            kotlin.jvm.internal.l0$e r11 = new kotlin.jvm.internal.l0$e
            r11.<init>()
            r11.f406839b = r7
            androidx.compose.foundation.gestures.k r12 = new androidx.compose.foundation.gestures.k
            r6 = 0
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r11
            r5 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.f27768r = r11
            r8.f27767q = r7
            r8.f27770t = r10
            int r0 = androidx.compose.foundation.gestures.C20501s.f27961p
            androidx.compose.foundation.MutatePriority r0 = androidx.compose.foundation.MutatePriority.f26797b
            r1 = r13
            r2 = r14
            java.lang.Object r0 = r13.a(r14, r0, r12, r8)
            if (r0 != r9) goto L65
            return r9
        L65:
            r1 = r7
            r2 = r11
        L67:
            float r0 = r2.f406839b
            float r1 = r1 - r0
            java.lang.Float r0 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20438c.g(androidx.compose.foundation.gestures.s, java.lang.Object, float, androidx.compose.animation.core.p, androidx.compose.animation.core.H, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static Object h(C20501s c20501s, Object obj, float f12, ContinuationImpl continuationImpl) {
        androidx.compose.animation.core.G1 g12;
        androidx.compose.animation.core.H<Float> h12;
        if (c20501s.d()) {
            g12 = c20501s.f27965d;
            if (g12 == null) {
                g12 = null;
            }
        } else {
            C20434b.f27562a.getClass();
            g12 = C20434b.f27563b;
        }
        androidx.compose.animation.core.G1 g13 = g12;
        if (c20501s.d()) {
            androidx.compose.animation.core.H<Float> h13 = c20501s.f27966e;
            h12 = h13 != null ? h13 : null;
        } else {
            C20434b.f27562a.getClass();
            h12 = C20434b.f27565d;
        }
        return g(c20501s, obj, f12, g13, h12, continuationImpl);
    }
}
