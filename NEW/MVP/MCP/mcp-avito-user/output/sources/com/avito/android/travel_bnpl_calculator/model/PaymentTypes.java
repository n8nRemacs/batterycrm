package com.avito.android.travel_bnpl_calculator.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentTypes.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/travel_bnpl_calculator/model/PaymentTypes;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "", "Lcom/avito/android/travel_bnpl_calculator/model/PaymentMethod;", "methods", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito_travel-bnpl-calculator_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PaymentTypes implements Parcelable {

    @k
    public static final Parcelable.Creator<PaymentTypes> CREATOR = new a();

    @c("methods")
    @k
    private final List<PaymentMethod> methods;

    @c("title")
    @k
    private final AttributedText title;

    /* compiled from: PaymentTypes.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentTypes> {
        @Override // android.os.Parcelable.Creator
        public final PaymentTypes createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(PaymentTypes.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(PaymentMethod.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new PaymentTypes(attributedText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentTypes[] newArray(int i12) {
            return new PaymentTypes[i12];
        }
    }

    public PaymentTypes(@k AttributedText attributedText, @k List<PaymentMethod> list) {
        this.title = attributedText;
        this.methods = list;
    }

    @k
    public final List<PaymentMethod> c() {
        return this.methods;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentTypes)) {
            return false;
        }
        PaymentTypes paymentTypes = (PaymentTypes) obj;
        return L.f(this.title, paymentTypes.title) && L.f(this.methods, paymentTypes.methods);
    }

    public final int hashCode() {
        return this.methods.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PaymentTypes(title=");
        sb2.append(this.title);
        sb2.append(", methods=");
        return H.p(sb2, this.methods, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        Iterator itJ = C0.j(this.methods, parcel);
        while (itJ.hasNext()) {
            ((PaymentMethod) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
