package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.y;
import com.google.android.exoplayer2.util.U;
import j.P;

/* compiled from: BinarySearchSeeker.java */
/* renamed from: com.google.android.exoplayer2.extractor.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC36511a {

    /* renamed from: a, reason: collision with root package name */
    public final C10574a f344396a;

    /* renamed from: b, reason: collision with root package name */
    public final f f344397b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public c f344398c;

    /* renamed from: d, reason: collision with root package name */
    public final int f344399d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: com.google.android.exoplayer2.extractor.a$a, reason: collision with other inner class name */
    public static class C10574a implements y {

        /* renamed from: a, reason: collision with root package name */
        public final d f344400a;

        /* renamed from: b, reason: collision with root package name */
        public final long f344401b;

        /* renamed from: c, reason: collision with root package name */
        public final long f344402c;

        /* renamed from: d, reason: collision with root package name */
        public final long f344403d;

        /* renamed from: e, reason: collision with root package name */
        public final long f344404e;

        /* renamed from: f, reason: collision with root package name */
        public final long f344405f;

        public C10574a(d dVar, long j12, long j13, long j14, long j15, long j16) {
            this.f344400a = dVar;
            this.f344401b = j12;
            this.f344402c = j13;
            this.f344403d = j14;
            this.f344404e = j15;
            this.f344405f = j16;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final long d() {
            return this.f344401b;
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final y.a f(long j12) {
            z zVar = new z(j12, c.a(this.f344400a.a(j12), 0L, this.f344402c, this.f344403d, this.f344404e, this.f344405f));
            return new y.a(zVar, zVar);
        }

        @Override // com.google.android.exoplayer2.extractor.y
        public final boolean g() {
            return true;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: com.google.android.exoplayer2.extractor.a$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f344406a;

        /* renamed from: b, reason: collision with root package name */
        public final long f344407b;

        /* renamed from: c, reason: collision with root package name */
        public final long f344408c;

        /* renamed from: d, reason: collision with root package name */
        public long f344409d = 0;

        /* renamed from: e, reason: collision with root package name */
        public long f344410e;

        /* renamed from: f, reason: collision with root package name */
        public long f344411f;

        /* renamed from: g, reason: collision with root package name */
        public long f344412g;

        /* renamed from: h, reason: collision with root package name */
        public long f344413h;

        public c(long j12, long j13, long j14, long j15, long j16, long j17) {
            this.f344406a = j12;
            this.f344407b = j13;
            this.f344410e = j14;
            this.f344411f = j15;
            this.f344412g = j16;
            this.f344408c = j17;
            this.f344413h = a(j13, 0L, j14, j15, j16, j17);
        }

        public static long a(long j12, long j13, long j14, long j15, long j16, long j17) {
            if (j15 + 1 >= j16 || j13 + 1 >= j14) {
                return j15;
            }
            long j18 = (long) ((j12 - j13) * ((j16 - j15) / (j14 - j13)));
            return U.l(((j18 + j15) - j17) - (j18 / 20), j15, j16 - 1);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: com.google.android.exoplayer2.extractor.a$d */
    public interface d {
        long a(long j12);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: com.google.android.exoplayer2.extractor.a$e */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f344414d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f344415a;

        /* renamed from: b, reason: collision with root package name */
        public final long f344416b;

        /* renamed from: c, reason: collision with root package name */
        public final long f344417c;

        public e(int i12, long j12, long j13) {
            this.f344415a = i12;
            this.f344416b = j12;
            this.f344417c = j13;
        }
    }

    public AbstractC36511a(d dVar, f fVar, long j12, long j13, long j14, long j15, long j16, int i12) {
        this.f344397b = fVar;
        this.f344399d = i12;
        this.f344396a = new C10574a(dVar, j12, j13, j14, j15, j16);
    }

    public static int b(com.google.android.exoplayer2.extractor.f fVar, long j12, w wVar) {
        if (j12 == fVar.f344495d) {
            return 0;
        }
        wVar.f345347a = j12;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return b(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.google.android.exoplayer2.extractor.f r28, com.google.android.exoplayer2.extractor.w r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.AbstractC36511a.a(com.google.android.exoplayer2.extractor.f, com.google.android.exoplayer2.extractor.w):int");
    }

    public final void c(long j12) {
        c cVar = this.f344398c;
        if (cVar == null || cVar.f344406a != j12) {
            C10574a c10574a = this.f344396a;
            this.f344398c = new c(j12, c10574a.f344400a.a(j12), c10574a.f344402c, c10574a.f344403d, c10574a.f344404e, c10574a.f344405f);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: com.google.android.exoplayer2.extractor.a$f */
    public interface f {
        e b(com.google.android.exoplayer2.extractor.f fVar, long j12);

        default void a() {
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: com.google.android.exoplayer2.extractor.a$b */
    public static final class b implements d {
        @Override // com.google.android.exoplayer2.extractor.AbstractC36511a.d
        public final long a(long j12) {
            return j12;
        }
    }
}
