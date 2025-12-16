package com.yandex.mobile.ads.impl;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes8.dex */
final class tc {

    /* renamed from: A, reason: collision with root package name */
    private long f390153A;

    /* renamed from: B, reason: collision with root package name */
    private long f390154B;

    /* renamed from: C, reason: collision with root package name */
    private long f390155C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f390156D;

    /* renamed from: E, reason: collision with root package name */
    private long f390157E;

    /* renamed from: F, reason: collision with root package name */
    private long f390158F;

    /* renamed from: a, reason: collision with root package name */
    private final a f390159a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f390160b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private AudioTrack f390161c;

    /* renamed from: d, reason: collision with root package name */
    private int f390162d;

    /* renamed from: e, reason: collision with root package name */
    private int f390163e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private sc f390164f;

    /* renamed from: g, reason: collision with root package name */
    private int f390165g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f390166h;

    /* renamed from: i, reason: collision with root package name */
    private long f390167i;

    /* renamed from: j, reason: collision with root package name */
    private float f390168j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f390169k;

    /* renamed from: l, reason: collision with root package name */
    private long f390170l;

    /* renamed from: m, reason: collision with root package name */
    private long f390171m;

    /* renamed from: n, reason: collision with root package name */
    @j.P
    private Method f390172n;

    /* renamed from: o, reason: collision with root package name */
    private long f390173o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f390174p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f390175q;

    /* renamed from: r, reason: collision with root package name */
    private long f390176r;

    /* renamed from: s, reason: collision with root package name */
    private long f390177s;

    /* renamed from: t, reason: collision with root package name */
    private long f390178t;

    /* renamed from: u, reason: collision with root package name */
    private long f390179u;

    /* renamed from: v, reason: collision with root package name */
    private int f390180v;

    /* renamed from: w, reason: collision with root package name */
    private int f390181w;

    /* renamed from: x, reason: collision with root package name */
    private long f390182x;

    /* renamed from: y, reason: collision with root package name */
    private long f390183y;

    /* renamed from: z, reason: collision with root package name */
    private long f390184z;

    public interface a {
        void a(int i12, long j12);

        void a(long j12);

        void a(long j12, long j13, long j14, long j15);

        void b(long j12);

        void b(long j12, long j13, long j14, long j15);
    }

