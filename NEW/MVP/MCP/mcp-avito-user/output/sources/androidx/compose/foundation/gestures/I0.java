package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.AbstractC20431a0;
import androidx.compose.foundation.interaction.a;
import androidx.compose.ui.input.pointer.C22340s;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.node.AbstractC22425n;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.C43108m;

/* compiled from: Draggable.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/I0;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/P0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class I0 extends AbstractC22425n implements androidx.compose.ui.node.P0 {

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public Orientation f27268r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.input.pointer.C, Boolean> f27269s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f27270t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.interaction.m f27271u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public C43108m f27272v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public a.b f27273w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27274x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.input.pointer.b0 f27275y;

    /* compiled from: Draggable.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/input/pointer/C;", "it", "", "invoke", "(Landroidx/compose/ui/input/pointer/C;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.input.pointer.C, Boolean> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(androidx.compose.ui.input.pointer.C c12) {
            return I0.this.f27269s.invoke(c12);
        }
    }

    public I0(@Y61.k Y41.l<? super androidx.compose.ui.input.pointer.C, Boolean> lVar, boolean z12, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.l Orientation orientation) {
        this.f27268r = orientation;
        this.f27269s = lVar;
        this.f27270t = z12;
        this.f27271u = mVar;
        new a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n2(androidx.compose.foundation.gestures.I0 r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.K0
            if (r0 == 0) goto L16
            r0 = r6
            androidx.compose.foundation.gestures.K0 r0 = (androidx.compose.foundation.gestures.K0) r0
            int r1 = r0.f27307t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27307t = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.K0 r0 = new androidx.compose.foundation.gestures.K0
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f27305r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27307t
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            androidx.compose.foundation.gestures.I0 r5 = r0.f27304q
            kotlin.C42729a0.b(r6)
            goto L51
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            kotlin.C42729a0.b(r6)
            androidx.compose.foundation.interaction.a$b r6 = r5.f27273w
            if (r6 == 0) goto L54
            androidx.compose.foundation.interaction.m r2 = r5.f27271u
            if (r2 == 0) goto L51
            androidx.compose.foundation.interaction.a$a r4 = new androidx.compose.foundation.interaction.a$a
            r4.<init>(r6)
            r0.f27304q = r5
            r0.f27307t = r3
            java.lang.Object r6 = r2.b(r4, r0)
            if (r6 != r1) goto L51
            goto L60
        L51:
            r6 = 0
            r5.f27273w = r6
        L54:
            androidx.compose.ui.unit.B$a r6 = androidx.compose.ui.unit.B.f42836b
            r6.getClass()
            r0 = 0
            r5.t2(r0)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L60:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.I0.n2(androidx.compose.foundation.gestures.I0, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o2(androidx.compose.foundation.gestures.I0 r6, androidx.compose.foundation.gestures.AbstractC20431a0.c r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6.getClass()
            boolean r0 = r8 instanceof androidx.compose.foundation.gestures.L0
            if (r0 == 0) goto L16
            r0 = r8
            androidx.compose.foundation.gestures.L0 r0 = (androidx.compose.foundation.gestures.L0) r0
            int r1 = r0.f27347v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27347v = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.L0 r0 = new androidx.compose.foundation.gestures.L0
            r0.<init>(r6, r8)
        L1b:
            java.lang.Object r8 = r0.f27345t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27347v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            androidx.compose.foundation.interaction.a$b r6 = r0.f27344s
            androidx.compose.foundation.gestures.a0$c r7 = r0.f27343r
            androidx.compose.foundation.gestures.I0 r0 = r0.f27342q
            kotlin.C42729a0.b(r8)
            goto L7c
        L35:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3d:
            androidx.compose.foundation.gestures.a0$c r7 = r0.f27343r
            androidx.compose.foundation.gestures.I0 r6 = r0.f27342q
            kotlin.C42729a0.b(r8)
            goto L62
        L45:
            kotlin.C42729a0.b(r8)
            androidx.compose.foundation.interaction.a$b r8 = r6.f27273w
            if (r8 == 0) goto L62
            androidx.compose.foundation.interaction.m r2 = r6.f27271u
            if (r2 == 0) goto L62
            androidx.compose.foundation.interaction.a$a r5 = new androidx.compose.foundation.interaction.a$a
            r5.<init>(r8)
            r0.f27342q = r6
            r0.f27343r = r7
            r0.f27347v = r4
            java.lang.Object r8 = r2.b(r5, r0)
            if (r8 != r1) goto L62
            goto L87
        L62:
            androidx.compose.foundation.interaction.a$b r8 = new androidx.compose.foundation.interaction.a$b
            r8.<init>()
            androidx.compose.foundation.interaction.m r2 = r6.f27271u
            if (r2 == 0) goto L7e
            r0.f27342q = r6
            r0.f27343r = r7
            r0.f27344s = r8
            r0.f27347v = r3
            java.lang.Object r0 = r2.b(r8, r0)
            if (r0 != r1) goto L7a
            goto L87
        L7a:
            r0 = r6
            r6 = r8
        L7c:
            r8 = r6
            r6 = r0
        L7e:
            r6.f27273w = r8
            long r7 = r7.f27546a
            r6.s2(r7)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L87:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.I0.o2(androidx.compose.foundation.gestures.I0, androidx.compose.foundation.gestures.a0$c, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object p2(androidx.compose.foundation.gestures.I0 r5, androidx.compose.foundation.gestures.AbstractC20431a0.d r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof androidx.compose.foundation.gestures.M0
            if (r0 == 0) goto L16
            r0 = r7
            androidx.compose.foundation.gestures.M0 r0 = (androidx.compose.foundation.gestures.M0) r0
            int r1 = r0.f27356u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f27356u = r1
            goto L1b
        L16:
            androidx.compose.foundation.gestures.M0 r0 = new androidx.compose.foundation.gestures.M0
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.f27354s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f27356u
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            androidx.compose.foundation.gestures.a0$d r6 = r0.f27353r
            androidx.compose.foundation.gestures.I0 r5 = r0.f27352q
            kotlin.C42729a0.b(r7)
            goto L55
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            kotlin.C42729a0.b(r7)
            androidx.compose.foundation.interaction.a$b r7 = r5.f27273w
            if (r7 == 0) goto L58
            androidx.compose.foundation.interaction.m r2 = r5.f27271u
            if (r2 == 0) goto L55
            androidx.compose.foundation.interaction.a$c r4 = new androidx.compose.foundation.interaction.a$c
            r4.<init>(r7)
            r0.f27352q = r5
            r0.f27353r = r6
            r0.f27356u = r3
            java.lang.Object r7 = r2.b(r4, r0)
            if (r7 != r1) goto L55
            goto L5f
        L55:
            r7 = 0
            r5.f27273w = r7
        L58:
            long r6 = r6.f27547a
            r5.t2(r6)
            kotlin.G0 r1 = kotlin.G0.f406611a
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.I0.p2(androidx.compose.foundation.gestures.I0, androidx.compose.foundation.gestures.a0$d, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // androidx.compose.ui.v.d
    public final void d2() {
        this.f27274x = false;
        q2();
    }

    @Override // androidx.compose.ui.node.P0
    public final void p1() {
        androidx.compose.ui.input.pointer.b0 b0Var = this.f27275y;
        if (b0Var != null) {
            b0Var.p1();
        }
    }

    public final void q2() {
        a.b bVar = this.f27273w;
        if (bVar != null) {
            androidx.compose.foundation.interaction.m mVar = this.f27271u;
            if (mVar != null) {
                mVar.a(new a.C1584a(bVar));
            }
            this.f27273w = null;
        }
    }

    @Override // androidx.compose.ui.node.P0
    public void r0(@Y61.k C22340s c22340s, @Y61.k PointerEventPass pointerEventPass, long j12) {
        if (this.f27270t && this.f27275y == null) {
            androidx.compose.ui.input.pointer.g0 g0VarB = androidx.compose.ui.input.pointer.Z.b(new J0(this));
            k2(g0VarB);
            this.f27275y = g0VarB;
        }
        androidx.compose.ui.input.pointer.b0 b0Var = this.f27275y;
        if (b0Var != null) {
            b0Var.r0(c22340s, pointerEventPass, j12);
        }
    }

    @Y61.l
    public abstract Object r2(@Y61.k Y41.p<? super Y41.l<? super AbstractC20431a0.b, kotlin.G0>, ? super Continuation<? super kotlin.G0>, ? extends Object> pVar, @Y61.k Continuation<? super kotlin.G0> continuation);

    public abstract void s2(long j12);

    public abstract void t2(long j12);

    public abstract boolean u2();

    public final void v2(@Y61.k Y41.l<? super androidx.compose.ui.input.pointer.C, Boolean> lVar, boolean z12, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.l Orientation orientation, boolean z13) {
        androidx.compose.ui.input.pointer.b0 b0Var;
        this.f27269s = lVar;
        boolean z14 = true;
        if (this.f27270t != z12) {
            this.f27270t = z12;
            if (!z12) {
                q2();
                androidx.compose.ui.input.pointer.b0 b0Var2 = this.f27275y;
                if (b0Var2 != null) {
                    l2(b0Var2);
                }
                this.f27275y = null;
            }
            z13 = true;
        }
        if (!kotlin.jvm.internal.L.f(this.f27271u, mVar)) {
            q2();
            this.f27271u = mVar;
        }
        if (this.f27268r != orientation) {
            this.f27268r = orientation;
        } else {
            z14 = z13;
        }
        if (!z14 || (b0Var = this.f27275y) == null) {
            return;
        }
        b0Var.B0();
    }
}
