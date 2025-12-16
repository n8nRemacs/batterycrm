package com.avito.android.sx_address.new_address.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.date_time_picker.TimePickerDialog;
import kotlin.Metadata;

/* compiled from: TimePickerBuilder.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/new_address/view/Validation;", "Lcom/avito/android/date_time_picker/TimePickerDialog$ValidationRule;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class Validation implements TimePickerDialog.ValidationRule {

    @Y61.k
    public static final Parcelable.Creator<Validation> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final org.threeten.bp.f f293875b;

    /* compiled from: TimePickerBuilder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Validation> {
        @Override // android.os.Parcelable.Creator
        public final Validation createFromParcel(Parcel parcel) {
            return new Validation((org.threeten.bp.f) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Validation[] newArray(int i12) {
            return new Validation[i12];
        }
    }

    public Validation(@Y61.l org.threeten.bp.f fVar) {
        this.f293875b = fVar;
    }

    @Override // com.avito.android.date_time_picker.TimePickerDialog.ValidationRule
    public final boolean G3(@Y61.k org.threeten.bp.f fVar, int i12, int i13) {
        org.threeten.bp.f fVarS = fVar.R(i12).S(i13);
        org.threeten.bp.f fVar2 = this.f293875b;
        return (fVar2 != null ? fVarS.compareTo(fVar2) : 1) > 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f293875b);
    }
}
