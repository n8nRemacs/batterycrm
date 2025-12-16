package com.avito.android.gig_shift_start;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: GigShiftStartDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_start/GigShiftFinishDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_gig_start-shift-bottom-sheet_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final class GigShiftFinishDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<GigShiftFinishDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Long f160734b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f160735c;

    /* compiled from: GigShiftStartDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftFinishDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftFinishDeeplink createFromParcel(Parcel parcel) {
            Boolean boolValueOf = null;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new GigShiftFinishDeeplink(lValueOf, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftFinishDeeplink[] newArray(int i12) {
            return new GigShiftFinishDeeplink[i12];
        }
    }

    public GigShiftFinishDeeplink(@l Long l12, @l Boolean bool) {
        this.f160734b = l12;
        this.f160735c = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.f160734b;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Boolean bool = this.f160735c;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }
}
