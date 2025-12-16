package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: DeliveryCourierLocationSelectLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/UniversalDeliveryCourierLocationSelectLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class UniversalDeliveryCourierLocationSelectLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<UniversalDeliveryCourierLocationSelectLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f133744b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133745c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133746d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f133747e;

    /* compiled from: DeliveryCourierLocationSelectLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UniversalDeliveryCourierLocationSelectLink> {
        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryCourierLocationSelectLink createFromParcel(Parcel parcel) {
            return new UniversalDeliveryCourierLocationSelectLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final UniversalDeliveryCourierLocationSelectLink[] newArray(int i12) {
            return new UniversalDeliveryCourierLocationSelectLink[i12];
        }
    }

    public UniversalDeliveryCourierLocationSelectLink(@Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.k String str4) {
        this.f133744b = str;
        this.f133745c = str2;
        this.f133746d = str3;
        this.f133747e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133744b);
        parcel.writeString(this.f133745c);
        parcel.writeString(this.f133746d);
        parcel.writeString(this.f133747e);
    }
}
