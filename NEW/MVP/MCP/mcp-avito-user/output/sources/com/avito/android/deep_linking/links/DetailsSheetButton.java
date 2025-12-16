package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DetailsSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/deep_linking/links/DetailsSheetButton;", "Landroid/os/Parcelable;", "", "title", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "icon", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/ParametrizedEvent;", "clickEvent", "", "topMargin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/ParametrizedEvent;Ljava/lang/Integer;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getStyle", "getIcon", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/ParametrizedEvent;", "c", "()Lcom/avito/android/remote/model/ParametrizedEvent;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DetailsSheetButton implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<DetailsSheetButton> CREATOR = new a();

    @com.google.gson.annotations.c("clickEvent")
    @Y61.l
    private final ParametrizedEvent clickEvent;

    @com.google.gson.annotations.c(ContextActionHandler.Link.URL)
    @Y61.l
    private final DeepLink deeplink;

    @com.google.gson.annotations.c("icon")
    @Y61.l
    private final String icon;

    @com.google.gson.annotations.c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @Y61.l
    private final String style;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    @com.google.gson.annotations.c("topMargin")
    @Y61.l
    private final Integer topMargin;

    /* compiled from: DetailsSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DetailsSheetButton> {
        @Override // android.os.Parcelable.Creator
        public final DetailsSheetButton createFromParcel(Parcel parcel) {
            return new DetailsSheetButton(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(DetailsSheetButton.class.getClassLoader()), parcel.readInt() == 0 ? null : ParametrizedEvent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final DetailsSheetButton[] newArray(int i12) {
            return new DetailsSheetButton[i12];
        }
    }

    public DetailsSheetButton(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l DeepLink deepLink, @Y61.l ParametrizedEvent parametrizedEvent, @Y61.l Integer num) {
        this.title = str;
        this.style = str2;
        this.icon = str3;
        this.deeplink = deepLink;
        this.clickEvent = parametrizedEvent;
        this.topMargin = num;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final ParametrizedEvent getClickEvent() {
        return this.clickEvent;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Integer getTopMargin() {
        return this.topMargin;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsSheetButton)) {
            return false;
        }
        DetailsSheetButton detailsSheetButton = (DetailsSheetButton) obj;
        return kotlin.jvm.internal.L.f(this.title, detailsSheetButton.title) && kotlin.jvm.internal.L.f(this.style, detailsSheetButton.style) && kotlin.jvm.internal.L.f(this.icon, detailsSheetButton.icon) && kotlin.jvm.internal.L.f(this.deeplink, detailsSheetButton.deeplink) && kotlin.jvm.internal.L.f(this.clickEvent, detailsSheetButton.clickEvent) && kotlin.jvm.internal.L.f(this.topMargin, detailsSheetButton.topMargin);
    }

    @Y61.l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @Y61.l
    public final String getIcon() {
        return this.icon;
    }

    @Y61.l
    public final String getStyle() {
        return this.style;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.style;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DeepLink deepLink = this.deeplink;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        ParametrizedEvent parametrizedEvent = this.clickEvent;
        int iHashCode5 = (iHashCode4 + (parametrizedEvent == null ? 0 : parametrizedEvent.hashCode())) * 31;
        Integer num = this.topMargin;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DetailsSheetButton(title=");
        sb2.append(this.title);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", clickEvent=");
        sb2.append(this.clickEvent);
        sb2.append(", topMargin=");
        return com.akita.compose.component.accordion.s.j(sb2, this.topMargin, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeString(this.style);
        parcel.writeString(this.icon);
        parcel.writeParcelable(this.deeplink, i12);
        ParametrizedEvent parametrizedEvent = this.clickEvent;
        if (parametrizedEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parametrizedEvent.writeToParcel(parcel, i12);
        }
        Integer num = this.topMargin;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }

    public /* synthetic */ DetailsSheetButton(String str, String str2, String str3, DeepLink deepLink, ParametrizedEvent parametrizedEvent, Integer num, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : deepLink, (i12 & 16) != 0 ? null : parametrizedEvent, (i12 & 32) == 0 ? num : null);
    }
}
