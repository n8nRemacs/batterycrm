package com.avito.android.remote.model.search_suggests;

import K51.d;
import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.SuggestAnalyticsData;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AdvertSuggest.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b,\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/search_suggests/AdvertSearchSuggest;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "icon", "", "title", "description", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/SuggestAnalyticsData;", "analyticsData", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/SuggestAnalyticsData;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component5", "()Lcom/avito/android/remote/model/SuggestAnalyticsData;", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/SuggestAnalyticsData;)Lcom/avito/android/remote/model/search_suggests/AdvertSearchSuggest;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Landroid/net/Uri;", "getIcon", "Ljava/lang/String;", "getTitle", "getDescription", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "Lcom/avito/android/remote/model/SuggestAnalyticsData;", "getAnalyticsData", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertSearchSuggest implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertSearchSuggest> CREATOR = new Creator();

    @c("analyticsData")
    @l
    private final SuggestAnalyticsData analyticsData;

    @c(Constants.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("description")
    @l
    private final String description;

    @c("imageSrc")
    @l
    private final Uri icon;

    @c("title")
    @l
    private final String title;

    /* compiled from: AdvertSuggest.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertSearchSuggest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSearchSuggest createFromParcel(@k Parcel parcel) {
            return new AdvertSearchSuggest((Uri) parcel.readParcelable(AdvertSearchSuggest.class.getClassLoader()), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertSearchSuggest.class.getClassLoader()), parcel.readInt() == 0 ? null : SuggestAnalyticsData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertSearchSuggest[] newArray(int i12) {
            return new AdvertSearchSuggest[i12];
        }
    }

    public AdvertSearchSuggest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ AdvertSearchSuggest copy$default(AdvertSearchSuggest advertSearchSuggest, Uri uri, String str, String str2, DeepLink deepLink, SuggestAnalyticsData suggestAnalyticsData, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            uri = advertSearchSuggest.icon;
        }
        if ((i12 & 2) != 0) {
            str = advertSearchSuggest.title;
        }
        String str3 = str;
        if ((i12 & 4) != 0) {
            str2 = advertSearchSuggest.description;
        }
        String str4 = str2;
        if ((i12 & 8) != 0) {
            deepLink = advertSearchSuggest.deeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 16) != 0) {
            suggestAnalyticsData = advertSearchSuggest.analyticsData;
        }
        return advertSearchSuggest.copy(uri, str3, str4, deepLink2, suggestAnalyticsData);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Uri getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final SuggestAnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    @k
    public final AdvertSearchSuggest copy(@l Uri icon, @l String title, @l String description, @l DeepLink deeplink, @l SuggestAnalyticsData analyticsData) {
        return new AdvertSearchSuggest(icon, title, description, deeplink, analyticsData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertSearchSuggest)) {
            return false;
        }
        AdvertSearchSuggest advertSearchSuggest = (AdvertSearchSuggest) other;
        return L.f(this.icon, advertSearchSuggest.icon) && L.f(this.title, advertSearchSuggest.title) && L.f(this.description, advertSearchSuggest.description) && L.f(this.deeplink, advertSearchSuggest.deeplink) && L.f(this.analyticsData, advertSearchSuggest.analyticsData);
    }

    @l
    public final SuggestAnalyticsData getAnalyticsData() {
        return this.analyticsData;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final Uri getIcon() {
        return this.icon;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        Uri uri = this.icon;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        SuggestAnalyticsData suggestAnalyticsData = this.analyticsData;
        return iHashCode4 + (suggestAnalyticsData != null ? suggestAnalyticsData.hashCode() : 0);
    }

    @k
    public String toString() {
        return "AdvertSearchSuggest(icon=" + this.icon + ", title=" + this.title + ", description=" + this.description + ", deeplink=" + this.deeplink + ", analyticsData=" + this.analyticsData + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.icon, flags);
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeParcelable(this.deeplink, flags);
        SuggestAnalyticsData suggestAnalyticsData = this.analyticsData;
        if (suggestAnalyticsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            suggestAnalyticsData.writeToParcel(parcel, flags);
        }
    }

    public AdvertSearchSuggest(@l Uri uri, @l String str, @l String str2, @l DeepLink deepLink, @l SuggestAnalyticsData suggestAnalyticsData) {
        this.icon = uri;
        this.title = str;
        this.description = str2;
        this.deeplink = deepLink;
        this.analyticsData = suggestAnalyticsData;
    }

    public /* synthetic */ AdvertSearchSuggest(Uri uri, String str, String str2, DeepLink deepLink, SuggestAnalyticsData suggestAnalyticsData, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : uri, (i12 & 2) != 0 ? null : str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : suggestAnalyticsData);
    }
}
