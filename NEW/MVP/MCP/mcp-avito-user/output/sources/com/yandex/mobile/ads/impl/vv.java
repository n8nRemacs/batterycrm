package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsBaseData;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.mobile.ads.base.SizeInfo;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.impl.dk;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* loaded from: classes8.dex */
public final class vv {

    /* renamed from: A, reason: collision with root package name */
    private final Boolean f391014A;

    /* renamed from: B, reason: collision with root package name */
    private final String f391015B;

    /* renamed from: C, reason: collision with root package name */
    private final Integer f391016C;

    /* renamed from: D, reason: collision with root package name */
    private final String f391017D;

    /* renamed from: E, reason: collision with root package name */
    private final String f391018E;

    /* renamed from: F, reason: collision with root package name */
    private final String f391019F;

    /* renamed from: G, reason: collision with root package name */
    private final String f391020G;

    /* renamed from: H, reason: collision with root package name */
    private final String f391021H;

    /* renamed from: I, reason: collision with root package name */
    private final HashMap f391022I;

    /* renamed from: J, reason: collision with root package name */
    private final Long f391023J;

    /* renamed from: K, reason: collision with root package name */
    private final String f391024K;

    /* renamed from: L, reason: collision with root package name */
    private final String f391025L;

    /* renamed from: M, reason: collision with root package name */
    private final String f391026M;

    /* renamed from: N, reason: collision with root package name */
    private final String f391027N;

    /* renamed from: O, reason: collision with root package name */
    @j.P
    private final String f391028O;

    /* renamed from: P, reason: collision with root package name */
    @j.P
    private final String f391029P;

    /* renamed from: Q, reason: collision with root package name */
    private final String f391030Q;

    /* renamed from: R, reason: collision with root package name */
    private final String f391031R;

    /* renamed from: S, reason: collision with root package name */
    private final String f391032S;

    /* renamed from: T, reason: collision with root package name */
    private final String f391033T;

    /* renamed from: U, reason: collision with root package name */
    private final String f391034U;

    /* renamed from: V, reason: collision with root package name */
    private final String f391035V;

    /* renamed from: W, reason: collision with root package name */
    private final String f391036W;

    /* renamed from: X, reason: collision with root package name */
    private final String f391037X;

    /* renamed from: Y, reason: collision with root package name */
    private final String f391038Y;

    /* renamed from: Z, reason: collision with root package name */
    private final String f391039Z;

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final l5 f391040a;

    /* renamed from: a0, reason: collision with root package name */
    private final Integer f391041a0;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final ys f391042b;

    /* renamed from: b0, reason: collision with root package name */
    private final String f391043b0;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f391044c;

    /* renamed from: c0, reason: collision with root package name */
    private final String f391045c0;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private final Integer f391046d;

    /* renamed from: d0, reason: collision with root package name */
    private final Boolean f391047d0;

    /* renamed from: e, reason: collision with root package name */
    private final String f391048e;

    /* renamed from: e0, reason: collision with root package name */
    private final Boolean f391049e0;

    /* renamed from: f, reason: collision with root package name */
    private final String f391050f;

    /* renamed from: f0, reason: collision with root package name */
    private final boolean f391051f0;

    /* renamed from: g, reason: collision with root package name */
    private final String f391052g;

    /* renamed from: g0, reason: collision with root package name */
    @j.P
    private final String f391053g0;

    /* renamed from: h, reason: collision with root package name */
    private final Integer f391054h;

    /* renamed from: h0, reason: collision with root package name */
    @j.P
    private final String f391055h0;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f391056i;

    /* renamed from: i0, reason: collision with root package name */
    private final boolean f391057i0;

    /* renamed from: j, reason: collision with root package name */
    private final String f391058j;

    /* renamed from: j0, reason: collision with root package name */
    @j.P
    private final String f391059j0;

    /* renamed from: k, reason: collision with root package name */
    private final String f391060k;

    /* renamed from: k0, reason: collision with root package name */
    @j.P
    private final String f391061k0;

    /* renamed from: l, reason: collision with root package name */
    private final Integer f391062l;

    /* renamed from: l0, reason: collision with root package name */
    @j.P
    private final String f391063l0;

    /* renamed from: m, reason: collision with root package name */
    private final Integer f391064m;

    /* renamed from: m0, reason: collision with root package name */
    @j.P
    private final String f391065m0;

    /* renamed from: n, reason: collision with root package name */
    private final Float f391066n;

