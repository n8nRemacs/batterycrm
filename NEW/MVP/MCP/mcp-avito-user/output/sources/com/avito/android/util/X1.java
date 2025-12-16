package com.avito.android.util;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HorizontalListItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/X1;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class X1 extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f318775b;

    /* renamed from: c, reason: collision with root package name */
    public final int f318776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f318777d;

    public X1() {
        this(0, 0, 0, 7, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int i12 = this.f318777d / 2;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = (adapter != null ? adapter.getItemCount() : 0) - 1;
        int i13 = this.f318776c;
        int i14 = this.f318775b;
        if (itemCount != 0) {
            int bindingAdapterPosition = ((RecyclerView.n) view.getLayoutParams()).f53858b.getBindingAdapterPosition();
            if (bindingAdapterPosition == 0) {
                i13 = i12;
                i12 = i14;
            } else if (bindingAdapterPosition != itemCount) {
                i13 = i12;
            }
        } else {
            i12 = i14;
        }
        rect.set(i12, 0, i13, 0);
    }

    public /* synthetic */ X1(int i12, int i13, int i14, int i15, C42822w c42822w) {
        this((i15 & 1) != 0 ? 0 : i12, (i15 & 2) != 0 ? 0 : i13, (i15 & 4) != 0 ? 0 : i14);
    }

    public X1(int i12, int i13, int i14) {
        this.f318775b = i12;
        this.f318776c = i13;
        this.f318777d = i14;
    }
}
