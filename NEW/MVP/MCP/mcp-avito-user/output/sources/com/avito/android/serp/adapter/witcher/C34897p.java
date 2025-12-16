package com.avito.android.serp.adapter.witcher;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: WitcherItemDecorator.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/witcher/p;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.witcher.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34897p extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f273892b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f273893c;

    public C34897p(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f273892b = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
        this.f273893c = resources.getBoolean(R.bool.is_tablet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        Object objW = recyclerView.W(view);
        if (objW instanceof D) {
            boolean zT70 = ((D) objW).T70();
            int i12 = this.f273892b;
            if (zT70 && this.f273893c) {
                int i13 = i12 * (-1);
                rect.left = i13;
                rect.right = i13;
            } else {
                int i14 = i12 * (-2);
                rect.left = i14;
                rect.right = i14;
            }
        }
    }
}
