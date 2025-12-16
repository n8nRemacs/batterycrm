package com.avito.android.gig_tutorials.gigtutorials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: GigTutorialsOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_tutorials/gigtutorials/GigTutorialsOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_gig_tutorials_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GigTutorialsOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<GigTutorialsOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f161113b;

    /* compiled from: GigTutorialsOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigTutorialsOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final GigTutorialsOpenParams createFromParcel(Parcel parcel) {
            return new GigTutorialsOpenParams(parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final GigTutorialsOpenParams[] newArray(int i12) {
            return new GigTutorialsOpenParams[i12];
        }
    }

    public GigTutorialsOpenParams(long j12) {
        this.f161113b = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f161113b);
    }
}
