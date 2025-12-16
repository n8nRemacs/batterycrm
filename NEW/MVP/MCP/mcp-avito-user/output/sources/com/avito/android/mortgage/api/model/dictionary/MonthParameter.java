package com.avito.android.mortgage.api.model.dictionary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MonthParameter.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/mortgage/api/model/dictionary/MonthParameter;", "Lcom/avito/android/mortgage/api/model/dictionary/Parameter;", "", "label", "value", "", "months", "<init>", "(Ljava/lang/String;Ljava/lang/String;F)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getValue", "F", "getMonths", "()F", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MonthParameter implements Parameter {

    @k
    public static final Parcelable.Creator<MonthParameter> CREATOR = new a();

    @c("label")
    @k
    private final String label;

    @c("months")
    private final float months;

    @c("value")
    @k
    private final String value;

    /* compiled from: MonthParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MonthParameter> {
        @Override // android.os.Parcelable.Creator
        public final MonthParameter createFromParcel(Parcel parcel) {
            return new MonthParameter(parcel.readString(), parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final MonthParameter[] newArray(int i12) {
            return new MonthParameter[i12];
        }
    }

    public MonthParameter(@k String str, @k String str2, float f12) {
        this.label = str;
        this.value = str2;
        this.months = f12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MonthParameter)) {
            return false;
        }
        MonthParameter monthParameter = (MonthParameter) obj;
        return L.f(this.label, monthParameter.label) && L.f(this.value, monthParameter.value) && Float.compare(this.months, monthParameter.months) == 0;
    }

    @Override // com.avito.android.mortgage.api.model.dictionary.Parameter
    @k
    public final String getLabel() {
        return this.label;
    }

    @Override // com.avito.android.mortgage.api.model.dictionary.Parameter
    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return Float.hashCode(this.months) + H.d(this.label.hashCode() * 31, 31, this.value);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MonthParameter(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", months=");
        return r.k(')', this.months, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeString(this.value);
        parcel.writeFloat(this.months);
    }
}
