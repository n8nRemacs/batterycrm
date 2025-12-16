package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: b, reason: collision with root package name */
    public boolean f44232b;

    public Guideline(Context context) {
        super(context);
        this.f44232b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z12) {
        this.f44232b = z12;
    }

    public void setGuidelineBegin(int i12) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f44232b && bVar.f44181b == i12) {
            return;
        }
        bVar.f44181b = i12;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i12) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f44232b && bVar.f44183c == i12) {
            return;
        }
        bVar.f44183c = i12;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f12) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        if (this.f44232b && bVar.f44185d == f12) {
            return;
        }
        bVar.f44185d = f12;
        setLayoutParams(bVar);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44232b = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
    }
}
