package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f46994a = versionedParcel.l(audioAttributesImplBase.f46994a, 1);
        audioAttributesImplBase.f46995b = versionedParcel.l(audioAttributesImplBase.f46995b, 2);
        audioAttributesImplBase.f46996c = versionedParcel.l(audioAttributesImplBase.f46996c, 3);
        audioAttributesImplBase.f46997d = versionedParcel.l(audioAttributesImplBase.f46997d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.q(false, false);
        versionedParcel.v(audioAttributesImplBase.f46994a, 1);
        versionedParcel.v(audioAttributesImplBase.f46995b, 2);
        versionedParcel.v(audioAttributesImplBase.f46996c, 3);
        versionedParcel.v(audioAttributesImplBase.f46997d, 4);
    }
}
