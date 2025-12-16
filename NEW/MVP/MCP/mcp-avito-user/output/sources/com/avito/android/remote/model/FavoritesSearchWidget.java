package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FavoriteItemsWidgets.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000eJ\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eJ \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/FavoritesSearchWidget;", "Landroid/os/Parcelable;", "", ChannelContext.Item.PLACEHOLDER, "", "searchDelay", "minLength", "Lcom/avito/android/remote/model/FavoritesSearchWidget$NotFoundInfo;", "notFoundInfo", "<init>", "(Ljava/lang/String;IILcom/avito/android/remote/model/FavoritesSearchWidget$NotFoundInfo;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Lcom/avito/android/remote/model/FavoritesSearchWidget$NotFoundInfo;", "copy", "(Ljava/lang/String;IILcom/avito/android/remote/model/FavoritesSearchWidget$NotFoundInfo;)Lcom/avito/android/remote/model/FavoritesSearchWidget;", "toString", "hashCode", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPlaceholder", "I", "getSearchDelay", "getMinLength", "Lcom/avito/android/remote/model/FavoritesSearchWidget$NotFoundInfo;", "getNotFoundInfo", "NotFoundInfo", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FavoritesSearchWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<FavoritesSearchWidget> CREATOR = new Creator();

    @c("minLength")
    private final int minLength;

    @c("notFound")
    @k
    private final NotFoundInfo notFoundInfo;

    @c(ChannelContext.Item.PLACEHOLDER)
    @k
    private final String placeholder;

    @c("waitBeforeSearch")
    private final int searchDelay;

    /* compiled from: FavoriteItemsWidgets.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoritesSearchWidget> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoritesSearchWidget createFromParcel(@k Parcel parcel) {
            return new FavoritesSearchWidget(parcel.readString(), parcel.readInt(), parcel.readInt(), NotFoundInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoritesSearchWidget[] newArray(int i12) {
            return new FavoritesSearchWidget[i12];
        }
    }

    /* compiled from: FavoriteItemsWidgets.kt */
    @d
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b'\u0010\u000b¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/FavoritesSearchWidget$NotFoundInfo;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "buttonDeepLink", "buttonTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;)Lcom/avito/android/remote/model/FavoritesSearchWidget$NotFoundInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getButtonDeepLink", "getButtonTitle", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class NotFoundInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<NotFoundInfo> CREATOR = new Creator();

        @c("buttonURL")
        @l
        private final DeepLink buttonDeepLink;

        @c("buttonTitle")
        @l
        private final String buttonTitle;

        @c("subtitle")
        @l
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: FavoriteItemsWidgets.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<NotFoundInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NotFoundInfo createFromParcel(@k Parcel parcel) {
                return new NotFoundInfo(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(NotFoundInfo.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final NotFoundInfo[] newArray(int i12) {
                return new NotFoundInfo[i12];
            }
        }

        public NotFoundInfo(@k String str, @l String str2, @l DeepLink deepLink, @l String str3) {
            this.title = str;
            this.subtitle = str2;
            this.buttonDeepLink = deepLink;
            this.buttonTitle = str3;
        }

        public static /* synthetic */ NotFoundInfo copy$default(NotFoundInfo notFoundInfo, String str, String str2, DeepLink deepLink, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = notFoundInfo.title;
            }
            if ((i12 & 2) != 0) {
                str2 = notFoundInfo.subtitle;
            }
            if ((i12 & 4) != 0) {
                deepLink = notFoundInfo.buttonDeepLink;
            }
            if ((i12 & 8) != 0) {
                str3 = notFoundInfo.buttonTitle;
            }
            return notFoundInfo.copy(str, str2, deepLink, str3);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @l
        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @l
        /* renamed from: component3, reason: from getter */
        public final DeepLink getButtonDeepLink() {
            return this.buttonDeepLink;
        }

        @l
        /* renamed from: component4, reason: from getter */
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @k
        public final NotFoundInfo copy(@k String title, @l String subtitle, @l DeepLink buttonDeepLink, @l String buttonTitle) {
            return new NotFoundInfo(title, subtitle, buttonDeepLink, buttonTitle);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NotFoundInfo)) {
                return false;
            }
            NotFoundInfo notFoundInfo = (NotFoundInfo) other;
            return L.f(this.title, notFoundInfo.title) && L.f(this.subtitle, notFoundInfo.subtitle) && L.f(this.buttonDeepLink, notFoundInfo.buttonDeepLink) && L.f(this.buttonTitle, notFoundInfo.buttonTitle);
        }

        @l
        public final DeepLink getButtonDeepLink() {
            return this.buttonDeepLink;
        }

        @l
        public final String getButtonTitle() {
            return this.buttonTitle;
        }

        @l
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.buttonDeepLink;
            int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            String str2 = this.buttonTitle;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("NotFoundInfo(title=");
            sb2.append(this.title);
            sb2.append(", subtitle=");
            sb2.append(this.subtitle);
            sb2.append(", buttonDeepLink=");
            sb2.append(this.buttonDeepLink);
            sb2.append(", buttonTitle=");
            return C22026a.c(sb2, this.buttonTitle, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.buttonDeepLink, flags);
            parcel.writeString(this.buttonTitle);
        }
    }

    public FavoritesSearchWidget(@k String str, int i12, int i13, @k NotFoundInfo notFoundInfo) {
        this.placeholder = str;
        this.searchDelay = i12;
        this.minLength = i13;
        this.notFoundInfo = notFoundInfo;
    }

    public static /* synthetic */ FavoritesSearchWidget copy$default(FavoritesSearchWidget favoritesSearchWidget, String str, int i12, int i13, NotFoundInfo notFoundInfo, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = favoritesSearchWidget.placeholder;
        }
        if ((i14 & 2) != 0) {
            i12 = favoritesSearchWidget.searchDelay;
        }
        if ((i14 & 4) != 0) {
            i13 = favoritesSearchWidget.minLength;
        }
        if ((i14 & 8) != 0) {
            notFoundInfo = favoritesSearchWidget.notFoundInfo;
        }
        return favoritesSearchWidget.copy(str, i12, i13, notFoundInfo);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSearchDelay() {
        return this.searchDelay;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMinLength() {
        return this.minLength;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final NotFoundInfo getNotFoundInfo() {
        return this.notFoundInfo;
    }

    @k
    public final FavoritesSearchWidget copy(@k String placeholder, int searchDelay, int minLength, @k NotFoundInfo notFoundInfo) {
        return new FavoritesSearchWidget(placeholder, searchDelay, minLength, notFoundInfo);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoritesSearchWidget)) {
            return false;
        }
        FavoritesSearchWidget favoritesSearchWidget = (FavoritesSearchWidget) other;
        return L.f(this.placeholder, favoritesSearchWidget.placeholder) && this.searchDelay == favoritesSearchWidget.searchDelay && this.minLength == favoritesSearchWidget.minLength && L.f(this.notFoundInfo, favoritesSearchWidget.notFoundInfo);
    }

    public final int getMinLength() {
        return this.minLength;
    }

    @k
    public final NotFoundInfo getNotFoundInfo() {
        return this.notFoundInfo;
    }

    @k
    public final String getPlaceholder() {
        return this.placeholder;
    }

    public final int getSearchDelay() {
        return this.searchDelay;
    }

    public int hashCode() {
        return this.notFoundInfo.hashCode() + r.e(this.minLength, r.e(this.searchDelay, this.placeholder.hashCode() * 31, 31), 31);
    }

    @k
    public String toString() {
        return "FavoritesSearchWidget(placeholder=" + this.placeholder + ", searchDelay=" + this.searchDelay + ", minLength=" + this.minLength + ", notFoundInfo=" + this.notFoundInfo + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.placeholder);
        parcel.writeInt(this.searchDelay);
        parcel.writeInt(this.minLength);
        this.notFoundInfo.writeToParcel(parcel, flags);
    }
}
