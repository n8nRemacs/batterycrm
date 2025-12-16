package com.avito.android.photo_gallery;

import Zd.InterfaceC19542a;
import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.job.cv_packages.links.CvPackagesLink;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.DealConfirmationSheet;
import com.avito.android.ui.SafeViewPager;
import com.avito.android.util.InterfaceC35845m2;
import kotlin.Metadata;

/* compiled from: LegacyPhotoGalleryRouter.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/z;", "Lcom/avito/android/advert_core/advert/b;", "Lcom/avito/android/deal_confirmation/k;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class z implements com.avito.android.advert_core.advert.b, com.avito.android.deal_confirmation.k {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f217730b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LegacyPhotoGalleryActivity f217731c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f217732d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC19542a f217733e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deal_confirmation.sheet.j f217734f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35845m2 f217735g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.a f217736h;

    public z(@Y61.k String str, @Y61.k LegacyPhotoGalleryActivity legacyPhotoGalleryActivity, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k InterfaceC19542a interfaceC19542a, @Y61.k com.avito.android.deal_confirmation.sheet.j jVar, @Y61.k InterfaceC35845m2 interfaceC35845m2, @Y61.k com.avito.android.autoteka.data.a aVar2) {
        this.f217730b = str;
        this.f217731c = legacyPhotoGalleryActivity;
        this.f217732d = aVar;
        this.f217733e = interfaceC19542a;
        this.f217734f = jVar;
        this.f217735g = interfaceC35845m2;
        this.f217736h = aVar2;
        Bundle bundle = new Bundle();
        bundle.putString("key_advert_id", str);
        aVar.Qb(bundle);
    }

    @Override // com.avito.android.advert_core.advert.b
    public final void g(@Y61.l Bundle bundle, @Y61.k DeepLink deepLink, @Y61.l String str) {
        this.f217732d.r6(bundle, deepLink, str);
    }

    @Override // com.avito.android.deal_confirmation.k
    public final void j(@Y61.k String str) {
        SafeViewPager safeViewPager = this.f217731c.f216570m;
        if (safeViewPager == null) {
            safeViewPager = null;
        }
        com.avito.android.component.toast.b.b(safeViewPager, str, 0, null, 0, null, 0, ToastBarPosition.f181047e, f.a.f125253a, null, 130878);
    }

    @Override // com.avito.android.deal_confirmation.k
    public final void l(@Y61.k DealConfirmationSheet dealConfirmationSheet) {
        this.f217731c.startActivityForResult(this.f217734f.a(dealConfirmationSheet), 3);
    }

    @Override // com.avito.android.advert_core.advert.a
    public final void m(@Y61.l Parcelable parcelable, @Y61.l String str) {
        this.f217731c.startActivityForResult(this.f217733e.b(parcelable, str), 1);
    }

    @Override // com.avito.android.advert_core.advert.b
    public final void r(@Y61.k CvPackagesLink cvPackagesLink) {
        b.a.a(this.f217732d, cvPackagesLink, null, null, 6);
    }
}
