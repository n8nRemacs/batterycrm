package com.avito.android.sx_address.list.view;

import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.sx_address.list.domain.InfoBannerButtonData;
import com.avito.android.sx_address.list.domain.InfoBannerData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f293413b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f293414c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InfoBannerData f293415d;

    public /* synthetic */ c(InfoBannerData infoBannerData, g gVar) {
        this.f293415d = infoBannerData;
        this.f293414c = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f293413b) {
            case 0:
                InfoBannerButtonData infoBannerButtonData = this.f293415d.f293155b;
                DeepLink deepLink = infoBannerButtonData != null ? infoBannerButtonData.f293154c : null;
                if (deepLink != null) {
                    this.f293414c.f293426F.K5(deepLink);
                    break;
                }
                break;
            default:
                this.f293414c.f293431K.K5(this.f293415d.f293159f);
                break;
        }
    }

    public /* synthetic */ c(g gVar, InfoBannerData infoBannerData) {
        this.f293414c = gVar;
        this.f293415d = infoBannerData;
    }
}
