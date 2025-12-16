package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJF\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000eJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u000eR\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b(\u0010\f¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/PromoCodesDialog;", "Landroid/os/Parcelable;", "", "title", "inputPlaceholder", "buttonText", "", "Lcom/avito/android/remote/model/PromoCode;", "_promoCodes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component4", "()Ljava/util/List;", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/avito/android/remote/model/PromoCodesDialog;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getInputPlaceholder", "getButtonText", "Ljava/util/List;", "getPromoCodes", "promoCodes", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PromoCodesDialog implements Parcelable {

    @k
    public static final Parcelable.Creator<PromoCodesDialog> CREATOR = new Creator();

    @c("promoCodes")
    @l
    private final List<PromoCode> _promoCodes;

    @c("buttonText")
    @l
    private final String buttonText;

    @c("inputPlaceholder")
    @l
    private final String inputPlaceholder;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrBookingPromoCodeInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromoCodesDialog> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoCodesDialog createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(PromoCode.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new PromoCodesDialog(string, string2, string3, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PromoCodesDialog[] newArray(int i12) {
            return new PromoCodesDialog[i12];
        }
    }

    public PromoCodesDialog(@l String str, @l String str2, @l String str3, @l List<PromoCode> list) {
        this.title = str;
        this.inputPlaceholder = str2;
        this.buttonText = str3;
        this._promoCodes = list;
    }

    private final List<PromoCode> component4() {
        return this._promoCodes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoCodesDialog copy$default(PromoCodesDialog promoCodesDialog, String str, String str2, String str3, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = promoCodesDialog.title;
        }
        if ((i12 & 2) != 0) {
            str2 = promoCodesDialog.inputPlaceholder;
        }
        if ((i12 & 4) != 0) {
            str3 = promoCodesDialog.buttonText;
        }
        if ((i12 & 8) != 0) {
            list = promoCodesDialog._promoCodes;
        }
        return promoCodesDialog.copy(str, str2, str3, list);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    public final PromoCodesDialog copy(@l String title, @l String inputPlaceholder, @l String buttonText, @l List<PromoCode> _promoCodes) {
        return new PromoCodesDialog(title, inputPlaceholder, buttonText, _promoCodes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCodesDialog)) {
            return false;
        }
        PromoCodesDialog promoCodesDialog = (PromoCodesDialog) other;
        return L.f(this.title, promoCodesDialog.title) && L.f(this.inputPlaceholder, promoCodesDialog.inputPlaceholder) && L.f(this.buttonText, promoCodesDialog.buttonText) && L.f(this._promoCodes, promoCodesDialog._promoCodes);
    }

    @l
    public final String getButtonText() {
        return this.buttonText;
    }

    @l
    public final String getInputPlaceholder() {
        return this.inputPlaceholder;
    }

    @k
    public final List<PromoCode> getPromoCodes() {
        List<PromoCode> list = this._promoCodes;
        return list == null ? C42784z0.f406748b : list;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.inputPlaceholder;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PromoCode> list = this._promoCodes;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("PromoCodesDialog(title=");
        sb2.append(this.title);
        sb2.append(", inputPlaceholder=");
        sb2.append(this.inputPlaceholder);
        sb2.append(", buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", _promoCodes=");
        return H.p(sb2, this._promoCodes, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.inputPlaceholder);
        parcel.writeString(this.buttonText);
        List<PromoCode> list = this._promoCodes;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((PromoCode) itA.next()).writeToParcel(parcel, flags);
        }
    }
}
