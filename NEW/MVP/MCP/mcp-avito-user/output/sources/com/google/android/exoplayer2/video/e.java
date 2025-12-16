package com.google.android.exoplayer2.video;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator.java */
/* loaded from: classes6.dex */
final class e {

    /* renamed from: c, reason: collision with root package name */
    public boolean f348214c;

    /* renamed from: e, reason: collision with root package name */
    public int f348216e;

    /* renamed from: a, reason: collision with root package name */
    public a f348212a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f348213b = new a();

    /* renamed from: d, reason: collision with root package name */
    public long f348215d = -9223372036854775807L;

    /* compiled from: FixedFrameRateEstimator.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f348217a;

        /* renamed from: b, reason: collision with root package name */
        public long f348218b;

        /* renamed from: c, reason: collision with root package name */
        public long f348219c;

        /* renamed from: d, reason: collision with root package name */
        public long f348220d;

        /* renamed from: e, reason: collision with root package name */
        public long f348221e;

        /* renamed from: f, reason: collision with root package name */
        public long f348222f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f348223g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f348224h;

        public final boolean a() {
            return this.f348220d > 15 && this.f348224h == 0;
        }

        public final void b(long j12) {
            long j13 = this.f348220d;
            if (j13 == 0) {
                this.f348217a = j12;
            } else if (j13 == 1) {
                long j14 = j12 - this.f348217a;
                this.f348218b = j14;
                this.f348222f = j14;
                this.f348221e = 1L;
            } else {
                long j15 = j12 - this.f348219c;
                int i12 = (int) (j13 % 15);
                long jAbs = Math.abs(j15 - this.f348218b);
                boolean[] zArr = this.f348223g;
                if (jAbs <= 1000000) {
                    this.f348221e++;
                    this.f348222f += j15;
                    if (zArr[i12]) {
                        zArr[i12] = false;
                        this.f348224h--;
                    }
                } else if (!zArr[i12]) {
                    zArr[i12] = true;
                    this.f348224h++;
                }
            }
            this.f348220d++;
            this.f348219c = j12;
        }

        public final void c() {
            this.f348220d = 0L;
            this.f348221e = 0L;
            this.f348222f = 0L;
            this.f348224h = 0;
            Arrays.fill(this.f348223g, false);
        }
    }
}
