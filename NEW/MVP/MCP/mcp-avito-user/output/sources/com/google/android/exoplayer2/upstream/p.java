package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.util.C36585a;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: DataSpec.java */
/* loaded from: classes6.dex */
public final class p {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f347928k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f347929a;

    /* renamed from: b, reason: collision with root package name */
    public final long f347930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f347931c;

    /* renamed from: d, reason: collision with root package name */
    @P
    public final byte[] f347932d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f347933e;

    /* renamed from: f, reason: collision with root package name */
    public final long f347934f;

    /* renamed from: g, reason: collision with root package name */
    public final long f347935g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public final String f347936h;

    /* renamed from: i, reason: collision with root package name */
    public final int f347937i;

    /* renamed from: j, reason: collision with root package name */
    @P
    public final Object f347938j;

    /* compiled from: DataSpec.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: DataSpec.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    static {
        com.google.android.exoplayer2.H.a("goog.exo.datasource");
    }

    public final b a() {
        return new b(this, null);
    }

    public final p b(long j12, long j13) {
        if (j12 == 0 && this.f347935g == j13) {
            return this;
        }
        return new p(this.f347929a, this.f347930b, this.f347931c, this.f347932d, this.f347933e, this.f347934f + j12, j13, this.f347936h, this.f347937i, this.f347938j);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i12 = this.f347931c;
        if (i12 == 1) {
            str = "GET";
        } else if (i12 == 2) {
            str = "POST";
        } else {
            if (i12 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f347929a);
        sb2.append(", ");
        sb2.append(this.f347934f);
        sb2.append(", ");
        sb2.append(this.f347935g);
        sb2.append(", ");
        sb2.append(this.f347936h);
        sb2.append(", ");
        return AK.c.i(this.f347937i, "]", sb2);
    }

    public p(Uri uri, long j12, long j13) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j12, j13, null, 0, null);
    }

    /* compiled from: DataSpec.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @P
        public Uri f347939a;

        /* renamed from: b, reason: collision with root package name */
        public long f347940b;

        /* renamed from: c, reason: collision with root package name */
        public int f347941c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public byte[] f347942d;

        /* renamed from: e, reason: collision with root package name */
        public Map<String, String> f347943e;

        /* renamed from: f, reason: collision with root package name */
        public long f347944f;

        /* renamed from: g, reason: collision with root package name */
        public long f347945g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public String f347946h;

        /* renamed from: i, reason: collision with root package name */
        public int f347947i;

        /* renamed from: j, reason: collision with root package name */
        @P
        public final Object f347948j;

        public b() {
            this.f347941c = 1;
            this.f347943e = Collections.emptyMap();
            this.f347945g = -1L;
        }

        public final p a() {
            if (this.f347939a != null) {
                return new p(this.f347939a, this.f347940b, this.f347941c, this.f347942d, this.f347943e, this.f347944f, this.f347945g, this.f347946h, this.f347947i, this.f347948j);
            }
            throw new IllegalStateException("The uri must be set.");
        }

        public b(p pVar, a aVar) {
            this.f347939a = pVar.f347929a;
            this.f347940b = pVar.f347930b;
            this.f347941c = pVar.f347931c;
            this.f347942d = pVar.f347932d;
            this.f347943e = pVar.f347933e;
            this.f347944f = pVar.f347934f;
            this.f347945g = pVar.f347935g;
            this.f347946h = pVar.f347936h;
            this.f347947i = pVar.f347937i;
            this.f347948j = pVar.f347938j;
        }
    }

    public p(Uri uri, long j12, int i12, @P byte[] bArr, Map<String, String> map, long j13, long j14, @P String str, int i13, @P Object obj) {
        byte[] bArr2 = bArr;
        C36585a.b(j12 + j13 >= 0);
        C36585a.b(j13 >= 0);
        C36585a.b(j14 > 0 || j14 == -1);
        this.f347929a = uri;
        this.f347930b = j12;
        this.f347931c = i12;
        this.f347932d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f347933e = Collections.unmodifiableMap(new HashMap(map));
        this.f347934f = j13;
        this.f347935g = j14;
        this.f347936h = str;
        this.f347937i = i13;
        this.f347938j = obj;
    }
}
