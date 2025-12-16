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

/* compiled from: IconParameter.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/avito/android/mortgage/api/model/dictionary/IconParameter;", "Lcom/avito/android/mortgage/api/model/dictionary/Parameter;", "", "label", "value", "description", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getValue", "getDescription", "getIcon", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class IconParameter implements Parameter {

    @k
    public static final Parcelable.Creator<IconParameter> CREATOR = new a();

    @c("description")
    @l
    private final String description;

    @c("icon")
    @l
    private final String icon;

    @c("label")
    @k
    private final String label;

    @c("value")
    @k
    private final String value;

    /* compiled from: IconParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IconParameter> {
        @Override // android.os.Parcelable.Creator
        public final IconParameter createFromParcel(Parcel parcel) {
            return new IconParameter(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IconParameter[] newArray(int i12) {
            return new IconParameter[i12];
        }
    }

    public IconParameter(@k String str, @k String str2, @l String str3, @l String str4) {
        this.label = str;
        this.value = str2;
        this.description = str3;
        this.icon = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconParameter)) {
            return false;
        }
        IconParameter iconParameter = (IconParameter) obj;
        return L.f(this.label, iconParameter.label) && L.f(this.value, iconParameter.value) && L.f(this.description, iconParameter.description) && L.f(this.icon, iconParameter.icon);
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
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IconParameter(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", icon=");
        return C22026a.c(sb2, this.icon, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeString(this.value);
        parcel.writeString(this.description);
        parcel.writeString(this.icon);
    }
}
