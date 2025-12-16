package com.avito.android.serp.adapter.advert_free_form_item;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertFreeFormItemDecoration.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/advert_free_form_item/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f268716b;

    @Inject
    public c(@Y61.k com.avito.konveyor.a aVar) {
        this.f268716b = aVar.Y(a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (this.f268716b == recyclerView.W(view).getItemViewType()) {
            rect.top = y6.b(12);
            rect.bottom = y6.b(12);
        }
    }
}
