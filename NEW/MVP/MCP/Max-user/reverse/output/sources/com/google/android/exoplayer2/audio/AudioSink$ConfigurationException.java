package com.google.android.exoplayer2.audio;

import defpackage.gf6;

/* loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final gf6 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, gf6 gf6Var) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = gf6Var;
    }

    public AudioSink$ConfigurationException(String str, gf6 gf6Var) {
        super(str);
        this.a = gf6Var;
    }
}
