package com.avito.android.profile_settings_extended.adapter.gallery.image;

import Y41.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.images.entity.UploadImage;
import com.avito.android.profile_management_core.images.entity.UploadImageState;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.remote.model.Image;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ImageItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/gallery/image/e;", "Lcom/avito/android/profile_settings_extended/adapter/gallery/image/c;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l<yc0.k, G0> f229434b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_management_core.images.entity.d f229435c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public e(@Y61.k l<? super yc0.k, G0> lVar, @Y61.k com.avito.android.profile_management_core.images.entity.d dVar) {
        this.f229434b = lVar;
        this.f229435c = dVar;
    }

    public static void k(g gVar, UploadImage uploadImage, GalleryImageItem.ScaleType scaleType) {
        if (uploadImage instanceof UploadImage.ImageFromApi) {
            Image image = ((UploadImage.ImageFromApi) uploadImage).f226684j;
            UploadImage.ImageFromApi imageFromApi = (UploadImage.ImageFromApi) uploadImage;
            gVar.OV(image, imageFromApi.f226682h, imageFromApi.f226680f);
        } else if (uploadImage instanceof UploadImage.ImageFromPhotoPicker) {
            Uri uri = ((UploadImage.ImageFromPhotoPicker) uploadImage).f226689j;
            UploadImage.ImageFromPhotoPicker imageFromPhotoPicker = (UploadImage.ImageFromPhotoPicker) uploadImage;
            gVar.NY(uri, imageFromPhotoPicker.f226687h, imageFromPhotoPicker.f226685f);
        }
        gVar.iB(scaleType);
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        GalleryImageItem galleryImageItem = (GalleryImageItem) aVar;
        UploadImage uploadImage = galleryImageItem.f229421d;
        k(gVar, uploadImage, galleryImageItem.f229422e);
        UploadImageState f226677c = uploadImage.getF226677c();
        this.f229435c.getClass();
        com.avito.android.profile_management_core.images.entity.d.a(gVar, f226677c);
        gVar.xT(galleryImageItem.f229420c);
        gVar.p3(new d(this, galleryImageItem));
    }
}
