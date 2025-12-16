package defpackage;

/* loaded from: classes.dex */
public final class sch {
    public static final sch d = new sch(0, 0);
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final int b;
    public final float c;

    static {
        String str = zxg.a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(3, 36);
    }

    public sch(int i, int i2) {
        this(i, 1.0f, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sch) {
            sch schVar = (sch) obj;
            if (this.a == schVar.a && this.b == schVar.b && this.c == schVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.c) + ((((217 + this.a) * 31) + this.b) * 31);
    }

    public sch(int i, float f2, int i2) {
        this.a = i;
        this.b = i2;
        this.c = f2;
    }
}
