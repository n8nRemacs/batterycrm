package com.avito.android.beduin.common.form.transforms;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.beduin_models.BeduinModelTransform;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocalErrorMessageTransform.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/form/transforms/LocalErrorMessageTransform;", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class LocalErrorMessageTransform implements BeduinModelTransform {

    @k
    public static final Parcelable.Creator<LocalErrorMessageTransform> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f103386b;

    /* compiled from: LocalErrorMessageTransform.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LocalErrorMessageTransform> {
        @Override // android.os.Parcelable.Creator
        public final LocalErrorMessageTransform createFromParcel(Parcel parcel) {
            return new LocalErrorMessageTransform(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LocalErrorMessageTransform[] newArray(int i12) {
            return new LocalErrorMessageTransform[i12];
        }
    }

    public LocalErrorMessageTransform(@l String str) {
        this.f103386b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalErrorMessageTransform) && L.f(this.f103386b, ((LocalErrorMessageTransform) obj).f103386b);
    }

    public final int hashCode() {
        String str = this.f103386b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("LocalErrorMessageTransform(errorMessage="), this.f103386b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f103386b);
    }
}
