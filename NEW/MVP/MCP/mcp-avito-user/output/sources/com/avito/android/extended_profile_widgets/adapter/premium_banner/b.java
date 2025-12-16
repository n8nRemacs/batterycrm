package com.avito.android.extended_profile_widgets.adapter.premium_banner;

import KB.a;
import TV0.g;
import Y61.k;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PremiumBannerListItemBlueprint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/b;", "LTV0/b;", "Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/h;", "Lcom/avito/android/extended_profile_widgets/adapter/premium_banner/PremiumBannerListItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements TV0.b<h, PremiumBannerListItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f154589a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final KB.b f154590b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.a f154591c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final g.a<i> f154592d = new g.a<>(R.layout.extended_profile_premium_banner_list_item, new a(this));

    @Inject
    public b(@k d dVar, @a.b @k KB.b bVar, @a.b @k com.avito.konveyor.a aVar) {
        this.f154589a = dVar;
        this.f154590b = bVar;
        this.f154591c = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f154589a;
    }

    @Override // TV0.b
    @k
    public final g.a<i> b() {
        return this.f154592d;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return aVar instanceof PremiumBannerListItem;
    }
}
