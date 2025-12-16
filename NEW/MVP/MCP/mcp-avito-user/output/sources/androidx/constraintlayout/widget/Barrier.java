package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Barrier extends a {

    /* renamed from: j, reason: collision with root package name */
    public int f44132j;

    /* renamed from: k, reason: collision with root package name */
    public int f44133k;

    /* renamed from: l, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.a f44134l;

    public Barrier(Context context) {
        super(context);
        this.f44233b = new int[32];
        this.f44239h = null;
        this.f44240i = new HashMap<>();
        this.f44235d = context;
        l(null);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f44134l.f43483x0;
    }

    public int getMargin() {
        return this.f44134l.f43484y0;
    }

    public int getType() {
        return this.f44132j;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.f44134l = new androidx.constraintlayout.core.widgets.a();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44405b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 26) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f44134l.f43483x0 = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f44134l.f43484y0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f44236e = this.f44134l;
        r();
    }

    @Override // androidx.constraintlayout.widget.a
    public final void m(d.a aVar, androidx.constraintlayout.core.widgets.h hVar, e.a aVar2, SparseArray sparseArray) {
        super.m(aVar, hVar, aVar2, sparseArray);
        if (hVar instanceof androidx.constraintlayout.core.widgets.a) {
            androidx.constraintlayout.core.widgets.a aVar3 = (androidx.constraintlayout.core.widgets.a) hVar;
            boolean z12 = ((androidx.constraintlayout.core.widgets.d) hVar.f43424V).f43596z0;
            d.b bVar = aVar.f44269e;
            s(aVar3, bVar.f44325g0, z12);
            aVar3.f43483x0 = bVar.f44341o0;
            aVar3.f43484y0 = bVar.f44327h0;
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void n(ConstraintWidget constraintWidget, boolean z12) {
        s(constraintWidget, this.f44132j, z12);
    }

    public final void s(ConstraintWidget constraintWidget, int i12, boolean z12) {
        this.f44133k = i12;
        if (z12) {
            int i13 = this.f44132j;
            if (i13 == 5) {
                this.f44133k = 1;
            } else if (i13 == 6) {
                this.f44133k = 0;
            }
        } else {
            int i14 = this.f44132j;
            if (i14 == 5) {
                this.f44133k = 0;
            } else if (i14 == 6) {
                this.f44133k = 1;
            }
        }
        if (constraintWidget instanceof androidx.constraintlayout.core.widgets.a) {
            ((androidx.constraintlayout.core.widgets.a) constraintWidget).f43482w0 = this.f44133k;
        }
    }

    public void setAllowsGoneWidget(boolean z12) {
        this.f44134l.f43483x0 = z12;
    }

    public void setDpMargin(int i12) {
        this.f44134l.f43484y0 = (int) ((i12 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i12) {
        this.f44134l.f43484y0 = i12;
    }

    public void setType(int i12) {
        this.f44132j = i12;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
