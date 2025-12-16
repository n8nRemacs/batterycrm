package defpackage;

import android.graphics.Bitmap;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class we7 extends yi0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public we7(l42 l42Var, pe4 pe4Var, mkd mkdVar) {
        this.b = l42Var;
        this.c = pe4Var;
        this.d = mkdVar;
    }

    @Override // defpackage.oj0, defpackage.af4
    public void c() {
        switch (this.a) {
            case 1:
                l42 l42Var = (l42) this.b;
                if (l42Var.r()) {
                    l42Var.h(new Throwable("Cancelled with fresco pipeline"));
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oj0
    public final void e(pe4 pe4Var) {
        switch (this.a) {
            case 0:
                ((ye7) this.d).c((xe7) this.b);
                break;
            default:
                l42 l42Var = (l42) this.b;
                if (l42Var.r()) {
                    l42Var.resumeWith(null);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.yi0
    public final void g(Bitmap bitmap) throws Throwable {
        FileOutputStream fileOutputStream;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        FileOutputStream fileOutputStream2 = null;
        switch (i) {
            case 0:
                xe7 xe7Var = (xe7) obj3;
                ye7 ye7Var = (ye7) obj;
                if (bitmap == null) {
                    wqi.e("ye7", "onNewResultImpl: bitmap is null in shareWebpImage", null);
                    ye7Var.c(xe7Var);
                    return;
                }
                try {
                    String absolutePath = ((qx5) obj2).a("png").getAbsolutePath();
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                    try {
                        try {
                            fileOutputStream = new FileOutputStream(absolutePath);
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        bitmap.compress(compressFormat, 100, fileOutputStream);
                        gbj.c(fileOutputStream);
                        ye7Var.d(new qz5(xe7Var, 13, absolutePath));
                        return;
                    } catch (IOException e2) {
                        e = e2;
                        wqi.e("ye7", "saveBitmap failure!", e);
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream2 = fileOutputStream;
                        gbj.c(fileOutputStream2);
                        throw th;
                    }
                } catch (Exception e3) {
                    wqi.e("ye7", "onNewResultImpl: failed to save webp image", e3);
                    ye7Var.c(xe7Var);
                    return;
                }
            default:
                l42 l42Var = (l42) obj3;
                if (!l42Var.r()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                        return;
                    }
                    return;
                } else if (!((r0) ((pe4) obj2)).g()) {
                    if (bitmap != null) {
                        bitmap.recycle();
                    }
                    l42Var.resumeWith(null);
                    return;
                } else if (bitmap == null) {
                    l42Var.resumeWith(null);
                    return;
                } else {
                    rj6 rj6Var = ((mkd) obj).c;
                    l42Var.resumeWith(new sj6(rj6Var.b, rj6Var.c, bitmap));
                    return;
                }
        }
    }

    public we7(ye7 ye7Var, xe7 xe7Var, qx5 qx5Var) {
        this.d = ye7Var;
        this.b = xe7Var;
        this.c = qx5Var;
    }
}
