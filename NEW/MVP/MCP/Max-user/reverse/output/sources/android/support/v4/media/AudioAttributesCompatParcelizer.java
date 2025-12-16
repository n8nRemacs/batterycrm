package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import defpackage.e0h;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(e0h e0hVar) {
        return androidx.media.AudioAttributesCompatParcelizer.read(e0hVar);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, e0h e0hVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, e0hVar);
    }
}
