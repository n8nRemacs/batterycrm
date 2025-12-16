package com.avito.android.crm;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.deep_linking.links.PublicDeeplink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: CrmDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm/CrmDeeplink;", "Lcom/avito/android/deep_linking/links/PublicDeeplink;", "_avito_crm_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CrmDeeplink extends PublicDeeplink {

    @k
    public static final Parcelable.Creator<CrmDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f129120b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f129121c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f129122d;

    /* compiled from: CrmDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CrmDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final CrmDeeplink createFromParcel(Parcel parcel) {
            return new CrmDeeplink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CrmDeeplink[] newArray(int i12) {
            return new CrmDeeplink[i12];
        }
    }

    public CrmDeeplink(@k String str, @k String str2, @l String str3) {
        this.f129120b = str;
        this.f129121c = str2;
        this.f129122d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrmDeeplink)) {
            return false;
        }
        CrmDeeplink crmDeeplink = (CrmDeeplink) obj;
        return L.f(this.f129120b, crmDeeplink.f129120b) && L.f(this.f129121c, crmDeeplink.f129121c) && L.f(this.f129122d, crmDeeplink.f129122d);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f129120b.hashCode() * 31, 31, this.f129121c);
        String str = this.f129122d;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CrmDeeplink(requestType=");
        sb2.append(this.f129120b);
        sb2.append(", deeplinkType=");
        sb2.append(this.f129121c);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f129122d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f129120b);
        parcel.writeString(this.f129121c);
        parcel.writeString(this.f129122d);
    }
}
