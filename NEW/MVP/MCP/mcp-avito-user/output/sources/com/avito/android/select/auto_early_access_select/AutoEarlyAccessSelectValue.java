package com.avito.android.select.auto_early_access_select;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ParcelableEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoEarlyAccessSelectParams.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/auto_early_access_select/AutoEarlyAccessSelectValue;", "Landroid/os/Parcelable;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AutoEarlyAccessSelectValue implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoEarlyAccessSelectValue> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ParcelableEntity<String> f264994b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f264995c;

    /* compiled from: AutoEarlyAccessSelectParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoEarlyAccessSelectValue> {
        @Override // android.os.Parcelable.Creator
        public final AutoEarlyAccessSelectValue createFromParcel(Parcel parcel) {
            return new AutoEarlyAccessSelectValue((ParcelableEntity) parcel.readParcelable(AutoEarlyAccessSelectValue.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoEarlyAccessSelectValue[] newArray(int i12) {
            return new AutoEarlyAccessSelectValue[i12];
        }
    }

    public AutoEarlyAccessSelectValue(@k ParcelableEntity<String> parcelableEntity, @l String str) {
        this.f264994b = parcelableEntity;
        this.f264995c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoEarlyAccessSelectValue)) {
            return false;
        }
        AutoEarlyAccessSelectValue autoEarlyAccessSelectValue = (AutoEarlyAccessSelectValue) obj;
        return L.f(this.f264994b, autoEarlyAccessSelectValue.f264994b) && L.f(this.f264995c, autoEarlyAccessSelectValue.f264995c);
    }

    public final int hashCode() {
        int iHashCode = this.f264994b.hashCode() * 31;
        String str = this.f264995c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoEarlyAccessSelectValue(value=");
        sb2.append(this.f264994b);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f264995c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f264994b, i12);
        parcel.writeString(this.f264995c);
    }
}
