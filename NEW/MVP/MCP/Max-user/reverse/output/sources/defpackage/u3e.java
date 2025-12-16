package defpackage;

import com.futuremind.recyclerviewfastscroll.FastScroller;

/* loaded from: classes.dex */
public abstract class u3e {
    public FastScroller a;
    public r8j b;

    public final r8j a() {
        if (this.b == null) {
            this.b = new r8j(new zkb(((gp4) this).c, quc.fastscroll__default_show, quc.fastscroll__default_hide));
        }
        return this.b;
    }
}
