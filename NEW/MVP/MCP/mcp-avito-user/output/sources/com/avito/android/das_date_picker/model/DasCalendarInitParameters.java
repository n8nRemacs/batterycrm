package com.avito.android.das_date_picker.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.util.OpenParams;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarInitParameters.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/das_date_picker/model/DasCalendarInitParameters;", "Lcom/avito/android/util/OpenParams;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DasCalendarInitParameters implements OpenParams {

    @k
    public static final Parcelable.Creator<DasCalendarInitParameters> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Date f132350b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Date f132351c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Date f132352d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f132353e;

    /* compiled from: DasCalendarInitParameters.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DasCalendarInitParameters> {
        @Override // android.os.Parcelable.Creator
        public final DasCalendarInitParameters createFromParcel(Parcel parcel) {
            return new DasCalendarInitParameters((Date) parcel.readSerializable(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DasCalendarInitParameters[] newArray(int i12) {
            return new DasCalendarInitParameters[i12];
        }
    }

    public DasCalendarInitParameters(@k Date date, @k Date date2, @k Date date3, @k String str) {
        this.f132350b = date;
        this.f132351c = date2;
        this.f132352d = date3;
        this.f132353e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DasCalendarInitParameters)) {
            return false;
        }
        DasCalendarInitParameters dasCalendarInitParameters = (DasCalendarInitParameters) obj;
        return L.f(this.f132350b, dasCalendarInitParameters.f132350b) && L.f(this.f132351c, dasCalendarInitParameters.f132351c) && L.f(this.f132352d, dasCalendarInitParameters.f132352d) && L.f(this.f132353e, dasCalendarInitParameters.f132353e);
    }

    public final int hashCode() {
        return this.f132353e.hashCode() + m.f(this.f132352d, m.f(this.f132351c, this.f132350b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DasCalendarInitParameters(selectedDate=");
        sb2.append(this.f132350b);
        sb2.append(", firstAvailableDate=");
        sb2.append(this.f132351c);
        sb2.append(", lastAvailableDate=");
        sb2.append(this.f132352d);
        sb2.append(", requestId=");
        return C22026a.c(sb2, this.f132353e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable(this.f132350b);
        parcel.writeSerializable(this.f132351c);
        parcel.writeSerializable(this.f132352d);
        parcel.writeString(this.f132353e);
    }
}
