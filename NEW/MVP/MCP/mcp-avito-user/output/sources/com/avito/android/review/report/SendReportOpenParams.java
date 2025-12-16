package com.avito.android.review.report;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealReviewsActivity.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/review/report/SendReportOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_comfortable-deal-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SendReportOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<SendReportOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f255378b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f255379c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Integer f255380d;

    /* compiled from: ComfortableDealReviewsActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SendReportOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final SendReportOpenParams createFromParcel(Parcel parcel) {
            return new SendReportOpenParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SendReportOpenParams[] newArray(int i12) {
            return new SendReportOpenParams[i12];
        }
    }

    public SendReportOpenParams(@l String str, @l String str2, @l Integer num) {
        this.f255378b = str;
        this.f255379c = str2;
        this.f255380d = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendReportOpenParams)) {
            return false;
        }
        SendReportOpenParams sendReportOpenParams = (SendReportOpenParams) obj;
        return L.f(this.f255378b, sendReportOpenParams.f255378b) && L.f(this.f255379c, sendReportOpenParams.f255379c) && L.f(this.f255380d, sendReportOpenParams.f255380d);
    }

    public final int hashCode() {
        String str = this.f255378b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f255379c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f255380d;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendReportOpenParams(itemId=");
        sb2.append(this.f255378b);
        sb2.append(", source=");
        sb2.append(this.f255379c);
        sb2.append(", dealId=");
        return s.j(sb2, this.f255380d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f255378b);
        parcel.writeString(this.f255379c);
        Integer num = this.f255380d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
    }
}
