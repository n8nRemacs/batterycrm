package Fc1;

import android.R;
import android.graphics.drawable.BitmapDrawable;
import android.view.Window;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.ui.graphics.C22263l;
import androidx.compose.ui.graphics.InterfaceC22280q0;

@kotlin.jvm.internal.s0
/* loaded from: classes9.dex */
public final class H1 {

    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            H1.a(a12, C22066f2.a(1));
            return kotlin.G0.f406611a;
        }
    }

    @InterfaceC22132o
    public static final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-1997499156);
        if (i12 == 0 && bE2.c()) {
            bE2.f();
        } else {
            InterfaceC13784z interfaceC13784z = (InterfaceC13784z) bE2.o(C13695p.f5738a);
            androidx.appcompat.app.A a13 = (androidx.appcompat.app.A) bE2.o(C13759w1.f5867a);
            InterfaceC22280q0 interfaceC22280q0 = (InterfaceC22280q0) ((C22082i3) interfaceC13784z.a()).getF42167b();
            int height = interfaceC22280q0.getHeight();
            int i13 = kotlin.jvm.internal.J.f406821a;
            if (height == 1 && interfaceC22280q0.getWidth() == 1) {
                Window window = a13.getWindow();
                if (window != null) {
                    window.setBackgroundDrawableResource(R.color.transparent);
                }
            } else {
                Window window2 = a13.getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawable(new BitmapDrawable(a13.getContext().getResources(), C22263l.a(interfaceC22280q0)));
                }
            }
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z == null) {
            return;
        }
        c22039c2Z.f38184d = new a(2);
    }
}
