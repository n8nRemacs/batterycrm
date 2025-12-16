package com.my.tracker.obfuscated;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import java.io.File;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: com.my.tracker.obfuscated.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37845t {

    /* renamed from: a, reason: collision with root package name */
    private boolean f365800a = false;

    /* renamed from: b, reason: collision with root package name */
    private String f365801b = "";

    /* renamed from: c, reason: collision with root package name */
    private String f365802c = "";

    /* renamed from: d, reason: collision with root package name */
    private String f365803d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f365804e = "";

    /* renamed from: f, reason: collision with root package name */
    private String f365805f = "";

    /* renamed from: g, reason: collision with root package name */
    private String f365806g = "";

    /* renamed from: h, reason: collision with root package name */
    private String f365807h = "";

    /* renamed from: i, reason: collision with root package name */
    private String f365808i = "";

    /* renamed from: j, reason: collision with root package name */
    private String f365809j = "";

    /* renamed from: k, reason: collision with root package name */
    private String f365810k = "";

    /* renamed from: l, reason: collision with root package name */
    private String f365811l = "";

    /* renamed from: m, reason: collision with root package name */
    private String f365812m = "";

    /* renamed from: n, reason: collision with root package name */
    private String f365813n = "";

    /* renamed from: o, reason: collision with root package name */
    private String f365814o = "";

    /* renamed from: p, reason: collision with root package name */
    private String f365815p = "";

    /* renamed from: q, reason: collision with root package name */
    private int f365816q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f365817r = -1;

    /* renamed from: s, reason: collision with root package name */
    private int f365818s = -1;

    /* renamed from: t, reason: collision with root package name */
    private float f365819t = Float.NaN;

    /* renamed from: u, reason: collision with root package name */
    private float f365820u = Float.NaN;

    /* renamed from: v, reason: collision with root package name */
    private float f365821v = Float.NaN;

    /* renamed from: w, reason: collision with root package name */
    private int f365822w = -1;

    /* renamed from: x, reason: collision with root package name */
    private long f365823x = -1;

    /* renamed from: y, reason: collision with root package name */
    private long f365824y = -1;

    /* renamed from: z, reason: collision with root package name */
    private int f365825z = -1;

    /* renamed from: A, reason: collision with root package name */
    private int f365799A = -1;

    /* renamed from: com.my.tracker.obfuscated.t$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final int f365826a = a() ? 1 : 0;

        /* JADX WARN: Code restructure failed: missing block: B:38:0x009b, code lost:
        
            r0 = java.util.Locale.US;
            r3 = new java.io.BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream("/proc/" + android.os.Process.myPid() + "/mounts")));
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00c6, code lost:
        
            r0 = new java.lang.String[]{"/sbin/.magisk/", "/sbin/.core/mirror", "/sbin/.core/img", "/sbin/.core/db-0/magisk.db"};
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            r4 = r3.readLine();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00d6, code lost:
        
            if (r4 == null) goto L105;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        
            r5 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00da, code lost:
        
            if (r5 >= 4) goto L106;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00e2, code lost:
        
            if (r4.contains(r0[r5]) == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        
            r5 = r5 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00eb, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
        
            r3.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x00f1, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00f3, code lost:
        
            r5 = r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
        
            if (r5 != null) goto L94;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00f8, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        
            if (r5 != null) goto L61;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        
            r5.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0101, code lost:
        
            return false;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean a() throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 258
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.C37845t.a.a():boolean");
        }
    }

    private void b(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return;
        }
        this.f365823x = filesDir.getTotalSpace();
        this.f365824y = filesDir.getFreeSpace();
    }

    private void c(Context context) {
        Display display;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null || (display = displayManager.getDisplay(0)) == null) {
            return;
        }
        Point point = new Point();
        display.getRealSize(point);
        this.f365816q = point.x;
        this.f365817r = point.y;
    }

    public void a(Context context) {
        if (this.f365800a) {
            return;
        }
        e2.a("DeviceParamsDataProvider: collect application info...");
        this.f365802c = Build.DEVICE;
        this.f365807h = Build.MANUFACTURER;
        this.f365808i = Build.MODEL;
        this.f365803d = Build.VERSION.RELEASE;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                this.f365813n = telephonyManager.getNetworkOperatorName();
                String networkOperator = telephonyManager.getNetworkOperator();
                if (TextUtils.isEmpty(networkOperator) || networkOperator.length() <= 3) {
                    this.f365812m = networkOperator;
                } else {
                    this.f365812m = networkOperator.substring(3);
                    this.f365811l = networkOperator.substring(0, 3);
                }
                if (telephonyManager.getSimState() == 5) {
                    this.f365814o = telephonyManager.getSimOperator();
                }
            }
        } catch (Throwable th2) {
            e2.a("DeviceParamsDataProvider: collecting telephony exception: ", th2);
        }
        try {
            this.f365804e = context.getPackageName();
        } catch (Throwable th3) {
            e2.a("DeviceParamsDataProvider: collecting packageName exception: ", th3);
        }
        try {
            this.f365810k = context.getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th4) {
            e2.a("DeviceParamsDataProvider: collecting app lang exception: ", th4);
        }
        try {
            PackageInfo packageInfoA = AbstractC37840n.a(context);
            if (packageInfoA != null) {
                this.f365806g = packageInfoA.versionName;
                this.f365805f = Long.toString(Build.VERSION.SDK_INT < 28 ? packageInfoA.versionCode : packageInfoA.getLongVersionCode());
            }
        } catch (Throwable th5) {
            e2.a("DeviceParamsDataProvider: collecting app package info exception: ", th5);
        }
        try {
            c(context);
        } catch (Throwable th6) {
            e2.a("DeviceParamsDataProvider: collecting screen size exception: ", th6);
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            if (displayMetrics != null) {
                this.f365818s = displayMetrics.densityDpi;
                this.f365819t = displayMetrics.density;
                this.f365820u = displayMetrics.xdpi;
                this.f365821v = displayMetrics.ydpi;
            }
        } catch (Throwable th7) {
            e2.a("DeviceParamsDataProvider: collecting display metrics exception: ", th7);
        }
        try {
            TimeZone timeZone = TimeZone.getDefault();
            this.f365815p = timeZone.getDisplayName(false, 0) + " " + timeZone.getID();
        } catch (Throwable th8) {
            e2.a("DeviceParamsDataProvider: collecting timezone exception: ", th8);
        }
        try {
            this.f365822w = a.f365826a;
        } catch (Throwable th9) {
            e2.a("DeviceParamsDataProvider: collecting isRooted exception: ", th9);
        }
        try {
            b(context);
        } catch (Throwable th10) {
            e2.a("DeviceParamsDataProvider: collecting disk info exception: ", th10);
        }
        try {
            this.f365809j = Locale.getDefault().getLanguage();
        } catch (Throwable th11) {
            e2.a("DeviceParamsDataProvider: collecting lang exception: ", th11);
        }
        try {
            this.f365825z = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen") ? 1 : 0;
        } catch (Throwable th12) {
            e2.a("DeviceParamsDataProvider: collecting touchscreen info exception: ", th12);
        }
        try {
            this.f365799A = ((UiModeManager) context.getSystemService("uimode")).getCurrentModeType();
        } catch (Throwable th13) {
            e2.a("DeviceParamsDataProvider: collecting ui mode info exception: ", th13);
        }
        this.f365801b = g2.a(context);
        this.f365800a = true;
        e2.a("DeviceParamsDataProvider: collected");
    }

    public void a(a1 a1Var, Context context) {
        if (!TextUtils.isEmpty(this.f365802c)) {
            a1Var.g(this.f365802c);
        }
        if (!TextUtils.isEmpty(this.f365807h)) {
            a1Var.l(this.f365807h);
        }
        if (!TextUtils.isEmpty(this.f365803d)) {
            a1Var.q(this.f365803d);
        }
        if (!TextUtils.isEmpty(this.f365809j)) {
            a1Var.p(this.f365809j);
        }
        if (!TextUtils.isEmpty(this.f365811l)) {
            a1Var.t(this.f365811l);
        }
        if (!TextUtils.isEmpty(this.f365808i)) {
            a1Var.h(this.f365808i);
        }
        if (!TextUtils.isEmpty(this.f365812m)) {
            a1Var.r(this.f365812m);
        }
        if (!TextUtils.isEmpty(this.f365813n)) {
            a1Var.s(this.f365813n);
        }
        if (!TextUtils.isEmpty(this.f365814o)) {
            a1Var.u(this.f365814o);
        }
        if (!TextUtils.isEmpty(this.f365815p)) {
            a1Var.v(this.f365815p);
        }
        if (!TextUtils.isEmpty(this.f365804e)) {
            a1Var.e(this.f365804e);
        }
        if (!TextUtils.isEmpty(this.f365806g)) {
            a1Var.f(this.f365806g);
        }
        if (!TextUtils.isEmpty(this.f365805f)) {
            a1Var.b(this.f365805f);
        }
        if (!TextUtils.isEmpty(this.f365810k)) {
            a1Var.d(this.f365810k);
        }
        if (!TextUtils.isEmpty(this.f365801b)) {
            a1Var.j(this.f365801b);
        }
        a1Var.l(3);
        a1Var.p(this.f365816q);
        a1Var.k(this.f365817r);
        a1Var.i(this.f365818s);
        a1Var.a(this.f365819t);
        a1Var.b(this.f365820u);
        a1Var.c(this.f365821v);
        a1Var.m(this.f365822w);
        a1Var.b(this.f365823x);
        a1Var.a(this.f365824y);
        a1Var.n(this.f365825z);
        a1Var.o(this.f365799A);
    }

    public void d(Context context) {
    }
}
