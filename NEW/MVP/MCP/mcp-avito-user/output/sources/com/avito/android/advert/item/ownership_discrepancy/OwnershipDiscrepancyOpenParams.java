package com.avito.android.advert.item.ownership_discrepancy;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.AdvertParameters;
import com.avito.android.remote.model.autotekateaser.AutotekaTeaserResult;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OwnershipDiscrepancyOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_discrepancy/OwnershipDiscrepancyOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OwnershipDiscrepancyOpenParams implements OpenParams {

    @k
    public static final Parcelable.Creator<OwnershipDiscrepancyOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f78092b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f78093c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f78094d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> f78095e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Uri f78096f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AutotekaTeaserResult f78097g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f78098h;

    /* compiled from: OwnershipDiscrepancyOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OwnershipDiscrepancyOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final OwnershipDiscrepancyOpenParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(OwnershipDiscrepancyOpenParams.class, parcel, arrayList, iL2, 1);
                }
            }
            return new OwnershipDiscrepancyOpenParams(string, string2, string3, arrayList, (Uri) parcel.readParcelable(OwnershipDiscrepancyOpenParams.class.getClassLoader()), (AutotekaTeaserResult) parcel.readParcelable(OwnershipDiscrepancyOpenParams.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OwnershipDiscrepancyOpenParams[] newArray(int i12) {
            return new OwnershipDiscrepancyOpenParams[i12];
        }
    }

    public OwnershipDiscrepancyOpenParams(@k String str, @k String str2, @k String str3, @l List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> list, @l Uri uri, @l AutotekaTeaserResult autotekaTeaserResult, @l String str4) {
        this.f78092b = str;
        this.f78093c = str2;
        this.f78094d = str3;
        this.f78095e = list;
        this.f78096f = uri;
        this.f78097g = autotekaTeaserResult;
        this.f78098h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OwnershipDiscrepancyOpenParams)) {
            return false;
        }
        OwnershipDiscrepancyOpenParams ownershipDiscrepancyOpenParams = (OwnershipDiscrepancyOpenParams) obj;
        return L.f(this.f78092b, ownershipDiscrepancyOpenParams.f78092b) && L.f(this.f78093c, ownershipDiscrepancyOpenParams.f78093c) && L.f(this.f78094d, ownershipDiscrepancyOpenParams.f78094d) && L.f(this.f78095e, ownershipDiscrepancyOpenParams.f78095e) && L.f(this.f78096f, ownershipDiscrepancyOpenParams.f78096f) && L.f(this.f78097g, ownershipDiscrepancyOpenParams.f78097g) && L.f(this.f78098h, ownershipDiscrepancyOpenParams.f78098h);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f78092b.hashCode() * 31, 31, this.f78093c), 31, this.f78094d);
        List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> list = this.f78095e;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        Uri uri = this.f78096f;
        int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        AutotekaTeaserResult autotekaTeaserResult = this.f78097g;
        int iHashCode3 = (iHashCode2 + (autotekaTeaserResult == null ? 0 : autotekaTeaserResult.hashCode())) * 31;
        String str = this.f78098h;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OwnershipDiscrepancyOpenParams(description=");
        sb2.append(this.f78092b);
        sb2.append(", title=");
        sb2.append(this.f78093c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f78094d);
        sb2.append(", values=");
        sb2.append(this.f78095e);
        sb2.append(", url=");
        sb2.append(this.f78096f);
        sb2.append(", teaserAutoteka=");
        sb2.append(this.f78097g);
        sb2.append(", searchContext=");
        return C22026a.c(sb2, this.f78098h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f78092b);
        parcel.writeString(this.f78093c);
        parcel.writeString(this.f78094d);
        List<AdvertParameters.Button.OwnershipDiscrepancy.KeyValue> list = this.f78095e;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f78096f, i12);
        parcel.writeParcelable(this.f78097g, i12);
        parcel.writeString(this.f78098h);
    }
}
