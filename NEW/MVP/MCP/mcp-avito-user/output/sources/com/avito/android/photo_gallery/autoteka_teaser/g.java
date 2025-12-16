package com.avito.android.photo_gallery.autoteka_teaser;

import android.view.View;
import com.avito.android.autoteka.model.AutotekaChoosingPurchaseButtonParams;
import com.avito.android.photo_gallery.autoteka_teaser.v2.AutotekaTeaserV2GalleryInsightListViewFullScreen;
import com.avito.android.photo_gallery.autoteka_teaser.v3.AutotekaTeaserV3GalleryViewFullScreen;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f216813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f216814c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AutotekaChoosingPurchaseButtonParams f216815d;

    public /* synthetic */ g(b bVar, AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams, int i12) {
        this.f216813b = i12;
        this.f216814c = bVar;
        this.f216815d = autotekaChoosingPurchaseButtonParams;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams = this.f216815d;
        b bVar = this.f216814c;
        switch (this.f216813b) {
            case 0:
                int i12 = AutotekaTeaserGalleryInsightsListViewFullScreen.f216778j;
                if (bVar != null) {
                    bVar.e(autotekaChoosingPurchaseButtonParams.f97068b);
                    break;
                }
                break;
            case 1:
                int i13 = AutotekaTeaserGallerySingleInsightViewFullScreen.f216796i;
                if (bVar != null) {
                    bVar.e(autotekaChoosingPurchaseButtonParams.f97068b);
                    break;
                }
                break;
            case 2:
                int i14 = AutotekaTeaserV2GalleryInsightListViewFullScreen.f216830m;
                if (bVar != null) {
                    bVar.e(autotekaChoosingPurchaseButtonParams.f97068b);
                    break;
                }
                break;
            default:
                int i15 = AutotekaTeaserV3GalleryViewFullScreen.f216857h;
                if (bVar != null) {
                    bVar.e(autotekaChoosingPurchaseButtonParams.f97068b);
                    break;
                }
                break;
        }
    }
}
