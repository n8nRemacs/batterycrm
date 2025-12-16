package com.avito.android.guests_selector.io;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: GuestsSelectorOutput.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/guests_selector/io/GuestsSelectorChildOutput;", "Landroid/os/Parcelable;", "_avito_guests-selector_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GuestsSelectorChildOutput implements Parcelable {

    @k
    public static final Parcelable.Creator<GuestsSelectorChildOutput> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f161446b;

    /* compiled from: GuestsSelectorOutput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GuestsSelectorChildOutput> {
        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorChildOutput createFromParcel(Parcel parcel) {
            return new GuestsSelectorChildOutput(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GuestsSelectorChildOutput[] newArray(int i12) {
            return new GuestsSelectorChildOutput[i12];
        }
    }

    public GuestsSelectorChildOutput(@k String str) {
        this.f161446b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GuestsSelectorChildOutput) && L.f(this.f161446b, ((GuestsSelectorChildOutput) obj).f161446b);
    }

    public final int hashCode() {
        return this.f161446b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("GuestsSelectorChildOutput(ageId="), this.f161446b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f161446b);
    }
}
