package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Collections;
import java.util.List;
import ru.ok.messages.views.widgets.TamAvatarView;

/* loaded from: classes2.dex */
public final class tz3 extends phd {
    public long X;
    public raa Y;
    public final qv3 d;
    public List o = Collections.EMPTY_LIST;

    public tz3(qv3 qv3Var) {
        this.d = qv3Var;
    }

    @Override // defpackage.phd
    public final int j() {
        return this.o.size();
    }

    @Override // defpackage.phd
    public final long k(int i) {
        return ((kp8) this.o.get(i)).c;
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) throws NumberFormatException {
        sz3 sz3Var = (sz3) midVar;
        kp8 kp8Var = (kp8) this.o.get(i);
        View view = sz3Var.G0;
        ImageView imageView = sz3Var.E0;
        tz3 tz3Var = sz3Var.I0;
        qv3 qv3Var = tz3Var.d;
        TamAvatarView tamAvatarView = sz3Var.F0;
        boolean z = kp8Var.h;
        long j = kp8Var.b;
        if (z) {
            imageView.setVisibility(4);
            tamAvatarView.setVisibility(0);
            tamAvatarView.a(qv3Var.i(j, false));
            if (kp8Var.k) {
                tamAvatarView.setAlpha(1.0f);
            } else {
                tamAvatarView.setAlpha(0.5f);
            }
        } else {
            imageView.setVisibility(0);
            tamAvatarView.setVisibility(8);
            tamAvatarView.a(qv3Var.i(j, false));
        }
        if (kp8Var.c == tz3Var.X) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
        sz3Var.H0 = kp8Var;
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return new sz3(this, LayoutInflater.from(viewGroup.getContext()).inflate(n1d.row_contact_location, viewGroup, false));
    }
}
