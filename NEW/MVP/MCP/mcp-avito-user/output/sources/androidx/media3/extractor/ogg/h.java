package androidx.media3.extractor.ogg;

import androidx.media3.common.C23108t;
import androidx.media3.common.util.z;
import androidx.media3.extractor.C23191j;
import androidx.media3.extractor.H;
import androidx.media3.extractor.J;
import androidx.media3.extractor.ogg.b;
import androidx.media3.extractor.r;
import v61.InterfaceC49174e;

/* compiled from: StreamReader.java */
/* loaded from: classes.dex */
abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public J f51121b;

    /* renamed from: c, reason: collision with root package name */
    public r f51122c;

    /* renamed from: d, reason: collision with root package name */
    public f f51123d;

    /* renamed from: e, reason: collision with root package name */
    public long f51124e;

    /* renamed from: f, reason: collision with root package name */
    public long f51125f;

    /* renamed from: g, reason: collision with root package name */
    public long f51126g;

    /* renamed from: h, reason: collision with root package name */
    public int f51127h;

    /* renamed from: i, reason: collision with root package name */
    public int f51128i;

    /* renamed from: k, reason: collision with root package name */
    public long f51130k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f51131l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f51132m;

    /* renamed from: a, reason: collision with root package name */
    public final d f51120a = new d();

    /* renamed from: j, reason: collision with root package name */
    public b f51129j = new b();

    /* compiled from: StreamReader.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public C23108t f51133a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f51134b;
    }

    public void a(long j12) {
        this.f51126g = j12;
    }

    public abstract long b(z zVar);

    @InterfaceC49174e
    public abstract boolean c(z zVar, long j12, b bVar);

    public void d(boolean z12) {
        if (z12) {
            this.f51129j = new b();
            this.f51125f = 0L;
            this.f51127h = 0;
        } else {
            this.f51127h = 1;
        }
        this.f51124e = -1L;
        this.f51126g = 0L;
    }

    /* compiled from: StreamReader.java */
    public static final class c implements f {
        public c() {
        }

        @Override // androidx.media3.extractor.ogg.f
        public final H b() {
            return new H.b(-9223372036854775807L);
        }

        @Override // androidx.media3.extractor.ogg.f
        public final long d(C23191j c23191j) {
            return -1L;
        }

        @Override // androidx.media3.extractor.ogg.f
        public final void c(long j12) {
        }
    }
}
