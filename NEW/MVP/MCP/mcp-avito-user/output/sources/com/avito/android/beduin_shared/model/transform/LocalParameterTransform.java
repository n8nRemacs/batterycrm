package com.avito.android.beduin_shared.model.transform;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.beduin_models.BeduinModelTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocalParameterTransform.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin_shared/model/transform/LocalParameterTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "_avito_beduin-shared_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LocalParameterTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<LocalParameterTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f105323b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Object f105324c;

    /* compiled from: LocalParameterTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocalParameterTransform> {
        @Override // android.os.Parcelable.Creator
        public final LocalParameterTransform createFromParcel(Parcel parcel) {
            return new LocalParameterTransform(parcel.readString(), parcel.readValue(LocalParameterTransform.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LocalParameterTransform[] newArray(int i12) {
            return new LocalParameterTransform[i12];
        }
    }

    public LocalParameterTransform(@k String str, @l Object obj) {
        this.f105323b = str;
        this.f105324c = obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalParameterTransform)) {
            return false;
        }
        LocalParameterTransform localParameterTransform = (LocalParameterTransform) obj;
        return L.f(this.f105323b, localParameterTransform.f105323b) && L.f(this.f105324c, localParameterTransform.f105324c);
    }

    public final int hashCode() {
        int iHashCode = this.f105323b.hashCode() * 31;
        Object obj = this.f105324c;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalParameterTransform(name=");
        sb2.append(this.f105323b);
        sb2.append(", value=");
        return H.n(sb2, this.f105324c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f105323b);
        parcel.writeValue(this.f105324c);
    }
}
