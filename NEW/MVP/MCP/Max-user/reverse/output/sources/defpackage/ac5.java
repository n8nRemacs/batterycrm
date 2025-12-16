package defpackage;

import android.graphics.Bitmap;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class ac5 implements qf9 {
    public final Bitmap[] a;
    public final hp0 b;
    public final yk8 c;

    public ac5(nv4 nv4Var) {
        int i = 25;
        Bitmap[] bitmapArr = new Bitmap[25];
        for (int i2 = 0; i2 < 25; i2++) {
            bitmapArr[i2] = null;
        }
        this.a = bitmapArr;
        int i3 = zb5.$EnumSwitchMapping$0[nv4Var.ordinal()];
        if (i3 != 1) {
            if (i3 == 2) {
                i = 40;
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 50;
            }
        }
        this.b = new hp0(kti.c(Integer.valueOf(i).doubleValue() * 1048576), 0);
        this.c = new yk8(100);
    }

    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
        this.b.i(-1);
    }
}
