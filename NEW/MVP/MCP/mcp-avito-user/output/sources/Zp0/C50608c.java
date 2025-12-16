package zp0;

import Y61.k;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: NonLastDividerItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzp0/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zp0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50608c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Drawable f444259b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Rect f444260c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final int f444261d = y6.b(-4);

    public C50608c(@k Drawable drawable) {
        this.f444259b = drawable;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int bindingAdapterPosition = recyclerView.W(view).getBindingAdapterPosition();
        rect.set(0, 0, this.f444259b.getIntrinsicWidth(), 0);
        if (recyclerView.getAdapter() != null) {
            if (bindingAdapterPosition == 0) {
                rect.left = this.f444261d;
            } else if (bindingAdapterPosition == r4.getItemCount() - 1) {
                rect.set(0, 0, 0, 0);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        canvas.save();
        int lineHeight = recyclerView.getChildCount() > 0 ? ((TextView) recyclerView.getChildAt(0)).getLineHeight() : recyclerView.getHeight();
        int height = (recyclerView.getHeight() - lineHeight) / 2;
        if (recyclerView.getClipToPadding()) {
            int paddingTop = recyclerView.getPaddingTop() + height;
            int height2 = (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - height;
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height2);
            height = paddingTop;
            lineHeight = height2;
        }
        int childCount = recyclerView.getChildCount() - 1;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = recyclerView.getChildAt(i12);
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            Rect rect = this.f444260c;
            layoutManager.i0(childAt, rect);
            int iB2 = kotlin.math.b.b(childAt.getTranslationX()) + rect.right;
            Drawable drawable = this.f444259b;
            drawable.setBounds(iB2 - drawable.getIntrinsicWidth(), height, iB2, lineHeight);
            drawable.draw(canvas);
        }
        canvas.restore();
    }
}
