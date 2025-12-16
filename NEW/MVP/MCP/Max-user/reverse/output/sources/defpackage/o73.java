package defpackage;

import androidx.appcompat.widget.AppCompatCheckBox;

/* loaded from: classes.dex */
public final class o73 extends AppCompatCheckBox {
    public int o;

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + this.o;
    }

    public final int getPaddingBetweenCheckbox() {
        return this.o;
    }

    public final void setPaddingBetweenCheckbox(int i) {
        this.o = i;
        invalidate();
        requestLayout();
    }
}
