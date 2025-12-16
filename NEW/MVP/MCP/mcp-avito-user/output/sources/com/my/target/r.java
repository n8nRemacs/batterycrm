package com.my.target;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.my.target.C37780d;
import com.my.target.C37799m0;
import com.my.target.C37818w0;
import com.my.target.V;
import com.my.target.b1;
import e11.C39849D;
import e11.C39856c;
import e11.C39865f;
import e11.C39885l1;
import e11.C39903s;
import e11.C39924z;
import e11.R1;
import e11.k2;
import e11.m2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class r implements a1, V.a {

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final C39856c f365083b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    public final Context f365084c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    public final C39849D f365085d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    public final b f365086e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    public final C37780d f365087f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    public final WeakReference<Activity> f365088g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    public String f365089h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    public C37780d f365090i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public B f365091j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    public C37799m0.b f365092k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    public C37799m0.d f365093l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    public e11.G0 f365094m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f365095n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    public b1 f365096o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    public V f365097p;

    /* renamed from: q, reason: collision with root package name */
    @j.P
    public final ViewGroup f365098q;

    /* renamed from: r, reason: collision with root package name */
    @j.P
    public f f365099r;

    /* renamed from: s, reason: collision with root package name */
    @j.P
    public B f365100s;

    /* renamed from: t, reason: collision with root package name */
    @j.P
    public Uri f365101t;

    public final class a implements View.OnLayoutChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C37780d f365102b;

        public a(C37780d c37780d) {
            this.f365102b = c37780d;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            r rVar = r.this;
            rVar.f365099r = null;
            rVar.h();
            this.f365102b.e(rVar.f365085d);
        }
    }

    public final class b implements b1.a {
        public b() {
        }

        @Override // com.my.target.b1.a
        public final void d() {
            V v12 = r.this.f365097p;
            if (v12 != null) {
                v12.dismiss();
            }
        }
    }

    public interface c {
    }

    public static final class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C37780d f365105b;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        public final e11.G0 f365106c;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        public final Context f365107d;

        /* renamed from: e, reason: collision with root package name */
        @j.N
        public final V f365108e;

        /* renamed from: f, reason: collision with root package name */
        @j.N
        public final Uri f365109f;

        public d(@j.N e11.G0 g02, @j.N V v12, @j.N Uri uri, @j.N C37780d c37780d, @j.N Context context) {
            this.f365106c = g02;
            this.f365107d = context.getApplicationContext();
            this.f365108e = v12;
            this.f365109f = uri;
            this.f365105b = c37780d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            C39885l1 c39885l1 = new C39885l1();
            c39885l1.b(this.f365109f.toString(), null, null, this.f365107d);
            m2.d(new com.vk.id.captcha.web.h(11, this, R1.a(this.f365106c.f394357I, (String) c39885l1.f394352c)));
        }
    }

    public final class e implements C37780d.b {

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final C37780d f365110b;

        public e(C37780d c37780d) {
            this.f365110b = c37780d;
        }

        @Override // com.my.target.C37780d.b
        public final void a(boolean z12) {
            if (!z12 || r.this.f365097p == null) {
                this.f365110b.h(z12);
            }
        }

        @Override // com.my.target.C37780d.b
        public final void b(@j.N Uri uri) {
            e11.G0 g02;
            r rVar = r.this;
            C37799m0.b bVar = rVar.f365092k;
            if (bVar == null || (g02 = rVar.f365094m) == null) {
                return;
            }
            bVar.c(g02, uri.toString());
        }

        @Override // com.my.target.C37780d.b
        public final void c(@j.N JsResult jsResult) {
            jsResult.confirm();
        }

        @Override // com.my.target.C37780d.b
        public final void d(@j.N C37780d c37780d, @j.N WebView webView) {
            C37818w0.a aVar;
            B b12;
            r rVar = r.this;
            C37780d c37780d2 = rVar.f365090i;
            ArrayList arrayList = new ArrayList();
            Activity activity = rVar.f365088g.get();
            boolean z12 = false;
            if ((activity == null || (b12 = rVar.f365091j) == null) ? false : C39924z.j(activity, b12)) {
                arrayList.add("'inlineVideo'");
            }
            arrayList.add("'vpaid'");
            c37780d.getClass();
            c37780d.f("mraidbridge.setSupports(" + TextUtils.join(",", arrayList) + ")");
            c37780d.f("mraidbridge.setPlacementType(" + JSONObject.quote("inline") + ")");
            B b13 = c37780d.f364782d;
            if (b13 != null && b13.f364329d) {
                z12 = true;
            }
            c37780d.h(z12);
            V v12 = rVar.f365097p;
            rVar.g((v12 == null || !v12.isShowing()) ? "default" : SearchParamsConverterKt.EXPANDED);
            c37780d.f("mraidbridge.fireReadyEvent()");
            if (c37780d != rVar.f365090i) {
                C37799m0.d dVar = rVar.f365093l;
                if (dVar != null && (aVar = dVar.f364942a.f364936k) != null) {
                    aVar.c();
                }
                C37799m0.b bVar = rVar.f365092k;
                if (bVar != null) {
                    bVar.a(webView);
                }
            }
        }

        @Override // com.my.target.C37780d.b
        public final void e(@j.N ConsoleMessage consoleMessage) {
            C37780d c37780d = r.this.f365090i;
            consoleMessage.message();
        }

        @Override // com.my.target.C37780d.b
        public final boolean f() {
            B b12;
            boolean zContains;
            Rect rect;
            r rVar = r.this;
            boolean zEquals = rVar.f365089h.equals("default");
            C37780d c37780d = this.f365110b;
            if (!zEquals) {
                c37780d.g("resize", "wrong state for resize " + rVar.f365089h);
                return false;
            }
            f fVar = rVar.f365099r;
            if (fVar == null) {
                c37780d.g("resize", "resize properties not set");
                return false;
            }
            ViewGroup viewGroup = rVar.f365098q;
            if (viewGroup == null || (b12 = rVar.f365091j) == null) {
                c37780d.g("resize", "views not initialized");
                return false;
            }
            fVar.f365120i = new Rect();
            fVar.f365121j = new Rect();
            if (!viewGroup.getGlobalVisibleRect(fVar.f365120i) || !b12.getGlobalVisibleRect(fVar.f365121j)) {
                c37780d.g("resize", "views not visible");
                return false;
            }
            b1 b1Var = new b1(rVar.f365084c);
            rVar.f365096o = b1Var;
            f fVar2 = rVar.f365099r;
            Rect rect2 = fVar2.f365121j;
            if (rect2 != null && (rect = fVar2.f365120i) != null) {
                int i12 = (rect2.top - rect.top) + fVar2.f365114c;
                fVar2.f365118g = i12;
                fVar2.f365119h = (rect2.left - rect.left) + fVar2.f365113b;
                if (!fVar2.f365112a) {
                    if (i12 + fVar2.f365116e > rect.height()) {
                        fVar2.f365118g = fVar2.f365120i.height() - fVar2.f365116e;
                    }
                    if (fVar2.f365119h + fVar2.f365115d > fVar2.f365120i.width()) {
                        fVar2.f365119h = fVar2.f365120i.width() - fVar2.f365115d;
                    }
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(fVar2.f365115d, fVar2.f365116e);
                layoutParams.topMargin = fVar2.f365118g;
                layoutParams.leftMargin = fVar2.f365119h;
                b1Var.setLayoutParams(layoutParams);
                b1Var.setCloseGravity(fVar2.f365117f);
            }
            f fVar3 = rVar.f365099r;
            b1 b1Var2 = rVar.f365096o;
            if (fVar3.f365120i == null) {
                zContains = false;
            } else {
                int i13 = fVar3.f365119h;
                int i14 = fVar3.f365118g;
                Rect rect3 = fVar3.f365120i;
                Rect rect4 = new Rect(i13, i14, rect3.right, rect3.bottom);
                int i15 = fVar3.f365119h;
                int i16 = fVar3.f365118g;
                Rect rect5 = new Rect(i15, i16, fVar3.f365115d + i15, fVar3.f365116e + i16);
                Rect rect6 = new Rect();
                int i17 = fVar3.f365117f;
                int i18 = b1Var2.f364719e;
                Gravity.apply(i17, i18, i18, rect5, rect6);
                zContains = rect4.contains(rect6);
            }
            if (!zContains) {
                c37780d.g("resize", "close button is out of visible range");
                rVar.f365096o = null;
                return false;
            }
            ViewGroup viewGroup2 = (ViewGroup) rVar.f365091j.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(rVar.f365091j);
            }
            rVar.f365096o.addView(rVar.f365091j, new FrameLayout.LayoutParams(-1, -1));
            rVar.f365096o.setOnCloseListener(new com.my.target.ads.a(this, 11));
            rVar.f365098q.addView(rVar.f365096o);
            rVar.g("resized");
            C37799m0.d dVar = rVar.f365093l;
            if (dVar == null) {
                return true;
            }
            dVar.b();
            return true;
        }

        @Override // com.my.target.C37780d.b
        public final boolean g(boolean z12, C39903s c39903s) {
            return false;
        }

        @Override // com.my.target.C37780d.b
        public final boolean a(float f12, float f13) {
            C37799m0.d dVar;
            r rVar = r.this;
            if (!rVar.f365095n) {
                this.f365110b.g("playheadEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            if (f12 < 0.0f || f13 < 0.0f || (dVar = rVar.f365093l) == null || rVar.f365094m == null) {
                return true;
            }
            ArrayList<C39865f> arrayList = dVar.f364942a.f364931f;
            if (arrayList.isEmpty()) {
                return true;
            }
            float f14 = f13 - f12;
            ArrayList arrayList2 = new ArrayList();
            Iterator<C39865f> it = arrayList.iterator();
            while (it.hasNext()) {
                C39865f next = it.next();
                float f15 = next.f394592d;
                if (f15 < 0.0f) {
                    float f16 = next.f394593e;
                    if (f16 >= 0.0f) {
                        f15 = (f13 / 100.0f) * f16;
                    }
                }
                if (f15 >= 0.0f && f15 <= f14) {
                    arrayList2.add(next);
                    it.remove();
                }
            }
            k2.a(rVar.f365084c, arrayList2);
            return true;
        }

        @Override // com.my.target.C37780d.b
        public final void c() {
        }

        @Override // com.my.target.C37780d.b
        public final void g() {
            r.this.f365095n = true;
        }

        @Override // com.my.target.C37780d.b
        public final boolean a(int i12, int i13, int i14, int i15, int i16, boolean z12) {
            f fVar = new f();
            r rVar = r.this;
            rVar.f365099r = fVar;
            ViewGroup viewGroup = rVar.f365098q;
            C37780d c37780d = this.f365110b;
            if (viewGroup == null) {
                c37780d.g("setResizeProperties", "container view for resize is not defined");
                rVar.f365099r = null;
                return false;
            }
            if (i12 < 50 || i13 < 50) {
                c37780d.g("setResizeProperties", "properties cannot be less than closeable container");
                rVar.f365099r = null;
                return false;
            }
            C39924z c39924z = new C39924z(rVar.f365084c);
            f fVar2 = rVar.f365099r;
            fVar2.f365112a = z12;
            int iA2 = c39924z.a(i12);
            int iA3 = c39924z.a(i13);
            int iA4 = c39924z.a(i14);
            int iA5 = c39924z.a(i15);
            fVar2.f365115d = iA2;
            fVar2.f365116e = iA3;
            fVar2.f365113b = iA4;
            fVar2.f365114c = iA5;
            fVar2.f365117f = i16;
            if (z12) {
                return true;
            }
            Rect rect = new Rect();
            rVar.f365098q.getGlobalVisibleRect(rect);
            f fVar3 = rVar.f365099r;
            if (fVar3.f365115d <= rect.width() && fVar3.f365116e <= rect.height()) {
                return true;
            }
            rect.width();
            rect.height();
            f fVar4 = rVar.f365099r;
            int i17 = fVar4.f365115d;
            int i18 = fVar4.f365116e;
            c37780d.g("setResizeProperties", "resize properties with allowOffscreen false out of viewport");
            rVar.f365099r = null;
            return false;
        }

        @Override // com.my.target.C37780d.b
        public final void d() {
            V v12 = r.this.f365097p;
            if (v12 != null) {
                v12.dismiss();
            }
        }

        @Override // com.my.target.C37780d.b
        public final boolean a(@j.P Uri uri) {
            r rVar = r.this;
            if (rVar.f365091j == null) {
                return false;
            }
            if (!rVar.f365089h.equals("default") && !rVar.f365089h.equals("resized")) {
                return false;
            }
            rVar.f365101t = uri;
            new V(rVar, rVar.f365084c).show();
            return true;
        }

        @Override // com.my.target.C37780d.b
        public final boolean a(@j.N String str) {
            e11.G0 g02;
            r rVar = r.this;
            if (!rVar.f365095n) {
                this.f365110b.g("vpaidEvent", "Calling VPAID command before VPAID init");
                return false;
            }
            C37799m0.d dVar = rVar.f365093l;
            if (dVar == null || (g02 = rVar.f365094m) == null) {
                return true;
            }
            dVar.f364942a.getClass();
            k2.a(rVar.f365084c, g02.f394702a.e(str));
            return true;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public boolean f365112a = true;

        /* renamed from: b, reason: collision with root package name */
        public int f365113b;

        /* renamed from: c, reason: collision with root package name */
        public int f365114c;

        /* renamed from: d, reason: collision with root package name */
        public int f365115d;

        /* renamed from: e, reason: collision with root package name */
        public int f365116e;

        /* renamed from: f, reason: collision with root package name */
        public int f365117f;

        /* renamed from: g, reason: collision with root package name */
        public int f365118g;

        /* renamed from: h, reason: collision with root package name */
        public int f365119h;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        public Rect f365120i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        public Rect f365121j;
    }

    public r(@j.N ViewGroup viewGroup) {
        View rootView;
        C37780d c37780d = new C37780d("inline");
        B b12 = new B(viewGroup.getContext());
        C39856c c39856c = new C39856c(viewGroup.getContext());
        this.f365086e = new b();
        this.f365087f = c37780d;
        this.f365091j = b12;
        this.f365083b = c39856c;
        Context context = viewGroup.getContext();
        this.f365084c = context;
        if (!(context instanceof Activity)) {
            this.f365088g = new WeakReference<>(null);
            rootView = viewGroup.getRootView();
            if (rootView != null) {
                ViewGroup viewGroup2 = (ViewGroup) rootView.findViewById(R.id.content);
                this.f365098q = viewGroup2;
                if (viewGroup2 == null) {
                }
            }
            this.f365089h = "loading";
            this.f365085d = new C39849D();
            c37780d.f364781c = new e(c37780d);
            this.f365091j.addOnLayoutChangeListener(new a(c37780d));
            f(b12);
        }
        Activity activity = (Activity) context;
        this.f365088g = new WeakReference<>(activity);
        rootView = activity.getWindow().getDecorView().findViewById(R.id.content);
        this.f365098q = (ViewGroup) rootView;
        this.f365089h = "loading";
        this.f365085d = new C39849D();
        c37780d.f364781c = new e(c37780d);
        this.f365091j.addOnLayoutChangeListener(new a(c37780d));
        f(b12);
    }

    @Override // com.my.target.a1
    public final void a() {
        B b12;
        if ((this.f365097p == null || this.f365090i != null) && (b12 = this.f365091j) != null) {
            b12.b();
        }
    }

    @Override // com.my.target.a1
    public final void b() {
        B b12;
        if ((this.f365097p == null || this.f365090i != null) && (b12 = this.f365091j) != null) {
            b12.c(false);
        }
    }

    @Override // com.my.target.a1
    public final void c(@j.N e11.G0 g02) {
        C37818w0.a aVar;
        B b12;
        this.f365094m = g02;
        String str = g02.f394356H;
        if (str != null && (b12 = this.f365091j) != null) {
            C37780d c37780d = this.f365087f;
            c37780d.c(b12);
            c37780d.k(str);
        } else {
            C37799m0.d dVar = this.f365093l;
            if (dVar == null || (aVar = dVar.f364942a.f364936k) == null) {
                return;
            }
            aVar.d("failed to load, failed MRAID initialization");
        }
    }

    @Override // com.my.target.V.a
    public final void d(@j.N V v12, @j.N FrameLayout frameLayout) {
        Uri uri;
        this.f365097p = v12;
        b1 b1Var = this.f365096o;
        if (b1Var != null && b1Var.getParent() != null) {
            ((ViewGroup) this.f365096o.getParent()).removeView(this.f365096o);
        }
        Context context = this.f365084c;
        b1 b1Var2 = new b1(context);
        this.f365096o = b1Var2;
        this.f365083b.setVisibility(8);
        frameLayout.addView(b1Var2, new ViewGroup.LayoutParams(-1, -1));
        if (this.f365101t != null) {
            this.f365090i = new C37780d("inline");
            B b12 = new B(context);
            this.f365100s = b12;
            C37780d c37780d = this.f365090i;
            c37780d.f364781c = new e(c37780d);
            b1Var2.addView(b12, new ViewGroup.LayoutParams(-1, -1));
            c37780d.c(b12);
            V v13 = this.f365097p;
            if (v13 != null) {
                e11.G0 g02 = this.f365094m;
                if (g02 == null || (uri = this.f365101t) == null) {
                    v13.dismiss();
                } else {
                    m2.a(new d(g02, v13, uri, c37780d, this.f365084c));
                }
            }
        } else {
            B b13 = this.f365091j;
            if (b13 != null && b13.getParent() != null) {
                ((ViewGroup) this.f365091j.getParent()).removeView(this.f365091j);
                b1Var2.addView(this.f365091j, new ViewGroup.LayoutParams(-1, -1));
                g(SearchParamsConverterKt.EXPANDED);
            }
        }
        b1Var2.setCloseVisible(true);
        b1Var2.setOnCloseListener(this.f365086e);
        C37799m0.d dVar = this.f365093l;
        if (dVar == null || this.f365101t != null) {
            return;
        }
        dVar.b();
    }

    @Override // com.my.target.a1
    public final void e() {
        this.f365092k = null;
    }

    public final void f(@j.N B b12) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 1;
        this.f365083b.addView(b12, 0);
        b12.setLayoutParams(layoutParams);
    }

    public final void g(@j.N String str) {
        this.f365089h = str;
        this.f365087f.j(str);
        C37780d c37780d = this.f365090i;
        if (c37780d != null) {
            c37780d.j(str);
        }
        HiddenParameter.TYPE.equals(str);
    }

    @Override // com.my.target.a1
    @j.N
    public final C39856c getView() {
        return this.f365083b;
    }

    public final void h() {
        int i12;
        int i13;
        int measuredWidth;
        int i14;
        B b12;
        int[] iArr = new int[2];
        DisplayMetrics displayMetrics = this.f365084c.getResources().getDisplayMetrics();
        int i15 = displayMetrics.widthPixels;
        int i16 = displayMetrics.heightPixels;
        C39849D c39849d = this.f365085d;
        Rect rect = c39849d.f394296a;
        rect.set(0, 0, i15, i16);
        C39849D.a(rect, c39849d.f394297b);
        ViewGroup viewGroup = this.f365098q;
        if (viewGroup != null) {
            viewGroup.getLocationOnScreen(iArr);
            int i17 = iArr[0];
            int i18 = iArr[1];
            int measuredWidth2 = viewGroup.getMeasuredWidth() + i17;
            int measuredHeight = viewGroup.getMeasuredHeight() + iArr[1];
            Rect rect2 = c39849d.f394302g;
            rect2.set(i17, i18, measuredWidth2, measuredHeight);
            C39849D.a(rect2, c39849d.f394303h);
        }
        if (!this.f365089h.equals(SearchParamsConverterKt.EXPANDED) && !this.f365089h.equals("resized")) {
            C39856c c39856c = this.f365083b;
            c39856c.getLocationOnScreen(iArr);
            int i19 = iArr[0];
            int i22 = iArr[1];
            int measuredWidth3 = c39856c.getMeasuredWidth() + i19;
            int measuredHeight2 = c39856c.getMeasuredHeight() + iArr[1];
            Rect rect3 = c39849d.f394300e;
            rect3.set(i19, i22, measuredWidth3, measuredHeight2);
            C39849D.a(rect3, c39849d.f394301f);
        }
        B b13 = this.f365100s;
        Rect rect4 = c39849d.f394299d;
        Rect rect5 = c39849d.f394298c;
        if (b13 != null) {
            b13.getLocationOnScreen(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
            measuredWidth = this.f365100s.getMeasuredWidth() + i12;
            i14 = iArr[1];
            b12 = this.f365100s;
        } else {
            B b14 = this.f365091j;
            if (b14 == null) {
                return;
            }
            b14.getLocationOnScreen(iArr);
            i12 = iArr[0];
            i13 = iArr[1];
            measuredWidth = this.f365091j.getMeasuredWidth() + i12;
            i14 = iArr[1];
            b12 = this.f365091j;
        }
        rect5.set(i12, i13, measuredWidth, b12.getMeasuredHeight() + i14);
        C39849D.a(rect5, rect4);
    }

    @Override // com.my.target.V.a
    public final void q() {
        this.f365083b.setVisibility(0);
        Uri uri = this.f365101t;
        C37780d c37780d = this.f365087f;
        if (uri != null) {
            this.f365101t = null;
            C37780d c37780d2 = this.f365090i;
            if (c37780d2 != null) {
                c37780d2.h(false);
                this.f365090i.j(HiddenParameter.TYPE);
                this.f365090i.f364782d = null;
                this.f365090i = null;
                c37780d.h(true);
            }
            B b12 = this.f365100s;
            if (b12 != null) {
                b12.c(true);
                if (this.f365100s.getParent() != null) {
                    ((ViewGroup) this.f365100s.getParent()).removeView(this.f365100s);
                }
                this.f365100s.a(0);
                this.f365100s = null;
            }
        } else {
            B b13 = this.f365091j;
            if (b13 != null) {
                if (b13.getParent() != null) {
                    ((ViewGroup) this.f365091j.getParent()).removeView(this.f365091j);
                }
                f(this.f365091j);
            }
        }
        b1 b1Var = this.f365096o;
        if (b1Var != null && b1Var.getParent() != null) {
            ((ViewGroup) this.f365096o.getParent()).removeView(this.f365096o);
        }
        this.f365096o = null;
        g("default");
        C37799m0.d dVar = this.f365093l;
        if (dVar != null) {
            dVar.a();
        }
        h();
        c37780d.e(this.f365085d);
        B b14 = this.f365091j;
        if (b14 != null) {
            b14.b();
        }
    }

    @Override // com.my.target.a1
    public final void a(int i12) {
        g(HiddenParameter.TYPE);
        this.f365093l = null;
        this.f365092k = null;
        this.f365087f.f364782d = null;
        b1 b1Var = this.f365096o;
        if (b1Var != null) {
            b1Var.removeAllViews();
            this.f365096o.setOnCloseListener(null);
            ViewParent parent = this.f365096o.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f365096o);
            }
            this.f365096o = null;
        }
        B b12 = this.f365091j;
        if (b12 != null) {
            if (i12 <= 0) {
                b12.c(true);
            }
            if (this.f365091j.getParent() != null) {
                ((ViewGroup) this.f365091j.getParent()).removeView(this.f365091j);
            }
            this.f365091j.a(i12);
            this.f365091j = null;
        }
        C37780d c37780d = this.f365090i;
        if (c37780d != null) {
            c37780d.f364782d = null;
            this.f365090i = null;
        }
        B b13 = this.f365100s;
        if (b13 != null) {
            b13.c(true);
            if (this.f365100s.getParent() != null) {
                ((ViewGroup) this.f365100s.getParent()).removeView(this.f365100s);
            }
            this.f365100s.a(0);
            this.f365100s = null;
        }
    }

    @Override // com.my.target.V.a
    public final void b(boolean z12) {
        C37780d c37780d = this.f365090i;
        if (c37780d == null) {
            c37780d = this.f365087f;
        }
        c37780d.h(z12);
        B b12 = this.f365100s;
        if (b12 == null) {
            return;
        }
        if (z12) {
            b12.b();
        } else {
            b12.c(false);
        }
    }

    @Override // com.my.target.a1
    public final void f() {
        e11.G0 g02;
        C37799m0.b bVar = this.f365092k;
        if (bVar == null || (g02 = this.f365094m) == null) {
            return;
        }
        bVar.b(g02);
    }

    @Override // com.my.target.a1
    public final void a(boolean z12) {
        B b12;
        if ((this.f365097p == null || this.f365090i != null) && (b12 = this.f365091j) != null) {
            b12.c(z12);
        }
    }
}
