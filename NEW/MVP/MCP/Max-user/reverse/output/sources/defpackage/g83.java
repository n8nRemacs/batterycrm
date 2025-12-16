package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g83 extends kn5 {
    public final /* synthetic */ Chip q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g83(Chip chip, Chip chip2) {
        super(chip2);
        this.q = chip;
    }

    @Override // defpackage.kn5
    public final int n(float f, float f2) {
        int i = Chip.K0;
        Chip chip = this.q;
        return (chip.e() && chip.getCloseIconTouchBounds().contains(f, f2)) ? 1 : 0;
    }

    @Override // defpackage.kn5
    public final void o(ArrayList arrayList) {
        i83 i83Var;
        arrayList.add(0);
        int i = Chip.K0;
        Chip chip = this.q;
        if (!chip.e() || (i83Var = chip.o) == null || !i83Var.V0 || chip.u0 == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // defpackage.kn5
    public final boolean s(int i, int i2, Bundle bundle) {
        boolean z = false;
        if (i2 == 16) {
            Chip chip = this.q;
            if (i == 0) {
                return chip.performClick();
            }
            if (i == 1) {
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.u0;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (chip.G0) {
                    chip.F0.x(1, 1);
                }
            }
        }
        return z;
    }

    @Override // defpackage.kn5
    public final void t(m5 m5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m5Var.a;
        Chip chip = this.q;
        i83 i83Var = chip.o;
        accessibilityNodeInfo.setCheckable(i83Var != null && i83Var.b1);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        m5Var.h(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    @Override // defpackage.kn5
    public final void u(int i, m5 m5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m5Var.a;
        if (i != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.L0);
            return;
        }
        Chip chip = this.q;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(s2d.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        m5Var.b(g5.e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
    }

    @Override // defpackage.kn5
    public final void v(int i, boolean z) {
        if (i == 1) {
            Chip chip = this.q;
            chip.A0 = z;
            chip.refreshDrawableState();
        }
    }
}
