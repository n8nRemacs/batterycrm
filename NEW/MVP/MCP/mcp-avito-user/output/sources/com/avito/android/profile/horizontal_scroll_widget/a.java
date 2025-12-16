package com.avito.android.profile.horizontal_scroll_widget;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HorizontalItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/horizontal_scroll_widget/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_profile_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f222324b;

    /* renamed from: c, reason: collision with root package name */
    public final int f222325c;

    /* renamed from: d, reason: collision with root package name */
    public final int f222326d;

    public /* synthetic */ a(int i12, int i13, int i14, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, i14);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        int i12;
        int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        int i13 = this.f222326d;
        if (bindingAdapterPosition == 0) {
            i13 = this.f222324b;
            i12 = i13;
        } else {
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            i12 = bindingAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) + (-1) ? this.f222325c : i13;
        }
        rect.set(i13, 0, i12, 0);
    }

    public a(int i12, int i13, int i14) {
        this.f222324b = i12;
        this.f222325c = i13;
        this.f222326d = i14;
    }
}
