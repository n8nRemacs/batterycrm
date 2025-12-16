package com.avito.android.sx_address.list.domain;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ScreenData.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/list/domain/PromotionImageData;", "Landroid/os/Parcelable;", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class PromotionImageData implements Parcelable {

    @k
    public static final Parcelable.Creator<PromotionImageData> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Image f293164b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Image f293165c;

    /* compiled from: ScreenData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromotionImageData> {
        @Override // android.os.Parcelable.Creator
        public final PromotionImageData createFromParcel(Parcel parcel) {
            return new PromotionImageData((Image) parcel.readParcelable(PromotionImageData.class.getClassLoader()), (Image) parcel.readParcelable(PromotionImageData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionImageData[] newArray(int i12) {
            return new PromotionImageData[i12];
        }
    }

    public PromotionImageData(@k Image image, @k Image image2) {
        this.f293164b = image;
        this.f293165c = image2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionImageData)) {
            return false;
        }
        PromotionImageData promotionImageData = (PromotionImageData) obj;
        return L.f(this.f293164b, promotionImageData.f293164b) && L.f(this.f293165c, promotionImageData.f293165c);
    }

    public final int hashCode() {
        return this.f293165c.hashCode() + (this.f293164b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromotionImageData(darkImage=");
        sb2.append(this.f293164b);
        sb2.append(", lightImage=");
        return AK.c.o(sb2, this.f293165c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f293164b, i12);
        parcel.writeParcelable(this.f293165c, i12);
    }
}
