package androidx.media3.exoplayer.video;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: classes.dex */
final class b {

    /* renamed from: c, reason: collision with root package name */
    public boolean f50209c;

    /* renamed from: e, reason: collision with root package name */
    public int f50211e;

    /* renamed from: a, reason: collision with root package name */
    public a f50207a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f50208b = new a();

    /* renamed from: d, reason: collision with root package name */
    public long f50210d = -9223372036854775807L;

    /* compiled from: FixedFrameRateEstimator.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f50212a;

        /* renamed from: b, reason: collision with root package name */
        public long f50213b;

        /* renamed from: c, reason: collision with root package name */
        public long f50214c;

        /* renamed from: d, reason: collision with root package name */
        public long f50215d;

        /* renamed from: e, reason: collision with root package name */
        public long f50216e;

        /* renamed from: f, reason: collision with root package name */
        public long f50217f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f50218g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f50219h;

        public final boolean a() {
            return this.f50215d > 15 && this.f50219h == 0;
        }

        public final void b(long j12) {
            long j13 = this.f50215d;
            if (j13 == 0) {
                this.f50212a = j12;
            } else if (j13 == 1) {
                long j14 = j12 - this.f50212a;
                this.f50213b = j14;
                this.f50217f = j14;
                this.f50216e = 1L;
            } else {
                long j15 = j12 - this.f50214c;
                int i12 = (int) (j13 % 15);
                long jAbs = Math.abs(j15 - this.f50213b);
                boolean[] zArr = this.f50218g;
                if (jAbs <= 1000000) {
                    this.f50216e++;
                    this.f50217f += j15;
                    if (zArr[i12]) {
                        zArr[i12] = false;
                        this.f50219h--;
                    }
                } else if (!zArr[i12]) {
                    zArr[i12] = true;
                    this.f50219h++;
                }
            }
            this.f50215d++;
            this.f50214c = j12;
        }

        public final void c() {
            this.f50215d = 0L;
            this.f50216e = 0L;
            this.f50217f = 0L;
            this.f50219h = 0;
            Arrays.fill(this.f50218g, false);
        }
    }
}
