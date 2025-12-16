package defpackage;

import android.graphics.Point;
import android.text.Editable;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalVideo;
import ru.ok.messages.media.mediabar.LocalPhotoView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class kx0 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kx0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        WeakReference weakReference;
        KeyEvent.Callback callback;
        switch (this.a) {
            case 3:
                it1 it1Var = (it1) this.b;
                ft1 ft1Var = it1Var.b1;
                if (ft1Var != null) {
                    ft1Var.k(it1Var.h1);
                }
                return it1Var.b1 != null;
            case 4:
                i5i i5iVar = ((bb3) this.b).d;
                if (i5iVar == null || (weakReference = (WeakReference) i5iVar.a) == null || (callback = (View) weakReference.get()) == null) {
                    return false;
                }
                GestureDetector.OnDoubleTapListener onDoubleTapListener = callback instanceof GestureDetector.OnDoubleTapListener ? (GestureDetector.OnDoubleTapListener) callback : null;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onDoubleTap(motionEvent);
                }
                return false;
            case 5:
                lk6 lk6Var = (lk6) this.b;
                int i = lk6Var.b;
                if (i == 0) {
                    int i2 = i + 1;
                    lk6Var.b = i2;
                    qz4 qz4Var = (qz4) lk6Var.c;
                    if (qz4Var != null) {
                        qz4Var.i(i2);
                    }
                }
                return true;
            case 7:
                wz4 wz4Var = (wz4) this.b;
                int i3 = wz4Var.c;
                if (i3 == 0) {
                    int i4 = i3 + 1;
                    wz4Var.c = i4;
                    vz4 vz4Var = wz4Var.a;
                    if (vz4Var != null) {
                        vz4Var.i(i4);
                    }
                }
                return true;
            case 8:
                rr6 rr6Var = (rr6) this.b;
                float currentScale = rr6Var.getCurrentScale() * ((float) Math.pow(rr6Var.getMaxScale() / rr6Var.getMinScale(), 1.0f / rr6Var.V0));
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (currentScale > rr6Var.getMaxScale()) {
                    currentScale = rr6Var.getMaxScale();
                }
                float currentScale2 = rr6Var.getCurrentScale();
                ep7 ep7Var = new ep7(rr6Var, currentScale2, currentScale - currentScale2, x, y);
                rr6Var.J0 = ep7Var;
                rr6Var.post(ep7Var);
                return super.onDoubleTap(motionEvent);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                p7i p7iVar = (p7i) this.b;
                p7iVar.i = motionEvent.getX();
                p7iVar.j = motionEvent.getY();
                p7iVar.k = 1;
                return true;
            case 16:
                ((w7i) this.b).B0.a(motionEvent.getX(), motionEvent.getY());
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 4:
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                bb3 bb3Var = (bb3) this.b;
                bb3Var.g = false;
                Spannable spannable = bb3Var.e;
                if (spannable == null) {
                    return false;
                }
                bb3Var.f = bb3.a(bb3Var, bb3Var.d, spannable, motionEvent);
                return bb3Var.f != null;
            case 10:
                ik9 ik9Var = (ik9) this.b;
                Editable text = ik9Var.d.getText();
                if (text == null) {
                    return false;
                }
                xj9.a.onTouchEvent(ik9Var.d, text, motionEvent);
                return false;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                b6h b6hVar = (b6h) this.b;
                b6hVar.C0 = false;
                float x = motionEvent.getX() - (b6hVar.getWidth() / 2.0f);
                float y = motionEvent.getY() - (b6hVar.getHeight() / 2.0f);
                if (b6hVar.i()) {
                    long jE = b6hVar.e(b6hVar.getWidth() / 2.0f, b6hVar.getHeight() / 2.0f);
                    if (((float) Math.hypot((r2 + x) - Float.intBitsToFloat((int) (jE >> 32)), (r5 + y) - Float.intBitsToFloat((int) (jE & 4294967295L)))) <= vw4.d().getDisplayMetrics().density * 16.0f * 2) {
                        b6hVar.getParent().requestDisallowInterceptTouchEvent(true);
                        b6hVar.B0 = true;
                        b6hVar.m(x, y);
                        b6hVar.d(true);
                    }
                }
                return true;
            case 16:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        Spannable spannable;
        i88 i88Var;
        z5h listener;
        switch (this.a) {
            case 2:
                vs1 vs1Var = (vs1) this.b;
                ts1 ts1Var = vs1Var.g1;
                if (ts1Var != null) {
                    ts1Var.k(vs1Var.j1, new Point((int) motionEvent.getX(), (int) motionEvent.getY()));
                    break;
                }
                break;
            case 3:
                it1 it1Var = (it1) this.b;
                ft1 ft1Var = it1Var.b1;
                if (ft1Var != null) {
                    ft1Var.j(it1Var.h1, new Point((int) motionEvent.getRawX(), (int) motionEvent.getRawY()));
                    break;
                }
                break;
            case 4:
                bb3 bb3Var = (bb3) this.b;
                i5i i5iVar = bb3Var.d;
                if (i5iVar != null && (spannable = bb3Var.e) != null && spannable.length() != 0) {
                    ClickableSpan clickableSpanA = bb3.a(bb3Var, i5iVar, spannable, motionEvent);
                    if (clickableSpanA instanceof URLSpan) {
                        bb3Var.c = ((URLSpan) clickableSpanA).getURL();
                        i88Var = i88.a;
                    } else if (clickableSpanA instanceof b88) {
                        bb3Var.c = ((b88) clickableSpanA).c;
                        i88Var = i88.X;
                    } else if (clickableSpanA instanceof fj9) {
                        if (((fj9) clickableSpanA).a.c == bj9.a) {
                            try {
                                bb3Var.a.c(spannable.subSequence(spannable.getSpanStart(clickableSpanA), spannable.getSpanEnd(clickableSpanA)).toString(), ((fj9) clickableSpanA).a, motionEvent);
                                break;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                    } else if (clickableSpanA instanceof nmc) {
                        bb3Var.c = ((nmc) clickableSpanA).a;
                        i88Var = i88.o;
                    }
                    i88 i88Var2 = i88Var;
                    bb3Var.f = clickableSpanA;
                    String str = bb3Var.c;
                    if (str != null && str.length() != 0) {
                        bb3Var.a.k(clickableSpanA, spannable.getSpanStart(clickableSpanA), spannable.getSpanEnd(clickableSpanA), str, i88Var2, motionEvent);
                        bb3Var.g = true;
                        break;
                    }
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                b6h b6hVar = (b6h) this.b;
                if (!b6hVar.B0 && !b6hVar.C0 && (listener = b6hVar.getListener()) != null) {
                    ((v6h) listener).performLongClick();
                    break;
                }
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 8:
                ((rr6) this.b).g(-f, -f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        h91 h91Var;
        cm6 cm6Var;
        qz4 qz4Var;
        vz4 vz4Var;
        ql6 ql6VarB0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 1:
                p91 p91Var = (p91) obj;
                m91 m91Var = p91Var.I0;
                if (m91Var != null && (h91Var = ((i91) ((y6i) m91Var).b).N0) != null) {
                    CallScreen callScreen = ((sl1) h91Var).a;
                    rha rhaVar = CallScreen.N0;
                    if (callScreen.H0().t(callScreen.F0().g)) {
                        CallScreen.z0(callScreen);
                    }
                }
                return p91Var.I0 != null;
            case 2:
                vs1 vs1Var = (vs1) obj;
                ts1 ts1Var = vs1Var.g1;
                if (ts1Var != null) {
                    ts1Var.l();
                }
                return vs1Var.g1 != null;
            case 3:
                it1 it1Var = (it1) obj;
                ft1 ft1Var = it1Var.b1;
                if (ft1Var != null) {
                    ft1Var.p(it1Var.h1);
                }
                return it1Var.b1 != null;
            case 4:
                bb3 bb3Var = (bb3) obj;
                i5i i5iVar = bb3Var.d;
                View view = i5iVar != null ? (View) ((WeakReference) i5iVar.a).get() : null;
                ClickableSpan clickableSpan = bb3Var.f;
                if (clickableSpan == null || view == null) {
                    bb3Var.g = false;
                    if (clickableSpan == null && view != null && (cm6Var = bb3Var.h) != null) {
                        cm6Var.invoke();
                        bb3Var.d = null;
                    }
                } else {
                    if (!bb3Var.g) {
                        clickableSpan.onClick(view);
                    }
                    bb3Var.d = null;
                    bb3Var.f = null;
                    bb3Var.e = null;
                    bb3Var.c = null;
                    bb3Var.g = false;
                }
                return true;
            case 5:
                lk6 lk6Var = (lk6) obj;
                if (lk6Var.b == 0 && (qz4Var = (qz4) lk6Var.c) != null) {
                    qz4Var.c();
                }
                return true;
            case 6:
                ((s6b) ((tz4) obj).e).d();
                return super.onSingleTapConfirmed(motionEvent);
            case 7:
                wz4 wz4Var = (wz4) obj;
                if (wz4Var.c == 0 && (vz4Var = wz4Var.a) != null) {
                    vz4Var.c();
                }
                return true;
            case 8:
            case 10:
            default:
                return super.onSingleTapConfirmed(motionEvent);
            case 9:
                int i2 = LocalPhotoView.F0;
                wqi.c("ru.ok.messages.media.mediabar.LocalPhotoView", "onSingleTapConfirmed", new Object[0]);
                oe8 oe8Var = ((LocalPhotoView) obj).E0;
                if (oe8Var != null) {
                    oe8Var.c();
                }
                return true;
            case 11:
                yaa yaaVar = ((w9a) obj).t0;
                if (yaaVar != null) {
                    Iterator it = ((Set) yaaVar.a).iterator();
                    while (it.hasNext()) {
                        FrgLocalVideo frgLocalVideo = ((iaa) it.next()).Y;
                        if (frgLocalVideo != null && (ql6VarB0 = frgLocalVideo.B0()) != null) {
                            ((ActLocalMedias) ql6VarB0).Z();
                        }
                    }
                }
                return super.onSingleTapConfirmed(motionEvent);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                gvb gvbVar = ((hvb) obj).F0;
                if (gvbVar != null) {
                    gvbVar.m();
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, k18] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        am7 am7Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                lx0 lx0Var = (lx0) obj;
                hx0 hx0Var = lx0Var.C0;
                yw0 yw0Var = lx0Var.D0;
                dx0 dx0Var = lx0Var.E0;
                if (hx0Var != null && yw0Var != null && dx0Var != null && !yw0Var.Z) {
                    bm7 bm7Var = (bm7) hx0Var;
                    ng4 ng4Var = bm7Var.t0;
                    ng4Var.getClass();
                    if (ng4Var.c) {
                        ng4Var.c = false;
                        yl7 yl7Var = bm7Var.d;
                        if (yl7Var != null && (am7Var = bm7Var.s0) != null) {
                            long j = bm7Var.c;
                            MessagesListWidget messagesListWidget = (MessagesListWidget) ((xu9) am7Var).b;
                            yy7[] yy7VarArr = MessagesListWidget.b1;
                            vu9 vu9VarK0 = messagesListWidget.K0();
                            vu9VarK0.u1.O(vu9VarK0, vu9.U1[4], svi.d(vu9VarK0.a, ((q2b) vu9VarK0.X).b(), i84.b, new xs9(yw0Var, vu9VarK0, j, yl7Var, dx0Var, null)));
                        }
                        bm7Var.postDelayed(new ue(10, (e44) ng4Var.d), ng4Var.b);
                    }
                }
                lx0Var.D0 = null;
                lx0Var.E0 = null;
                lx0Var.invalidate();
                return true;
            case 4:
                bb3 bb3Var = (bb3) obj;
                if (bb3Var.i) {
                    Runnable runnable = bb3Var.j;
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    onSingleTapConfirmed(motionEvent);
                }
                return false;
            case 5:
                lk6 lk6Var = (lk6) obj;
                int i2 = lk6Var.b;
                if (i2 > 0) {
                    int i3 = i2 + 1;
                    lk6Var.b = i3;
                    qz4 qz4Var = (qz4) lk6Var.c;
                    if (qz4Var != null) {
                        qz4Var.i(i3);
                    }
                }
                return true;
            case 7:
                wz4 wz4Var = (wz4) obj;
                int i4 = wz4Var.c;
                if (i4 > 0) {
                    int i5 = i4 + 1;
                    wz4Var.c = i5;
                    vz4 vz4Var = wz4Var.a;
                    if (vz4Var != null) {
                        vz4Var.i(i5);
                    }
                }
                return true;
            case 10:
                ik9 ik9Var = (ik9) obj;
                Editable text = ik9Var.d.getText();
                if (text != null) {
                    xj9.a.onTouchEvent(ik9Var.d, text, motionEvent);
                }
                return false;
            case 13:
                roe roeVar = (roe) obj;
                ?? r13 = roeVar.Q0;
                if (!r13.e() || ((jeb) r13.getValue()).isEnabled()) {
                    return false;
                }
                ooe ooeVar = roeVar.T0;
                if (ooeVar != null) {
                    ooeVar.l(roeVar.getModelItem().getItemId());
                }
                return true;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                b6h b6hVar = (b6h) obj;
                if (!b6hVar.i()) {
                    z5h listener = b6hVar.getListener();
                    if (listener != null) {
                        ((v6h) listener).y();
                    }
                    b6hVar.setInPause(true);
                } else if (b6hVar.i()) {
                    z5h listener2 = b6hVar.getListener();
                    if (listener2 != null) {
                        ((v6h) listener2).z();
                    }
                    b6hVar.setInPause(false);
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
