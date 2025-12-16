package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.media3.common.util.M;
import j.P;
import j.X;

/* compiled from: AudioTimestampPoller.java */
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final a f48897a;

    /* renamed from: b, reason: collision with root package name */
    public int f48898b;

    /* renamed from: c, reason: collision with root package name */
    public long f48899c;

    /* renamed from: d, reason: collision with root package name */
    public long f48900d;

    /* renamed from: e, reason: collision with root package name */
    public long f48901e;

    /* renamed from: f, reason: collision with root package name */
    public long f48902f;

    /* compiled from: AudioTimestampPoller.java */
    @X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f48903a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f48904b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f48905c;

        /* renamed from: d, reason: collision with root package name */
        public long f48906d;

        /* renamed from: e, reason: collision with root package name */
        public long f48907e;

        public a(AudioTrack audioTrack) {
            this.f48903a = audioTrack;
        }
    }

    public i(AudioTrack audioTrack) {
        if (M.f47887a >= 19) {
            this.f48897a = new a(audioTrack);
            a();
        } else {
            this.f48897a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.f48897a != null) {
            b(0);
        }
    }

    public final void b(int i12) {
        this.f48898b = i12;
        if (i12 == 0) {
            this.f48901e = 0L;
            this.f48902f = -1L;
            this.f48899c = System.nanoTime() / 1000;
            this.f48900d = 10000L;
            return;
        }
        if (i12 == 1) {
            this.f48900d = 10000L;
            return;
        }
        if (i12 == 2 || i12 == 3) {
            this.f48900d = 10000000L;
        } else {
            if (i12 != 4) {
                throw new IllegalStateException();
            }
            this.f48900d = 500000L;
        }
    }
}
