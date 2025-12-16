package com.avito.android.early_access.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.early_access.entities.ReEarlyAccessData;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EarlyAccessModalResponse.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/early_access/remote/model/Parameter;", "Landroid/os/Parcelable;", "", "icon", "text", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getIcon", "()Ljava/lang/String;", "getText", "getDescription", "_avito-discouraged_avito-api_early-access"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Parameter implements Parcelable {

    @k
    public static final Parcelable.Creator<Parameter> CREATOR = new a();

    @c("description")
    @l
    private final String description;

    @c("textIconName")
    @k
    private final String icon;

    @c("text")
    @k
    private final String text;

    /* compiled from: EarlyAccessModalResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Parameter> {
        @Override // android.os.Parcelable.Creator
        public final Parameter createFromParcel(Parcel parcel) {
            return new Parameter(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Parameter[] newArray(int i12) {
            return new Parameter[i12];
        }
    }

    public Parameter(@k String str, @k String str2, @l String str3) {
        this.icon = str;
        this.text = str2;
        this.description = str3;
    }

    @k
    public final ReEarlyAccessData.Parameter c() {
        return new ReEarlyAccessData.Parameter(this.text, this.icon, this.description);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Parameter)) {
            return false;
        }
        Parameter parameter = (Parameter) obj;
        return L.f(this.icon, parameter.icon) && L.f(this.text, parameter.text) && L.f(this.description, parameter.description);
    }

    public final int hashCode() {
        int iD2 = H.d(this.icon.hashCode() * 31, 31, this.text);
        String str = this.description;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Parameter(icon=");
        sb2.append(this.icon);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.icon);
        parcel.writeString(this.text);
        parcel.writeString(this.description);
    }
}
