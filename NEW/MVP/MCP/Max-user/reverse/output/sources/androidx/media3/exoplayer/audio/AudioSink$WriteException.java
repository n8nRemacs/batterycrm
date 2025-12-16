package androidx.media3.exoplayer.audio;

import defpackage.hf6;
import defpackage.ho7;

/* loaded from: classes.dex */
public final class AudioSink$WriteException extends Exception {
    public final int a;
    public final boolean b;
    public final hf6 c;

    public AudioSink$WriteException(int i, hf6 hf6Var, boolean z) {
        super(ho7.f(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = hf6Var;
    }
}
