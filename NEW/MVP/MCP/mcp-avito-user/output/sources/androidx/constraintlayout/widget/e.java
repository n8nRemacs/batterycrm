package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.h;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* compiled from: Constraints.java */
    public static class a extends ConstraintLayout.b {

        /* renamed from: A0, reason: collision with root package name */
        public float f44388A0;

        /* renamed from: B0, reason: collision with root package name */
        public float f44389B0;

        /* renamed from: C0, reason: collision with root package name */
        public float f44390C0;

        /* renamed from: D0, reason: collision with root package name */
        public float f44391D0;

        /* renamed from: E0, reason: collision with root package name */
        public float f44392E0;

        /* renamed from: s0, reason: collision with root package name */
        public float f44393s0;

        /* renamed from: t0, reason: collision with root package name */
        public boolean f44394t0;

        /* renamed from: u0, reason: collision with root package name */
        public float f44395u0;

        /* renamed from: v0, reason: collision with root package name */
        public float f44396v0;

        /* renamed from: w0, reason: collision with root package name */
        public float f44397w0;

        /* renamed from: x0, reason: collision with root package name */
        public float f44398x0;

        /* renamed from: y0, reason: collision with root package name */
        public float f44399y0;

        /* renamed from: z0, reason: collision with root package name */
        public float f44400z0;

        public a() {
            super(-2, -2);
            this.f44393s0 = 1.0f;
            this.f44394t0 = false;
            this.f44395u0 = 0.0f;
            this.f44396v0 = 0.0f;
            this.f44397w0 = 0.0f;
            this.f44398x0 = 0.0f;
            this.f44399y0 = 1.0f;
            this.f44400z0 = 1.0f;
            this.f44388A0 = 0.0f;
            this.f44389B0 = 0.0f;
            this.f44390C0 = 0.0f;
            this.f44391D0 = 0.0f;
            this.f44392E0 = 0.0f;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.f44393s0 = 1.0f;
        aVar.f44394t0 = false;
        aVar.f44395u0 = 0.0f;
        aVar.f44396v0 = 0.0f;
        aVar.f44397w0 = 0.0f;
        aVar.f44398x0 = 0.0f;
        aVar.f44399y0 = 1.0f;
        aVar.f44400z0 = 1.0f;
        aVar.f44388A0 = 0.0f;
        aVar.f44389B0 = 0.0f;
        aVar.f44390C0 = 0.0f;
        aVar.f44391D0 = 0.0f;
        aVar.f44392E0 = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h.m.f44407d);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i12 = 0; i12 < indexCount; i12++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i12);
            if (index == 15) {
                aVar.f44393s0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44393s0);
            } else if (index == 28) {
                aVar.f44395u0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44395u0);
                aVar.f44394t0 = true;
            } else if (index == 23) {
                aVar.f44397w0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44397w0);
            } else if (index == 24) {
                aVar.f44398x0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44398x0);
            } else if (index == 22) {
                aVar.f44396v0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44396v0);
            } else if (index == 20) {
                aVar.f44399y0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44399y0);
            } else if (index == 21) {
                aVar.f44400z0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44400z0);
            } else if (index == 16) {
                aVar.f44388A0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44388A0);
            } else if (index == 17) {
                aVar.f44389B0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44389B0);
            } else if (index == 18) {
                aVar.f44390C0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44390C0);
            } else if (index == 19) {
                aVar.f44391D0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44391D0);
            } else if (index == 27) {
                aVar.f44392E0 = typedArrayObtainStyledAttributes.getFloat(index, aVar.f44392E0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    public d getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}
