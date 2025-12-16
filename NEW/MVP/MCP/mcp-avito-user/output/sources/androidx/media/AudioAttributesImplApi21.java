package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import j.N;
import j.X;

@RestrictTo
@X
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo
    public AudioAttributes f46991a;

    /* renamed from: b, reason: collision with root package name */
    @RestrictTo
    public int f46992b = -1;

    @X
    public static class a implements AudioAttributesImpl.a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f46993a = new AudioAttributes.Builder();
    }

    @RestrictTo
    public AudioAttributesImplApi21() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        return this.f46991a.getUsage();
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int b() {
        int i12 = this.f46992b;
        return i12 != -1 ? i12 : AudioAttributesCompat.c(this.f46991a.getFlags(), this.f46991a.getUsage());
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int d() {
        return this.f46991a.getContentType();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f46991a.equals(((AudioAttributesImplApi21) obj).f46991a);
        }
        return false;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int getFlags() {
        return this.f46991a.getFlags();
    }

    public final int hashCode() {
        return this.f46991a.hashCode();
    }

    @N
    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f46991a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this.f46991a = audioAttributes;
    }
}
