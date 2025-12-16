package Fc1;

import android.os.Bundle;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import com.avito.android.R;
import i31.InterfaceC41220a;
import xyz.n.a.ub;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class A4 extends androidx.appcompat.app.A {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13779y3 f4805g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final ub f4806h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final A1 f4807i;

    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                C22143q0 c22143q0 = C13707q2.f5762a;
                A4 a42 = A4.this;
                androidx.compose.runtime.S.a(c22143q0.b(a42.f4805g), androidx.compose.runtime.internal.r.b(a13, -1001854632, new C13655k4(a42)), a13, 48);
            }
            return kotlin.G0.f406611a;
        }
    }

    @i31.c
    public A4(@Y61.k L3 l32, @Y61.k InterfaceC13779y3 interfaceC13779y3, @InterfaceC41220a @Y61.k ub ubVar, @Y61.l @InterfaceC41220a A1 a12) {
        super(l32.b(), R.style.FeedbackMessageDialogStyle);
        this.f4805g = interfaceC13779y3;
        this.f4806h = ubVar;
        this.f4807i = a12;
        show();
    }

    public static final void r(A4 a42, androidx.compose.runtime.A a12, int i12) {
        int i13;
        androidx.compose.runtime.B bE2 = a12.E(921772143);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(a42) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i13 & 11) == 2 && bE2.c()) {
            bE2.f();
        } else {
            bE2.I(-492369756);
            Object objT = bE2.t();
            androidx.compose.runtime.A.f37866a.getClass();
            A.a.C1651a c1651a = A.a.f37868b;
            if (objT == c1651a) {
                objT = new V3(a42);
                bE2.H(objT);
            }
            bE2.X(false);
            Y41.a aVar = (Y41.a) objT;
            bE2.I(-492369756);
            Object objT2 = bE2.t();
            if (objT2 == c1651a) {
                objT2 = new C3(a42);
                bE2.H(objT2);
            }
            bE2.X(false);
            C13647j5.a(a42.f4806h, (Y41.a) objT2, aVar, bE2, 432);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new C13591d3(a42, i12);
    }

    @Override // androidx.appcompat.app.A, androidx.view.r, android.app.Dialog
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ComposeView composeView = new ComposeView(getContext(), null, 0, 6, null);
        composeView.setContent(new C22096n(1814091288, new a(), true));
        I0.a(this);
        setContentView(composeView);
    }
}
