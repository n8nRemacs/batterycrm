package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class b3c implements lw0 {
    public static final b3c d = new b3c(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    public b3c(float f, float f2) {
        fsi.b(f > 0.0f);
        fsi.b(f2 > 0.0f);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b3c.class == obj.getClass()) {
            b3c b3cVar = (b3c) obj;
            if (this.a == b3cVar.a && this.b == b3cVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        int i = xxg.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
