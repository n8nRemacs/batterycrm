package com.avito.android.mortgage.api.model.items.application;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationAppealsItemValue.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatField;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatFieldValue;", "fieldValue", "<init>", "(Ljava/lang/String;Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatFieldValue;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatFieldValue;", "getFieldValue", "()Lcom/avito/android/mortgage/api/model/items/application/ApplicationAppealCreditInfoFloatFieldValue;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ApplicationAppealCreditInfoFloatField implements Parcelable {

    @k
    public static final Parcelable.Creator<ApplicationAppealCreditInfoFloatField> CREATOR = new a();

    @c("value")
    @k
    private final ApplicationAppealCreditInfoFloatFieldValue fieldValue;

    @c("title")
    @k
    private final String title;

    /* compiled from: ApplicationAppealsItemValue.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ApplicationAppealCreditInfoFloatField> {
        @Override // android.os.Parcelable.Creator
        public final ApplicationAppealCreditInfoFloatField createFromParcel(Parcel parcel) {
            return new ApplicationAppealCreditInfoFloatField(parcel.readString(), ApplicationAppealCreditInfoFloatFieldValue.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ApplicationAppealCreditInfoFloatField[] newArray(int i12) {
            return new ApplicationAppealCreditInfoFloatField[i12];
        }
    }

    public ApplicationAppealCreditInfoFloatField(@k String str, @k ApplicationAppealCreditInfoFloatFieldValue applicationAppealCreditInfoFloatFieldValue) {
        this.title = str;
        this.fieldValue = applicationAppealCreditInfoFloatFieldValue;
    }

    public final float c() {
        return this.fieldValue.getValue();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationAppealCreditInfoFloatField)) {
            return false;
        }
        ApplicationAppealCreditInfoFloatField applicationAppealCreditInfoFloatField = (ApplicationAppealCreditInfoFloatField) obj;
        return L.f(this.title, applicationAppealCreditInfoFloatField.title) && L.f(this.fieldValue, applicationAppealCreditInfoFloatField.fieldValue);
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getValue() {
        return this.fieldValue.getStringValue();
    }

    public final int hashCode() {
        return this.fieldValue.hashCode() + (this.title.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "ApplicationAppealCreditInfoFloatField(title=" + this.title + ", fieldValue=" + this.fieldValue + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        this.fieldValue.writeToParcel(parcel, i12);
    }
}
