package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes.dex */
public final class ub1 implements er1 {
    public x9f A0;
    public final Object B0;
    public final Object C0;
    public final z44 D0;
    public final k18 X;
    public final k18 Z;
    public final tv1 a;
    public final lq5 b;
    public final v21 c;
    public final ax1 d;
    public final k18 o;
    public MainActivity s0;
    public final k18 t0;
    public boolean v0;
    public final Object w0;
    public Drawable x0;
    public boolean y0;
    public final ContextScope z0;
    public final Object Y = ipi.b(3, new g31(11));
    public final d1c u0 = new d1c();

    public ub1(tv1 tv1Var, lq5 lq5Var, v21 v21Var, ax1 ax1Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = tv1Var;
        this.b = lq5Var;
        this.c = v21Var;
        this.d = ax1Var;
        this.o = k18Var2;
        this.X = k18Var3;
        this.Z = k18Var5;
        this.t0 = k18Var;
        k18 k18VarB = ipi.b(3, new g31(12));
        this.w0 = k18VarB;
        this.x0 = (ColorDrawable) k18VarB.getValue();
        this.z0 = d7j.a(((q2b) ((lzf) k18Var4.getValue())).c());
        final int i = 0;
        this.B0 = ipi.b(3, new cm6(this) { // from class: nb1
            public final /* synthetic */ ub1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new ob1(this.b);
                    default:
                        return new pb1(this.b);
                }
            }
        });
        final int i2 = 1;
        this.C0 = ipi.b(3, new cm6(this) { // from class: nb1
            public final /* synthetic */ ub1 b;

            {
                this.b = this;
            }

            @Override // defpackage.cm6
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new ob1(this.b);
                    default:
                        return new pb1(this.b);
                }
            }
        });
        this.D0 = new z44(3, this);
    }

    public static ytd d() {
        return ((RootController) t1b.a.k().f()).G0();
    }

    public static eud f() {
        return t1b.a.k().f();
    }

    public static void g(ub1 ub1Var) {
        ub1Var.y0 = false;
        ((yp5) ub1Var.b).c();
        ub1Var.D0.f(false);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final fn1 a() {
        return (fn1) this.Y.getValue();
    }

    public final boolean c() {
        return ((hw1) this.a).t();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[PHI: r5
  0x0052: PHI (r5v3 android.app.RemoteAction) = (r5v1 android.app.RemoteAction), (r5v4 android.app.RemoteAction) binds: [B:20:0x008d, B:11:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.app.PictureInPictureParams e() {
        /*
            r10 = this;
            android.app.PictureInPictureParams$Builder r0 = new android.app.PictureInPictureParams$Builder
            r0.<init>()
            o98 r1 = defpackage.ve3.d()
            v21 r2 = r10.c
            r3 = r2
            w21 r3 = (defpackage.w21) r3
            boolean r3 = r3.d()
            r4 = 473(0x1d9, float:6.63E-43)
            r5 = 0
            java.lang.String r6 = "Required value was null."
            if (r3 == 0) goto L56
            one.me.android.MainActivity r3 = r10.s0
            if (r3 == 0) goto L50
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r7 = defpackage.i0b.Z
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithResource(r3, r7)
            int r8 = defpackage.m0b.y0
            java.lang.String r9 = r3.getString(r8)
            java.lang.String r3 = r3.getString(r8)
            t1b r8 = defpackage.t1b.a
            w5 r8 = r8.getAccessor()
            java.lang.Object r4 = r8.c(r4)
            id1 r4 = (defpackage.id1) r4
            w21 r2 = (defpackage.w21) r2
            r2.d()
            android.app.PendingIntent r2 = r4.c()
            if (r2 == 0) goto L4a
            r5.<init>(r7, r9, r3, r2)
            goto L50
        L4a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L50:
            if (r5 == 0) goto L90
        L52:
            r1.add(r5)
            goto L90
        L56:
            one.me.android.MainActivity r3 = r10.s0
            if (r3 == 0) goto L8d
            android.app.RemoteAction r5 = new android.app.RemoteAction
            int r7 = defpackage.i0b.a0
            android.graphics.drawable.Icon r7 = android.graphics.drawable.Icon.createWithResource(r3, r7)
            int r8 = defpackage.m0b.x0
            java.lang.String r9 = r3.getString(r8)
            java.lang.String r3 = r3.getString(r8)
            t1b r8 = defpackage.t1b.a
            w5 r8 = r8.getAccessor()
            java.lang.Object r4 = r8.c(r4)
            id1 r4 = (defpackage.id1) r4
            w21 r2 = (defpackage.w21) r2
            r2.d()
            android.app.PendingIntent r2 = r4.c()
            if (r2 == 0) goto L87
            r5.<init>(r7, r9, r3, r2)
            goto L8d
        L87:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r6)
            throw r0
        L8d:
            if (r5 == 0) goto L90
            goto L52
        L90:
            o98 r1 = defpackage.ve3.a(r1)
            android.app.PictureInPictureParams$Builder r0 = r0.setActions(r1)
            java.lang.String r1 = "2:3"
            android.util.Rational r1 = android.util.Rational.parseRational(r1)
            android.app.PictureInPictureParams$Builder r0 = r0.setAspectRatio(r1)
            android.app.PictureInPictureParams r0 = r0.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub1.e():android.app.PictureInPictureParams");
    }

    public final void h(boolean z) {
        RootController rootController = (RootController) f();
        if (c9j.b(rootController.getContext()).a()) {
            z = true;
        }
        if (!rootController.H0().n()) {
            wqi.c("RootController", "hideTopController call indicator wasn't init", new Object[0]);
        } else if (RootController.y0(rootController, rootController.I0())) {
            ho7.q("hideTopController hide call indicator force=", "RootController", z);
            rootController.B0(false, z, null);
        } else {
            RootController.z0(rootController, false);
            wqi.c("RootController", "hideTopController call indicator already hidden force=" + z, new Object[0]);
        }
        ho7.q("try to hide call indicator hasCall=", "PipAppController", c());
    }

    public final void i() {
        MainActivity mainActivity = this.s0;
        if (mainActivity == null) {
            return;
        }
        wqi.c("PipAppController", "hide global pip", new Object[0]);
        if (((gu5) ((rt5) this.Z.getValue())).q() && this.v0) {
            mainActivity.getApplicationContext().unregisterReceiver(this.u0);
            this.v0 = false;
        }
        l(false);
        ytd ytdVarD = d();
        bud budVar = (bud) ue3.Q(ytdVarD.e());
        if (!fni.a(budVar != null ? budVar.b : null, ":call-pip")) {
            wqi.c("PipAppController", "last screen wasn't pip, skip navigation to call.", new Object[0]);
        } else if (((hw1) this.a).u() && !bx1.a(ytdVarD)) {
            wqi.c("PipAppController", "open active call after pip mode.", new Object[0]);
            ul8.c.p0().b(":call-active", null);
        }
        c54 c54VarG = ytdVarD.g(":call-pip");
        if (c54VarG != null) {
            ytdVarD.B(c54VarG);
            if (ytdVarD.n()) {
                return;
            }
            mainActivity.finish();
        }
    }

    public final void j(boolean z) {
        boolean zC = c();
        bud budVar = (bud) ue3.Q(d().e());
        c54 c54Var = budVar != null ? budVar.a : null;
        boolean z2 = (c54Var instanceof nha) || c54Var == null;
        wqi.c("PipAppController", xc0.g("try to show call indicator hasCall=", zC, " canShow=", !z2, "."), new Object[0]);
        if (!z2 && zC) {
            x9f x9fVar = this.A0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            this.A0 = null;
            eud eudVarF = f();
            CallIndicatorWidget callIndicatorWidget = new CallIndicatorWidget();
            RootController rootController = (RootController) eudVarF;
            if (c9j.b(rootController.getContext()).a()) {
                z = true;
            }
            if (rootController.H0().n() && RootController.y0(rootController, rootController.I0())) {
                RootController.z0(rootController, true);
                wqi.c("RootController", "showTopController call indicator already shown.", new Object[0]);
            } else {
                wqi.c("RootController", "showTopController show call indicator force=" + z + ".", new Object[0]);
                rootController.B0(true, z, callIndicatorWidget);
            }
        }
        if (zC) {
            return;
        }
        x9f x9fVar2 = this.A0;
        if (x9fVar2 == null || !x9fVar2.isActive()) {
            wqi.c("PipAppController", "can't show indicator due to call is absent, try to force close indicator.", new Object[0]);
            h(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        if (((android.app.AppOpsManager) r1.getSystemService(android.app.AppOpsManager.class)).unsafeCheckOp("android:picture_in_picture", android.os.Process.myUid(), r1.getPackageName()) == 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub1.k():void");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    public final void l(boolean z) {
        MainActivity mainActivity = this.s0;
        if (mainActivity == null) {
            return;
        }
        if (!z) {
            mainActivity.getWindow().setBackgroundDrawable(this.x0);
        } else {
            this.x0 = mainActivity.getWindow().getDecorView().getBackground();
            mainActivity.getWindow().setBackgroundDrawable((ColorDrawable) this.w0.getValue());
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) throws Throwable {
        super.onDestroyed(conversationDestroyedInfo);
        this.D0.f(false);
        ConversationEndReason reason = conversationDestroyedInfo.getReason();
        if ((reason instanceof ConversationEndReason.Hangup) || (reason instanceof ConversationEndReason.EndedForAll)) {
            svi.g(bd5.a, new tb1(2, null));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        MainActivity mainActivity = this.s0;
        if (mainActivity == null) {
            return;
        }
        ParticipantId participantIdC = knb.c(((onb) ((dob) ((nnb) this.X.getValue())).z0.getValue()).a.a.getId());
        MainActivity mainActivity2 = this.s0;
        boolean z = false;
        if (mainActivity2 != null ? mainActivity2.isInPictureInPictureMode() : false) {
            MainActivity mainActivity3 = this.s0;
            if (mainActivity3 == null ? false : mainActivity3.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                if (list.isEmpty()) {
                    z = true;
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (fni.a(((ConversationParticipant) it.next()).getExternalId(), participantIdC)) {
                            break;
                        }
                    }
                    z = true;
                }
                if (z) {
                    return;
                }
                try {
                    mainActivity.setPictureInPictureParams(e());
                } catch (IllegalStateException e) {
                    wqi.e(ub1.class.getName(), "Pip feature available but setPictureInPictureParams failed", e);
                }
            }
        }
    }
}
