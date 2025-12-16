package com.avito.android.user_advert.advert.items.fill_parameters_banner;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: FillParametersBannerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/fill_parameters_banner/d;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/fill_parameters_banner/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends com.avito.konveyor.adapter.b implements c {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f309397e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f309398b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f309399c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Button f309400d;

    public d(@k View view) {
        super(view);
        this.f309398b = (TextView) view.findViewById(R.id.title);
        this.f309399c = (TextView) view.findViewById(R.id.subtitle);
        this.f309400d = (Button) view.findViewById(R.id.action);
    }

    @Override // com.avito.android.user_advert.advert.items.fill_parameters_banner.c
    public final void P(@l String str, @l Y41.a<G0> aVar) {
        Button button = this.f309400d;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(15, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.fill_parameters_banner.c
    public final void h(@l String str) {
        I5.a(this.f309399c, str, false);
    }

    @Override // com.avito.android.user_advert.advert.items.fill_parameters_banner.c
    public final void setTitle(@l String str) {
        I5.a(this.f309398b, str, false);
    }
}
