package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExtendedProfileAdvBanner.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/ExtendedProfileAdvBanner;", "Lcom/avito/android/remote/model/ExtendedProfileElement;", "Lcom/avito/android/remote/model/SerpBannerContainer;", AdFormat.BANNER, "", "widgetName", "<init>", "(Lcom/avito/android/remote/model/SerpBannerContainer;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/SerpBannerContainer;", "component2", "()Ljava/lang/String;", "copy", "(Lcom/avito/android/remote/model/SerpBannerContainer;Ljava/lang/String;)Lcom/avito/android/remote/model/ExtendedProfileAdvBanner;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/SerpBannerContainer;", "getBanner", "Ljava/lang/String;", "getWidgetName", "_avito-discouraged_avito-api_extended-profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExtendedProfileAdvBanner implements ExtendedProfileElement {

    @k
    public static final Parcelable.Creator<ExtendedProfileAdvBanner> CREATOR = new Creator();

    @c(AdFormat.BANNER)
    @k
    private final SerpBannerContainer banner;

    @c("widgetName")
    @l
    private final String widgetName;

    /* compiled from: ExtendedProfileAdvBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExtendedProfileAdvBanner> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileAdvBanner createFromParcel(@k Parcel parcel) {
            return new ExtendedProfileAdvBanner((SerpBannerContainer) parcel.readParcelable(ExtendedProfileAdvBanner.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ExtendedProfileAdvBanner[] newArray(int i12) {
            return new ExtendedProfileAdvBanner[i12];
        }
    }

    public ExtendedProfileAdvBanner(@k SerpBannerContainer serpBannerContainer, @l String str) {
        this.banner = serpBannerContainer;
        this.widgetName = str;
    }

    public static /* synthetic */ ExtendedProfileAdvBanner copy$default(ExtendedProfileAdvBanner extendedProfileAdvBanner, SerpBannerContainer serpBannerContainer, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            serpBannerContainer = extendedProfileAdvBanner.banner;
        }
        if ((i12 & 2) != 0) {
            str = extendedProfileAdvBanner.widgetName;
        }
        return extendedProfileAdvBanner.copy(serpBannerContainer, str);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final SerpBannerContainer getBanner() {
        return this.banner;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getWidgetName() {
        return this.widgetName;
    }

    @k
    public final ExtendedProfileAdvBanner copy(@k SerpBannerContainer banner, @l String widgetName) {
        return new ExtendedProfileAdvBanner(banner, widgetName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExtendedProfileAdvBanner)) {
            return false;
        }
        ExtendedProfileAdvBanner extendedProfileAdvBanner = (ExtendedProfileAdvBanner) other;
        return L.f(this.banner, extendedProfileAdvBanner.banner) && L.f(this.widgetName, extendedProfileAdvBanner.widgetName);
    }

    @k
    public final SerpBannerContainer getBanner() {
        return this.banner;
    }

    @l
    public final String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int iHashCode = this.banner.hashCode() * 31;
        String str = this.widgetName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileAdvBanner(banner=");
        sb2.append(this.banner);
        sb2.append(", widgetName=");
        return C22026a.c(sb2, this.widgetName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.banner, flags);
        parcel.writeString(this.widgetName);
    }
}
