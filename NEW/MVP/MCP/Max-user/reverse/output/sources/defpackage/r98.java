package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e;
import androidx.mediarouter.app.d;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class r98 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ r98(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        k2g k2gVarC;
        long jNanoTime;
        while (true) {
            synchronized (((b3g) this.b)) {
                k2gVarC = ((b3g) this.b).c();
            }
            if (k2gVarC == null) {
                return;
            }
            y2g y2gVar = k2gVarC.a;
            boolean zIsLoggable = b3g.i.isLoggable(Level.FINE);
            if (zIsLoggable) {
                b3g b3gVar = y2gVar.e;
                jNanoTime = System.nanoTime();
                v8d.a(k2gVarC, y2gVar, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                b3g.a((b3g) this.b, k2gVarC);
                if (zIsLoggable) {
                    b3g b3gVar2 = y2gVar.e;
                    v8d.a(k2gVarC, y2gVar, "finished run in ".concat(v8d.b(System.nanoTime() - jNanoTime)));
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r1 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        r4.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0051, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
    
        defpackage.gri.c("SequentialExecutor", "Exception while executing runnable " + r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.b     // Catch: java.lang.Throwable -> L4f
            qee r2 = (defpackage.qee) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r2 = r2.a     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            qee r0 = (defpackage.qee) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.d     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L44
        L20:
            r0 = move-exception
            goto L69
        L22:
            long r6 = r0.o     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.o = r6     // Catch: java.lang.Throwable -> L20
            r0.d = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.b     // Catch: java.lang.Throwable -> L20
            qee r4 = (defpackage.qee) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.a     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L45
            java.lang.Object r0 = r10.b     // Catch: java.lang.Throwable -> L20
            qee r0 = (defpackage.qee) r0     // Catch: java.lang.Throwable -> L20
            r0.d = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L44
            goto L18
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L4f
            r1 = r1 | r2
            r4.run()     // Catch: java.lang.Throwable -> L4f java.lang.RuntimeException -> L51
            goto L2
        L4f:
            r0 = move-exception
            goto L6b
        L51:
            r2 = move-exception
            java.lang.String r3 = "SequentialExecutor"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r5.<init>()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r6 = "Exception while executing runnable "
            r5.append(r6)     // Catch: java.lang.Throwable -> L4f
            r5.append(r4)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L4f
            defpackage.gri.c(r3, r4, r2)     // Catch: java.lang.Throwable -> L4f
            goto L2
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L4f
        L6b:
            if (r1 == 0) goto L74
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L74:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r98.b():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        vc3 vc3Var;
        int i;
        boolean zQ;
        Animatable animationDrawable;
        switch (this.a) {
            case 0:
                s98 s98Var = (s98) this.b;
                s98Var.b = null;
                s98Var.a = null;
                return;
            case 1:
                synchronized (((cb8) this.b).a) {
                    obj = ((cb8) this.b).f;
                    ((cb8) this.b).f = cb8.k;
                }
                ((cb8) this.b).k(obj);
                return;
            case 2:
                ((fc8) this.b).a();
                return;
            case 3:
                ((gc8) this.b).a();
                return;
            case 4:
                pv8 pv8Var = (pv8) this.b;
                us usVar = pv8Var.g.o;
                vv8 vv8Var = pv8Var.e;
                vv8Var.getClass();
                usVar.remove(((wv8) vv8Var).a.getBinder());
                return;
            case 5:
                d dVar = (d) this.b;
                dVar.i(true);
                dVar.N0.requestLayout();
                dVar.N0.getViewTreeObserver().addOnGlobalLayoutListener(new vo(3, dVar));
                return;
            case 6:
                d dVar2 = ((g59) this.b).b;
                if (dVar2.V0 != null) {
                    dVar2.V0 = null;
                    if (dVar2.l1) {
                        dVar2.r(dVar2.m1);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((h69) this.b).i();
                return;
            case 8:
                mra mraVar = (mra) this.b;
                try {
                    mraVar.a.b();
                    return;
                } finally {
                    mraVar.c.dispose();
                }
            case 9:
                ((uta) this.b).c.dispose();
                return;
            case 10:
                OneMeButton oneMeButton = (OneMeButton) this.b;
                yy7[] yy7VarArr = OneMeButton.A0;
                oneMeButton.i();
                return;
            case 11:
                w3b w3bVar = (w3b) this.b;
                w3bVar.setSelection(w3bVar.length());
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((meb) this.b).a = false;
                return;
            case 13:
                OneMeTitleSubtitleButton oneMeTitleSubtitleButton = (OneMeTitleSubtitleButton) this.b;
                yy7[] yy7VarArr2 = OneMeTitleSubtitleButton.y0;
                oneMeTitleSubtitleButton.c();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Drawable drawable = ((AppCompatImageView) this.b).getDrawable();
                AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
                if (animatedVectorDrawable != null) {
                    animatedVectorDrawable.start();
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                synchronized (((z6c) this.b)) {
                    z6c z6cVar = (z6c) this.b;
                    vc3Var = z6cVar.g;
                    i = z6cVar.h;
                    z6cVar.g = null;
                    z6cVar.i = false;
                }
                if (vc3.i0(vc3Var)) {
                    try {
                        z6c.m((z6c) this.b, vc3Var, i);
                        vc3Var.close();
                    } catch (Throwable th) {
                        vc3.P(vc3Var);
                        throw th;
                    }
                }
                z6c z6cVar2 = (z6c) this.b;
                synchronized (z6cVar2) {
                    z6cVar2.j = false;
                    zQ = z6cVar2.q();
                }
                if (zQ) {
                    ((Executor) z6cVar2.k.d).execute(new r98(15, z6cVar2));
                    return;
                }
                return;
            case 16:
                ((dad) this.b).f(true);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((f54) this.b).h();
                return;
            case 18:
                jtd jtdVar = (jtd) this.b;
                if (jtdVar.L0 && (animationDrawable = jtdVar.getAnimationDrawable()) != null) {
                    if (!animationDrawable.isRunning()) {
                        animationDrawable.start();
                    }
                    jtdVar.M0.postDelayed(this, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
                    return;
                }
                return;
            case 19:
                ytd ytdVar = (ytd) this.b;
                ytdVar.g = true;
                ytdVar.A();
                return;
            case 20:
                ((e) this.b).updateFocusedState();
                return;
            case 21:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.b;
                if (searchView$SearchAutoComplete.t0) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.t0 = false;
                    return;
                }
                return;
            case 22:
                try {
                    b();
                    return;
                } catch (Error e) {
                    synchronized (((qee) this.b).a) {
                        ((qee) this.b).d = 1;
                        throw e;
                    }
                }
            case 23:
                g5f g5fVar = (g5f) this.b;
                if (g5fVar.s0) {
                    g5fVar.t0 += 0.1f;
                    g5fVar.invalidateSelf();
                    g5fVar.scheduleSelf(g5fVar.Z, SystemClock.uptimeMillis() + 3);
                    return;
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((StaggeredGridLayoutManager) this.b).M0();
                return;
            case 25:
                ((o2g) this.b).a.trySetResult(null);
                return;
            case 26:
                a();
                return;
            case 27:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.b).c.t0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 28:
                ((Toolbar) this.b).w();
                return;
            default:
                acg acgVar = (acg) this.b;
                Window.Callback callback = acgVar.b;
                Menu menuS = acgVar.s();
                vf9 vf9Var = menuS instanceof vf9 ? (vf9) menuS : null;
                if (vf9Var != null) {
                    vf9Var.w();
                }
                try {
                    menuS.clear();
                    if (!callback.onCreatePanelMenu(0, menuS) || !callback.onPreparePanel(0, null, menuS)) {
                        menuS.clear();
                    }
                    if (vf9Var != null) {
                        vf9Var.v();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (vf9Var != null) {
                        vf9Var.v();
                    }
                    throw th2;
                }
        }
    }

    public /* synthetic */ r98(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
