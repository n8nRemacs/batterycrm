package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;

/* loaded from: classes.dex */
public final class tj4 {
    public final gf6 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final j50[] i;

    public tj4(gf6 gf6Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, j50[] j50VarArr) {
        this.a = gf6Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = j50VarArr;
    }

    public final AudioTrack a(boolean z, j20 j20Var, int i) throws AudioSink$InitializationException {
        int i2 = this.c;
        try {
            AudioTrack audioTrackB = b(z, j20Var, i);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, this.e, this.f, this.h, this.a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink$InitializationException(0, this.e, this.f, this.h, this.a, i2 == 1, e);
        }
    }

    public final AudioTrack b(boolean z, j20 j20Var, int i) {
        int i2 = xxg.a;
        int i3 = this.g;
        int i4 = this.f;
        int i5 = this.e;
        if (i2 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : j20Var.a()).setAudioFormat(zj4.e(i5, i4, i3)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }
        if (i2 >= 21) {
            return new AudioTrack(z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : j20Var.a(), zj4.e(i5, i4, i3), this.h, 1, i);
        }
        int iW = xxg.w(j20Var.c);
        if (i == 0) {
            return new AudioTrack(iW, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(iW, this.e, this.f, this.g, this.h, 1, i);
    }
}
