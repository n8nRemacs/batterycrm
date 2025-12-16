package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class d4i extends c4i {
    public static final g4i q = g4i.h(null, WindowInsets.CONSUMED);

    public d4i(g4i g4iVar, WindowInsets windowInsets) {
        super(g4iVar, windowInsets);
    }

    @Override // defpackage.z3i, defpackage.e4i
    public final void d(View view) {
    }

    @Override // defpackage.z3i, defpackage.e4i
    public co7 f(int i) {
        return co7.c(this.c.getInsets(f4i.a(i)));
    }

    @Override // defpackage.z3i, defpackage.e4i
    public boolean o(int i) {
        return this.c.isVisible(f4i.a(i));
    }
}
