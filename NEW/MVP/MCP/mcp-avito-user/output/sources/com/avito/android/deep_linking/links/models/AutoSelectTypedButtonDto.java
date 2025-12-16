package com.avito.android.deep_linking.links.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.auto_select.AutoSelectButtonStyleDto;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectTypedButtonDto.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/deep_linking/links/models/AutoSelectTypedButtonDto;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/models/AutoSelectButtonTypeDto;", "type", "Lcom/avito/android/remote/model/auto_select/AutoSelectButtonStyleDto;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/models/AutoSelectButtonTypeDto;Lcom/avito/android/remote/model/auto_select/AutoSelectButtonStyleDto;Lcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/models/AutoSelectButtonTypeDto;", "d", "()Lcom/avito/android/deep_linking/links/models/AutoSelectButtonTypeDto;", "Lcom/avito/android/remote/model/auto_select/AutoSelectButtonStyleDto;", "c", "()Lcom/avito/android/remote/model/auto_select/AutoSelectButtonStyleDto;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AutoSelectTypedButtonDto implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectTypedButtonDto> CREATOR = new a();

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @l
    private final DeepLink deepLink;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final AutoSelectButtonStyleDto style;

    @c("title")
    @k
    private final String title;

    @c("type")
    @l
    private final AutoSelectButtonTypeDto type;

    /* compiled from: AutoSelectTypedButtonDto.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectTypedButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectTypedButtonDto createFromParcel(Parcel parcel) {
            return new AutoSelectTypedButtonDto(parcel.readString(), parcel.readInt() == 0 ? null : AutoSelectButtonTypeDto.valueOf(parcel.readString()), parcel.readInt() != 0 ? AutoSelectButtonStyleDto.valueOf(parcel.readString()) : null, (DeepLink) parcel.readParcelable(AutoSelectTypedButtonDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectTypedButtonDto[] newArray(int i12) {
            return new AutoSelectTypedButtonDto[i12];
        }
    }

    public AutoSelectTypedButtonDto(@k String str, @l AutoSelectButtonTypeDto autoSelectButtonTypeDto, @l AutoSelectButtonStyleDto autoSelectButtonStyleDto, @l DeepLink deepLink) {
        this.title = str;
        this.type = autoSelectButtonTypeDto;
        this.style = autoSelectButtonStyleDto;
        this.deepLink = deepLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AutoSelectButtonStyleDto getStyle() {
        return this.style;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AutoSelectButtonTypeDto getType() {
        return this.type;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectTypedButtonDto)) {
            return false;
        }
        AutoSelectTypedButtonDto autoSelectTypedButtonDto = (AutoSelectTypedButtonDto) obj;
        return L.f(this.title, autoSelectTypedButtonDto.title) && this.type == autoSelectTypedButtonDto.type && this.style == autoSelectTypedButtonDto.style && L.f(this.deepLink, autoSelectTypedButtonDto.deepLink);
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        AutoSelectButtonTypeDto autoSelectButtonTypeDto = this.type;
        int iHashCode2 = (iHashCode + (autoSelectButtonTypeDto == null ? 0 : autoSelectButtonTypeDto.hashCode())) * 31;
        AutoSelectButtonStyleDto autoSelectButtonStyleDto = this.style;
        int iHashCode3 = (iHashCode2 + (autoSelectButtonStyleDto == null ? 0 : autoSelectButtonStyleDto.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectTypedButtonDto(title=");
        sb2.append(this.title);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.deepLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        AutoSelectButtonTypeDto autoSelectButtonTypeDto = this.type;
        if (autoSelectButtonTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(autoSelectButtonTypeDto.name());
        }
        AutoSelectButtonStyleDto autoSelectButtonStyleDto = this.style;
        if (autoSelectButtonStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(autoSelectButtonStyleDto.name());
        }
        parcel.writeParcelable(this.deepLink, i12);
    }
}
