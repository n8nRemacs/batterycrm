package com.avito.android.home;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import com.avito.android.visual_rubricator.InterfaceC36112c;
import com.avito.android.visual_rubricator.InterfaceC36120k;
import kotlin.Metadata;

/* compiled from: HomeItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/k;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f162418b;

    /* renamed from: c, reason: collision with root package name */
    public final int f162419c;

    /* renamed from: d, reason: collision with root package name */
    public final int f162420d;

    /* renamed from: e, reason: collision with root package name */
    public final int f162421e;

    /* renamed from: f, reason: collision with root package name */
    public final int f162422f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162423g;

    /* renamed from: h, reason: collision with root package name */
    public final int f162424h;

    /* renamed from: i, reason: collision with root package name */
    public final int f162425i;

    /* renamed from: j, reason: collision with root package name */
    public final int f162426j;

    /* renamed from: k, reason: collision with root package name */
    public final int f162427k;

    /* renamed from: l, reason: collision with root package name */
    public final int f162428l;

    /* renamed from: m, reason: collision with root package name */
    public final int f162429m;

    /* renamed from: n, reason: collision with root package name */
    public final int f162430n;

    /* renamed from: o, reason: collision with root package name */
    public final int f162431o;

    /* renamed from: p, reason: collision with root package name */
    public final int f162432p = y6.b(10);

    public k(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f162418b = aVar.Y(com.avito.android.serp.adapter.constructor.B.class);
        this.f162419c = resources.getDimensionPixelSize(R.dimen.serp_vertical_padding);
        this.f162420d = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f162421e = resources.getDimensionPixelSize(R.dimen.constructor_advert_horizontal_padding);
        this.f162422f = resources.getDimensionPixelSize(R.dimen.constructor_advert_bottom_offset);
        this.f162423g = resources.getDimensionPixelSize(R.dimen.constructor_advert_top_offset);
        this.f162424h = resources.getDimensionPixelOffset(R.dimen.serp_mini_menu_block_bottom_offset);
        this.f162425i = resources.getDimensionPixelSize(R.dimen.serp_margin_for_stories_with_wide_banner_up);
        this.f162426j = resources.getDimensionPixelSize(R.dimen.serp_stories_in_feed_top_margin);
        this.f162427k = resources.getDimensionPixelSize(R.dimen.serp_stories_in_feed_bottom_margin);
        this.f162428l = resources.getDimensionPixelSize(R.dimen.serp_double_rows_visual_rubricator_bottom_offset_mini_menu);
        this.f162429m = resources.getDimensionPixelSize(R.dimen.serp_section_tabs_top_offset);
        this.f162430n = resources.getDimensionPixelSize(R.dimen.serp_section_tabs_bottom_offset);
        this.f162431o = resources.getDimensionPixelSize(R.dimen.section_tags_top_offset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof com.avito.android.home.tabs_item.f;
        int i12 = this.f162419c;
        int i13 = this.f162420d;
        if (z12 || (cW2 instanceof com.avito.android.home.tabs_item.skeleton.f)) {
            rect.top = this.f162429m;
            int iU2 = RecyclerView.U(view);
            if (iU2 != -1) {
                int i14 = iU2 + 1;
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                if (adapter != null && adapter.getItemCount() > i14 && adapter.getItemViewType(iU2) != adapter.getItemViewType(i14)) {
                    rect.bottom = z12 ? this.f162430n : i12;
                }
            }
            int i15 = -i13;
            rect.left = i15;
            rect.right = i15;
        }
        if (cW2 instanceof com.avito.android.home.tags_item.j) {
            int i16 = -i13;
            rect.left = i16;
            rect.right = i16;
            rect.top = this.f162431o;
        }
        if (cW2 instanceof com.avito.android.stories.view.a) {
            com.avito.android.stories.view.a aVar = (com.avito.android.stories.view.a) cW2;
            int absoluteAdapterPosition = cW2.getAbsoluteAdapterPosition();
            if (absoluteAdapterPosition > 2) {
                i12 = this.f162426j;
            }
            int i17 = absoluteAdapterPosition > 2 ? this.f162427k : 0;
            int i18 = -i13;
            rect.left = i18;
            rect.right = i18;
            if (aVar.ng()) {
                i12 = this.f162425i;
            }
            rect.top = i12;
            rect.bottom = i17 + this.f162432p;
        }
        if (cW2 instanceof InterfaceC36120k) {
            int i19 = -i13;
            rect.left = i19;
            rect.right = i19;
        }
        if (cW2 instanceof InterfaceC36112c) {
            int i22 = -i13;
            rect.left = i22;
            rect.right = i22;
            rect.bottom = this.f162428l;
        }
        if (cW2 instanceof com.avito.android.serp.adapter.mini_menu.e) {
            int i23 = -i13;
            rect.left = i23;
            rect.right = i23;
            rect.bottom = this.f162424h;
        }
        if (cW2.getItemViewType() == this.f162418b) {
            int i24 = this.f162421e;
            rect.left = i24;
            rect.right = i24;
            rect.top = this.f162423g;
            rect.bottom = this.f162422f;
        }
        if (cW2 instanceof com.avito.android.brand_global_rubricator.m) {
            int i25 = -i13;
            rect.left = i25;
            rect.right = i25;
        }
    }
}
