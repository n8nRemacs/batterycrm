package com.avito.android.comfortable_deal.date_time_pickers.date.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.threeten.bp.e;

/* compiled from: DatePickerArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/date/model/DatePickerArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DatePickerArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<DatePickerArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f120920b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final e f120921c;

    /* compiled from: DatePickerArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DatePickerArguments> {
        @Override // android.os.Parcelable.Creator
        public final DatePickerArguments createFromParcel(Parcel parcel) {
            return new DatePickerArguments(parcel.readString(), (e) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final DatePickerArguments[] newArray(int i12) {
            return new DatePickerArguments[i12];
        }
    }

    public DatePickerArguments(@k String str, @l e eVar) {
        this.f120920b = str;
        this.f120921c = eVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatePickerArguments)) {
            return false;
        }
        DatePickerArguments datePickerArguments = (DatePickerArguments) obj;
        return L.f(this.f120920b, datePickerArguments.f120920b) && L.f(this.f120921c, datePickerArguments.f120921c);
    }

    public final int hashCode() {
        int iHashCode = this.f120920b.hashCode() * 31;
        e eVar = this.f120921c;
        return iHashCode + (eVar == null ? 0 : eVar.hashCode());
    }

    @k
    public final String toString() {
        return "DatePickerArguments(requestKey=" + this.f120920b + ", initialDate=" + this.f120921c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f120920b);
        parcel.writeSerializable(this.f120921c);
    }
}
