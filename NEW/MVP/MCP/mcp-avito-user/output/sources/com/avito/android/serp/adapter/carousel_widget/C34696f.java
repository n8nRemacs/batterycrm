package com.avito.android.serp.adapter.carousel_widget;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: CarouselItemsWidgetDecorator.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/carousel_widget/f;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.carousel_widget.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34696f extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f269352b;

    public C34696f(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f269352b = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        resources.getDimensionPixelSize(R.dimen.serp_vm_horizontal_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        if (recyclerView.W(view) instanceof InterfaceC34698h) {
            int i12 = this.f269352b;
            rect.left = -i12;
            rect.right = -i12;
        }
    }
}
