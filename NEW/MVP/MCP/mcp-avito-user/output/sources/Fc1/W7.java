package Fc1;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.R;
import i31.InterfaceC41220a;

/* loaded from: classes9.dex */
public final class W7 extends androidx.appcompat.app.A {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f5285l = 0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13779y3 f5286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.g f5287h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C13602e5 f5288i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final X7 f5289j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final GestureDetector f5290k;

    public static final class a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final X7 f5291b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5292c = 120;

        /* renamed from: d, reason: collision with root package name */
        public final int f5293d = 250;

        /* renamed from: e, reason: collision with root package name */
        public final int f5294e = 200;

        public a(@Y61.k X7 x72) {
            this.f5291b = x72;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(@Y61.l MotionEvent motionEvent, @Y61.k MotionEvent motionEvent2, float f12, float f13) {
            if ((motionEvent != null && Math.abs(motionEvent.getX() - motionEvent2.getX()) > this.f5293d) || motionEvent == null || motionEvent2.getY() - motionEvent.getY() <= this.f5292c || Math.abs(f13) <= this.f5294e) {
                return false;
            }
            this.f5291b.invoke();
            return true;
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
                W7 w72 = W7.this;
                androidx.compose.runtime.S.a(c22143q0.b(w72.f5286g), androidx.compose.runtime.internal.r.b(a13, 2080684363, new C13730t(w72)), a13, 48);
            }
            return kotlin.G0.f406611a;
        }
    }

    @i31.c
    public W7(@Y61.k L3 l32, @Y61.k InterfaceC13779y3 interfaceC13779y3, @InterfaceC41220a @Y61.k androidx.compose.runtime.external.kotlinx.collections.immutable.g gVar, @InterfaceC41220a @Y61.k C13602e5 c13602e5) {
        super(l32.b(), R.style.FeedbackTranslucentNoTitleBarDialogStyle);
        this.f5286g = interfaceC13779y3;
        this.f5287h = gVar;
        this.f5288i = c13602e5;
        show();
        X7 x72 = new X7(this);
        this.f5289j = x72;
        this.f5290k = new GestureDetector(l32.b(), new a(x72));
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Y61.k MotionEvent motionEvent) {
        if (this.f5290k.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ComposeView composeView = new ComposeView(getContext(), null, 0, 6, null);
        I0.a(this);
        composeView.setContent(new C22096n(242275851, new b(), true));
        setContentView(composeView);
    }
}
