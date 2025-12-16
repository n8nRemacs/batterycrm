package com.yandex.mobile.ads.impl;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* loaded from: classes8.dex */
final class sc {

    /* renamed from: a, reason: collision with root package name */
    @j.P
    private final a f389862a;

    /* renamed from: b, reason: collision with root package name */
    private int f389863b;

    /* renamed from: c, reason: collision with root package name */
    private long f389864c;

    /* renamed from: d, reason: collision with root package name */
    private long f389865d;

    /* renamed from: e, reason: collision with root package name */
    private long f389866e;

    /* renamed from: f, reason: collision with root package name */
    private long f389867f;

    @j.X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final AudioTrack f389868a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioTimestamp f389869b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        private long f389870c;

        /* renamed from: d, reason: collision with root package name */
        private long f389871d;

        /* renamed from: e, reason: collision with root package name */
        private long f389872e;

        public a(AudioTrack audioTrack) {
            this.f389868a = audioTrack;
        }

        public final long a() {
            return this.f389872e;
        }

        public final long b() {
            return this.f389869b.nanoTime / 1000;
        }

        public final boolean c() {
            boolean timestamp = this.f389868a.getTimestamp(this.f389869b);
            if (timestamp) {
                long j12 = this.f389869b.framePosition;
                if (this.f389871d > j12) {
                    this.f389870c++;
                }
                this.f389871d = j12;
                this.f389872e = j12 + (this.f389870c << 32);
            }
            return timestamp;
        }
    }

    public sc(AudioTrack audioTrack) {
        if (pc1.f388768a >= 19) {
            this.f389862a = new a(audioTrack);
            f();
        } else {
            this.f389862a = null;
            a(3);
        }
    }

    @TargetApi(19)
    public final boolean a(long j12) {
        a aVar = this.f389862a;
        if (aVar == null || j12 - this.f389866e < this.f389865d) {
            return false;
        }
        this.f389866e = j12;
        boolean zC2 = aVar.c();
        int i12 = this.f389863b;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zC2) {
                        f();
                    }
                } else if (!zC2) {
                    f();
                }
            } else if (!zC2) {
                f();
            } else if (this.f389862a.a() > this.f389867f) {
                a(2);
            }
        } else if (zC2) {
            if (this.f389862a.b() < this.f389864c) {
                return false;
            }
            this.f389867f = this.f389862a.a();
            a(1);
        } else if (j12 - this.f389864c > 500000) {
            a(3);
        }
        return zC2;
    }

    @TargetApi(19)
    public final long b() {
        a aVar = this.f389862a;
        if (aVar != null) {
            return aVar.a();
        }
        return -1L;
    }

    @TargetApi(19)
    public final long c() {
        a aVar = this.f389862a;
        if (aVar != null) {
            return aVar.b();
        }
        return -9223372036854775807L;
    }

    public final boolean d() {
        return this.f389863b == 2;
    }

    public final void e() {
        a(4);
    }

    public final void f() {
        if (this.f389862a != null) {
            a(0);
        }
    }

    public final void a() {
        if (this.f389863b == 4) {
            f();
        }
    }

    private void a(int i12) {
        this.f389863b = i12;
        if (i12 == 0) {
            this.f389866e = 0L;
            this.f389867f = -1L;
            this.f389864c = System.nanoTime() / 1000;
            this.f389865d = 10000L;
            return;
        }
        if (i12 == 1) {
            this.f389865d = 10000L;
            return;
        }
        if (i12 == 2 || i12 == 3) {
            this.f389865d = 10000000L;
        } else {
            if (i12 == 4) {
                this.f389865d = 500000L;
                return;
            }
            throw new IllegalStateException();
        }
    }
}
