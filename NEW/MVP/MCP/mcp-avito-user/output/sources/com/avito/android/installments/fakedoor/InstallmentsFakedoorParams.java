package com.avito.android.installments.fakedoor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsFakedoorParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/fakedoor/InstallmentsFakedoorParams;", "Lcom/avito/android/util/OpenParams;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsFakedoorParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<InstallmentsFakedoorParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f172500b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f172501c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f172502d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DeepLink f172503e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f172504f;

    /* renamed from: g, reason: collision with root package name */
    public final long f172505g;

    /* compiled from: InstallmentsFakedoorParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsFakedoorParams> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsFakedoorParams createFromParcel(Parcel parcel) {
            return new InstallmentsFakedoorParams(parcel.readLong(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(InstallmentsFakedoorParams.class.getClassLoader()), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsFakedoorParams[] newArray(int i12) {
            return new InstallmentsFakedoorParams[i12];
        }
    }

    public InstallmentsFakedoorParams(long j12, @Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.l String str3, long j13) {
        this.f172500b = j12;
        this.f172501c = str;
        this.f172502d = str2;
        this.f172503e = deepLink;
        this.f172504f = str3;
        this.f172505g = j13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsFakedoorParams)) {
            return false;
        }
        InstallmentsFakedoorParams installmentsFakedoorParams = (InstallmentsFakedoorParams) obj;
        return this.f172500b == installmentsFakedoorParams.f172500b && L.f(this.f172501c, installmentsFakedoorParams.f172501c) && L.f(this.f172502d, installmentsFakedoorParams.f172502d) && L.f(this.f172503e, installmentsFakedoorParams.f172503e) && L.f(this.f172504f, installmentsFakedoorParams.f172504f) && this.f172505g == installmentsFakedoorParams.f172505g;
    }

    public final int hashCode() {
        int iE2 = com.avito.android.actions_sheet.a.e(this.f172503e, H.d(H.d(Long.hashCode(this.f172500b) * 31, 31, this.f172501c), 31, this.f172502d), 31);
        String str = this.f172504f;
        return Long.hashCode(this.f172505g) + ((iE2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallmentsFakedoorParams(itemId=");
        sb2.append(this.f172500b);
        sb2.append(", installmentsPlan=");
        sb2.append(this.f172501c);
        sb2.append(", fromPage=");
        sb2.append(this.f172502d);
        sb2.append(", buyButtonDeepLink=");
        sb2.append(this.f172503e);
        sb2.append(", context=");
        sb2.append(this.f172504f);
        sb2.append(", loanAmount=");
        return r.u(sb2, this.f172505g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f172500b);
        parcel.writeString(this.f172501c);
        parcel.writeString(this.f172502d);
        parcel.writeParcelable(this.f172503e, i12);
        parcel.writeString(this.f172504f);
        parcel.writeLong(this.f172505g);
    }
}
