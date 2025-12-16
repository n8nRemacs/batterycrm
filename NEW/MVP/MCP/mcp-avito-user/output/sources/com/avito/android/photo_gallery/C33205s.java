package com.avito.android.photo_gallery;

import com.avito.android.advert_core.advert.b;
import com.avito.android.remote.model.advert_details.GalleryBuyButtonData;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LegacyPhotoGalleryActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.photo_gallery.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C33205s extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ LegacyPhotoGalleryActivity f217657l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ GalleryBuyButtonData f217658m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33205s(LegacyPhotoGalleryActivity legacyPhotoGalleryActivity, GalleryBuyButtonData galleryBuyButtonData) {
        super(0);
        this.f217657l = legacyPhotoGalleryActivity;
        this.f217658m = galleryBuyButtonData;
    }

    @Override // Y41.a
    public final G0 invoke() {
        z zVar = this.f217657l.f216558a0;
        if (zVar != null) {
            b.a.a(zVar, this.f217658m.getOnTapDeepLink(), null, 6);
        }
        return G0.f406611a;
    }
}
