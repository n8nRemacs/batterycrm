package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class yhf extends ViewGroup implements u6g {
    public final aif a;
    public final RecyclerView b;

    public yhf(Context context) {
        super(context, null);
        aif aifVar = new aif(context);
        this.a = aifVar;
        RecyclerView recyclerView = new RecyclerView(context, null);
        recyclerView.setId(uab.f);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        int iD = kti.d(4 * vw4.d().getDisplayMetrics().density);
        kti.d(12 * vw4.d().getDisplayMetrics().density);
        recyclerView.j(new m01(iD, iD, 8));
        recyclerView.setHasFixedSize(true);
        this.b = recyclerView;
        setClipChildren(false);
        addView(aifVar);
        addView(recyclerView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        aif aifVar = this.a;
        m8j.e(aifVar, this, paddingStart, paddingTop, aifVar.getMeasuredWidth() + paddingStart, aifVar.getMeasuredHeight() + paddingTop);
        int bottom = aifVar.getBottom();
        int measuredWidth = getMeasuredWidth();
        int bottom2 = aifVar.getBottom();
        RecyclerView recyclerView = this.b;
        m8j.e(recyclerView, this, 0, bottom, measuredWidth, recyclerView.getMeasuredHeight() + bottom2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        aif aifVar = this.a;
        aifVar.measure(i, i2);
        RecyclerView recyclerView = this.b;
        recyclerView.measure(i, i2);
        setMeasuredDimension(size, recyclerView.getMeasuredHeight() + aifVar.getMeasuredHeight());
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.a.onThemeChanged(yebVar);
    }

    public final void setHeaderClickAction(cm6 cm6Var) {
        f8j.d(this.a.getHeaderButton(), 300L, new x6(16, cm6Var));
    }
}
