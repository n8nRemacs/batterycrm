package com.avito.android.remote.model.advert_details;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GalleryBuyButtonData.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b'\u0010\r¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/advert_details/GalleryBuyButtonData;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", "onTapDeepLink", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, BeduinPromoBlockModel.SERIALIZED_NAME_THEME, "title", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/advert_details/GalleryBuyButtonData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnTapDeepLink", "Ljava/lang/String;", "getStyle", "getTheme", "getTitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GalleryBuyButtonData implements Parcelable {

    @k
    public static final Parcelable.Creator<GalleryBuyButtonData> CREATOR = new Creator();

    @c("onTapDeepLink")
    @k
    private final DeepLink onTapDeepLink;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @k
    private final String style;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_THEME)
    @k
    private final String theme;

    @c("title")
    @k
    private final String title;

    /* compiled from: GalleryBuyButtonData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<GalleryBuyButtonData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryBuyButtonData createFromParcel(@k Parcel parcel) {
            return new GalleryBuyButtonData((DeepLink) parcel.readParcelable(GalleryBuyButtonData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final GalleryBuyButtonData[] newArray(int i12) {
            return new GalleryBuyButtonData[i12];
        }
    }

    public GalleryBuyButtonData(@k DeepLink deepLink, @k String str, @k String str2, @k String str3) {
        this.onTapDeepLink = deepLink;
        this.style = str;
        this.theme = str2;
        this.title = str3;
    }

    public static /* synthetic */ GalleryBuyButtonData copy$default(GalleryBuyButtonData galleryBuyButtonData, DeepLink deepLink, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            deepLink = galleryBuyButtonData.onTapDeepLink;
        }
        if ((i12 & 2) != 0) {
            str = galleryBuyButtonData.style;
        }
        if ((i12 & 4) != 0) {
            str2 = galleryBuyButtonData.theme;
        }
        if ((i12 & 8) != 0) {
            str3 = galleryBuyButtonData.title;
        }
        return galleryBuyButtonData.copy(deepLink, str, str2, str3);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    public final GalleryBuyButtonData copy(@k DeepLink onTapDeepLink, @k String style, @k String theme, @k String title) {
        return new GalleryBuyButtonData(onTapDeepLink, style, theme, title);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GalleryBuyButtonData)) {
            return false;
        }
        GalleryBuyButtonData galleryBuyButtonData = (GalleryBuyButtonData) other;
        return L.f(this.onTapDeepLink, galleryBuyButtonData.onTapDeepLink) && L.f(this.style, galleryBuyButtonData.style) && L.f(this.theme, galleryBuyButtonData.theme) && L.f(this.title, galleryBuyButtonData.title);
    }

    @k
    public final DeepLink getOnTapDeepLink() {
        return this.onTapDeepLink;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    @k
    public final String getTheme() {
        return this.theme;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + H.d(H.d(this.onTapDeepLink.hashCode() * 31, 31, this.style), 31, this.theme);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryBuyButtonData(onTapDeepLink=");
        sb2.append(this.onTapDeepLink);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", theme=");
        sb2.append(this.theme);
        sb2.append(", title=");
        return C22026a.c(sb2, this.title, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.onTapDeepLink, flags);
        parcel.writeString(this.style);
        parcel.writeString(this.theme);
        parcel.writeString(this.title);
    }
}
