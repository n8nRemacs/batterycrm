package com.my.target;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.my.target.C37780d;
import com.my.target.G;
import com.my.tracker.ads.AdFormat;
import e11.C39848C;
import e11.C39849D;
import e11.C39875i0;
import e11.C39877j;
import e11.C39903s;
import e11.C39924z;
import e11.N1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e1 implements G, C37780d.b {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final b1 f364812b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final C39849D f364813c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C37780d f364814d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final WeakReference<Activity> f364815e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final Context f364816f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final Handler f364817g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public final a f364818h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    public final C39875i0 f364819i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    public String f364820j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public Integer f364821k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public D f364822l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public B f364823m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    public G.a f364824n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public C39848C f364825o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f364826p;

    /* renamed from: q, reason: collision with root package name */
    public long f364827q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f364828r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f364829s;

    /* renamed from: t, reason: collision with root package name */
    public C39903s f364830t;

    public static class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final b1 f364831b;

        public a(@j.N b1 b1Var) {
            this.f364831b = b1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f364831b.setCloseVisible(true);
        }
    }

    public e1(@j.N Context context) {
        C37780d c37780d = new C37780d(AdFormat.INTERSTITIAL);
        Handler handler = new Handler(Looper.getMainLooper());
        b1 b1Var = new b1(context);
        this.f364829s = true;
        this.f364830t = new C39903s();
        this.f364814d = c37780d;
        this.f364816f = context.getApplicationContext();
        this.f364817g = handler;
        this.f364812b = b1Var;
        this.f364815e = context instanceof Activity ? new WeakReference<>((Activity) context) : new WeakReference<>(null);
        this.f364820j = "loading";
        this.f364813c = new C39849D();
        b1Var.setOnCloseListener(new com.my.target.ads.a(this, 17));
        this.f364818h = new a(b1Var);
        this.f364819i = new C39875i0(context);
        c37780d.f364781c = this;
    }

    @Override // com.my.target.C37780d.b
    public final void a(boolean z12) {
        this.f364814d.h(z12);
    }

    @Override // com.my.target.C37780d.b
    public final void b(@j.N Uri uri) {
        G.a aVar = this.f364824n;
        if (aVar != null) {
            aVar.f(this.f364825o, uri.toString(), this.f364812b.getContext());
        }
    }

    @Override // com.my.target.C37780d.b
    public final void c(@j.N JsResult jsResult) {
        jsResult.confirm();
    }

    @Override // com.my.target.C37780d.b
    public final void d(@j.N C37780d c37780d, @j.N WebView webView) {
        C39848C c39848c;
        B b12;
        this.f364820j = "default";
        l();
        ArrayList arrayList = new ArrayList();
        Activity activity = this.f364815e.get();
        boolean z12 = false;
        if ((activity == null || (b12 = this.f364823m) == null) ? false : C39924z.j(activity, b12)) {
            arrayList.add("'inlineVideo'");
        }
        arrayList.add("'vpaid'");
        c37780d.getClass();
        c37780d.f("mraidbridge.setSupports(" + TextUtils.join(",", arrayList) + ")");
        c37780d.f("mraidbridge.setPlacementType(" + JSONObject.quote(AdFormat.INTERSTITIAL) + ")");
        B b13 = c37780d.f364782d;
        if (b13 != null && b13.f364329d) {
            z12 = true;
        }
        c37780d.h(z12);
        this.f364820j = "default";
        this.f364814d.j("default");
        c37780d.f("mraidbridge.fireReadyEvent()");
        c37780d.e(this.f364813c);
        G.a aVar = this.f364824n;
        if (aVar == null || (c39848c = this.f364825o) == null) {
            return;
        }
        aVar.b(c39848c, this.f364812b);
        this.f364824n.a(webView);
    }

    @Override // com.my.target.i1
    public final void destroy() {
        this.f364817g.removeCallbacks(this.f364818h);
        if (!this.f364826p) {
            this.f364826p = true;
            B b12 = this.f364823m;
            if (b12 != null) {
                b12.c(true);
            }
        }
        b1 b1Var = this.f364812b;
        ViewParent parent = b1Var.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(b1Var);
        }
        this.f364814d.f364782d = null;
        B b13 = this.f364823m;
        if (b13 != null) {
            b13.a(0);
            this.f364823m = null;
        }
        b1Var.removeAllViews();
    }

    @Override // com.my.target.C37780d.b
    public final void e(@j.N ConsoleMessage consoleMessage) {
        consoleMessage.message();
    }

    @Override // com.my.target.G
    public final void f(@j.N C39848C c39848c) {
        this.f364825o = c39848c;
        long j12 = (long) (c39848c.f394742I * 1000.0f);
        this.f364827q = j12;
        b1 b1Var = this.f364812b;
        if (j12 > 0) {
            b1Var.setCloseVisible(false);
            long j13 = this.f364827q;
            Handler handler = this.f364817g;
            a aVar = this.f364818h;
            handler.removeCallbacks(aVar);
            System.currentTimeMillis();
            handler.postDelayed(aVar, j13);
        } else {
            b1Var.setCloseVisible(true);
        }
        String str = c39848c.f394290L;
        Context context = this.f364816f;
        if (str != null) {
            B b12 = new B(context);
            this.f364823m = b12;
            C37780d c37780d = this.f364814d;
            c37780d.c(b12);
            b1Var.addView(this.f364823m, new FrameLayout.LayoutParams(-1, -1));
            c37780d.k(str);
        }
        C37788h c37788h = c39848c.f394698D;
        C39875i0 c39875i0 = this.f364819i;
        if (c37788h == null) {
            c39875i0.setVisibility(8);
            return;
        }
        if (c39875i0.getParent() != null) {
            return;
        }
        int iC2 = C39924z.c(10, context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(iC2, iC2, iC2, iC2);
        b1Var.addView(c39875i0, layoutParams);
        c39875i0.setImageBitmap(c37788h.f364851a.a());
        c39875i0.setOnClickListener(new N1(this));
        ArrayList arrayList = c37788h.f364853c;
        if (arrayList == null) {
            return;
        }
        D d12 = new D(arrayList, new C39877j());
        this.f364822l = d12;
        d12.f364362e = new d1(this, c39848c);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    @Override // com.my.target.C37780d.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(boolean r5, e11.C39903s r6) {
        /*
            r4 = this;
            boolean r0 = r4.i(r6)
            r1 = 0
            java.lang.String r2 = "setOrientationProperties"
            com.my.target.d r3 = r4.f364814d
            if (r0 != 0) goto L1d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to force orientation to "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r3.g(r2, r5)
            return r1
        L1d:
            r4.f364829s = r5
            r4.f364830t = r6
            java.lang.String r5 = r6.f394778b
            java.lang.String r6 = "none"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L8c
            boolean r5 = r4.f364829s
            java.lang.ref.WeakReference<android.app.Activity> r6 = r4.f364815e
            r0 = 1
            if (r5 == 0) goto L4a
            java.lang.Object r5 = r6.get()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 == 0) goto L45
            java.lang.Integer r6 = r4.f364821k
            if (r6 == 0) goto L45
            int r6 = r6.intValue()
            r5.setRequestedOrientation(r6)
        L45:
            r5 = 0
            r4.f364821k = r5
            r1 = r0
            goto L94
        L4a:
            java.lang.Object r5 = r6.get()
            android.app.Activity r5 = (android.app.Activity) r5
            if (r5 != 0) goto L58
            java.lang.String r5 = "Unable to set MRAID expand orientation to 'none'; expected passed in Activity Context."
            r3.g(r2, r5)
            goto L94
        L58:
            int r6 = e11.C39924z.f394913b
            android.view.WindowManager r6 = r5.getWindowManager()
            android.view.Display r6 = r6.getDefaultDisplay()
            int r6 = r6.getRotation()
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            int r5 = r5.orientation
            r2 = 9
            r3 = 2
            if (r0 != r5) goto L7d
            if (r6 == r0) goto L7b
            if (r6 == r3) goto L7b
            r1 = r0
            goto L87
        L7b:
            r1 = r2
            goto L87
        L7d:
            if (r3 != r5) goto L7b
            if (r6 == r3) goto L85
            r5 = 3
            if (r6 == r5) goto L85
            goto L87
        L85:
            r1 = 8
        L87:
            boolean r1 = r4.j(r1)
            goto L94
        L8c:
            e11.s r5 = r4.f364830t
            int r5 = r5.f394777a
            boolean r1 = r4.j(r5)
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.target.e1.g(boolean, e11.s):boolean");
    }

    @Override // com.my.target.i1
    @j.P
    public final View getCloseButton() {
        return null;
    }

    @Override // com.my.target.G
    public final void h(@j.P G.a aVar) {
        this.f364824n = aVar;
    }

    @j.k0
    public final boolean i(C39903s c39903s) {
        if ("none".equals(c39903s.f394778b)) {
            return true;
        }
        Activity activity = this.f364815e.get();
        if (activity == null) {
            return false;
        }
        try {
            ActivityInfo activityInfo = activity.getPackageManager().getActivityInfo(new ComponentName(activity, activity.getClass()), 0);
            int i12 = activityInfo.screenOrientation;
            if (i12 != -1) {
                return i12 == c39903s.f394777a;
            }
            int i13 = activityInfo.configChanges;
            return ((i13 & 128) == 0 || (i13 & 1024) == 0) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @j.k0
    public final boolean j(int i12) {
        Activity activity = this.f364815e.get();
        if (activity != null && i(this.f364830t)) {
            if (this.f364821k == null) {
                this.f364821k = Integer.valueOf(activity.getRequestedOrientation());
            }
            activity.setRequestedOrientation(i12);
            return true;
        }
        this.f364814d.g("setOrientationProperties", "Attempted to lock orientation to unsupported value: " + this.f364830t.f394778b);
        return false;
    }

    @j.k0
    public final void k() {
        Integer num;
        if (this.f364823m == null || "loading".equals(this.f364820j) || HiddenParameter.TYPE.equals(this.f364820j)) {
            return;
        }
        Activity activity = this.f364815e.get();
        if (activity != null && (num = this.f364821k) != null) {
            activity.setRequestedOrientation(num.intValue());
        }
        this.f364821k = null;
        if ("default".equals(this.f364820j)) {
            this.f364812b.setVisibility(4);
            this.f364820j = HiddenParameter.TYPE;
            this.f364814d.j(HiddenParameter.TYPE);
            G.a aVar = this.f364824n;
            if (aVar != null) {
                aVar.a();
            }
        }
    }

    public final void l() {
        DisplayMetrics displayMetrics = this.f364816f.getResources().getDisplayMetrics();
        int i12 = displayMetrics.widthPixels;
        int i13 = displayMetrics.heightPixels;
        C39849D c39849d = this.f364813c;
        Rect rect = c39849d.f394296a;
        rect.set(0, 0, i12, i13);
        C39849D.a(rect, c39849d.f394297b);
        int i14 = displayMetrics.widthPixels;
        int i15 = displayMetrics.heightPixels;
        Rect rect2 = c39849d.f394300e;
        rect2.set(0, 0, i14, i15);
        C39849D.a(rect2, c39849d.f394301f);
        int i16 = displayMetrics.widthPixels;
        int i17 = displayMetrics.heightPixels;
        Rect rect3 = c39849d.f394298c;
        rect3.set(0, 0, i16, i17);
        C39849D.a(rect3, c39849d.f394299d);
        int i18 = displayMetrics.widthPixels;
        int i19 = displayMetrics.heightPixels;
        Rect rect4 = c39849d.f394302g;
        rect4.set(0, 0, i18, i19);
        C39849D.a(rect4, c39849d.f394303h);
    }

    @Override // com.my.target.C37780d.b
    public final boolean a(float f12, float f13) {
        G.a aVar;
        if (!this.f364828r) {
            this.f364814d.g("playheadEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        if (f12 < 0.0f || f13 < 0.0f || (aVar = this.f364824n) == null || this.f364825o == null) {
            return true;
        }
        aVar.e(f12, f13, this.f364816f);
        return true;
    }

    @Override // com.my.target.C37780d.b
    public final void c() {
        l();
    }

    @Override // com.my.target.C37780d.b
    public final boolean a(int i12, int i13, int i14, int i15, int i16, boolean z12) {
        return false;
    }

    @Override // com.my.target.i1
    @j.N
    public final View j() {
        return this.f364812b;
    }

    @Override // com.my.target.C37780d.b
    public final boolean a(@j.P Uri uri) {
        return false;
    }

    @Override // com.my.target.C37780d.b
    public final boolean a(@j.N String str) {
        if (!this.f364828r) {
            this.f364814d.g("vpaidEvent", "Calling VPAID command before VPAID init");
            return false;
        }
        G.a aVar = this.f364824n;
        boolean z12 = aVar != null;
        C39848C c39848c = this.f364825o;
        if ((c39848c != null) & z12) {
            aVar.g(c39848c, str, this.f364816f);
        }
        return true;
    }

    @Override // com.my.target.C37780d.b
    public final void g() {
        this.f364828r = true;
    }

    @Override // com.my.target.C37780d.b
    public final void d() {
        k();
    }

    @Override // com.my.target.C37780d.b
    public final boolean f() {
        return false;
    }
}
