package com.avito.android.photo_gallery.autoteka_teaser;

import android.view.View;
import com.avito.android.photo_gallery.autoteka_teaser.v2.AutotekaTeaserV2GalleryInsightListViewFullScreen;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f216808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f216809c;

    public /* synthetic */ c(b bVar, int i12) {
        this.f216808b = i12;
        this.f216809c = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.f216809c;
        switch (this.f216808b) {
            case 0:
                int i12 = AutotekaTeaserGalleryInsightsListView.f216772g;
                if (bVar != null) {
                    bVar.c();
                    break;
                }
                break;
            case 1:
                int i13 = AutotekaTeaserGallerySingleInsightView.f216790g;
                if (bVar != null) {
                    bVar.c();
                    break;
                }
                break;
            default:
                int i14 = AutotekaTeaserV2GalleryInsightListViewFullScreen.f216830m;
                if (bVar != null) {
                    bVar.a();
                    break;
                }
                break;
        }
    }
}
