package defpackage;

import android.content.Context;

/* loaded from: classes2.dex */
public final class evb {
    public final bwf a;
    public final bwf b;
    public final bwf c = new bwf(new ffb(8, this));

    public evb(k18 k18Var, Context context) {
        this.a = new bwf(new dvb(k18Var, context, 0));
        this.b = new bwf(new dvb(k18Var, context, 1));
    }

    public final ynd a(int i, int i2) {
        int i3;
        int iIntValue = ((Number) this.b.getValue()).intValue();
        ((Number) this.a.getValue()).intValue();
        if (i2 * i < iIntValue * iIntValue) {
            return null;
        }
        if (i2 <= iIntValue && i <= iIntValue) {
            return null;
        }
        if (i2 > i) {
            iIntValue = (int) ((i / i2) * iIntValue);
            i3 = iIntValue;
        } else {
            i3 = (int) ((i2 / i) * iIntValue);
        }
        return new ynd(iIntValue, i3);
    }
}
