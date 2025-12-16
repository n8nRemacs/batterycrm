package androidx.media;

import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements androidx.versionedparcelable.h {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f46988b = 0;

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo
    public AudioAttributesImpl f46989a;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface b {
    }

    public static abstract class c {
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributesImpl.a f46990a;

        public d() {
            int i12 = AudioAttributesCompat.f46988b;
            this.f46990a = new AudioAttributesImplApi26.a();
        }

        public final AudioAttributesCompat a() {
            return new AudioAttributesCompat(new AudioAttributesImplApi26(((AudioAttributesImplApi26.a) this.f46990a).f46993a.build()));
        }

        public final void b(int i12) {
            ((AudioAttributesImplApi21.a) this.f46990a).f46993a.setContentType(i12);
        }

        public final void c(int i12) {
            ((AudioAttributesImplApi21.a) this.f46990a).f46993a.setFlags(i12);
        }

        public final void d(int i12) {
            ((AudioAttributesImplApi21.a) this.f46990a).f46993a.setLegacyStreamType(i12);
        }

        public final void e(int i12) {
            ((AudioAttributesImplApi26.a) this.f46990a).f46993a.setUsage(i12);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    @RestrictTo
    public AudioAttributesCompat() {
    }

    public static int c(int i12, int i13) {
        if ((i12 & 1) == 1) {
            return 7;
        }
        if ((i12 & 4) == 4) {
            return 6;
        }
        switch (i13) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                return 3;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f46989a;
        return audioAttributesImpl == null ? audioAttributesCompat.f46989a == null : audioAttributesImpl.equals(audioAttributesCompat.f46989a);
    }

    public final int hashCode() {
        return this.f46989a.hashCode();
    }

    public final String toString() {
        return this.f46989a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImplApi26 audioAttributesImplApi26) {
        this.f46989a = audioAttributesImplApi26;
    }
}
