package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class l65 implements np0 {
    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
    }

    @Override // defpackage.u5c, defpackage.fod
    public final void b(Object obj) {
        ((Bitmap) obj).recycle();
    }

    @Override // defpackage.u5c
    public final Object get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }
}
