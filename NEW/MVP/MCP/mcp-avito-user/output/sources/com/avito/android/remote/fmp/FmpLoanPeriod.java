package com.avito.android.remote.fmp;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.lib.design.chips.e;
import com.avito.android.lib.design.chips.g;
import com.avito.android.lib.design.chips.h;
import com.google.gson.annotations.c;
import j.InterfaceC42156l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FmpLoanPeriod.kt */
@d
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/fmp/FmpLoanPeriod;", "Lcom/avito/android/lib/design/chips/h;", "Landroid/os/Parcelable;", "", "chipTitle", "", "value", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Ljava/lang/Boolean;", "e", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FmpLoanPeriod implements h, Parcelable {

    @k
    public static final Parcelable.Creator<FmpLoanPeriod> CREATOR = new a();

    @c("title")
    @k
    private final String chipTitle;

    @c("isSelected")
    @l
    private final Boolean isSelected;

    @c("value")
    @l
    private final Integer value;

    /* compiled from: FmpLoanPeriod.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FmpLoanPeriod> {
        @Override // android.os.Parcelable.Creator
        public final FmpLoanPeriod createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Boolean boolValueOf = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new FmpLoanPeriod(string, numValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final FmpLoanPeriod[] newArray(int i12) {
            return new FmpLoanPeriod[i12];
        }
    }

    public FmpLoanPeriod(@k String str, @l Integer num, @l Boolean bool) {
        this.chipTitle = str;
        this.value = num;
        this.isSelected = bool;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean A1() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final Y41.l<Boolean, G0> L() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean P1() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final g Q1() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    public final boolean V1(@k Object obj) {
        if (obj instanceof FmpLoanPeriod) {
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: W */
    public final CharSequence getF199741b() {
        return this.chipTitle;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getChipTitle() {
        return this.chipTitle;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Boolean getIsSelected() {
        return this.isSelected;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e e2() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FmpLoanPeriod)) {
            return false;
        }
        FmpLoanPeriod fmpLoanPeriod = (FmpLoanPeriod) obj;
        return L.f(this.chipTitle, fmpLoanPeriod.chipTitle) && L.f(this.value, fmpLoanPeriod.value) && L.f(this.isSelected, fmpLoanPeriod.isSelected);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: g0 */
    public final boolean getF281694e() {
        return false;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    @InterfaceC42156l
    /* renamed from: getIconColor */
    public final Integer getF178767g() {
        return null;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e getImage() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.chipTitle.hashCode() * 31;
        Integer num = this.value;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isSelected;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isActive */
    public final boolean getF178770j() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    /* renamed from: isEnabled */
    public final boolean getF281693d() {
        return true;
    }

    @Override // com.avito.android.lib.design.chips.h
    @l
    public final e q1() {
        return null;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FmpLoanPeriod(chipTitle=");
        sb2.append(this.chipTitle);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", isSelected=");
        return C0.g(sb2, this.isSelected, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.chipTitle);
        Integer num = this.value;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Boolean bool = this.isSelected;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ FmpLoanPeriod(String str, Integer num, Boolean bool, int i12, C42822w c42822w) {
        this(str, num, (i12 & 4) != 0 ? Boolean.FALSE : bool);
    }
}
