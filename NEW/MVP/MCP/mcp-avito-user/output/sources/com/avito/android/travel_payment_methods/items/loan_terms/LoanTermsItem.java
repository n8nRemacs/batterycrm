package com.avito.android.travel_payment_methods.items.loan_terms;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.travel_payment_methods.model.LoanTerm;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LoanTermsItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_payment_methods/items/loan_terms/LoanTermsItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_travel-payment-methods_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LoanTermsItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<LoanTermsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f302493b;

    /* renamed from: c, reason: collision with root package name */
    public final long f302494c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<LoanTerm> f302495d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f302496e;

    /* compiled from: LoanTermsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LoanTermsItem> {
        @Override // android.os.Parcelable.Creator
        public final LoanTermsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            long j12 = parcel.readLong();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(LoanTerm.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new LoanTermsItem(j12, string, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final LoanTermsItem[] newArray(int i12) {
            return new LoanTermsItem[i12];
        }
    }

    public LoanTermsItem(long j12, @Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        this.f302493b = str;
        this.f302494c = j12;
        this.f302495d = list;
        this.f302496e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoanTermsItem)) {
            return false;
        }
        LoanTermsItem loanTermsItem = (LoanTermsItem) obj;
        return L.f(this.f302493b, loanTermsItem.f302493b) && this.f302494c == loanTermsItem.f302494c && L.f(this.f302495d, loanTermsItem.f302495d) && L.f(this.f302496e, loanTermsItem.f302496e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF121506b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF158353b() {
        return this.f302493b;
    }

    public final int hashCode() {
        int iE2 = H.e(androidx.appcompat.app.r.g(this.f302493b.hashCode() * 31, 31, this.f302494c), 31, this.f302495d);
        String str = this.f302496e;
        return iE2 + (str == null ? 0 : str.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoanTermsItem(stringId=");
        sb2.append(this.f302493b);
        sb2.append(", default=");
        sb2.append(this.f302494c);
        sb2.append(", terms=");
        sb2.append(this.f302495d);
        sb2.append(", paymentType=");
        return C22026a.c(sb2, this.f302496e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f302493b);
        parcel.writeLong(this.f302494c);
        Iterator itJ = C0.j(this.f302495d, parcel);
        while (itJ.hasNext()) {
            ((LoanTerm) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f302496e);
    }

    public /* synthetic */ LoanTermsItem(String str, long j12, List list, String str2, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 8) != 0 ? null : str2, list);
    }
}
