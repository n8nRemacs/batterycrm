package com.avito.android.comfortable_deal.date_time_pickers.time.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import org.threeten.bp.g;
import org.webrtc.h;

/* compiled from: TimePickerArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/date_time_pickers/time/model/TimePickerArguments;", "Landroid/os/Parcelable;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TimePickerArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<TimePickerArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f120938b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final g f120939c;

    /* compiled from: TimePickerArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TimePickerArguments> {
        @Override // android.os.Parcelable.Creator
        public final TimePickerArguments createFromParcel(Parcel parcel) {
            return new TimePickerArguments(parcel.readString(), (g) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final TimePickerArguments[] newArray(int i12) {
            return new TimePickerArguments[i12];
        }
    }

    public TimePickerArguments(@k String str, @l g gVar) {
        this.f120938b = str;
        this.f120939c = gVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimePickerArguments)) {
            return false;
        }
        TimePickerArguments timePickerArguments = (TimePickerArguments) obj;
        return L.f(this.f120938b, timePickerArguments.f120938b) && L.f(this.f120939c, timePickerArguments.f120939c);
    }

    public final int hashCode() {
        int iHashCode = this.f120938b.hashCode() * 31;
        g gVar = this.f120939c;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimePickerArguments(requestKey=");
        sb2.append(this.f120938b);
        sb2.append(", initialTime=");
        return h.f(sb2, this.f120939c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f120938b);
        parcel.writeSerializable(this.f120939c);
    }
}
