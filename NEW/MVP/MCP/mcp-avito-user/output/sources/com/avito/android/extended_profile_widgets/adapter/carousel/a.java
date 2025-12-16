package com.avito.android.extended_profile_widgets.adapter.carousel;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CarouselItemAlignmentDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/carousel/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f154288b;

    public a(@k Resources resources) {
        this.f154288b = resources.getDimensionPixelSize(R.dimen.extended_profile_carousel_advert_snippet_width);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        view.getLayoutParams().width = this.f154288b;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.text_content);
        if (linearLayout == null) {
            return;
        }
        linearLayout.setMinimumHeight(y6.b(137));
    }
}
