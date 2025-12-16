package com.avito.android.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaChoosingPurchaseButtonParams.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/model/AutotekaChoosingPurchaseButtonParams;", "Landroid/os/Parcelable;", "_avito_autoteka_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutotekaChoosingPurchaseButtonParams implements Parcelable {

    @k
    public static final Parcelable.Creator<AutotekaChoosingPurchaseButtonParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DeepLink f97068b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f97069c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f97070d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f97071e;

    /* compiled from: AutotekaChoosingPurchaseButtonParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutotekaChoosingPurchaseButtonParams> {
        @Override // android.os.Parcelable.Creator
        public final AutotekaChoosingPurchaseButtonParams createFromParcel(Parcel parcel) {
            return new AutotekaChoosingPurchaseButtonParams((DeepLink) parcel.readParcelable(AutotekaChoosingPurchaseButtonParams.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutotekaChoosingPurchaseButtonParams[] newArray(int i12) {
            return new AutotekaChoosingPurchaseButtonParams[i12];
        }
    }

    public AutotekaChoosingPurchaseButtonParams(@k DeepLink deepLink, @k String str, @l String str2, @k String str3) {
        this.f97068b = deepLink;
        this.f97069c = str;
        this.f97070d = str2;
        this.f97071e = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutotekaChoosingPurchaseButtonParams)) {
            return false;
        }
        AutotekaChoosingPurchaseButtonParams autotekaChoosingPurchaseButtonParams = (AutotekaChoosingPurchaseButtonParams) obj;
        return L.f(this.f97068b, autotekaChoosingPurchaseButtonParams.f97068b) && L.f(this.f97069c, autotekaChoosingPurchaseButtonParams.f97069c) && L.f(this.f97070d, autotekaChoosingPurchaseButtonParams.f97070d) && L.f(this.f97071e, autotekaChoosingPurchaseButtonParams.f97071e);
    }

    public final int hashCode() {
        int iD2 = H.d(this.f97068b.hashCode() * 31, 31, this.f97069c);
        String str = this.f97070d;
        return this.f97071e.hashCode() + ((iD2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaChoosingPurchaseButtonParams(deepLink=");
        sb2.append(this.f97068b);
        sb2.append(", label=");
        sb2.append(this.f97069c);
        sb2.append(", subLabel=");
        sb2.append(this.f97070d);
        sb2.append(", actionType=");
        return C22026a.c(sb2, this.f97071e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f97068b, i12);
        parcel.writeString(this.f97069c);
        parcel.writeString(this.f97070d);
        parcel.writeString(this.f97071e);
    }
}
