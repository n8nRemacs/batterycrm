package defpackage;

import android.media.AudioAttributes;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l20 {
    public AudioAttributes a;

    public final boolean equals(Object obj) {
        if (obj instanceof l20) {
            return Objects.equals(this.a, ((l20) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.a;
    }
}
