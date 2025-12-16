package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class dd0 extends yi0 {
    public final /* synthetic */ ira a;
    public final /* synthetic */ ed0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ pe4 d;

    public dd0(ira iraVar, ed0 ed0Var, Context context, pe4 pe4Var) {
        this.a = iraVar;
        this.b = ed0Var;
        this.c = context;
        this.d = pe4Var;
    }

    @Override // defpackage.oj0
    public final void e(pe4 pe4Var) {
        Drawable drawableC = this.b.c(this.c);
        ira iraVar = this.a;
        iraVar.d(drawableC);
        iraVar.b();
        pe4Var.close();
    }

    @Override // defpackage.yi0
    public final void g(Bitmap bitmap) {
        pe4 pe4Var = this.d;
        Context context = this.c;
        ira iraVar = this.a;
        if (bitmap == null) {
            iraVar.d(this.b.c(context));
            iraVar.b();
            pe4Var.close();
        } else {
            otd otdVar = new otd(context.getResources(), Bitmap.createBitmap(bitmap));
            otdVar.d.setAntiAlias(true);
            otdVar.invalidateSelf();
            iraVar.d(otdVar);
            iraVar.b();
            pe4Var.close();
        }
    }
}
