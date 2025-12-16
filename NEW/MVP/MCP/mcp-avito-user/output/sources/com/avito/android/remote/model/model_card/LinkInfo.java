package com.avito.android.remote.model.model_card;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LinkInfo.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015JL\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b!\u0010\u001bJ \u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b&\u0010'R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b.\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u0015¨\u00061"}, d2 = {"Lcom/avito/android/remote/model/model_card/LinkInfo;", "Landroid/os/Parcelable;", "", "link", "Lcom/avito/android/remote/model/model_card/DisplayType;", "displayType", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "title", "Lcom/avito/android/remote/model/model_card/LinkInfoVersion;", "version", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/model_card/DisplayType;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/model_card/LinkInfoVersion;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/model_card/DisplayType;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "component5", "()Lcom/avito/android/remote/model/model_card/LinkInfoVersion;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/model_card/DisplayType;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Lcom/avito/android/remote/model/model_card/LinkInfoVersion;)Lcom/avito/android/remote/model/model_card/LinkInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getLink", "Lcom/avito/android/remote/model/model_card/DisplayType;", "getDisplayType", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getTitle", "Lcom/avito/android/remote/model/model_card/LinkInfoVersion;", "getVersion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LinkInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<LinkInfo> CREATOR = new Creator();

    @c(ContextActionHandler.Link.DEEPLINK)
    @l
    private final DeepLink deeplink;

    @c("displayType")
    @l
    private final DisplayType displayType;

    @c("link")
    @l
    private final String link;

    @c("linkTitle")
    @l
    private final String title;

    @c("version")
    @l
    private final LinkInfoVersion version;

    /* compiled from: LinkInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LinkInfo createFromParcel(@k Parcel parcel) {
            return new LinkInfo(parcel.readString(), parcel.readInt() == 0 ? null : DisplayType.valueOf(parcel.readString()), (DeepLink) parcel.readParcelable(LinkInfo.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : LinkInfoVersion.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LinkInfo[] newArray(int i12) {
            return new LinkInfo[i12];
        }
    }

    public LinkInfo(@l String str, @l DisplayType displayType, @l DeepLink deepLink, @l String str2, @l LinkInfoVersion linkInfoVersion) {
        this.link = str;
        this.displayType = displayType;
        this.deeplink = deepLink;
        this.title = str2;
        this.version = linkInfoVersion;
    }

    public static /* synthetic */ LinkInfo copy$default(LinkInfo linkInfo, String str, DisplayType displayType, DeepLink deepLink, String str2, LinkInfoVersion linkInfoVersion, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = linkInfo.link;
        }
        if ((i12 & 2) != 0) {
            displayType = linkInfo.displayType;
        }
        DisplayType displayType2 = displayType;
        if ((i12 & 4) != 0) {
            deepLink = linkInfo.deeplink;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 8) != 0) {
            str2 = linkInfo.title;
        }
        String str3 = str2;
        if ((i12 & 16) != 0) {
            linkInfoVersion = linkInfo.version;
        }
        return linkInfo.copy(str, displayType2, deepLink2, str3, linkInfoVersion);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final LinkInfoVersion getVersion() {
        return this.version;
    }

    @k
    public final LinkInfo copy(@l String link, @l DisplayType displayType, @l DeepLink deeplink, @l String title, @l LinkInfoVersion version) {
        return new LinkInfo(link, displayType, deeplink, title, version);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkInfo)) {
            return false;
        }
        LinkInfo linkInfo = (LinkInfo) other;
        return L.f(this.link, linkInfo.link) && this.displayType == linkInfo.displayType && L.f(this.deeplink, linkInfo.deeplink) && L.f(this.title, linkInfo.title) && this.version == linkInfo.version;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final DisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final String getLink() {
        return this.link;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final LinkInfoVersion getVersion() {
        return this.version;
    }

    public int hashCode() {
        String str = this.link;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        DisplayType displayType = this.displayType;
        int iHashCode2 = (iHashCode + (displayType == null ? 0 : displayType.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode3 = (iHashCode2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LinkInfoVersion linkInfoVersion = this.version;
        return iHashCode4 + (linkInfoVersion != null ? linkInfoVersion.hashCode() : 0);
    }

    @k
    public String toString() {
        return "LinkInfo(link=" + this.link + ", displayType=" + this.displayType + ", deeplink=" + this.deeplink + ", title=" + this.title + ", version=" + this.version + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.link);
        DisplayType displayType = this.displayType;
        if (displayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(displayType.name());
        }
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeString(this.title);
        LinkInfoVersion linkInfoVersion = this.version;
        if (linkInfoVersion == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkInfoVersion.name());
        }
    }
}
