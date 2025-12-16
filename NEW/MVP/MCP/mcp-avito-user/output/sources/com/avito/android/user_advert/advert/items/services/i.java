package com.avito.android.user_advert.advert.items.services;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.user_adverts_views_util.IconsView;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AppliedServicesItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/services/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/services/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f310228e = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final TextView f310229b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IconsView f310230c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f310231d;

    public i(@k View view) {
        super(view);
        this.f310229b = (TextView) view.findViewById(R.id.applied_services_description);
        this.f310230c = (IconsView) view.findViewById(R.id.icons_view);
        this.f310231d = view.findViewById(R.id.applied_services_view);
    }

    @Override // com.avito.android.user_advert.advert.items.services.h
    public final void BO(@k Map<String, ? extends com.avito.android.image_loader.k> map) {
        this.f310230c.setIcons(map);
    }

    @Override // com.avito.android.user_advert.advert.items.services.h
    public final void X(@l Y41.a<G0> aVar) {
        this.f310231d.setOnClickListener(new com.avito.android.user_advert.advert.items.service_booking.i(2, aVar));
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f310231d.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.services.h
    public final void jh(@k String str) {
        this.f310229b.setText(str);
    }
}
