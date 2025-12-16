package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.h6d;
import defpackage.nih;
import defpackage.y26;
import defpackage.yt3;
import defpackage.zl0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Flow extends nih {
    public y26 w0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.nih, defpackage.it3
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        y26 y26Var = new y26();
        y26Var.s0 = 0;
        y26Var.t0 = 0;
        y26Var.u0 = 0;
        y26Var.v0 = 0;
        y26Var.w0 = 0;
        y26Var.x0 = 0;
        y26Var.y0 = false;
        y26Var.z0 = 0;
        y26Var.A0 = 0;
        y26Var.B0 = new zl0();
        y26Var.C0 = null;
        y26Var.D0 = -1;
        y26Var.E0 = -1;
        y26Var.F0 = -1;
        y26Var.G0 = -1;
        y26Var.H0 = -1;
        y26Var.I0 = -1;
        y26Var.J0 = 0.5f;
        y26Var.K0 = 0.5f;
        y26Var.L0 = 0.5f;
        y26Var.M0 = 0.5f;
        y26Var.N0 = 0.5f;
        y26Var.O0 = 0.5f;
        y26Var.P0 = 0;
        y26Var.Q0 = 0;
        y26Var.R0 = 2;
        y26Var.S0 = 2;
        y26Var.T0 = 0;
        y26Var.U0 = -1;
        y26Var.V0 = 0;
        y26Var.W0 = new ArrayList();
        y26Var.X0 = null;
        y26Var.Y0 = null;
        y26Var.Z0 = null;
        y26Var.b1 = 0;
        this.w0 = y26Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h6d.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == h6d.ConstraintLayout_Layout_android_orientation) {
                    this.w0.V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_android_padding) {
                    y26 y26Var2 = this.w0;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    y26Var2.s0 = dimensionPixelSize;
                    y26Var2.t0 = dimensionPixelSize;
                    y26Var2.u0 = dimensionPixelSize;
                    y26Var2.v0 = dimensionPixelSize;
                } else if (index == h6d.ConstraintLayout_Layout_android_paddingStart) {
                    y26 y26Var3 = this.w0;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    y26Var3.u0 = dimensionPixelSize2;
                    y26Var3.w0 = dimensionPixelSize2;
                    y26Var3.x0 = dimensionPixelSize2;
                } else if (index == h6d.ConstraintLayout_Layout_android_paddingEnd) {
                    this.w0.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_android_paddingLeft) {
                    this.w0.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_android_paddingTop) {
                    this.w0.s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_android_paddingRight) {
                    this.w0.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_android_paddingBottom) {
                    this.w0.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_wrapMode) {
                    this.w0.T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.w0.D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.w0.E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.w0.F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.w0.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.w0.G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.w0.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.w0.J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == h6d.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.w0.L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == h6d.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.w0.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == h6d.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.w0.M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == h6d.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.w0.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == h6d.ConstraintLayout_Layout_flow_verticalBias) {
                    this.w0.K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == h6d.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.w0.R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == h6d.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.w0.S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == h6d.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.w0.P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_verticalGap) {
                    this.w0.Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == h6d.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.w0.U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.w0;
        k();
    }

    @Override // defpackage.it3
    public final void i(yt3 yt3Var, boolean z) {
        y26 y26Var = this.w0;
        int i = y26Var.u0;
        if (i > 0 || y26Var.v0 > 0) {
            if (z) {
                y26Var.w0 = y26Var.v0;
                y26Var.x0 = i;
            } else {
                y26Var.w0 = i;
                y26Var.x0 = y26Var.v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0739  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v45 */
    @Override // defpackage.nih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.y26 r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 1899
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.l(y26, int, int):void");
    }

    @Override // defpackage.it3, android.view.View
    public final void onMeasure(int i, int i2) {
        l(this.w0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.w0.L0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.w0.F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.w0.M0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.w0.G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.w0.R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.w0.J0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.w0.P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.w0.D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.w0.N0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.w0.H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.w0.O0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.w0.I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.w0.U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.w0.V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        y26 y26Var = this.w0;
        y26Var.s0 = i;
        y26Var.t0 = i;
        y26Var.u0 = i;
        y26Var.v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.w0.t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.w0.w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.w0.x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.w0.s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.w0.S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.w0.K0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.w0.Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.w0.E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.w0.T0 = i;
        requestLayout();
    }
}
