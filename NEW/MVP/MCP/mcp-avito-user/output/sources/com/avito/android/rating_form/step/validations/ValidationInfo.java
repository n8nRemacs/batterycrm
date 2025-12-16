package com.avito.android.rating_form.step.validations;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.rating_form.FieldIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ValidationUtil.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/step/validations/ValidationInfo;", "Landroid/os/Parcelable;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ValidationInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ValidationInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f249739b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f249740c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<FieldIdentifier> f249741d;

    /* compiled from: ValidationUtil.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ValidationInfo> {
        @Override // android.os.Parcelable.Creator
        public final ValidationInfo createFromParcel(Parcel parcel) {
            PrintableText printableText = (PrintableText) parcel.readParcelable(ValidationInfo.class.getClassLoader());
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(FieldIdentifier.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ValidationInfo(printableText, arrayList, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final ValidationInfo[] newArray(int i12) {
            return new ValidationInfo[i12];
        }
    }

    public ValidationInfo(@Y61.k PrintableText printableText, @Y61.k List list, boolean z12) {
        this.f249739b = printableText;
        this.f249740c = z12;
        this.f249741d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ValidationInfo)) {
            return false;
        }
        ValidationInfo validationInfo = (ValidationInfo) obj;
        return L.f(this.f249739b, validationInfo.f249739b) && this.f249740c == validationInfo.f249740c && L.f(this.f249741d, validationInfo.f249741d);
    }

    public final int hashCode() {
        return this.f249741d.hashCode() + androidx.appcompat.app.r.i(this.f249739b.hashCode() * 31, 31, this.f249740c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ValidationInfo(errorMessage=");
        sb2.append(this.f249739b);
        sb2.append(", showAsToast=");
        sb2.append(this.f249740c);
        sb2.append(", dependentFieldsIdentifiers=");
        return H.p(sb2, this.f249741d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f249739b, i12);
        parcel.writeInt(this.f249740c ? 1 : 0);
        Iterator itJ = C0.j(this.f249741d, parcel);
        while (itJ.hasNext()) {
            ((FieldIdentifier) itJ.next()).writeToParcel(parcel, i12);
        }
    }

    public ValidationInfo(PrintableText printableText, boolean z12, List list, int i12, C42822w c42822w) {
        this(printableText, (i12 & 4) != 0 ? C42784z0.f406748b : list, (i12 & 2) != 0 ? false : z12);
    }
}
