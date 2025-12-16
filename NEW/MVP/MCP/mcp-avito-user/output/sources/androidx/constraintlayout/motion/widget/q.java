package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;
import java.util.HashMap;

/* compiled from: MotionHelper.java */
/* loaded from: classes.dex */
public class q extends androidx.constraintlayout.widget.a implements r {

    /* renamed from: j, reason: collision with root package name */
    public boolean f44031j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f44032k;

    /* renamed from: l, reason: collision with root package name */
    public float f44033l;

    /* renamed from: m, reason: collision with root package name */
    public View[] f44034m;

    public float getProgress() {
        return this.f44033l;
    }

    @Override // androidx.constraintlayout.widget.a
    public final void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.m.f44416m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == 1) {
                    this.f44031j = typedArrayObtainStyledAttributes.getBoolean(index, this.f44031j);
                } else if (index == 0) {
                    this.f44032k = typedArrayObtainStyledAttributes.getBoolean(index, this.f44032k);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f12) {
        this.f44033l = f12;
        int i12 = 0;
        if (this.f44234c > 0) {
            this.f44034m = k((ConstraintLayout) getParent());
            while (i12 < this.f44234c) {
                View view = this.f44034m[i12];
                i12++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i12 < childCount) {
            boolean z12 = viewGroup.getChildAt(i12) instanceof q;
            i12++;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.j
    public final void b() {
    }

    public void a(int i12) {
    }

    public void s(MotionLayout motionLayout, HashMap<View, p> map) {
    }
}
