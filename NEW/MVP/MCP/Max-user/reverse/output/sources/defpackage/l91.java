package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l91 implements aid {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l91(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(boolean z) {
    }

    private final void d(MotionEvent motionEvent) {
    }

    @Override // defpackage.aid
    public final void a(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                bt7 bt7Var = (bt7) this.b;
                ue ueVar = bt7Var.C0;
                ((GestureDetector) bt7Var.H0.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = bt7Var.D0;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (bt7Var.v0 != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int iFindPointerIndex = motionEvent.findPointerIndex(bt7Var.v0);
                    if (iFindPointerIndex >= 0) {
                        bt7Var.l(actionMasked, iFindPointerIndex, motionEvent);
                    }
                    mid midVar = bt7Var.c;
                    if (midVar != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (iFindPointerIndex >= 0) {
                                    bt7Var.v(bt7Var.y0, iFindPointerIndex, motionEvent);
                                    bt7Var.r(midVar);
                                    bt7Var.B0.removeCallbacks(ueVar);
                                    ueVar.run();
                                    bt7Var.B0.invalidate();
                                    break;
                                }
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = bt7Var.D0;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == bt7Var.v0) {
                                    bt7Var.v0 = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    bt7Var.v(bt7Var.y0, actionIndex, motionEvent);
                                    break;
                                }
                            }
                        }
                        bt7Var.t(null, 0);
                        bt7Var.v0 = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.aid
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        switch (this.a) {
            case 0:
                if (recyclerView.H(motionEvent.getX(), motionEvent.getY()) == null) {
                    ((p91) this.b).M0.onTouchEvent(motionEvent);
                    break;
                }
                break;
            default:
                bt7 bt7Var = (bt7) this.b;
                ((GestureDetector) bt7Var.H0.b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                xs7 xs7Var = null;
                if (actionMasked == 0) {
                    bt7Var.v0 = motionEvent.getPointerId(0);
                    bt7Var.d = motionEvent.getX();
                    bt7Var.o = motionEvent.getY();
                    VelocityTracker velocityTracker = bt7Var.D0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    bt7Var.D0 = VelocityTracker.obtain();
                    if (bt7Var.c == null) {
                        ArrayList arrayList = bt7Var.z0;
                        if (!arrayList.isEmpty()) {
                            View viewO = bt7Var.o(motionEvent);
                            int size = arrayList.size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    xs7 xs7Var2 = (xs7) arrayList.get(size);
                                    if (xs7Var2.e.a == viewO) {
                                        xs7Var = xs7Var2;
                                    } else {
                                        size--;
                                    }
                                }
                            }
                        }
                        if (xs7Var != null) {
                            mid midVar = xs7Var.e;
                            bt7Var.d -= xs7Var.i;
                            bt7Var.o -= xs7Var.j;
                            bt7Var.n(midVar, true);
                            if (bt7Var.a.remove(midVar.a)) {
                                bt7Var.w0.a(bt7Var.B0, midVar);
                            }
                            bt7Var.t(midVar, xs7Var.f);
                            bt7Var.v(bt7Var.y0, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    bt7Var.v0 = -1;
                    bt7Var.t(null, 0);
                } else {
                    int i = bt7Var.v0;
                    if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                        bt7Var.l(actionMasked, iFindPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = bt7Var.D0;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (bt7Var.c == null) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // defpackage.aid
    public final void e(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (z) {
                    ((bt7) this.b).t(null, 0);
                    break;
                }
                break;
        }
    }
}
