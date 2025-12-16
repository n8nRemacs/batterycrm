package com.avito.android.lib.design.chips;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: Chips.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/s;", "Landroidx/recyclerview/widget/RecyclerView$o;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class s implements RecyclerView.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Chips f178750b;

    public s(Chips chips) {
        this.f178750b = chips;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d(@Y61.k View view) {
        Drawable drawableRemove = this.f178750b.f178674J.remove(view);
        if (drawableRemove != null) {
            view.getOverlay().remove(drawableRemove);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j(@Y61.k View view) {
        Chips.v(this.f178750b, view);
    }
}
