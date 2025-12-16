package defpackage;

import androidx.recyclerview.widget.b;
import java.util.List;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final class qc6 extends yb4 {
    public static final rha z0 = new rha(20);
    public final c54 v0;
    public final b w0;
    public final pc6 x0;
    public List y0;

    public qc6(c54 c54Var, b bVar, pc6 pc6Var) {
        super(c54Var);
        this.v0 = c54Var;
        this.w0 = bVar;
        this.x0 = pc6Var;
        this.y0 = hd5.a;
    }

    @Override // defpackage.yb4
    public final void E(ytd ytdVar, int i) {
        if (ytdVar.n()) {
            return;
        }
        Widget widgetL = this.x0.l(((pa6) this.y0.get(i)).a, this.w0);
        widgetL.setTargetController(this.v0);
        widgetL.setRetainViewMode(b54.b);
        ytdVar.S(new bud(widgetL, null, null, null, false, -1));
    }

    public final void M(List list) {
        if (this.y0.isEmpty() && !list.isEmpty()) {
            this.y0 = list;
            p(0, list.size());
        } else {
            mw4 mw4VarB = q08.b(new ea1(1, this.y0, list));
            this.y0 = list;
            mw4VarB.a(new iv6(2, this));
        }
    }

    @Override // defpackage.phd
    public final int j() {
        return this.y0.size();
    }

    @Override // defpackage.yb4, defpackage.phd
    public final long k(int i) {
        pa6 pa6Var = (pa6) ue3.J(i, this.y0);
        return (pa6Var != null ? pa6Var.a : null) != null ? r3.hashCode() : 0;
    }
}
