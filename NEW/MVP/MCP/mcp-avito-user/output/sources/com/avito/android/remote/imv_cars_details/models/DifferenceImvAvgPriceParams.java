package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/DifferenceImvAvgPriceParams;", "Landroid/os/Parcelable;", "", "text", "", "usage", "<init>", "(Ljava/lang/String;Z)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "Z", "c", "()Z", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DifferenceImvAvgPriceParams implements Parcelable {

    @k
    public static final Parcelable.Creator<DifferenceImvAvgPriceParams> CREATOR = new a();

    @c("text")
    @k
    private final String text;

    @c("usage")
    private final boolean usage;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DifferenceImvAvgPriceParams> {
        @Override // android.os.Parcelable.Creator
        public final DifferenceImvAvgPriceParams createFromParcel(Parcel parcel) {
            return new DifferenceImvAvgPriceParams(parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DifferenceImvAvgPriceParams[] newArray(int i12) {
            return new DifferenceImvAvgPriceParams[i12];
        }
    }

    public DifferenceImvAvgPriceParams(@k String str, boolean z12) {
        this.text = str;
        this.usage = z12;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getUsage() {
        return this.usage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DifferenceImvAvgPriceParams)) {
            return false;
        }
        DifferenceImvAvgPriceParams differenceImvAvgPriceParams = (DifferenceImvAvgPriceParams) obj;
        return L.f(this.text, differenceImvAvgPriceParams.text) && this.usage == differenceImvAvgPriceParams.usage;
    }

    @k
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.usage) + (this.text.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DifferenceImvAvgPriceParams(text=");
        sb2.append(this.text);
        sb2.append(", usage=");
        return r.x(sb2, this.usage, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.text);
        parcel.writeInt(this.usage ? 1 : 0);
    }
}
