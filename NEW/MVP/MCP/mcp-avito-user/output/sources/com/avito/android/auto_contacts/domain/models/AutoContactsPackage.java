package com.avito.android.auto_contacts.domain.models;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutoContactsPackage.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_contacts/domain/models/AutoContactsPackage;", "Landroid/os/Parcelable;", "_avito_auto-contacts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AutoContactsPackage implements Parcelable {

    @k
    public static final Parcelable.Creator<AutoContactsPackage> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f94878b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f94879c;

    /* compiled from: AutoContactsPackage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutoContactsPackage> {
        @Override // android.os.Parcelable.Creator
        public final AutoContactsPackage createFromParcel(Parcel parcel) {
            return new AutoContactsPackage(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AutoContactsPackage[] newArray(int i12) {
            return new AutoContactsPackage[i12];
        }
    }

    public AutoContactsPackage(@k String str, @k String str2) {
        this.f94878b = str;
        this.f94879c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AutoContactsPackage)) {
            return false;
        }
        AutoContactsPackage autoContactsPackage = (AutoContactsPackage) obj;
        return L.f(this.f94878b, autoContactsPackage.f94878b) && L.f(this.f94879c, autoContactsPackage.f94879c);
    }

    public final int hashCode() {
        return this.f94879c.hashCode() + (this.f94878b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoContactsPackage(title=");
        sb2.append(this.f94878b);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f94879c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f94878b);
        parcel.writeString(this.f94879c);
    }
}
