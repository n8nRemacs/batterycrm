package defpackage;

import android.view.ViewGroup;
import java.util.WeakHashMap;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sharedata.ShareDataPickerScreen;

/* loaded from: classes2.dex */
public final class eue extends dtf implements sm6 {
    public final /* synthetic */ ShareDataPickerScreen X;
    public final /* synthetic */ ViewGroup Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eue(ShareDataPickerScreen shareDataPickerScreen, ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.X = shareDataPickerScreen;
        this.Y = viewGroup;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        eue eueVar = (eue) l((in9) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        eueVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        eue eueVar = new eue(this.X, this.Y, continuation);
        eueVar.o = obj;
        return eueVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        in9 in9Var = (in9) this.o;
        ShareDataPickerScreen shareDataPickerScreen = this.X;
        ytd ytdVar = shareDataPickerScreen.D0;
        if (ytdVar != null) {
            int iV = az1.v(in9Var.a);
            ViewGroup viewGroup = this.Y;
            if (iV == 0) {
                y09 y09Var = shareDataPickerScreen.F0;
                if (y09Var != null) {
                    yy7[] yy7VarArr = y09.m;
                    y09Var.e(true);
                }
                shareDataPickerScreen.K0().setLeftIcon(yud.U0);
                zfi.b(viewGroup, ShareDataPickerScreen.J0, null);
            } else if (iV == 1) {
                if (!ytdVar.n()) {
                    ytdVar.S(l8j.a(new MediaKeyboardWidget(shareDataPickerScreen.b, 0L, true, 2, null), null, null));
                }
                WeakHashMap weakHashMap = hfh.a;
                veh.u(viewGroup, null);
                y09 y09Var2 = shareDataPickerScreen.F0;
                if (y09Var2 != null) {
                    y09Var2.f();
                }
                shareDataPickerScreen.K0().setLeftIcon(yud.Y0);
            } else if (iV == 2) {
                sn0 sn0Var = ((ShareDataPickerScreen) shareDataPickerScreen.E0.b).y0;
                if (sn0Var.e()) {
                    ((ik9) sn0Var.getValue()).e(true);
                }
                shareDataPickerScreen.K0().setLeftIcon(yud.U0);
                gw0.w(new g56(new d53(new xnb(xz7.f, 10), 9), new gue(viewGroup, null), 1), shareDataPickerScreen.getViewLifecycleScope());
            }
        }
        return qqg.a;
    }
}
