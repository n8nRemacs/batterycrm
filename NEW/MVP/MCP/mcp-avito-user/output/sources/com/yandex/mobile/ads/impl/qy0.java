package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.yandex.mobile.ads.impl.kz0;
import com.yandex.mobile.ads.impl.pk1;
import com.yandex.mobile.ads.impl.zg;
import j.InterfaceC42153i;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class qy0<T> implements Comparable<qy0<T>> {

    /* renamed from: a, reason: collision with root package name */
    private final pk1.a f389333a;

    /* renamed from: b, reason: collision with root package name */
    private final int f389334b;

    /* renamed from: c, reason: collision with root package name */
    private final String f389335c;

    /* renamed from: d, reason: collision with root package name */
    private final int f389336d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f389337e;

    /* renamed from: f, reason: collision with root package name */
    @j.B
    @j.P
    private kz0.a f389338f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f389339g;

    /* renamed from: h, reason: collision with root package name */
    private bz0 f389340h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f389341i;

    /* renamed from: j, reason: collision with root package name */
    @j.B
    private boolean f389342j;

    /* renamed from: k, reason: collision with root package name */
    @j.B
    private boolean f389343k;

    /* renamed from: l, reason: collision with root package name */
    private hp f389344l;

    /* renamed from: m, reason: collision with root package name */
    @j.P
    private zg.a f389345m;

    /* renamed from: n, reason: collision with root package name */
    private Object f389346n;

    /* renamed from: o, reason: collision with root package name */
    @j.B
    private b f389347o;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f389348b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f389349c;

        public a(String str, long j12) {
            this.f389348b = str;
            this.f389349c = j12;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qy0.this.f389333a.a(this.f389348b, this.f389349c);
            pk1.a aVar = qy0.this.f389333a;
            qy0.this.toString();
            aVar.a();
        }
    }

    public interface b {
    }

    public qy0(int i12, String str, @j.P kz0.a aVar) {
        this.f389333a = pk1.a.f388876c ? new pk1.a() : null;
        this.f389337e = new Object();
        this.f389341i = true;
        this.f389342j = false;
        this.f389343k = false;
        this.f389345m = null;
        this.f389334b = i12;
        this.f389335c = str;
        this.f389338f = aVar;
        a(new hp());
        this.f389336d = b(str);
    }

    public static String c() {
        return up1.a("application/x-www-form-urlencoded; charset=", Constants.ENCODING);
    }

    public abstract kz0<T> a(zo0 zo0Var);

    public abstract void a(T t12);

    public ok1 b(ok1 ok1Var) {
        return ok1Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        qy0 qy0Var = (qy0) obj;
        int iH2 = h();
        int iH3 = qy0Var.h();
        return iH2 == iH3 ? this.f389339g.intValue() - qy0Var.f389339g.intValue() : n6.a(iH3) - n6.a(iH2);
    }

    @j.P
    public final zg.a d() {
        return this.f389345m;
    }

    public final String e() {
        String strM = m();
        int i12 = this.f389334b;
        if (i12 == 0 || i12 == -1) {
            return strM;
        }
        return Integer.toString(i12) + '-' + strM;
    }

    public Map<String, String> f() {
        return Collections.emptyMap();
    }

    public final int g() {
        return this.f389334b;
    }

    public int h() {
        return 2;
    }

    public final hp i() {
        return this.f389344l;
    }

    public final Object j() {
        return this.f389346n;
    }

    public final int k() {
        return this.f389344l.a();
    }

    public final int l() {
        return this.f389336d;
    }

    public String m() {
        return this.f389335c;
    }

    public final boolean n() {
        boolean z12;
        synchronized (this.f389337e) {
            z12 = this.f389343k;
        }
        return z12;
    }

    public final boolean o() {
        boolean z12;
        synchronized (this.f389337e) {
            z12 = this.f389342j;
        }
        return z12;
    }

    public final void p() {
        synchronized (this.f389337e) {
            this.f389343k = true;
        }
    }

    public final void q() {
        b bVar;
        synchronized (this.f389337e) {
            bVar = this.f389347o;
        }
        if (bVar != null) {
            ((al1) bVar).b(this);
        }
    }

    public final void r() {
        this.f389341i = false;
    }

    public final boolean s() {
        return this.f389341i;
    }

    public final String toString() {
        String strM = androidx.appcompat.app.r.m(this.f389336d, Cif.a("0x"));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(o() ? "[X] " : "[ ] ");
        sb2.append(m());
        sb2.append(" ");
        sb2.append(strM);
        sb2.append(" ");
        sb2.append(sy0.a(h()));
        sb2.append(" ");
        sb2.append(this.f389339g);
        return sb2.toString();
    }

    public final void a(hp hpVar) {
        this.f389344l = hpVar;
    }

    public byte[] b() {
        return null;
    }

    public final void c(String str) {
        bz0 bz0Var = this.f389340h;
        if (bz0Var != null) {
            bz0Var.b(this);
        }
        if (pk1.a.f388876c) {
            long id2 = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new a(str, id2));
                return;
            }
            this.f389333a.a(str, id2);
            pk1.a aVar = this.f389333a;
            toString();
            aVar.a();
        }
    }

    public final void a(String str) {
        if (pk1.a.f388876c) {
            this.f389333a.a(str, Thread.currentThread().getId());
        }
    }

    public final void b(Object obj) {
        this.f389346n = obj;
    }

    private static int b(String str) {
        Uri uri;
        String host;
        if (TextUtils.isEmpty(str) || (uri = Uri.parse(str)) == null || (host = uri.getHost()) == null) {
            return 0;
        }
        return host.hashCode();
    }

    public final void a(int i12) {
        bz0 bz0Var = this.f389340h;
        if (bz0Var != null) {
            bz0Var.a(this, i12);
        }
    }

    public final void a(bz0 bz0Var) {
        this.f389340h = bz0Var;
    }

    public final void a(zg.a aVar) {
        this.f389345m = aVar;
    }

    public final void b(int i12) {
        this.f389339g = Integer.valueOf(i12);
    }

    @InterfaceC42153i
    public void a() {
        synchronized (this.f389337e) {
            this.f389342j = true;
            this.f389338f = null;
        }
    }

    public final void a(ok1 ok1Var) {
        kz0.a aVar;
        synchronized (this.f389337e) {
            aVar = this.f389338f;
        }
        if (aVar != null) {
            aVar.a(ok1Var);
        }
    }

    public final void a(b bVar) {
        synchronized (this.f389337e) {
            this.f389347o = bVar;
        }
    }

    public final void a(kz0<?> kz0Var) {
        b bVar;
        synchronized (this.f389337e) {
            bVar = this.f389347o;
        }
        if (bVar != null) {
            ((al1) bVar).a(this, kz0Var);
        }
    }
}
