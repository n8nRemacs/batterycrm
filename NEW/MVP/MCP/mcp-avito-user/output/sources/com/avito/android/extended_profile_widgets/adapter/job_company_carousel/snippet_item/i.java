package com.avito.android.extended_profile_widgets.adapter.job_company_carousel.snippet_item;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.util.C35835l0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: JobCompanyCarouselSnippetItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/job_company_carousel/snippet_item/i;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "LP81/a;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i extends com.avito.konveyor.adapter.b implements TV0.e, P81.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P81.b f154526b;

    public i(@k View view) {
        super(view);
        this.f154526b = new P81.b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = C35835l0.g(view.getContext()).x - (view.getResources().getDimensionPixelSize(R.dimen.extended_profile_widget_horizontal_margin) * 2);
        view.setLayoutParams(layoutParams);
    }
}
