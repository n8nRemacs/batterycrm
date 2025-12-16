package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.extractor.A;
import com.google.android.exoplayer2.extractor.l;
import com.google.android.exoplayer2.extractor.ogg.b;
import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.F;
import v61.InterfaceC49174e;

/* compiled from: StreamReader.java */
/* loaded from: classes6.dex */
abstract class h {

    /* renamed from: b, reason: collision with root package name */
    public A f344948b;

    /* renamed from: c, reason: collision with root package name */
    public l f344949c;

    /* renamed from: d, reason: collision with root package name */
    public f f344950d;

    /* renamed from: e, reason: collision with root package name */
    public long f344951e;

    /* renamed from: f, reason: collision with root package name */
    public long f344952f;

    /* renamed from: g, reason: collision with root package name */
    public long f344953g;

    /* renamed from: h, reason: collision with root package name */
    public int f344954h;

    /* renamed from: i, reason: collision with root package name */
    public int f344955i;

    /* renamed from: k, reason: collision with root package name */
    public long f344957k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f344958l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f344959m;

    /* renamed from: a, reason: collision with root package name */
    public final d f344947a = new d();

    /* renamed from: j, reason: collision with root package name */
    public b f344956j = new b();

    /* compiled from: StreamReader.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public I f344960a;

        /* renamed from: b, reason: collision with root package name */
        public b.a f344961b;
    }

    public void a(long j12) {
        this.f344953g = j12;
    }

    public abstract long b(F f12);

    @InterfaceC49174e
    public abstract boolean c(F f12, long j12, b bVar);

    public void d(boolean z12) {
        if (z12) {
            this.f344956j = new b();
            this.f344952f = 0L;
            this.f344954h = 0;
        } else {
            this.f344954h = 1;
        }
        this.f344951e = -1L;
        this.f344953g = 0L;
    }

    /* compiled from: StreamReader.java */
    public static final class c implements f {
        public c() {
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f
        public final long a(com.google.android.exoplayer2.extractor.f fVar) {
            return -1L;
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f
        public final y b() {
            return new y.b(-9223372036854775807L);
        }

        @Override // com.google.android.exoplayer2.extractor.ogg.f
        public final void c(long j12) {
        }
    }
}
