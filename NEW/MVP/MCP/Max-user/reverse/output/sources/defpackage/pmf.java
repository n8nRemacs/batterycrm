package defpackage;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public abstract class pmf {
    public static final DecimalFormat a;

    static {
        DecimalFormat decimalFormat = new DecimalFormat("#.#");
        RoundingMode roundingMode = RoundingMode.DOWN;
        decimalFormat.setRoundingMode(roundingMode);
        a = decimalFormat;
        new DecimalFormat("0.0").setRoundingMode(roundingMode);
    }

    public static final String a(int i) {
        long j = i;
        DecimalFormat decimalFormat = a;
        if (j >= 1000000000) {
            return az1.i(decimalFormat.format(j / 1.0E9d), "B");
        }
        if (j >= 1000000) {
            return az1.i(decimalFormat.format(j / 1000000.0d), "M");
        }
        if (j >= 1000) {
            return az1.i(decimalFormat.format(j / 1000.0d), "K");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        return sb.toString();
    }
}
