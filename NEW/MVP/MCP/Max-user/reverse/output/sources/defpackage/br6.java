package defpackage;

import java.math.BigDecimal;

/* loaded from: classes.dex */
public abstract class br6 extends zw7 {
    public int a;
    public boolean b;
    public fy7 c;

    static {
        int i = yw7.WRITE_NUMBERS_AS_STRINGS.b;
        int i2 = yw7.ESCAPE_NON_ASCII.b;
        int i3 = yw7.STRICT_DUPLICATE_DETECTION.b;
    }

    public final String o0(BigDecimal bigDecimal) {
        yw7 yw7Var = yw7.WRITE_BIGDECIMAL_AS_PLAIN;
        if ((yw7Var.b & this.a) == 0) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        zw7.d(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public final boolean p0(yw7 yw7Var) {
        return (yw7Var.b & this.a) != 0;
    }
}
