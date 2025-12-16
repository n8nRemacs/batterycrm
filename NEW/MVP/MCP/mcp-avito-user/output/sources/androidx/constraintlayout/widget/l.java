package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.h;

/* compiled from: VirtualLayout.java */
/* loaded from: classes.dex */
public abstract class l extends a {

    /* renamed from: j, reason: collision with root package name */
    public boolean f44442j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44443k;

    public l(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void h(ConstraintLayout constraintLayout) {
        g(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.a
    public void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44405b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 6) {
                    this.f44442j = true;
                } else if (index == 22) {
                    this.f44443k = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f44442j || this.f44443k) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i12 = 0; i12 < this.f44234c; i12++) {
                    View viewById = constraintLayout.getViewById(this.f44233b[i12]);
                    if (viewById != null) {
                        if (this.f44442j) {
                            viewById.setVisibility(visibility);
                        }
                        if (this.f44443k && elevation > 0.0f) {
                            viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f12) {
        super.setElevation(f12);
        f();
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
        super.setVisibility(i12);
        f();
    }

    public void s(androidx.constraintlayout.core.widgets.l lVar, int i12, int i13) {
    }
}
