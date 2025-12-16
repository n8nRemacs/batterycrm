package com.avito.android.deep_linking.links;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AdvertDetailsScrollToPositionEmptyLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AdvertDetailsScrollToPositionEmptyLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class AdvertDetailsScrollToPositionEmptyLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsScrollToPositionEmptyLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Integer f132971b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f132972c;

    /* compiled from: AdvertDetailsScrollToPositionEmptyLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsScrollToPositionEmptyLink> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsScrollToPositionEmptyLink createFromParcel(Parcel parcel) {
            return new AdvertDetailsScrollToPositionEmptyLink(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsScrollToPositionEmptyLink[] newArray(int i12) {
            return new AdvertDetailsScrollToPositionEmptyLink[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertDetailsScrollToPositionEmptyLink() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.f132971b;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeString(this.f132972c);
    }

    public /* synthetic */ AdvertDetailsScrollToPositionEmptyLink(Integer num, String str, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : num, (i12 & 2) != 0 ? null : str);
    }

    public AdvertDetailsScrollToPositionEmptyLink(@Y61.l Integer num, @Y61.l String str) {
        this.f132971b = num;
        this.f132972c = str;
    }
}
