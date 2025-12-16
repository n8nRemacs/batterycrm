package com.avito.android.gig_shift_start.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: GigShiftStartOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_start/ui/GigShiftStartOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_start-shift-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftStartOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<GigShiftStartOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f160838b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f160839c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final GigShiftStartType f160840d;

    /* compiled from: GigShiftStartOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftStartOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftStartOpenParams createFromParcel(Parcel parcel) {
            return new GigShiftStartOpenParams(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, GigShiftStartType.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftStartOpenParams[] newArray(int i12) {
            return new GigShiftStartOpenParams[i12];
        }
    }

    public GigShiftStartOpenParams(@l Long l12, @l Long l13, @k GigShiftStartType gigShiftStartType) {
        this.f160838b = l12;
        this.f160839c = l13;
        this.f160840d = gigShiftStartType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f160838b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f160839c;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        this.f160840d.writeToParcel(parcel, i12);
    }
}
