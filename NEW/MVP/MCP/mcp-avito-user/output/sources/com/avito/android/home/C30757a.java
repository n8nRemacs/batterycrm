package com.avito.android.home;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: AdvertGridRedesignItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.home.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30757a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public boolean f162196b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162197c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162198d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162199e;

    /* compiled from: AdvertGridRedesignItemDecorator.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/a$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.home.a$a, reason: collision with other inner class name */
    public interface InterfaceC4749a {
    }

    public C30757a(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f162197c = resources.getDimensionPixelSize(R.dimen.serp_redesign_grid_top_offset);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.serp_redesign_grid_spacing);
        this.f162198d = dimensionPixelSize - resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f162199e = dimensionPixelSize / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int iU2;
        if (this.f162196b) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
            if (gridLayoutManager == null || (iU2 = RecyclerView.U(view)) == -1) {
                return;
            }
            int i12 = gridLayoutManager.f53662H;
            if (gridLayoutManager.f53667M.f(iU2) > 1) {
                return;
            }
            int iE2 = gridLayoutManager.f53667M.e(iU2, i12);
            int i13 = this.f162198d;
            int i14 = this.f162199e;
            if (iE2 == 0) {
                rect.left = i13;
                rect.right = i14;
            } else if (iE2 == i12) {
                rect.left = i14;
                rect.right = i13;
            } else {
                rect.left = i14;
                rect.right = i14;
            }
            int i15 = (iU2 - iE2) - 1;
            if (i15 < 0 || gridLayoutManager.f53667M.f(i15) <= 1) {
                rect.top = this.f162197c;
            }
        }
    }
}
