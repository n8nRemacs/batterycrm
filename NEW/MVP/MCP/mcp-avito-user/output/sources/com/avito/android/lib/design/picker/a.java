package com.avito.android.lib.design.picker;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: MarginDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/picker/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f179992b;

    public a() {
        this(0, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int i12 = this.f179992b;
        if (iU2 == 0) {
            rect.top = i12 * 2;
        }
        rect.left = 0;
        rect.right = 0;
        rect.bottom = i12;
    }

    public a(int i12, int i13, C42822w c42822w) {
        this.f179992b = (i13 & 1) != 0 ? y6.b(8) : i12;
    }
}
