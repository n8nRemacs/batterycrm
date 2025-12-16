package com.avito.android.campaigns_sale.network.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.UniversalColor;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BonusInfo.kt */
@d
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/campaigns_sale/network/remote/model/BonusText;", "Landroid/os/Parcelable;", "", "text", "", "hasIcon", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;ZLcom/avito/android/remote/model/UniversalColor;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Z", "d", "()Z", "Lcom/avito/android/remote/model/UniversalColor;", "c", "()Lcom/avito/android/remote/model/UniversalColor;", "_avito-discouraged_avito-network_campaigns-sale"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BonusText implements Parcelable {

    @k
    public static final Parcelable.Creator<BonusText> CREATOR = new a();

    @c("color")
    @k
    private final UniversalColor color;

    @c("hasIcon")
    private final boolean hasIcon;

    @c("text")
    @k
    private final String text;

    /* compiled from: BonusInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BonusText> {
        @Override // android.os.Parcelable.Creator
        public final BonusText createFromParcel(Parcel parcel) {
            return new BonusText(parcel.readString(), parcel.readInt() != 0, (UniversalColor) parcel.readParcelable(BonusText.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BonusText[] newArray(int i12) {
            return new BonusText[i12];
        }
    }

    public BonusText(@k String str, boolean z12, @k UniversalColor universalColor) {
        this.text = str;
        this.hasIcon = z12;
        this.color = universalColor;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getHasIcon() {
        return this.hasIcon;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BonusText)) {
            return false;
        }
        BonusText bonusText = (BonusText) obj;
        return L.f(this.text, bonusText.text) && this.hasIcon == bonusText.hasIcon && L.f(this.color, bonusText.color);
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return this.color.hashCode() + r.i(this.text.hashCode() * 31, 31, this.hasIcon);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BonusText(text=");
        sb2.append(this.text);
        sb2.append(", hasIcon=");
        sb2.append(this.hasIcon);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeInt(this.hasIcon ? 1 : 0);
        parcel.writeParcelable(this.color, i12);
    }
}
