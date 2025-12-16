package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Request.java */
/* loaded from: classes7.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f366289a;

    /* renamed from: b, reason: collision with root package name */
    public final int f366290b;

    /* renamed from: c, reason: collision with root package name */
    public final String f366291c;

    /* renamed from: d, reason: collision with root package name */
    public final List<I> f366292d;

    /* renamed from: e, reason: collision with root package name */
    public final int f366293e;

    /* renamed from: f, reason: collision with root package name */
    public final int f366294f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f366295g;

    /* renamed from: h, reason: collision with root package name */
    public final int f366296h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f366297i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f366298j;

    /* renamed from: k, reason: collision with root package name */
    public final float f366299k;

    /* renamed from: l, reason: collision with root package name */
    public final float f366300l;

    /* renamed from: m, reason: collision with root package name */
    public final float f366301m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f366302n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f366303o;

    /* renamed from: p, reason: collision with root package name */
    public final Bitmap.Config f366304p;

    /* renamed from: q, reason: collision with root package name */
    public final Picasso.Priority f366305q;

    static {
        TimeUnit.SECONDS.toNanos(5L);
    }

    public A() {
        throw null;
    }

    public A(Uri uri, int i12, String str, List list, int i13, int i14, boolean z12, boolean z13, int i15, boolean z14, float f12, float f13, float f14, boolean z15, boolean z16, Bitmap.Config config, Picasso.Priority priority, a aVar) {
        this.f366289a = uri;
        this.f366290b = i12;
        this.f366291c = str;
        if (list == null) {
            this.f366292d = null;
        } else {
            this.f366292d = Collections.unmodifiableList(list);
        }
        this.f366293e = i13;
        this.f366294f = i14;
        this.f366295g = z12;
        this.f366297i = z13;
        this.f366296h = i15;
        this.f366298j = z14;
        this.f366299k = f12;
        this.f366300l = f13;
        this.f366301m = f14;
        this.f366302n = z15;
        this.f366303o = z16;
        this.f366304p = config;
        this.f366305q = priority;
    }

    public final boolean a() {
        return (this.f366293e == 0 && this.f366294f == 0) ? false : true;
    }

    public final boolean b() {
        return a() || this.f366299k != 0.0f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request{");
        int i12 = this.f366290b;
        if (i12 > 0) {
            sb2.append(i12);
        } else {
            sb2.append(this.f366289a);
        }
        List<I> list = this.f366292d;
        if (list != null && !list.isEmpty()) {
            for (I i13 : list) {
                sb2.append(' ');
                sb2.append(i13.key());
            }
        }
        String str = this.f366291c;
        if (str != null) {
            sb2.append(" stableKey(");
            sb2.append(str);
            sb2.append(')');
        }
        int i14 = this.f366293e;
        if (i14 > 0) {
            sb2.append(" resize(");
            sb2.append(i14);
            sb2.append(',');
            sb2.append(this.f366294f);
            sb2.append(')');
        }
        if (this.f366295g) {
            sb2.append(" centerCrop");
        }
        if (this.f366297i) {
            sb2.append(" centerInside");
        }
        float f12 = this.f366299k;
        if (f12 != 0.0f) {
            sb2.append(" rotation(");
            sb2.append(f12);
            if (this.f366302n) {
                sb2.append(" @ ");
                sb2.append(this.f366300l);
                sb2.append(',');
                sb2.append(this.f366301m);
            }
            sb2.append(')');
        }
        if (this.f366303o) {
            sb2.append(" purgeable");
        }
        Bitmap.Config config = this.f366304p;
        if (config != null) {
            sb2.append(' ');
            sb2.append(config);
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* compiled from: Request.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Uri f366306a;

        /* renamed from: b, reason: collision with root package name */
        public int f366307b;

        /* renamed from: c, reason: collision with root package name */
        public final String f366308c;

        /* renamed from: d, reason: collision with root package name */
        public int f366309d;

        /* renamed from: e, reason: collision with root package name */
        public int f366310e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f366311f;

        /* renamed from: g, reason: collision with root package name */
        public final int f366312g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f366313h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f366314i;

        /* renamed from: j, reason: collision with root package name */
        public final float f366315j;

        /* renamed from: k, reason: collision with root package name */
        public final float f366316k;

        /* renamed from: l, reason: collision with root package name */
        public final float f366317l;

        /* renamed from: m, reason: collision with root package name */
        public final boolean f366318m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f366319n;

        /* renamed from: o, reason: collision with root package name */
        public final ArrayList f366320o;

        /* renamed from: p, reason: collision with root package name */
        public final Bitmap.Config f366321p;

        /* renamed from: q, reason: collision with root package name */
        public Picasso.Priority f366322q;

        public b(Uri uri) {
            this.f366306a = uri;
            this.f366307b = 0;
            this.f366321p = null;
        }

        public final A a() {
            boolean z12 = this.f366311f;
            boolean z13 = this.f366313h;
            if (z13 && z12) {
                throw new IllegalStateException("Center crop and center inside can not be used together.");
            }
            if (z12 && this.f366309d == 0 && this.f366310e == 0) {
                throw new IllegalStateException("Center crop requires calling resize with positive width and height.");
            }
            if (z13 && this.f366309d == 0 && this.f366310e == 0) {
                throw new IllegalStateException("Center inside requires calling resize with positive width and height.");
            }
            if (this.f366322q == null) {
                this.f366322q = Picasso.Priority.f366381c;
            }
            return new A(this.f366306a, this.f366307b, this.f366308c, this.f366320o, this.f366309d, this.f366310e, this.f366311f, this.f366313h, this.f366312g, this.f366314i, this.f366315j, this.f366316k, this.f366317l, this.f366318m, this.f366319n, this.f366321p, this.f366322q, null);
        }

        public b(A a12, a aVar) {
            this.f366306a = a12.f366289a;
            this.f366307b = a12.f366290b;
            this.f366308c = a12.f366291c;
            this.f366309d = a12.f366293e;
            this.f366310e = a12.f366294f;
            this.f366311f = a12.f366295g;
            this.f366313h = a12.f366297i;
            this.f366312g = a12.f366296h;
            this.f366315j = a12.f366299k;
            this.f366316k = a12.f366300l;
            this.f366317l = a12.f366301m;
            this.f366318m = a12.f366302n;
            this.f366319n = a12.f366303o;
            this.f366314i = a12.f366298j;
            List<I> list = a12.f366292d;
            if (list != null) {
                this.f366320o = new ArrayList(list);
            }
            this.f366321p = a12.f366304p;
            this.f366322q = a12.f366305q;
        }
    }
}
