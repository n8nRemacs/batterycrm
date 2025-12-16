package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class tth extends dtf implements sm6 {
    public final /* synthetic */ WebAppRootScreen X;
    public final /* synthetic */ t3e Y;
    public final /* synthetic */ FrameLayout Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ LinearLayout s0;
    public final /* synthetic */ m9b t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tth(Continuation continuation, WebAppRootScreen webAppRootScreen, t3e t3eVar, FrameLayout frameLayout, LinearLayout linearLayout, m9b m9bVar) {
        super(2, continuation);
        this.X = webAppRootScreen;
        this.Y = t3eVar;
        this.Z = frameLayout;
        this.s0 = linearLayout;
        this.t0 = m9bVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tth tthVar = (tth) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tthVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tth tthVar = new tth(continuation, this.X, this.Y, this.Z, this.s0, this.t0);
        tthVar.o = obj;
        return tthVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        u0i u0iVar = (u0i) this.o;
        String str = this.X.C0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "collect view state: " + u0iVar, null);
            }
        }
        WebAppRootScreen webAppRootScreen = this.X;
        t3e t3eVar = this.Y;
        FrameLayout frameLayout = this.Z;
        LinearLayout linearLayout = this.s0;
        m9b m9bVar = this.t0;
        webAppRootScreen.M0().setTitle(u0iVar.a);
        WebAppRootScreen.R0(webAppRootScreen.M0(), u0iVar.b);
        vvh vvhVar = u0iVar.c;
        if (vvhVar.equals(wvh.a)) {
            t3eVar.setVisibility(8);
            if (frameLayout.getChildCount() <= 1 || frameLayout.getChildAt(1) != linearLayout) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(linearLayout, 1);
            }
            webAppRootScreen.T0(false);
        } else if (vvhVar.equals(xvh.a)) {
            t3eVar.setVisibility(8);
            if (frameLayout.getChildCount() <= 1 || frameLayout.getChildAt(1) != m9bVar) {
                if (frameLayout.getChildCount() > 1) {
                    frameLayout.removeViewAt(1);
                }
                frameLayout.addView(m9bVar, 1);
            }
            webAppRootScreen.T0(false);
        } else {
            if (!(vvhVar instanceof yvh)) {
                throw new NoWhenBranchMatchedException();
            }
            t3eVar.setVisibility(0);
            if (frameLayout.getChildCount() > 1) {
                frameLayout.removeViewAt(1);
            }
            webAppRootScreen.T0(((yvh) vvhVar).a);
        }
        return qqg.a;
    }
}
