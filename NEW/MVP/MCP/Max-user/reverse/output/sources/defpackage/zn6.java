package defpackage;

import android.app.Application;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class zn6 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public zn6(RecyclerView recyclerView, RecyclerView recyclerView2, StickerSetBottomSheet stickerSetBottomSheet) {
        this.a = 28;
        this.b = recyclerView2;
        this.c = stickerSetBottomSheet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        defpackage.pee.X.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            pee r2 = (defpackage.pee) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            pee r0 = (defpackage.pee) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L46
        L20:
            r0 = move-exception
            goto L7d
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            pee r4 = (defpackage.pee) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            pee r0 = (defpackage.pee) r0     // Catch: java.lang.Throwable -> L20
            r0.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r0 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.pee.X     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L88:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zn6.a():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r1v0, types: [ha8] */
    /* JADX WARN: Type inference failed for: r1v66, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r1v90 */
    @Override // java.lang.Runnable
    public final void run() {
        tf9 tf9Var;
        zqb zqbVar;
        Drawable downloadDrawable;
        String str;
        try {
            switch (this.a) {
                case 0:
                    rn6 rn6Var = (rn6) this.c;
                    try {
                        rn6Var.a(wsf.d((Future) this.b));
                        return;
                    } catch (Error e) {
                        e = e;
                        rn6Var.onFailure(e);
                        return;
                    } catch (RuntimeException e2) {
                        e = e2;
                        rn6Var.onFailure(e);
                        return;
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        if (cause == null) {
                            rn6Var.onFailure(e3);
                            return;
                        } else {
                            rn6Var.onFailure(cause);
                            return;
                        }
                    }
                case 1:
                    e7 e7Var = (e7) this.b;
                    h7 h7Var = (h7) this.c;
                    vf9 vf9Var = h7Var.c;
                    if (vf9Var != null && (tf9Var = vf9Var.o) != null) {
                        tf9Var.f(vf9Var);
                    }
                    View view = (View) h7Var.Z;
                    if (view != null && view.getWindowToken() != null) {
                        if (e7Var.b()) {
                            h7Var.C0 = e7Var;
                        } else if (e7Var.e != null) {
                            e7Var.d(0, 0, false, false);
                            h7Var.C0 = e7Var;
                        }
                    }
                    h7Var.E0 = null;
                    return;
                case 2:
                    ((Application) this.b).unregisterActivityLifecycleCallbacks((c8) this.c);
                    return;
                case 3:
                    hv hvVar = (hv) this.c;
                    iv ivVar = hvVar.o;
                    if (ivVar.g == hvVar.c) {
                        List list = hvVar.b;
                        mw4 mw4Var = (mw4) this.b;
                        Runnable runnable = hvVar.d;
                        List list2 = ivVar.f;
                        ivVar.e = list;
                        ivVar.f = Collections.unmodifiableList(list);
                        mw4Var.a(ivVar.a);
                        ivVar.a(list2, runnable);
                        return;
                    }
                    return;
                case 4:
                    BiometricViewModel biometricViewModel = ((BiometricFragment) this.c).j1;
                    if (biometricViewModel.b == null) {
                        biometricViewModel.b = new io0();
                    }
                    biometricViewModel.b.d((fo0) this.b);
                    return;
                case 5:
                    try {
                        q72 q72Var = (q72) this.c;
                        Object objE = wsf.e((ha8) this.b);
                        tu1 tu1Var = q72Var.b;
                        if (tu1Var != null) {
                            tu1Var.b(objE);
                        }
                    } catch (CancellationException unused) {
                        ((q72) this.c).cancel(false);
                    } catch (ExecutionException e4) {
                        q72 q72Var2 = (q72) this.c;
                        Throwable cause2 = e4.getCause();
                        tu1 tu1Var2 = q72Var2.b;
                        if (tu1Var2 != null) {
                            tu1Var2.d(cause2);
                        }
                    }
                    return;
                case 6:
                    EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.c;
                    xf5 xf5Var = (xf5) this.b;
                    if (((AtomicBoolean) xf5Var.b).compareAndSet(true, false)) {
                        endlessRecyclerView2.Y();
                        endlessRecyclerView2.post(new ue(17, xf5Var));
                        return;
                    }
                    return;
                case 7:
                    FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) this.c;
                    View view2 = (View) this.b;
                    if (view2 instanceof TextView) {
                        b6g.b((TextView) view2, fitFontImageSpan);
                        return;
                    } else {
                        if (view2 instanceof xta) {
                            jgh.b((xta) view2, fitFontImageSpan);
                            return;
                        }
                        return;
                    }
                case 8:
                    nm8 nm8Var = ((od6) this.c).b;
                    c9a c9aVar = nm8Var.e;
                    arb arbVar = arb.FOLDERS_INIT_TO_RENDER;
                    zqb zqbVar2 = (zqb) c9aVar.f(arbVar);
                    if (zqbVar2 == null || zqbVar2.c != -1 || (zqbVar = (zqb) c9aVar.f(arbVar)) == null) {
                        return;
                    }
                    nm8Var.c().getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    zqbVar.c = jElapsedRealtime - zqbVar.b;
                    zqb zqbVar3 = (zqb) c9aVar.f(arb.CHATS_INIT_TO_RENDER);
                    if (zqbVar3 == null || zqbVar3.c != -1) {
                        nm8Var.f(jElapsedRealtime);
                        return;
                    }
                    return;
                case 9:
                    ((k42) this.b).d((xz6) this.c);
                    return;
                case 10:
                    ((gr6) ((zd7) this.b).getHierarchy()).k((Drawable) this.c);
                    return;
                case 11:
                    zd7 zd7Var = (zd7) this.b;
                    gr6 gr6Var = (gr6) zd7Var.getHierarchy();
                    td7 td7Var = (td7) this.c;
                    if (td7Var instanceof rd7) {
                        downloadDrawable = (Drawable) zd7Var.M0.getValue();
                    } else if (td7Var instanceof qd7) {
                        downloadDrawable = zd7Var.getOverlayDrawable();
                    } else {
                        if (!(td7Var instanceof sd7)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        downloadDrawable = zd7Var.getDownloadDrawable();
                    }
                    gr6Var.k(downloadDrawable);
                    return;
                case Protos.Attaches.Attach.PRESENT /* 12 */:
                    xs7 xs7Var = (xs7) this.b;
                    bt7 bt7Var = (bt7) this.c;
                    RecyclerView recyclerView = bt7Var.B0;
                    if (recyclerView == null || !recyclerView.F0 || xs7Var.k || xs7Var.e.f() == -1) {
                        return;
                    }
                    uhd itemAnimator = bt7Var.B0.getItemAnimator();
                    if (itemAnimator == null || !itemAnimator.g()) {
                        ArrayList arrayList = bt7Var.z0;
                        int size = arrayList.size();
                        while (i < size) {
                            if (((xs7) arrayList.get(i)).l) {
                                i++;
                            }
                        }
                        bt7Var.w0.getClass();
                        return;
                    }
                    bt7Var.B0.post(this);
                    return;
                case 13:
                    ((or8) this.c).e((qu1) this.b);
                    return;
                case Protos.Attaches.Attach.LOCATION /* 14 */:
                    IBinder binder = ((wv8) this.b).a.getBinder();
                    pv8 pv8Var = (pv8) ((k89) ((t9f) this.c).b).o.remove(binder);
                    if (pv8Var != null) {
                        binder.unlinkToDeath(pv8Var, 0);
                        return;
                    }
                    return;
                case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                    ((rm9) this.b).setLayout((pm9) this.c);
                    return;
                case 16:
                    rr9 rr9Var = (rr9) this.c;
                    if (((Boolean) rr9Var.b.invoke()).booleanValue()) {
                        ((nm8) gq9.a.getAccessor().c(2)).a(Collections.singletonList(new brb(1)));
                        rr9Var.a.q0(rr9Var);
                        return;
                    }
                    return;
                case LangUtils.HASH_SEED /* 17 */:
                    MessagesListWidget messagesListWidget = (MessagesListWidget) this.c;
                    yy7[] yy7VarArr = MessagesListWidget.b1;
                    messagesListWidget.A0().f(messagesListWidget.H0(), true);
                    return;
                case 18:
                    ((mra) this.c).a.f(this.b);
                    return;
                case 19:
                    ((mbe) ((nbe) this.b)).g((xva) this.c, qqg.a);
                    return;
                case 20:
                    super/*android.view.View*/.invalidateDrawable((Drawable) this.c);
                    return;
                case 21:
                    ((kdb) this.b).removeCallbacks((Runnable) this.c);
                    return;
                case 22:
                    yfb yfbVar = (yfb) this.b;
                    ScrollView scrollView = (ScrollView) this.c;
                    ViewGroup.LayoutParams layoutParams = yfbVar.getLayoutParams();
                     = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : 0;
                    scrollView.setPadding(scrollView.getPaddingLeft(), yfbVar.getMeasuredHeight() + ( != 0 ? ((ViewGroup.MarginLayoutParams) ).topMargin : 0), scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                    return;
                case 23:
                    View view3 = (View) this.b;
                    ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) this.c;
                    RecyclerView recyclerView2 = (RecyclerView) profileEditAdminPermissionsWidget.Z.D(profileEditAdminPermissionsWidget, ProfileEditAdminPermissionsWidget.w0[4]);
                    recyclerView2.setPadding(recyclerView2.getPaddingLeft(), view3.getMeasuredHeight(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                    return;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                    ((k42) this.c).d((lj5) this.b);
                    return;
                case 25:
                    l42 l42Var = (l42) this.b;
                    try {
                        l42Var.resumeWith(((ha8) this.c).get());
                        return;
                    } catch (Throwable th) {
                        Throwable cause3 = th.getCause();
                        if (cause3 == null) {
                            cause3 = th;
                        }
                        if (th instanceof CancellationException) {
                            l42Var.h(cause3);
                            return;
                        } else {
                            l42Var.resumeWith(new ipd(cause3));
                            return;
                        }
                    }
                case 26:
                    try {
                        a();
                        return;
                    } catch (Error e5) {
                        synchronized (((pee) this.c).b) {
                            ((pee) this.c).c = 1;
                            throw e5;
                        }
                    }
                case 27:
                    ArrayList arrayList2 = (ArrayList) this.b;
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        View view4 = (View) arrayList2.get(i);
                        WeakHashMap weakHashMap = hfh.a;
                        String strK = veh.k(view4);
                        if (strK != null) {
                            us usVar = ((eve) this.c).Y;
                            int i2 = usVar.c;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= i2) {
                                    str = null;
                                } else if (strK.equals(usVar.i(i3))) {
                                    str = (String) usVar.f(i3);
                                } else {
                                    i3++;
                                }
                            }
                            veh.v(view4, str);
                        }
                    }
                    return;
                case 28:
                    RecyclerView recyclerView3 = (RecyclerView) this.b;
                    recyclerView3.setPadding(recyclerView3.getPaddingLeft(), recyclerView3.getPaddingTop(), recyclerView3.getPaddingRight(), StickerSetBottomSheet.L0((StickerSetBottomSheet) this.c));
                    return;
                default:
                    View view5 = (View) this.b;
                    StickersScreen stickersScreen = (StickersScreen) this.c;
                    yy7[] yy7VarArr2 = StickersScreen.u0;
                    RecyclerView recyclerViewY0 = stickersScreen.y0();
                    ViewGroup.LayoutParams layoutParams2 = recyclerViewY0.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    int measuredHeight = view5.getMeasuredHeight();
                    ViewGroup.LayoutParams layoutParams3 = view5.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    int i4 = measuredHeight + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                    ViewGroup.LayoutParams layoutParams4 = view5.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    marginLayoutParams.bottomMargin = i4 + (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0);
                    recyclerViewY0.setLayoutParams(marginLayoutParams);
                    return;
            }
        } finally {
            ((q72) this.c).Y = null;
        }
        ((q72) this.c).Y = null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return zn6.class.getSimpleName() + "," + ((rn6) this.c);
            case 26:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((pee) this.c).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zn6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ zn6(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public zn6(pee peeVar) {
        this.a = 26;
        this.c = peeVar;
    }

    public zn6(bt7 bt7Var, xs7 xs7Var, int i) {
        this.a = 12;
        this.c = bt7Var;
        this.b = xs7Var;
    }
}
