package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.lang.reflect.Method;

/* compiled from: AudioTrackPositionTracker.java */
/* loaded from: classes6.dex */
final class k {

    /* renamed from: A, reason: collision with root package name */
    public long f344009A;

    /* renamed from: B, reason: collision with root package name */
    public long f344010B;

    /* renamed from: C, reason: collision with root package name */
    public long f344011C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f344012D;

    /* renamed from: E, reason: collision with root package name */
    public long f344013E;

    /* renamed from: F, reason: collision with root package name */
    public long f344014F;

    /* renamed from: a, reason: collision with root package name */
    public final a f344015a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f344016b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public AudioTrack f344017c;

    /* renamed from: d, reason: collision with root package name */
    public int f344018d;

    /* renamed from: e, reason: collision with root package name */
    public int f344019e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public j f344020f;

    /* renamed from: g, reason: collision with root package name */
    public int f344021g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f344022h;

    /* renamed from: i, reason: collision with root package name */
    public long f344023i;

    /* renamed from: j, reason: collision with root package name */
    public float f344024j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f344025k;

    /* renamed from: l, reason: collision with root package name */
    public long f344026l;

    /* renamed from: m, reason: collision with root package name */
    public long f344027m;

    /* renamed from: n, reason: collision with root package name */
    @P
    public Method f344028n;

    /* renamed from: o, reason: collision with root package name */
    public long f344029o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f344030p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f344031q;

    /* renamed from: r, reason: collision with root package name */
    public long f344032r;

    /* renamed from: s, reason: collision with root package name */
    public long f344033s;

    /* renamed from: t, reason: collision with root package name */
    public long f344034t;

    /* renamed from: u, reason: collision with root package name */
    public long f344035u;

    /* renamed from: v, reason: collision with root package name */
    public int f344036v;

    /* renamed from: w, reason: collision with root package name */
    public int f344037w;

    /* renamed from: x, reason: collision with root package name */
    public long f344038x;

    /* renamed from: y, reason: collision with root package name */
    public long f344039y;

    /* renamed from: z, reason: collision with root package name */
    public long f344040z;

    /* compiled from: AudioTrackPositionTracker.java */
    public interface a {
    }

    public k(a aVar) {
        this.f344015a = aVar;
        if (U.f348106a >= 18) {
            try {
                this.f344028n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f344016b = new long[10];
    }

    public final long a() {
        AudioTrack audioTrack = this.f344017c;
        audioTrack.getClass();
        if (this.f344038x != -9223372036854775807L) {
            return Math.min(this.f344009A, this.f344040z + ((((SystemClock.elapsedRealtime() * 1000) - this.f344038x) * this.f344021g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f344022h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f344035u = this.f344033s;
            }
            playbackHeadPosition += this.f344035u;
        }
        if (U.f348106a <= 29) {
            if (playbackHeadPosition == 0 && this.f344033s > 0 && playState == 3) {
                if (this.f344039y == -9223372036854775807L) {
                    this.f344039y = SystemClock.elapsedRealtime();
                }
                return this.f344033s;
            }
            this.f344039y = -9223372036854775807L;
        }
        if (this.f344033s > playbackHeadPosition) {
            this.f344034t++;
        }
        this.f344033s = playbackHeadPosition;
        return playbackHeadPosition + (this.f344034t << 32);
    }

    public final boolean b(long j12) {
        if (j12 <= a()) {
            if (this.f344022h) {
                AudioTrack audioTrack = this.f344017c;
                audioTrack.getClass();
                if (audioTrack.getPlayState() != 2 || a() != 0) {
                }
            }
            return false;
        }
        return true;
    }
}