    /* renamed from: n0, reason: collision with root package name */
    private final String f391067n0;

    /* renamed from: o, reason: collision with root package name */
    private final Location f391068o;

    /* renamed from: o0, reason: collision with root package name */
    @j.P
    private final String f391069o0;

    /* renamed from: p, reason: collision with root package name */
    private final Integer f391070p;

    /* renamed from: p0, reason: collision with root package name */
    @j.P
    private final String f391071p0;

    /* renamed from: q, reason: collision with root package name */
    private final Integer f391072q;

    /* renamed from: q0, reason: collision with root package name */
    @j.P
    private final String f391073q0;

    /* renamed from: r, reason: collision with root package name */
    private final String f391074r;

    /* renamed from: r0, reason: collision with root package name */
    private final boolean f391075r0;

    /* renamed from: s, reason: collision with root package name */
    private final String f391076s;

    /* renamed from: s0, reason: collision with root package name */
    @j.P
    private final String f391077s0;

    /* renamed from: t, reason: collision with root package name */
    private final g5 f391078t;

    /* renamed from: t0, reason: collision with root package name */
    private StringBuilder f391079t0;

    /* renamed from: u, reason: collision with root package name */
    private final Integer f391080u;

    /* renamed from: v, reason: collision with root package name */
    private final Integer f391081v;

    /* renamed from: w, reason: collision with root package name */
    private final String f391082w;

    /* renamed from: x, reason: collision with root package name */
    private final Boolean f391083x;

    /* renamed from: y, reason: collision with root package name */
    private final Boolean f391084y;

    /* renamed from: z, reason: collision with root package name */
    private final String f391085z;

    public static final class a<T> {

        /* renamed from: A, reason: collision with root package name */
        private Float f391086A;

        /* renamed from: B, reason: collision with root package name */
        private Integer f391087B;

        /* renamed from: C, reason: collision with root package name */
        private Integer f391088C;

        /* renamed from: D, reason: collision with root package name */
        private String f391089D;

        /* renamed from: E, reason: collision with root package name */
        private String f391090E;

        /* renamed from: F, reason: collision with root package name */
        private g5 f391091F;

        /* renamed from: G, reason: collision with root package name */
        private Integer f391092G;

        /* renamed from: H, reason: collision with root package name */
        private Integer f391093H;

        /* renamed from: I, reason: collision with root package name */
        private String f391094I;

        /* renamed from: J, reason: collision with root package name */
        private Boolean f391095J;

        /* renamed from: K, reason: collision with root package name */
        private Boolean f391096K;

        /* renamed from: L, reason: collision with root package name */
        private String f391097L;

        /* renamed from: M, reason: collision with root package name */
        private Boolean f391098M;

        /* renamed from: N, reason: collision with root package name */
        private String f391099N;

        /* renamed from: O, reason: collision with root package name */
        private Integer f391100O;

        /* renamed from: P, reason: collision with root package name */
        private String f391101P;

        /* renamed from: Q, reason: collision with root package name */
        private String f391102Q;

        /* renamed from: R, reason: collision with root package name */
        private String f391103R;

        /* renamed from: S, reason: collision with root package name */
        private String f391104S;

        /* renamed from: T, reason: collision with root package name */
        private String f391105T;

        /* renamed from: U, reason: collision with root package name */
        private Long f391106U;

        /* renamed from: V, reason: collision with root package name */
        private String f391107V;

        /* renamed from: W, reason: collision with root package name */
        private String f391108W;

        /* renamed from: X, reason: collision with root package name */
        private String f391109X;

        /* renamed from: Y, reason: collision with root package name */
        private String f391110Y;

        /* renamed from: Z, reason: collision with root package name */
        @j.P
        private String f391111Z;

        /* renamed from: a, reason: collision with root package name */
        @j.N
        private final aq f391112a;

        /* renamed from: a0, reason: collision with root package name */
        @j.P
        private String f391113a0;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        private final ra f391114b;

        /* renamed from: b0, reason: collision with root package name */
        private String f391115b0;

        /* renamed from: c, reason: collision with root package name */
        @j.N
        private final s21 f391116c;

        /* renamed from: c0, reason: collision with root package name */
        private String f391117c0;

        /* renamed from: d, reason: collision with root package name */
        @j.N
        private final r8 f391118d;

        /* renamed from: d0, reason: collision with root package name */
        private String f391119d0;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f391120e;

