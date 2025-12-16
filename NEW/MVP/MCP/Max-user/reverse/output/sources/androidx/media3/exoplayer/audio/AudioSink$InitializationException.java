package androidx.media3.exoplayer.audio;

import defpackage.hf3;
import defpackage.hf6;
import defpackage.wy1;

/* loaded from: classes.dex */
public final class AudioSink$InitializationException extends Exception {
    public final int a;
    public final boolean b;

    /* JADX WARN: Illegal instructions before constructor call */
    public AudioSink$InitializationException(int i, int i2, int i3, int i4, int i5, hf6 hf6Var, boolean z, RuntimeException runtimeException) {
        StringBuilder sbK = wy1.k("AudioTrack init failed ", i, " Config(", i2, ", ");
        hf3.g(sbK, i3, ", ", i4, ", ");
        sbK.append(i5);
        sbK.append(") ");
        sbK.append(hf6Var);
        sbK.append(z ? " (recoverable)" : "");
        super(sbK.toString(), runtimeException);
        this.a = i;
        this.b = z;
    }
}
