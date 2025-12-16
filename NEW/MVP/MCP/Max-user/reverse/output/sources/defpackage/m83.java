package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m83 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final /* synthetic */ a2b b;

    public m83(a2b a2bVar) {
        this.b = a2bVar;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        a2b a2bVar = this.b;
        if (view == a2bVar && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = hfh.a;
                view2.setId(View.generateViewId());
            }
            u73 u73Var = a2bVar.u0;
            Chip chip = (Chip) view2;
            ((HashMap) u73Var.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                u73Var.a(chip);
            }
            chip.setInternalOnCheckedChangeListener(new ao6(10, u73Var));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        a2b a2bVar = this.b;
        if (view == a2bVar && (view2 instanceof Chip)) {
            u73 u73Var = a2bVar.u0;
            Chip chip = (Chip) view2;
            u73Var.getClass();
            chip.setInternalOnCheckedChangeListener(null);
            ((HashMap) u73Var.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) u73Var.d).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
