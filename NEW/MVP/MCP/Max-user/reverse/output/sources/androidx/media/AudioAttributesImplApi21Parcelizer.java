package androidx.media;

import android.media.AudioAttributes;
import defpackage.e0h;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(e0h e0hVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) e0hVar.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = e0hVar.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, e0h e0hVar) {
        e0hVar.getClass();
        e0hVar.k(audioAttributesImplApi21.a, 1);
        e0hVar.j(audioAttributesImplApi21.b, 2);
    }
}
