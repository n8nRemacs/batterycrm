package com.avito.android.mortgage.api.model.landing.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationInputItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/api/model/landing/items/LabelValueParameter;", "Landroid/os/Parcelable;", "", "label", "", "value", "<init>", "(Ljava/lang/String;I)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "I", "c", "()I", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class LabelValueParameter implements Parcelable {

    @k
    public static final Parcelable.Creator<LabelValueParameter> CREATOR = new a();

    @c("label")
    @k
    private final String label;

    @c("value")
    private final int value;

    /* compiled from: CalculationInputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LabelValueParameter> {
        @Override // android.os.Parcelable.Creator
        public final LabelValueParameter createFromParcel(Parcel parcel) {
            return new LabelValueParameter(parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LabelValueParameter[] newArray(int i12) {
            return new LabelValueParameter[i12];
        }
    }

    public LabelValueParameter(@k String str, int i12) {
        this.label = str;
        this.value = i12;
    }

    /* renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LabelValueParameter)) {
            return false;
        }
        LabelValueParameter labelValueParameter = (LabelValueParameter) obj;
        return L.f(this.label, labelValueParameter.label) && this.value == labelValueParameter.value;
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    public final int hashCode() {
        return Integer.hashCode(this.value) + (this.label.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LabelValueParameter(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        return r.t(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeInt(this.value);
    }
}
