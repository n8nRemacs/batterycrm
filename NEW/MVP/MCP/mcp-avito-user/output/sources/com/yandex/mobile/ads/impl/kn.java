package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public final class kn {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f387191k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f387192a;

    /* renamed from: b, reason: collision with root package name */
    public final long f387193b;

    /* renamed from: c, reason: collision with root package name */
    public final int f387194c;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public final byte[] f387195d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, String> f387196e;

    /* renamed from: f, reason: collision with root package name */
    public final long f387197f;

    /* renamed from: g, reason: collision with root package name */
    public final long f387198g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    public final String f387199h;

    /* renamed from: i, reason: collision with root package name */
    public final int f387200i;

    /* renamed from: j, reason: collision with root package name */
    @j.P
    public final Object f387201j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @j.P
        private Uri f387202a;

        /* renamed from: b, reason: collision with root package name */
        private long f387203b;

        /* renamed from: c, reason: collision with root package name */
        private int f387204c;

        /* renamed from: d, reason: collision with root package name */
        @j.P
        private byte[] f387205d;

        /* renamed from: e, reason: collision with root package name */
        private Map<String, String> f387206e;

        /* renamed from: f, reason: collision with root package name */
        private long f387207f;

        /* renamed from: g, reason: collision with root package name */
        private long f387208g;

        /* renamed from: h, reason: collision with root package name */
        @j.P
        private String f387209h;

        /* renamed from: i, reason: collision with root package name */
        private int f387210i;

        /* renamed from: j, reason: collision with root package name */
        @j.P
        private Object f387211j;

        public /* synthetic */ a(kn knVar, int i12) {
            this(knVar);
        }

        public final a a(Uri uri) {
            this.f387202a = uri;
            return this;
        }

        public final a b(String str) {
            this.f387202a = Uri.parse(str);
            return this;
        }

        public final a c(long j12) {
            this.f387203b = j12;
            return this;
        }

        public a() {
            this.f387204c = 1;
            this.f387206e = Collections.emptyMap();
            this.f387208g = -1L;
        }

        public final a a(@j.P byte[] bArr) {
            this.f387205d = bArr;
            return this;
        }

        public final a b() {
            this.f387204c = 2;
            return this;
        }

        public final a a(Map<String, String> map) {
            this.f387206e = map;
            return this;
        }

        public final a b(long j12) {
            this.f387207f = j12;
            return this;
        }

        public final a a(long j12) {
            this.f387208g = j12;
            return this;
        }

        public final a a(@j.P String str) {
            this.f387209h = str;
            return this;
        }

        private a(kn knVar) {
            this.f387202a = knVar.f387192a;
            this.f387203b = knVar.f387193b;
            this.f387204c = knVar.f387194c;
            this.f387205d = knVar.f387195d;
            this.f387206e = knVar.f387196e;
            this.f387207f = knVar.f387197f;
            this.f387208g = knVar.f387198g;
            this.f387209h = knVar.f387199h;
            this.f387210i = knVar.f387200i;
            this.f387211j = knVar.f387201j;
        }

        public final a a(int i12) {
            this.f387210i = i12;
            return this;
        }

        public final kn a() {
            if (this.f387202a != null) {
                return new kn(this.f387202a, this.f387203b, this.f387204c, this.f387205d, this.f387206e, this.f387207f, this.f387208g, this.f387209h, this.f387210i, this.f387211j, 0);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }

    static {
        st.a("goog.exo.datasource");
    }

    public /* synthetic */ kn(Uri uri, long j12, int i12, byte[] bArr, Map map, long j13, long j14, String str, int i13, Object obj, int i14) {
        this(uri, j12, i12, bArr, map, j13, j14, str, i13, obj);
    }

    public final boolean a(int i12) {
        return (this.f387200i & i12) == i12;
    }

    public final String b() {
        int i12 = this.f387194c;
        if (i12 == 1) {
            return "GET";
        }
        if (i12 == 2) {
            return "POST";
        }
        if (i12 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final String toString() {
        String str;
        StringBuilder sbA = Cif.a("DataSpec[");
        int i12 = this.f387194c;
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
        sbA.append(str);
        sbA.append(" ");
        sbA.append(this.f387192a);
        sbA.append(", ");
        sbA.append(this.f387197f);
        sbA.append(", ");
        sbA.append(this.f387198g);
        sbA.append(", ");
        sbA.append(this.f387199h);
        sbA.append(", ");
        return AK.c.i(this.f387200i, "]", sbA);
    }

    private kn(Uri uri, long j12, int i12, @j.P byte[] bArr, Map<String, String> map, long j13, long j14, @j.P String str, int i13, @j.P Object obj) {
        byte[] bArr2 = bArr;
        db.a(j12 + j13 >= 0);
        db.a(j13 >= 0);
        db.a(j14 > 0 || j14 == -1);
        this.f387192a = uri;
        this.f387193b = j12;
        this.f387194c = i12;
        this.f387195d = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f387196e = Collections.unmodifiableMap(new HashMap(map));
        this.f387197f = j13;
        this.f387198g = j14;
        this.f387199h = str;
        this.f387200i = i13;
        this.f387201j = obj;
    }

    public final a a() {
        return new a(this, 0);
    }

    public final kn a(long j12) {
        return this.f387198g == j12 ? this : new kn(this.f387192a, this.f387193b, this.f387194c, this.f387195d, this.f387196e, this.f387197f, j12, this.f387199h, this.f387200i, this.f387201j);
    }
}
