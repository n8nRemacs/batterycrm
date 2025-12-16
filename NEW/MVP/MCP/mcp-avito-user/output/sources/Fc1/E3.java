package Fc1;

import Fc1.DialogC13657k6;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.R;
import i31.InterfaceC41220a;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class E3 extends androidx.appcompat.app.A implements U6 {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13779y3 f4904g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13706q1 f4905h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final V7 f4906i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final B0 f4907j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ U6 f4908k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final kotlinx.coroutines.flow.Z1<Boolean> f4909l;

    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ MotionEvent f4911m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MotionEvent motionEvent) {
            super(0);
            this.f4911m = motionEvent;
        }

        @Override // Y41.a
        public final Boolean invoke() {
            return Boolean.valueOf(E3.super.dispatchTouchEvent(this.f4911m));
        }
    }

    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C22143q0 c22143q0 = C13707q2.f5762a;
                E3 e32 = E3.this;
                androidx.compose.runtime.S.a(c22143q0.b(e32.f4904g), androidx.compose.runtime.internal.r.b(a13, -2129647974, new W3(e32)), a13, 48);
            }
            return kotlin.G0.f406611a;
        }
    }

    @i31.c
    public E3(@Y61.k L3 l32, @Y61.k InterfaceC13779y3 interfaceC13779y3, @Y61.k InterfaceC13706q1 interfaceC13706q1, @Y61.k V7 v72, @Y61.k U6 u62, @InterfaceC41220a @Y61.k B0 b02) {
        super(l32.b(), R.style.FeedbackTranslucentNoTitleBarDialogStyle);
        this.f4904g = interfaceC13779y3;
        this.f4905h = interfaceC13706q1;
        this.f4906i = v72;
        this.f4907j = b02;
        this.f4908k = u62;
        this.f4909l = kotlinx.coroutines.flow.p2.a(Boolean.FALSE);
        interfaceC13706q1.hide();
        show();
        setOnCancelListener(new D3(this, 0));
    }

    public static final void r(E3 e32, androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-8161309);
        bE2.I(-492369756);
        Object objT = bE2.t();
        androidx.compose.runtime.A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new B1(new C13617g2(e32), new C13751v2(e32), new M2(e32), new C13600e3(e32));
            bE2.H(objT);
        }
        bE2.X(false);
        C13664l4.a((B1) objT, e32.f4909l, bE2, 70);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new R1(e32, i12);
    }

    @Override // Fc1.U6
    public final boolean d(boolean z12, @Y61.k MotionEvent motionEvent, @Y61.k a aVar) {
        return this.f4908k.d(z12, motionEvent, aVar);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Y61.k MotionEvent motionEvent) {
        return this.f4908k.d(this.f4909l.getValue().booleanValue(), motionEvent, new a(motionEvent));
    }

    @Override // Fc1.U6
    public final void e(@Y61.l FrameLayout frameLayout) {
        this.f4908k.e(frameLayout);
    }

    @Override // Fc1.U6
    public final void g(@Y61.l kotlin.Q<l0.g, androidx.compose.ui.unit.u> q12) {
        this.f4908k.g(q12);
    }

    @Override // Fc1.U6
    public final void i(@Y61.l Window window) {
        this.f4908k.i(window);
    }

    @Override // Fc1.U6
    public final boolean j(@Y61.k MotionEvent motionEvent, @Y61.k DialogC13657k6.d dVar) {
        return this.f4908k.j(motionEvent, dVar);
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ComposeView composeView = new ComposeView(getContext(), null, 0, 6, null);
        I0.a(this);
        composeView.setContent(new C22096n(-118705702, new b(), true));
        setContentView(composeView);
        this.f4908k.i(getWindow());
    }
}
