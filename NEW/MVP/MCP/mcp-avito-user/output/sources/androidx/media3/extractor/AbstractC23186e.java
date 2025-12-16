package androidx.media3.extractor;

import androidx.media3.extractor.H;
import j.P;

/* compiled from: BinarySearchSeeker.java */
@androidx.media3.common.util.J
/* renamed from: androidx.media3.extractor.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC23186e {

    /* renamed from: a, reason: collision with root package name */
    public final a f50498a;

    /* renamed from: b, reason: collision with root package name */
    public final f f50499b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public c f50500c;

    /* renamed from: d, reason: collision with root package name */
    public final int f50501d;

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: androidx.media3.extractor.e$a */
    public static class a implements H {

        /* renamed from: a, reason: collision with root package name */
        public final d f50502a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50503b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50504c;

        /* renamed from: d, reason: collision with root package name */
        public final long f50505d;

        /* renamed from: e, reason: collision with root package name */
        public final long f50506e;

        /* renamed from: f, reason: collision with root package name */
        public final long f50507f;

        public a(d dVar, long j12, long j13, long j14, long j15, long j16) {
            this.f50502a = dVar;
            this.f50503b = j12;
            this.f50504c = j13;
            this.f50505d = j14;
            this.f50506e = j15;
            this.f50507f = j16;
        }

        @Override // androidx.media3.extractor.H
        public final long d() {
            return this.f50503b;
        }

        @Override // androidx.media3.extractor.H
        public final H.a f(long j12) {
            I i12 = new I(j12, c.a(this.f50502a.a(j12), 0L, this.f50504c, this.f50505d, this.f50506e, this.f50507f));
            return new H.a(i12, i12);
        }

        @Override // androidx.media3.extractor.H
        public final boolean g() {
            return true;
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: androidx.media3.extractor.e$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f50508a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50509b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50510c;

        /* renamed from: d, reason: collision with root package name */
        public long f50511d = 0;

        /* renamed from: e, reason: collision with root package name */
        public long f50512e;

        /* renamed from: f, reason: collision with root package name */
        public long f50513f;

        /* renamed from: g, reason: collision with root package name */
        public long f50514g;

        /* renamed from: h, reason: collision with root package name */
        public long f50515h;

        public c(long j12, long j13, long j14, long j15, long j16, long j17) {
            this.f50508a = j12;
            this.f50509b = j13;
            this.f50512e = j14;
            this.f50513f = j15;
            this.f50514g = j16;
            this.f50510c = j17;
            this.f50515h = a(j13, 0L, j14, j15, j16, j17);
        }

        public static long a(long j12, long j13, long j14, long j15, long j16, long j17) {
            if (j15 + 1 >= j16 || j13 + 1 >= j14) {
                return j15;
            }
            long j18 = (long) ((j12 - j13) * ((j16 - j15) / (j14 - j13)));
            return androidx.media3.common.util.M.l(((j18 + j15) - j17) - (j18 / 20), j15, j16 - 1);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: androidx.media3.extractor.e$d */
    public interface d {
        long a(long j12);
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: androidx.media3.extractor.e$e, reason: collision with other inner class name */
    public static final class C1850e {

        /* renamed from: d, reason: collision with root package name */
        public static final C1850e f50516d = new C1850e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        public final int f50517a;

        /* renamed from: b, reason: collision with root package name */
        public final long f50518b;

        /* renamed from: c, reason: collision with root package name */
        public final long f50519c;

        public C1850e(int i12, long j12, long j13) {
            this.f50517a = i12;
            this.f50518b = j12;
            this.f50519c = j13;
        }
    }

    public AbstractC23186e(d dVar, f fVar, long j12, long j13, long j14, long j15, long j16, int i12) {
        this.f50499b = fVar;
        this.f50501d = i12;
        this.f50498a = new a(dVar, j12, j13, j14, j15, j16);
    }

    public static int b(C23191j c23191j, long j12, F f12) {
        if (j12 == c23191j.f50583d) {
            return 0;
        }
        f12.f50372a = j12;
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        return b(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(androidx.media3.extractor.C23191j r28, androidx.media3.extractor.F r29) throws java.io.EOFException, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.AbstractC23186e.a(androidx.media3.extractor.j, androidx.media3.extractor.F):int");
    }

    public final void c(long j12) {
        c cVar = this.f50500c;
        if (cVar == null || cVar.f50508a != j12) {
            a aVar = this.f50498a;
            this.f50500c = new c(j12, aVar.f50502a.a(j12), aVar.f50504c, aVar.f50505d, aVar.f50506e, aVar.f50507f);
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: androidx.media3.extractor.e$f */
    public interface f {
        C1850e b(C23191j c23191j, long j12);

        default void a() {
        }
    }

    /* compiled from: BinarySearchSeeker.java */
    /* renamed from: androidx.media3.extractor.e$b */
    public static final class b implements d {
        @Override // androidx.media3.extractor.AbstractC23186e.d
        public final long a(long j12) {
            return j12;
        }
    }
}
