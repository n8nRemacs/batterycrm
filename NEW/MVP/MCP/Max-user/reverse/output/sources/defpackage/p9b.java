package defpackage;

import android.content.res.ColorStateList;

/* loaded from: classes2.dex */
public final class p9b extends po implements u6g {
    public final void b(boolean z, yeb yebVar) {
        setButtonTintList(ColorStateList.valueOf(z ? yebVar.getIcon().k : yebVar.i().b.b));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        b(isChecked(), yebVar);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        b(z, a93.s0.y(this));
    }
}
