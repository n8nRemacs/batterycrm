package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class bg4 extends l98 {
    @Override // defpackage.phd
    public final long k(int i) {
        return ((xf4) C(i)).a;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        ((ag4) midVar).E0.setText(((xf4) C(i)).o);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(o1d.day_item, viewGroup, false);
        viewInflate.setPivotX(0.0f);
        return new ag4(viewInflate);
    }
}
