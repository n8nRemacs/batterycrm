package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import j.N;
import java.util.Arrays;

@RestrictTo
/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    @RestrictTo
    public int f46994a = 0;

    /* renamed from: b, reason: collision with root package name */
    @RestrictTo
    public int f46995b = 0;

    /* renamed from: c, reason: collision with root package name */
    @RestrictTo
    public int f46996c = 0;

    /* renamed from: d, reason: collision with root package name */
    @RestrictTo
    public int f46997d = -1;

    public static class a implements AudioAttributesImpl.a {
    }

    @RestrictTo
    public AudioAttributesImplBase() {
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int a() {
        return this.f46994a;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int b() {
        int i12 = this.f46997d;
        return i12 != -1 ? i12 : AudioAttributesCompat.c(this.f46996c, this.f46994a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int d() {
        return this.f46995b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f46995b == audioAttributesImplBase.f46995b && this.f46996c == audioAttributesImplBase.getFlags() && this.f46994a == audioAttributesImplBase.f46994a && this.f46997d == audioAttributesImplBase.f46997d;
    }

    @Override // androidx.media.AudioAttributesImpl
    public final int getFlags() {
        int i12 = this.f46996c;
        int iB2 = b();
        if (iB2 == 6) {
            i12 |= 4;
        } else if (iB2 == 7) {
            i12 |= 1;
        }
        return i12 & 273;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f46995b), Integer.valueOf(this.f46996c), Integer.valueOf(this.f46994a), Integer.valueOf(this.f46997d)});
    }

    @N
    public final String toString() {
        String strG;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.f46997d != -1) {
            sb2.append(" stream=");
            sb2.append(this.f46997d);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i12 = this.f46994a;
        int i13 = AudioAttributesCompat.f46988b;
        switch (i12) {
            case 0:
                strG = "USAGE_UNKNOWN";
                break;
            case 1:
                strG = "USAGE_MEDIA";
                break;
            case 2:
                strG = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                strG = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                strG = "USAGE_ALARM";
                break;
            case 5:
                strG = "USAGE_NOTIFICATION";
                break;
            case 6:
                strG = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                strG = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                strG = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                strG = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                strG = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                strG = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                strG = "USAGE_GAME";
                break;
            case 15:
            default:
                strG = AK.c.g(i12, "unknown usage ");
                break;
            case 16:
                strG = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(strG);
        sb2.append(" content=");
        sb2.append(this.f46995b);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.f46996c).toUpperCase());
        return sb2.toString();
    }
}
