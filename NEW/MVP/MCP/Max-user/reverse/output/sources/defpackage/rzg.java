package defpackage;

import android.app.Application;
import android.app.NotificationManager;
import android.content.Context;

/* loaded from: classes2.dex */
public final class rzg extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ rzg(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                Context context = (Context) w5Var.c(12);
                NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                return new tzg(((Boolean) vzg.a.getValue()).booleanValue(), new y6i(0, context), notificationManager);
            case 1:
                return new tih((Application) w5Var.c(14), (s1e) w5Var.c(72), w5Var.d(87), w5Var.d(88), w5Var.d(89), ((q2b) ((lzf) w5Var.c(8))).b().limitedParallelism(1, "visibility-controller"), w5Var.d(10));
            case 2:
                return (tih) w5Var.c(75);
            case 3:
                return (lv4) w5Var.c(77);
            case 4:
                return new lv4((Context) w5Var.c(12), (z7c) w5Var.c(32), (alf) w5Var.c(80), w5Var.d(81), w5Var.d(74), w5Var.d(75));
            case 5:
                return x4j.b((Context) w5Var.c(12));
            case 6:
                return moi.a(ew7.d, q8.Z);
            case 7:
                return new uv7(w5Var.d(8), w5Var.a(5), (rzh) w5Var.c(593), w5Var.d(587));
            case 8:
                return new xh3((ew7) w5Var.c(587), w5Var.d(158));
            default:
                return new i9h((Context) w5Var.c(12));
        }
    }
}
