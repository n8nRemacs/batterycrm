package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class m72 implements y6c {
    public static final /* synthetic */ yy7[] c;
    public final y6c[] a;
    public final bwf b = new bwf(new hk1(6, this));

    static {
        y8a y8aVar = new y8a(m72.class, "result");
        vid.a.getClass();
        c = new yy7[]{y8aVar};
    }

    public m72(y6c[] y6cVarArr) {
        this.a = y6cVarArr;
        if (y6cVarArr.length == 0) {
            throw new IllegalStateException("postprocessors must be not empty!");
        }
    }

    @Override // defpackage.y6c
    public final vc3 a(Bitmap bitmap, r2c r2cVar) {
        y6c[] y6cVarArr = this.a;
        if (y6cVarArr.length == 1) {
            return ((y6c) ys.v(y6cVarArr)).a(bitmap, r2cVar);
        }
        int length = y6cVarArr.length;
        vc3 vc3VarA = null;
        int i = 0;
        Object objZ = bitmap;
        while (true) {
            yy7[] yy7VarArr = c;
            if (i >= length) {
                yy7 yy7Var = yy7VarArr[0];
                if (vc3VarA != null) {
                    return vc3VarA;
                }
                throw new IllegalStateException("Property " + yy7Var.getName() + " should be initialized before get.");
            }
            vc3VarA = y6cVarArr[i].a((Bitmap) objZ, r2cVar);
            yy7 yy7Var2 = yy7VarArr[0];
            if (vc3VarA == null) {
                throw new IllegalStateException("Property " + yy7Var2.getName() + " should be initialized before get.");
            }
            i++;
            objZ = vc3VarA.Z();
        }
    }

    @Override // defpackage.y6c
    public final ty0 b() {
        return (c1f) this.b.getValue();
    }

    @Override // defpackage.y6c
    public final String getName() {
        return ((c1f) this.b.getValue()).a;
    }
}
