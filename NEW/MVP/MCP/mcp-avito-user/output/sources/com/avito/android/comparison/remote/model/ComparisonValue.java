package com.avito.android.comparison.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComparisonResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/comparison/remote/model/ComparisonValue;", "Landroid/os/Parcelable;", "", "value", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getType", "_avito-discouraged_avito-network_comparison"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ComparisonValue implements Parcelable {

    @k
    public static final Parcelable.Creator<ComparisonValue> CREATOR = new a();

    @c("type")
    @k
    private final String type;

    @c("value")
    @k
    private final String value;

    /* compiled from: ComparisonResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ComparisonValue> {
        @Override // android.os.Parcelable.Creator
        public final ComparisonValue createFromParcel(Parcel parcel) {
            return new ComparisonValue(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ComparisonValue[] newArray(int i12) {
            return new ComparisonValue[i12];
        }
    }

    public ComparisonValue(@k String str, @k String str2) {
        this.value = str;
        this.type = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparisonValue)) {
            return false;
        }
        ComparisonValue comparisonValue = (ComparisonValue) obj;
        return L.f(this.value, comparisonValue.value) && L.f(this.type, comparisonValue.type);
    }

    @k
    public final String getType() {
        return this.type;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.type.hashCode() + (this.value.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ComparisonValue(value=");
        sb2.append(this.value);
        sb2.append(", type=");
        return C22026a.c(sb2, this.type, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.value);
        parcel.writeString(this.type);
    }
}
