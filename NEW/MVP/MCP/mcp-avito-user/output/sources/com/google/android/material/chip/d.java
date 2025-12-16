package com.google.android.material.chip;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import com.google.android.material.internal.C37073n;
import j.D;
import j.InterfaceC42152h;
import j.InterfaceC42161q;
import j.N;
import j.P;
import j.r;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: ChipGroup.java */
/* loaded from: classes6.dex */
public class d extends C37073n {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f356304i = 0;

    /* renamed from: f, reason: collision with root package name */
    @r
    public int f356305f;

    /* renamed from: g, reason: collision with root package name */
    @r
    public int f356306g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public InterfaceC10637d f356307h;

    /* compiled from: ChipGroup.java */
    public class a implements InterfaceC10637d {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f356308a;

        public a(d dVar, c cVar) {
            this.f356308a = cVar;
        }
    }

    /* compiled from: ChipGroup.java */
    public static class b extends ViewGroup.MarginLayoutParams {
    }

    /* compiled from: ChipGroup.java */
    @Deprecated
    public interface c {
    }

    /* compiled from: ChipGroup.java */
    /* renamed from: com.google.android.material.chip.d$d, reason: collision with other inner class name */
    public interface InterfaceC10637d {
    }

    /* compiled from: ChipGroup.java */
    public class e implements ViewGroup.OnHierarchyChangeListener {
        public e(com.google.android.material.chip.c cVar) {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            d dVar = d.this;
            if (view == dVar && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                    view2.setId(View.generateViewId());
                }
                int i12 = d.f356304i;
                dVar.getClass();
                throw null;
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            d dVar = d.this;
            if (view == dVar && (view2 instanceof Chip)) {
                int i12 = d.f356304i;
                dVar.getClass();
                throw null;
            }
        }
    }

    private int getVisibleChipCount() {
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            if ((getChildAt(i13) instanceof Chip) && getChildAt(i13).getVisibility() == 0) {
                i12++;
            }
        }
        return i12;
    }

    @Override // com.google.android.material.internal.C37073n
    public final boolean a() {
        return this.f356831d;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    @N
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    @N
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    @D
    public int getCheckedChipId() {
        throw null;
    }

    @N
    public List<Integer> getCheckedChipIds() {
        throw null;
    }

    @r
    public int getChipSpacingHorizontal() {
        return this.f356305f;
    }

    @r
    public int getChipSpacingVertical() {
        return this.f356306g;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f356831d) {
            getVisibleChipCount();
        }
        getRowCount();
        throw null;
    }

    public void setChipSpacing(@r int i12) {
        setChipSpacingHorizontal(i12);
        setChipSpacingVertical(i12);
    }

    public void setChipSpacingHorizontal(@r int i12) {
        if (this.f356305f != i12) {
            this.f356305f = i12;
            setItemSpacing(i12);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@InterfaceC42161q int i12) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i12));
    }

    public void setChipSpacingResource(@InterfaceC42161q int i12) {
        setChipSpacing(getResources().getDimensionPixelOffset(i12));
    }

    public void setChipSpacingVertical(@r int i12) {
        if (this.f356306g != i12) {
            this.f356306g = i12;
            setLineSpacing(i12);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@InterfaceC42161q int i12) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i12));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@P Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i12) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@P c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a(this, cVar));
        }
    }

    public void setOnCheckedStateChangeListener(@P InterfaceC10637d interfaceC10637d) {
        this.f356307h = interfaceC10637d;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        throw null;
    }

    public void setSelectionRequired(boolean z12) {
        throw null;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i12) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i12) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.C37073n
    public void setSingleLine(boolean z12) {
        super.setSingleLine(z12);
    }

    public void setSingleSelection(boolean z12) {
        throw null;
    }

    public void setSingleLine(@InterfaceC42152h int i12) {
        setSingleLine(getResources().getBoolean(i12));
    }

    public void setSingleSelection(@InterfaceC42152h int i12) {
        setSingleSelection(getResources().getBoolean(i12));
    }

    @Override // android.view.ViewGroup
    @N
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }
}
