package com.avito.android.remote.model.common.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerItem.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ>\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/common/items/VerificationBannerItem;", "Lcom/avito/android/remote/model/common/items/VerificationListItem;", "", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "backgroundColor", "title", "Lcom/avito/android/remote/model/text/AttributedText;", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/text/AttributedText;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)Lcom/avito/android/remote/model/common/items/VerificationBannerItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStyle", "getBackgroundColor", "getTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getBody", "_avito-discouraged_avito-api_verification"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class VerificationBannerItem implements VerificationListItem {

    @k
    public static final Parcelable.Creator<VerificationBannerItem> CREATOR = new Creator();

    @c("backgroundColor")
    @l
    private final String backgroundColor;

    @c("body")
    @l
    private final AttributedText body;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_BACKGROUND)
    @k
    private final String style;

    @c("title")
    @l
    private final String title;

    /* compiled from: VerificationBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<VerificationBannerItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationBannerItem createFromParcel(@k Parcel parcel) {
            return new VerificationBannerItem(parcel.readString(), parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(VerificationBannerItem.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final VerificationBannerItem[] newArray(int i12) {
            return new VerificationBannerItem[i12];
        }
    }

    public VerificationBannerItem(@k String str, @l String str2, @l String str3, @l AttributedText attributedText) {
        this.style = str;
        this.backgroundColor = str2;
        this.title = str3;
        this.body = attributedText;
    }

    public static /* synthetic */ VerificationBannerItem copy$default(VerificationBannerItem verificationBannerItem, String str, String str2, String str3, AttributedText attributedText, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = verificationBannerItem.style;
        }
        if ((i12 & 2) != 0) {
            str2 = verificationBannerItem.backgroundColor;
        }
        if ((i12 & 4) != 0) {
            str3 = verificationBannerItem.title;
        }
        if ((i12 & 8) != 0) {
            attributedText = verificationBannerItem.body;
        }
        return verificationBannerItem.copy(str, str2, str3, attributedText);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AttributedText getBody() {
        return this.body;
    }

    @k
    public final VerificationBannerItem copy(@k String style, @l String backgroundColor, @l String title, @l AttributedText body) {
        return new VerificationBannerItem(style, backgroundColor, title, body);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationBannerItem)) {
            return false;
        }
        VerificationBannerItem verificationBannerItem = (VerificationBannerItem) other;
        return L.f(this.style, verificationBannerItem.style) && L.f(this.backgroundColor, verificationBannerItem.backgroundColor) && L.f(this.title, verificationBannerItem.title) && L.f(this.body, verificationBannerItem.body);
    }

    @l
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @l
    public final AttributedText getBody() {
        return this.body;
    }

    @k
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.style.hashCode() * 31;
        String str = this.backgroundColor;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.body;
        return iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationBannerItem(style=");
        sb2.append(this.style);
        sb2.append(", backgroundColor=");
        sb2.append(this.backgroundColor);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", body=");
        return a.w(sb2, this.body, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.style);
        parcel.writeString(this.backgroundColor);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.body, flags);
    }
}
