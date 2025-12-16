package androidx.media3.common.audio;

import defpackage.i50;

/* loaded from: classes.dex */
public final class AudioProcessor$UnhandledAudioFormatException extends Exception {
    public final i50 a;

    public AudioProcessor$UnhandledAudioFormatException(i50 i50Var) {
        this("Unhandled input format:", i50Var);
    }

    public AudioProcessor$UnhandledAudioFormatException(String str, i50 i50Var) {
        super(str + " " + i50Var);
        this.a = i50Var;
    }
}
