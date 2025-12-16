package com.avito.android.short_term_rent.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/PromoCode;", "Landroid/os/Parcelable;", "", "code", "", "isSelected", "percent", "text", "toastText", "Lcom/avito/android/remote/model/UniversalImage;", "image", "_isEnabled", "disabledMessage", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/Boolean;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Z", "()Z", "e", "getText", "f", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Ljava/lang/Boolean;", "d", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromoCode implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoCode> CREATOR = new a();

    @com.google.gson.annotations.c("isEnabled")
    @l
    private final Boolean _isEnabled;

    @com.google.gson.annotations.c("code")
    @k
    private final String code;

    @com.google.gson.annotations.c("disabledMessage")
    @l
    private final String disabledMessage;

    @com.google.gson.annotations.c("image")
    @l
    private final UniversalImage image;

    @com.google.gson.annotations.c("isSelected")
    private final boolean isSelected;

    @com.google.gson.annotations.c("percent")
    @k
    private final String percent;

    @com.google.gson.annotations.c("text")
    @l
    private final String text;

    @com.google.gson.annotations.c("toastText")
    @l
    private final String toastText;

    /* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromoCode> {
        @Override // android.os.Parcelable.Creator
        public final PromoCode createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(PromoCode.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PromoCode(string, z12, string2, string3, string4, universalImage, boolValueOf, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PromoCode[] newArray(int i12) {
            return new PromoCode[i12];
        }
    }

    public PromoCode(@k String str, boolean z12, @k String str2, @l String str3, @l String str4, @l UniversalImage universalImage, @l Boolean bool, @l String str5) {
        this.code = str;
        this.isSelected = z12;
        this.percent = str2;
        this.text = str3;
        this.toastText = str4;
        this.image = universalImage;
        this._isEnabled = bool;
        this.disabledMessage = str5;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getDisabledMessage() {
        return this.disabledMessage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getPercent() {
        return this.percent;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCode)) {
            return false;
        }
        PromoCode promoCode = (PromoCode) obj;
        return L.f(this.code, promoCode.code) && this.isSelected == promoCode.isSelected && L.f(this.percent, promoCode.percent) && L.f(this.text, promoCode.text) && L.f(this.toastText, promoCode.toastText) && L.f(this.image, promoCode.image) && L.f(this._isEnabled, promoCode._isEnabled) && L.f(this.disabledMessage, promoCode.disabledMessage);
    }

    @l
    /* renamed from: f, reason: from getter */
    public final String getToastText() {
        return this.toastText;
    }

    public final boolean g() {
        Boolean bool = this._isEnabled;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        int iD2 = H.d(r.i(this.code.hashCode() * 31, 31, this.isSelected), 31, this.percent);
        String str = this.text;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.toastText;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.image;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Boolean bool = this._isEnabled;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.disabledMessage;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromoCode(code=");
        sb2.append(this.code);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", percent=");
        sb2.append(this.percent);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", toastText=");
        sb2.append(this.toastText);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", _isEnabled=");
        sb2.append(this._isEnabled);
        sb2.append(", disabledMessage=");
        return C22026a.c(sb2, this.disabledMessage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.code);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.percent);
        parcel.writeString(this.text);
        parcel.writeString(this.toastText);
        parcel.writeParcelable(this.image, i12);
        Boolean bool = this._isEnabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.disabledMessage);
    }
}
