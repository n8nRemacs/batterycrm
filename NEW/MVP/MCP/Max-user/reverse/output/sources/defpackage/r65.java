package defpackage;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class r65 implements np0 {
    public final Set a = Collections.newSetFromMap(new IdentityHashMap());

    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
    }

    @Override // defpackage.u5c, defpackage.fod
    public final void b(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        this.a.remove(bitmap);
        bitmap.recycle();
    }

    @Override // defpackage.u5c
    public final Object get(int i) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, (int) Math.ceil(i / 2.0d), Bitmap.Config.RGB_565);
        this.a.add(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }
}
