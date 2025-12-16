package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertNavBar.kt */
@d
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JT\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b0\u0010\u0013R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b1\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b3\u0010\u0017¨\u00064"}, d2 = {"Lcom/avito/android/remote/model/AdvertNavBarAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/AdvertNavBarActionType;", "type", "Lcom/avito/android/remote/model/AdvertNavBarActionVisibility;", "showAsAction", "", "icon", "textIcon", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Lcom/avito/android/remote/model/AdvertNavBarActionType;Lcom/avito/android/remote/model/AdvertNavBarActionVisibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Lcom/avito/android/remote/model/AdvertNavBarActionType;", "component2", "()Lcom/avito/android/remote/model/AdvertNavBarActionVisibility;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Lcom/avito/android/remote/model/AdvertNavBarActionType;Lcom/avito/android/remote/model/AdvertNavBarActionVisibility;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/AdvertNavBarAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/AdvertNavBarActionType;", "getType", "Lcom/avito/android/remote/model/AdvertNavBarActionVisibility;", "getShowAsAction", "Ljava/lang/String;", "getIcon", "getTextIcon", "getText", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AdvertNavBarAction implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertNavBarAction> CREATOR = new Creator();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c("icon")
    @l
    private final String icon;

    @c("showAsAction")
    @k
    private final AdvertNavBarActionVisibility showAsAction;

    @c("text")
    @l
    private final String text;

    @c("textIcon")
    @l
    private final String textIcon;

    @c("type")
    @k
    private final AdvertNavBarActionType type;

    /* compiled from: AdvertNavBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertNavBarAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertNavBarAction createFromParcel(@k Parcel parcel) {
            return new AdvertNavBarAction(AdvertNavBarActionType.valueOf(parcel.readString()), AdvertNavBarActionVisibility.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(AdvertNavBarAction.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertNavBarAction[] newArray(int i12) {
            return new AdvertNavBarAction[i12];
        }
    }

    public AdvertNavBarAction(@k AdvertNavBarActionType advertNavBarActionType, @k AdvertNavBarActionVisibility advertNavBarActionVisibility, @l String str, @l String str2, @l String str3, @l DeepLink deepLink) {
        this.type = advertNavBarActionType;
        this.showAsAction = advertNavBarActionVisibility;
        this.icon = str;
        this.textIcon = str2;
        this.text = str3;
        this.deepLink = deepLink;
    }

    public static /* synthetic */ AdvertNavBarAction copy$default(AdvertNavBarAction advertNavBarAction, AdvertNavBarActionType advertNavBarActionType, AdvertNavBarActionVisibility advertNavBarActionVisibility, String str, String str2, String str3, DeepLink deepLink, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            advertNavBarActionType = advertNavBarAction.type;
        }
        if ((i12 & 2) != 0) {
            advertNavBarActionVisibility = advertNavBarAction.showAsAction;
        }
        AdvertNavBarActionVisibility advertNavBarActionVisibility2 = advertNavBarActionVisibility;
        if ((i12 & 4) != 0) {
            str = advertNavBarAction.icon;
        }
        String str4 = str;
        if ((i12 & 8) != 0) {
            str2 = advertNavBarAction.textIcon;
        }
        String str5 = str2;
        if ((i12 & 16) != 0) {
            str3 = advertNavBarAction.text;
        }
        String str6 = str3;
        if ((i12 & 32) != 0) {
            deepLink = advertNavBarAction.deepLink;
        }
        return advertNavBarAction.copy(advertNavBarActionType, advertNavBarActionVisibility2, str4, str5, str6, deepLink);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final AdvertNavBarActionType getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final AdvertNavBarActionVisibility getShowAsAction() {
        return this.showAsAction;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getTextIcon() {
        return this.textIcon;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final AdvertNavBarAction copy(@k AdvertNavBarActionType type, @k AdvertNavBarActionVisibility showAsAction, @l String icon, @l String textIcon, @l String text, @l DeepLink deepLink) {
        return new AdvertNavBarAction(type, showAsAction, icon, textIcon, text, deepLink);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertNavBarAction)) {
            return false;
        }
        AdvertNavBarAction advertNavBarAction = (AdvertNavBarAction) other;
        return this.type == advertNavBarAction.type && this.showAsAction == advertNavBarAction.showAsAction && L.f(this.icon, advertNavBarAction.icon) && L.f(this.textIcon, advertNavBarAction.textIcon) && L.f(this.text, advertNavBarAction.text) && L.f(this.deepLink, advertNavBarAction.deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getIcon() {
        return this.icon;
    }

    @k
    public final AdvertNavBarActionVisibility getShowAsAction() {
        return this.showAsAction;
    }

    @l
    public final String getText() {
        return this.text;
    }

    @l
    public final String getTextIcon() {
        return this.textIcon;
    }

    @k
    public final AdvertNavBarActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.showAsAction.hashCode() + (this.type.hashCode() * 31)) * 31;
        String str = this.icon;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.textIcon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.text;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode4 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdvertNavBarAction(type=");
        sb2.append(this.type);
        sb2.append(", showAsAction=");
        sb2.append(this.showAsAction);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", textIcon=");
        sb2.append(this.textIcon);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", deepLink=");
        return a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type.name());
        parcel.writeString(this.showAsAction.name());
        parcel.writeString(this.icon);
        parcel.writeString(this.textIcon);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.deepLink, flags);
    }
}
