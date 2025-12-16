package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.AbstractC37412t1;
import com.google.common.collect.W1;
import j.P;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

/* compiled from: HlsMediaPlaylist.java */
/* loaded from: classes6.dex */
public final class f extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f346468d;

    /* renamed from: e, reason: collision with root package name */
    public final long f346469e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f346470f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f346471g;

    /* renamed from: h, reason: collision with root package name */
    public final long f346472h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f346473i;

    /* renamed from: j, reason: collision with root package name */
    public final int f346474j;

    /* renamed from: k, reason: collision with root package name */
    public final long f346475k;

    /* renamed from: l, reason: collision with root package name */
    public final int f346476l;

    /* renamed from: m, reason: collision with root package name */
    public final long f346477m;

    /* renamed from: n, reason: collision with root package name */
    public final long f346478n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f346479o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f346480p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public final DrmInitData f346481q;

    /* renamed from: r, reason: collision with root package name */
    public final AbstractC37401r1 f346482r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC37401r1 f346483s;

    /* renamed from: t, reason: collision with root package name */
    public final AbstractC37412t1 f346484t;

    /* renamed from: u, reason: collision with root package name */
    public final long f346485u;

    /* renamed from: v, reason: collision with root package name */
    public final g f346486v;

    /* compiled from: HlsMediaPlaylist.java */
    public static final class b extends C10596f {

        /* renamed from: m, reason: collision with root package name */
        public final boolean f346487m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f346488n;

        public b(String str, @P e eVar, long j12, int i12, long j13, @P DrmInitData drmInitData, @P String str2, @P String str3, long j14, long j15, boolean z12, boolean z13, boolean z14) {
            super(str, eVar, j12, i12, j13, drmInitData, str2, str3, j14, j15, z12, null);
            this.f346487m = z13;
            this.f346488n = z14;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f346489a;

        /* renamed from: b, reason: collision with root package name */
        public final long f346490b;

        /* renamed from: c, reason: collision with root package name */
        public final int f346491c;

        public d(Uri uri, long j12, int i12) {
            this.f346489a = uri;
            this.f346490b = j12;
            this.f346491c = i12;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    /* renamed from: com.google.android.exoplayer2.source.hls.playlist.f$f, reason: collision with other inner class name */
    public static class C10596f implements Comparable<Long> {

        /* renamed from: b, reason: collision with root package name */
        public final String f346494b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public final e f346495c;

        /* renamed from: d, reason: collision with root package name */
        public final long f346496d;

        /* renamed from: e, reason: collision with root package name */
        public final int f346497e;

        /* renamed from: f, reason: collision with root package name */
        public final long f346498f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public final DrmInitData f346499g;

        /* renamed from: h, reason: collision with root package name */
        @P
        public final String f346500h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public final String f346501i;

        /* renamed from: j, reason: collision with root package name */
        public final long f346502j;

        /* renamed from: k, reason: collision with root package name */
        public final long f346503k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f346504l;

        public C10596f(String str, e eVar, long j12, int i12, long j13, DrmInitData drmInitData, String str2, String str3, long j14, long j15, boolean z12, a aVar) {
            this.f346494b = str;
            this.f346495c = eVar;
            this.f346496d = j12;
            this.f346497e = i12;
            this.f346498f = j13;
            this.f346499g = drmInitData;
            this.f346500h = str2;
            this.f346501i = str3;
            this.f346502j = j14;
            this.f346503k = j15;
            this.f346504l = z12;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Long l12) {
            Long l13 = l12;
            long jLongValue = l13.longValue();
            long j12 = this.f346498f;
            if (j12 > jLongValue) {
                return 1;
            }
            return j12 < l13.longValue() ? -1 : 0;
        }
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final long f346505a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f346506b;

        /* renamed from: c, reason: collision with root package name */
        public final long f346507c;

        /* renamed from: d, reason: collision with root package name */
        public final long f346508d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f346509e;

        public g(long j12, boolean z12, long j13, long j14, boolean z13) {
            this.f346505a = j12;
            this.f346506b = z12;
            this.f346507c = j13;
            this.f346508d = j14;
            this.f346509e = z13;
        }
    }

    public f(int i12, String str, List<String> list, long j12, boolean z12, long j13, boolean z13, int i13, long j14, int i14, long j15, long j16, boolean z14, boolean z15, boolean z16, @P DrmInitData drmInitData, List<e> list2, List<b> list3, g gVar, Map<Uri, d> map) {
        super(str, list, z14);
        this.f346468d = i12;
        this.f346472h = j13;
        this.f346471g = z12;
        this.f346473i = z13;
        this.f346474j = i13;
        this.f346475k = j14;
        this.f346476l = i14;
        this.f346477m = j15;
        this.f346478n = j16;
        this.f346479o = z15;
        this.f346480p = z16;
        this.f346481q = drmInitData;
        this.f346482r = AbstractC37401r1.v(list2);
        this.f346483s = AbstractC37401r1.v(list3);
        this.f346484t = AbstractC37412t1.c(map);
        if (!list3.isEmpty()) {
            b bVar = (b) W1.d(list3);
            this.f346485u = bVar.f346498f + bVar.f346496d;
        } else if (list2.isEmpty()) {
            this.f346485u = 0L;
        } else {
            e eVar = (e) W1.d(list2);
            this.f346485u = eVar.f346498f + eVar.f346496d;
        }
        this.f346469e = j12 != -9223372036854775807L ? j12 >= 0 ? Math.min(this.f346485u, j12) : Math.max(0L, this.f346485u + j12) : -9223372036854775807L;
        this.f346470f = j12 >= 0;
        this.f346486v = gVar;
    }

    /* compiled from: HlsMediaPlaylist.java */
    public static final class e extends C10596f {

        /* renamed from: m, reason: collision with root package name */
        public final String f346492m;

        /* renamed from: n, reason: collision with root package name */
        public final AbstractC37401r1 f346493n;

        public e(long j12, String str, @P String str2, @P String str3, long j13) {
            this(str, null, "", 0L, -1, -9223372036854775807L, null, str2, str3, j12, j13, false, AbstractC37401r1.C());
        }

        public e(String str, @P e eVar, String str2, long j12, int i12, long j13, @P DrmInitData drmInitData, @P String str3, @P String str4, long j14, long j15, boolean z12, List<b> list) {
            super(str, eVar, j12, i12, j13, drmInitData, str3, str4, j14, j15, z12, null);
            this.f346492m = str2;
            this.f346493n = AbstractC37401r1.v(list);
        }
    }

    @Override // com.google.android.exoplayer2.offline.m
    public final h a(List list) {
        return this;
    }
}
