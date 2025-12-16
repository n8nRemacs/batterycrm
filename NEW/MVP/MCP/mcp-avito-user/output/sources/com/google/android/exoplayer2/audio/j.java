package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.X;

/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes6.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final a f343998a;

    /* renamed from: b, reason: collision with root package name */
    public int f343999b;

    /* renamed from: c, reason: collision with root package name */
    public long f344000c;

    /* renamed from: d, reason: collision with root package name */
    public long f344001d;

    /* renamed from: e, reason: collision with root package name */
    public long f344002e;

    /* renamed from: f, reason: collision with root package name */
    public long f344003f;

    /* compiled from: AudioTimestampPoller.java */
    @X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f344004a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f344005b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f344006c;

        /* renamed from: d, reason: collision with root package name */
        public long f344007d;

        /* renamed from: e, reason: collision with root package name */
        public long f344008e;

        public a(AudioTrack audioTrack) {
            this.f344004a = audioTrack;
        }
    }

    public j(AudioTrack audioTrack) {
        if (U.f348106a >= 19) {
            this.f343998a = new a(audioTrack);
            a();
        } else {
            this.f343998a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f343998a != null) {
            b(0);
        }
    }

    public final void b(int i12) {
        this.f343999b = i12;
        if (i12 == 0) {
            this.f344002e = 0L;
            this.f344003f = -1L;
            this.f344000c = System.nanoTime() / 1000;
            this.f344001d = 10000L;
            return;
        }
        if (i12 == 1) {
            this.f344001d = 10000L;
            return;
        }
        if (i12 == 2 || i12 == 3) {
            this.f344001d = 10000000L;
        } else {
            if (i12 != 4) {
                throw new IllegalStateException();
            }
            this.f344001d = 500000L;
        }
    }
}
