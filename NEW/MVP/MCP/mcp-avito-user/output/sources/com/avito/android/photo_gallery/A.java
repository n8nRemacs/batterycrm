package com.avito.android.photo_gallery;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import android.app.Dialog;
import androidx.appcompat.app.l;
import com.avito.android.R;
import com.avito.android.advert_core.contactbar.InterfaceC28265d;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.item_map.view.U;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.progress_info_toast_bar.ProgressInfoToastBarData;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.L5;
import kotlin.Metadata;

/* compiled from: LegacyPhotoGalleryView.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/A;", "Lcom/avito/android/advert_core/advert/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class A implements com.avito.android.advert_core.advert.c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LegacyPhotoGalleryActivity f216465b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.dialog.a f216466c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35945t1<String> f216467d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f216468e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28265d f216469f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public Dialog f216470g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public androidx.appcompat.app.l f216471h;

    public A(@Y61.k LegacyPhotoGalleryActivity legacyPhotoGalleryActivity, @Y61.k com.avito.android.lib.deprecated_design.dialog.a aVar, @Y61.k InterfaceC35945t1 interfaceC35945t1, @Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k InterfaceC28265d interfaceC28265d) {
        this.f216465b = legacyPhotoGalleryActivity;
        this.f216466c = aVar;
        this.f216467d = interfaceC35945t1;
        this.f216468e = interfaceC35741a1;
        this.f216469f = interfaceC28265d;
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ja(@Y61.k PhoneLink phoneLink) {
        androidx.appcompat.app.l lVar = this.f216471h;
        if (lVar == null || !lVar.isShowing()) {
            androidx.appcompat.app.l lVarCreate = new l.a(new androidx.appcompat.view.d(this.f216465b, R.style.Theme_DesignSystem_Re23)).setTitle(R.string.advert_core_phone).setMessage(this.f216467d.a(phoneLink.getF133573b())).setPositiveButton(R.string.call, new U(1, this, phoneLink)).setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 25)).create();
            this.f216471h = lVarCreate;
            if (lVarCreate != null) {
                com.avito.android.lib.util.g.a(lVarCreate);
            }
            this.f216469f.qb();
        }
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ka(@Y61.k Throwable th2) {
        PrintableText printableTextA = InterfaceC35741a1.a.a(this.f216468e, th2, null, null, 6);
        LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = this.f216465b;
        L5.b(legacyPhotoGalleryActivity, printableTextA.k0(legacyPhotoGalleryActivity), 0);
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void la() {
        Dialog dialog = this.f216470g;
        if (dialog != null) {
            if (dialog != null) {
                dialog.dismiss();
            }
            this.f216470g = null;
        }
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void na() {
        LegacyPhotoGalleryActivity legacyPhotoGalleryActivity = this.f216465b;
        L5.b(legacyPhotoGalleryActivity, legacyPhotoGalleryActivity.getResources().getString(R.string.advert_core_advert_seller_notified_about_call), 0);
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void t2() {
        if (this.f216470g == null) {
            this.f216470g = this.f216466c.d();
        }
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ma() {
    }

    @Override // com.avito.android.advert_core.advert.c
    public final void ia(@Y61.k ProgressInfoToastBarData progressInfoToastBarData) {
    }
}
