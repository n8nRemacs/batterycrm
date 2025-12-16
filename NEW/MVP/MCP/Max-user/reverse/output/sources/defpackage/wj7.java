package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class wj7 extends View.AccessibilityDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((xj7) this.b).h.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    break;
                }
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEvent(View view, int i) {
        Object value;
        switch (this.a) {
            case 1:
                if (i == 8192) {
                    ik9 ik9Var = (ik9) this.b;
                    tcf tcfVar = ik9Var.L0;
                    do {
                        value = tcfVar.getValue();
                        ((Number) value).intValue();
                    } while (!tcfVar.c(value, Integer.valueOf(ik9Var.d.getSelectionEnd())));
                }
                break;
            default:
                super.sendAccessibilityEvent(view, i);
                break;
        }
    }
}
