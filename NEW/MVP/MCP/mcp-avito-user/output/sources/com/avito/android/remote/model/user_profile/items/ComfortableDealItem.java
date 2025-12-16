package com.avito.android.remote.model.user_profile.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import com.my.tracker.ads.AdFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealItem.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0011¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/user_profile/items/ComfortableDealItem;", "Lcom/avito/android/remote/model/user_profile/items/UserProfileItem;", "", "title", "subtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/user_profile/items/Banner;", AdFormat.BANNER, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/user_profile/items/Banner;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "()Lcom/avito/android/remote/model/user_profile/items/Banner;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/user_profile/items/Banner;)Lcom/avito/android/remote/model/user_profile/items/ComfortableDealItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/user_profile/items/Banner;", "getBanner", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ComfortableDealItem extends UserProfileItem {

    @k
    public static final Parcelable.Creator<ComfortableDealItem> CREATOR = new Creator();

    @c(AdFormat.BANNER)
    @l
    private final Banner banner;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @c("subtitle")
    @k
    private final String subtitle;

    @c("title")
    @k
    private final String title;

    /* compiled from: ComfortableDealItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ComfortableDealItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealItem createFromParcel(@k Parcel parcel) {
            return new ComfortableDealItem(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(ComfortableDealItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Banner.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ComfortableDealItem[] newArray(int i12) {
            return new ComfortableDealItem[i12];
        }
    }

    public ComfortableDealItem(@k String str, @k String str2, @k DeepLink deepLink, @l Banner banner) {
        this.title = str;
        this.subtitle = str2;
        this.deeplink = deepLink;
        this.banner = banner;
    }

    public static /* synthetic */ ComfortableDealItem copy$default(ComfortableDealItem comfortableDealItem, String str, String str2, DeepLink deepLink, Banner banner, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = comfortableDealItem.title;
        }
        if ((i12 & 2) != 0) {
            str2 = comfortableDealItem.subtitle;
        }
        if ((i12 & 4) != 0) {
            deepLink = comfortableDealItem.deeplink;
        }
        if ((i12 & 8) != 0) {
            banner = comfortableDealItem.banner;
        }
        return comfortableDealItem.copy(str, str2, deepLink, banner);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    @k
    public final ComfortableDealItem copy(@k String title, @k String subtitle, @k DeepLink deeplink, @l Banner banner) {
        return new ComfortableDealItem(title, subtitle, deeplink, banner);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ComfortableDealItem)) {
            return false;
        }
        ComfortableDealItem comfortableDealItem = (ComfortableDealItem) other;
        return L.f(this.title, comfortableDealItem.title) && L.f(this.subtitle, comfortableDealItem.subtitle) && L.f(this.deeplink, comfortableDealItem.deeplink) && L.f(this.banner, comfortableDealItem.banner);
    }

    @l
    public final Banner getBanner() {
        return this.banner;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @k
    public final String getSubtitle() {
        return this.subtitle;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iE2 = a.e(this.deeplink, H.d(this.title.hashCode() * 31, 31, this.subtitle), 31);
        Banner banner = this.banner;
        return iE2 + (banner == null ? 0 : banner.hashCode());
    }

    @k
    public String toString() {
        return "ComfortableDealItem(title=" + this.title + ", subtitle=" + this.subtitle + ", deeplink=" + this.deeplink + ", banner=" + this.banner + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.deeplink, flags);
        Banner banner = this.banner;
        if (banner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            banner.writeToParcel(parcel, flags);
        }
    }
}
