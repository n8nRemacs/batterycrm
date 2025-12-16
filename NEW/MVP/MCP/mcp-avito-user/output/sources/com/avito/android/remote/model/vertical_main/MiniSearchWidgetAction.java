package com.avito.android.remote.model.vertical_main;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MiniSearchWidget.kt */
@d
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0010J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019Jb\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0019J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b\u0007\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00101\u001a\u0004\b\b\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b2\u0010\u0010R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b4\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b5\u0010\u0019¨\u00066"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetAction;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "", "isAutoOpen", "isFilterIconVisible", "description", "", "startIcon", "endIcon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/avito/android/remote/model/text/AttributedText;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component3", "()Z", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Ljava/lang/String;", "component7", "copy", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;ZLjava/lang/Boolean;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/vertical_main/MiniSearchWidgetAction;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "Z", "Ljava/lang/Boolean;", "getDescription", "Ljava/lang/String;", "getStartIcon", "getEndIcon", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class MiniSearchWidgetAction implements Parcelable {

    @k
    public static final Parcelable.Creator<MiniSearchWidgetAction> CREATOR = new Creator();

    @c("description")
    @l
    private final AttributedText description;

    @c("endIcon")
    @l
    private final String endIcon;

    @c("isAutoOpen")
    private final boolean isAutoOpen;

    @c("isFilterIconVisible")
    @l
    private final Boolean isFilterIconVisible;

    @c("startIcon")
    @l
    private final String startIcon;

    @c("title")
    @l
    private final AttributedText title;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink uri;

    /* compiled from: MiniSearchWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MiniSearchWidgetAction> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniSearchWidgetAction createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            AttributedText attributedText = (AttributedText) parcel.readParcelable(MiniSearchWidgetAction.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(MiniSearchWidgetAction.class.getClassLoader());
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MiniSearchWidgetAction(attributedText, deepLink, z12, boolValueOf, (AttributedText) parcel.readParcelable(MiniSearchWidgetAction.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final MiniSearchWidgetAction[] newArray(int i12) {
            return new MiniSearchWidgetAction[i12];
        }
    }

    public MiniSearchWidgetAction(@l AttributedText attributedText, @l DeepLink deepLink, boolean z12, @l Boolean bool, @l AttributedText attributedText2, @l String str, @l String str2) {
        this.title = attributedText;
        this.uri = deepLink;
        this.isAutoOpen = z12;
        this.isFilterIconVisible = bool;
        this.description = attributedText2;
        this.startIcon = str;
        this.endIcon = str2;
    }

    public static /* synthetic */ MiniSearchWidgetAction copy$default(MiniSearchWidgetAction miniSearchWidgetAction, AttributedText attributedText, DeepLink deepLink, boolean z12, Boolean bool, AttributedText attributedText2, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributedText = miniSearchWidgetAction.title;
        }
        if ((i12 & 2) != 0) {
            deepLink = miniSearchWidgetAction.uri;
        }
        DeepLink deepLink2 = deepLink;
        if ((i12 & 4) != 0) {
            z12 = miniSearchWidgetAction.isAutoOpen;
        }
        boolean z13 = z12;
        if ((i12 & 8) != 0) {
            bool = miniSearchWidgetAction.isFilterIconVisible;
        }
        Boolean bool2 = bool;
        if ((i12 & 16) != 0) {
            attributedText2 = miniSearchWidgetAction.description;
        }
        AttributedText attributedText3 = attributedText2;
        if ((i12 & 32) != 0) {
            str = miniSearchWidgetAction.startIcon;
        }
        String str3 = str;
        if ((i12 & 64) != 0) {
            str2 = miniSearchWidgetAction.endIcon;
        }
        return miniSearchWidgetAction.copy(attributedText, deepLink2, z13, bool2, attributedText3, str3, str2);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final DeepLink getUri() {
        return this.uri;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsAutoOpen() {
        return this.isAutoOpen;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final Boolean getIsFilterIconVisible() {
        return this.isFilterIconVisible;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getStartIcon() {
        return this.startIcon;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getEndIcon() {
        return this.endIcon;
    }

    @k
    public final MiniSearchWidgetAction copy(@l AttributedText title, @l DeepLink uri, boolean isAutoOpen, @l Boolean isFilterIconVisible, @l AttributedText description, @l String startIcon, @l String endIcon) {
        return new MiniSearchWidgetAction(title, uri, isAutoOpen, isFilterIconVisible, description, startIcon, endIcon);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MiniSearchWidgetAction)) {
            return false;
        }
        MiniSearchWidgetAction miniSearchWidgetAction = (MiniSearchWidgetAction) other;
        return L.f(this.title, miniSearchWidgetAction.title) && L.f(this.uri, miniSearchWidgetAction.uri) && this.isAutoOpen == miniSearchWidgetAction.isAutoOpen && L.f(this.isFilterIconVisible, miniSearchWidgetAction.isFilterIconVisible) && L.f(this.description, miniSearchWidgetAction.description) && L.f(this.startIcon, miniSearchWidgetAction.startIcon) && L.f(this.endIcon, miniSearchWidgetAction.endIcon);
    }

    @l
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final String getEndIcon() {
        return this.endIcon;
    }

    @l
    public final String getStartIcon() {
        return this.startIcon;
    }

    @l
    public final AttributedText getTitle() {
        return this.title;
    }

    @l
    public final DeepLink getUri() {
        return this.uri;
    }

    public int hashCode() {
        AttributedText attributedText = this.title;
        int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
        DeepLink deepLink = this.uri;
        int i12 = r.i((iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.isAutoOpen);
        Boolean bool = this.isFilterIconVisible;
        int iHashCode2 = (i12 + (bool == null ? 0 : bool.hashCode())) * 31;
        AttributedText attributedText2 = this.description;
        int iHashCode3 = (iHashCode2 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.startIcon;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.endIcon;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isAutoOpen() {
        return this.isAutoOpen;
    }

    @l
    public final Boolean isFilterIconVisible() {
        return this.isFilterIconVisible;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MiniSearchWidgetAction(title=");
        sb2.append(this.title);
        sb2.append(", uri=");
        sb2.append(this.uri);
        sb2.append(", isAutoOpen=");
        sb2.append(this.isAutoOpen);
        sb2.append(", isFilterIconVisible=");
        sb2.append(this.isFilterIconVisible);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", startIcon=");
        sb2.append(this.startIcon);
        sb2.append(", endIcon=");
        return C22026a.c(sb2, this.endIcon, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.title, flags);
        parcel.writeParcelable(this.uri, flags);
        parcel.writeInt(this.isAutoOpen ? 1 : 0);
        Boolean bool = this.isFilterIconVisible;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.description, flags);
        parcel.writeString(this.startIcon);
        parcel.writeString(this.endIcon);
    }

    public /* synthetic */ MiniSearchWidgetAction(AttributedText attributedText, DeepLink deepLink, boolean z12, Boolean bool, AttributedText attributedText2, String str, String str2, int i12, C42822w c42822w) {
        this(attributedText, deepLink, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? Boolean.TRUE : bool, attributedText2, str, str2);
    }
}
