package com.avito.android.vas_planning_checkout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: VasPlanCheckoutFragmentArgument.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/VasPlanCheckoutFragmentArgument;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VasPlanCheckoutFragmentArgument implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VasPlanCheckoutFragmentArgument> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f322814b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f322815c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f322816d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f322817e;

    /* compiled from: VasPlanCheckoutFragmentArgument.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VasPlanCheckoutFragmentArgument> {
        @Override // android.os.Parcelable.Creator
        public final VasPlanCheckoutFragmentArgument createFromParcel(Parcel parcel) {
            return new VasPlanCheckoutFragmentArgument(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VasPlanCheckoutFragmentArgument[] newArray(int i12) {
            return new VasPlanCheckoutFragmentArgument[i12];
        }
    }

    public VasPlanCheckoutFragmentArgument(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, boolean z12) {
        this.f322814b = str;
        this.f322815c = str2;
        this.f322816d = str3;
        this.f322817e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f322814b);
        parcel.writeString(this.f322815c);
        parcel.writeString(this.f322816d);
        parcel.writeInt(this.f322817e ? 1 : 0);
    }
}
