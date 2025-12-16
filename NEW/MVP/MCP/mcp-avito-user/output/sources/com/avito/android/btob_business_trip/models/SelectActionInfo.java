package com.avito.android.btob_business_trip.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: B2bBusinessTripInfoModels.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/btob_business_trip/models/SelectActionInfo;", "Landroid/os/Parcelable;", "_avito_btob-business-trip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SelectActionInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<SelectActionInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f107862b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f107863c;

    /* compiled from: B2bBusinessTripInfoModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectActionInfo> {
        @Override // android.os.Parcelable.Creator
        public final SelectActionInfo createFromParcel(Parcel parcel) {
            return new SelectActionInfo((AttributedText) parcel.readParcelable(SelectActionInfo.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectActionInfo[] newArray(int i12) {
            return new SelectActionInfo[i12];
        }
    }

    public SelectActionInfo(@k AttributedText attributedText, @k String str) {
        this.f107862b = attributedText;
        this.f107863c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectActionInfo)) {
            return false;
        }
        SelectActionInfo selectActionInfo = (SelectActionInfo) obj;
        return L.f(this.f107862b, selectActionInfo.f107862b) && L.f(this.f107863c, selectActionInfo.f107863c);
    }

    public final int hashCode() {
        return this.f107863c.hashCode() + (this.f107862b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectActionInfo(hint=");
        sb2.append(this.f107862b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f107863c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f107862b, i12);
        parcel.writeString(this.f107863c);
    }
}
