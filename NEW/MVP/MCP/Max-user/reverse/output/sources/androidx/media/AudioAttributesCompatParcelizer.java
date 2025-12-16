package androidx.media;

import defpackage.e0h;
import defpackage.g0h;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e0h e0hVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        g0h g0hVarH = audioAttributesCompat.a;
        if (e0hVar.e(1)) {
            g0hVarH = e0hVar.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) g0hVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e0h e0hVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        e0hVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        e0hVar.i(1);
        e0hVar.l(audioAttributesImpl);
    }
}
