package com.avito.android.advert.item.autoteka.teaser_v3;

import android.net.Uri;
import android.view.View;
import com.avito.android.photo_gallery.autoteka_teaser.AutotekaTeaserGalleryInsightsListViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.AutotekaTeaserGallerySingleInsightViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.v2.AutotekaTeaserV2GalleryInsightListViewFullScreen;
import com.avito.android.remote.model.autotekateaser.StandaloneAutotekaLink;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f73136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StandaloneAutotekaLink f73137d;

    public /* synthetic */ i(Y41.l lVar, StandaloneAutotekaLink standaloneAutotekaLink, int i12) {
        this.f73135b = i12;
        this.f73136c = lVar;
        this.f73137d = standaloneAutotekaLink;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Y41.l lVar = this.f73136c;
        StandaloneAutotekaLink standaloneAutotekaLink = this.f73137d;
        switch (this.f73135b) {
            case 0:
                int i12 = j.f73138l;
                lVar.invoke(Uri.parse(standaloneAutotekaLink.getLink().getUrl()));
                break;
            case 1:
                int i13 = AutotekaTeaserGalleryInsightsListViewFullScreen.f216778j;
                lVar.invoke(Uri.parse(standaloneAutotekaLink.getLink().getUrl()));
                break;
            case 2:
                int i14 = AutotekaTeaserGallerySingleInsightViewFullScreen.f216796i;
                lVar.invoke(Uri.parse(standaloneAutotekaLink.getLink().getUrl()));
                break;
            default:
                int i15 = AutotekaTeaserV2GalleryInsightListViewFullScreen.f216830m;
                lVar.invoke(Uri.parse(standaloneAutotekaLink.getLink().getUrl()));
                break;
        }
    }
}
