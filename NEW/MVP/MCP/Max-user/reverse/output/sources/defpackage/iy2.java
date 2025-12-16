package defpackage;

import android.widget.FrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.chatstatus.ChatStatusBottomWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class iy2 extends dtf implements sm6 {
    public final /* synthetic */ ChatStatusBottomWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy2(Continuation continuation, ChatStatusBottomWidget chatStatusBottomWidget) {
        super(2, continuation);
        this.X = chatStatusBottomWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        iy2 iy2Var = (iy2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iy2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iy2 iy2Var = new iy2(continuation, this.X);
        iy2Var.o = obj;
        return iy2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gy2 gy2Var = (gy2) this.o;
        ChatStatusBottomWidget chatStatusBottomWidget = this.X;
        OneMeButton oneMeButton = (OneMeButton) chatStatusBottomWidget.b.D(chatStatusBottomWidget, ChatStatusBottomWidget.c[1]);
        int iOrdinal = gy2Var.ordinal();
        iza izaVar = iza.c;
        jza jzaVar = jza.c;
        switch (iOrdinal) {
            case 3:
            case 6:
            case 7:
            case 8:
                oneMeButton.setSize(jzaVar);
                oneMeButton.setMode(izaVar);
                oneMeButton.setAppearance(gza.a);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                float f = 12;
                float f2 = 0;
                layoutParams.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(vw4.d().getDisplayMetrics().density * f2), kti.d(f * vw4.d().getDisplayMetrics().density), kti.d(f2 * vw4.d().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(layoutParams);
                oneMeButton.setVisibility(0);
                break;
            case 4:
                oneMeButton.setSize(jza.b);
                oneMeButton.setMode(iza.a);
                oneMeButton.setAppearance(gza.d);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                int iD = kti.d(6 * vw4.d().getDisplayMetrics().density);
                layoutParams2.setMargins(iD, iD, iD, iD);
                oneMeButton.setLayoutParams(layoutParams2);
                oneMeButton.setVisibility(0);
                break;
            case 5:
                oneMeButton.setVisibility(8);
                break;
            default:
                oneMeButton.setSize(jzaVar);
                oneMeButton.setMode(izaVar);
                oneMeButton.setAppearance(gza.c);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                float f3 = 12;
                float f4 = 0;
                layoutParams3.setMargins(kti.d(vw4.d().getDisplayMetrics().density * f3), kti.d(vw4.d().getDisplayMetrics().density * f4), kti.d(f3 * vw4.d().getDisplayMetrics().density), kti.d(f4 * vw4.d().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(layoutParams3);
                oneMeButton.setVisibility(0);
                break;
        }
        int i = hy2.$EnumSwitchMapping$0[gy2Var.ordinal()];
        s5g n5gVar = s5g.b;
        switch (i) {
            case -1:
            case 6:
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                n5gVar = new n5g(n1b.i);
                break;
            case 2:
                n5gVar = new n5g(n1b.x);
                break;
            case 3:
                n5gVar = new n5g(n1b.v);
                break;
            case 4:
                if (!chatStatusBottomWidget.y0().A()) {
                    n5gVar = new n5g(n1b.r);
                    break;
                } else {
                    n5gVar = new n5g(n1b.q);
                    break;
                }
            case 5:
                n5gVar = new n5g(n1b.w);
                break;
            case 7:
                n5gVar = new n5g(n1b.y);
                break;
            case 8:
                n5gVar = new n5g(n1b.t);
                break;
            case 9:
                n5gVar = new n5g(n1b.s);
                break;
        }
        oneMeButton.setText(n5gVar.b(oneMeButton.getContext()));
        f8j.d(oneMeButton, 300L, new ub(chatStatusBottomWidget, 16, gy2Var));
        return qqg.a;
    }
}
