package com.avito.android.vas_performance.deeplink;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.paid_services.PaidServicesLink;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: CompetitiveVasLink.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/deeplink/CompetitiveVasLink;", "Lcom/avito/android/paid_services/PaidServicesLink;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final class CompetitiveVasLink extends PaidServicesLink {

    @k
    public static final Parcelable.Creator<CompetitiveVasLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f319857b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f319858c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f319859d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f319860e;

    /* compiled from: CompetitiveVasLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CompetitiveVasLink> {
        @Override // android.os.Parcelable.Creator
        public final CompetitiveVasLink createFromParcel(Parcel parcel) {
            return new CompetitiveVasLink(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CompetitiveVasLink[] newArray(int i12) {
            return new CompetitiveVasLink[i12];
        }
    }

    public CompetitiveVasLink(@k String str, @k String str2, boolean z12, @k String str3) {
        this.f319857b = str;
        this.f319858c = str2;
        this.f319859d = z12;
        this.f319860e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f319857b);
        parcel.writeString(this.f319858c);
        parcel.writeInt(this.f319859d ? 1 : 0);
        parcel.writeString(this.f319860e);
    }
}