        /* renamed from: e0, reason: collision with root package name */
        private String f391121e0;

        /* renamed from: f, reason: collision with root package name */
        private boolean f391122f;

        /* renamed from: f0, reason: collision with root package name */
        private String f391123f0;

        /* renamed from: g, reason: collision with root package name */
        @j.N
        private final HashMap f391124g;

        /* renamed from: g0, reason: collision with root package name */
        private String f391125g0;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private Boolean f391126h;

        /* renamed from: h0, reason: collision with root package name */
        private String f391127h0;

        /* renamed from: i, reason: collision with root package name */
        @j.P
        private Boolean f391128i;

        /* renamed from: i0, reason: collision with root package name */
        private String f391129i0;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        private String f391130j;

        /* renamed from: j0, reason: collision with root package name */
        private String f391131j0;

        /* renamed from: k, reason: collision with root package name */
        @j.P
        private Integer f391132k;

        /* renamed from: k0, reason: collision with root package name */
        private String f391133k0;

        /* renamed from: l, reason: collision with root package name */
        private boolean f391134l;

        /* renamed from: l0, reason: collision with root package name */
        private int f391135l0;

        /* renamed from: m, reason: collision with root package name */
        @j.P
        private String f391136m;

        /* renamed from: m0, reason: collision with root package name */
        private String f391137m0;

        /* renamed from: n, reason: collision with root package name */
        @j.P
        private String f391138n;

        /* renamed from: n0, reason: collision with root package name */
        private String f391139n0;

        /* renamed from: o, reason: collision with root package name */
        @j.P
        private String f391140o;

        /* renamed from: o0, reason: collision with root package name */
        @j.P
        private String f391141o0;

        /* renamed from: p, reason: collision with root package name */
        @j.P
        private String f391142p;

        /* renamed from: p0, reason: collision with root package name */
        @j.P
        private String f391143p0;

        /* renamed from: q, reason: collision with root package name */
        private String f391144q;

        /* renamed from: q0, reason: collision with root package name */
        private String f391145q0;

        /* renamed from: r, reason: collision with root package name */
        private String f391146r;

        /* renamed from: r0, reason: collision with root package name */
        @j.P
        private String f391147r0;

        /* renamed from: s, reason: collision with root package name */
        private String f391148s;

        /* renamed from: s0, reason: collision with root package name */
        @j.P
        private String f391149s0;

        /* renamed from: t, reason: collision with root package name */
        private Integer f391150t;

        /* renamed from: t0, reason: collision with root package name */
        @j.P
        private String f391151t0;

        /* renamed from: u, reason: collision with root package name */
        private Integer f391152u;

        /* renamed from: u0, reason: collision with root package name */
        private boolean f391153u0;

        /* renamed from: v, reason: collision with root package name */
        private String f391154v;

        /* renamed from: v0, reason: collision with root package name */
        @j.P
        private String f391155v0;

        /* renamed from: w, reason: collision with root package name */
        private String f391156w;

        /* renamed from: x, reason: collision with root package name */
        private Location f391157x;

        /* renamed from: y, reason: collision with root package name */
        private Integer f391158y;

        /* renamed from: z, reason: collision with root package name */
        private Integer f391159z;

        public /* synthetic */ a(boolean z12, int i12) {
            this(z12);
        }

        @j.N
        public final a<T> a(Context context) {
            String strValueOf;
            this.f391127h0 = context.getPackageName();
            String str = null;
            try {
                strValueOf = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (Exception unused) {
                strValueOf = null;
            }
            this.f391129i0 = strValueOf;
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception unused2) {
            }
            this.f391131j0 = str;
            return this;
        }

        @j.N
        public final a<T> b(@j.N Context context) {
            dk.f384623a.getClass();
            this.f391134l = ((fk) dk.a.a(context)).a();
            return this;
        }

        @j.N
        public final a<T> d(@j.N Context context) {
            dk.f384623a.getClass();
            this.f391136m = ((fk) dk.a.a(context)).c();
            return this;
        }

        @j.N
        public final a<T> e(@j.N Context context) {
            dk.f384623a.getClass();
            this.f391138n = ((fk) dk.a.a(context)).b();
            return this;
        }

