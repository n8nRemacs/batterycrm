package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xhg extends whg {
    public final /* synthetic */ us a;
    public final /* synthetic */ yhg b;

    public xhg(yhg yhgVar, us usVar) {
        this.b = yhgVar;
        this.a = usVar;
    }

    @Override // defpackage.whg, defpackage.rhg
    public final void c(shg shgVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(shgVar);
        shgVar.D(this);
    }
}
