package com.avito.android.tariff_lf.edit_info.item.prolongation;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;

/* compiled from: TariffProlongationPayload.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/prolongation/TariffProlongationPayload;", "Landroid/os/Parcelable;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffProlongationPayload implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<TariffProlongationPayload> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f299033b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f299034c;

    /* compiled from: TariffProlongationPayload.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffProlongationPayload> {
        @Override // android.os.Parcelable.Creator
        public final TariffProlongationPayload createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TariffProlongationPayload(boolValueOf, boolValueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final TariffProlongationPayload[] newArray(int i12) {
            return new TariffProlongationPayload[i12];
        }
    }

    public TariffProlongationPayload(@l Boolean bool, @l Boolean bool2) {
        this.f299033b = bool;
        this.f299034c = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Boolean bool = this.f299033b;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.f299034c;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
    }
}
