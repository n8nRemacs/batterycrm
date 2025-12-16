package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* loaded from: classes.dex */
public abstract class mf9 extends kk0 {
    public final int[] t0;

    public mf9(rf9 rf9Var, w5c w5cVar, x5c x5cVar) {
        super(rf9Var, w5cVar, x5cVar);
        SparseIntArray sparseIntArray = w5cVar.c;
        sparseIntArray.getClass();
        this.t0 = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.t0;
            if (i >= iArr.length) {
                this.b.a(this);
                this.s0.getClass();
                return;
            } else {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            }
        }
    }

    @Override // defpackage.kk0
    public final void g(Object obj) {
        lf9 lf9Var = (lf9) obj;
        lf9Var.getClass();
        lf9Var.close();
    }

    @Override // defpackage.kk0
    public final int i(int i) {
        if (i <= 0) {
            throw new BasePool$InvalidSizeException(Integer.valueOf(i));
        }
        for (int i2 : this.t0) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    @Override // defpackage.kk0
    public final int j(Object obj) {
        lf9 lf9Var = (lf9) obj;
        lf9Var.getClass();
        return lf9Var.getSize();
    }

    @Override // defpackage.kk0
    public final int k(int i) {
        return i;
    }

    @Override // defpackage.kk0
    public final boolean n(Object obj) {
        ((lf9) obj).getClass();
        return !r1.isClosed();
    }
}