        @j.N
        public final a<T> f(Context context) {
            int cid;
            Integer numValueOf = null;
            try {
                cid = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getCid();
            } catch (Exception unused) {
            }
            this.f391092G = -1 != cid ? Integer.valueOf(cid & Settings.DEFAULT_INITIAL_WINDOW_SIZE) : null;
            try {
                int lac = ((GsmCellLocation) ((TelephonyManager) context.getSystemService("phone")).getCellLocation()).getLac();
                if (-1 != lac) {
                    numValueOf = Integer.valueOf(lac & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            } catch (Exception unused2) {
            }
            this.f391093H = numValueOf;
            this.f391094I = os0.c(context);
            return this;
        }

        @j.N
        public final a<T> h(Context context) {
            String strSubstring;
            String strSubstring2;
            String str = null;
            try {
                strSubstring2 = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(0, 3);
            } catch (Exception unused) {
            }
            this.f391087B = !TextUtils.isEmpty(strSubstring2) ? Integer.valueOf(Integer.parseInt(strSubstring2)) : null;
            try {
                strSubstring = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator().substring(3);
            } catch (Exception unused2) {
            }
            Integer numValueOf = !TextUtils.isEmpty(strSubstring) ? Integer.valueOf(Integer.parseInt(strSubstring)) : null;
            this.f391088C = numValueOf;
            this.f391089D = os0.a(context);
            try {
                String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    str = networkOperatorName;
                }
            } catch (Exception unused3) {
            }
            this.f391090E = str;
            return this;
        }

        @j.N
        public final a<T> i(@j.N Context context) {
            dk.f384623a.getClass();
            this.f391140o = ((fk) dk.a.a(context)).d();
            return this;
        }

        @j.N
        public final a<T> l(@j.N Context context) {
            dk.f384623a.getClass();
            this.f391142p = ((fk) dk.a.a(context)).e();
            return this;
        }

        private a(boolean z12) {
            this.f391124g = new HashMap();
            this.f391120e = z12;
            this.f391112a = new aq();
            this.f391114b = new ra();
            this.f391116c = new s21();
            this.f391118d = new r8();
        }

        @j.N
        public final a<T> c() {
            this.f391114b.getClass();
            this.f391145q0 = ra.a();
            return this;
        }

        @j.N
        public final a<T> g(@j.N Context context) {
            this.f391157x = this.f391120e ? null : da0.a(context).a();
            return this;
        }

        @j.N
        public final a<T> j(Context context) {
            this.f391158y = Integer.valueOf(rj1.c(context));
            this.f391159z = Integer.valueOf(rj1.b(context));
            this.f391086A = Float.valueOf(context.getResources().getDisplayMetrics().density);
            this.f391135l0 = rj1.a(context);
            return this;
        }

        @j.N
        public final a<T> k(@j.N Context context) {
            v11 v11VarA = q21.b().a(context);
            if (v11VarA != null) {
                this.f391155v0 = v11VarA.u();
            }
            return this;
        }

        @j.N
        public final a<T> m(@j.N Context context) {
            this.f391153u0 = g7.a(context);
            return this;
        }

        @j.N
        public final a<T> c(@j.P String str) {
            this.f391113a0 = str;
            return this;
        }

        @j.N
        public final a<T> b(Integer num) {
            this.f391100O = num;
            return this;
        }

        @j.N
        public final a<T> c(@j.N Context context) {
            this.f391149s0 = (new cn(context).a() ? AdTheme.DARK : AdTheme.LIGHT).getF382688a();
            return this;
        }

        @j.N
        public final a<T> d(@j.P String str) {
            this.f391130j = str;
            return this;
        }

        @j.N
        public final a<T> e(@j.P String str) {
            this.f391144q = str;
            return this;
        }

        @j.N
        public final a<T> g() {
            this.f391126h = q21.b().g();
            return this;
        }

        @j.N
        public final a<T> b(@j.P String str) {
            this.f391111Z = str;
            return this;
        }

        @j.N
        public final a d() {
            this.f391107V = Constants.ENCODING;
            return this;
        }

        @j.N
        public final a e() {
            this.f391108W = null;
            return this;
        }

        @j.N
        public final a<T> b() {
            this.f391128i = q21.b().d();
            return this;
        }

        @j.N
        public final a<T> a(String str) {
            this.f391146r = str;
            return this;
        }

        @j.N
        public final a<T> f() {
            this.f391141o0 = this.f391116c.a();
            this.f391143p0 = this.f391116c.b();
            return this;
        }

        @j.N
        public final a<T> a(y6 y6Var) {
            if (y6Var != null) {
                this.f391148s = y6Var.a();
            }
            return this;
        }

        @j.N
        public final a<T> a(@j.N Context context, @j.P SizeInfo sizeInfo) {
            if (sizeInfo != null) {
                this.f391154v = m41.b(sizeInfo.d());
                this.f391150t = Integer.valueOf(sizeInfo.c(context));
                this.f391152u = Integer.valueOf(sizeInfo.a(context));
            }
            return this;
        }

        public final a h() {
            this.f391109X = null;
            return this;
        }

        @j.N
        public final a<T> a(int i12) {
            if (1 == i12) {
                this.f391156w = "portrait";
            } else {
                this.f391156w = "landscape";
            }
            return this;
        }

        @j.N
        public final a<T> a(@j.P g5 g5Var) {
            String strDecode;
            if (g5Var != null) {
                String strDecode2 = null;
                this.f391091F = this.f391120e ? null : g5Var;
                String strC = g5Var.c();
                if (TextUtils.isEmpty(strC)) {
                    strDecode = null;
                } else {
                    String strEncode = Uri.encode(strC);
                    if (strEncode != null && strEncode.length() > 1024) {
                        gw0.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 1024, 1024);
                        String strEncode2 = Uri.encode(" ");
                        String strSubstring = strEncode.substring(0, 1024);
                        strEncode = strEncode.startsWith(strEncode2, 1024) ? strSubstring : strSubstring.substring(0, strSubstring.lastIndexOf(strEncode2));
                    }
                    strDecode = Uri.decode(strEncode);
                }
                this.f391101P = strDecode;
                List<String> listD = g5Var.d();
                StringBuilder sb2 = new StringBuilder();
                if (listD != null) {
                    String str = "";
                    for (String str2 : listD) {
                        if (!TextUtils.isEmpty(str2)) {
                            sb2.append(str);
                            sb2.append(str2);
                            sb2.append("\n");
                            str = "3";
                        }
                    }
                }
                String string = sb2.toString();
                if (!TextUtils.isEmpty(string)) {
                    String strEncode3 = Uri.encode(string);
                    if (strEncode3 != null && strEncode3.length() > 2048) {
                        gw0.a("Exceeded the length of the parameter! The maximum size of the parameter is %s bytes. First %s bytes of the parameter will be used", 2048, 2048);
                        String strEncode4 = Uri.encode("\n");
                        strEncode3 = strEncode3.substring(0, 2048);
                        if (!strEncode3.endsWith(strEncode4)) {
                            strEncode3 = strEncode3.substring(0, strEncode3.lastIndexOf(strEncode4));
                        }
                    }
                    strDecode2 = Uri.decode(strEncode3);
                }
                this.f391102Q = strDecode2;
                this.f391137m0 = n5.a(g5Var.a());
                this.f391139n0 = n5.a(g5Var.e());
                this.f391110Y = g5Var.b();
                AdTheme adThemeH = g5Var.h();
                if (adThemeH != null) {
                    this.f391147r0 = n5.a(adThemeH.getF382688a());
                }
                a(n5.a(g5Var.g()));
            }
            return this;
        }

