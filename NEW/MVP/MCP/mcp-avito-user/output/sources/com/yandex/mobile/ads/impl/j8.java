package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.b8;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public final class j8 implements p00 {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final List<g8> f386774a = a();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private l8 f386775b;

    public class a implements Runnable {
        private a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            j8.b(j8.this);
        }

        public /* synthetic */ a(j8 j8Var, int i12) {
            this();
        }
    }

    public class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (j8.this.f386775b != null) {
                b8.c(b8.this);
            }
        }

        public /* synthetic */ b(j8 j8Var, int i12) {
            this();
        }
    }

    public static void b(j8 j8Var) {
        l8 l8Var = j8Var.f386775b;
        if (l8Var != null) {
            b8.a aVar = (b8.a) l8Var;
            b8.this.f383811d.a();
            b8.this.f383809b.dismiss();
        }
    }

    public final void a(@j.N String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            for (g8 g8Var : this.f386774a) {
                if (g8Var.a(scheme, host)) {
                    g8Var.a();
                    return;
                }
            }
            l8 l8Var = this.f386775b;
            if (l8Var != null) {
                b8.this.f383812e.a(str);
            }
        } catch (URISyntaxException unused) {
            l8 l8Var2 = this.f386775b;
            if (l8Var2 != null) {
                b8.a aVar = (b8.a) l8Var2;
                b8.this.f383811d.a();
                b8.this.f383809b.dismiss();
            }
        }
    }

    public final void a(@j.N l8 l8Var) {
        this.f386775b = l8Var;
    }

    public final void a(int i12) {
        l8 l8Var;
        if (!new k8().a(i12) || (l8Var = this.f386775b) == null) {
            return;
        }
        b8.a aVar = (b8.a) l8Var;
        b8.this.f383811d.a();
        b8.this.f383809b.dismiss();
    }

    @j.N
    private List<g8> a() {
        int i12 = 0;
        return Arrays.asList(new m8("adtuneRendered", new b(this, i12)), new m8("adtuneClosed", new a(this, i12)));
    }
}
