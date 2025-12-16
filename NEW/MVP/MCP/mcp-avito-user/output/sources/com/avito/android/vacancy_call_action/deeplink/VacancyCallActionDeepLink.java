package com.avito.android.vacancy_call_action.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: VacancyCallActionDeepLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vacancy_call_action/deeplink/VacancyCallActionDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_job_vacancy-call-action_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes5.dex */
public final /* data */ class VacancyCallActionDeepLink extends DeepLink {

    @k
    public static final Parcelable.Creator<VacancyCallActionDeepLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f319201b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f319202c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f319203d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f319204e;

    /* compiled from: VacancyCallActionDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VacancyCallActionDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final VacancyCallActionDeepLink createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new VacancyCallActionDeepLink(string, boolValueOf, parcel.readString(), j12);
        }

        @Override // android.os.Parcelable.Creator
        public final VacancyCallActionDeepLink[] newArray(int i12) {
            return new VacancyCallActionDeepLink[i12];
        }
    }

    public VacancyCallActionDeepLink(@k String str, @l Boolean bool, @l String str2, long j12) {
        this.f319201b = j12;
        this.f319202c = str;
        this.f319203d = bool;
        this.f319204e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VacancyCallActionDeepLink)) {
            return false;
        }
        VacancyCallActionDeepLink vacancyCallActionDeepLink = (VacancyCallActionDeepLink) obj;
        return this.f319201b == vacancyCallActionDeepLink.f319201b && L.f(this.f319202c, vacancyCallActionDeepLink.f319202c) && L.f(this.f319203d, vacancyCallActionDeepLink.f319203d) && L.f(this.f319204e, vacancyCallActionDeepLink.f319204e);
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f319201b) * 31, 31, this.f319202c);
        Boolean bool = this.f319203d;
        int iHashCode = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f319204e;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VacancyCallActionDeepLink(vacancyId=");
        sb2.append(this.f319201b);
        sb2.append(", fromPage=");
        sb2.append(this.f319202c);
        sb2.append(", disclaimerPDViewed=");
        sb2.append(this.f319203d);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f319204e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f319201b);
        parcel.writeString(this.f319202c);
        Boolean bool = this.f319203d;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.f319204e);
    }
}
