package kC0;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.tariff_cpt.common.item.button.h;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import kotlin.Metadata;

/* compiled from: TariffCptItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkC0/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kC0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC42569b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f406200b = y6.b(24);

    /* renamed from: c, reason: collision with root package name */
    public final int f406201c = y6.b(12);

    /* renamed from: d, reason: collision with root package name */
    public int f406202d;

    public int c(@k View view, @k RecyclerView recyclerView) {
        return 0;
    }

    public int e(@k View view, @k RecyclerView recyclerView) {
        return this.f406200b;
    }

    public int f(@k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int height;
        if (!(recyclerView.W(view) instanceof h)) {
            return 0;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            height = 0;
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemCount = adapter != null ? adapter.getItemCount() : 0;
            int childCount = recyclerView.getChildCount() - 1;
            int iK02 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                iK02 += layoutManager.k0(recyclerView.getChildAt(i12));
            }
            height = recyclerView.getHeight() - iK02;
            if (this.f406202d == 0) {
                this.f406202d = itemCount;
            }
        }
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        view.measure(ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), recyclerView.getPaddingRight() + recyclerView.getPaddingLeft() + (this.f406200b * 2), view.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view.getLayoutParams().height));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        int iV2 = D6.v(view);
        int i13 = this.f406201c;
        return height > iV2 + i13 ? height - iV2 : i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        rect.top = f(view, recyclerView, zVar);
        rect.bottom = c(view, recyclerView);
        rect.left = e(view, recyclerView);
        rect.right = e(view, recyclerView);
    }
}
