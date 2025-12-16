package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import defpackage.hf6;

/* loaded from: classes.dex */
public final class AudioSink$ConfigurationException extends Exception {
    public final hf6 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, hf6 hf6Var) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = hf6Var;
    }

    public AudioSink$ConfigurationException(hf6 hf6Var, String str) {
        super(str);
        this.a = hf6Var;
    }
}
