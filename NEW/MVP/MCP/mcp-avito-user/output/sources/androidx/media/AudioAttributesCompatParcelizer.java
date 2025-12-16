package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.InvocationTargetException;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object objO = audioAttributesCompat.f46989a;
        if (versionedParcel.j(1)) {
            objO = versionedParcel.o();
        }
        audioAttributesCompat.f46989a = (AudioAttributesImpl) objO;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        versionedParcel.q(false, false);
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f46989a;
        versionedParcel.p(1);
        versionedParcel.y(audioAttributesImpl);
    }
}
