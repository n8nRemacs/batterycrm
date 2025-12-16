package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class j4i {
    public final hsi a;

    public j4i(Window window, View view) {
        vgd vgdVar = new vgd(view);
        if (Build.VERSION.SDK_INT < 30) {
            this.a = new h4i(window, vgdVar);
            return;
        }
        i4i i4iVar = new i4i(window.getInsetsController(), vgdVar);
        i4iVar.c = window;
        this.a = i4iVar;
    }
}
