package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DeliveryCourierLocationSelectLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryCourierLocationSelectLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class DeliveryCourierLocationSelectLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliveryCourierLocationSelectLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f133180b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133181c;

    /* compiled from: DeliveryCourierLocationSelectLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DeliveryCourierLocationSelectLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryCourierLocationSelectLink createFromParcel(Parcel parcel) {
            return new DeliveryCourierLocationSelectLink(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryCourierLocationSelectLink[] newArray(int i12) {
            return new DeliveryCourierLocationSelectLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeliveryCourierLocationSelectLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f133180b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f133181c);
    }

    public /* synthetic */ DeliveryCourierLocationSelectLink(Integer num, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str);
    }

    public DeliveryCourierLocationSelectLink(@Y61.l Integer num, @Y61.l String str) {
        this.f133180b = num;
        this.f133181c = str;
    }
}
