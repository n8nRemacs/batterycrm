package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.actions_sheet.a;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingPromoCodeInfo.kt */
@d
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0013J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J`\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b%\u0010 J \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b\t\u0010\u0019R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u0013R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u00104R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8F¢\u0006\u0006\u001a\u0004\b5\u0010\u0011¨\u00067"}, d2 = {"Lcom/avito/android/remote/model/PromoCode;", "Landroid/os/Parcelable;", "", "percent", "text", "Lcom/avito/android/remote/model/UniversalImage;", "image", "code", "", "isSelected", "toastText", "", "Lcom/avito/android/remote/model/StrBookingCalculation;", "_calculations", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)V", "component7", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/UniversalImage;", "component4", "component5", "()Z", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/PromoCode;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPercent", "getText", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "getCode", "Z", "getToastText", "Ljava/util/List;", "getCalculations", "calculations", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoCode implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoCode> CREATOR = new Creator();

    @c("calculations")
    @l
    private final List<StrBookingCalculation> _calculations;

    @c("code")
    @k
    private final String code;

    @c("image")
    @l
    private final UniversalImage image;

    @c("isSelected")
    private final boolean isSelected;

    @c("percent")
    @k
    private final String percent;

    @c("text")
    @k
    private final String text;

    @c("toastText")
    @k
    private final String toastText;

    /* compiled from: StrBookingPromoCodeInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoCode> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoCode createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(PromoCode.class.getClassLoader());
            String string3 = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                while (iC2 != i12) {
                    iC2 = a.c(StrBookingCalculation.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new PromoCode(string, string2, universalImage, string3, z12, string4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoCode[] newArray(int i12) {
            return new PromoCode[i12];
        }
    }

    public PromoCode(@k String str, @k String str2, @l UniversalImage universalImage, @k String str3, boolean z12, @k String str4, @l List<StrBookingCalculation> list) {
        this.percent = str;
        this.text = str2;
        this.image = universalImage;
        this.code = str3;
        this.isSelected = z12;
        this.toastText = str4;
        this._calculations = list;
    }

    private final List<StrBookingCalculation> component7() {
        return this._calculations;
    }

    public static /* synthetic */ PromoCode copy$default(PromoCode promoCode, String str, String str2, UniversalImage universalImage, String str3, boolean z12, String str4, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = promoCode.percent;
        }
        if ((i12 & 2) != 0) {
            str2 = promoCode.text;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            universalImage = promoCode.image;
        }
        UniversalImage universalImage2 = universalImage;
        if ((i12 & 8) != 0) {
            str3 = promoCode.code;
        }
        String str6 = str3;
        if ((i12 & 16) != 0) {
            z12 = promoCode.isSelected;
        }
        boolean z13 = z12;
        if ((i12 & 32) != 0) {
            str4 = promoCode.toastText;
        }
        String str7 = str4;
        if ((i12 & 64) != 0) {
            list = promoCode._calculations;
        }
        return promoCode.copy(str, str5, universalImage2, str6, z13, str7, list);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getPercent() {
        return this.percent;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getToastText() {
        return this.toastText;
    }

    @k
    public final PromoCode copy(@k String percent, @k String text, @l UniversalImage image, @k String code, boolean isSelected, @k String toastText, @l List<StrBookingCalculation> _calculations) {
        return new PromoCode(percent, text, image, code, isSelected, toastText, _calculations);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCode)) {
            return false;
        }
        PromoCode promoCode = (PromoCode) other;
        return L.f(this.percent, promoCode.percent) && L.f(this.text, promoCode.text) && L.f(this.image, promoCode.image) && L.f(this.code, promoCode.code) && this.isSelected == promoCode.isSelected && L.f(this.toastText, promoCode.toastText) && L.f(this._calculations, promoCode._calculations);
    }

    @k
    public final List<StrBookingCalculation> getCalculations() {
        List<StrBookingCalculation> list = this._calculations;
        return list == null ? C42784z0.f406748b : list;
    }

    @k
    public final String getCode() {
        return this.code;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    @k
    public final String getPercent() {
        return this.percent;
    }

    @k
    public final String getText() {
        return this.text;
    }

    @k
    public final String getToastText() {
        return this.toastText;
    }

    public int hashCode() {
        int iD2 = H.d(this.percent.hashCode() * 31, 31, this.text);
        UniversalImage universalImage = this.image;
        int iD3 = H.d(r.i(H.d((iD2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.code), 31, this.isSelected), 31, this.toastText);
        List<StrBookingCalculation> list = this._calculations;
        return iD3 + (list != null ? list.hashCode() : 0);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PromoCode(percent=");
        sb2.append(this.percent);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", image=");
        sb2.append(this.image);
        sb2.append(", code=");
        sb2.append(this.code);
        sb2.append(", isSelected=");
        sb2.append(this.isSelected);
        sb2.append(", toastText=");
        sb2.append(this.toastText);
        sb2.append(", _calculations=");
        return H.p(sb2, this._calculations, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.percent);
        parcel.writeString(this.text);
        parcel.writeParcelable(this.image, flags);
        parcel.writeString(this.code);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.toastText);
        List<StrBookingCalculation> list = this._calculations;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((StrBookingCalculation) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
