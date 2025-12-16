package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertSellerInfo.kt */
@d
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010\u000f¨\u0006("}, d2 = {"Lcom/avito/android/remote/model/SellerInfoAdvantage;", "Landroid/os/Parcelable;", "", "type", "icon", "text", "Lcom/avito/android/remote/model/UniversalColor;", "color", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/avito/android/remote/model/UniversalColor;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;)Lcom/avito/android/remote/model/SellerInfoAdvantage;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "getIcon", "getText", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SellerInfoAdvantage implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerInfoAdvantage> CREATOR = new Creator();

    @k
    private final UniversalColor color;

    @k
    private final String icon;

    @k
    private final String text;

    @k
    private final String type;

    /* compiled from: AdvertSellerInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SellerInfoAdvantage> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerInfoAdvantage createFromParcel(@k Parcel parcel) {
            return new SellerInfoAdvantage(parcel.readString(), parcel.readString(), parcel.readString(), (UniversalColor) parcel.readParcelable(SellerInfoAdvantage.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SellerInfoAdvantage[] newArray(int i12) {
            return new SellerInfoAdvantage[i12];
        }
    }

    public SellerInfoAdvantage(@k String str, @k String str2, @k String str3, @k UniversalColor universalColor) {
        this.type = str;
        this.icon = str2;
        this.text = str3;
        this.color = universalColor;
    }

    public static /* synthetic */ SellerInfoAdvantage copy$default(SellerInfoAdvantage sellerInfoAdvantage, String str, String str2, String str3, UniversalColor universalColor, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = sellerInfoAdvantage.type;
        }
        if ((i12 & 2) != 0) {
            str2 = sellerInfoAdvantage.icon;
        }
        if ((i12 & 4) != 0) {
            str3 = sellerInfoAdvantage.text;
        }
        if ((i12 & 8) != 0) {
            universalColor = sellerInfoAdvantage.color;
        }
        return sellerInfoAdvantage.copy(str, str2, str3, universalColor);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final SellerInfoAdvantage copy(@k String type, @k String icon, @k String text, @k UniversalColor color) {
        return new SellerInfoAdvantage(type, icon, text, color);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerInfoAdvantage)) {
            return false;
        }
        SellerInfoAdvantage sellerInfoAdvantage = (SellerInfoAdvantage) other;
        return L.f(this.type, sellerInfoAdvantage.type) && L.f(this.icon, sellerInfoAdvantage.icon) && L.f(this.text, sellerInfoAdvantage.text) && L.f(this.color, sellerInfoAdvantage.color);
    }

    @k
    public final UniversalColor getColor() {
        return this.color;
    }

    @k
    public final String getIcon() {
        return this.icon;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.color.hashCode() + H.d(H.d(this.type.hashCode() * 31, 31, this.icon), 31, this.text);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SellerInfoAdvantage(type=");
        sb2.append(this.type);
        sb2.append(", icon=");
        sb2.append(this.icon);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", color=");
        return com.avito.android.advert.item.delivery_suggests.l.r(sb2, this.color, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        parcel.writeString(this.icon);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.color, flags);
    }
}
