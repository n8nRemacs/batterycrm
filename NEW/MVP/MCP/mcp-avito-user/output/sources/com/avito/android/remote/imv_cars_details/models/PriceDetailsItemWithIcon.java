package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u0010\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/PriceDetailsItemWithIcon;", "Landroid/os/Parcelable;", "", "text", "Lcom/avito/android/remote/imv_cars_details/models/PriceDetailsIcon;", "icon", "toolTipTitle", "toolTipText", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/imv_cars_details/models/PriceDetailsIcon;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Lcom/avito/android/remote/imv_cars_details/models/PriceDetailsIcon;", "c", "()Lcom/avito/android/remote/imv_cars_details/models/PriceDetailsIcon;", "e", "d", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceDetailsItemWithIcon implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceDetailsItemWithIcon> CREATOR = new a();

    @c("icon")
    @l
    private final PriceDetailsIcon icon;

    @c("text")
    @k
    private final String text;

    @c("toolTipText")
    @l
    private final String toolTipText;

    @c("toolTipTitle")
    @l
    private final String toolTipTitle;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceDetailsItemWithIcon> {
        @Override // android.os.Parcelable.Creator
        public final PriceDetailsItemWithIcon createFromParcel(Parcel parcel) {
            return new PriceDetailsItemWithIcon(parcel.readString(), parcel.readInt() == 0 ? null : PriceDetailsIcon.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceDetailsItemWithIcon[] newArray(int i12) {
            return new PriceDetailsItemWithIcon[i12];
        }
    }

    public PriceDetailsItemWithIcon(@k String str, @l PriceDetailsIcon priceDetailsIcon, @l String str2, @l String str3) {
        this.text = str;
        this.icon = priceDetailsIcon;
        this.toolTipTitle = str2;
        this.toolTipText = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final PriceDetailsIcon getIcon() {
        return this.icon;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getToolTipText() {
        return this.toolTipText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final String getToolTipTitle() {
        return this.toolTipTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDetailsItemWithIcon)) {
            return false;
        }
        PriceDetailsItemWithIcon priceDetailsItemWithIcon = (PriceDetailsItemWithIcon) obj;
        return L.f(this.text, priceDetailsItemWithIcon.text) && L.f(this.icon, priceDetailsItemWithIcon.icon) && L.f(this.toolTipTitle, priceDetailsItemWithIcon.toolTipTitle) && L.f(this.toolTipText, priceDetailsItemWithIcon.toolTipText);
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        PriceDetailsIcon priceDetailsIcon = this.icon;
        int iHashCode2 = (iHashCode + (priceDetailsIcon == null ? 0 : priceDetailsIcon.hashCode())) * 31;
        String str = this.toolTipTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toolTipText;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceDetailsItemWithIcon(text=");
        sb2.append(this.text);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", toolTipTitle=");
        sb2.append(this.toolTipTitle);
        sb2.append(", toolTipText=");
        return C22026a.c(sb2, this.toolTipText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        PriceDetailsIcon priceDetailsIcon = this.icon;
        if (priceDetailsIcon == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceDetailsIcon.writeToParcel(parcel, i12);
        }
        parcel.writeString(this.toolTipTitle);
        parcel.writeString(this.toolTipText);
    }
}
