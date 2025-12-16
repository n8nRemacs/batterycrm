package com.avito.android.advert_details_items.campaigns.restyle;

import TV0.g;
import Y41.p;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert_details_items.campaigns.AdvertDetailsCampaignsItem;
import com.avito.android.advert_details_items.campaigns.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertDetailsCampaignsBlueprint.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_details_items/campaigns/restyle/a;", "LTV0/b;", "Lcom/avito/android/advert_details_items/campaigns/f;", "Lcom/avito/android/advert_details_items/campaigns/AdvertDetailsCampaignsItem;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements TV0.b<f, AdvertDetailsCampaignsItem> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.advert_details_items.campaigns.c f84521a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f84522b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g.a<c> f84523c = new g.a<>(R.layout.advert_details_campaigns_restyle, new C2505a());

    /* compiled from: AdvertDetailsCampaignsBlueprint.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/ViewGroup;", "<anonymous parameter 0>", "Landroid/view/View;", "view", "Lcom/avito/android/advert_details_items/campaigns/restyle/c;", "invoke", "(Landroid/view/ViewGroup;Landroid/view/View;)Lcom/avito/android/advert_details_items/campaigns/restyle/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.advert_details_items.campaigns.restyle.a$a, reason: collision with other inner class name */
    public static final class C2505a extends N implements p<ViewGroup, View, c> {
        public C2505a() {
            super(2);
        }

        @Override // Y41.p
        public final c invoke(ViewGroup viewGroup, View view) {
            return new c(view, a.this.f84522b);
        }
    }

    @Inject
    public a(@k com.avito.android.advert_details_items.campaigns.c cVar, @k com.avito.android.util.text.a aVar) {
        this.f84521a = cVar;
        this.f84522b = aVar;
    }

    @Override // TV0.b
    public final TV0.d a() {
        return this.f84521a;
    }

    @Override // TV0.b
    @k
    public final g.a<c> b() {
        return this.f84523c;
    }

    @Override // TV0.b
    @k
    /* renamed from: c */
    public final String getF175463a() {
        return "";
    }

    @Override // TV0.b
    public final boolean d(@k TV0.a aVar) {
        return (aVar instanceof AdvertDetailsCampaignsItem) && ((AdvertDetailsCampaignsItem) aVar).f84503e;
    }
}