        @j.N
        public final a<T> a(@j.P String[] strArr) {
            String string;
            if (strArr == null || strArr.length <= 0) {
                string = null;
            } else {
                StringBuilder sb2 = new StringBuilder();
                String str = "";
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2)) {
                        sb2.append(str);
                        sb2.append(str2);
                        str = ",";
                    }
                }
                string = sb2.toString();
            }
            this.f391103R = string;
            return this;
        }

        @j.N
        public final a<T> a(@j.P zm0 zm0Var) {
            if (zm0Var != null) {
                this.f391104S = zm0Var.a();
            }
            return this;
        }

        @j.N
        public final a<T> a(@j.P bn0 bn0Var) {
            if (bn0Var != null && bn0.f384000c == bn0Var) {
                this.f391105T = bn0Var.a();
            }
            return this;
        }

        @j.N
        public final a<T> a(@j.P Map<String, String> map) {
            if (map != null) {
                this.f391124g.putAll(map);
            }
            return this;
        }

        @j.N
        public final a<T> a(@j.N Context context, @j.P String str) {
            this.f391115b0 = this.f391112a.a(context);
            this.f391112a.getClass();
            this.f391117c0 = "android";
            this.f391112a.getClass();
            this.f391119d0 = Build.VERSION.RELEASE;
            this.f391112a.getClass();
            this.f391121e0 = aq.a();
            this.f391112a.getClass();
            this.f391123f0 = Build.MODEL;
            this.f391125g0 = this.f391112a.b(context);
            if (this.f391120e) {
                str = null;
            }
            this.f391133k0 = str;
            return this;
        }

        @j.N
        public final a<T> a(@j.N boolean z12) {
            this.f391122f = z12;
            return this;
        }

        @j.N
        public final a<T> a(@j.P s8 s8Var, boolean z12) {
            if (s8Var != null) {
                this.f391095J = Boolean.valueOf(s8Var.b());
                this.f391096K = Boolean.valueOf(z12);
                String strA = s8Var.a();
                this.f391118d.getClass();
                boolean z13 = (TextUtils.isEmpty(strA) || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!this.f391120e && !this.f391095J.booleanValue() && z13) {
                    this.f391097L = strA;
                }
            }
            return this;
        }

        @j.N
        public final a<T> a(@j.P s8 s8Var) {
            if (s8Var != null) {
                this.f391098M = Boolean.valueOf(s8Var.b());
                String strA = s8Var.a();
                this.f391118d.getClass();
                boolean z12 = (TextUtils.isEmpty(strA) || "00000000-0000-0000-0000-000000000000".equals(strA)) ? false : true;
                if (!this.f391120e && !this.f391098M.booleanValue() && z12) {
                    this.f391099N = strA;
                }
            }
            return this;
        }

        @j.N
        public final a<T> a(long j12) {
            this.f391106U = Long.valueOf(j12);
            return this;
        }

        @j.N
        public final a<T> a(@j.P Integer num) {
            this.f391132k = num;
            return this;
        }

        @j.N
        public final a<T> a(@j.N Context context, @j.N n2 n2Var) {
            String strA;
            String strC = n2Var.c();
            int iL2 = n2Var.l();
            if (strC != null && (strA = new mj1(context).a(new oj1(iL2, strC))) != null) {
                this.f391151t0 = strA;
            }
            return this;
        }

        @j.N
        public final String a() {
            return new vv(this, 0).toString();
        }
    }

    public /* synthetic */ vv(a aVar, int i12) {
        this(aVar);
    }

    public static a<?> a(boolean z12) {
        return new a<>(z12, 0);
    }

    public final String toString() {
        if (!TextUtils.isEmpty(this.f391079t0)) {
            return this.f391079t0.toString();
        }
        this.f391079t0 = new StringBuilder();
        a(this.f391050f, "ad_unit_id");
        a(this.f391054h, "width");
        a(this.f391056i, "height");
        a(this.f391058j, "ad_size_type");
        a(this.f391060k, "orientation");
        a(this.f391046d, "ads_count");
        a(this.f391062l, "screen_width");
        a(this.f391064m, "screen_height");
        a(this.f391066n, "scalefactor");
        a(this.f391052g, "ad_type");
        a(this.f391074r, "network_type");
        a(this.f391076s, "carrier");
        a("dnt", this.f391083x);
        a("gaid_reset", this.f391084y);
        a("huawei_dnt", this.f391014A);
        a(this.f391016C, "battery_charge");
        a(this.f391019F, "image_sizes");
        a(this.f391020G, "response_ad_format");
        a(this.f391021H, "ad_source");
        a(this.f391025L, "debug_yandexuid");
        a(this.f391026M, "user_id");
        a(this.f391027N, "open_bidding_data");
        a(this.f391023J, "session_random");
        a(this.f391024K, "charset");
        a(this.f391030Q, this.f391040a.b());
        a(this.f391031R, this.f391040a.e());
        a(this.f391032S, this.f391040a.f());
        a(this.f391033T, this.f391040a.c());
        a(this.f391034U, this.f391040a.d());
        a(this.f391035V, "locale");
        a(this.f391036W, HiAnalyticsConstant.BI_KEY_APP_ID);
        a(this.f391037X, "app_version_code");
        a(this.f391038Y, "app_version_name");
        a(this.f391067n0, "appmetrica_version");
        a(this.f391041a0, "screen_dpi");
        a("user_consent", this.f391047d0);
        a(this.f391059j0, "gdpr");
        a(this.f391061k0, "gdpr_consent");
        a("cmp_present", Boolean.valueOf(this.f391057i0));
        a(this.f391063l0, "parsed_purpose_consents");
        a(this.f391065m0, "parsed_vendor_consents");
        a(this.f391029P, "bidding_data");
        a(this.f391053g0, HianalyticsBaseData.SDK_VERSION);
        a(this.f391055h0, "sdk_version_name");
        a(this.f391069o0, "preferred_theme");
        a(this.f391071p0, "device_theme");
        a("age_restricted_user", this.f391049e0);
        a(this.f391073q0, "view_size_info");
        a("web_view_available", Boolean.valueOf(this.f391075r0));
        a(this.f391077s0, "startup_version");
        HashMap map = this.f391022I;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                a(entry.getValue(), (String) entry.getKey());
            }
        }
        if (!this.f391051f0) {
            a(this.f391043b0, "age");
            a(this.f391045c0, "gender");
            a(this.f391017D, "context_query");
            a(this.f391018E, "context_taglist");
            a(this.f391085z, "google_aid");
            a(this.f391015B, "huawei_oaid");
            a(this.f391048e, "uuid");
            a(this.f391044c, "mauid");
            a(this.f391028O, "autograb");
            a(this.f391039Z, this.f391040a.a());
            a(this.f391070p, "mcc");
            a(this.f391072q, "mnc");
            a(this.f391080u, "cellid");
            a(this.f391081v, "lac");
            a(this.f391082w, "wifi");
            g5 g5Var = this.f391078t;
            if (g5Var == null || g5Var.f() == null) {
                Location location = this.f391068o;
                if (location != null && q21.b().f()) {
                    a(String.valueOf(location.getLatitude()), "lat");
                    a(String.valueOf(location.getLongitude()), MessageBody.Location.LONGITUDE);
                    a(String.valueOf(location.getTime()), "location_timestamp");
                    a(String.valueOf((int) location.getAccuracy()), "precision");
                }
            } else {
                Location locationF = this.f391078t.f();
                if (locationF != null && q21.b().f()) {
                    a(String.valueOf(locationF.getLatitude()), "lat");
                    a(String.valueOf(locationF.getLongitude()), MessageBody.Location.LONGITUDE);
                    a(String.valueOf(locationF.getTime()), "location_timestamp");
                    a(String.valueOf((int) locationF.getAccuracy()), "precision");
                }
            }
        }
        return this.f391079t0.toString();
    }

    private vv(a<?> aVar) {
        this.f391046d = ((a) aVar).f391132k;
        this.f391050f = ((a) aVar).f391146r;
        this.f391048e = ((a) aVar).f391144q;
        this.f391044c = ((a) aVar).f391130j;
        this.f391052g = ((a) aVar).f391148s;
        this.f391054h = ((a) aVar).f391150t;
        this.f391056i = ((a) aVar).f391152u;
        this.f391058j = ((a) aVar).f391154v;
        this.f391060k = ((a) aVar).f391156w;
        this.f391062l = ((a) aVar).f391158y;
        this.f391064m = ((a) aVar).f391159z;
        this.f391066n = ((a) aVar).f391086A;
        this.f391068o = ((a) aVar).f391157x;
        this.f391070p = ((a) aVar).f391087B;
        this.f391072q = ((a) aVar).f391088C;
        this.f391074r = ((a) aVar).f391089D;
        this.f391076s = ((a) aVar).f391090E;
        this.f391078t = ((a) aVar).f391091F;
        this.f391080u = ((a) aVar).f391092G;
        this.f391081v = ((a) aVar).f391093H;
        this.f391082w = ((a) aVar).f391094I;
        this.f391083x = ((a) aVar).f391095J;
        this.f391084y = ((a) aVar).f391096K;
        this.f391085z = ((a) aVar).f391097L;
        this.f391014A = ((a) aVar).f391098M;
        this.f391015B = ((a) aVar).f391099N;
        this.f391016C = ((a) aVar).f391100O;
        this.f391017D = ((a) aVar).f391101P;
        this.f391018E = ((a) aVar).f391102Q;
        this.f391019F = ((a) aVar).f391103R;
        this.f391020G = ((a) aVar).f391104S;
        this.f391021H = ((a) aVar).f391105T;
        this.f391022I = ((a) aVar).f391124g;
        this.f391023J = ((a) aVar).f391106U;
        this.f391024K = ((a) aVar).f391107V;
        this.f391025L = ((a) aVar).f391108W;
        this.f391026M = ((a) aVar).f391109X;
        this.f391028O = ((a) aVar).f391111Z;
        this.f391027N = ((a) aVar).f391110Y;
        this.f391029P = ((a) aVar).f391113a0;
        this.f391030Q = ((a) aVar).f391115b0;
        this.f391031R = ((a) aVar).f391117c0;
        this.f391032S = ((a) aVar).f391119d0;
        this.f391033T = ((a) aVar).f391121e0;
        this.f391034U = ((a) aVar).f391123f0;
        this.f391035V = ((a) aVar).f391125g0;
        this.f391036W = ((a) aVar).f391127h0;
        this.f391037X = ((a) aVar).f391129i0;
        this.f391038Y = ((a) aVar).f391131j0;
        this.f391039Z = ((a) aVar).f391133k0;
        this.f391041a0 = Integer.valueOf(((a) aVar).f391135l0);
        this.f391043b0 = ((a) aVar).f391137m0;
        this.f391045c0 = ((a) aVar).f391139n0;
        this.f391047d0 = ((a) aVar).f391126h;
        this.f391049e0 = ((a) aVar).f391128i;
        this.f391051f0 = ((a) aVar).f391122f;
        this.f391059j0 = ((a) aVar).f391136m;
        this.f391061k0 = ((a) aVar).f391138n;
        this.f391057i0 = ((a) aVar).f391134l;
        this.f391063l0 = ((a) aVar).f391140o;
        this.f391065m0 = ((a) aVar).f391142p;
        this.f391067n0 = ((a) aVar).f391145q0;
        this.f391053g0 = ((a) aVar).f391141o0;
        this.f391055h0 = ((a) aVar).f391143p0;
        this.f391069o0 = ((a) aVar).f391147r0;
        this.f391071p0 = ((a) aVar).f391149s0;
        this.f391073q0 = ((a) aVar).f391151t0;
        this.f391075r0 = ((a) aVar).f391153u0;
        this.f391077s0 = ((a) aVar).f391155v0;
        this.f391040a = new l5();
        this.f391042b = new ys();
    }

    private void a(String str, Boolean bool) {
        if (bool != null) {
            a(Integer.valueOf(bool.booleanValue() ? 1 : 0), str);
        }
    }

    private void a(Object obj, String str) {
        if (obj != null) {
            StringBuilder sb2 = this.f391079t0;
            sb2.append(TextUtils.isEmpty(sb2) ? "" : ContainerUtils.FIELD_DELIMITER);
            StringBuilder sb3 = this.f391079t0;
            sb3.append(Uri.encode(str));
            sb3.append(ContainerUtils.KEY_VALUE_DELIMITER);
            if (this.f391042b.a(str)) {
                this.f391079t0.append(Uri.encode(obj.toString()));
            } else {
                this.f391079t0.append(Uri.encode(obj.toString(), ":"));
            }
        }
    }

    @j.P
    public static String a(@j.N n2 n2Var) {
        String strA = n2Var.j().a();
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return Uri.parse(strA).buildUpon().path("v4/ad").build().toString();
    }

    @j.N
    public static a a(@j.N Context context, @j.N e31 e31Var, @j.N nk nkVar) {
        ts tsVarB = nkVar.b();
        q8 q8VarA = nkVar.a();
        e31Var.getClass();
        a<?> aVarA = a(e31.c(context)).a(context).c().a(q8VarA.a(), q8VarA.c()).a(q8VarA.b());
        Integer numValueOf = null;
        try {
            Intent intentRegisterReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > -1 && intExtra2 > 0) {
                    numValueOf = Integer.valueOf(Math.round((intExtra / intExtra2) * 100.0f));
                }
            }
        } catch (Exception unused) {
        }
        a aVarA2 = aVarA.b(numValueOf).d().f(context).g(context).h(context).j(context).f().a(e31.a(context)).a(g7.f385601a);
        tsVarB.getClass();
        return aVarA2.e().a(context, tsVarB.b()).e(tsVarB.f()).d(tsVarB.d()).a(nkVar.c());
    }

    @j.N
    public static a a(@j.N Context context, @j.N n2 n2Var, @j.N e31 e31Var) {
        return a(context, e31Var, n2Var.h()).a(n2Var.a()).a(n2Var.b()).a(n2Var.d()).a(n2Var.c()).a(n2Var.m()).a(context, n2Var.n()).a(n2Var.o()).h().b(n2Var.f()).c(n2Var.g()).a(n2Var.l()).g().b().d(context).e(context).b(context).i(context).l(context).c(context).a(context, n2Var).m(context).k(context);
    }
}
