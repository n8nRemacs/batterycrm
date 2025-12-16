package com.avito.android.lib.design.time_line;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: TimeLineItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/time_line/p;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public int f181019b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Paint f181020c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Paint f181021d;

    /* renamed from: e, reason: collision with root package name */
    public final int f181022e;

    /* renamed from: f, reason: collision with root package name */
    public int f181023f;

    public p(@Y61.k Context context, int i12, int i13, int i14) {
        this.f181019b = i14;
        Paint paint = new Paint();
        paint.setColor(i12);
        this.f181020c = paint;
        Paint paint2 = new Paint();
        paint2.setColor(i13);
        this.f181021d = paint2;
        this.f181022e = context.getResources().getDimensionPixelOffset(R.dimen.time_line_icon_height);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int iB2 = zVar.b();
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        t.f181043a.getClass();
        if (iB2 <= 3 || bindingAdapterPosition <= 1 || bindingAdapterPosition == iB2 - 1) {
            rect.left = 0;
        } else {
            rect.left = (((recyclerView.getMeasuredWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd()) * 2) / 15;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDrawOver(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int iB2 = zVar.b();
        for (int i12 = 0; i12 < iB2; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            if (childAt != null) {
                int bindingAdapterPosition = ((RecyclerView.n) childAt.getLayoutParams()).f53858b.getBindingAdapterPosition();
                t tVar = t.f181043a;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                tVar.getClass();
                if (itemCount > 3 && bindingAdapterPosition > 1 && bindingAdapterPosition != itemCount - 1) {
                    int left = childAt.getLeft();
                    canvas.drawRect(left - ((((recyclerView.getMeasuredWidth() - recyclerView.getPaddingStart()) - recyclerView.getPaddingEnd()) * 2) / 15), (this.f181022e / 2) - (this.f181019b / 2), left, r9 + r8, bindingAdapterPosition <= this.f181023f ? this.f181020c : this.f181021d);
                }
            }
        }
    }
}
