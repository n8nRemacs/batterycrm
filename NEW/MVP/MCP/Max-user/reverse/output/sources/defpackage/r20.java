package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract class r20 {
    public static int[] a() {
        tg7 tg7VarI = wg7.i();
        for (int i : t20.e) {
            if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build())) {
                tg7VarI.a(Integer.valueOf(i));
            }
        }
        tg7VarI.a(2);
        return jni.i(tg7VarI.i());
    }
}
