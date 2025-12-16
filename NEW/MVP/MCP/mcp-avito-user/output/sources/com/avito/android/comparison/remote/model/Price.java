package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/avito/android/comparison/remote/model/Price;", "Landroid/os/Parcelable;", "", "value", "", "valueFormatted", "metric", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/Long;", "getValue", "()Ljava/lang/Long;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "getMetric", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Price implements Parcelable {

    @k
    public static final Parcelable.Creator<Price> CREATOR = new a();

    @c("metric")
    @l
    private final String metric;

    @c("value")
    @l
    private final Long value;

    @c("valueFormatted")
    @k
    private final String valueFormatted;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Price> {
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            return new Price(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i12) {
            return new Price[i12];
        }
    }

    public Price(@l Long l12, @k String str, @l String str2) {
        this.value = l12;
        this.valueFormatted = str;
        this.metric = str2;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getValueFormatted() {
        return this.valueFormatted;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return L.f(this.value, price.value) && L.f(this.valueFormatted, price.valueFormatted) && L.f(this.metric, price.metric);
    }

    public final int hashCode() {
        Long l12 = this.value;
        int iD2 = H.d((l12 == null ? 0 : l12.hashCode()) * 31, 31, this.valueFormatted);
        String str = this.metric;
        return iD2 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Price(value=");
        sb2.append(this.value);
        sb2.append(", valueFormatted=");
        sb2.append(this.valueFormatted);
        sb2.append(", metric=");
        return C22026a.c(sb2, this.metric, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        Long l12 = this.value;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.valueFormatted);
        parcel.writeString(this.metric);
    }
}
