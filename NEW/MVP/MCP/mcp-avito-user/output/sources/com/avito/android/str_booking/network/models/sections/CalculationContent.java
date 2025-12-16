package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationSection.kt */
@d
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/CalculationContent;", "Landroid/os/Parcelable;", "", "header", "", "Lcom/avito/android/str_booking/network/models/sections/CalculationContentItem;", "items", "Lcom/avito/android/str_booking/network/models/sections/AdditionalInfo;", "additionalInfo", "Lcom/avito/android/str_booking/network/models/sections/TermsInfo;", "terms", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/avito/android/str_booking/network/models/sections/AdditionalInfo;Lcom/avito/android/str_booking/network/models/sections/TermsInfo;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/avito/android/str_booking/network/models/sections/AdditionalInfo;", "c", "()Lcom/avito/android/str_booking/network/models/sections/AdditionalInfo;", "Lcom/avito/android/str_booking/network/models/sections/TermsInfo;", "e", "()Lcom/avito/android/str_booking/network/models/sections/TermsInfo;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CalculationContent implements Parcelable {

    @k
    public static final Parcelable.Creator<CalculationContent> CREATOR = new a();

    @c("additionalInfo")
    @l
    private final AdditionalInfo additionalInfo;

    @c("header")
    @l
    private final String header;

    @c("items")
    @l
    private final List<CalculationContentItem> items;

    @c("terms")
    @l
    private final TermsInfo terms;

    /* compiled from: CalculationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CalculationContent> {
        @Override // android.os.Parcelable.Creator
        public final CalculationContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(CalculationContentItem.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new CalculationContent(string, arrayList, parcel.readInt() == 0 ? null : AdditionalInfo.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? TermsInfo.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CalculationContent[] newArray(int i12) {
            return new CalculationContent[i12];
        }
    }

    public CalculationContent(@l String str, @l List<CalculationContentItem> list, @l AdditionalInfo additionalInfo, @l TermsInfo termsInfo) {
        this.header = str;
        this.items = list;
        this.additionalInfo = additionalInfo;
        this.terms = termsInfo;
    }

    public static CalculationContent a(CalculationContent calculationContent, ArrayList arrayList) {
        return new CalculationContent(calculationContent.header, arrayList, calculationContent.additionalInfo, calculationContent.terms);
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AdditionalInfo getAdditionalInfo() {
        return this.additionalInfo;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final TermsInfo getTerms() {
        return this.terms;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculationContent)) {
            return false;
        }
        CalculationContent calculationContent = (CalculationContent) obj;
        return L.f(this.header, calculationContent.header) && L.f(this.items, calculationContent.items) && L.f(this.additionalInfo, calculationContent.additionalInfo) && L.f(this.terms, calculationContent.terms);
    }

    @l
    public final List<CalculationContentItem> getItems() {
        return this.items;
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CalculationContentItem> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        AdditionalInfo additionalInfo = this.additionalInfo;
        int iHashCode3 = (iHashCode2 + (additionalInfo == null ? 0 : additionalInfo.hashCode())) * 31;
        TermsInfo termsInfo = this.terms;
        return iHashCode3 + (termsInfo != null ? termsInfo.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CalculationContent(header=" + this.header + ", items=" + this.items + ", additionalInfo=" + this.additionalInfo + ", terms=" + this.terms + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.header);
        List<CalculationContentItem> list = this.items;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((CalculationContentItem) itA.next()).writeToParcel(parcel, i12);
            }
        }
        AdditionalInfo additionalInfo = this.additionalInfo;
        if (additionalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalInfo.writeToParcel(parcel, i12);
        }
        TermsInfo termsInfo = this.terms;
        if (termsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            termsInfo.writeToParcel(parcel, i12);
        }
    }
}
