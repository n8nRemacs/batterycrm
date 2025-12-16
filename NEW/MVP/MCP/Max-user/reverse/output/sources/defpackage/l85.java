package defpackage;

import android.graphics.Color;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class l85 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);

    public static void a(d6 d6Var) {
        boolean z;
        jwf jwfVar = new jwf(0, 0);
        jwf jwfVar2 = new jwf(a, b);
        View decorView = d6Var.getWindow().getDecorView();
        boolean z2 = true;
        if ((decorView.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        boolean z3 = (decorView.getResources().getConfiguration().uiMode & 48) == 32 ? z : false;
        int i = Build.VERSION.SDK_INT;
        m85 p85Var = i >= 30 ? new p85() : i >= 29 ? new o85() : i >= 28 ? new n85() : new m85();
        p85Var.b(jwfVar, jwfVar2, d6Var.getWindow(), decorView, z2, z3);
        p85Var.a(d6Var.getWindow());
    }
}
