package com.avito.android.mortgage.root.list.items.immutable_info.description.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.items.application.ImmutableInfoDescription;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImmutableInfoDescriptionArguments.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/immutable_info/description/model/ImmutableInfoDescriptionArguments;", "Landroid/os/Parcelable;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ImmutableInfoDescriptionArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<ImmutableInfoDescriptionArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ImmutableInfoDescription f202606b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202607c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f202608d;

    /* compiled from: ImmutableInfoDescriptionArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImmutableInfoDescriptionArguments> {
        @Override // android.os.Parcelable.Creator
        public final ImmutableInfoDescriptionArguments createFromParcel(Parcel parcel) {
            return new ImmutableInfoDescriptionArguments(ImmutableInfoDescription.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImmutableInfoDescriptionArguments[] newArray(int i12) {
            return new ImmutableInfoDescriptionArguments[i12];
        }
    }

    public ImmutableInfoDescriptionArguments(@k ImmutableInfoDescription immutableInfoDescription, @k String str, @k String str2) {
        this.f202606b = immutableInfoDescription;
        this.f202607c = str;
        this.f202608d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImmutableInfoDescriptionArguments)) {
            return false;
        }
        ImmutableInfoDescriptionArguments immutableInfoDescriptionArguments = (ImmutableInfoDescriptionArguments) obj;
        return L.f(this.f202606b, immutableInfoDescriptionArguments.f202606b) && L.f(this.f202607c, immutableInfoDescriptionArguments.f202607c) && L.f(this.f202608d, immutableInfoDescriptionArguments.f202608d);
    }

    public final int hashCode() {
        return this.f202608d.hashCode() + H.d(this.f202606b.hashCode() * 31, 31, this.f202607c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImmutableInfoDescriptionArguments(content=");
        sb2.append(this.f202606b);
        sb2.append(", applicationId=");
        sb2.append(this.f202607c);
        sb2.append(", currentMortgageStage=");
        return C22026a.c(sb2, this.f202608d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f202606b.writeToParcel(parcel, i12);
        parcel.writeString(this.f202607c);
        parcel.writeString(this.f202608d);
    }
}
