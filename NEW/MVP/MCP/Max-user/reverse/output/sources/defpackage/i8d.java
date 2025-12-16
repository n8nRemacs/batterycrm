package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class i8d extends ConstraintLayout {
    public int F0;
    public h8d G0;

    public final int getSelected() {
        return this.F0 + 1;
    }

    public final void setOnSelectListener(h8d h8dVar) {
        this.G0 = h8dVar;
    }
}
