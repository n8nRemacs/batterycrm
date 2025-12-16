package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.kt3;

/* loaded from: classes.dex */
public class Guideline extends View {
    public boolean a;

    public Guideline(Context context) {
        super(context);
        this.a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.a = z;
    }

    public void setGuidelineBegin(int i) {
        kt3 kt3Var = (kt3) getLayoutParams();
        if (this.a && kt3Var.a == i) {
            return;
        }
        kt3Var.a = i;
        setLayoutParams(kt3Var);
    }

    public void setGuidelineEnd(int i) {
        kt3 kt3Var = (kt3) getLayoutParams();
        if (this.a && kt3Var.b == i) {
            return;
        }
        kt3Var.b = i;
        setLayoutParams(kt3Var);
    }

    public void setGuidelinePercent(float f) {
        kt3 kt3Var = (kt3) getLayoutParams();
        if (this.a && kt3Var.c == f) {
            return;
        }
        kt3Var.c = f;
        setLayoutParams(kt3Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = true;
        super.setVisibility(8);
    }
}
