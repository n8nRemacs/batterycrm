package Z00;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MortgageRootDividerItemDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ00/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Drawable f19758b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19759c;

    /* renamed from: d, reason: collision with root package name */
    public final int f19760d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Rect f19761e = new Rect();

    public c(@k Drawable drawable, int i12, int i13) {
        this.f19758b = drawable;
        this.f19759c = i12;
        this.f19760d = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int width;
        Rect rect = this.f19761e;
        Drawable drawable = this.f19758b;
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int iSave = canvas.save();
        try {
            boolean clipToPadding = recyclerView.getClipToPadding();
            int i12 = this.f19760d;
            if (clipToPadding) {
                int paddingLeft = recyclerView.getPaddingLeft() + i12;
                width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - i12;
                canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                i12 = paddingLeft;
            } else {
                width = recyclerView.getWidth() - i12;
            }
            int childCount = recyclerView.getChildCount() - 1;
            int i13 = 0;
            while (i13 < childCount) {
                View childAt = recyclerView.getChildAt(i13);
                i13++;
                View childAt2 = recyclerView.getChildAt(i13);
                RecyclerView.C cW2 = recyclerView.W(childAt);
                RecyclerView.C cW3 = recyclerView.W(childAt2);
                int itemViewType = cW2.getItemViewType();
                if (itemViewType == cW3.getItemViewType() && itemViewType == this.f19759c) {
                    RecyclerView.Y(childAt, rect);
                    int iB2 = rect.bottom + kotlin.math.b.b(childAt.getTranslationY());
                    drawable.setBounds(i12, iB2 - drawable.getIntrinsicHeight(), width, iB2);
                    drawable.draw(canvas);
                }
            }
            canvas.restoreToCount(iSave);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave);
            throw th2;
        }
    }
}
