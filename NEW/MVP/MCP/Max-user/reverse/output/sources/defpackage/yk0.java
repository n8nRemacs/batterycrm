package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class yk0 extends kn5 {
    public final l4f q;
    public final Rect r;

    public yk0(l4f l4fVar) {
        super(l4fVar);
        this.r = new Rect();
        this.q = l4fVar;
    }

    @Override // defpackage.kn5
    public final int n(float f, float f2) {
        int i = 0;
        while (true) {
            l4f l4fVar = this.q;
            if (i >= l4fVar.getValues().size()) {
                return -1;
            }
            Rect rect = this.r;
            l4fVar.u(i, rect);
            if (rect.contains((int) f, (int) f2)) {
                return i;
            }
            i++;
        }
    }

    @Override // defpackage.kn5
    public final void o(ArrayList arrayList) {
        for (int i = 0; i < this.q.getValues().size(); i++) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.kn5
    public final boolean s(int i, int i2, Bundle bundle) {
        l4f l4fVar = this.q;
        if (!l4fVar.isEnabled()) {
            return false;
        }
        if (i2 != 4096 && i2 != 8192) {
            if (i2 != 16908349 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || !l4fVar.s(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                return false;
            }
            l4fVar.v();
            l4fVar.postInvalidate();
            p(i);
            return true;
        }
        float fRound = l4fVar.i1;
        if (fRound == 0.0f) {
            fRound = 1.0f;
        }
        if ((l4fVar.e1 - l4fVar.d1) / fRound > 20) {
            fRound *= Math.round(r1 / r4);
        }
        if (i2 == 8192) {
            fRound = -fRound;
        }
        if (l4fVar.k()) {
            fRound = -fRound;
        }
        if (!l4fVar.s(i, dui.d(l4fVar.getValues().get(i).floatValue() + fRound, l4fVar.getValueFrom(), l4fVar.getValueTo()))) {
            return false;
        }
        l4fVar.v();
        l4fVar.postInvalidate();
        p(i);
        return true;
    }

    @Override // defpackage.kn5
    public final void u(int i, m5 m5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m5Var.a;
        m5Var.b(g5.m);
        l4f l4fVar = this.q;
        List<Float> values = l4fVar.getValues();
        Float f = values.get(i);
        float fFloatValue = f.floatValue();
        float valueFrom = l4fVar.getValueFrom();
        float valueTo = l4fVar.getValueTo();
        if (l4fVar.isEnabled()) {
            if (fFloatValue > valueFrom) {
                m5Var.a(8192);
            }
            if (fFloatValue < valueTo) {
                m5Var.a(4096);
            }
        }
        accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, valueFrom, valueTo, fFloatValue));
        m5Var.h(SeekBar.class.getName());
        StringBuilder sb = new StringBuilder();
        if (l4fVar.getContentDescription() != null) {
            sb.append(l4fVar.getContentDescription());
            sb.append(",");
        }
        String str = String.format(((float) ((int) fFloatValue)) == fFloatValue ? "%.0f" : "%.2f", f);
        String string = l4fVar.getContext().getString(s2d.material_slider_value);
        if (values.size() > 1) {
            string = i == l4fVar.getValues().size() - 1 ? l4fVar.getContext().getString(s2d.material_slider_range_end) : i == 0 ? l4fVar.getContext().getString(s2d.material_slider_range_start) : "";
        }
        Locale locale = Locale.US;
        sb.append(string + ", " + str);
        accessibilityNodeInfo.setContentDescription(sb.toString());
        Rect rect = this.r;
        l4fVar.u(i, rect);
        accessibilityNodeInfo.setBoundsInParent(rect);
    }
}
