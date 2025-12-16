package com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReturnToWorkResult.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_cabinet/return_to_work/model/ReturnToWorkResult;", "Landroid/os/Parcelable;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnToWorkResult implements Parcelable {

    @k
    public static final Parcelable.Creator<ReturnToWorkResult> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f137205b;

    /* compiled from: ReturnToWorkResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReturnToWorkResult> {
        @Override // android.os.Parcelable.Creator
        public final ReturnToWorkResult createFromParcel(Parcel parcel) {
            return new ReturnToWorkResult((DeepLink) parcel.readParcelable(ReturnToWorkResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ReturnToWorkResult[] newArray(int i12) {
            return new ReturnToWorkResult[i12];
        }
    }

    public ReturnToWorkResult(@k DeepLink deepLink) {
        this.f137205b = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReturnToWorkResult) && L.f(this.f137205b, ((ReturnToWorkResult) obj).f137205b);
    }

    public final int hashCode() {
        return this.f137205b.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("ReturnToWorkResult(deeplink="), this.f137205b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f137205b, i12);
    }
}
