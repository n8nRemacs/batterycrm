package com.avito.android.travel_guest_profile.items.empty_state_banner;

import Y61.k;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EmptyStateBannerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_guest_profile/items/empty_state_banner/h;", "LTV0/e;", "Lcom/avito/konveyor/adapter/b;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends com.avito.konveyor.adapter.b implements TV0.e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f302058b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Banner f302059c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f302060d;

    /* renamed from: e, reason: collision with root package name */
    public final Button f302061e;

    public h(@k View view, @k com.avito.android.util.text.a aVar) {
        super(view);
        this.f302058b = aVar;
        this.f302059c = (Banner) view;
        this.f302060d = (TextView) view.findViewById(R.id.subtitle_tv);
        this.f302061e = (Button) view.findViewById(R.id.action_button);
    }
}
