package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public abstract class icb {
    public static hcb b;
    public static hcb c;
    public static final Handler a = new Handler(Looper.getMainLooper(), new gcb());
    public static final AtomicBoolean d = new AtomicBoolean(false);

    public static void a(hcb hcbVar, ecb ecbVar) {
        WeakReference weakReference;
        fcb fcbVar;
        if (hcbVar == null || (weakReference = hcbVar.b) == null || (fcbVar = (fcb) weakReference.get()) == null) {
            return;
        }
        a.removeCallbacksAndMessages(fcbVar);
        fcbVar.a.d(ecbVar);
    }

    public static void b(fcb fcbVar, ecb ecbVar) {
        AtomicBoolean atomicBoolean = d;
        if (atomicBoolean.compareAndSet(false, true)) {
            atomicBoolean.set(false);
            hcb hcbVar = b;
            if (hcbVar != null ? fni.a(hcbVar.b.get(), fcbVar) : false) {
                a(b, ecbVar);
                return;
            }
            hcb hcbVar2 = c;
            if (hcbVar2 != null ? fni.a(hcbVar2.b.get(), fcbVar) : false) {
                a(c, ecbVar);
            }
        }
    }

    public static void c(hcb hcbVar) {
        ocb ocbVar;
        if (fni.a(hcbVar != null ? hcbVar.a : null, lcb.b)) {
            return;
        }
        Handler handler = a;
        handler.removeCallbacksAndMessages(hcbVar);
        if (hcbVar == null || (ocbVar = hcbVar.a) == null) {
            ocbVar = mcb.b;
        }
        handler.sendMessageDelayed(Message.obtain(handler, 0, hcbVar), ocbVar.a);
    }

    public static void d() {
        fcb fcbVar;
        gdb gdbVar;
        hcb hcbVar = c;
        if (hcbVar != null) {
            b = hcbVar;
            gvf gvfVar = null;
            c = null;
            WeakReference weakReference = hcbVar.b;
            if (weakReference == null || (fcbVar = (fcb) weakReference.get()) == null) {
                b = null;
                return;
            }
            i40 i40Var = fcbVar.a;
            WeakReference weakReference2 = (WeakReference) i40Var.c;
            gvf gvfVar2 = (gvf) i40Var.e;
            if (gvfVar2 != null) {
                gvfVar2.d();
            } else {
                if (gvfVar2 == null) {
                    ViewGroup viewGroup = (ViewGroup) weakReference2.get();
                    Context context = viewGroup != null ? viewGroup.getContext() : null;
                    if (context != null) {
                        cdb cdbVar = (cdb) i40Var.d;
                        ViewGroup viewGroup2 = (ViewGroup) weakReference2.get();
                        Context context2 = viewGroup2 != null ? viewGroup2.getContext() : null;
                        if (context2 == null) {
                            gdbVar = null;
                        } else {
                            gdbVar = new gdb(context2);
                            CharSequence charSequence = cdbVar.b;
                            adb adbVar = cdbVar.d;
                            gdbVar.setTitle(charSequence);
                            gdbVar.setCaption(cdbVar.c);
                            gdbVar.setLeftElement(cdbVar.a);
                            gdbVar.setRightElement(adbVar);
                            gdbVar.setStyled(cdbVar.Y);
                            if (adbVar instanceof ycb) {
                                gdbVar.setRightBtnAction$snackbar_release(null);
                            } else {
                                gdbVar.setRightBtnAction$snackbar_release(new ye6(23, i40Var));
                            }
                        }
                        if (gdbVar != null) {
                            gvfVar = new gvf(context);
                            uid uidVar = new uid();
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                            kcb kcbVar = ((cdb) i40Var.d).o;
                            int i = kcbVar.a;
                            layoutParams.gravity = (i & 1) != 0 ? 48 : 80;
                            if ((i & 1) != 0) {
                                layoutParams.topMargin = kcbVar.b;
                            } else {
                                layoutParams.bottomMargin = kcbVar.c;
                            }
                            gvfVar.setLayoutParams(layoutParams);
                            if (gvfVar.isAttachedToWindow()) {
                                gvfVar.requestApplyInsets();
                            } else {
                                gvfVar.addOnAttachStateChangeListener(new r40(gvfVar, 9, gvfVar));
                            }
                            int i2 = xz7.a;
                            i40Var.b = xz7.b(xz7.c);
                            nl nlVar = new nl(i40Var, context, gvfVar, 19);
                            WeakHashMap weakHashMap = hfh.a;
                            veh.u(gvfVar, nlVar);
                            gvfVar.addView(gdbVar);
                            gvfVar.setClipToPadding(false);
                            gvfVar.setClipChildren(false);
                            gvfVar.setClipToOutline(false);
                            gvfVar.setElevation(10.0f);
                            gvfVar.setCallback(new fde(i40Var, uidVar, gdbVar, gvfVar));
                            uidVar.a = mgb.a(gvfVar, new fu1(gvfVar, gvfVar, 1));
                            i40Var.e = gvfVar;
                        }
                    }
                    gvfVar2 = gvfVar;
                }
                if (gvfVar2 != null) {
                    ViewGroup viewGroup3 = (ViewGroup) weakReference2.get();
                    if (viewGroup3 != null) {
                        viewGroup3.addView(gvfVar2);
                    }
                    ViewGroup viewGroup4 = (ViewGroup) weakReference2.get();
                    if (viewGroup4 != null) {
                        viewGroup4.addOnAttachStateChangeListener((rk) i40Var.g);
                    }
                }
            }
            fcb fcbVar2 = (fcb) i40Var.h;
            if (d.compareAndSet(true, false)) {
                hcb hcbVar2 = b;
                if (hcbVar2 != null ? fni.a(hcbVar2.b.get(), fcbVar2) : false) {
                    c(b);
                }
            }
        }
    }
}
