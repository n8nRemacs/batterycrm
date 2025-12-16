package Fc1;

import Fc1.DialogC13657k6;
import Fc1.E3;
import android.app.Activity;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: Fc1.r7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C13720r7 implements U6 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L3 f5797b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13753v4 f5798c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Window f5799d;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public FrameLayout f5801f;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public kotlin.Q<l0.g, androidx.compose.ui.unit.u> f5803h;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5800e = C42727D.c(new b());

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f5802g = C42727D.c(a.f5804l);

    /* renamed from: Fc1.r7$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Rect> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f5804l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Rect invoke() {
            return new Rect();
        }
    }

    /* renamed from: Fc1.r7$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Integer> {
        public b() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Integer invoke() {
            /*
                r2 = this;
                Fc1.r7 r0 = Fc1.C13720r7.this
                android.view.Window r0 = r0.f5799d
                if (r0 == 0) goto L26
                android.view.View r0 = r0.getDecorView()
                androidx.core.view.J0 r0 = androidx.core.view.C22823h0.o(r0)
                if (r0 == 0) goto L1e
                r1 = 7
                androidx.core.graphics.k r0 = r0.e(r1)
                if (r0 == 0) goto L1e
                int r0 = r0.f44776b
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                goto L1f
            L1e:
                r0 = 0
            L1f:
                if (r0 == 0) goto L26
                int r0 = r0.intValue()
                goto L29
            L26:
                int r0 = kotlin.jvm.internal.J.f406821a
                r0 = 0
            L29:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Fc1.C13720r7.b.invoke():java.lang.Object");
        }
    }

    @Inject
    public C13720r7(@Y61.k L3 l32, @Y61.k InterfaceC13753v4 interfaceC13753v4) {
        this.f5797b = l32;
        this.f5798c = interfaceC13753v4;
    }

    public final Rect a() {
        return (Rect) this.f5802g.getValue();
    }

    @Override // Fc1.U6
    public final boolean d(boolean z12, @Y61.k MotionEvent motionEvent, @Y61.k E3.a aVar) {
        if (!(!z12)) {
            if (!z12) {
                throw new NoWhenBranchMatchedException();
            }
            Rect rectA = a();
            kotlin.Q<l0.g, androidx.compose.ui.unit.u> q12 = this.f5803h;
            if (q12 != null) {
                l0.g gVar = q12.f406619b;
                rectA.left = (int) l0.g.g(gVar.f413387a);
                float fG2 = l0.g.g(gVar.f413387a);
                androidx.compose.ui.unit.u uVar = q12.f406620c;
                rectA.right = (int) (fG2 + ((int) (uVar.f42872a >> 32)));
                rectA.top = (int) l0.g.h(gVar.f413387a);
                rectA.bottom = (int) (l0.g.h(gVar.f413387a) + ((int) (uVar.f42872a & 4294967295L)));
            }
            a().offset(0, ((Number) this.f5800e.getValue()).intValue());
            if (!a().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                Activity activityD = this.f5797b.d();
                if (activityD != null) {
                    return activityD.dispatchTouchEvent(motionEvent);
                }
                return true;
            }
        }
        return ((Boolean) aVar.invoke()).booleanValue();
    }

    @Override // Fc1.U6
    public final void e(@Y61.l FrameLayout frameLayout) {
        this.f5801f = frameLayout;
    }

    @Override // Fc1.U6
    public final void g(@Y61.l kotlin.Q<l0.g, androidx.compose.ui.unit.u> q12) {
        this.f5803h = q12;
    }

    @Override // Fc1.U6
    public final void i(@Y61.l Window window) {
        this.f5799d = window;
    }

    @Override // Fc1.U6
    public final boolean j(@Y61.k MotionEvent motionEvent, @Y61.k DialogC13657k6.d dVar) {
        boolean zP2 = this.f5798c.p();
        if (!zP2) {
            if (zP2) {
                throw new NoWhenBranchMatchedException();
            }
            FrameLayout frameLayout = this.f5801f;
            if (frameLayout != null) {
                frameLayout.getHitRect(a());
            }
            a().offset(0, ((Number) this.f5800e.getValue()).intValue());
            if (!a().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                Activity activityD = this.f5797b.d();
                if (activityD != null) {
                    return activityD.dispatchTouchEvent(motionEvent);
                }
                return true;
            }
        }
        return ((Boolean) dVar.invoke()).booleanValue();
    }
}
