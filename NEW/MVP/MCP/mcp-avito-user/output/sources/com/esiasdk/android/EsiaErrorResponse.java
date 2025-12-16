package com.esiasdk.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EsiaErrorResponse.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/esiasdk/android/EsiaErrorResponse;", "Landroid/os/Parcelable;", "Ljava/lang/Exception;", "esiasdk-1.1.3(6)_nonPguRelease"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class EsiaErrorResponse extends Exception implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<EsiaErrorResponse> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f339674b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f339675c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f339676d;

    /* compiled from: EsiaErrorResponse.kt */
    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EsiaErrorResponse> {
        @Override // android.os.Parcelable.Creator
        public final EsiaErrorResponse createFromParcel(Parcel parcel) {
            return new EsiaErrorResponse(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final EsiaErrorResponse[] newArray(int i12) {
            return new EsiaErrorResponse[i12];
        }
    }

    public EsiaErrorResponse() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EsiaErrorResponse)) {
            return false;
        }
        EsiaErrorResponse esiaErrorResponse = (EsiaErrorResponse) obj;
        return L.f(this.f339674b, esiaErrorResponse.f339674b) && L.f(this.f339675c, esiaErrorResponse.f339675c) && L.f(this.f339676d, esiaErrorResponse.f339676d);
    }

    public final int hashCode() {
        Integer num = this.f339674b;
        return this.f339676d.hashCode() + H.d((num == null ? 0 : num.hashCode()) * 31, 31, this.f339675c);
    }

    @Override // java.lang.Throwable
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EsiaErrorResponse(code=");
        sb2.append(this.f339674b);
        sb2.append(", esiaCode=");
        sb2.append(this.f339675c);
        sb2.append(", description=");
        return AK.c.s(sb2, this.f339676d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f339674b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f339675c);
        parcel.writeString(this.f339676d);
    }

    public /* synthetic */ EsiaErrorResponse(Integer num, String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 1 : num, (i12 & 2) != 0 ? "" : str, (i12 & 4) != 0 ? "Something went wrong" : str2);
    }

    public EsiaErrorResponse(@Y61.l Integer num, @Y61.k String str, @Y61.k String str2) {
        this.f339674b = num;
        this.f339675c = str;
        this.f339676d = str2;
    }
}
