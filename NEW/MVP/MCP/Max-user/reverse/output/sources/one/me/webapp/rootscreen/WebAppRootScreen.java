package one.me.webapp.rootscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.system.ErrnoException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.aw0;
import defpackage.awh;
import defpackage.ayh;
import defpackage.az1;
import defpackage.b6g;
import defpackage.bbd;
import defpackage.blh;
import defpackage.bud;
import defpackage.bwh;
import defpackage.bxh;
import defpackage.c7j;
import defpackage.ccb;
import defpackage.ci5;
import defpackage.clh;
import defpackage.cmh;
import defpackage.d1;
import defpackage.d53;
import defpackage.dj6;
import defpackage.eo7;
import defpackage.es0;
import defpackage.f84;
import defpackage.fuh;
import defpackage.fve;
import defpackage.g44;
import defpackage.g56;
import defpackage.gfb;
import defpackage.gk2;
import defpackage.goh;
import defpackage.gu5;
import defpackage.gvh;
import defpackage.gw0;
import defpackage.gwi;
import defpackage.hfb;
import defpackage.hgb;
import defpackage.hs;
import defpackage.huh;
import defpackage.hvh;
import defpackage.hxh;
import defpackage.i6c;
import defpackage.imb;
import defpackage.ipd;
import defpackage.ipi;
import defpackage.iuh;
import defpackage.iz5;
import defpackage.j5g;
import defpackage.k18;
import defpackage.k1e;
import defpackage.ka5;
import defpackage.kpd;
import defpackage.kph;
import defpackage.kvd;
import defpackage.l38;
import defpackage.l48;
import defpackage.l5g;
import defpackage.l6b;
import defpackage.lg8;
import defpackage.lue;
import defpackage.q2b;
import defpackage.q8g;
import defpackage.qcb;
import defpackage.qq3;
import defpackage.qrb;
import defpackage.qrc;
import defpackage.qsb;
import defpackage.qt7;
import defpackage.qth;
import defpackage.qv7;
import defpackage.ra3;
import defpackage.rph;
import defpackage.rt5;
import defpackage.rth;
import defpackage.svh;
import defpackage.svi;
import defpackage.sxa;
import defpackage.sxg;
import defpackage.t3e;
import defpackage.t9f;
import defpackage.tcf;
import defpackage.tk4;
import defpackage.tmh;
import defpackage.toc;
import defpackage.ts9;
import defpackage.tvh;
import defpackage.u45;
import defpackage.uif;
import defpackage.ukh;
import defpackage.uth;
import defpackage.uvh;
import defpackage.vid;
import defpackage.vth;
import defpackage.vvh;
import defpackage.vy;
import defpackage.wqi;
import defpackage.wth;
import defpackage.wuh;
import defpackage.wvh;
import defpackage.wy1;
import defpackage.x9f;
import defpackage.xfh;
import defpackage.xth;
import defpackage.xv7;
import defpackage.xvh;
import defpackage.yfb;
import defpackage.ys;
import defpackage.yth;
import defpackage.yud;
import defpackage.yvh;
import defpackage.yvi;
import defpackage.yy7;
import defpackage.z8a;
import defpackage.zth;
import defpackage.zuh;
import defpackage.zvh;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import org.apache.http.protocol.HTTP;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0015\b\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\t\u0010\u0016¨\u0006\u0017"}, d2 = {"Lone/me/webapp/rootscreen/WebAppRootScreen;", "Lone/me/sdk/bottomsheet/BaseBottomSheetWidget;", "Lqq3;", "Lg44;", "Llue;", "Lqrb;", "Lqrc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "botId", "Lukh;", "entryPoint", "sourceId", "", "startParam", "", "isFullscreen", "", "requestCode", "(JLukh;Ljava/lang/Long;Ljava/lang/String;ZI)V", "web-app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ValidController", "SetJavaScriptEnabled"})
/* loaded from: classes2.dex */
public final class WebAppRootScreen extends BaseBottomSheetWidget implements qq3, g44, lue, qrb, qrc {
    public static final /* synthetic */ yy7[] R0 = {new z8a(WebAppRootScreen.class, "sourceId", "getSourceId()Ljava/lang/Long;"), u45.h(vid.a, WebAppRootScreen.class, "botId", "getBotId()J"), new z8a(WebAppRootScreen.class, "entryPoint", "getEntryPoint()Lone/me/sdk/statistics/webapps/WebAppActionsStats$EntryPoint;"), new z8a(WebAppRootScreen.class, "startParam", "getStartParam()Ljava/lang/String;"), new z8a(WebAppRootScreen.class, "isFullscreen", "isFullscreen()Z"), new toc(WebAppRootScreen.class, "requestCode", "getRequestCode()I", 0), new z8a(WebAppRootScreen.class, "shareDialogJob", "getShareDialogJob()Lkotlinx/coroutines/Job;"), new toc(WebAppRootScreen.class, "webView", "getWebView()Lone/me/webapp/rootscreen/ScrollTrackingWebView;", 0), new toc(WebAppRootScreen.class, "toolbarView", "getToolbarView()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    public final hs A0;
    public final hs B0;
    public final String C0;
    public final k18 D0;
    public goh E0;
    public final ka5 F0;
    public final k18 G0;
    public final k18 H0;
    public final k18 I0;
    public final k18 J0;
    public final k18 K0;
    public final t9f L0;
    public final bbd M0;
    public final Object N0;
    public final bbd O0;
    public Bundle P0;
    public zvh Q0;
    public final hs w0;
    public final hs x0;
    public final hs y0;
    public final hs z0;

    /* JADX WARN: Multi-variable type inference failed */
    public WebAppRootScreen() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static final void L0(WebAppRootScreen webAppRootScreen, Intent intent, hxh hxhVar) throws IOException, ErrnoException {
        Object ipdVar;
        k18 k18Var = webAppRootScreen.G0;
        String str = webAppRootScreen.C0;
        byte[] bArr = hxhVar.a;
        String str2 = hxhVar.c;
        String str3 = hxhVar.b;
        if (bArr == null) {
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            return;
        }
        String str4 = str3 == null ? "file" : str3;
        int i = 0;
        File fileH = null;
        while (true) {
            if (fileH != null && !fileH.exists()) {
                break;
            }
            if (i == 100) {
                fileH = null;
                break;
            } else {
                fileH = ((iz5) k18Var.getValue()).h(az1.i(str4, i > 0 ? wy1.e(i, " (", ")") : ""));
                i++;
            }
        }
        if (fileH == null) {
            wqi.c(str, "getUniqueNewFile return null", new Object[0]);
            return;
        }
        vy vyVar = new vy(fileH, null);
        FileOutputStream fileOutputStreamF = vyVar.f();
        if (fileOutputStreamF != null) {
            try {
                fileOutputStreamF.write(bArr);
                vyVar.b(fileOutputStreamF);
            } catch (Throwable th) {
                vyVar.a(fileOutputStreamF);
                throw th;
            }
        }
        if (str2 == null) {
            str2 = HTTP.PLAIN_TEXT_TYPE;
        }
        try {
            intent.setType(str2);
            if (str3 != null) {
                intent.putExtra("android.intent.extra.TITLE", str3);
            }
            intent.putExtra("android.intent.extra.STREAM", ((iz5) k18Var.getValue()).f(webAppRootScreen.getContext(), fileH));
            ipdVar = intent.addFlags(1);
        } catch (Throwable th2) {
            ipdVar = new ipd(th2);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e(str, "appendFile: " + thA, thA);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void R0(defpackage.yfb r3, boolean r4) {
        /*
            android.widget.TextView r0 = r3.getTitle()
            float r0 = defpackage.b6g.e(r0)
            int r0 = defpackage.kpi.r(r0)
            r1 = 0
            if (r4 == 0) goto L20
            android.widget.TextView r2 = r3.getTitle()
            xzg r2 = defpackage.b6g.a(r2)
            if (r2 == 0) goto L1c
            int r2 = r2.a
            goto L1d
        L1c:
            r2 = r1
        L1d:
            if (r2 != r0) goto L20
            return
        L20:
            if (r4 == 0) goto L3c
            android.widget.TextView r4 = r3.getTitle()
            xzg r4 = defpackage.b6g.a(r4)
            if (r4 == 0) goto L2e
            int r1 = r4.a
        L2e:
            if (r1 == r0) goto L3c
            xzg r4 = new xzg
            android.content.Context r1 = r3.getContext()
            kc3 r2 = defpackage.kc3.C0
            r4.<init>(r1, r0, r2)
            goto L3d
        L3c:
            r4 = 0
        L3d:
            android.widget.TextView r3 = r3.getTitle()
            defpackage.b6g.d(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.webapp.rootscreen.WebAppRootScreen.R0(yfb, boolean):void");
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    /* renamed from: A0 */
    public final eo7 getC0() {
        if (!P0()) {
            return this.X;
        }
        eo7 eo7Var = eo7.e;
        return eo7.f;
    }

    @Override // defpackage.g44
    public final void C(int i, Bundle bundle) {
        String[] stringArray;
        uvh uvhVarN0 = N0();
        ci5 ci5Var = uvhVarN0.Z0;
        if (i == 1) {
            uvhVarN0.H0.O(uvhVarN0, uvh.o1[0], xfh.o(uvhVarN0, null, new hvh(uvhVarN0, null), 1));
            return;
        }
        if (i == hgb.c) {
            int i2 = bundle != null ? bundle.getInt("file_chooser_mode", 0) : 0;
            if (bundle == null || (stringArray = bundle.getStringArray("android.intent.extra.MIME_TYPES")) == null) {
                stringArray = uvh.p1;
            }
            xfh.r(ci5Var, new iuh(i2, stringArray));
            return;
        }
        if (i != hgb.a) {
            if (i == hgb.b) {
                xfh.r(ci5Var, new huh(bundle != null ? bundle.getInt("file_chooser_mode", 0) : 0));
            }
        } else {
            blh blhVar = (blh) uvhVarN0.w0.getValue();
            clh clhVar = uvhVarN0.G0;
            if (clhVar != null) {
                blhVar.a(5, clhVar.a, clhVar.b, clhVar.c, clhVar.d);
            }
            uvhVarN0.D();
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final boolean D0() {
        uvh uvhVarN0 = N0();
        if (!((Boolean) uvhVarN0.M0.getValue()).booleanValue()) {
            return true;
        }
        xfh.o(uvhVarN0, null, new gvh(uvhVarN0, null), 3);
        return false;
    }

    @Override // defpackage.qq3
    public final void F(Bundle bundle) {
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (numValueOf != null && numValueOf.intValue() == 5) {
            N0().x(false);
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            N0().A(false);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void H0() throws Throwable {
        Window window;
        WindowManager.LayoutParams attributes;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.screenBrightness = -1.0f;
            Window window2 = activity.getWindow();
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
        }
        uvh uvhVarN0 = N0();
        boolean z = uvhVarN0.Q0;
        t9f t9fVar = uvhVarN0.I0;
        t9f t9fVar2 = uvhVarN0.H0;
        if (!z) {
            qv7 qv7Var = uvhVarN0.e1;
            if (qv7Var != null) {
                qv7Var.b(new d1());
            }
            uvhVarN0.e1 = null;
            uvhVarN0.f1 = null;
            ConcurrentHashMap concurrentHashMap = uvhVarN0.j1;
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                ((Number) entry.getKey()).longValue();
                ((qv7) entry.getValue()).b(new rph());
            }
            concurrentHashMap.clear();
            x9f x9fVar = uvhVarN0.k1;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            uvhVarN0.k1 = null;
            yy7[] yy7VarArr = uvh.o1;
            qt7 qt7Var = (qt7) t9fVar2.D(uvhVarN0, yy7VarArr[0]);
            if (qt7Var != null) {
                qt7Var.cancel(null);
            }
            t9fVar2.O(uvhVarN0, yy7VarArr[0], null);
            qt7 qt7Var2 = (qt7) t9fVar.D(uvhVarN0, yy7VarArr[1]);
            if (qt7Var2 != null) {
                qt7Var2.cancel(null);
            }
            t9fVar.O(uvhVarN0, yy7VarArr[1], null);
        }
        uvh uvhVarN02 = N0();
        if (uvhVarN02.Q0) {
            return;
        }
        uvhVarN02.Q0 = true;
        blh blhVar = (blh) uvhVarN02.w0.getValue();
        clh clhVar = uvhVarN02.G0;
        if (clhVar != null) {
            blhVar.a(2, clhVar.a, clhVar.b, clhVar.c, clhVar.d);
        }
    }

    @Override // defpackage.lue
    public final void K() throws Throwable {
        bxh bxhVar = N0().h1;
        if (bxhVar != null) {
            bxhVar.a(ayh.c);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final void K0(FrameLayout frameLayout, LayoutInflater layoutInflater, Bundle bundle) {
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        qth qthVar = new qth(this, 3);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(hgb.f);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        qthVar.invoke(linearLayout);
        frameLayout.addView(linearLayout);
    }

    public final yfb M0() {
        return (yfb) this.O0.D(this, R0[8]);
    }

    public final uvh N0() {
        return (uvh) this.D0.getValue();
    }

    public final t3e O0() {
        return (t3e) this.M0.D(this, R0[7]);
    }

    public final boolean P0() {
        yy7 yy7Var = R0[4];
        return ((Boolean) this.A0.a(this)).booleanValue();
    }

    public final void Q0(boolean z) {
        Object objPrevious;
        ArrayList arrayListE = getRouter().e();
        ListIterator listIterator = arrayListE.listIterator(arrayListE.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((bud) objPrevious).a instanceof dj6) {
                    break;
                }
            }
        }
        bud budVar = (bud) objPrevious;
        Object obj = budVar != null ? budVar.a : null;
        dj6 dj6Var = obj instanceof dj6 ? (dj6) obj : null;
        if (dj6Var != null) {
            yy7[] yy7VarArr = R0;
            yy7 yy7Var = yy7VarArr[5];
            hs hsVar = this.B0;
            if (((Number) hsVar.a(this)).intValue() == 0) {
                return;
            }
            int i = z ? -1 : 0;
            yy7 yy7Var2 = yy7VarArr[5];
            dj6Var.X(((Number) hsVar.a(this)).intValue(), i, null);
        }
    }

    public final void S0(wuh wuhVar) {
        String str = ((Object) wuhVar.a.b(getContext())) + " " + ((Object) wuhVar.b.b(getContext()));
        ccb ccbVar = new ccb(this);
        ccbVar.e(new qcb(yud.A));
        ccbVar.h(str);
        ccbVar.i();
    }

    public final void T0(boolean z) {
        M0().setLeftActions(z ? new gfb(new qth(this, 1)) : new hfb(new qth(this, 2)));
    }

    @Override // defpackage.qq3
    public final void g(int i, Bundle bundle) {
        Integer numValueOf = bundle != null ? Integer.valueOf(bundle.getInt("dialog_id")) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            if (i != 1) {
                return;
            }
            xfh.r(N0().Z0, new fuh(false));
            return;
        }
        if (numValueOf != null && numValueOf.intValue() == 2) {
            if (i == 1) {
                N0().B(true);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                N0().B(false);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 3) {
            if (i == 1) {
                N0().A(true);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                N0().A(false);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 4) {
            if (i == 1) {
                tmh tmhVarV = N0().v();
                svi.e(tmhVarV.c, ((q2b) tmhVarV.e()).a(), null, new cmh(tmhVarV, null, true), 2);
                return;
            } else {
                if (i != 2) {
                    return;
                }
                tmh tmhVarV2 = N0().v();
                svi.e(tmhVarV2.c, ((q2b) tmhVarV2.e()).a(), null, new cmh(tmhVarV2, null, false), 2);
                return;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 5) {
            if (i == 1) {
                N0().x(true);
            } else {
                if (i != 2) {
                    return;
                }
                N0().x(false);
            }
        }
    }

    @Override // defpackage.lue
    public final void g0(int i) throws Throwable {
        Object value;
        uvh uvhVarN0 = N0();
        bxh bxhVar = uvhVarN0.h1;
        if (bxhVar != null) {
            bxhVar.a(ayh.b);
        }
        j5g j5gVar = new j5g(kvd.c, i);
        l5g l5gVar = new l5g(ys.D(new Object[]{Integer.valueOf(i)}), kvd.b, i);
        tcf tcfVar = uvhVarN0.O0;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new wuh(j5gVar, l5gVar)));
    }

    @Override // one.me.sdk.arch.Widget
    public final k1e getScreenDelegate() {
        return this.F0;
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final boolean handleBack() {
        uvh uvhVarN0 = N0();
        if (!((Boolean) uvhVarN0.L0.getValue()).booleanValue()) {
            xfh.o(uvhVarN0, null, new gvh(uvhVarN0, null), 3);
            return true;
        }
        ra3 ra3Var = uvhVarN0.J0;
        svi.e((f84) ra3Var.a, null, null, new xv7(ra3Var, null), 3);
        return true;
    }

    @Override // defpackage.qrb
    public final void i0(boolean z) {
        if (z || ((qsb) this.H0.getValue()).c(qsb.m)) {
            return;
        }
        N0().C();
    }

    @Override // defpackage.c54
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1373) {
            if (intent == null) {
                N0().C();
                return;
            } else {
                uvh uvhVarN0 = N0();
                xfh.o(uvhVarN0, ((q2b) uvhVarN0.w()).b(), new tvh(intent, i2, uvhVarN0, null), 2);
                return;
            }
        }
        if (i != 1555) {
            return;
        }
        if (i2 != -1) {
            N0().C();
        } else {
            uvh uvhVarN02 = N0();
            svi.e(uvhVarN02.a, ((q2b) uvhVarN02.w()).b(), null, new svh(uvhVarN02, intent != null ? intent.getData() : null, null), 2);
        }
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new es0(19, this));
        } else if (b6g.c(M0().getTitle())) {
            R0(M0(), true);
        }
        uvh uvhVarN0 = N0();
        boolean z = uvhVarN0.R0;
        k18 k18Var = uvhVarN0.z0;
        if (z || !((sxg) k18Var.getValue()).g.getBoolean("app.pinLock.screenshotEnabled", true)) {
            return;
        }
        ((sxg) k18Var.getValue()).s(false);
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.c54
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.E0 = null;
    }

    @Override // defpackage.c54
    public final void onDetach(View view) {
        super.onDetach(view);
        uvh uvhVarN0 = N0();
        boolean z = uvhVarN0.R0;
        k18 k18Var = uvhVarN0.z0;
        if (z || ((sxg) k18Var.getValue()).g.getBoolean("app.pinLock.screenshotEnabled", true)) {
            return;
        }
        ((sxg) k18Var.getValue()).s(true);
    }

    @Override // defpackage.g44
    public final void onDismiss() {
        yy7[] yy7VarArr = R0;
        yy7 yy7Var = yy7VarArr[6];
        t9f t9fVar = this.L0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[6], null);
        N0().C();
    }

    @Override // defpackage.c54
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158) {
            xfh.r(N0().Z0, new zuh(strArr, iArr));
        }
    }

    @Override // defpackage.c54
    public final void onRestoreViewState(View view, Bundle bundle) {
        zvh zvhVar;
        vvh vvhVar;
        vvh yvhVar;
        lg8 lg8Var = lg8.d;
        super.onRestoreViewState(view, bundle);
        if (((gu5) ((rt5) this.I0.getValue())).z()) {
            bwh bwhVar = (bwh) ((Parcelable) yvi.a(bundle, "web_view_model_state_key", bwh.class));
            if (bwhVar != null) {
                String str = bwhVar.a;
                boolean z = bwhVar.b;
                String str2 = bwhVar.c;
                boolean z2 = bwhVar.X;
                boolean z3 = bwhVar.Y;
                int i = awh.$EnumSwitchMapping$0[az1.v(bwhVar.d)];
                if (i == 1) {
                    vvhVar = xvh.a;
                } else if (i == 2) {
                    yvhVar = new yvh(bwhVar.o);
                    zvhVar = new zvh(str, z, yvhVar, str2, z2, z3);
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    vvhVar = wvh.a;
                }
                yvhVar = vvhVar;
                zvhVar = new zvh(str, z, yvhVar, str2, z2, z3);
            } else {
                zvhVar = null;
            }
            this.Q0 = zvhVar;
            String str3 = this.C0;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str3, "onRestoreViewState: " + this.Q0, null);
            }
            Bundle bundle2 = bundle.getBundle("web_view_state_key");
            if (bundle2 == null) {
                return;
            }
            uvh uvhVarN0 = N0();
            String str4 = uvhVarN0.F0;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str4, "restoreWebView: " + uvhVarN0.X, null);
            }
            if (uvhVarN0.X != null) {
                x9f x9fVar = uvhVarN0.n1;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                }
                uvhVarN0.n1 = null;
            }
            this.P0 = bundle2;
        }
    }

    @Override // defpackage.c54
    public final void onSaveViewState(View view, Bundle bundle) {
        bwh bwhVar;
        int i;
        lg8 lg8Var = lg8.d;
        super.onSaveViewState(view, bundle);
        if (((gu5) ((rt5) this.I0.getValue())).z()) {
            String str = this.C0;
            l6b l6bVar = wqi.a;
            if (l6bVar != null && l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "onSaveViewState", null);
            }
            Bundle bundleA = gwi.a();
            O0().saveState(bundleA);
            bundle.putBundle("web_view_state_key", bundleA);
            uvh uvhVarN0 = N0();
            String url = O0().getUrl();
            zvh zvhVar = (zvh) uvhVarN0.X0.a.getValue();
            if (zvhVar != null) {
                vvh vvhVar = zvhVar.c;
                String str2 = zvhVar.a;
                boolean z = zvhVar.b;
                String str3 = zvhVar.d;
                String str4 = str3 == null ? url : str3;
                boolean z2 = zvhVar.e;
                boolean z3 = zvhVar.f;
                if (vvhVar.equals(wvh.a)) {
                    i = 3;
                } else if (vvhVar.equals(xvh.a)) {
                    i = 1;
                } else {
                    if (!(vvhVar instanceof yvh)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 2;
                }
                bwhVar = new bwh(i, str2, str4, z, vvhVar instanceof yvh ? ((yvh) vvhVar).a : false, z2, z3);
            } else {
                bwhVar = null;
            }
            if (bwhVar == null) {
                return;
            }
            String str5 = this.C0;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str5, "onSaveViewState: " + bwhVar, null);
            }
            bundle.putParcelable("web_view_model_state_key", bwhVar);
        }
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [java.lang.Object, k18] */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        d53 d53Var = N0().V0;
        l48 l48VarP = getViewLifecycleOwner().p();
        l38 l38Var = l38.d;
        gw0.w(new g56(aw0.a(d53Var, l48VarP, l38Var), new uth(null, this), 1), getViewLifecycleScope());
        this.E0 = new goh(requireActivity(), new ts9(1, N0(), uvh.class, "onBiometrySuccess", "onBiometrySuccess(Landroidx/biometric/BiometricPrompt$CryptoObject;)V", 0, 20), new sxa(0, N0(), uvh.class, "onBiometryFail", "onBiometryFail()V", 0, 10));
        gw0.w(new g56(aw0.a(N0().Z0, getViewLifecycleOwner().p(), l38Var), new vth(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a((fve) N0().b1.getValue(), getViewLifecycleOwner().p(), l38Var), new wth(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(N0().W0, getViewLifecycleOwner().p(), l38Var), new xth(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(N0().O0, 12), getViewLifecycleOwner().p(), l38Var), new yth(null, this), 1), getViewLifecycleScope());
        gw0.w(new g56(aw0.a(new d53(N0().d1, 12), getViewLifecycleOwner().p(), l38Var), new zth(null, this), 1), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final i6c z0() {
        return new gk2(this, 2);
    }

    public /* synthetic */ WebAppRootScreen(Bundle bundle, int i, tk4 tk4Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public WebAppRootScreen(Bundle bundle) {
        super(bundle);
        Class<Long> cls = Long.class;
        this.w0 = new hs(cls, "web_root_screen:source_id");
        this.x0 = new hs(cls, "web_root_screen:bot_id");
        this.y0 = new hs(ukh.class, "web_root_screen:entry_point");
        this.z0 = new hs(String.class, "web_root_screen:start_param");
        this.A0 = new hs(Boolean.class, Boolean.FALSE, "web_root_screen:is_fullscreen");
        this.B0 = new hs(Integer.class, 0, "web_root_screen.request_code.key");
        this.C0 = WebAppRootScreen.class.getName();
        this.D0 = createViewModelLazy(uvh.class, new uif(12, new rth(this, 0)));
        this.F0 = new ka5(new q8g(28), new sxa(0, this, WebAppRootScreen.class, "buildScreenParams", "buildScreenParams()Lone/me/sdk/statistics/params/Params;", 0, 11), 4);
        kph kphVar = kph.a;
        this.G0 = kphVar.getAccessor().d(111);
        this.H0 = kphVar.getAccessor().d(10);
        this.I0 = kphVar.getAccessor().d(48);
        this.J0 = kphVar.getAccessor().d(151);
        this.K0 = kphVar.getAccessor().d(81);
        this.L0 = c7j.c();
        this.M0 = viewBinding(hgb.m);
        this.N0 = ipi.b(3, new rth(this, 1));
        this.O0 = viewBinding(hgb.l);
    }

    public /* synthetic */ WebAppRootScreen(long j, ukh ukhVar, Long l, String str, boolean z, int i, int i2, tk4 tk4Var) {
        this(j, ukhVar, (i2 & 4) != 0 ? null : l, (i2 & 8) != 0 ? null : str, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? 0 : i);
    }

    public WebAppRootScreen(long j, ukh ukhVar, Long l, String str, boolean z, int i) {
        this(gwi.b(new imb("web_root_screen:bot_id", Long.valueOf(j)), new imb("web_root_screen:entry_point", ukhVar), new imb("web_root_screen:source_id", l), new imb("web_root_screen:start_param", str), new imb("web_root_screen:is_fullscreen", Boolean.valueOf(z)), new imb("web_root_screen.request_code.key", Integer.valueOf(i))));
    }
}