    public tc(a aVar) {
        this.f390159a = (a) db.a(aVar);
        if (pc1.f388768a >= 18) {
            try {
                this.f390172n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f390160b = new long[10];
    }

    public final void a(AudioTrack audioTrack, boolean z12, int i12, int i13, int i14) {
        this.f390161c = audioTrack;
        this.f390162d = i13;
        this.f390163e = i14;
        this.f390164f = new sc(audioTrack);
        this.f390165g = audioTrack.getSampleRate();
        this.f390166h = z12 && pc1.f388768a < 23 && (i12 == 5 || i12 == 6);
        boolean zE2 = pc1.e(i12);
        this.f390175q = zE2;
        this.f390167i = zE2 ? a(i14 / i13) : -9223372036854775807L;
        this.f390177s = 0L;
        this.f390178t = 0L;
        this.f390179u = 0L;
        this.f390174p = false;
        this.f390182x = -9223372036854775807L;
        this.f390183y = -9223372036854775807L;
        this.f390176r = 0L;
        this.f390173o = 0L;
        this.f390168j = 1.0f;
    }

    public final boolean b() {
        AudioTrack audioTrack = this.f390161c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 3;
    }

    public final void c(long j12) {
        this.f390184z = a();
        this.f390182x = SystemClock.elapsedRealtime() * 1000;
        this.f390153A = j12;
    }

    public final boolean d(long j12) {
        if (j12 <= a()) {
            if (this.f390166h) {
                AudioTrack audioTrack = this.f390161c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final void e() {
        sc scVar = this.f390164f;
        scVar.getClass();
        scVar.f();
    }

    public final boolean f(long j12) {
        AudioTrack audioTrack = this.f390161c;
        audioTrack.getClass();
        int playState = audioTrack.getPlayState();
        if (this.f390166h) {
            if (playState == 2) {
                this.f390174p = false;
                return false;
            }
            if (playState == 1 && a() == 0) {
                return false;
            }
        }
        boolean z12 = this.f390174p;
        boolean zD2 = d(j12);
        this.f390174p = zD2;
        if (z12 && !zD2 && playState != 1) {
            this.f390159a.a(this.f390163e, pc1.b(this.f390167i));
        }
        return true;
    }

    public final int b(long j12) {
        return this.f390163e - ((int) (j12 - (a() * this.f390162d)));
    }

    public final boolean c() {
        this.f390170l = 0L;
        this.f390181w = 0;
        this.f390180v = 0;
        this.f390171m = 0L;
        this.f390155C = 0L;
        this.f390158F = 0L;
        this.f390169k = false;
        if (this.f390182x != -9223372036854775807L) {
            return false;
        }
        sc scVar = this.f390164f;
        scVar.getClass();
        scVar.f();
        return true;
    }

    public final boolean e(long j12) {
        return this.f390183y != -9223372036854775807L && j12 > 0 && SystemClock.elapsedRealtime() - this.f390183y >= 200;
    }

    public final void d() {
        this.f390170l = 0L;
        this.f390181w = 0;
        this.f390180v = 0;
        this.f390171m = 0L;
        this.f390155C = 0L;
        this.f390158F = 0L;
        this.f390169k = false;
        this.f390161c = null;
        this.f390164f = null;
    }

    public final void a(float f12) {
        this.f390168j = f12;
        sc scVar = this.f390164f;
        if (scVar != null) {
            scVar.f();
        }
    }

    public final long a(boolean z12) {
        long jMax;
        int i12;
        Method method;
        AudioTrack audioTrack = this.f390161c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 3) {
            long jA2 = a(a());
            if (jA2 != 0) {
                long jNanoTime = System.nanoTime() / 1000;
                if (jNanoTime - this.f390171m >= 30000) {
                    long[] jArr = this.f390160b;
                    int i13 = this.f390180v;
                    jArr[i13] = jA2 - jNanoTime;
                    this.f390180v = (i13 + 1) % 10;
                    int i14 = this.f390181w;
                    if (i14 < 10) {
                        this.f390181w = i14 + 1;
                    }
                    this.f390171m = jNanoTime;
                    this.f390170l = 0L;
                    int i15 = 0;
                    while (true) {
                        int i16 = this.f390181w;
                        if (i15 >= i16) {
                            break;
                        }
                        this.f390170l = (this.f390160b[i15] / i16) + this.f390170l;
                        i15++;
                    }
                }
                if (!this.f390166h) {
                    sc scVar = this.f390164f;
                    scVar.getClass();
                    if (scVar.a(jNanoTime)) {
                        long jC2 = scVar.c();
                        long jB2 = scVar.b();
                        if (Math.abs(jC2 - jNanoTime) > 5000000) {
                            i12 = 0;
                            this.f390159a.b(jB2, jC2, jNanoTime, jA2);
                            scVar.e();
                        } else {
                            i12 = 0;
                            if (Math.abs(a(jB2) - jA2) > 5000000) {
                                this.f390159a.a(jB2, jC2, jNanoTime, jA2);
                                scVar.e();
                            } else {
                                scVar.a();
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    if (this.f390175q && (method = this.f390172n) != null && jNanoTime - this.f390176r >= 500000) {
                        try {
                            AudioTrack audioTrack2 = this.f390161c;
                            audioTrack2.getClass();
                            Integer num = (Integer) method.invoke(audioTrack2, new Object[i12]);
                            int i17 = pc1.f388768a;
                            long jIntValue = (num.intValue() * 1000) - this.f390167i;
                            this.f390173o = jIntValue;
                            long jMax2 = Math.max(jIntValue, 0L);
                            this.f390173o = jMax2;
                            if (jMax2 > 5000000) {
                                this.f390159a.b(jMax2);
                                this.f390173o = 0L;
                            }
                        } catch (Exception unused) {
                            this.f390172n = null;
                        }
                        this.f390176r = jNanoTime;
                    }
                }
            }
        }
        long jNanoTime2 = System.nanoTime() / 1000;
        sc scVar2 = this.f390164f;
        scVar2.getClass();
        boolean zD2 = scVar2.d();
        if (zD2) {
            long jA3 = a(scVar2.b());
            long jC3 = jNanoTime2 - scVar2.c();
            float f12 = this.f390168j;
            int i18 = pc1.f388768a;
            if (f12 != 1.0f) {
                jC3 = Math.round(jC3 * f12);
            }
            jMax = jC3 + jA3;
        } else {
            if (this.f390181w == 0) {
                jMax = a(a());
            } else {
                jMax = this.f390170l + jNanoTime2;
            }
            if (!z12) {
                jMax = Math.max(0L, jMax - this.f390173o);
            }
        }
        if (this.f390156D != zD2) {
            this.f390158F = this.f390155C;
            this.f390157E = this.f390154B;
        }
        long j12 = jNanoTime2 - this.f390158F;
        if (j12 < 1000000) {
            long j13 = this.f390157E;
            float f13 = this.f390168j;
            int i19 = pc1.f388768a;
            long j14 = jMax;
            long jRound = f13 == 1.0f ? j12 : Math.round(j12 * f13);
            long j15 = (j12 * 1000) / 1000000;
            jMax = (((1000 - j15) * (jRound + j13)) + (j14 * j15)) / 1000;
        }
        if (!this.f390169k) {
            long j16 = this.f390154B;
            if (jMax > j16) {
                this.f390169k = true;
                long jB3 = pc1.b(jMax - j16);
                float f14 = this.f390168j;
                if (f14 != 1.0f) {
                    jB3 = Math.round(jB3 / f14);
                }
                this.f390159a.a(System.currentTimeMillis() - pc1.b(jB3));
            }
        }
        this.f390155C = jNanoTime2;
        this.f390154B = jMax;
        this.f390156D = zD2;
        return jMax;
    }

    private long a(long j12) {
        return (j12 * 1000000) / this.f390165g;
    }

    private long a() {
        AudioTrack audioTrack = this.f390161c;
        audioTrack.getClass();
        if (this.f390182x != -9223372036854775807L) {
            return Math.min(this.f390153A, this.f390184z + ((((SystemClock.elapsedRealtime() * 1000) - this.f390182x) * this.f390165g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f390166h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f390179u = this.f390177s;
            }
            playbackHeadPosition += this.f390179u;
        }
        if (pc1.f388768a <= 29) {
            if (playbackHeadPosition == 0 && this.f390177s > 0 && playState == 3) {
                if (this.f390183y == -9223372036854775807L) {
                    this.f390183y = SystemClock.elapsedRealtime();
                }
                return this.f390177s;
            }
            this.f390183y = -9223372036854775807L;
        }
        if (this.f390177s > playbackHeadPosition) {
            this.f390178t++;
        }
        this.f390177s = playbackHeadPosition;
        return playbackHeadPosition + (this.f390178t << 32);
    }
}
