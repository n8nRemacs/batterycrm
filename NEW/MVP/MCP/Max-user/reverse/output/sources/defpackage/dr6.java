package defpackage;

import android.util.SparseIntArray;
import com.facebook.imagepipeline.memory.BasePool$InvalidSizeException;

/* loaded from: classes.dex */
public class dr6 extends kk0 {
    public final int[] t0;

    public dr6(rf9 rf9Var, w5c w5cVar, wha whaVar) {
        super(rf9Var, w5cVar, whaVar);
        SparseIntArray sparseIntArray = w5cVar.c;
        if (sparseIntArray != null) {
            this.t0 = new int[sparseIntArray.size()];
            int size = sparseIntArray.size();
            for (int i = 0; i < size; i++) {
                this.t0[i] = sparseIntArray.keyAt(i);
            }
        } else {
            this.t0 = new int[0];
        }
        this.b.a(this);
        this.s0.getClass();
    }

    @Override // defpackage.kk0
    public final Object e(int i) {
        return new byte[i];
    }

    @Override // defpackage.kk0
    public final /* bridge */ /* synthetic */ void g(Object obj) {
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
        return ((byte[]) obj).length;
    }

    @Override // defpackage.kk0
    public final int k(int i) {
        return i;
    }
}
