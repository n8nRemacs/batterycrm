package com.avito.android.beduin.common.component.select_option.dialog;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: OptionItemDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/dialog/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f102483b;

    public c() {
        this(0, 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        int iB2 = zVar.b() - 1;
        int i12 = this.f102483b;
        if (iU2 != iB2) {
            rect.top = i12;
        } else {
            rect.top = i12;
            rect.bottom = i12;
        }
    }

    public /* synthetic */ c(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }

    public c(int i12) {
        this.f102483b = i12;
    }
}
