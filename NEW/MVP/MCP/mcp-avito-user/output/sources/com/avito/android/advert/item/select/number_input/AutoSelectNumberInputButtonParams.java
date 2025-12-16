package com.avito.android.advert.item.select.number_input;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoSelectNumberInput.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/select/number_input/AutoSelectNumberInputButtonParams;", "Landroid/os/Parcelable;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AutoSelectNumberInputButtonParams implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoSelectNumberInputButtonParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f79504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f79505c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f79506d;

    /* compiled from: AutoSelectNumberInput.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoSelectNumberInputButtonParams> {
        @Override // android.os.Parcelable.Creator
        public final AutoSelectNumberInputButtonParams createFromParcel(Parcel parcel) {
            return new AutoSelectNumberInputButtonParams(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoSelectNumberInputButtonParams[] newArray(int i12) {
            return new AutoSelectNumberInputButtonParams[i12];
        }
    }

    public AutoSelectNumberInputButtonParams(@k String str, @k String str2, @l String str3) {
        this.f79504b = str;
        this.f79505c = str2;
        this.f79506d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoSelectNumberInputButtonParams)) {
            return false;
        }
        AutoSelectNumberInputButtonParams autoSelectNumberInputButtonParams = (AutoSelectNumberInputButtonParams) obj;
        return L.f(this.f79504b, autoSelectNumberInputButtonParams.f79504b) && L.f(this.f79505c, autoSelectNumberInputButtonParams.f79505c) && L.f(this.f79506d, autoSelectNumberInputButtonParams.f79506d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f79504b.hashCode() * 31, 31, this.f79505c);
        String str = this.f79506d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoSelectNumberInputButtonParams(title=");
        sb2.append(this.f79504b);
        sb2.append(", deepLink=");
        sb2.append(this.f79505c);
        sb2.append(", style=");
        return C22026a.c(sb2, this.f79506d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f79504b);
        parcel.writeString(this.f79505c);
        parcel.writeString(this.f79506d);
    }

    public /* synthetic */ AutoSelectNumberInputButtonParams(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
