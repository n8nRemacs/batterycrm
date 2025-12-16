package com.avito.android.mortgage.manager_usp.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ManagerUspArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/manager_usp/model/ManagerUspArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ManagerUspArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ManagerUspArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200409b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f200410c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f200411d;

    /* compiled from: ManagerUspArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ManagerUspArguments> {
        @Override // android.os.Parcelable.Creator
        public final ManagerUspArguments createFromParcel(Parcel parcel) {
            return new ManagerUspArguments(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ManagerUspArguments[] newArray(int i12) {
            return new ManagerUspArguments[i12];
        }
    }

    public ManagerUspArguments(@k String str, @l String str2, @k String str3) {
        this.f200409b = str;
        this.f200410c = str2;
        this.f200411d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManagerUspArguments)) {
            return false;
        }
        ManagerUspArguments managerUspArguments = (ManagerUspArguments) obj;
        return L.f(this.f200409b, managerUspArguments.f200409b) && L.f(this.f200410c, managerUspArguments.f200410c) && L.f(this.f200411d, managerUspArguments.f200411d);
    }

    public final int hashCode() {
        int iHashCode = this.f200409b.hashCode() * 31;
        String str = this.f200410c;
        return this.f200411d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ManagerUspArguments(flowType=");
        sb2.append(this.f200409b);
        sb2.append(", applicationId=");
        sb2.append(this.f200410c);
        sb2.append(", role=");
        return C22026a.c(sb2, this.f200411d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200409b);
        parcel.writeString(this.f200410c);
        parcel.writeString(this.f200411d);
    }
}
