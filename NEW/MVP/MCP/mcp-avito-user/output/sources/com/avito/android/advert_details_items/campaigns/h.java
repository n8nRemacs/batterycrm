package com.avito.android.advert_details_items.campaigns;

import android.view.View;
import com.avito.android.advert_details_items.campaigns.f;
import com.avito.android.remote.model.CampaignOption;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class h implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84515b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.b f84516c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CampaignOption f84517d;

    public /* synthetic */ h(f.b bVar, CampaignOption campaignOption, int i12) {
        this.f84515b = i12;
        this.f84516c = bVar;
        this.f84517d = campaignOption;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f84515b) {
            case 0:
                this.f84516c.Z(this.f84517d.getDeepLink());
                break;
            default:
                this.f84516c.Z(this.f84517d.getDeepLink());
                break;
        }
    }
}
