package com.avito.android.travel_guest_profile.items.statistics_item;

import Y61.k;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: StatisticsItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/statistics_item/f;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    public final TextView f302141b;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f302142c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f302143d;

    public f(@k View view) {
        super(view);
        this.f302141b = (TextView) view.findViewById(R.id.title_tv);
        this.f302142c = (LinearLayout) view.findViewById(R.id.stripes_container);
        this.f302143d = (LinearLayout) view.findViewById(R.id.statistics_groups_container);
    }
}
