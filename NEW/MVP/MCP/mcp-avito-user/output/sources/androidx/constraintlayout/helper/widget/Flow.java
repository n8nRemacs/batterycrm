package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.h;
import androidx.constraintlayout.widget.l;

/* loaded from: classes.dex */
public class Flow extends l {

    /* renamed from: l, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.e f43662l;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a
    public final void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.f43662l = new androidx.constraintlayout.core.widgets.e();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44405b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 0) {
                    this.f43662l.f43615Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    androidx.constraintlayout.core.widgets.e eVar = this.f43662l;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar.f43657w0 = dimensionPixelSize;
                    eVar.f43658x0 = dimensionPixelSize;
                    eVar.f43659y0 = dimensionPixelSize;
                    eVar.f43660z0 = dimensionPixelSize;
                } else if (index == 18) {
                    androidx.constraintlayout.core.widgets.e eVar2 = this.f43662l;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    eVar2.f43659y0 = dimensionPixelSize2;
                    eVar2.f43650A0 = dimensionPixelSize2;
                    eVar2.f43651B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f43662l.f43660z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f43662l.f43650A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f43662l.f43657w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f43662l.f43651B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f43662l.f43658x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f43662l.f43613X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f43662l.f43597H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f43662l.f43598I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f43662l.f43599J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f43662l.f43601L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f43662l.f43600K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f43662l.f43602M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f43662l.f43603N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f43662l.f43605P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f43662l.f43607R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f43662l.f43606Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f43662l.f43608S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f43662l.f43604O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f43662l.f43611V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f43662l.f43612W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f43662l.f43609T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f43662l.f43610U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f43662l.f43614Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f44236e = this.f43662l;
        r();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void m(d.a aVar, androidx.constraintlayout.core.widgets.h hVar, e.a aVar2, SparseArray sparseArray) {
        super.m(aVar, hVar, aVar2, sparseArray);
        if (hVar instanceof androidx.constraintlayout.core.widgets.e) {
            androidx.constraintlayout.core.widgets.e eVar = (androidx.constraintlayout.core.widgets.e) hVar;
            int i12 = aVar2.f44176W;
            if (i12 != -1) {
                eVar.f43615Z0 = i12;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void n(ConstraintWidget constraintWidget, boolean z12) {
        androidx.constraintlayout.core.widgets.e eVar = this.f43662l;
        int i12 = eVar.f43659y0;
        if (i12 > 0 || eVar.f43660z0 > 0) {
            if (z12) {
                eVar.f43650A0 = eVar.f43660z0;
                eVar.f43651B0 = i12;
            } else {
                eVar.f43650A0 = i12;
                eVar.f43651B0 = eVar.f43660z0;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i12, int i13) {
        s(this.f43662l, i12, i13);
    }

    @Override // androidx.constraintlayout.widget.l
    public final void s(androidx.constraintlayout.core.widgets.l lVar, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.W(mode, size, mode2, size2);
            setMeasuredDimension(lVar.f43653D0, lVar.f43654E0);
        }
    }

    public void setFirstHorizontalBias(float f12) {
        this.f43662l.f43605P0 = f12;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i12) {
        this.f43662l.f43599J0 = i12;
        requestLayout();
    }

    public void setFirstVerticalBias(float f12) {
        this.f43662l.f43606Q0 = f12;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i12) {
        this.f43662l.f43600K0 = i12;
        requestLayout();
    }

    public void setHorizontalAlign(int i12) {
        this.f43662l.f43611V0 = i12;
        requestLayout();
    }

    public void setHorizontalBias(float f12) {
        this.f43662l.f43603N0 = f12;
        requestLayout();
    }

    public void setHorizontalGap(int i12) {
        this.f43662l.f43609T0 = i12;
        requestLayout();
    }

    public void setHorizontalStyle(int i12) {
        this.f43662l.f43597H0 = i12;
        requestLayout();
    }

    public void setLastHorizontalBias(float f12) {
        this.f43662l.f43607R0 = f12;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i12) {
        this.f43662l.f43601L0 = i12;
        requestLayout();
    }

    public void setLastVerticalBias(float f12) {
        this.f43662l.f43608S0 = f12;
        requestLayout();
    }

    public void setLastVerticalStyle(int i12) {
        this.f43662l.f43602M0 = i12;
        requestLayout();
    }

    public void setMaxElementsWrap(int i12) {
        this.f43662l.f43614Y0 = i12;
        requestLayout();
    }

    public void setOrientation(int i12) {
        this.f43662l.f43615Z0 = i12;
        requestLayout();
    }

    public void setPadding(int i12) {
        androidx.constraintlayout.core.widgets.e eVar = this.f43662l;
        eVar.f43657w0 = i12;
        eVar.f43658x0 = i12;
        eVar.f43659y0 = i12;
        eVar.f43660z0 = i12;
        requestLayout();
    }

    public void setPaddingBottom(int i12) {
        this.f43662l.f43658x0 = i12;
        requestLayout();
    }

    public void setPaddingLeft(int i12) {
        this.f43662l.f43650A0 = i12;
        requestLayout();
    }

    public void setPaddingRight(int i12) {
        this.f43662l.f43651B0 = i12;
        requestLayout();
    }

    public void setPaddingTop(int i12) {
        this.f43662l.f43657w0 = i12;
        requestLayout();
    }

    public void setVerticalAlign(int i12) {
        this.f43662l.f43612W0 = i12;
        requestLayout();
    }

    public void setVerticalBias(float f12) {
        this.f43662l.f43604O0 = f12;
        requestLayout();
    }

    public void setVerticalGap(int i12) {
        this.f43662l.f43610U0 = i12;
        requestLayout();
    }

    public void setVerticalStyle(int i12) {
        this.f43662l.f43598I0 = i12;
        requestLayout();
    }

    public void setWrapMode(int i12) {
        this.f43662l.f43613X0 = i12;
        requestLayout();
    }
}
