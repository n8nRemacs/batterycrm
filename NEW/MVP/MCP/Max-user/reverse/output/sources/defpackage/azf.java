package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final /* synthetic */ class azf implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ azf(yb0 yb0Var) {
        this.b = yb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v32 v32Var = this.b.c;
                break;
            default:
                v32 v32Var2 = this.b.c;
                break;
        }
    }

    public /* synthetic */ azf(yb0 yb0Var, Bitmap bitmap) {
        this.b = yb0Var;
    }
}
