package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: ReactiveGuide.java */
/* loaded from: classes.dex */
public class i extends View implements j.a {

    /* renamed from: b, reason: collision with root package name */
    public int f44429b;

    /* renamed from: c, reason: collision with root package name */
    public int f44430c;

    public int getApplyToConstraintSetId() {
        return this.f44430c;
    }

    public int getAttributeId() {
        return this.f44429b;
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(0, 0);
    }

    public void setApplyToConstraintSetId(int i12) {
        this.f44430c = i12;
    }

    public void setAttributeId(int i12) {
        HashSet<WeakReference<j.a>> hashSet;
        j sharedValues = ConstraintLayout.getSharedValues();
        int i13 = this.f44429b;
        if (i13 != -1 && (hashSet = sharedValues.f44431a.get(Integer.valueOf(i13))) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<WeakReference<j.a>> it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference<j.a> next = it.next();
                j.a aVar = next.get();
                if (aVar == null || aVar == this) {
                    arrayList.add(next);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f44429b = i12;
        if (i12 != -1) {
            sharedValues.a(i12, this);
        }
    }

    public void setGuidelineBegin(int i12) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f44181b = i12;
        setLayoutParams(bVar);
    }

    public void setGuidelineEnd(int i12) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f44183c = i12;
        setLayoutParams(bVar);
    }

    public void setGuidelinePercent(float f12) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.f44185d = f12;
        setLayoutParams(bVar);
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public void setAnimateChange(boolean z12) {
    }

    @Override // android.view.View
    public void setVisibility(int i12) {
    }
}
