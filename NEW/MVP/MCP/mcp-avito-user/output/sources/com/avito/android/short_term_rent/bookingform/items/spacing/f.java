package com.avito.android.short_term_rent.bookingform.items.spacing;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.y6;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SpacingView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/spacing/f;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/short_term_rent/bookingform/items/spacing/e;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f extends com.avito.konveyor.adapter.b implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f281669b;

    public f(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.spacing);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f281669b = viewFindViewById;
    }

    @Override // com.avito.android.short_term_rent.bookingform.items.spacing.e
    public final void N(int i12) {
        int iB2 = y6.b(i12);
        View view = this.f281669b;
        if (view.getHeight() == iB2) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = iB2;
        view.setLayoutParams(layoutParams);
    }
}
