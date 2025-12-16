package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class q67 extends vhd {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public q67(ColorDrawable colorDrawable) {
        this.b = colorDrawable.mutate();
    }

    @Override // defpackage.vhd
    public void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        switch (this.a) {
            case 1:
                super.f(rect, view, recyclerView, iidVar);
                int iR = RecyclerView.R(view);
                r5j r5jVar = (r5j) this.b;
                Character chZ = r5jVar.z(iR);
                if (chZ != null) {
                    char cCharValue = chZ.charValue();
                    if (iR > 0) {
                        Character chZ2 = r5jVar.z(iR - 1);
                        if (chZ2 == null || cCharValue != chZ2.charValue()) {
                            rect.top = kti.d(16 * vw4.d().getDisplayMetrics().density);
                            break;
                        }
                    }
                }
                break;
            default:
                super.f(rect, view, recyclerView, iidVar);
                break;
        }
    }

    @Override // defpackage.vhd
    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                Drawable drawable = (Drawable) this.b;
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((xhd) childAt.getLayoutParams())).bottomMargin;
                    drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                    drawable.draw(canvas);
                }
                break;
        }
    }

    public q67(r5j r5jVar) {
        this.b = r5jVar;
    }
}
