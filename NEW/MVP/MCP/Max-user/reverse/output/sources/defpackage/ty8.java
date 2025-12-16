package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final /* synthetic */ class ty8 implements uy8, n79 {
    public final /* synthetic */ PendingIntent a;

    public /* synthetic */ ty8(int i, PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    @Override // defpackage.n79
    public void a(t69 t69Var, int i) {
        t69Var.c(i, this.a);
    }

    @Override // defpackage.uy8
    public void c(ly8 ly8Var) {
        if (ly8Var.isConnected()) {
            PendingIntent pendingIntent = ly8Var.p;
            PendingIntent pendingIntent2 = this.a;
            if (Objects.equals(pendingIntent, pendingIntent2)) {
                return;
            }
            ly8Var.p = pendingIntent2;
            px8 px8Var = ly8Var.a;
            px8Var.getClass();
            hsi.g(Looper.myLooper() == px8Var.o.getLooper());
            px8Var.d.getClass();
        }
    }

    public /* synthetic */ ty8(PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }
}
