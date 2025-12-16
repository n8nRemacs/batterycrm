package com.avito.android.photo_gallery;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.photo_gallery.nav_bar.PhotoGalleryNavBar;
import com.avito.android.remote.model.AddedByAvitoParams;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.NativeVideo;
import com.avito.android.remote.model.Video;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.advert_details.GalleryBuyButtonData;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.remote.model.model_card.GalleryTeaser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PhotoGalleryIntentFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/photo_gallery/PhotoGalleryIntentFactory;", "", "AnalyticsParameters", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface PhotoGalleryIntentFactory {

    /* compiled from: PhotoGalleryIntentFactory.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/photo_gallery/PhotoGalleryIntentFactory$AnalyticsParameters;", "Landroid/os/Parcelable;", "_avito_photo-gallery_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnalyticsParameters implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<AnalyticsParameters> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f216671b;

        /* compiled from: PhotoGalleryIntentFactory.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<AnalyticsParameters> {
            @Override // android.os.Parcelable.Creator
            public final AnalyticsParameters createFromParcel(Parcel parcel) {
                return new AnalyticsParameters(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AnalyticsParameters[] newArray(int i12) {
                return new AnalyticsParameters[i12];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnalyticsParameters() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f216671b);
        }

        public AnalyticsParameters(@Y61.l String str) {
            this.f216671b = str;
        }

        public /* synthetic */ AnalyticsParameters(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: PhotoGalleryIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    Intent a(@Y61.l List list, @Y61.l List list2, @Y61.l Map map, @Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l Video video, @Y61.l NativeVideo nativeVideo, @Y61.k List list3, int i12, @Y61.l String str, @Y61.l String str2, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.l AdvertActions advertActions, @Y61.l ContactBarData contactBarData, @Y61.l GalleryBuyButtonData galleryBuyButtonData, @Y61.l Long l12, @Y61.l String str3, @Y61.l AutotekaTeaserResult autotekaTeaserResult, @Y61.l GalleryTeaser galleryTeaser, @Y61.l ArrayList arrayList, boolean z12, @Y61.l AddedByAvitoParams addedByAvitoParams, @Y61.l List list4, @Y61.l PhotoGalleryNavBar photoGalleryNavBar);

    @Y61.k
    Intent b(@Y61.k List list, int i12, boolean z12, @Y61.l AnalyticsParameters analyticsParameters);
}
