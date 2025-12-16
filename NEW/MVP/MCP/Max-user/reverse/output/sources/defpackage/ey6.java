package defpackage;

import android.content.res.TypedArray;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ey6 extends ViewGroup.MarginLayoutParams {
    public static final int c = (-2147483647) - Integer.MIN_VALUE;
    public static final int d = m6d.GridLayout_Layout_android_layout_margin;
    public static final int e = m6d.GridLayout_Layout_android_layout_marginLeft;
    public static final int f = m6d.GridLayout_Layout_android_layout_marginTop;
    public static final int g = m6d.GridLayout_Layout_android_layout_marginRight;
    public static final int h = m6d.GridLayout_Layout_android_layout_marginBottom;
    public static final int i = m6d.GridLayout_Layout_layout_column;
    public static final int j = m6d.GridLayout_Layout_layout_columnSpan;
    public static final int k = m6d.GridLayout_Layout_layout_columnWeight;
    public static final int l = m6d.GridLayout_Layout_layout_row;
    public static final int m = m6d.GridLayout_Layout_layout_rowSpan;
    public static final int n = m6d.GridLayout_Layout_layout_rowWeight;
    public static final int o = m6d.GridLayout_Layout_layout_gravity;
    public gy6 a;
    public gy6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey6() {
        super(-2, -2);
        gy6 gy6Var = gy6.e;
        this.a = gy6Var;
        this.b = gy6Var;
        setMargins(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = gy6Var;
        this.b = gy6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ey6.class != obj.getClass()) {
            return false;
        }
        ey6 ey6Var = (ey6) obj;
        return this.b.equals(ey6Var.b) && this.a.equals(ey6Var.a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // android.view.ViewGroup.LayoutParams
    public final void setBaseAttributes(TypedArray typedArray, int i2, int i3) {
        ((ViewGroup.MarginLayoutParams) this).width = typedArray.getLayoutDimension(i2, -2);
        ((ViewGroup.MarginLayoutParams) this).height = typedArray.getLayoutDimension(i3, -2);
    }
}
