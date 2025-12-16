package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import androidx.media3.common.C23091e;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.InterfaceC23115f;
import androidx.media3.exoplayer.C23140i;
import androidx.media3.exoplayer.source.A;
import androidx.media3.exoplayer.source.C23161l;

/* compiled from: ExoPlayer.java */
/* renamed from: androidx.media3.exoplayer.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC23144m extends androidx.media3.common.H {

    /* compiled from: ExoPlayer.java */
    @androidx.media3.common.util.J
    @Deprecated
    /* renamed from: androidx.media3.exoplayer.m$a */
    public interface a {
    }

    /* compiled from: ExoPlayer.java */
    /* renamed from: androidx.media3.exoplayer.m$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Context f49222a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.media3.common.util.D f49223b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.common.base.e0<f0> f49224c;

        /* renamed from: d, reason: collision with root package name */
        public com.google.common.base.e0<A.a> f49225d;

        /* renamed from: e, reason: collision with root package name */
        public final C23145n f49226e;

        /* renamed from: f, reason: collision with root package name */
        public final C23146o f49227f;

        /* renamed from: g, reason: collision with root package name */
        public final C23145n f49228g;

        /* renamed from: h, reason: collision with root package name */
        public final C23179x f49229h;

        /* renamed from: i, reason: collision with root package name */
        public final Looper f49230i;

        /* renamed from: j, reason: collision with root package name */
        public C23091e f49231j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f49232k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f49233l;

        /* renamed from: m, reason: collision with root package name */
        public final int f49234m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f49235n;

        /* renamed from: o, reason: collision with root package name */
        public final g0 f49236o;

        /* renamed from: p, reason: collision with root package name */
        public final long f49237p;

        /* renamed from: q, reason: collision with root package name */
        public final long f49238q;

        /* renamed from: r, reason: collision with root package name */
        public final C23140i f49239r;

        /* renamed from: s, reason: collision with root package name */
        public final long f49240s;

        /* renamed from: t, reason: collision with root package name */
        public final long f49241t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f49242u;

        /* renamed from: v, reason: collision with root package name */
        public boolean f49243v;

        public c() {
            throw null;
        }

        @androidx.media3.common.util.J
        public c(Context context, C23161l c23161l) {
            this(context, new C23145n(context, 0), new C(c23161l, 1));
        }

        public final InterfaceC23144m a() {
            C23110a.g(!this.f49243v);
            this.f49243v = true;
            return new A(this);
        }

        public c(Context context, com.google.common.base.e0<f0> e0Var, com.google.common.base.e0<A.a> e0Var2) {
            C23145n c23145n = new C23145n(context, 3);
            C23146o c23146o = new C23146o();
            C23145n c23145n2 = new C23145n(context, 4);
            C23179x c23179x = new C23179x(2);
            context.getClass();
            this.f49222a = context;
            this.f49224c = e0Var;
            this.f49225d = e0Var2;
            this.f49226e = c23145n;
            this.f49227f = c23146o;
            this.f49228g = c23145n2;
            this.f49229h = c23179x;
            int i12 = androidx.media3.common.util.M.f47887a;
            Looper looperMyLooper = Looper.myLooper();
            this.f49230i = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
            this.f49231j = C23091e.f47644h;
            this.f49234m = 1;
            this.f49235n = true;
            this.f49236o = g0.f49167c;
            this.f49237p = 5000L;
            this.f49238q = 15000L;
            C23140i.b bVar = new C23140i.b();
            this.f49239r = new C23140i(0.97f, 1.03f, 1000L, 1.0E-7f, bVar.f49194a, bVar.f49195b, bVar.f49196c, null);
            this.f49223b = InterfaceC23115f.f47901a;
            this.f49240s = 500L;
            this.f49241t = 2000L;
            this.f49242u = true;
        }
    }

    /* compiled from: ExoPlayer.java */
    @androidx.media3.common.util.J
    @Deprecated
    /* renamed from: androidx.media3.exoplayer.m$d */
    public interface d {
    }

    /* compiled from: ExoPlayer.java */
    @androidx.media3.common.util.J
    @Deprecated
    /* renamed from: androidx.media3.exoplayer.m$e */
    public interface e {
    }

    /* compiled from: ExoPlayer.java */
    @androidx.media3.common.util.J
    @Deprecated
    /* renamed from: androidx.media3.exoplayer.m$f */
    public interface f {
    }

    @androidx.media3.common.util.J
    void J();

    void X(C23091e c23091e, boolean z12);

    @Override // androidx.media3.common.H
    @j.P
    ExoPlaybackException a();

    /* compiled from: ExoPlayer.java */
    @androidx.media3.common.util.J
    /* renamed from: androidx.media3.exoplayer.m$b */
    public interface b {
        default void c() {
        }
    }
}
