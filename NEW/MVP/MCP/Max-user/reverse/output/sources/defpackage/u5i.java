package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.video.internal.encoder.EncodeException;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CancellationException;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class u5i implements rm, ll, vm, gu3, n8e, ke5, qp5, rn6, cbb, t2g {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ u5i(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.cbb
    public void J(CharSequence charSequence) {
        cbb cbbVar = ((tfb) ((ufb) this.c)).a;
        if (cbbVar != null) {
            cbbVar.J(charSequence);
        }
    }

    @Override // defpackage.rn6, defpackage.v2f
    public void a(Object obj) {
        wsf.h((ha8) this.a, (tu1) this.b);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    @Override // defpackage.cbb
    public void a0() {
        int iIntValue;
        int iIntValue2;
        wfb wfbVar = (wfb) this.b;
        if (wfbVar != null) {
            yfb yfbVar = wfbVar.a;
            yfbVar.F0 = false;
            TextView textView = yfbVar.t0;
            int iOrdinal = yfbVar.getForm().ordinal();
            if (iOrdinal == 0) {
                imb actionsHorizontalPadding = yfbVar.getActionsHorizontalPadding();
                iIntValue = actionsHorizontalPadding != null ? ((Number) actionsHorizontalPadding.a).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density);
            } else if (iOrdinal == 1) {
                imb actionsHorizontalPadding2 = yfbVar.getActionsHorizontalPadding();
                iIntValue = actionsHorizontalPadding2 != null ? ((Number) actionsHorizontalPadding2.a).intValue() : kti.d(16 * vw4.d().getDisplayMetrics().density);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imb actionsHorizontalPadding3 = yfbVar.getActionsHorizontalPadding();
                iIntValue = actionsHorizontalPadding3 != null ? ((Number) actionsHorizontalPadding3.a).intValue() : kti.d(4 * vw4.d().getDisplayMetrics().density);
            }
            int iOrdinal2 = yfbVar.getForm().ordinal();
            if (iOrdinal2 == 0) {
                imb actionsHorizontalPadding4 = yfbVar.getActionsHorizontalPadding();
                iIntValue2 = actionsHorizontalPadding4 != null ? ((Number) actionsHorizontalPadding4.b).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density);
            } else if (iOrdinal2 == 1) {
                imb actionsHorizontalPadding5 = yfbVar.getActionsHorizontalPadding();
                iIntValue2 = actionsHorizontalPadding5 != null ? ((Number) actionsHorizontalPadding5.b).intValue() : kti.d(12 * vw4.d().getDisplayMetrics().density);
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                imb actionsHorizontalPadding6 = yfbVar.getActionsHorizontalPadding();
                iIntValue2 = actionsHorizontalPadding6 != null ? ((Number) actionsHorizontalPadding6.b).intValue() : kti.d(4 * vw4.d().getDisplayMetrics().density);
            }
            yfbVar.setPadding(iIntValue, yfbVar.getPaddingTop(), iIntValue2, yfbVar.getPaddingBottom());
            View view = yfbVar.B0;
            if (view instanceof fbb) {
                if (view != null) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMarginEnd(kti.d(12 * vw4.d().getDisplayMetrics().density));
                    view.setLayoutParams(marginLayoutParams);
                }
                View view2 = yfbVar.A0;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                View view3 = yfbVar.C0;
                if (view3 != null) {
                    view3.setVisibility(0);
                }
            }
            View view4 = yfbVar.C0;
            if (view4 instanceof fbb) {
                if (view4 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                    if (layoutParams2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMarginEnd(kti.d(12 * vw4.d().getDisplayMetrics().density));
                    view4.setLayoutParams(marginLayoutParams2);
                }
                View view5 = yfbVar.A0;
                if (view5 != null) {
                    view5.setVisibility(0);
                }
                View view6 = yfbVar.B0;
                if (view6 != null) {
                    view6.setVisibility(0);
                }
            }
            textView.setVisibility(0);
            textView.setWidth(textView.getMeasuredWidth());
            ?? r2 = yfbVar.u0;
            if (r2.e()) {
                iwe iweVar = (iwe) r2.getValue();
                boolean z = iweVar.getVisibility() == 0;
                boolean z2 = yfbVar.E0;
                if (z != z2) {
                    iweVar.setVisibility(z2 ? 0 : 8);
                    xfb xfbVar = yfbVar.s0;
                    yy7 yy7Var = yfb.J0[5];
                    boolean zBooleanValue = ((Boolean) xfbVar.b).booleanValue();
                    ewe eweVar = iweVar.b;
                    if (zBooleanValue) {
                        iweVar.c = true;
                        if (zBooleanValue) {
                            eweVar.c();
                        }
                    } else {
                        eweVar.d();
                        iweVar.c = false;
                        iweVar.invalidate();
                    }
                    yfbVar.m();
                }
            }
            ?? r22 = yfbVar.v0;
            if (r22.e()) {
                ((uxa) r22.getValue()).setVisibility(0);
            }
            ?? r23 = yfbVar.w0;
            if (r23.e()) {
                ((ImageView) r23.getValue()).setVisibility(0);
            }
            OneMeButton oneMeButton = yfbVar.z0;
            if (oneMeButton != null) {
                oneMeButton.setVisibility(0);
            }
        }
        ((tfb) ((ufb) this.c)).a.a0();
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        wqi.c(q05.i, "MsgGetCmd success", new Object[0]);
        ((q05) this.a).c((pb2) this.b, (kfe) this.c);
    }

    @Override // defpackage.n8e
    public void b(y9g y9gVar, jp5 jp5Var, mjg mjgVar) {
        this.b = y9gVar;
        mjgVar.a();
        mjgVar.b();
        rfg rfgVarB = jp5Var.B(mjgVar.e, 5);
        this.c = rfgVarB;
        rfgVarB.d((gf6) this.a);
    }

    @Override // defpackage.n8e
    public void d(qyg qygVar) {
        long jC;
        long j;
        fsi.e((y9g) this.b);
        int i = xxg.a;
        y9g y9gVar = (y9g) this.b;
        synchronized (y9gVar) {
            try {
                long j2 = y9gVar.c;
                jC = j2 != -9223372036854775807L ? j2 + y9gVar.b : y9gVar.c();
            } finally {
            }
        }
        y9g y9gVar2 = (y9g) this.b;
        synchronized (y9gVar2) {
            j = y9gVar2.b;
        }
        if (jC == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        gf6 gf6Var = (gf6) this.a;
        if (j != gf6Var.z0) {
            ef6 ef6VarA = gf6Var.a();
            ef6VarA.o = j;
            gf6 gf6Var2 = new gf6(ef6VarA);
            this.a = gf6Var2;
            ((rfg) this.c).d(gf6Var2);
        }
        int iC = qygVar.c();
        ((rfg) this.c).c(iC, qygVar);
        ((rfg) this.c).b(jC, 1, iC, 0, null);
    }

    @Override // defpackage.cbb
    public void e() {
        wfb wfbVar;
        if (((fbb) this.a).v0 && (wfbVar = (wfb) this.b) != null) {
            wfbVar.a.g();
        }
        ((tfb) ((ufb) this.c)).a.e();
    }

    @Override // defpackage.ke5
    public void f(EncodeException encodeException) {
        ((tu1) this.a).d(encodeException);
    }

    public void g(gud gudVar) {
        ((Handler) this.c).post(new mp5(this, gudVar, 1));
    }

    @Override // javax.inject.Provider
    public Object get() {
        return new st7((Context) ((Provider) this.a).get(), (ri5) ((Provider) this.b).get(), (ib0) ((mni) this.c).get());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0001, B:5:0x0017, B:10:0x0021, B:12:0x002f, B:15:0x0036, B:18:0x003e, B:11:0x002d), top: B:23:0x0001 }] */
    @Override // defpackage.rm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.qm getSessionInfo() {
        /*
            r6 = this;
            r0 = 0
            java.lang.Object r1 = r6.a     // Catch: java.lang.Throwable -> L59
            k18 r1 = (defpackage.k18) r1     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L59
            pb3 r1 = (defpackage.pb3) r1     // Catch: java.lang.Throwable -> L59
            w4e r1 = (defpackage.w4e) r1     // Catch: java.lang.Throwable -> L59
            n18 r1 = r1.g     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = "user.callSession"
            java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Throwable -> L59
            if (r1 == 0) goto L2d
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L59
            if (r2 <= 0) goto L1e
            goto L1f
        L1e:
            r1 = r0
        L1f:
            if (r1 == 0) goto L2d
            java.lang.String r2 = ","
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L59
            r3 = 6
            java.util.List r1 = defpackage.vmf.S(r1, r2, r3)     // Catch: java.lang.Throwable -> L59
            goto L2f
        L2d:
            hd5 r1 = defpackage.hd5.a     // Catch: java.lang.Throwable -> L59
        L2f:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L36
            goto L3d
        L36:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L59
            r3 = 3
            if (r2 >= r3) goto L3e
        L3d:
            return r0
        L3e:
            qm r2 = new qm     // Catch: java.lang.Throwable -> L59
            r3 = 0
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L59
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L59
            r4 = 1
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> L59
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L59
            r5 = 2
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L59
            r2.<init>(r3, r4, r1)     // Catch: java.lang.Throwable -> L59
            return r2
        L59:
            r1 = move-exception
            java.lang.String r2 = "OKConfigStoreTag"
            java.lang.String r3 = "Call session info cache error: "
            defpackage.wqi.b(r2, r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u5i.getSessionInfo():qm");
    }

    @Override // defpackage.vm
    public um h() throws Throwable {
        k18 k18Var = (k18) this.a;
        String strP = ((w4e) ((pb3) k18Var.getValue())).p();
        if (strP == null || vmf.F(strP)) {
            svi.g(bd5.a, new f51(this, null));
        }
        String strP2 = ((w4e) ((pb3) k18Var.getValue())).p();
        l5c l5cVar = (l5c) ((age) ((k18) this.b).getValue());
        l5cVar.getClass();
        String strT = l5cVar.t(PmsKey.f15callsendpoint, null);
        if (strT == null) {
            strT = "";
        }
        return new um(strP2, strT);
    }

    public ArrayList i(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
        dsd dsdVarC = dsd.c(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            dsdVarC.S(1);
        } else {
            dsdVarC.f(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorN = workDatabase_Impl.n(dsdVarC);
        try {
            ArrayList arrayList = new ArrayList(cursorN.getCount());
            while (cursorN.moveToNext()) {
                arrayList.add(cursorN.isNull(0) ? null : cursorN.getString(0));
            }
            return arrayList;
        } finally {
            cursorN.close();
            dsdVarC.y();
        }
    }

    public boolean j() throws IOException {
        String strTrim;
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (((String) this.c) == null) {
            if (!arrayDeque.isEmpty()) {
                String str = (String) arrayDeque.poll();
                str.getClass();
                this.c = str;
                return true;
            }
            do {
                String line = ((BufferedReader) this.a).readLine();
                this.c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.c = strTrim;
            } while (strTrim.isEmpty());
        }
        return true;
    }

    public void k(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            t5i t5iVar = new t5i((String) it.next(), str);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.a;
            workDatabase_Impl.b();
            workDatabase_Impl.c();
            try {
                ((cwg) this.b).B(t5iVar);
                workDatabase_Impl.q();
            } finally {
                workDatabase_Impl.k();
            }
        }
    }

    @Override // defpackage.ke5
    public void l() {
        ((tu1) this.a).b(null);
    }

    @Override // defpackage.cbb
    public void m() {
        wfb wfbVar;
        if (((fbb) this.a).v0 && (wfbVar = (wfb) this.b) != null) {
            wfbVar.a.g();
        }
        ((tfb) ((ufb) this.c)).a.m();
    }

    public void n(Object obj) {
        ll3 ll3Var = (ll3) this.a;
        LinkedHashMap linkedHashMap = ll3Var.b;
        ArrayList arrayList = ll3Var.d;
        String str = (String) this.b;
        Object obj2 = linkedHashMap.get(str);
        j8 j8Var = (j8) this.c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + j8Var + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            ll3Var.b(iIntValue, j8Var, obj);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    @Override // defpackage.cbb
    public void o() {
        cbb cbbVar = ((tfb) ((ufb) this.c)).a;
        if (cbbVar != null) {
            cbbVar.o();
        }
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) {
        tu1 tu1Var = (tu1) this.b;
        if (th instanceof CancellationException) {
            z5j.f(null, tu1Var.d(new ksf(ho7.l(new StringBuilder(), (String) this.c, " cancelled."), th)));
        } else {
            tu1Var.b(null);
        }
    }

    public String p() {
        if (!j()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public synchronized void q(gu0 gu0Var) {
        try {
            gu0 gu0Var2 = gu0Var.a;
            gu0 gu0Var3 = gu0Var.d;
            if (gu0Var2 != null) {
                gu0Var2.d = gu0Var3;
            }
            if (gu0Var3 != null) {
                gu0Var3.a = gu0Var2;
            }
            gu0Var.a = null;
            gu0Var.d = null;
            if (gu0Var == ((gu0) this.b)) {
                this.b = gu0Var3;
            }
            if (gu0Var == ((gu0) this.c)) {
                this.c = gu0Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void r() {
        Integer num;
        ll3 ll3Var = (ll3) this.a;
        String str = (String) this.b;
        Bundle bundle = ll3Var.g;
        LinkedHashMap linkedHashMap = ll3Var.f;
        if (!ll3Var.d.contains(str) && (num = (Integer) ll3Var.b.remove(str)) != null) {
            ll3Var.a.remove(num);
        }
        ll3Var.e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            StringBuilder sbN = az1.n("Dropping pending result for request ", str, ": ");
            sbN.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", sbN.toString());
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((g8) yvi.a(bundle, str, g8.class)));
            bundle.remove(str);
        }
        if (ll3Var.c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // defpackage.ke5
    public void s(zd5 zd5Var) throws Exception {
        boolean z;
        gb0 gb0Var = (gb0) this.b;
        bhd bhdVar = (bhd) this.c;
        if (bhdVar.B != null) {
            try {
                bhdVar.N(zd5Var, gb0Var);
                zd5Var.close();
                return;
            } catch (Throwable th) {
                try {
                    zd5Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (bhdVar.q) {
            gri.a("Recorder", "Drop video data since recording is stopping.");
            zd5Var.close();
            return;
        }
        zd5 zd5Var2 = bhdVar.T;
        if (zd5Var2 != null) {
            zd5Var2.close();
            bhdVar.T = null;
            z = true;
        } else {
            z = false;
        }
        if (!zd5Var.C()) {
            if (z) {
                gri.a("Recorder", "Dropped cached keyframe since we have new video data and have not yet received audio data.");
            }
            gri.a("Recorder", "Dropped video data since muxer has not yet started and data is not a keyframe.");
            bf5 bf5Var = bhdVar.E;
            bf5Var.h.execute(new ne5(bf5Var, 3));
            zd5Var.close();
            return;
        }
        bhdVar.T = zd5Var;
        if (!bhdVar.n() || !bhdVar.U.e()) {
            gri.a("Recorder", "Received video keyframe. Starting muxer...");
            bhdVar.F(gb0Var);
        } else if (z) {
            gri.a("Recorder", "Replaced cached video keyframe with newer keyframe.");
        } else {
            gri.a("Recorder", "Cached video keyframe while we wait for first audio sample before starting muxer.");
        }
    }

    @Override // defpackage.rm
    public void setSessionInfo(qm qmVar) {
        k18 k18Var = (k18) this.a;
        if (qmVar == null) {
            yw5 yw5Var = (yw5) ((w4e) ((pb3) k18Var.getValue())).g.edit();
            yw5Var.putString("user.callSession", ue3.N(hd5.a, ",", null, null, null, 62));
            yw5Var.apply();
            return;
        }
        pb3 pb3Var = (pb3) k18Var.getValue();
        ArrayList arrayListT = ys.t(new String[]{qmVar.a, qmVar.b, qmVar.c});
        yw5 yw5Var2 = (yw5) ((w4e) pb3Var).g.edit();
        yw5Var2.putString("user.callSession", ue3.N(arrayListT, ",", null, null, null, 62));
        yw5Var2.apply();
    }

    @Override // defpackage.ke5
    public void t(wo4 wo4Var) {
        ((bhd) this.c).F = wo4Var;
    }

    public u5i(String str) {
        ef6 ef6Var = new ef6();
        ef6Var.k = str;
        this.a = new gf6(ef6Var);
    }

    public u5i(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}
