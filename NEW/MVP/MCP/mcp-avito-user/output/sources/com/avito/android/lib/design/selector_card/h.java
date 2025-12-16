package com.avito.android.lib.design.selector_card;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: SelectorCardDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/selector_card/h;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class h extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SelectorCardOrientation f180417b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180418c;

    /* renamed from: d, reason: collision with root package name */
    public final int f180419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f180420e;

    public h(@Y61.k SelectorCardOrientation selectorCardOrientation, int i12, int i13, int i14) {
        this.f180417b = selectorCardOrientation;
        this.f180418c = i12;
        this.f180419d = i13;
        this.f180420e = i14;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12;
        int i13;
        int i14;
        SelectorCardOrientation selectorCardOrientation = SelectorCardOrientation.f180361e;
        int i15 = this.f180418c;
        int i16 = 0;
        SelectorCardOrientation selectorCardOrientation2 = this.f180417b;
        if (selectorCardOrientation2 != selectorCardOrientation) {
            int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
            if (bindingAdapterPosition == 0) {
                i12 = i15;
                i15 = 0;
            } else {
                RecyclerView.Adapter adapter = recyclerView.getAdapter();
                i12 = bindingAdapterPosition == (adapter != null ? adapter.getItemCount() : 0) + (-1) ? 0 : i15;
            }
            if (selectorCardOrientation2 == SelectorCardOrientation.f180359c) {
                rect.set(i15, 0, i12, 0);
                return;
            } else {
                int i17 = this.f180420e;
                rect.set(i17, i15, i17, i12);
                return;
            }
        }
        int bindingAdapterPosition2 = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
        int i18 = this.f180419d;
        int i19 = bindingAdapterPosition2 % i18;
        if (i19 == 0) {
            i14 = i15;
            i13 = 0;
        } else if (i19 + 1 == i18) {
            i13 = i15;
            i14 = 0;
        } else {
            i13 = i15;
            i14 = i13;
        }
        if (bindingAdapterPosition2 < 0 || bindingAdapterPosition2 >= i18) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (((adapter2 != null ? adapter2.getItemCount() : 0) % i18) + bindingAdapterPosition2 <= (recyclerView.getAdapter() != null ? r8.getItemCount() : 0) - 1) {
                i16 = i15;
            }
        } else {
            i16 = i15;
            i15 = 0;
        }
        rect.set(i13, i15, i14, i16);
    }
}
