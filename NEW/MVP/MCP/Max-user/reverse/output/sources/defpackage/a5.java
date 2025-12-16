package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a5 implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final wo4 a;

    public a5(wo4 wo4Var) {
        this.a = wo4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a5) {
            return this.a.equals(((a5) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        d65 d65Var = (d65) this.a.b;
        AutoCompleteTextView autoCompleteTextView = d65Var.h;
        if (autoCompleteTextView == null || baj.b(autoCompleteTextView)) {
            return;
        }
        CheckableImageButton checkableImageButton = d65Var.d;
        int i = z ? 2 : 1;
        WeakHashMap weakHashMap = hfh.a;
        checkableImageButton.setImportantForAccessibility(i);
    }
}
