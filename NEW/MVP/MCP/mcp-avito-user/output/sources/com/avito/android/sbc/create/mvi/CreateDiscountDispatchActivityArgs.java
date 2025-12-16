package com.avito.android.sbc.create.mvi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: CreateDiscountDispatchActivityArgs.kt */
@K51.d
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sbc/create/mvi/CreateDiscountDispatchActivityArgs;", "Landroid/os/Parcelable;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CreateDiscountDispatchActivityArgs implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<CreateDiscountDispatchActivityArgs> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f259240b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f259241c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f259242d;

    /* compiled from: CreateDiscountDispatchActivityArgs.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CreateDiscountDispatchActivityArgs> {
        @Override // android.os.Parcelable.Creator
        public final CreateDiscountDispatchActivityArgs createFromParcel(Parcel parcel) {
            return new CreateDiscountDispatchActivityArgs(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CreateDiscountDispatchActivityArgs[] newArray(int i12) {
            return new CreateDiscountDispatchActivityArgs[i12];
        }
    }

    public CreateDiscountDispatchActivityArgs(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        this.f259240b = str;
        this.f259241c = str2;
        this.f259242d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateDiscountDispatchActivityArgs)) {
            return false;
        }
        CreateDiscountDispatchActivityArgs createDiscountDispatchActivityArgs = (CreateDiscountDispatchActivityArgs) obj;
        return kotlin.jvm.internal.L.f(this.f259240b, createDiscountDispatchActivityArgs.f259240b) && kotlin.jvm.internal.L.f(this.f259241c, createDiscountDispatchActivityArgs.f259241c) && kotlin.jvm.internal.L.f(this.f259242d, createDiscountDispatchActivityArgs.f259242d);
    }

    public final int hashCode() {
        int iHashCode = this.f259240b.hashCode() * 31;
        String str = this.f259241c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f259242d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CreateDiscountDispatchActivityArgs(itemId=");
        sb2.append(this.f259240b);
        sb2.append(", action=");
        sb2.append(this.f259241c);
        sb2.append(", from=");
        return C22026a.c(sb2, this.f259242d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f259240b);
        parcel.writeString(this.f259241c);
        parcel.writeString(this.f259242d);
    }
}
