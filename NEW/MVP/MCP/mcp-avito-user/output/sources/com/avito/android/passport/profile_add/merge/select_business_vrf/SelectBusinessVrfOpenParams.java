package com.avito.android.passport.profile_add.merge.select_business_vrf;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.deeplinks.PassportSelectBusinessVrfLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;

/* compiled from: SelectBusinessVrfOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/select_business_vrf/SelectBusinessVrfOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectBusinessVrfOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<SelectBusinessVrfOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PassportSelectBusinessVrfLink.Flow f213365b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f213366c;

    /* compiled from: SelectBusinessVrfOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SelectBusinessVrfOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final SelectBusinessVrfOpenParams createFromParcel(Parcel parcel) {
            return new SelectBusinessVrfOpenParams(PassportSelectBusinessVrfLink.Flow.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SelectBusinessVrfOpenParams[] newArray(int i12) {
            return new SelectBusinessVrfOpenParams[i12];
        }
    }

    public SelectBusinessVrfOpenParams(@Y61.k PassportSelectBusinessVrfLink.Flow flow, @Y61.l String str) {
        this.f213365b = flow;
        this.f213366c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f213365b.name());
        parcel.writeString(this.f213366c);
    }
}
