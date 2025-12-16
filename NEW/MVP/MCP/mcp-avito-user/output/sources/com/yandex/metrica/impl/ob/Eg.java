package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

/* loaded from: classes7.dex */
public class Eg {

    /* renamed from: a, reason: collision with root package name */
    private String f378054a;

    /* renamed from: b, reason: collision with root package name */
    private U f378055b;

    /* renamed from: c, reason: collision with root package name */
    private C38717c2 f378056c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final String f378057d = y();

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private String f378058e = C38842h2.a();

    /* renamed from: f, reason: collision with root package name */
    private String f378059f;

    /* renamed from: g, reason: collision with root package name */
    private String f378060g;

    /* renamed from: h, reason: collision with root package name */
    private Ab f378061h;

    /* renamed from: i, reason: collision with root package name */
    @j.N
    private C39289zb f378062i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    private String f378063j;

    /* renamed from: k, reason: collision with root package name */
    private String f378064k;

    /* renamed from: l, reason: collision with root package name */
    private C39057pi f378065l;

    public static abstract class a<I, O> implements Dg<I, O> {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        public final String f378066a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        public final String f378067b;

        /* renamed from: c, reason: collision with root package name */
        @j.P
        public final String f378068c;

        public a(@j.P String str, @j.P String str2, @j.P String str3) {
            this.f378066a = str;
            this.f378067b = str2;
            this.f378068c = str3;
        }
    }

    public static abstract class b<T extends Eg, A extends a> implements d<T, c<A>> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        final Context f378069a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        final String f378070b;

        public b(@j.N Context context, @j.N String str) {
            this.f378069a = context;
            this.f378070b = str;
        }

        @j.N
        public abstract T a();
    }

    public static class c<A> {

        /* renamed from: a, reason: collision with root package name */
        @j.N
        public final C39057pi f378071a;

        /* renamed from: b, reason: collision with root package name */
        @j.N
        public final A f378072b;

        public c(@j.N C39057pi c39057pi, A a12) {
            this.f378071a = c39057pi;
            this.f378072b = a12;
        }
    }

    public interface d<T extends Eg, D> {
        @j.N
        T a(D d12);
    }

    @j.N
    private static String y() {
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty("public")) {
            sb2.append("public");
        }
        if (!TextUtils.isEmpty("binary")) {
            sb2.append("_binary");
        }
        if (!TextUtils.isEmpty("")) {
            sb2.append("_");
        }
        return sb2.toString();
    }

    public void a(U u12) {
        this.f378055b = u12;
    }

    public String b() {
        String str = this.f378060g;
        return str == null ? "" : str;
    }

    @j.N
    public String c() {
        return this.f378058e;
    }

    @j.N
    public synchronized String d() {
        String strA;
        Ab ab2 = this.f378061h;
        strA = ab2 == null ? null : ab2.a();
        if (strA == null) {
            strA = "";
        }
        return strA;
    }

    public void e(String str) {
        this.f378054a = str;
    }

    public String f() {
        String str = this.f378059f;
        return str == null ? "" : str;
    }

    @j.N
    public synchronized String g() {
        String strI;
        strI = this.f378065l.i();
        if (strI == null) {
            strI = "";
        }
        return strI;
    }

    @j.N
    public String h() {
        return this.f378055b.f379565e;
    }

    @j.N
    public String i() {
        String str = this.f378063j;
        return str == null ? "phone" : str;
    }

    @j.N
    public String j() {
        return this.f378057d;
    }

    @j.N
    public String k() {
        String str = this.f378064k;
        return str == null ? "" : str;
    }

    @j.N
    public String l() {
        String str = this.f378055b.f379561a;
        return str == null ? "" : str;
    }

    @j.N
    public String m() {
        return this.f378055b.f379562b;
    }

    public int n() {
        return this.f378055b.f379564d;
    }

    @j.N
    public String o() {
        return this.f378055b.f379563c;
    }

    public String p() {
        return this.f378054a;
    }

    @j.N
    public RetryPolicyConfig q() {
        return this.f378065l.J();
    }

    public float r() {
        return this.f378056c.d();
    }

    public int s() {
        return this.f378056c.b();
    }

    public int t() {
        return this.f378056c.c();
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f378054a + "', mConstantDeviceInfo=" + this.f378055b + ", screenInfo=" + this.f378056c + ", mSdkVersionName='5.3.0', mSdkBuildNumber='45003240', mSdkBuildType='" + this.f378057d + "', mAppPlatform='android', mProtocolVersion='2', mAppFramework='" + this.f378058e + "', mCommitHash='a72bf6f57701ed3c2b8ed570054febbff4e58c12', mAppVersion='" + this.f378059f + "', mAppBuildNumber='" + this.f378060g + "', appSetId=" + this.f378061h + ", mAdvertisingIdsHolder=" + this.f378062i + ", mDeviceType='" + this.f378063j + "', mLocale='" + this.f378064k + "', mStartupState=" + this.f378065l + '}';
    }

    public int u() {
        return this.f378056c.e();
    }

    public C39057pi v() {
        return this.f378065l;
    }

    @j.N
    public synchronized String w() {
        String strV;
        strV = this.f378065l.V();
        if (strV == null) {
            strV = "";
        }
        return strV;
    }

    public synchronized boolean x() {
        return C39007ni.a(this.f378065l);
    }

    public void a(@j.N C38717c2 c38717c2) {
        this.f378056c = c38717c2;
    }

    public void b(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f378059f = str;
    }

    public void c(@j.P String str) {
        this.f378063j = str;
    }

    public final void d(String str) {
        this.f378064k = str;
    }

    @j.N
    public synchronized String e() {
        String str;
        Ab ab2 = this.f378061h;
        str = ab2 == null ? null : ab2.b().f377555b;
        if (str == null) {
            str = "";
        }
        return str;
    }

    public void a(C39057pi c39057pi) {
        this.f378065l = c39057pi;
    }

    public void a(@j.P String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f378060g = str;
    }

    public synchronized void a(@j.N Ab ab2) {
        this.f378061h = ab2;
    }

    @j.N
    public C39289zb a() {
        return this.f378062i;
    }

    public void a(@j.N C39289zb c39289zb) {
        this.f378062i = c39289zb;
    }
}
