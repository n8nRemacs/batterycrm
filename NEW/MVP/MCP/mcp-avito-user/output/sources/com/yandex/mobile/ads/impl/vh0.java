package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.yandex.mobile.ads.impl.ei0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class vh0 implements ar0 {

    /* renamed from: a, reason: collision with root package name */
    private final ph0 f390877a;

    /* renamed from: b, reason: collision with root package name */
    private final nr0 f390878b;

    /* renamed from: c, reason: collision with root package name */
    private final ki0 f390879c;

    /* renamed from: d, reason: collision with root package name */
    private final ei0 f390880d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private pj1 f390881e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final iu f390882f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final ku f390883g;

    /* renamed from: h, reason: collision with root package name */
    @j.N
    private final String f390884h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private final tj1 f390885i;

    /* renamed from: j, reason: collision with root package name */
    @j.N
    private final fc1 f390886j;

    /* renamed from: k, reason: collision with root package name */
    @j.P
    private fi0 f390887k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private eh0 f390888l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private dh0 f390889m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private zq0 f390890n;

    /* renamed from: o, reason: collision with root package name */
    @j.P
    private nh1 f390891o;

    /* renamed from: p, reason: collision with root package name */
    @j.P
    private hu f390892p;

    public class a implements ei0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f390893a;

        public a(String str) {
            this.f390893a = str;
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f390895a;

        static {
            int[] iArr = new int[n6.b(8).length];
            f390895a = iArr;
            try {
                iArr[n6.a(4)] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f390895a[n6.a(7)] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f390895a[n6.a(5)] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f390895a[n6.a(1)] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f390895a[n6.a(2)] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f390895a[n6.a(3)] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f390895a[n6.a(6)] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public class c implements o00 {
        private c() {
        }

        @Override // com.yandex.mobile.ads.impl.o00
        public final void a() {
            vh0.this.f390878b.a();
        }

        public /* synthetic */ c(vh0 vh0Var, int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.o00
        public final void a(@j.N Context context, @j.N String str) {
            vh0.this.f390878b.a(context, str);
        }

        @Override // com.yandex.mobile.ads.impl.o00
        public final void a(int i12) {
            vh0.this.f390878b.a(i12);
        }
    }

    public vh0(@j.N nr0 nr0Var) {
        this.f390878b = nr0Var;
        ki0 ki0Var = new ki0(new c(this, 0));
        this.f390879c = ki0Var;
        nr0Var.setWebViewClient(ki0Var);
        this.f390877a = new ph0(nr0Var);
        this.f390880d = new ei0();
        this.f390885i = new tj1();
        this.f390886j = new fc1();
        this.f390881e = pj1.f388869c;
        iu iuVar = new iu();
        this.f390882f = iuVar;
        this.f390883g = new ku(nr0Var, iuVar, this);
        this.f390884h = g7.a(this);
    }

    public final void a(@j.N fi0 fi0Var) {
        this.f390887k = fi0Var;
    }

    public final void b() {
        if (pj1.f388868b == this.f390881e) {
            pj1 pj1Var = pj1.f388870d;
            this.f390881e = pj1Var;
            this.f390877a.a(pj1Var);
        }
    }

    public final void a(@j.N eh0 eh0Var) {
        this.f390888l = eh0Var;
    }

    public final void a(@j.N dh0 dh0Var) {
        this.f390889m = dh0Var;
    }

    public final void a(@j.N zq0 zq0Var) {
        this.f390890n = zq0Var;
    }

    public final void a(@j.N nh1 nh1Var) {
        this.f390891o = nh1Var;
    }

    public final void b(String str) {
        this.f390886j.getClass();
        if (fc1.c(str)) {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if ("mraid".equals(scheme) || "mobileads".equals(scheme)) {
                HashMap map = new HashMap();
                for (String str2 : uri.getQueryParameterNames()) {
                    map.put(str2, uri.getQueryParameter(str2));
                }
                int iA2 = bi0.a(host);
                try {
                    a(iA2, map);
                } catch (Exception e12) {
                    this.f390877a.a(iA2, e12.getMessage());
                }
                this.f390877a.a(iA2);
                return;
            }
            return;
        }
        this.f390877a.a(8, "Mraid command sent an invalid URL");
    }

    public final void a(@j.N String str) {
        Context context = this.f390878b.getContext();
        ei0 ei0Var = this.f390880d;
        String str2 = this.f390884h;
        a aVar = new a(str);
        ei0Var.getClass();
        v11 v11VarA = q21.b().a(context);
        if (v11VarA != null && !TextUtils.isEmpty(v11VarA.p())) {
            k71 k71Var = new k71(v11VarA.p(), new ci0(aVar), new di0(aVar));
            k71Var.b((Object) str2);
            synchronized (zy0.a()) {
                jp0.a(context).a(k71Var);
            }
            return;
        }
        this.f390879c.a(ei0.f384972a);
        this.f390877a.b(str);
    }

    public final void a(@j.N nr0 nr0Var, @j.P Map map) {
        a81 a81Var = new a81(this.f390878b);
        tj1 tj1Var = this.f390885i;
        nr0 nr0Var2 = this.f390878b;
        tj1Var.getClass();
        xj1 xj1Var = new xj1(tj1.a(nr0Var2));
        hu huVarA = this.f390882f.a(this.f390878b);
        ju juVar = new ju(huVarA.a(), huVarA.b());
        pj1 pj1Var = pj1.f388868b;
        this.f390881e = pj1Var;
        this.f390877a.a(pj1Var, xj1Var, juVar, a81Var);
        this.f390877a.a();
        fi0 fi0Var = this.f390887k;
        if (fi0Var != null) {
            fi0Var.a(nr0Var, map);
        }
    }

    public final void a(boolean z12) {
        this.f390877a.a(new xj1(z12));
        if (z12) {
            this.f390883g.a();
            return;
        }
        this.f390883g.b();
        hu huVarA = this.f390882f.a(this.f390878b);
        if (huVarA.equals(this.f390892p)) {
            return;
        }
        this.f390892p = huVarA;
        this.f390877a.a(new ju(huVarA.a(), huVarA.b()));
    }

    @Override // com.yandex.mobile.ads.impl.ar0
    public final void a(@j.N hu huVar) {
        if (huVar.equals(this.f390892p)) {
            return;
        }
        this.f390892p = huVar;
        this.f390877a.a(new ju(huVar.a(), huVar.b()));
    }

    private void a(@j.N int i12, @j.N HashMap map) throws th0 {
        if (this.f390887k != null) {
            int[] iArr = b.f390895a;
            if (i12 != 0) {
                switch (iArr[i12 - 1]) {
                    case 1:
                        if (pj1.f388868b == this.f390881e) {
                            pj1 pj1Var = pj1.f388870d;
                            this.f390881e = pj1Var;
                            this.f390877a.a(pj1Var);
                            zq0 zq0Var = this.f390890n;
                            if (zq0Var != null) {
                                zq0Var.c();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        if (this.f390890n != null) {
                            this.f390890n.a(Boolean.parseBoolean((String) map.get("shouldUseCustomClose")));
                            return;
                        }
                        return;
                    case 3:
                        String str = (String) map.get(ContextActionHandler.Link.URL);
                        if (!TextUtils.isEmpty(str)) {
                            this.f390887k.a(str);
                            return;
                        }
                        throw new th0(androidx.camera.camera2.internal.G.f("Mraid open command sent an invalid URL: ", str));
                    case 4:
                        nh1 nh1Var = this.f390891o;
                        if (nh1Var != null) {
                            nh1Var.a();
                            return;
                        }
                        return;
                    case 5:
                        dh0 dh0Var = this.f390889m;
                        if (dh0Var != null) {
                            dh0Var.d();
                            return;
                        }
                        return;
                    case 6:
                        dh0 dh0Var2 = this.f390889m;
                        if (dh0Var2 != null) {
                            dh0Var2.b();
                            return;
                        }
                        return;
                    case 7:
                        eh0 eh0Var = this.f390888l;
                        if (eh0Var != null) {
                            eh0Var.a();
                            return;
                        }
                        return;
                    default:
                        throw new th0("Unspecified MRAID Javascript command");
                }
            }
            throw null;
        }
        throw new th0("Invalid state to execute this command");
    }

    public final void a() {
        this.f390883g.b();
        ei0 ei0Var = this.f390880d;
        Context context = this.f390878b.getContext();
        String str = this.f390884h;
        ei0Var.getClass();
        zy0.a().getClass();
        zy0.a(context, str);
        this.f390887k = null;
        this.f390888l = null;
        this.f390889m = null;
        this.f390890n = null;
        this.f390891o = null;
    }
}
