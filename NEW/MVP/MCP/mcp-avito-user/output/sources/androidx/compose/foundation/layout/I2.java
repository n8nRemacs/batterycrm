package androidx.compose.foundation.layout;

import android.graphics.Insets;
import android.os.CancellationSignal;
import android.view.View;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import androidx.compose.runtime.C22082i3;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WindowInsetsConnection.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/layout/I2;", "Landroidx/compose/ui/input/nestedscroll/a;", "Landroid/view/WindowInsetsAnimationControlListener;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class I2 implements androidx.compose.ui.input.nestedscroll.a, WindowInsetsAnimationControlListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C20581j f28318b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final View f28319c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC20584j2 f28320d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f28321e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public WindowInsetsAnimationController f28322f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28323g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CancellationSignal f28324h = new CancellationSignal();

    /* renamed from: i, reason: collision with root package name */
    public float f28325i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.N0 f28326j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public kotlinx.coroutines.r f28327k;

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f28328l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Throwable th2) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: WindowInsetsConnection.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<Throwable, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f28329l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(Throwable th2) {
            return kotlin.G0.f406611a;
        }
    }

    public I2(@Y61.k C20581j c20581j, @Y61.k View view, @Y61.k InterfaceC20584j2 interfaceC20584j2, @Y61.k androidx.compose.ui.unit.d dVar) {
        this.f28318b = c20581j;
        this.f28319c = view;
        this.f28320d = interfaceC20584j2;
        this.f28321e = dVar;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object U0(long j12, long j13, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        return b(j13, this.f28320d.d(androidx.compose.ui.unit.B.c(j13), androidx.compose.ui.unit.B.d(j13)), true, (ContinuationImpl) continuation);
    }

    public final void a() {
        WindowInsetsAnimationController windowInsetsAnimationController;
        WindowInsetsAnimationController windowInsetsAnimationController2 = this.f28322f;
        if (windowInsetsAnimationController2 != null && windowInsetsAnimationController2.isReady() && (windowInsetsAnimationController = this.f28322f) != null) {
            windowInsetsAnimationController.finish(((Boolean) ((C22082i3) this.f28318b.f28651e).getF42167b()).booleanValue());
        }
        this.f28322f = null;
        kotlinx.coroutines.r rVar = this.f28327k;
        if (rVar != null) {
            rVar.C(a.f28328l, null);
        }
        this.f28327k = null;
        kotlinx.coroutines.N0 n02 = this.f28326j;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).V(new C20643y2());
        }
        this.f28326j = null;
        this.f28325i = 0.0f;
        this.f28323g = false;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long a1(int i12, long j12) {
        return d(j12, this.f28320d.a(Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (4294967295L & j12))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r28, float r30, boolean r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.layout.I2.b(long, float, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void c() {
        if (this.f28323g) {
            return;
        }
        this.f28323g = true;
        WindowInsetsController windowInsetsController = this.f28319c.getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.controlWindowInsetsAnimation(this.f28318b.f28648b, -1L, null, this.f28324h, H91.d.l(this));
        }
    }

    public final long d(long j12, float f12) {
        kotlinx.coroutines.N0 n02 = this.f28326j;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).V(new C20643y2());
            this.f28326j = null;
        }
        WindowInsetsAnimationController windowInsetsAnimationController = this.f28322f;
        if (f12 != 0.0f) {
            if (((Boolean) ((C22082i3) this.f28318b.f28651e).getF42167b()).booleanValue() != (f12 > 0.0f) || windowInsetsAnimationController != null) {
                if (windowInsetsAnimationController == null) {
                    this.f28325i = 0.0f;
                    c();
                    return this.f28320d.e(j12);
                }
                int iC2 = this.f28320d.c(windowInsetsAnimationController.getHiddenStateInsets());
                int iC3 = this.f28320d.c(windowInsetsAnimationController.getShownStateInsets());
                Insets currentInsets = windowInsetsAnimationController.getCurrentInsets();
                int iC4 = this.f28320d.c(currentInsets);
                if (iC4 == (f12 > 0.0f ? iC3 : iC2)) {
                    this.f28325i = 0.0f;
                    l0.g.f413384b.getClass();
                    return 0L;
                }
                float f13 = iC4 + f12 + this.f28325i;
                int iG2 = kotlin.ranges.s.g(Math.round(f13), iC2, iC3);
                this.f28325i = f13 - Math.round(f13);
                if (iG2 != iC4) {
                    windowInsetsAnimationController.setInsetsAndAlpha(this.f28320d.b(currentInsets, iG2), 1.0f, 0.0f);
                }
                return this.f28320d.e(j12);
            }
        }
        l0.g.f413384b.getClass();
        return 0L;
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long h1(int i12, long j12, long j13) {
        return d(j13, this.f28320d.d(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (4294967295L & j13))));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    @Y61.l
    public final Object k0(long j12, @Y61.k Continuation<? super androidx.compose.ui.unit.B> continuation) {
        return b(j12, this.f28320d.a(androidx.compose.ui.unit.B.c(j12), androidx.compose.ui.unit.B.d(j12)), false, (ContinuationImpl) continuation);
    }

    public final void onCancelled(@Y61.l WindowInsetsAnimationController windowInsetsAnimationController) {
        a();
    }

    public final void onFinished(@Y61.k WindowInsetsAnimationController windowInsetsAnimationController) {
        a();
    }

    public final void onReady(@Y61.k WindowInsetsAnimationController windowInsetsAnimationController, int i12) {
        this.f28322f = windowInsetsAnimationController;
        this.f28323g = false;
        kotlinx.coroutines.r rVar = this.f28327k;
        if (rVar != null) {
            rVar.C(b.f28329l, windowInsetsAnimationController);
        }
        this.f28327k = null;
    }
}
