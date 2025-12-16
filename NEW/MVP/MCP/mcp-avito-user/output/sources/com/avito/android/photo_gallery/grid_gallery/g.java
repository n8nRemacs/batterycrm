package com.avito.android.photo_gallery.grid_gallery;

import android.app.Application;
import android.content.Intent;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.photo_gallery.InterfaceC33199l;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBar;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.GalleryBuyButtonData;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.grid_gallery.GridGallery;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: GridGalleryIntentFactoryImpl.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/grid_gallery/g;", "Lcom/avito/android/photo_gallery/l;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements InterfaceC33199l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f217199a;

    @Inject
    public g(@Y61.k Application application) {
        this.f217199a = application;
    }

    @Override // com.avito.android.photo_gallery.InterfaceC33199l
    @Y61.k
    public final Intent a(int i12, @Y61.k TreeClickStreamParent treeClickStreamParent, @Y61.l PhotoGalleryNavBar photoGalleryNavBar, @Y61.l AddedByAvitoParams addedByAvitoParams, @Y61.l AdvertActions advertActions, @Y61.l NativeVideo nativeVideo, @Y61.l Video video, @Y61.l ContactBarData contactBarData, @Y61.l GalleryBuyButtonData galleryBuyButtonData, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.k GridGallery gridGallery, @Y61.l GalleryTeaser galleryTeaser, @Y61.l Boolean bool, @Y61.l Long l12, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l List list, @Y61.l List list2, @Y61.l List list3, @Y61.l List list4, @Y61.l List list5, boolean z12) {
        GridGalleryOpenParams gridGalleryOpenParams = new GridGalleryOpenParams(i12, treeClickStreamParent, photoGalleryNavBar, addedByAvitoParams, advertActions, nativeVideo, video, contactBarData, galleryBuyButtonData, autotekaTeaserResult, gridGallery, galleryTeaser, bool, l12, str, str2, str3, list3 == null ? C42784z0.f406748b : list3, list, list2, list4, list5, z12);
        GridGalleryActivity.f217085v.getClass();
        return new Intent(this.f217199a, (Class<?>) GridGalleryActivity.class).putExtra("open_params", gridGalleryOpenParams);
    }
}
