package com.avito.android.service_booking_schedule_repetition_impl.mvi.domain;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RepetitionSchedule.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_schedule_repetition_impl/mvi/domain/RepetitionSchedule;", "Landroid/os/Parcelable;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RepetitionSchedule implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<RepetitionSchedule> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f277630b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f277631c;

    /* renamed from: d, reason: collision with root package name */
    public final int f277632d;

    /* renamed from: e, reason: collision with root package name */
    public final int f277633e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final ArrayList f277634f;

    /* compiled from: RepetitionSchedule.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RepetitionSchedule> {
        @Override // android.os.Parcelable.Creator
        public final RepetitionSchedule createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            int iL2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i14);
                while (iL2 != i14) {
                    iL2 = com.avito.android.actions_sheet.a.l(RepetitionSchedule.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new RepetitionSchedule(j12, z12, i12, i13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RepetitionSchedule[] newArray(int i12) {
            return new RepetitionSchedule[i12];
        }
    }

    public RepetitionSchedule(long j12, boolean z12, int i12, int i13, @l ArrayList arrayList) {
        this.f277630b = j12;
        this.f277631c = z12;
        this.f277632d = i12;
        this.f277633e = i13;
        this.f277634f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RepetitionSchedule)) {
            return false;
        }
        RepetitionSchedule repetitionSchedule = (RepetitionSchedule) obj;
        return this.f277630b == repetitionSchedule.f277630b && this.f277631c == repetitionSchedule.f277631c && this.f277632d == repetitionSchedule.f277632d && this.f277633e == repetitionSchedule.f277633e && L.f(this.f277634f, repetitionSchedule.f277634f);
    }

    public final int hashCode() {
        int iE2 = r.e(this.f277633e, r.e(this.f277632d, r.i(Long.hashCode(this.f277630b) * 31, 31, this.f277631c), 31), 31);
        ArrayList arrayList = this.f277634f;
        return iE2 + (arrayList == null ? 0 : arrayList.hashCode());
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RepetitionSchedule(day=");
        sb2.append(this.f277630b);
        sb2.append(", isActive=");
        sb2.append(this.f277631c);
        sb2.append(", workHoursFrom=");
        sb2.append(this.f277632d);
        sb2.append(", workHoursTo=");
        sb2.append(this.f277633e);
        sb2.append(", breaks=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f277634f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f277630b);
        parcel.writeInt(this.f277631c ? 1 : 0);
        parcel.writeInt(this.f277632d);
        parcel.writeInt(this.f277633e);
        ArrayList arrayList = this.f277634f;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
        while (itY.hasNext()) {
            parcel.writeParcelable((Parcelable) itY.next(), i12);
        }
    }
}
