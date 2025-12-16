package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import androidx.mediarouter.app.d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class vo implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ep epVar = (ep) this.b;
                if (!epVar.getInternalPopup().a()) {
                    epVar.s0.n(epVar.getTextDirection(), epVar.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = epVar.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                    break;
                }
                break;
            case 1:
                bp bpVar = (bp) this.b;
                ep epVar2 = bpVar.Q0;
                bpVar.getClass();
                if (!epVar2.isAttachedToWindow() || !epVar2.getGlobalVisibleRect(bpVar.O0)) {
                    bpVar.dismiss();
                    break;
                } else {
                    bpVar.s();
                    bpVar.g();
                    break;
                }
                break;
            case 2:
                z52 z52Var = (z52) this.b;
                ArrayList arrayList = z52Var.Z;
                if (z52Var.a() && arrayList.size() > 0 && !((y52) arrayList.get(0)).a.I0) {
                    View view = z52Var.y0;
                    if (view == null || !view.isShown()) {
                        z52Var.dismiss();
                        break;
                    } else {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((y52) it.next()).a.g();
                        }
                        break;
                    }
                }
                break;
            case 3:
                d dVar = (d) this.b;
                dVar.N0.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                HashSet hashSet = dVar.Q0;
                if (hashSet != null && hashSet.size() != 0) {
                    y49 y49Var = new y49(0, dVar);
                    int firstVisiblePosition = dVar.N0.getFirstVisiblePosition();
                    boolean z = false;
                    for (int i = 0; i < dVar.N0.getChildCount(); i++) {
                        View childAt = dVar.N0.getChildAt(i);
                        if (dVar.Q0.contains((k69) dVar.O0.getItem(firstVisiblePosition + i))) {
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(dVar.r1);
                            alphaAnimation.setFillEnabled(true);
                            alphaAnimation.setFillAfter(true);
                            if (!z) {
                                alphaAnimation.setAnimationListener(y49Var);
                                z = true;
                            }
                            childAt.clearAnimation();
                            childAt.startAnimation(alphaAnimation);
                        }
                    }
                    break;
                } else {
                    dVar.j(true);
                    break;
                }
                break;
            default:
                aaf aafVar = (aaf) this.b;
                kg9 kg9Var = aafVar.Z;
                if (aafVar.a() && !kg9Var.I0) {
                    View view2 = aafVar.w0;
                    if (view2 == null || !view2.isShown()) {
                        aafVar.dismiss();
                        break;
                    } else {
                        kg9Var.g();
                        break;
                    }
                }
                break;
        }
    }
}
