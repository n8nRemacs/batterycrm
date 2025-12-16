package defpackage;

import java.util.BitSet;

/* loaded from: classes2.dex */
public final class goe extends i3 {
    @Override // defpackage.i3
    public final String toString() {
        BitSet bitSet = (BitSet) this.b;
        boolean z = bitSet.get(0);
        boolean z2 = bitSet.get(1);
        boolean z3 = bitSet.get(2);
        boolean z4 = bitSet.get(3);
        boolean z5 = bitSet.get(4);
        boolean z6 = bitSet.get(5);
        boolean z7 = bitSet.get(6);
        boolean z8 = bitSet.get(7);
        StringBuilder sbP = ho7.p("\n            Payload(\n                isSectionChanged=", z, ",\n                isTitleChanged=", z2, ",\n                isTypeChanged=");
        az1.t(",\n                isDescriptionResChanged=", ",\n                isEndViewChanged=", sbP, z3, z4);
        az1.t(",\n                isCounterTypeChanged=", ",\n                isUpperTextChanged=", sbP, z5, z6);
        sbP.append(z7);
        sbP.append(",\n                isStartIconChanged=");
        sbP.append(z8);
        sbP.append(",\n            )\n        ");
        return wmf.d(sbP.toString());
    }
}
