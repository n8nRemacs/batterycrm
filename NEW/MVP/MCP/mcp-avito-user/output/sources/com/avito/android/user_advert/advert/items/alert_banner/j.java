package com.avito.android.user_advert.advert.items.alert_banner;

import Y61.k;
import Y61.l;
import android.view.View;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import com.avito.android.lib.design.button.Button;
import j.InterfaceC42150f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: AlertBannerItemView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/alert_banner/j;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/alert_banner/i;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends com.avito.konveyor.adapter.b implements i {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f309196c = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AlertBanner f309197b;

    public j(@k View view) {
        super(view);
        this.f309197b = (AlertBanner) view.findViewById(R.id.alert_banner);
    }

    @Override // com.avito.android.user_advert.advert.items.alert_banner.i
    public final void S(@k Y41.a<G0> aVar) {
        this.f309197b.setOnClickListener(new com.avito.android.travel_guest_profile.items.profile_header.h(13, aVar));
    }

    @Override // com.avito.android.user_advert.advert.items.alert_banner.i
    public final void X4(@InterfaceC42150f int i12) {
        AlertBanner.h(this.f309197b, i12);
    }

    @Override // com.avito.android.user_advert.advert.items.alert_banner.i
    public final void Y0(@l String str, @k Y41.a<G0> aVar) {
        RU.a content = this.f309197b.getContent();
        com.avito.android.travel_guest_profile.items.profile_header.h hVar = new com.avito.android.travel_guest_profile.items.profile_header.h(12, aVar);
        content.f14455c = str;
        content.f14456d = hVar;
        Button button = content.f14464l;
        if (button != null) {
            com.avito.android.lib.design.button.b.a(button, str, false);
        }
        Button button2 = content.f14464l;
        if (button2 != null) {
            button2.setOnClickListener(hVar);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.alert_banner.i
    public final void b(@k String str) {
        this.f309197b.getContent().c(str);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        this.f309197b.setOnClickListener(null);
    }

    @Override // com.avito.android.user_advert.advert.items.alert_banner.i
    public final void x3(@l String str) {
        this.f309197b.getContent().a(str);
    }
}
