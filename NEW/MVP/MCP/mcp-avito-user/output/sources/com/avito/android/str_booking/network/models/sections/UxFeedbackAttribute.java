package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UxFeedbackSection.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/UxFeedbackAttribute;", "Landroid/os/Parcelable;", "", "key", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "getValue", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class UxFeedbackAttribute implements Parcelable {

    @k
    public static final Parcelable.Creator<UxFeedbackAttribute> CREATOR = new a();

    @c("key")
    @l
    private final String key;

    @c("value")
    @l
    private final String value;

    /* compiled from: UxFeedbackSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UxFeedbackAttribute> {
        @Override // android.os.Parcelable.Creator
        public final UxFeedbackAttribute createFromParcel(Parcel parcel) {
            return new UxFeedbackAttribute(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UxFeedbackAttribute[] newArray(int i12) {
            return new UxFeedbackAttribute[i12];
        }
    }

    public UxFeedbackAttribute(@l String str, @l String str2) {
        this.key = str;
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
        if (!(obj instanceof UxFeedbackAttribute)) {
            return false;
        }
        UxFeedbackAttribute uxFeedbackAttribute = (UxFeedbackAttribute) obj;
        return L.f(this.key, uxFeedbackAttribute.key) && L.f(this.value, uxFeedbackAttribute.value);
    }

    public final int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UxFeedbackAttribute(key=");
        sb2.append(this.key);
        sb2.append(", value=");
        return C22026a.c(sb2, this.value, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
