package com.avito.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: UtmHelper.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/util/UtmParamsV2;", "Landroid/os/Parcelable;", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UtmParamsV2 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f318754b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f318755c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f318756d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f318757e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f318758f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public static final a f318753g = new a(null);

    @Y61.k
    public static final Parcelable.Creator<UtmParamsV2> CREATOR = new b();

    /* compiled from: UtmHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/util/UtmParamsV2$a;", "", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UtmHelper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UtmParamsV2> {
        @Override // android.os.Parcelable.Creator
        public final UtmParamsV2 createFromParcel(Parcel parcel) {
            return new UtmParamsV2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UtmParamsV2[] newArray(int i12) {
            return new UtmParamsV2[i12];
        }
    }

    public UtmParamsV2() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UtmParamsV2)) {
            return false;
        }
        UtmParamsV2 utmParamsV2 = (UtmParamsV2) obj;
        return kotlin.jvm.internal.L.f(this.f318754b, utmParamsV2.f318754b) && kotlin.jvm.internal.L.f(this.f318755c, utmParamsV2.f318755c) && kotlin.jvm.internal.L.f(this.f318756d, utmParamsV2.f318756d) && kotlin.jvm.internal.L.f(this.f318757e, utmParamsV2.f318757e) && kotlin.jvm.internal.L.f(this.f318758f, utmParamsV2.f318758f);
    }

    public final int hashCode() {
        String str = this.f318754b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f318755c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f318756d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f318757e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f318758f;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UtmParamsV2(medium=");
        sb2.append(this.f318754b);
        sb2.append(", source=");
        sb2.append(this.f318755c);
        sb2.append(", campaign=");
        sb2.append(this.f318756d);
        sb2.append(", content=");
        sb2.append(this.f318757e);
        sb2.append(", term=");
        return C22026a.c(sb2, this.f318758f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f318754b);
        parcel.writeString(this.f318755c);
        parcel.writeString(this.f318756d);
        parcel.writeString(this.f318757e);
        parcel.writeString(this.f318758f);
    }

    public UtmParamsV2(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f318754b = str;
        this.f318755c = str2;
        this.f318756d = str3;
        this.f318757e = str4;
        this.f318758f = str5;
    }

    public /* synthetic */ UtmParamsV2(String str, String str2, String str3, String str4, String str5, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5);
    }
}
