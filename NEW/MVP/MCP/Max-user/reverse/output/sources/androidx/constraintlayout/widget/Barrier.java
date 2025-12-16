package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.h6d;
import defpackage.it3;
import defpackage.qi0;
import defpackage.yt3;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends it3 {
    public int u0;
    public int v0;
    public qi0 w0;

    public Barrier(Context context) {
        super(context);
        this.a = new int[32];
        this.t0 = new HashMap();
        this.c = context;
        h(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.w0.t0;
    }

    public int getMargin() {
        return this.w0.u0;
    }

    public int getType() {
        return this.u0;
    }

    @Override // defpackage.it3
    public final void h(AttributeSet attributeSet) {
        super.h(attributeSet);
        qi0 qi0Var = new qi0();
        qi0Var.s0 = 0;
        qi0Var.t0 = true;
        qi0Var.u0 = 0;
        qi0Var.v0 = false;
        this.w0 = qi0Var;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h6d.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == h6d.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == h6d.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.w0.t0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == h6d.ConstraintLayout_Layout_barrierMargin) {
                    this.w0.u0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.d = this.w0;
        k();
    }

    @Override // defpackage.it3
    public final void i(yt3 yt3Var, boolean z) {
        int i = this.u0;
        this.v0 = i;
        if (z) {
            if (i == 5) {
                this.v0 = 1;
            } else if (i == 6) {
                this.v0 = 0;
            }
        } else if (i == 5) {
            this.v0 = 0;
        } else if (i == 6) {
            this.v0 = 1;
        }
        if (yt3Var instanceof qi0) {
            ((qi0) yt3Var).s0 = this.v0;
        }
    }

    public void setAllowsGoneWidget(boolean z) {
        this.w0.t0 = z;
    }

    public void setDpMargin(int i) {
        this.w0.u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.w0.u0 = i;
    }

    public void setType(int i) {
        this.u0 = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
