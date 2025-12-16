package com.avito.android.passport.profile_add.create_flow.select_specific;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SpecificVo.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_specific/SpecificVo;", "Landroid/os/Parcelable;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class SpecificVo implements Parcelable {

    @k
    public static final Parcelable.Creator<SpecificVo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f211653b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f211654c;

    /* compiled from: SpecificVo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpecificVo> {
        @Override // android.os.Parcelable.Creator
        public final SpecificVo createFromParcel(Parcel parcel) {
            return new SpecificVo(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SpecificVo[] newArray(int i12) {
            return new SpecificVo[i12];
        }
    }

    public SpecificVo(int i12, @k String str) {
        this.f211653b = i12;
        this.f211654c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SpecificVo)) {
            return false;
        }
        SpecificVo specificVo = (SpecificVo) obj;
        return this.f211653b == specificVo.f211653b && L.f(this.f211654c, specificVo.f211654c);
    }

    public final int hashCode() {
        return this.f211654c.hashCode() + (Integer.hashCode(this.f211653b) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpecificVo(id=");
        sb2.append(this.f211653b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f211654c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f211653b);
        parcel.writeString(this.f211654c);
    }
}
