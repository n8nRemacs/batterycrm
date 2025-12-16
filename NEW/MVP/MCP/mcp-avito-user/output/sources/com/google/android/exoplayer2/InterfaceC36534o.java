package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import com.google.android.exoplayer2.C36529j;
import com.google.android.exoplayer2.audio.C36506d;
import com.google.android.exoplayer2.source.y;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.InterfaceC36589e;

/* compiled from: ExoPlayer.java */
/* renamed from: com.google.android.exoplayer2.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC36534o extends d0 {

    /* compiled from: ExoPlayer.java */
    @Deprecated
    /* renamed from: com.google.android.exoplayer2.o$a */
    public interface a {
    }

    /* compiled from: ExoPlayer.java */
    /* renamed from: com.google.android.exoplayer2.o$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Context f345771a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.util.L f345772b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.common.base.e0<k0> f345773c;

        /* renamed from: d, reason: collision with root package name */
        public com.google.common.base.e0<y.a> f345774d;

        /* renamed from: e, reason: collision with root package name */
        public final C36535p f345775e;

        /* renamed from: f, reason: collision with root package name */
        public final C36536q f345776f;

        /* renamed from: g, reason: collision with root package name */
        public final C36535p f345777g;

        /* renamed from: h, reason: collision with root package name */
        public final C36607v f345778h;

        /* renamed from: i, reason: collision with root package name */
        public final Looper f345779i;

        /* renamed from: j, reason: collision with root package name */
        public final C36506d f345780j;

        /* renamed from: k, reason: collision with root package name */
        public final int f345781k;

        /* renamed from: l, reason: collision with root package name */
        public final boolean f345782l;

        /* renamed from: m, reason: collision with root package name */
        public final l0 f345783m;

        /* renamed from: n, reason: collision with root package name */
        public final long f345784n;

        /* renamed from: o, reason: collision with root package name */
        public final long f345785o;

        /* renamed from: p, reason: collision with root package name */
        public final C36529j f345786p;

        /* renamed from: q, reason: collision with root package name */
        public final long f345787q;

        /* renamed from: r, reason: collision with root package name */
        public final long f345788r;

        /* renamed from: s, reason: collision with root package name */
        public final boolean f345789s;

        /* renamed from: t, reason: collision with root package name */
        public boolean f345790t;

        public c() {
            throw null;
        }

        public c(Context context) {
            this(context, new C36535p(context, 0), new C36535p(context, 1));
        }

        public final InterfaceC36534o a() {
            C36585a.d(!this.f345790t);
            this.f345790t = true;
            return new C(this);
        }

        public c(Context context, com.google.common.base.e0<k0> e0Var, com.google.common.base.e0<y.a> e0Var2) {
            C36535p c36535p = new C36535p(context, 3);
            C36536q c36536q = new C36536q();
            C36535p c36535p2 = new C36535p(context, 4);
            C36607v c36607v = new C36607v(1);
            this.f345771a = context;
            this.f345773c = e0Var;
            this.f345774d = e0Var2;
            this.f345775e = c36535p;
            this.f345776f = c36536q;
            this.f345777g = c36535p2;
            this.f345778h = c36607v;
            int i12 = com.google.android.exoplayer2.util.U.f348106a;
            Looper looperMyLooper = Looper.myLooper();
            this.f345779i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f345780j = C36506d.f343970h;
            this.f345781k = 1;
            this.f345782l = true;
            this.f345783m = l0.f345461c;
            this.f345784n = 5000L;
            this.f345785o = 15000L;
            C36529j.b bVar = new C36529j.b();
            this.f345786p = new C36529j(0.97f, 1.03f, 1000L, 1.0E-7f, bVar.f345441a, bVar.f345442b, bVar.f345443c, null);
            this.f345772b = InterfaceC36589e.f348123a;
            this.f345787q = 500L;
            this.f345788r = 2000L;
            this.f345789s = true;
        }
    }

    /* compiled from: ExoPlayer.java */
    @Deprecated
    /* renamed from: com.google.android.exoplayer2.o$d */
    public interface d {
    }

    /* compiled from: ExoPlayer.java */
    @Deprecated
    /* renamed from: com.google.android.exoplayer2.o$e */
    public interface e {
    }

    /* compiled from: ExoPlayer.java */
    @Deprecated
    /* renamed from: com.google.android.exoplayer2.o$f */
    public interface f {
    }

    void F(com.google.android.exoplayer2.source.y yVar);

    void H(com.google.android.exoplayer2.source.y yVar);

    void J();

    void L(com.google.android.exoplayer2.analytics.b bVar);

    @Override // com.google.android.exoplayer2.d0
    @j.P
    ExoPlaybackException a();

    void y(com.google.android.exoplayer2.analytics.b bVar);

    /* compiled from: ExoPlayer.java */
    /* renamed from: com.google.android.exoplayer2.o$b */
    public interface b {
        default void c() {
        }
    }
}
