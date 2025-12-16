package defpackage;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class i60 {
    public final h60 a;
    public final int b;
    public final ao6 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public i60(AudioTrack audioTrack, ao6 ao6Var) {
        this.a = new h60(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = ao6Var;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 1) {
            this.f = WorkRequest.MIN_BACKOFF_MILLIS;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f = 500000L;
        }
    }
}
