package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class hu0 extends kk0 implements np0 {
    public hu0(rf9 rf9Var, w5c w5cVar, wha whaVar) {
        super(rf9Var, w5cVar, whaVar);
        rf9Var.a(this);
        whaVar.getClass();
    }

    @Override // defpackage.kk0
    public final Object e(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
    }

    @Override // defpackage.kk0
    public final void g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    @Override // defpackage.kk0
    public final int i(int i) {
        return i;
    }

    @Override // defpackage.kk0
    public final int j(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    @Override // defpackage.kk0
    public final int k(int i) {
        return i;
    }

    @Override // defpackage.kk0
    public final Object l(fu0 fu0Var) {
        Bitmap bitmap = (Bitmap) super.l(fu0Var);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    @Override // defpackage.kk0
    public final boolean n(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
