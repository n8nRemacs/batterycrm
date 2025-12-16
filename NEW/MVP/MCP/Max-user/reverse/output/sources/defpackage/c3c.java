package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class c3c {
    public static final c3c d = new c3c(1.0f);
    public static final String e;
    public static final String f;
    public final float a;
    public final float b;
    public final int c;

    static {
        String str = zxg.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public c3c(float f2) {
        this(f2, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c3c.class == obj.getClass()) {
            c3c c3cVar = (c3c) obj;
            if (this.a == c3cVar.a && this.b == c3cVar.b) {
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
        String str = zxg.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }

    public c3c(float f2, float f3) {
        hsi.b(f2 > 0.0f);
        hsi.b(f3 > 0.0f);
        this.a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }
}
