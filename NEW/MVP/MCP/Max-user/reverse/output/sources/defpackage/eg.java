package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;

/* loaded from: classes.dex */
public final class eg implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public eg(View view, boolean z) {
        this.b = z;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setVisibility(this.b ? 0 : 8);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        bud budVarA;
        c54 c54VarY0;
        View view;
        switch (this.a) {
            case 0:
                View view2 = (View) this.c;
                view2.setAlpha(1.0f);
                view2.setVisibility(this.b ? 0 : 8);
                return;
            default:
                dvf dvfVar = (dvf) this.c;
                if (dvfVar.b()) {
                    dvfVar.a();
                } else {
                    jqi.h(dvfVar.c, dvfVar.a(), null, null, 1.0f);
                }
                dvf dvfVar2 = (dvf) this.c;
                dvfVar2.m = null;
                ViewGroup viewGroup = dvfVar2.c;
                viewGroup.removeView(viewGroup.findViewById(mzc.swipe_fade));
                if (this.b) {
                    dvf dvfVar3 = (dvf) this.c;
                    dvfVar3.f = false;
                    dvfVar3.g = -1.0f;
                    dvfVar3.h = -1.0f;
                }
                SwipeWidget swipeWidget = ((dvf) this.c).q;
                if (swipeWidget != null) {
                    swipeWidget.b = false;
                    lg8 lg8Var = lg8.d;
                    if (swipeWidget.getRouter().a.a.size() >= 2 && (budVarA = swipeWidget.getRouter().a.a()) != null && (view = (c54VarY0 = swipeWidget.y0()).getView()) != null) {
                        swipeWidget.E0(c54VarY0);
                        h54 h54VarB = budVarA.b();
                        if (h54VarB == null || h54VarB.d()) {
                            if (view.getParent() != null) {
                                String str = swipeWidget.a;
                                l6b l6bVar = wqi.a;
                                if (l6bVar != null && l6bVar.b(lg8Var)) {
                                    l6bVar.c(lg8Var, str, "clearUnderlyingViewsOnCancel: detaching underlying view", null);
                                }
                                ((ViewGroup) view.getParent()).removeView(view);
                            }
                            if (c54VarY0.getRetainViewMode() != b54.b) {
                                String str2 = swipeWidget.a;
                                l6b l6bVar2 = wqi.a;
                                if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                                    l6bVar2.c(lg8Var, str2, "clearUnderlyingViewsOnCancel: destroying underlying view", null);
                                }
                                Context context = swipeWidget.getContext();
                                Method method = (Method) l54.b.D(null, l54.a[0]);
                                if (method == null) {
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                method.invoke(c54VarY0, context);
                            }
                        } else {
                            String str3 = swipeWidget.a;
                            l6b l6bVar3 = wqi.a;
                            if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                                l6bVar3.c(lg8Var, str3, "clearUnderlyingViewsOnCancel: current controller was pushed with 'removesFromViewOnPush'=false, skip clearing", null);
                            }
                        }
                    }
                    swipeWidget.A0();
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                if (this.b) {
                    ((View) this.c).setVisibility(0);
                    break;
                }
                break;
        }
    }

    public eg(dvf dvfVar, boolean z, float f) {
        this.c = dvfVar;
        this.b = z;
    }
}
