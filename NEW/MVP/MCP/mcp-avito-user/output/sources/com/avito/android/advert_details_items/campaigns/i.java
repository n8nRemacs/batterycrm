package com.avito.android.advert_details_items.campaigns;

import android.view.View;
import com.avito.android.advert_details_items.campaigns.f;
import com.avito.android.remote.model.CampaignOptionCopy;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class i implements View.OnLongClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f84518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.b f84519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CampaignOptionCopy f84520d;

    public /* synthetic */ i(f.b bVar, CampaignOptionCopy campaignOptionCopy, int i12) {
        this.f84518b = i12;
        this.f84519c = bVar;
        this.f84520d = campaignOptionCopy;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f84518b) {
            case 0:
                this.f84519c.h0(this.f84520d);
                break;
            default:
                this.f84519c.h0(this.f84520d);
                break;
        }
        return true;
    }
}
