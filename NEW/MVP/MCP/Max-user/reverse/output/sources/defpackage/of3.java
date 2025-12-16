package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.io.IOException;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;

/* loaded from: classes2.dex */
public final class of3 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ of3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public boolean a(MotionEvent motionEvent) {
        ViewGroup viewGroup = ((bi9) this.c).I0;
        if (!(viewGroup instanceof zk9) || viewGroup.getTouchDelegate() == null) {
            return false;
        }
        return viewGroup.getTouchDelegate().onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                if (a(motionEvent)) {
                    return true;
                }
                ViewParent viewParent = ((bi9) this.c).I0;
                ii9 ii9Var = viewParent instanceof ii9 ? (ii9) viewParent : null;
                if (ii9Var == null) {
                    return true;
                }
                ii9Var.e(motionEvent, bi9.S0);
                return true;
            case 2:
                return true;
            case 3:
            default:
                return super.onDown(motionEvent);
            case 4:
                wue wueVar = (wue) this.b;
                TouchDelegate touchDelegate = wueVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false) && wueVar.v0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    wueVar.getRippleDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    wueVar.getBorderDrawable().setHotspot(motionEvent.getX(), motionEvent.getY());
                    wueVar.setPressed(true);
                    wueVar.invalidate();
                }
                return true;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) throws IOException {
        switch (this.a) {
            case 1:
                if (!a(motionEvent)) {
                    ((uh9) ((bi9) this.c).a).performLongClick();
                    break;
                }
                break;
            case 2:
                super.onLongPress(motionEvent);
                ((o91) this.c).invoke();
                break;
            case 3:
            default:
                super.onLongPress(motionEvent);
                break;
            case 4:
                wue wueVar = (wue) this.b;
                TouchDelegate touchDelegate = wueVar.getTouchDelegate();
                if (!(touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false)) {
                    wueVar.setPressed(false);
                    wueVar.invalidate();
                    wueVar.performLongClick();
                    break;
                }
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        switch (this.a) {
            case 3:
                ebc ebcVar = (ebc) this.b;
                if (ebcVar != null) {
                    ProfileAvatarWidget profileAvatarWidget = (ProfileAvatarWidget) this.c;
                    hs hsVar = profileAvatarWidget.b;
                    yy7 yy7Var = ProfileAvatarWidget.o[0];
                    ((Number) hsVar.a(profileAvatarWidget)).longValue();
                    ProfileAvatarsScreen profileAvatarsScreen = (ProfileAvatarsScreen) ebcVar;
                    profileAvatarsScreen.L0(!(profileAvatarsScreen.M0().getVisibility() == 0));
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) throws IOException {
        jd3 jd3VarO;
        switch (this.a) {
            case 0:
                nf3 nf3Var = (nf3) this.b;
                if (nf3Var == null) {
                    return true;
                }
                ((cvb) nf3Var).c(((mf3) this.c).getColor());
                return true;
            case 1:
                bi9 bi9Var = (bi9) this.c;
                if (!a(motionEvent)) {
                    ViewParent viewParent = bi9Var.I0;
                    String strI = null;
                    ii9 ii9Var = viewParent instanceof ii9 ? (ii9) viewParent : null;
                    if (ii9Var != null && (jd3VarO = ii9Var.o(motionEvent)) != null) {
                        strI = jd3VarO.i();
                    }
                    if (ii9Var != null) {
                        ii9Var.e(motionEvent, bi9.T0);
                    }
                    if (ii9Var == null || !ii9Var.t(motionEvent)) {
                        if (ii9Var == null || (!ii9Var.i(motionEvent) && strI == null)) {
                            ((uh9) bi9Var.a).performClick();
                        } else {
                            ((zh9) this.b).invoke(strI);
                        }
                    }
                }
                return true;
            case 2:
                ((o91) this.b).invoke();
                return true;
            case 3:
            default:
                return super.onSingleTapUp(motionEvent);
            case 4:
                wue wueVar = (wue) this.b;
                TouchDelegate touchDelegate = wueVar.getTouchDelegate();
                if (touchDelegate != null ? touchDelegate.onTouchEvent(motionEvent) : false) {
                    return true;
                }
                wueVar.setPressed(false);
                wueVar.invalidate();
                if (wueVar.v0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    ((sue) this.c).invoke();
                    return true;
                }
                ((View) wueVar.getParent()).performClick();
                return true;
        }
    }

    public of3(bi9 bi9Var, zh9 zh9Var) {
        this.a = 1;
        this.c = bi9Var;
        this.b = zh9Var;
    }
}
