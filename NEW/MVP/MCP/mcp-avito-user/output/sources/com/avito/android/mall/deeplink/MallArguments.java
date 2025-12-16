package com.avito.android.mall.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MallArguments.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mall/deeplink/MallArguments;", "Landroid/os/Parcelable;", "_avito_mall_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MallArguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<MallArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f184257b;

    /* compiled from: MallArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MallArguments> {
        @Override // android.os.Parcelable.Creator
        public final MallArguments createFromParcel(Parcel parcel) {
            return new MallArguments(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MallArguments[] newArray(int i12) {
            return new MallArguments[i12];
        }
    }

    public MallArguments(@Y61.l String str) {
        this.f184257b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MallArguments) && L.f(this.f184257b, ((MallArguments) obj).f184257b);
    }

    public final int hashCode() {
        String str = this.f184257b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("MallArguments(fromPage="), this.f184257b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f184257b);
    }
}
