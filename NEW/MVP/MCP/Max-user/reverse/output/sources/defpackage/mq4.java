package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* loaded from: classes.dex */
public final class mq4 extends dgg {
    public static final /* synthetic */ int Y0 = 0;
    public final int J0;
    public final boolean K0;
    public final boolean L0;
    public final boolean M0;
    public final boolean N0;
    public final boolean O0;
    public final boolean P0;
    public final boolean Q0;
    public final boolean R0;
    public final boolean S0;
    public final boolean T0;
    public final boolean U0;
    public final boolean V0;
    public final SparseArray W0;
    public final SparseBooleanArray X0;

    static {
        new oq4();
    }

    public mq4(oq4 oq4Var) {
        super(oq4Var);
        this.K0 = oq4Var.z;
        this.L0 = oq4Var.A;
        this.M0 = oq4Var.B;
        this.N0 = oq4Var.C;
        this.O0 = oq4Var.D;
        this.P0 = oq4Var.E;
        this.Q0 = oq4Var.F;
        this.R0 = oq4Var.G;
        this.S0 = oq4Var.H;
        this.J0 = oq4Var.I;
        this.T0 = oq4Var.J;
        this.U0 = oq4Var.K;
        this.V0 = oq4Var.L;
        this.W0 = oq4Var.M;
        this.X0 = oq4Var.N;
    }

    @Override // defpackage.dgg
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mq4.class == obj.getClass()) {
            mq4 mq4Var = (mq4) obj;
            if (super.equals(mq4Var) && this.K0 == mq4Var.K0 && this.L0 == mq4Var.L0 && this.M0 == mq4Var.M0 && this.N0 == mq4Var.N0 && this.O0 == mq4Var.O0 && this.P0 == mq4Var.P0 && this.Q0 == mq4Var.Q0 && this.R0 == mq4Var.R0 && this.S0 == mq4Var.S0 && this.J0 == mq4Var.J0 && this.T0 == mq4Var.T0 && this.U0 == mq4Var.U0 && this.V0 == mq4Var.V0) {
                SparseBooleanArray sparseBooleanArray = mq4Var.X0;
                SparseBooleanArray sparseBooleanArray2 = this.X0;
                int size = sparseBooleanArray2.size();
                if (sparseBooleanArray.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = mq4Var.W0;
                            SparseArray sparseArray2 = this.W0;
                            int size2 = sparseArray2.size();
                            if (sparseArray.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int iIndexOfKey = sparseArray.indexOfKey(sparseArray2.keyAt(i2));
                                    if (iIndexOfKey >= 0) {
                                        Map map = (Map) sparseArray2.valueAt(i2);
                                        Map map2 = (Map) sparseArray.valueAt(iIndexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                mfg mfgVar = (mfg) entry.getKey();
                                                if (!map2.containsKey(mfgVar) || !xxg.a(entry.getValue(), map2.get(mfgVar))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray.indexOfKey(sparseBooleanArray2.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dgg
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.K0 ? 1 : 0)) * 31) + (this.L0 ? 1 : 0)) * 31) + (this.M0 ? 1 : 0)) * 31) + (this.N0 ? 1 : 0)) * 31) + (this.O0 ? 1 : 0)) * 31) + (this.P0 ? 1 : 0)) * 31) + (this.Q0 ? 1 : 0)) * 31) + (this.R0 ? 1 : 0)) * 31) + (this.S0 ? 1 : 0)) * 31) + this.J0) * 31) + (this.T0 ? 1 : 0)) * 31) + (this.U0 ? 1 : 0)) * 31) + (this.V0 ? 1 : 0);
    }
}
