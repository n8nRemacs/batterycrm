package com.avito.android.mortgage.api.model.items.application;

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

/* compiled from: ApplicationAppealsItemValue.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatFieldValue;", "Landroid/os/Parcelable;", "", "stringValue", "", "value", "<init>", "(Ljava/lang/String;F)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "F", "d", "()F", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationAppealCreditInfoFloatFieldValue implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationAppealCreditInfoFloatFieldValue> CREATOR = new a();

    @c("stringValue")
    @k
    private final String stringValue;

    @c("value")
    private final float value;

    /* compiled from: ApplicationAppealsItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationAppealCreditInfoFloatFieldValue> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationAppealCreditInfoFloatFieldValue createFromParcel(Parcel parcel) {
            return new ApplicationAppealCreditInfoFloatFieldValue(parcel.readString(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationAppealCreditInfoFloatFieldValue[] newArray(int i12) {
            return new ApplicationAppealCreditInfoFloatFieldValue[i12];
        }
    }

    public ApplicationAppealCreditInfoFloatFieldValue(@k String str, float f12) {
        this.stringValue = str;
        this.value = f12;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getStringValue() {
        return this.stringValue;
    }

    /* renamed from: d, reason: from getter */
    public final float getValue() {
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
        if (!(obj instanceof ApplicationAppealCreditInfoFloatFieldValue)) {
            return false;
        }
        ApplicationAppealCreditInfoFloatFieldValue applicationAppealCreditInfoFloatFieldValue = (ApplicationAppealCreditInfoFloatFieldValue) obj;
        return L.f(this.stringValue, applicationAppealCreditInfoFloatFieldValue.stringValue) && Float.compare(this.value, applicationAppealCreditInfoFloatFieldValue.value) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.value) + (this.stringValue.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationAppealCreditInfoFloatFieldValue(stringValue=");
        sb2.append(this.stringValue);
        sb2.append(", value=");
        return r.k(')', this.value, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.stringValue);
        parcel.writeFloat(this.value);
    }
}
