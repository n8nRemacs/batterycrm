package defpackage;

import java.util.List;
import one.me.devmenu.DevMenuFeatureTogglesPageScreen;
import one.me.devmenu.DevMenuGeneralPageScreen;

/* loaded from: classes2.dex */
public final class bv4 extends yb4 {
    @Override // defpackage.yb4
    public final void E(ytd ytdVar, int i) {
        c54 devMenuGeneralPageScreen;
        if (ytdVar.n()) {
            return;
        }
        List list = ev4.a;
        int i2 = ((dv4) list.get(i)).a;
        if (i2 == 0) {
            devMenuGeneralPageScreen = new DevMenuGeneralPageScreen();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException(("Unknown tab id: " + ((dv4) list.get(i)).a).toString());
            }
            devMenuGeneralPageScreen = new DevMenuFeatureTogglesPageScreen();
        }
        c54 c54Var = devMenuGeneralPageScreen;
        c54Var.setRetainViewMode(b54.b);
        ytdVar.S(new bud(c54Var, null, null, null, false, -1));
    }

    @Override // defpackage.phd
    public final int j() {
        return ev4.a.size();
    }
}
