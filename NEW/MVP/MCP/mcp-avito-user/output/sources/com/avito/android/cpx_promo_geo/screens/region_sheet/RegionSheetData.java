package com.avito.android.cpx_promo_geo.screens.region_sheet;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RegionSheetData.kt */
@d
@P
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData;", "Landroid/os/Parcelable;", "", "rootLocationTitle", "", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Location;", "locations", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors;", "errors", ChannelContext.Item.PLACEHOLDER, "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Button;", "button", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors;Ljava/lang/String;Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Button;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors;", "d", "()Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors;", "getPlaceholder", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Button;", "c", "()Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Button;", "Button", "Errors", "Location", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class RegionSheetData implements Parcelable {

    @k
    public static final Parcelable.Creator<RegionSheetData> CREATOR = new a();

    @c("button")
    @k
    private final Button button;

    @c("errors")
    @k
    private final Errors errors;

    @c("locations")
    @k
    private final List<Location> locations;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("rootLocationTitle")
    @l
    private final String rootLocationTitle;

    /* compiled from: RegionSheetData.kt */
    @P
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Button;", "Landroid/os/Parcelable;", "", "title", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Button implements Parcelable {

        @k
        public static final Parcelable.Creator<Button> CREATOR = new a();

        @c("title")
        @k
        private final String title;

        /* compiled from: RegionSheetData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Button> {
            @Override // android.os.Parcelable.Creator
            public final Button createFromParcel(Parcel parcel) {
                return new Button(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Button[] newArray(int i12) {
                return new Button[i12];
            }
        }

        public Button(@k String str) {
            this.title = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Button) && L.f(this.title, ((Button) obj).title);
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.title.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Button(title="), this.title, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.title);
        }
    }

    /* compiled from: RegionSheetData.kt */
    @P
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0018\u0019\u001a\u001bB)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors;", "Landroid/os/Parcelable;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$MaxRegions;", "maxRegions", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SubLoad;", "subLoad", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchError;", "searchError", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchNotFound;", "searchNotFound", "<init>", "(Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$MaxRegions;Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SubLoad;Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchError;Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchNotFound;)V", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$MaxRegions;", "c", "()Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$MaxRegions;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SubLoad;", "f", "()Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SubLoad;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchError;", "d", "()Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchError;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchNotFound;", "e", "()Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchNotFound;", "MaxRegions", "SearchError", "SearchNotFound", "SubLoad", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Errors implements Parcelable {

        @k
        public static final Parcelable.Creator<Errors> CREATOR = new a();

        @c("maxRegions")
        @l
        private final MaxRegions maxRegions;

        @c("searchError")
        @k
        private final SearchError searchError;

        @c("searchNotFound")
        @k
        private final SearchNotFound searchNotFound;

        @c("subLoad")
        @k
        private final SubLoad subLoad;

        /* compiled from: RegionSheetData.kt */
        @P
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$MaxRegions;", "Landroid/os/Parcelable;", "", "subLocationsText", "globalText", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "I", "e", "()I", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class MaxRegions implements Parcelable {

            @k
            public static final Parcelable.Creator<MaxRegions> CREATOR = new a();

            @c("globalText")
            @k
            private final String globalText;

            @c("subLocationsText")
            @k
            private final String subLocationsText;

            @c("value")
            private final int value;

            /* compiled from: RegionSheetData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<MaxRegions> {
                @Override // android.os.Parcelable.Creator
                public final MaxRegions createFromParcel(Parcel parcel) {
                    return new MaxRegions(parcel.readString(), parcel.readString(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final MaxRegions[] newArray(int i12) {
                    return new MaxRegions[i12];
                }
            }

            public MaxRegions(@k String str, @k String str2, int i12) {
                this.subLocationsText = str;
                this.globalText = str2;
                this.value = i12;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final String getGlobalText() {
                return this.globalText;
            }

            @k
            /* renamed from: d, reason: from getter */
            public final String getSubLocationsText() {
                return this.subLocationsText;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            /* renamed from: e, reason: from getter */
            public final int getValue() {
                return this.value;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MaxRegions)) {
                    return false;
                }
                MaxRegions maxRegions = (MaxRegions) obj;
                return L.f(this.subLocationsText, maxRegions.subLocationsText) && L.f(this.globalText, maxRegions.globalText) && this.value == maxRegions.value;
            }

            public final int hashCode() {
                return Integer.hashCode(this.value) + H.d(this.subLocationsText.hashCode() * 31, 31, this.globalText);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MaxRegions(subLocationsText=");
                sb2.append(this.subLocationsText);
                sb2.append(", globalText=");
                sb2.append(this.globalText);
                sb2.append(", value=");
                return r.t(sb2, this.value, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.subLocationsText);
                parcel.writeString(this.globalText);
                parcel.writeInt(this.value);
            }
        }

        /* compiled from: RegionSheetData.kt */
        @P
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchError;", "Landroid/os/Parcelable;", "", "title", "description", "refreshButtonTitle", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "c", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SearchError implements Parcelable {

            @k
            public static final Parcelable.Creator<SearchError> CREATOR = new a();

            @c("description")
            @k
            private final String description;

            @c("image")
            @k
            private final UniversalImage image;

            @c("refreshButtonTitle")
            @k
            private final String refreshButtonTitle;

            @c("title")
            @k
            private final String title;

            /* compiled from: RegionSheetData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SearchError> {
                @Override // android.os.Parcelable.Creator
                public final SearchError createFromParcel(Parcel parcel) {
                    return new SearchError(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(SearchError.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SearchError[] newArray(int i12) {
                    return new SearchError[i12];
                }
            }

            public SearchError(@k String str, @k String str2, @k String str3, @k UniversalImage universalImage) {
                this.title = str;
                this.description = str2;
                this.refreshButtonTitle = str3;
                this.image = universalImage;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final String getRefreshButtonTitle() {
                return this.refreshButtonTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchError)) {
                    return false;
                }
                SearchError searchError = (SearchError) obj;
                return L.f(this.title, searchError.title) && L.f(this.description, searchError.description) && L.f(this.refreshButtonTitle, searchError.refreshButtonTitle) && L.f(this.image, searchError.image);
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final UniversalImage getImage() {
                return this.image;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.image.hashCode() + H.d(H.d(this.title.hashCode() * 31, 31, this.description), 31, this.refreshButtonTitle);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SearchError(title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", refreshButtonTitle=");
                sb2.append(this.refreshButtonTitle);
                sb2.append(", image=");
                return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeString(this.refreshButtonTitle);
                parcel.writeParcelable(this.image, i12);
            }
        }

        /* compiled from: RegionSheetData.kt */
        @P
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SearchNotFound;", "Landroid/os/Parcelable;", "", "title", "description", "Lcom/avito/android/remote/model/UniversalImage;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SearchNotFound implements Parcelable {

            @k
            public static final Parcelable.Creator<SearchNotFound> CREATOR = new a();

            @c("description")
            @k
            private final String description;

            @c("image")
            @k
            private final UniversalImage image;

            @c("title")
            @k
            private final String title;

            /* compiled from: RegionSheetData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SearchNotFound> {
                @Override // android.os.Parcelable.Creator
                public final SearchNotFound createFromParcel(Parcel parcel) {
                    return new SearchNotFound(parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(SearchNotFound.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final SearchNotFound[] newArray(int i12) {
                    return new SearchNotFound[i12];
                }
            }

            public SearchNotFound(@k String str, @k String str2, @k UniversalImage universalImage) {
                this.title = str;
                this.description = str2;
                this.image = universalImage;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SearchNotFound)) {
                    return false;
                }
                SearchNotFound searchNotFound = (SearchNotFound) obj;
                return L.f(this.title, searchNotFound.title) && L.f(this.description, searchNotFound.description) && L.f(this.image, searchNotFound.image);
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final UniversalImage getImage() {
                return this.image;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.image.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SearchNotFound(title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", image=");
                return com.avito.android.advert.item.delivery_suggests.l.s(sb2, this.image, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeParcelable(this.image, i12);
            }
        }

        /* compiled from: RegionSheetData.kt */
        @P
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Errors$SubLoad;", "Landroid/os/Parcelable;", "", "title", "description", "refreshButtonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getDescription", "c", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final /* data */ class SubLoad implements Parcelable {

            @k
            public static final Parcelable.Creator<SubLoad> CREATOR = new a();

            @c("description")
            @k
            private final String description;

            @c("refreshButtonTitle")
            @k
            private final String refreshButtonTitle;

            @c("title")
            @k
            private final String title;

            /* compiled from: RegionSheetData.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<SubLoad> {
                @Override // android.os.Parcelable.Creator
                public final SubLoad createFromParcel(Parcel parcel) {
                    return new SubLoad(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final SubLoad[] newArray(int i12) {
                    return new SubLoad[i12];
                }
            }

            public SubLoad(@k String str, @k String str2, @k String str3) {
                this.title = str;
                this.description = str2;
                this.refreshButtonTitle = str3;
            }

            @k
            /* renamed from: c, reason: from getter */
            public final String getRefreshButtonTitle() {
                return this.refreshButtonTitle;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SubLoad)) {
                    return false;
                }
                SubLoad subLoad = (SubLoad) obj;
                return L.f(this.title, subLoad.title) && L.f(this.description, subLoad.description) && L.f(this.refreshButtonTitle, subLoad.refreshButtonTitle);
            }

            @k
            public final String getDescription() {
                return this.description;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            public final int hashCode() {
                return this.refreshButtonTitle.hashCode() + H.d(this.title.hashCode() * 31, 31, this.description);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SubLoad(title=");
                sb2.append(this.title);
                sb2.append(", description=");
                sb2.append(this.description);
                sb2.append(", refreshButtonTitle=");
                return C22026a.c(sb2, this.refreshButtonTitle, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.title);
                parcel.writeString(this.description);
                parcel.writeString(this.refreshButtonTitle);
            }
        }

        /* compiled from: RegionSheetData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Errors> {
            @Override // android.os.Parcelable.Creator
            public final Errors createFromParcel(Parcel parcel) {
                return new Errors(parcel.readInt() == 0 ? null : MaxRegions.CREATOR.createFromParcel(parcel), SubLoad.CREATOR.createFromParcel(parcel), SearchError.CREATOR.createFromParcel(parcel), SearchNotFound.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Errors[] newArray(int i12) {
                return new Errors[i12];
            }
        }

        public Errors(@l MaxRegions maxRegions, @k SubLoad subLoad, @k SearchError searchError, @k SearchNotFound searchNotFound) {
            this.maxRegions = maxRegions;
            this.subLoad = subLoad;
            this.searchError = searchError;
            this.searchNotFound = searchNotFound;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final MaxRegions getMaxRegions() {
            return this.maxRegions;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final SearchError getSearchError() {
            return this.searchError;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final SearchNotFound getSearchNotFound() {
            return this.searchNotFound;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Errors)) {
                return false;
            }
            Errors errors = (Errors) obj;
            return L.f(this.maxRegions, errors.maxRegions) && L.f(this.subLoad, errors.subLoad) && L.f(this.searchError, errors.searchError) && L.f(this.searchNotFound, errors.searchNotFound);
        }

        @k
        /* renamed from: f, reason: from getter */
        public final SubLoad getSubLoad() {
            return this.subLoad;
        }

        public final int hashCode() {
            MaxRegions maxRegions = this.maxRegions;
            return this.searchNotFound.hashCode() + ((this.searchError.hashCode() + ((this.subLoad.hashCode() + ((maxRegions == null ? 0 : maxRegions.hashCode()) * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            return "Errors(maxRegions=" + this.maxRegions + ", subLoad=" + this.subLoad + ", searchError=" + this.searchError + ", searchNotFound=" + this.searchNotFound + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            MaxRegions maxRegions = this.maxRegions;
            if (maxRegions == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                maxRegions.writeToParcel(parcel, i12);
            }
            this.subLoad.writeToParcel(parcel, i12);
            this.searchError.writeToParcel(parcel, i12);
            this.searchNotFound.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: RegionSheetData.kt */
    @P
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001fBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006 "}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Location;", "Landroid/os/Parcelable;", "", SearchParamsConverterKt.LOCATION_ID, "", "title", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Location$CheckboxState;", "checkboxState", "", "haveChildren", "", BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN, "pickedLocationIds", "<init>", "(JLjava/lang/String;Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Location$CheckboxState;ZLjava/util/List;Ljava/util/List;)V", "J", "f", "()J", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Location$CheckboxState;", "c", "()Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Location$CheckboxState;", "Z", "e", "()Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "g", "CheckboxState", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Location implements Parcelable {

        @k
        public static final Parcelable.Creator<Location> CREATOR = new a();

        @c("checkboxState")
        @k
        private final CheckboxState checkboxState;

        @c(BeduinPromoBlockModel.SERIALIZED_NAME_CHILDREN)
        @k
        private final List<Location> children;

        @c("haveChildren")
        private final boolean haveChildren;

        @c(SearchParamsConverterKt.LOCATION_ID)
        private final long locationId;

        @c("pickedLocationIds")
        @k
        private final List<Long> pickedLocationIds;

        @c("title")
        @k
        private final String title;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: RegionSheetData.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cpx_promo_geo/screens/region_sheet/RegionSheetData$Location$CheckboxState;", "", "(Ljava/lang/String;I)V", "SELECTED", "PARTIAL_SELECTED", "NOT_SELECTED", "HOME", "_avito_cpx-promo-geo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class CheckboxState {

            @c("isHome")
            public static final CheckboxState HOME;

            @c("notSelected")
            public static final CheckboxState NOT_SELECTED;

            @c("partialSelected")
            public static final CheckboxState PARTIAL_SELECTED;

            @c("fullSelected")
            public static final CheckboxState SELECTED;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ CheckboxState[] f128248b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f128249c;

            static {
                CheckboxState checkboxState = new CheckboxState("SELECTED", 0);
                SELECTED = checkboxState;
                CheckboxState checkboxState2 = new CheckboxState("PARTIAL_SELECTED", 1);
                PARTIAL_SELECTED = checkboxState2;
                CheckboxState checkboxState3 = new CheckboxState("NOT_SELECTED", 2);
                NOT_SELECTED = checkboxState3;
                CheckboxState checkboxState4 = new CheckboxState("HOME", 3);
                HOME = checkboxState4;
                CheckboxState[] checkboxStateArr = {checkboxState, checkboxState2, checkboxState3, checkboxState4};
                f128248b = checkboxStateArr;
                f128249c = kotlin.enums.c.a(checkboxStateArr);
            }

            private CheckboxState(String str, int i12) {
            }

            public static CheckboxState valueOf(String str) {
                return (CheckboxState) Enum.valueOf(CheckboxState.class, str);
            }

            public static CheckboxState[] values() {
                return (CheckboxState[]) f128248b.clone();
            }
        }

        /* compiled from: RegionSheetData.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Location> {
            @Override // android.os.Parcelable.Creator
            public final Location createFromParcel(Parcel parcel) {
                long j12 = parcel.readLong();
                String string = parcel.readString();
                CheckboxState checkboxStateValueOf = CheckboxState.valueOf(parcel.readString());
                boolean z12 = parcel.readInt() != 0;
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Location.CREATOR, parcel, arrayList, iC2, 1);
                }
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                return new Location(j12, string, checkboxStateValueOf, z12, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Location[] newArray(int i12) {
                return new Location[i12];
            }
        }

        public Location(long j12, @k String str, @k CheckboxState checkboxState, boolean z12, @k List<Location> list, @k List<Long> list2) {
            this.locationId = j12;
            this.title = str;
            this.checkboxState = checkboxState;
            this.haveChildren = z12;
            this.children = list;
            this.pickedLocationIds = list2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final CheckboxState getCheckboxState() {
            return this.checkboxState;
        }

        @k
        public final List<Location> d() {
            return this.children;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getHaveChildren() {
            return this.haveChildren;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return false;
            }
            Location location = (Location) obj;
            return this.locationId == location.locationId && L.f(this.title, location.title) && this.checkboxState == location.checkboxState && this.haveChildren == location.haveChildren && L.f(this.children, location.children) && L.f(this.pickedLocationIds, location.pickedLocationIds);
        }

        /* renamed from: f, reason: from getter */
        public final long getLocationId() {
            return this.locationId;
        }

        @k
        public final List<Long> g() {
            return this.pickedLocationIds;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.pickedLocationIds.hashCode() + H.e(r.i((this.checkboxState.hashCode() + H.d(Long.hashCode(this.locationId) * 31, 31, this.title)) * 31, 31, this.haveChildren), 31, this.children);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Location(locationId=");
            sb2.append(this.locationId);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", checkboxState=");
            sb2.append(this.checkboxState);
            sb2.append(", haveChildren=");
            sb2.append(this.haveChildren);
            sb2.append(", children=");
            sb2.append(this.children);
            sb2.append(", pickedLocationIds=");
            return H.p(sb2, this.pickedLocationIds, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeLong(this.locationId);
            parcel.writeString(this.title);
            parcel.writeString(this.checkboxState.name());
            parcel.writeInt(this.haveChildren ? 1 : 0);
            Iterator itJ = C0.j(this.children, parcel);
            while (itJ.hasNext()) {
                ((Location) itJ.next()).writeToParcel(parcel, i12);
            }
            Iterator itJ2 = C0.j(this.pickedLocationIds, parcel);
            while (itJ2.hasNext()) {
                parcel.writeLong(((Number) itJ2.next()).longValue());
            }
        }
    }

    /* compiled from: RegionSheetData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RegionSheetData> {
        @Override // android.os.Parcelable.Creator
        public final RegionSheetData createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Location.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new RegionSheetData(string, arrayList, Errors.CREATOR.createFromParcel(parcel), parcel.readString(), Button.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RegionSheetData[] newArray(int i12) {
            return new RegionSheetData[i12];
        }
    }

    public RegionSheetData(@l String str, @k List<Location> list, @k Errors errors, @l String str2, @k Button button) {
        this.rootLocationTitle = str;
        this.locations = list;
        this.errors = errors;
        this.placeholder = str2;
        this.button = button;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final Button getButton() {
        return this.button;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Errors getErrors() {
        return this.errors;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final List<Location> e() {
        return this.locations;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegionSheetData)) {
            return false;
        }
        RegionSheetData regionSheetData = (RegionSheetData) obj;
        return L.f(this.rootLocationTitle, regionSheetData.rootLocationTitle) && L.f(this.locations, regionSheetData.locations) && L.f(this.errors, regionSheetData.errors) && L.f(this.placeholder, regionSheetData.placeholder) && L.f(this.button, regionSheetData.button);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getRootLocationTitle() {
        return this.rootLocationTitle;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final int hashCode() {
        String str = this.rootLocationTitle;
        int iHashCode = (this.errors.hashCode() + H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.locations)) * 31;
        String str2 = this.placeholder;
        return this.button.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "RegionSheetData(rootLocationTitle=" + this.rootLocationTitle + ", locations=" + this.locations + ", errors=" + this.errors + ", placeholder=" + this.placeholder + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.rootLocationTitle);
        Iterator itJ = C0.j(this.locations, parcel);
        while (itJ.hasNext()) {
            ((Location) itJ.next()).writeToParcel(parcel, i12);
        }
        this.errors.writeToParcel(parcel, i12);
        parcel.writeString(this.placeholder);
        this.button.writeToParcel(parcel, i12);
    }
}
