package com.avito.android.iac_dialer_models.abstract_module;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: IacCanCallData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_models/abstract_module/IacCanCallData;", "Landroid/os/Parcelable;", "_avito_iac-dialer-models_abstract"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class IacCanCallData implements Parcelable {

    @k
    public static final Parcelable.Creator<IacCanCallData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f166855b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f166856c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f166857d;

    /* compiled from: IacCanCallData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IacCanCallData> {
        @Override // android.os.Parcelable.Creator
        public final IacCanCallData createFromParcel(Parcel parcel) {
            return new IacCanCallData(parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final IacCanCallData[] newArray(int i12) {
            return new IacCanCallData[i12];
        }
    }

    public IacCanCallData(@l String str, boolean z12, @l String str2) {
        this.f166855b = str;
        this.f166856c = z12;
        this.f166857d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IacCanCallData)) {
            return false;
        }
        IacCanCallData iacCanCallData = (IacCanCallData) obj;
        return L.f(this.f166855b, iacCanCallData.f166855b) && this.f166856c == iacCanCallData.f166856c && L.f(this.f166857d, iacCanCallData.f166857d);
    }

    public final int hashCode() {
        String str = this.f166855b;
        int i12 = r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f166856c);
        String str2 = this.f166857d;
        return i12 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IacCanCallData(analyticsInfo=");
        sb2.append(this.f166855b);
        sb2.append(", canVideoCall=");
        sb2.append(this.f166856c);
        sb2.append(", callOptionsType=");
        return C22026a.c(sb2, this.f166857d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f166855b);
        parcel.writeInt(this.f166856c ? 1 : 0);
        parcel.writeString(this.f166857d);
    }

    public /* synthetic */ IacCanCallData(String str, boolean z12, String str2, int i12, C42822w c42822w) {
        this(str, z12, (i12 & 4) != 0 ? null : str2);
    }
}
