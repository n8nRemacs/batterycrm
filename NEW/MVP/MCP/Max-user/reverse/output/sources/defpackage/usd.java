package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Provider;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class usd implements tf9, zua, gu3, pkf, Provider, tm6, h8, yu, rn6, Loggable {
    public static usd c;
    public static final vsd d = new vsd(0, 0, 0, false, false);
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ usd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.f3a c(org.json.JSONObject r16, defpackage.fje r17) throws org.json.JSONException, java.lang.NumberFormatException {
        /*
            r0 = r16
            java.lang.String r1 = "movieId"
            long r1 = r0.getLong(r1)
            java.lang.String r3 = "initiatorId"
            java.lang.String r3 = r0.getString(r3)
            ti1 r3 = defpackage.ti1.a(r3)
            java.lang.String r4 = "title"
            java.lang.String r8 = r0.getString(r4)
            java.lang.String r4 = "source"
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = "MOVIE"
            boolean r5 = r4.equals(r5)
            r6 = 0
            if (r5 == 0) goto L2b
            d3a r4 = defpackage.d3a.a
        L29:
            r9 = r4
            goto L37
        L2b:
            java.lang.String r5 = "STREAM"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L36
            d3a r4 = defpackage.d3a.b
            goto L29
        L36:
            r9 = r6
        L37:
            if (r9 != 0) goto L3a
            return r6
        L3a:
            java.lang.String r4 = "externalMovieId"
            java.lang.String r7 = r0.getString(r4)
            java.lang.String r4 = "duration"
            long r4 = r0.optLong(r4)
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L50
            w2a r4 = defpackage.w2a.a
            r10 = r4
            goto L58
        L50:
            x2a r6 = new x2a
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r6.<init>(r4)
            r10 = r6
        L58:
            f3a r4 = new f3a
            v2a r5 = new v2a
            y2a r6 = new y2a
            r6.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "thumbnails"
            org.json.JSONArray r0 = r0.optJSONArray(r2)
            if (r0 == 0) goto L9a
            int r2 = r0.length()
            r11 = 0
        L73:
            if (r11 >= r2) goto L9a
            org.json.JSONObject r12 = r0.getJSONObject(r11)
            j3a r13 = new j3a
            java.lang.String r14 = "url"
            java.lang.String r14 = r12.optString(r14)
            java.lang.String r15 = "width"
            int r15 = r12.optInt(r15)
            r16 = r0
            java.lang.String r0 = "height"
            int r0 = r12.optInt(r0)
            r13.<init>(r14, r15, r0)
            r1.add(r13)
            int r11 = r11 + 1
            r0 = r16
            goto L73
        L9a:
            k3a r11 = new k3a
            r11.<init>(r1)
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r17
            r4.<init>(r3, r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usd.c(org.json.JSONObject, fje):f3a");
    }

    public static i3a d(JSONObject jSONObject) throws JSONException, NumberFormatException {
        long j = jSONObject.getLong("movieId");
        ti1 ti1VarA = ti1.a(jSONObject.getString("initiatorId"));
        String string = jSONObject.getString("source");
        d3a d3aVar = string.equals("MOVIE") ? d3a.a : string.equals("STREAM") ? d3a.b : null;
        if (d3aVar == null) {
            return null;
        }
        Integer numValueOf = jSONObject.has("roomId") ? Integer.valueOf(jSONObject.optInt("roomId")) : null;
        return new i3a(ti1VarA, numValueOf != null ? new eje(numValueOf.intValue()) : dje.a, new y2a(j), d3aVar);
    }

    public static synchronized usd h() {
        try {
            if (c == null) {
                c = new usd(0, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static boolean m(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String v(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // defpackage.zua
    public g4i I(View view, g4i g4iVar) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i;
        boolean z;
        boolean z2;
        switch (this.a) {
            case 2:
                int iD = g4iVar.d();
                ho hoVar = (ho) this.b;
                Context context = hoVar.u0;
                int iD2 = g4iVar.d();
                ActionBarContextView actionBarContextView = hoVar.F0;
                if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    i = 0;
                    z = false;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hoVar.F0.getLayoutParams();
                    if (hoVar.F0.isShown()) {
                        if (hoVar.m1 == null) {
                            hoVar.m1 = new Rect();
                            hoVar.n1 = new Rect();
                        }
                        Rect rect = hoVar.m1;
                        Rect rect2 = hoVar.n1;
                        rect.set(g4iVar.b(), g4iVar.d(), g4iVar.c(), g4iVar.a());
                        ViewGroup viewGroup = hoVar.K0;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z3 = whh.a;
                            uhh.a(viewGroup, rect, rect2);
                        } else {
                            if (!whh.a) {
                                whh.a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    whh.b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        whh.b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                            Method method = whh.b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception e) {
                                    Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                                }
                            }
                        }
                        int i2 = rect.top;
                        int i3 = rect.left;
                        int i4 = rect.right;
                        ViewGroup viewGroup2 = hoVar.K0;
                        WeakHashMap weakHashMap = hfh.a;
                        g4i g4iVarA = weh.a(viewGroup2);
                        int iB = g4iVarA == null ? 0 : g4iVarA.b();
                        int iC = g4iVarA == null ? 0 : g4iVarA.c();
                        if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                            z2 = false;
                        } else {
                            marginLayoutParams.topMargin = i2;
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i4;
                            z2 = true;
                        }
                        if (i2 <= 0 || hoVar.M0 != null) {
                            View view2 = hoVar.M0;
                            if (view2 != null) {
                                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                                int i5 = marginLayoutParams2.height;
                                int i6 = marginLayoutParams.topMargin;
                                if (i5 != i6 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                                    marginLayoutParams2.height = i6;
                                    marginLayoutParams2.leftMargin = iB;
                                    marginLayoutParams2.rightMargin = iC;
                                    hoVar.M0.setLayoutParams(marginLayoutParams2);
                                }
                            }
                        } else {
                            View view3 = new View(context);
                            hoVar.M0 = view3;
                            view3.setVisibility(8);
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                            layoutParams.leftMargin = iB;
                            layoutParams.rightMargin = iC;
                            hoVar.K0.addView(hoVar.M0, -1, layoutParams);
                        }
                        View view4 = hoVar.M0;
                        z = view4 != null;
                        if (z && view4.getVisibility() != 0) {
                            View view5 = hoVar.M0;
                            view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? s34.a(context, rvc.abc_decor_view_status_guard_light) : s34.a(context, rvc.abc_decor_view_status_guard));
                        }
                        if (!hoVar.R0 && z) {
                            iD2 = 0;
                        }
                        z = z;
                        i = 0;
                        z = z2;
                    } else {
                        i = 0;
                        if (marginLayoutParams.topMargin != 0) {
                            marginLayoutParams.topMargin = 0;
                            z = false;
                        } else {
                            z = false;
                            z = false;
                        }
                    }
                    if (z) {
                        hoVar.F0.setLayoutParams(marginLayoutParams);
                    }
                }
                View view6 = hoVar.M0;
                if (view6 != null) {
                    view6.setVisibility(z ? i : 8);
                }
                return hfh.i(view, iD != iD2 ? g4iVar.f(g4iVar.b(), iD2, g4iVar.c(), g4iVar.a()) : g4iVar);
            default:
                re3 re3Var = (re3) this.b;
                WeakHashMap weakHashMap2 = hfh.a;
                g4i g4iVar2 = re3Var.getFitsSystemWindows() ? g4iVar : null;
                if (!Objects.equals(re3Var.N0, g4iVar2)) {
                    re3Var.N0 = g4iVar2;
                    re3Var.requestLayout();
                }
                return g4iVar.a.c();
        }
    }

    @Override // defpackage.rn6, defpackage.v2f
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.gu3
    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        z72 z72Var = (z72) this.b;
        wqi.e(z72Var.Y, "onUploadFailed: failed", th);
        a3g a3gVarQ = z72Var.q();
        long j = z72Var.b;
        a3gVarQ.d(j);
        z72Var.w();
        z72Var.v();
        z72Var.r().c(new rj0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pzf("internal-error", th.toString(), null)));
    }

    @Override // defpackage.tm6
    public Object apply(Object obj) {
        y25 y25Var = (y25) this.b;
        return new kk3(2, new k35((m35) obj, y25Var.a, y25Var.b));
    }

    @Override // defpackage.tf9
    public boolean b(vf9 vf9Var, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        k7 k7Var = ((ActionMenuView) this.b).y0;
        if (k7Var != null) {
            Toolbar toolbar = (Toolbar) ((n4e) k7Var).a;
            Iterator it = ((CopyOnWriteArrayList) toolbar.T0.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    zbg zbgVar = toolbar.V0;
                    zOnMenuItemClick = zbgVar != null ? zbgVar.onMenuItemClick(menuItem) : false;
                } else if (((ki6) it.next()).a.p(menuItem)) {
                    zOnMenuItemClick = true;
                    break;
                }
            }
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.h8
    public void e(Object obj) {
        g8 g8Var = (g8) obj;
        c cVar = (c) this.b;
        oi6 oi6Var = (oi6) cVar.F.pollLast();
        if (oi6Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = oi6Var.a;
        int i = oi6Var.b;
        a aVarC = cVar.c.c(str);
        if (aVarC != null) {
            aVarC.J(i, g8Var.a, g8Var.b);
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.tf9
    public void f(vf9 vf9Var) {
        tf9 tf9Var = ((ActionMenuView) this.b).t0;
        if (tf9Var != null) {
            tf9Var.f(vf9Var);
        }
    }

    public boolean g(String str) {
        String strL = l(str);
        return "1".equals(strL) || Boolean.parseBoolean(strL);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return ((cm6) this.b).invoke();
    }

    public Integer i(String str) {
        String strL = l(str);
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strL));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + v(str) + "(" + strL + ") into an int");
            return null;
        }
    }

    public JSONArray j(String str) {
        String strL = l(str);
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        try {
            return new JSONArray(strL);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + v(str) + ": " + strL + ", falling back to default");
            return null;
        }
    }

    public String k(Resources resources, String str, String str2) {
        String[] strArr;
        String strL = l(str2);
        if (!TextUtils.isEmpty(strL)) {
            return strL;
        }
        String strL2 = l(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strL2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strL2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", v(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayJ = j(str2.concat("_loc_args"));
        if (jSONArrayJ == null) {
            strArr = null;
        } else {
            int length = jSONArrayJ.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayJ.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + v(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String l(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Override // defpackage.pkf
    public Object n(int i) {
        if (i >= 0) {
            return (CharSequence) ((em6) this.b).invoke(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.ha8 o(defpackage.w69 r8, defpackage.u69 r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usd.o(w69, u69, java.util.List):ha8");
    }

    @Override // defpackage.rn6
    public void onFailure(Throwable th) throws Exception {
        ((jf7) this.b).close();
    }

    @Override // org.webrtc.Loggable
    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        y6d y6dVar;
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference == null || str == null || str2 == null || (y6dVar = (y6d) weakReference.get()) == null) {
            return;
        }
        y6dVar.log(str2, str);
    }

    public void p(long j, boolean z) {
        CallHistoryPageScreen callHistoryPageScreen = (CallHistoryPageScreen) this.b;
        v17 v17Var = CallHistoryPageScreen.u0;
        pa1 pa1VarB0 = callHistoryPageScreen.B0();
        tx1 tx1Var = tx1.HISTORY;
        final o37 o37VarT = pa1VarB0.t(j);
        if (o37VarT != null) {
            final int i = 0;
            final int i2 = 1;
            if (o37VarT instanceof m37) {
                pa1VarB0.c.l(((m37) o37VarT).a, z, new na1(i, o37VarT, z));
                pa1VarB0.u().f = 1;
                pa1VarB0.u().d = rx1.a;
                pa1VarB0.u().i(tx1Var, z);
                return;
            }
            if (o37VarT instanceof k37) {
                k37 k37Var = (k37) o37VarT;
                if (k37Var.c) {
                    pa1VarB0.c.j(k37Var.e, true, z, false, new cm6() { // from class: oa1
                        @Override // defpackage.cm6
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    ca1.c.p0().b(":call-join-link?link=".concat(((k37) o37VarT).e), null);
                                    break;
                                default:
                                    ca1.c.p0().b(":call-join-link?link=".concat(((l37) o37VarT).a), null);
                                    break;
                            }
                            return qqg.a;
                        }
                    });
                    yx1 yx1VarU = pa1VarB0.u();
                    String strValueOf = String.valueOf(j);
                    yx1VarU.getClass();
                    yx1.d(yx1VarU, "GROUP_CALL_JOIN", strValueOf, null, null, null, null, true, 116);
                    return;
                }
            }
            if (o37VarT instanceof l37) {
                pa1VarB0.c.j(((l37) o37VarT).a, true, z, false, new cm6() { // from class: oa1
                    @Override // defpackage.cm6
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                ca1.c.p0().b(":call-join-link?link=".concat(((k37) o37VarT).e), null);
                                break;
                            default:
                                ca1.c.p0().b(":call-join-link?link=".concat(((l37) o37VarT).a), null);
                                break;
                        }
                        return qqg.a;
                    }
                });
                pa1VarB0.u().f = 1;
                pa1VarB0.u().d = rx1.c;
                pa1VarB0.u().i(tx1Var, z);
            }
        }
    }

    public Bundle q() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // defpackage.pkf
    public jkf r(ViewGroup viewGroup) {
        return new r24(new AppCompatTextView(viewGroup.getContext(), null));
    }

    public List s(JSONObject jSONObject, fje fjeVar) {
        f3a f3aVarC;
        v2a v2aVar;
        y6d y6dVar = (y6d) this.b;
        hd5 hd5Var = hd5.a;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("movieShareInfos");
            if (jSONArrayOptJSONArray == null) {
                return hd5Var;
            }
            ArrayList arrayList = new ArrayList();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                try {
                    f3aVarC = c(jSONArrayOptJSONArray.getJSONObject(i), fjeVar);
                } catch (Throwable th) {
                    y6dVar.logException("VideoStreamsParser", "Can't parse movie", th);
                    f3aVarC = null;
                }
                if (f3aVarC != null && (v2aVar = f3aVarC.c) != null) {
                    arrayList.add(v2aVar);
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            y6dVar.logException("VideoStreamsParser", "Can't parse movies", th2);
            return hd5Var;
        }
    }

    @Override // defpackage.pkf
    public void t(jkf jkfVar, int i) {
        ((r24) jkfVar).d.setText((CharSequence) n(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9 A[LOOP:0: B:3:0x0006->B:24:0x00b9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00bf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u(java.nio.ByteBuffer r9, defpackage.bj r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            qb3 r0 = (defpackage.qb3) r0
            bh8 r1 = r0.e
        L6:
            int r2 = r9.remaining()
            if (r2 <= 0) goto Lbf
            btc r2 = r0.a(r9)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            java.lang.Object r3 = r10.c     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            java.time.Instant r3 = (java.time.Instant) r3     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            int r4 = r10.b     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            r1.received(r3, r4, r2)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            int r3 = r9.position()     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            int r4 = r9.remaining()     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            r5.<init>()     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            java.lang.String r6 = "Parsed packet with size "
            r5.append(r6)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            r5.append(r3)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            java.lang.String r3 = "; "
            r5.append(r3)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            r5.append(r4)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            java.lang.String r3 = " bytes left."
            r5.append(r3)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            java.lang.String r3 = r5.toString()     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            r1.debug(r3)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            zsc r3 = r0.d     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            bj r4 = new bj     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            boolean r5 = r9.hasRemaining()     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            r4.<init>(r10, r5)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            r3.h(r2, r4)     // Catch: tech.kwik.core.crypto.MissingKeysException -> L51 tech.kwik.core.impl.DecryptionException -> L53 tech.kwik.core.impl.InvalidPacketException -> L55
            goto Lb2
        L51:
            r2 = move-exception
            goto L5b
        L53:
            r2 = move-exception
            goto L5b
        L55:
            java.lang.String r9 = "Dropping invalid packet"
            r1.debug(r9)
            goto Lbf
        L5b:
            int r3 = r9.position()
            if (r3 != 0) goto L65
            int r3 = r9.remaining()
        L65:
            java.util.function.BiFunction r4 = r0.g
            java.lang.Object r4 = r4.apply(r9, r2)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto Lb2
            boolean r4 = r2 instanceof tech.kwik.core.crypto.MissingKeysException
            java.lang.String r5 = ")"
            java.lang.String r6 = " bytes) that cannot be decrypted ("
            java.lang.String r7 = "Discarding packet ("
            if (r4 == 0) goto L9a
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            r1.warn(r2)
            goto Lb2
        L9a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r7)
            r4.append(r3)
            r4.append(r6)
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = r4.toString()
            r1.error(r2)
        Lb2:
            int r2 = r9.position()
            if (r2 != 0) goto Lb9
            goto Lbf
        Lb9:
            java.nio.ByteBuffer r9 = r9.slice()
            goto L6
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.usd.u(java.nio.ByteBuffer, bj):void");
    }

    public /* synthetic */ usd(int i, boolean z) {
        this.a = i;
    }

    public usd(kb7 kb7Var) {
        this.a = 8;
        s5j.g(kb7Var);
        this.b = kb7Var;
    }

    public usd(int i) {
        this.a = i;
        switch (i) {
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                this.b = guf.h(Looper.getMainLooper());
                break;
            case 21:
                this.b = new bwf(new i77(18));
                break;
            default:
                long j = 0;
                this.b = new AtomicLong((j & 4294967295L) | (j << 32));
                break;
        }
    }

    @Override // defpackage.tm6
    public ha8 apply(Object obj) {
        return wsf.f(((dn6) this.b).apply(obj));
    }

    public usd(Bundle bundle) {
        this.a = 27;
        this.b = new Bundle(bundle);
    }
}
