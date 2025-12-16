package ib;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WeeksDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lib/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f398579b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Integer f398580c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Drawable f398581d;

    /* renamed from: e, reason: collision with root package name */
    public final int f398582e;

    /* renamed from: f, reason: collision with root package name */
    public final int f398583f;

    /* renamed from: g, reason: collision with root package name */
    public final int f398584g;

    public /* synthetic */ e(Context context, int i12, boolean z12, Integer num, int i13, C42822w c42822w) {
        this(context, i12, z12, (i13 & 8) != 0 ? null : num);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i12 = this.f398579b;
        if (iU2 == 0) {
            rect.right = i12;
        }
        if (RecyclerView.U(view) == zVar.b() - 1) {
            rect.left = i12;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@k Canvas canvas, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.onDraw(canvas, recyclerView, zVar);
        int bottom = recyclerView.getBottom();
        Integer num = this.f398580c;
        int iIntValue = bottom - (num != null ? num.intValue() : this.f398583f);
        int i12 = iIntValue - this.f398584g;
        int right = recyclerView.getChildAt(0).getRight();
        int i13 = this.f398582e;
        int i14 = right + i13;
        int i15 = this.f398579b;
        int i16 = i14 + i15;
        Drawable drawable = this.f398581d;
        if (drawable != null) {
            drawable.setBounds(i14, i12, i16, iIntValue);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
        int left = (recyclerView.getChildAt(recyclerView.getChildCount() - 1).getLeft() - i13) - i15;
        int i17 = i15 + left;
        if (drawable != null) {
            drawable.setBounds(left, i12, i17, iIntValue);
        }
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    public e(@k Context context, int i12, boolean z12, @l Integer num) {
        this.f398579b = i12;
        this.f398580c = num;
        this.f398581d = z12 ? context.getDrawable(R.drawable.bar_empty_unselected) : context.getDrawable(R.drawable.bar_empty);
        this.f398582e = context.getResources().getDimensionPixelSize(R.dimen.gap_between_bars_small);
        this.f398583f = context.getResources().getDimensionPixelSize(R.dimen.recycler_bottom_padding) + context.getResources().getDimensionPixelSize(R.dimen.bar_bottom_margin);
        this.f398584g = context.getResources().getDimensionPixelSize(R.dimen.empty_bar_height);
    }
}
