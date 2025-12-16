package com.avito.android.shortcut_navigation_bar.adapter.tag;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: SectionTagShortcutItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/adapter/tag/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f283345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f283346c;

    /* renamed from: d, reason: collision with root package name */
    public final int f283347d;

    /* renamed from: e, reason: collision with root package name */
    public final int f283348e;

    /* renamed from: f, reason: collision with root package name */
    public final int f283349f;

    public b(@k Resources resources) {
        this.f283345b = resources.getDimensionPixelOffset(R.dimen.section_tag_shortcut_top_offset);
        this.f283346c = resources.getDimensionPixelOffset(R.dimen.section_tag_shortcut_bottom_offset);
        this.f283347d = resources.getDimensionPixelOffset(R.dimen.tag_shortcuts_horizontal_offset);
        this.f283348e = resources.getDimensionPixelOffset(R.dimen.tag_shortcuts_horizontal_offset);
        this.f283349f = resources.getDimensionPixelOffset(R.dimen.tag_shortcuts_edge_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        RecyclerView.C cW2 = recyclerView.W(view);
        if (adapter == null || !(cW2 instanceof c)) {
            return;
        }
        rect.top = this.f283345b;
        rect.bottom = this.f283346c;
        int i12 = this.f283349f;
        rect.left = iU2 == 0 ? i12 : this.f283347d;
        if (iU2 != adapter.getItemCount() - 1) {
            i12 = this.f283348e;
        }
        rect.right = i12;
    }
}
