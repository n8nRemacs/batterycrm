package com.avito.android.motivation_screen.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MotivationParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/motivation_screen/models/MotivationParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_motivation-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MotivationParams implements OpenParams {

    @k
    public static final Parcelable.Creator<MotivationParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f206336b;

    /* compiled from: MotivationParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MotivationParams> {
        @Override // android.os.Parcelable.Creator
        public final MotivationParams createFromParcel(Parcel parcel) {
            return new MotivationParams(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MotivationParams[] newArray(int i12) {
            return new MotivationParams[i12];
        }
    }

    public MotivationParams(@k String str) {
        this.f206336b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MotivationParams) && L.f(this.f206336b, ((MotivationParams) obj).f206336b);
    }

    public final int hashCode() {
        return this.f206336b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("MotivationParams(motivationId="), this.f206336b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f206336b);
    }
}
