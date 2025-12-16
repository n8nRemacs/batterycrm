package com.avito.android.lib.design.chips;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ChipsItemButtonViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/chips/u;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Button f178781b;

    public u(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.chip_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f178781b = (Button) viewFindViewById;
    }
}
