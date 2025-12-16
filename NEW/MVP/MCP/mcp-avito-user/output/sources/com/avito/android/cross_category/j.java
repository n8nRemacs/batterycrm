package com.avito.android.cross_category;

import android.app.Application;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CrossCategoryWidgetItemResourceProvider.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cross_category/j;", "Lcom/avito/android/cross_category/i;", "_avito_bx-content_widget_cross-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f131066a;

    /* renamed from: b, reason: collision with root package name */
    public final int f131067b;

    /* renamed from: c, reason: collision with root package name */
    public final int f131068c;

    /* renamed from: d, reason: collision with root package name */
    public final int f131069d;

    @Inject
    public j(@Y61.k Application application) {
        this.f131066a = application.getResources().getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f131067b = application.getResources().getDimensionPixelSize(R.dimen.serp_cross_item_card_padding);
        this.f131068c = application.getResources().getInteger(R.integer.serp_columns);
        this.f131069d = application.getResources().getInteger(R.integer.share_from_available_width);
    }

    @Override // com.avito.android.home.InterfaceC30768c
    /* renamed from: a, reason: from getter */
    public final int getF131068c() {
        return this.f131068c;
    }
}
