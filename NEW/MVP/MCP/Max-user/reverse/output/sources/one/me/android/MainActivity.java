package one.me.android;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import com.google.android.gms.common.api.Status;
import com.google.android.play.core.review.ReviewException;
import defpackage.aw0;
import defpackage.bud;
import defpackage.c54;
import defpackage.cdb;
import defpackage.ctd;
import defpackage.cu5;
import defpackage.czi;
import defpackage.d53;
import defpackage.d6;
import defpackage.d9a;
import defpackage.da1;
import defpackage.e44;
import defpackage.em1;
import defpackage.enb;
import defpackage.eud;
import defpackage.f5j;
import defpackage.f82;
import defpackage.fo7;
import defpackage.fr7;
import defpackage.g56;
import defpackage.gu5;
import defpackage.gw0;
import defpackage.h0j;
import defpackage.hw1;
import defpackage.hx5;
import defpackage.ipi;
import defpackage.j2e;
import defpackage.j8j;
import defpackage.jj8;
import defpackage.kcb;
import defpackage.ksd;
import defpackage.kub;
import defpackage.l38;
import defpackage.l3b;
import defpackage.l48;
import defpackage.l6b;
import defpackage.l85;
import defpackage.lb5;
import defpackage.lci;
import defpackage.ld0;
import defpackage.lg8;
import defpackage.ll8;
import defpackage.m36;
import defpackage.m8;
import defpackage.mdf;
import defpackage.ml8;
import defpackage.n2g;
import defpackage.n5e;
import defpackage.nl8;
import defpackage.nm8;
import defpackage.ob1;
import defpackage.oc3;
import defpackage.ol8;
import defpackage.pb1;
import defpackage.pl8;
import defpackage.pli;
import defpackage.qcb;
import defpackage.qh8;
import defpackage.qha;
import defpackage.ql8;
import defpackage.qn2;
import defpackage.rl8;
import defpackage.rt5;
import defpackage.s91;
import defpackage.sri;
import defpackage.svi;
import defpackage.sxg;
import defpackage.t1b;
import defpackage.tl8;
import defpackage.tv1;
import defpackage.u2d;
import defpackage.ub1;
import defpackage.uba;
import defpackage.ue3;
import defpackage.uh7;
import defpackage.wh7;
import defpackage.wqi;
import defpackage.wxc;
import defpackage.x21;
import defpackage.x9f;
import defpackage.xh7;
import defpackage.ybj;
import defpackage.yh7;
import defpackage.ytd;
import defpackage.yud;
import defpackage.z41;
import defpackage.z7;
import defpackage.z8j;
import defpackage.zpi;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.main.MainScreen;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lone/me/android/MainActivity;", "Ld6;", "Lksd;", "Lm8;", "<init>", "()V", "b6a", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity extends d6 implements ksd, m8 {
    public static final /* synthetic */ int a1 = 0;
    public ytd S0;
    public ub1 U0;
    public final lb5 W0;
    public final nm8 X0;
    public final oc3 Y0;
    public x9f Z0;
    public final boolean T0 = true;
    public final Object V0 = ipi.b(3, new fr7(9, this));

    public MainActivity() {
        t1b t1bVar = t1b.a;
        this.W0 = (lb5) t1bVar.getAccessor().c(666);
        this.X0 = (nm8) t1bVar.getAccessor().c(2);
        this.Y0 = new oc3(2, this);
    }

    @Override // defpackage.d6
    public final String G() {
        return null;
    }

    @Override // defpackage.d6
    public final void H(int i, int i2, Intent intent) {
        if (i != 102 || i2 == 0) {
            return;
        }
        ((kub) t1b.a.getAccessor().c(318)).b();
        int i3 = 0;
        j8j.e(this, new cdb(new qcb(yud.o), z7.e(this, u2d.oneme_contact_saved_snackbar_title), null, new kcb(i3, i3, i3, 7)));
    }

    @Override // defpackage.d6
    public final void I() {
    }

    public final eud O() {
        ytd ytdVar = this.S0;
        if (ytdVar == null) {
            ytdVar = null;
        }
        bud budVar = (bud) ue3.Q(ytdVar.e());
        Object obj = budVar != null ? budVar.a : null;
        eud eudVar = obj instanceof eud ? (eud) obj : null;
        if (eudVar == null || this.S0 == null) {
            return null;
        }
        return eudVar;
    }

    public final void P() {
        ybj ybjVarE;
        String str;
        ((yh7) t1b.a.getAccessor().c(458)).getClass();
        xh7 xh7Var = yh7.b;
        if (xh7Var != null) {
            qha qhaVar = new qha(23);
            xh7Var.a = this;
            xh7Var.d = qhaVar;
            Context applicationContext = getApplicationContext();
            if (applicationContext == null) {
                applicationContext = this;
            }
            enb enbVar = new enb(new sri(applicationContext));
            xh7Var.b = enbVar;
            sri sriVar = (sri) enbVar.b;
            String str2 = sriVar.b;
            hx5 hx5Var = sri.c;
            hx5Var.a("requestInAppReview (%s)", str2);
            z8j z8jVar = sriVar.a;
            if (z8jVar == null) {
                Object[] objArr = new Object[0];
                if (Log.isLoggable("PlayCore", 6)) {
                    Log.e("PlayCore", hx5.c(hx5Var.a, "Play Store app is either not installed or not the official version", objArr));
                }
                Locale locale = Locale.getDefault();
                HashMap map = lci.a;
                if (map.containsKey(-1)) {
                    str = ((String) map.get(-1)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) lci.b.get(-1)) + ")";
                } else {
                    str = "";
                }
                ybjVarE = n5e.e(new ReviewException(new Status(-1, String.format(locale, "Review Error(%d): %s", -1, str), null, null)));
            } else {
                n2g n2gVar = new n2g();
                z8jVar.a().post(new h0j(z8jVar, n2gVar, n2gVar, new pli(sriVar, n2gVar, n2gVar)));
                ybjVarE = n2gVar.a;
            }
            if (ybjVarE != null) {
                ybjVarE.i(new wh7(xh7Var, 0));
            }
        }
    }

    public final boolean Q() {
        String action;
        Intent intent = getIntent();
        return (intent == null || (action = intent.getAction()) == null || action.equals("android.intent.action.MAIN") || action.equals("android.intent.action.SEND") || action.equals("android.intent.action.SEND_MULTIPLE")) ? false : true;
    }

    @Override // defpackage.m8
    public final boolean c() {
        eud eudVarO = O();
        c54 c54VarW = eudVarO != null ? eudVarO.w() : null;
        j2e j2eVar = c54VarW instanceof j2e ? (j2e) c54VarW : null;
        int iV = j2eVar != null ? j2eVar.getA() : 0;
        return iV == 1 || iV == 3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    @Override // defpackage.m8
    public final boolean j() {
        bud budVar;
        eud eudVar = (eud) ((x21) this.V0.getValue()).a.invoke();
        c54 c54VarW = (eudVar == null || (budVar = (bud) ue3.Q(((RootController) eudVar).H0().e())) == null) ? null : budVar.a;
        if (c54VarW == null) {
            eud eudVarO = O();
            c54VarW = eudVarO != null ? eudVarO.w() : null;
        }
        j2e j2eVar = c54VarW instanceof j2e ? (j2e) c54VarW : null;
        int iV = j2eVar != null ? j2eVar.getA() : 0;
        return iV == 1 || iV == 2;
    }

    @Override // defpackage.ksd
    public final ytd k() {
        ytd ytdVar = this.S0;
        if (ytdVar != null) {
            return ytdVar;
        }
        return null;
    }

    @Override // defpackage.ksd
    /* renamed from: m, reason: from getter */
    public final boolean getT0() {
        return this.T0;
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, k18] */
    @Override // defpackage.d6, androidx.fragment.app.b, defpackage.nl3, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String name = MainActivity.class.getName();
        l6b l6bVar = wqi.a;
        Continuation continuation = null;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ctd.i(getIntent().getData(), "@deep_link: onCreate: intent.data = "), null);
            }
        }
        nm8 nm8Var = this.X0;
        getIntent();
        nm8Var.i = Q();
        f82 f82VarA = czi.a(this);
        f82VarA.setId(wxc.root);
        getWindow().setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        setContentView(f82VarA);
        l85.a(this);
        super.onCreate(bundle);
        ytd ytdVarA = f5j.a(this, f82VarA, bundle);
        ytdVarA.e = 1;
        ytdVarA.R(false);
        this.S0 = ytdVarA;
        qn2 qn2Var = new qn2(bundle, 24, this);
        RootController rootControllerC = j8j.c(this);
        t1b t1bVar = t1b.a;
        t1bVar.k().g(new da1(this, rootControllerC, qn2Var, 15));
        j8j.f(this, null);
        t1bVar.c().getClass();
        ub1 ub1Var = (ub1) t1bVar.getAccessor().c(511);
        u().a(this, ub1Var.D0);
        wqi.c("PipAppController", "CallIndicatorAppController attached", new Object[0]);
        ub1Var.s0 = this;
        ub1.d().a((pb1) ub1Var.C0.getValue());
        ub1Var.j(true);
        ((hw1) ub1Var.a).e((ob1) ub1Var.B0.getValue());
        ub1Var.d.d(ub1Var);
        this.U0 = ub1Var;
        gw0.w(new g56(((qh8) t1bVar.getAccessor().c(85)).stream(), new nl8(this, null), 1), zpi.a(p()));
        int i = 3;
        svi.e(zpi.a(p()), null, null, new tl8(this, null), 3);
        int i2 = 1;
        gw0.w(new g56(this.W0.a(), new ol8(this, null), i2), zpi.a(p()));
        setIntent(null);
        cu5 cu5Var = ((gu5) ((rt5) t1bVar.getAccessor().c(48))).u;
        l48 l48Var = this.a;
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(cu5Var, l48Var, l38Var), new pl8(this, null), i2), zpi.a(p()));
        gw0.w(new g56(gw0.m(aw0.a(((sxg) t1bVar.getAccessor().c(61)).l, this.a, l38Var)), new ql8(this, null), 1), zpi.a(p()));
        int i3 = 3;
        jj8 jj8Var = new jj8(gw0.s(new d53(new z41(t1bVar.j().a.t(), new d53(uba.d, 12), new rl8(3, null), i3), 12), new ll8(this, null)), 2);
        MainScreen.Y.getClass();
        this.Z0 = gw0.w(new m36(new g56(new d53(aw0.a(new z41(jj8Var, MainScreen.s0, new em1(i, continuation, 2), i3), this.a, l38.o), 12), new ml8(this, null), 1), new ld0(i, continuation, 22)), zpi.a(p()));
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, k18] */
    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ub1 ub1Var = this.U0;
        if (ub1Var != null) {
            wqi.c("PipAppController", "CallIndicatorAppController dettached", new Object[0]);
            ub1Var.s0 = null;
            ub1.d().L((pb1) ub1Var.C0.getValue());
            tv1 tv1Var = ub1Var.a;
            ((hw1) tv1Var).Z0.remove((ob1) ub1Var.B0.getValue());
            ub1Var.d.c(ub1Var);
            x9f x9fVar = ub1Var.A0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            ub1Var.A0 = null;
        }
        t1b t1bVar = t1b.a;
        ytd ytdVarH0 = ((RootController) t1bVar.k().f()).H0();
        oc3 oc3Var = this.Y0;
        ytdVarH0.L(oc3Var);
        ((RootController) t1bVar.k().f()).G0().L(oc3Var);
        ((yh7) t1bVar.getAccessor().c(458)).getClass();
        xh7 xh7Var = yh7.b;
        if (xh7Var != null) {
            xh7Var.a = null;
            xh7Var.b = null;
            xh7Var.d = null;
        }
    }

    @Override // defpackage.d6, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        s91 s91Var = (s91) ((ub1) t1b.a.getAccessor().c(511)).o.getValue();
        boolean zV = ((hw1) ((tv1) s91Var.a.getValue())).v();
        boolean z = keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25);
        if (z && zV) {
            s91Var.a();
        } else {
            wqi.c("HandleSilenceMode", "skip handle buttons, isIncoming=" + zV + " isNeededAction=" + z, new Object[0]);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String name = MainActivity.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, ctd.i(intent.getData(), "@deep_link: onNewIntent: intent.data = "), null);
            }
        }
        this.X0.i = Q();
        super.onNewIntent(intent);
        j8j.a(j8j.c(this), intent);
        t1b.a.k().g(new l3b(this, 21, intent));
        j8j.f(this, intent);
        setIntent(null);
    }

    @Override // defpackage.d6, androidx.fragment.app.b, android.app.Activity
    public final void onPause() {
        super.onPause();
        d9a d9aVar = fo7.a;
        Object[] objArr = d9aVar.b;
        long[] jArr = d9aVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        ((mdf) objArr[(i << 3) + i3]).g = true;
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.nl3, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        ub1 ub1Var;
        super.onPictureInPictureModeChanged(z, configuration);
        if (z || (ub1Var = this.U0) == null) {
            return;
        }
        ub1Var.i();
    }

    @Override // defpackage.d6, androidx.fragment.app.b, android.app.Activity
    public final void onResume() {
        ub1 ub1Var;
        super.onResume();
        t1b t1bVar = t1b.a;
        ((yh7) t1bVar.getAccessor().c(458)).getClass();
        xh7 xh7Var = yh7.b;
        if (xh7Var != null) {
            e44 e44Var = new e44(28, xh7Var);
            uh7 uh7VarG = t1bVar.g();
            if (uh7VarG != null) {
                uh7VarG.k = e44Var;
            }
        }
        fo7.a();
        if (isInPictureInPictureMode() || (ub1Var = this.U0) == null) {
            return;
        }
        ub1Var.i();
    }

    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onStart() {
        super.onStart();
        P();
    }

    @Override // defpackage.d6, defpackage.ln, androidx.fragment.app.b, android.app.Activity
    public final void onStop() {
        uh7 uh7VarG;
        super.onStop();
        t1b t1bVar = t1b.a;
        ((yh7) t1bVar.getAccessor().c(458)).getClass();
        if (yh7.b == null || (uh7VarG = t1bVar.g()) == null) {
            return;
        }
        uh7VarG.k = null;
    }

    @Override // defpackage.d6, defpackage.nl3, android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        ub1 ub1Var = this.U0;
        if (ub1Var != null) {
            ub1Var.k();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            fo7.a();
        }
    }
}
