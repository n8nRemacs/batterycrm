package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class o85 extends n85 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m85
    public void b(jwf jwfVar, jwf jwfVar2, Window window, View view, boolean z, boolean z2) {
        h4i h4iVar;
        dsi.d(window, false);
        jwfVar.getClass();
        window.setStatusBarColor(0);
        jwfVar2.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        vgd vgdVar = new vgd(view);
        if (Build.VERSION.SDK_INT >= 30) {
            i4i i4iVar = new i4i(window.getInsetsController(), vgdVar);
            i4iVar.c = window;
            h4iVar = i4iVar;
        } else {
            h4iVar = new h4i(window, vgdVar);
        }
        h4iVar.m(!z);
        h4iVar.l(!z2);
    }
}
