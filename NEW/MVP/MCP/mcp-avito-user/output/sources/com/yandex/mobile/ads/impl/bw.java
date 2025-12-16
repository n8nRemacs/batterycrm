package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
final class bw {

    /* renamed from: c, reason: collision with root package name */
    private boolean f384081c;

    /* renamed from: e, reason: collision with root package name */
    private int f384083e;

    /* renamed from: a, reason: collision with root package name */
    private a f384079a = new a();

    /* renamed from: b, reason: collision with root package name */
    private a f384080b = new a();

    /* renamed from: d, reason: collision with root package name */
    private long f384082d = -9223372036854775807L;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private long f384084a;

        /* renamed from: b, reason: collision with root package name */
        private long f384085b;

        /* renamed from: c, reason: collision with root package name */
        private long f384086c;

        /* renamed from: d, reason: collision with root package name */
        private long f384087d;

        /* renamed from: e, reason: collision with root package name */
        private long f384088e;

        /* renamed from: f, reason: collision with root package name */
        private long f384089f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean[] f384090g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        private int f384091h;

        public final long a() {
            long j12 = this.f384088e;
            if (j12 == 0) {
                return 0L;
            }
            return this.f384089f / j12;
        }

        public final long b() {
            return this.f384089f;
        }

        public final boolean c() {
            long j12 = this.f384087d;
            if (j12 == 0) {
                return false;
            }
            return this.f384090g[(int) ((j12 - 1) % 15)];
        }

        public final boolean d() {
            return this.f384087d > 15 && this.f384091h == 0;
        }

        public final void e() {
            this.f384087d = 0L;
            this.f384088e = 0L;
            this.f384089f = 0L;
            this.f384091h = 0;
            Arrays.fill(this.f384090g, false);
        }

        public final void a(long j12) {
            long j13 = this.f384087d;
            if (j13 == 0) {
                this.f384084a = j12;
            } else if (j13 == 1) {
                long j14 = j12 - this.f384084a;
                this.f384085b = j14;
                this.f384089f = j14;
                this.f384088e = 1L;
            } else {
                long j15 = j12 - this.f384086c;
                int i12 = (int) (j13 % 15);
                if (Math.abs(j15 - this.f384085b) <= 1000000) {
                    this.f384088e++;
                    this.f384089f += j15;
                    boolean[] zArr = this.f384090g;
                    if (zArr[i12]) {
                        zArr[i12] = false;
                        this.f384091h--;
                    }
                } else {
                    boolean[] zArr2 = this.f384090g;
                    if (!zArr2[i12]) {
                        zArr2[i12] = true;
                        this.f384091h++;
                    }
                }
            }
            this.f384087d++;
            this.f384086c = j12;
        }
    }

    public final void a(long j12) {
        this.f384079a.a(j12);
        if (this.f384079a.d()) {
            this.f384081c = false;
        } else if (this.f384082d != -9223372036854775807L) {
            if (!this.f384081c || this.f384080b.c()) {
                this.f384080b.e();
                this.f384080b.a(this.f384082d);
            }
            this.f384081c = true;
            this.f384080b.a(j12);
        }
        if (this.f384081c && this.f384080b.d()) {
            a aVar = this.f384079a;
            this.f384079a = this.f384080b;
            this.f384080b = aVar;
            this.f384081c = false;
        }
        this.f384082d = j12;
        this.f384083e = this.f384079a.d() ? 0 : this.f384083e + 1;
    }

    public final float b() {
        if (this.f384079a.d()) {
            return (float) (1.0E9d / this.f384079a.a());
        }
        return -1.0f;
    }

    public final int c() {
        return this.f384083e;
    }

    public final long d() {
        if (this.f384079a.d()) {
            return this.f384079a.b();
        }
        return -9223372036854775807L;
    }

    public final boolean e() {
        return this.f384079a.d();
    }

    public final void f() {
        this.f384079a.e();
        this.f384080b.e();
        this.f384081c = false;
        this.f384082d = -9223372036854775807L;
        this.f384083e = 0;
    }

    public final long a() {
        if (this.f384079a.d()) {
            return this.f384079a.a();
        }
        return -9223372036854775807L;
    }
}
