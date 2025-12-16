package com.avito.android.travel_guest_profile.items.extended_plan;

import Y61.k;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ExtendedPlanItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/extended_plan/h;", "Lcom/avito/konveyor/adapter/b;", "LTV0/e;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f302075b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f302076c;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f302077d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f302078e;

    public h(@k View view) {
        super(view);
        this.f302075b = (ImageView) view.findViewById(R.id.promo_image_iv);
        this.f302076c = (TextView) view.findViewById(R.id.title_tv);
        this.f302077d = (LinearLayout) view.findViewById(R.id.benefits_container);
        this.f302078e = (Button) view.findViewById(R.id.button);
    }
}
