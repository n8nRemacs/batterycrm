package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class n83 extends d66 {
    public static final int x0 = m5d.Widget_MaterialComponents_ChipGroup;
    public int o;
    public int s0;
    public l83 t0;
    public final u73 u0;
    public final int v0;
    public final m83 w0;

    /* JADX WARN: Illegal instructions before constructor call */
    public n83(Context context) {
        int i = dvc.chipGroupStyle;
        int i2 = x0;
        Context contextA = er8.a(context, null, i, i2);
        super(contextA, null, i);
        this.c = false;
        TypedArray typedArrayObtainStyledAttributes = contextA.getTheme().obtainStyledAttributes(null, z5d.FlowLayout, 0, 0);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.FlowLayout_lineSpacing, 0);
        this.b = typedArrayObtainStyledAttributes.getDimensionPixelSize(z5d.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
        u73 u73Var = new u73();
        this.u0 = u73Var;
        a2b a2bVar = (a2b) this;
        m83 m83Var = new m83(a2bVar);
        this.w0 = m83Var;
        TypedArray typedArrayD = d7g.d(getContext(), null, z5d.ChipGroup, i, i2, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(z5d.ChipGroup_chipSpacing, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(z5d.ChipGroup_chipSpacingHorizontal, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(z5d.ChipGroup_chipSpacingVertical, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(z5d.ChipGroup_singleLine, false));
        setSingleSelection(typedArrayD.getBoolean(z5d.ChipGroup_singleSelection, false));
        setSelectionRequired(typedArrayD.getBoolean(z5d.ChipGroup_selectionRequired, false));
        this.v0 = typedArrayD.getResourceId(z5d.ChipGroup_checkedChip, -1);
        typedArrayD.recycle();
        u73Var.o = new h08(10, a2bVar);
        super.setOnHierarchyChangeListener(m83Var);
        WeakHashMap weakHashMap = hfh.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof j83);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new j83(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new j83(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.u0.e();
    }

    public List<Integer> getCheckedChipIds() {
        return this.u0.d(this);
    }

    public int getChipSpacingHorizontal() {
        return this.o;
    }

    public int getChipSpacingVertical() {
        return this.s0;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.v0;
        if (i != -1) {
            u73 u73Var = this.u0;
            tq8 tq8Var = (tq8) ((HashMap) u73Var.c).get(Integer.valueOf(i));
            if (tq8Var != null && u73Var.a(tq8Var)) {
                u73Var.g();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) k5.a(getRowCount(), this.c ? getVisibleChipCount() : -1, this.u0.a ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.o != i) {
            this.o = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(k83 k83Var) {
        if (k83Var == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a3b(this, k83Var));
        }
    }

    public void setOnCheckedStateChangeListener(l83 l83Var) {
        this.t0 = l83Var;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.w0.a = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.u0.b = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // defpackage.d66
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        u73 u73Var = this.u0;
        if (u73Var.a != z) {
            u73Var.a = z;
            boolean zIsEmpty = ((HashSet) u73Var.d).isEmpty();
            Iterator it = ((HashMap) u73Var.c).values().iterator();
            while (it.hasNext()) {
                u73Var.h((tq8) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            u73Var.g();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new j83(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
