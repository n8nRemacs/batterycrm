package com.avito.android.profile_settings_extended.entity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.gallery.image.GalleryImageItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SettingsListItemGroup.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup;", "Lcom/avito/android/profile_settings_extended/entity/v;", "AppendingType", "GalleryAppending", "PremiumBannerAppending", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GalleryWidgetItemsGroup implements v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f230281a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f230282b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f230283c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final AttributedText f230284d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f230285e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<GalleryImageItem> f230286f;

    /* renamed from: g, reason: collision with root package name */
    public final int f230287g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AppendingType f230288h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final GalleryImageItem.ScaleType f230289i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f230290j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final List<QH.a> f230291k;

    /* compiled from: SettingsListItemGroup.kt */
    @P
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup$AppendingType;", "Landroid/os/Parcelable;", "()V", "Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup$GalleryAppending;", "Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup$PremiumBannerAppending;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class AppendingType implements Parcelable {
        public /* synthetic */ AppendingType(C42822w c42822w) {
            this();
        }

        public AppendingType() {
        }
    }

    /* compiled from: SettingsListItemGroup.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup$GalleryAppending;", "Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup$AppendingType;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class GalleryAppending extends AppendingType {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final GalleryAppending f230292b = new GalleryAppending();

        @Y61.k
        public static final Parcelable.Creator<GalleryAppending> CREATOR = new a();

        /* compiled from: SettingsListItemGroup.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<GalleryAppending> {
            @Override // android.os.Parcelable.Creator
            public final GalleryAppending createFromParcel(Parcel parcel) {
                parcel.readInt();
                return GalleryAppending.f230292b;
            }

            @Override // android.os.Parcelable.Creator
            public final GalleryAppending[] newArray(int i12) {
                return new GalleryAppending[i12];
            }
        }

        public GalleryAppending() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: SettingsListItemGroup.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup$PremiumBannerAppending;", "Lcom/avito/android/profile_settings_extended/entity/GalleryWidgetItemsGroup$AppendingType;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class PremiumBannerAppending extends AppendingType {

        @Y61.k
        public static final Parcelable.Creator<PremiumBannerAppending> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final int f230293b;

        /* renamed from: c, reason: collision with root package name */
        public final int f230294c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f230295d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f230296e;

        /* compiled from: SettingsListItemGroup.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<PremiumBannerAppending> {
            @Override // android.os.Parcelable.Creator
            public final PremiumBannerAppending createFromParcel(Parcel parcel) {
                return new PremiumBannerAppending(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final PremiumBannerAppending[] newArray(int i12) {
                return new PremiumBannerAppending[i12];
            }
        }

        public PremiumBannerAppending(int i12, int i13, @Y61.k String str, @Y61.k String str2) {
            super(null);
            this.f230293b = i12;
            this.f230294c = i13;
            this.f230295d = str;
            this.f230296e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PremiumBannerAppending)) {
                return false;
            }
            PremiumBannerAppending premiumBannerAppending = (PremiumBannerAppending) obj;
            return this.f230293b == premiumBannerAppending.f230293b && this.f230294c == premiumBannerAppending.f230294c && L.f(this.f230295d, premiumBannerAppending.f230295d) && L.f(this.f230296e, premiumBannerAppending.f230296e);
        }

        public final int hashCode() {
            return this.f230296e.hashCode() + H.d(androidx.appcompat.app.r.e(this.f230294c, Integer.hashCode(this.f230293b) * 31, 31), 31, this.f230295d);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PremiumBannerAppending(imageWidth=");
            sb2.append(this.f230293b);
            sb2.append(", imageHeight=");
            sb2.append(this.f230294c);
            sb2.append(", imageModificationWarningTitle=");
            sb2.append(this.f230295d);
            sb2.append(", imageModificationWarningBody=");
            return C22026a.c(sb2, this.f230296e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f230293b);
            parcel.writeInt(this.f230294c);
            parcel.writeString(this.f230295d);
            parcel.writeString(this.f230296e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GalleryWidgetItemsGroup(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2, @Y61.k List<GalleryImageItem> list, int i12, @Y61.k AppendingType appendingType, @Y61.k GalleryImageItem.ScaleType scaleType, boolean z12, @Y61.k List<? extends QH.a> list2) {
        this.f230281a = str;
        this.f230282b = str2;
        this.f230283c = str3;
        this.f230284d = attributedText;
        this.f230285e = attributedText2;
        this.f230286f = list;
        this.f230287g = i12;
        this.f230288h = appendingType;
        this.f230289i = scaleType;
        this.f230290j = z12;
        this.f230291k = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static GalleryWidgetItemsGroup a(GalleryWidgetItemsGroup galleryWidgetItemsGroup, ArrayList arrayList, ArrayList arrayList2, int i12) {
        String str = galleryWidgetItemsGroup.f230281a;
        String str2 = galleryWidgetItemsGroup.f230282b;
        String str3 = galleryWidgetItemsGroup.f230283c;
        AttributedText attributedText = galleryWidgetItemsGroup.f230284d;
        AttributedText attributedText2 = galleryWidgetItemsGroup.f230285e;
        List list = arrayList;
        if ((i12 & 32) != 0) {
            list = galleryWidgetItemsGroup.f230286f;
        }
        List list2 = list;
        int i13 = galleryWidgetItemsGroup.f230287g;
        AppendingType appendingType = galleryWidgetItemsGroup.f230288h;
        GalleryImageItem.ScaleType scaleType = galleryWidgetItemsGroup.f230289i;
        boolean z12 = galleryWidgetItemsGroup.f230290j;
        List list3 = arrayList2;
        if ((i12 & 1024) != 0) {
            list3 = galleryWidgetItemsGroup.f230291k;
        }
        galleryWidgetItemsGroup.getClass();
        return new GalleryWidgetItemsGroup(str, str2, str3, attributedText, attributedText2, list2, i13, appendingType, scaleType, z12, list3);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryWidgetItemsGroup)) {
            return false;
        }
        GalleryWidgetItemsGroup galleryWidgetItemsGroup = (GalleryWidgetItemsGroup) obj;
        return L.f(this.f230281a, galleryWidgetItemsGroup.f230281a) && L.f(this.f230282b, galleryWidgetItemsGroup.f230282b) && L.f(this.f230283c, galleryWidgetItemsGroup.f230283c) && L.f(this.f230284d, galleryWidgetItemsGroup.f230284d) && L.f(this.f230285e, galleryWidgetItemsGroup.f230285e) && L.f(this.f230286f, galleryWidgetItemsGroup.f230286f) && this.f230287g == galleryWidgetItemsGroup.f230287g && L.f(this.f230288h, galleryWidgetItemsGroup.f230288h) && this.f230289i == galleryWidgetItemsGroup.f230289i && this.f230290j == galleryWidgetItemsGroup.f230290j && L.f(this.f230291k, galleryWidgetItemsGroup.f230291k);
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF230361a() {
        return this.f230281a;
    }

    @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.t
    @Y61.k
    public final List<QH.a> getItems() {
        return this.f230291k;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f230281a.hashCode() * 31, 31, this.f230282b), 31, this.f230283c);
        AttributedText attributedText = this.f230284d;
        int iHashCode = (iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        AttributedText attributedText2 = this.f230285e;
        return this.f230291k.hashCode() + androidx.appcompat.app.r.i((this.f230289i.hashCode() + ((this.f230288h.hashCode() + androidx.appcompat.app.r.e(this.f230287g, H.e((iHashCode + (attributedText2 != null ? attributedText2.hashCode() : 0)) * 31, 31, this.f230286f), 31)) * 31)) * 31, 31, this.f230290j);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryWidgetItemsGroup(widgetName=");
        sb2.append(this.f230281a);
        sb2.append(", name=");
        sb2.append(this.f230282b);
        sb2.append(", title=");
        sb2.append(this.f230283c);
        sb2.append(", emptySubtitle=");
        sb2.append(this.f230284d);
        sb2.append(", filledSubtitle=");
        sb2.append(this.f230285e);
        sb2.append(", imageItems=");
        sb2.append(this.f230286f);
        sb2.append(", maxPhotoCount=");
        sb2.append(this.f230287g);
        sb2.append(", appendingType=");
        sb2.append(this.f230288h);
        sb2.append(", imagesScaleType=");
        sb2.append(this.f230289i);
        sb2.append(", isActive=");
        sb2.append(this.f230290j);
        sb2.append(", items=");
        return H.p(sb2, this.f230291k, ')');
    }
}
