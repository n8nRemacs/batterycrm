package com.avito.android.ui;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41178c;
import kotlin.Metadata;

/* compiled from: GridItemDecoration.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/ui/b;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f304579b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304580c;

    public b(int i12, int i13) {
        this.f304579b = i12;
        this.f304580c = i13;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12 = this.f304580c;
        int i13 = this.f304579b;
        if (i13 == 1) {
            rect.set(i12, i12, i12, i12);
            return;
        }
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i14 = iU2 % i13;
        rect.left = (i14 * i12) / i13;
        rect.right = i12 - (((i14 + 1) * i12) / i13);
        if (iU2 >= i13) {
            rect.top = i12;
        } else {
            rect.top = 0;
        }
    }
}
