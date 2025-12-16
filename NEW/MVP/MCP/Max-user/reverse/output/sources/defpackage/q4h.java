package defpackage;

import org.webrtc.Size;

/* loaded from: classes2.dex */
public final class q4h {
    public final boolean a;
    public final ts9 b;
    public final int c;
    public volatile Integer d;
    public volatile Integer e;
    public otb f;
    public Integer g;
    public Integer h;
    public Integer i;

    public q4h(boolean z, int i, ts9 ts9Var) {
        this.a = z;
        this.b = ts9Var;
        this.c = n7j.c(i - (i % 16), 320, 4096);
    }

    public final otb a(int i, int i2) {
        imb imbVar;
        float f;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Integer num = this.d;
        Integer num2 = this.e;
        int iIntValue = this.c;
        if (num != null && num2 != null) {
            iIntValue = Math.min(num.intValue(), num2.intValue());
        } else if (num != null) {
            iIntValue = num.intValue();
        } else if (num2 != null) {
            iIntValue = num2.intValue();
        }
        int iMax = Math.max(i, i2);
        if (iMax > iIntValue) {
            f = iIntValue / iMax;
            int iMin = Math.min(i, i2);
            if (iMin > 0) {
                float f2 = iMin;
                int iD = kti.d(f * f2);
                int i9 = iD % 16;
                if (i9 > 0) {
                    int i10 = (iD - i9) + 16;
                    if (i9 > i10 - iD) {
                        f = i10 / f2;
                    }
                }
            }
            imbVar = new imb(Integer.valueOf(kti.d(i * f)), Integer.valueOf(kti.d(i2 * f)));
            z = true;
        } else {
            imbVar = new imb(Integer.valueOf(i), Integer.valueOf(i2));
            f = 1.0f;
            z = false;
        }
        int iIntValue2 = ((Number) imbVar.a).intValue();
        int iIntValue3 = ((Number) imbVar.b).intValue();
        int iMax2 = Math.max(iIntValue2, iIntValue3);
        int iMax3 = iMax2 < 320 ? Math.max(320 / iMax2, 2) : 1;
        int i11 = iMax3 == 1 ? iMax2 : iMax2 * iMax3;
        int iMin2 = Math.min(iIntValue2, iIntValue3);
        int i12 = iMax3 == 1 ? iMin2 : iMin2 * iMax3;
        if (i11 < iIntValue) {
            iIntValue = i11 - (i11 % 16);
        }
        int i13 = iIntValue / 16;
        int i14 = i13 * 9;
        int iA = i14 > i12 ? hui.a(i12, i13, 0) : hui.a(i14, i13, i12);
        if (iMax3 == 1) {
            iMax2 = iIntValue;
        } else if (iIntValue != i11) {
            iMax2 = kti.d(iIntValue / iMax3);
        }
        if (z) {
            iMax2 = kti.d(iMax2 / f);
        }
        if (iMax3 == 1) {
            iMin2 = iA;
        } else if (iA != i12) {
            iMin2 = kti.d(iA / iMax3);
        }
        if (z) {
            iMin2 = kti.d(iMin2 / f);
        }
        if (i >= i2) {
            i3 = (i - iMax2) / 2;
            i4 = (i2 - iMin2) / 2;
            i6 = iA;
            i5 = iIntValue;
            i8 = iMin2;
            i7 = iMax2;
        } else {
            i3 = (i - iMin2) / 2;
            i4 = (i2 - iMax2) / 2;
            i5 = iA;
            i6 = iIntValue;
            i7 = iMin2;
            i8 = iMax2;
        }
        return new otb(i3, i4, i7, i8, i5, i6, this.a);
    }

    public final Size b(int i, int i2) {
        if (i != 0 && i2 != 0) {
            otb otbVarA = a(i, i2);
            return new Size(otbVarA.g, otbVarA.h);
        }
        this.b.invoke("Wrong frame size: " + i + "x" + i2);
        return null;
    }
}
