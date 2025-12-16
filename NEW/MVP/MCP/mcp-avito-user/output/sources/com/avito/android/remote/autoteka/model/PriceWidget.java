package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PriceWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/remote/autoteka/model/PriceWidget;", "Landroid/os/Parcelable;", "", "label", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getValue", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PriceWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceWidget> CREATOR = new a();

    @c("label")
    @k
    private final String label;

    @c("value")
    @k
    private final String value;

    /* compiled from: PriceWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PriceWidget> {
        @Override // android.os.Parcelable.Creator
        public final PriceWidget createFromParcel(Parcel parcel) {
            return new PriceWidget(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PriceWidget[] newArray(int i12) {
            return new PriceWidget[i12];
        }
    }

    public PriceWidget(@k String str, @k String str2) {
        this.label = str;
        this.value = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceWidget)) {
            return false;
        }
        PriceWidget priceWidget = (PriceWidget) obj;
        return L.f(this.label, priceWidget.label) && L.f(this.value, priceWidget.value);
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        return this.value.hashCode() + (this.label.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PriceWidget(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeString(this.value);
    }
}
