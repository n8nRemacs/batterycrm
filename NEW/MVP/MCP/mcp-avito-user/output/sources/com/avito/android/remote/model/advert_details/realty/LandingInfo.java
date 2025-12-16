package com.avito.android.remote.model.advert_details.realty;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DevelopmentsAdvice.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "Landroid/os/Parcelable;", "", "linkText", "landingUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/advert_details/realty/LandingInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLinkText", "getLandingUrl", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUrl", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LandingInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<LandingInfo> CREATOR = new Creator();

    @c("landingUrl")
    @l
    private final String landingUrl;

    @c("linkText")
    @l
    private final String linkText;

    @c(ContextActionHandler.Link.URL)
    @l
    private final DeepLink url;

    /* compiled from: DevelopmentsAdvice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LandingInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LandingInfo createFromParcel(@k Parcel parcel) {
            return new LandingInfo(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(LandingInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LandingInfo[] newArray(int i12) {
            return new LandingInfo[i12];
        }
    }

    public LandingInfo(@l String str, @l String str2, @l DeepLink deepLink) {
        this.linkText = str;
        this.landingUrl = str2;
        this.url = deepLink;
    }

    public static /* synthetic */ LandingInfo copy$default(LandingInfo landingInfo, String str, String str2, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = landingInfo.linkText;
        }
        if ((i12 & 2) != 0) {
            str2 = landingInfo.landingUrl;
        }
        if ((i12 & 4) != 0) {
            deepLink = landingInfo.url;
        }
        return landingInfo.copy(str, str2, deepLink);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getLinkText() {
        return this.linkText;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getLandingUrl() {
        return this.landingUrl;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getUrl() {
        return this.url;
    }

    @k
    public final LandingInfo copy(@l String linkText, @l String landingUrl, @l DeepLink url) {
        return new LandingInfo(linkText, landingUrl, url);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandingInfo)) {
            return false;
        }
        LandingInfo landingInfo = (LandingInfo) other;
        return L.f(this.linkText, landingInfo.linkText) && L.f(this.landingUrl, landingInfo.landingUrl) && L.f(this.url, landingInfo.url);
    }

    @l
    public final String getLandingUrl() {
        return this.landingUrl;
    }

    @l
    public final String getLinkText() {
        return this.linkText;
    }

    @l
    public final DeepLink getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.linkText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.landingUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.url;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LandingInfo(linkText=");
        sb2.append(this.linkText);
        sb2.append(", landingUrl=");
        sb2.append(this.landingUrl);
        sb2.append(", url=");
        return a.v(sb2, this.url, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.linkText);
        parcel.writeString(this.landingUrl);
        parcel.writeParcelable(this.url, flags);
    }

    public /* synthetic */ LandingInfo(String str, String str2, DeepLink deepLink, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : deepLink);
    }
}
