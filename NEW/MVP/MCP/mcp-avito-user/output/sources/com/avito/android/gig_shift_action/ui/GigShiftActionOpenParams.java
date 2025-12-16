package com.avito.android.gig_shift_action.ui;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: GigShiftActionOpenParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_shift_action/ui/GigShiftActionOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_shift-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigShiftActionOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<GigShiftActionOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f160575b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f160576c;

    /* compiled from: GigShiftActionOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigShiftActionOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigShiftActionOpenParams createFromParcel(Parcel parcel) {
            return new GigShiftActionOpenParams(parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GigShiftActionOpenParams[] newArray(int i12) {
            return new GigShiftActionOpenParams[i12];
        }
    }

    public GigShiftActionOpenParams(boolean z12, @l String str) {
        this.f160575b = z12;
        this.f160576c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f160575b ? 1 : 0);
        parcel.writeString(this.f160576c);
    }
}
