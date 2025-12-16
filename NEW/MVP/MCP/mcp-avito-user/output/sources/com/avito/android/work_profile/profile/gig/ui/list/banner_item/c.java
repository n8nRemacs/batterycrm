package com.avito.android.work_profile.profile.gig.ui.list.banner_item;

import Y41.l;
import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.util.I5;
import com.avito.android.util.text.j;
import com.avito.android.verification.verification_input_inn.o;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GigBannerItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/gig/ui/list/banner_item/c;", "LTV0/d;", "Lcom/avito/android/work_profile/profile/gig/ui/list/banner_item/e;", "Lcom/avito/android/work_profile/profile/gig/ui/list/banner_item/GigBannerItem;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements TV0.d<e, GigBannerItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final l<DeepLink, G0> f331184b;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super DeepLink, G0> lVar) {
        this.f331184b = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        e eVar2 = (e) eVar;
        GigBannerItem gigBannerItem = (GigBannerItem) aVar;
        I5.a(eVar2.f331187b, gigBannerItem.f331175b, false);
        j.a(eVar2.f331188c, gigBannerItem.f331176c, null);
        Button button = eVar2.f331189d;
        com.avito.android.lib.design.button.b.a(button, gigBannerItem.f331177d, false);
        if (gigBannerItem.f331178e != null) {
            button.setOnClickListener(new o(10, this.f331184b, gigBannerItem));
        }
    }
}
