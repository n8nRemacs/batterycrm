package defpackage;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class h42 extends h2f {
    public final Typeface c;
    public final g42 d;
    public boolean e;

    public h42(g42 g42Var, Typeface typeface) {
        this.c = typeface;
        this.d = g42Var;
    }

    @Override // defpackage.h2f
    public final void c(int i) {
        if (this.e) {
            return;
        }
        this.d.o(this.c);
    }

    @Override // defpackage.h2f
    public final void d(Typeface typeface, boolean z) {
        if (this.e) {
            return;
        }
        this.d.o(typeface);
    }
}
