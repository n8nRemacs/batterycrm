package com.avito.android.photo_gallery;

import android.app.Application;
import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.photo_gallery.PhotoGalleryIntentFactory;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBar;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.GalleryBuyButtonData;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.avito.android.util.C35755b0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: PhotoGalleryIntentFactoryImpl.kt */
@androidx.compose.runtime.internal.P
@s0
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/F;", "Lcom/avito/android/photo_gallery/PhotoGalleryIntentFactory;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class F implements PhotoGalleryIntentFactory {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f216480a;

    @Inject
    public F(@Y61.k Application application) {
        this.f216480a = application;
    }

    @Override // com.avito.android.photo_gallery.PhotoGalleryIntentFactory
    @Y61.k
    public final Intent a(@Y61.l List list, @Y61.l List list2, @Y61.l Map map, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.k List list3, int i12, @Y61.l String str, @Y61.l String str2, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l AdvertActions advertActions, @Y61.l ContactBarData contactBarData, @Y61.l GalleryBuyButtonData galleryBuyButtonData, @Y61.l Long l12, @Y61.l String str3, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l ArrayList arrayList, boolean z12, @Y61.l AddedByAvitoParams addedByAvitoParams, @Y61.l List list4, @Y61.l PhotoGalleryNavBar photoGalleryNavBar) {
        LegacyPhotoGalleryOpenParams legacyPhotoGalleryOpenParams = new LegacyPhotoGalleryOpenParams(list3, i12, list, list2, bool, bool2, video, nativeVideo, str, str2, treeClickStreamParent, advertActions, contactBarData, galleryBuyButtonData, l12, str3, autotekaTeaserResult, galleryTeaser, arrayList, z12, addedByAvitoParams, list4, photoGalleryNavBar, map);
        LegacyPhotoGalleryActivity.f216531m0.getClass();
        return new Intent(this.f216480a, (Class<?>) LegacyPhotoGalleryActivity.class).putExtra("open_params", legacyPhotoGalleryOpenParams);
    }

    @Override // com.avito.android.photo_gallery.PhotoGalleryIntentFactory
    @Y61.k
    public final Intent b(@Y61.k List list, int i12, boolean z12, @Y61.l PhotoGalleryIntentFactory.AnalyticsParameters analyticsParameters) {
        return new Intent(this.f216480a, (Class<?>) PhotoGalleryActivity.class).putParcelableArrayListExtra("images", C35755b0.a(list)).putExtra("image_position", i12).putExtra("video", (Parcelable) null).putExtra("is_download_available", z12).putExtra("analytics_params", analyticsParameters);
    }
}
