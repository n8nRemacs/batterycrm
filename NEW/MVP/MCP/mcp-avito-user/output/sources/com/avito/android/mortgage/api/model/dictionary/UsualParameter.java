package com.avito.android.mortgage.api.model.dictionary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UsualParameter.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/mortgage/api/model/dictionary/UsualParameter;", "Lcom/avito/android/mortgage/api/model/dictionary/Parameter;", "", "label", "value", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getValue", "getDescription", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class UsualParameter implements Parameter {

    @k
    public static final Parcelable.Creator<UsualParameter> CREATOR = new a();

    @c("description")
    @l
    private final String description;

    @c("label")
    @k
    private final String label;

    @c("value")
    @k
    private final String value;

    /* compiled from: UsualParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UsualParameter> {
        @Override // android.os.Parcelable.Creator
        public final UsualParameter createFromParcel(Parcel parcel) {
            return new UsualParameter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UsualParameter[] newArray(int i12) {
            return new UsualParameter[i12];
        }
    }

    public UsualParameter(@k String str, @k String str2, @l String str3) {
        this.label = str;
        this.value = str2;
        this.description = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UsualParameter)) {
            return false;
        }
        UsualParameter usualParameter = (UsualParameter) obj;
        return L.f(this.label, usualParameter.label) && L.f(this.value, usualParameter.value) && L.f(this.description, usualParameter.description);
    }

    @Override // com.avito.android.mortgage.api.model.dictionary.Parameter
    @k
    public final String getLabel() {
        return this.label;
    }

    @Override // com.avito.android.mortgage.api.model.dictionary.Parameter
    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iD2 = H.d(this.label.hashCode() * 31, 31, this.value);
        String str = this.description;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UsualParameter(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeString(this.value);
        parcel.writeString(this.description);
    }
}
