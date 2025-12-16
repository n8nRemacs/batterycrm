package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class v8g extends l98 {
    public v8g() {
        super(yf4.e);
        A(true);
    }

    @Override // defpackage.phd
    public final long k(int i) {
        return ((t8g) C(i)).a;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        ((u8g) midVar).E0.setText(((t8g) C(i)).b);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return new u8g(LayoutInflater.from(viewGroup.getContext()).inflate(o1d.number_item, viewGroup, false));
    }
}
