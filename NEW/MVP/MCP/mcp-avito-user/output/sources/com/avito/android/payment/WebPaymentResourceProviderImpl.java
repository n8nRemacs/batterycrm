package com.avito.android.payment;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: WebPaymentResourceProvider.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/payment/WebPaymentResourceProviderImpl;", "Lcom/avito/android/payment/o;", "Landroid/os/Parcelable;", "_avito_payment_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public class WebPaymentResourceProviderImpl implements o, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<WebPaymentResourceProviderImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f213985b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f213986c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f213987d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f213988e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final String f213989f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f213990g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f213991h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f213992i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f213993j;

    /* renamed from: k, reason: collision with root package name */
    public final int f213994k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final String f213995l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final String f213996m;

    /* compiled from: WebPaymentResourceProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<WebPaymentResourceProviderImpl> {
        @Override // android.os.Parcelable.Creator
        public final WebPaymentResourceProviderImpl createFromParcel(Parcel parcel) {
            return new WebPaymentResourceProviderImpl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WebPaymentResourceProviderImpl[] newArray(int i12) {
            return new WebPaymentResourceProviderImpl[i12];
        }
    }

    public WebPaymentResourceProviderImpl(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k String str4, @Y61.k String str5, @Y61.k String str6, @Y61.k String str7, @Y61.k String str8, @Y61.k String str9, int i12, @Y61.k String str10, @Y61.k String str11) {
        this.f213985b = str;
        this.f213986c = str2;
        this.f213987d = str3;
        this.f213988e = str4;
        this.f213989f = str5;
        this.f213990g = str6;
        this.f213991h = str7;
        this.f213992i = str8;
        this.f213993j = str9;
        this.f213994k = i12;
        this.f213995l = str10;
        this.f213996m = str11;
    }

    @Override // com.avito.android.payment.o
    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getF213985b() {
        return this.f213985b;
    }

    @Override // com.avito.android.payment.o
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getF213995l() {
        return this.f213995l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.payment.o
    @Y61.l
    /* renamed from: e, reason: from getter */
    public final String getF213987d() {
        return this.f213987d;
    }

    @Override // com.avito.android.payment.o
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getF213993j() {
        return this.f213993j;
    }

    @Override // com.avito.android.payment.o
    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getF213996m() {
        return this.f213996m;
    }

    @Override // com.avito.android.payment.o
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final String getF213988e() {
        return this.f213988e;
    }

    @Override // com.avito.android.payment.o
    @Y61.l
    /* renamed from: i, reason: from getter */
    public final String getF213986c() {
        return this.f213986c;
    }

    @Override // com.avito.android.payment.o
    @Y61.k
    /* renamed from: j, reason: from getter */
    public final String getF213989f() {
        return this.f213989f;
    }

    @Override // com.avito.android.payment.o
    /* renamed from: k, reason: from getter */
    public final int getF213994k() {
        return this.f213994k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f213985b);
        parcel.writeString(this.f213986c);
        parcel.writeString(this.f213987d);
        parcel.writeString(this.f213988e);
        parcel.writeString(this.f213989f);
        parcel.writeString(this.f213990g);
        parcel.writeString(this.f213991h);
        parcel.writeString(this.f213992i);
        parcel.writeString(this.f213993j);
        parcel.writeInt(this.f213994k);
        parcel.writeString(this.f213995l);
        parcel.writeString(this.f213996m);
    }
}
