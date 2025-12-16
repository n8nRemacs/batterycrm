package com.avito.android.rating_ui.aspects.view;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.rating_ui.aspects.view.button.RatingAspectsButton;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RatingAspectsButtonViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_ui/aspects/view/b;", "Landroidx/recyclerview/widget/RecyclerView$C;", "_avito_rating-ui_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b extends RecyclerView.C {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final RatingAspectsButton f249905b;

    public b(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.rating_aspects_button);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.rating_ui.aspects.view.button.RatingAspectsButton");
        }
        this.f249905b = (RatingAspectsButton) viewFindViewById;
    }
}
