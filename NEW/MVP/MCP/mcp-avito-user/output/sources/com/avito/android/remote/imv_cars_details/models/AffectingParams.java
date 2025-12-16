package com.avito.android.remote.imv_cars_details.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvCarsDetailsResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/imv_cars_details/models/AffectingParams;", "Landroid/os/Parcelable;", "", "buttonText", "headerText", "", "items", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "_avito-discouraged_avito-api_imv-cars-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class AffectingParams implements Parcelable {

    @k
    public static final Parcelable.Creator<AffectingParams> CREATOR = new a();

    @c("button")
    @k
    private final String buttonText;

    @c("header")
    @k
    private final String headerText;

    @c("items")
    @k
    private final List<String> items;

    /* compiled from: ImvCarsDetailsResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AffectingParams> {
        @Override // android.os.Parcelable.Creator
        public final AffectingParams createFromParcel(Parcel parcel) {
            return new AffectingParams(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final AffectingParams[] newArray(int i12) {
            return new AffectingParams[i12];
        }
    }

    public AffectingParams(@k String str, @k String str2, @k List<String> list) {
        this.buttonText = str;
        this.headerText = str2;
        this.items = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getHeaderText() {
        return this.headerText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AffectingParams)) {
            return false;
        }
        AffectingParams affectingParams = (AffectingParams) obj;
        return L.f(this.buttonText, affectingParams.buttonText) && L.f(this.headerText, affectingParams.headerText) && L.f(this.items, affectingParams.items);
    }

    @k
    public final List<String> getItems() {
        return this.items;
    }

    public final int hashCode() {
        return this.items.hashCode() + H.d(this.buttonText.hashCode() * 31, 31, this.headerText);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AffectingParams(buttonText=");
        sb2.append(this.buttonText);
        sb2.append(", headerText=");
        sb2.append(this.headerText);
        sb2.append(", items=");
        return H.p(sb2, this.items, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.buttonText);
        parcel.writeString(this.headerText);
        parcel.writeStringList(this.items);
    }
}
