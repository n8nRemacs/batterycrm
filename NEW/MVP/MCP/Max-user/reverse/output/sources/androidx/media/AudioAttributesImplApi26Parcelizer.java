package androidx.media;

import android.media.AudioAttributes;
import defpackage.e0h;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(e0h e0hVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) e0hVar.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = e0hVar.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, e0h e0hVar) {
        e0hVar.getClass();
        e0hVar.k(audioAttributesImplApi26.a, 1);
        e0hVar.j(audioAttributesImplApi26.b, 2);
    }
}
