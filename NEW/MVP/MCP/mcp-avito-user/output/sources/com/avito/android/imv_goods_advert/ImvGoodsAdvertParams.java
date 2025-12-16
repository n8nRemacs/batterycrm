package com.avito.android.imv_goods_advert;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvGoodsAdvertParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_advert/ImvGoodsAdvertParams;", "Lcom/avito/android/util/OpenParams;", "_avito_imv-goods-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvGoodsAdvertParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<ImvGoodsAdvertParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f170311b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f170312c;

    /* compiled from: ImvGoodsAdvertParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvGoodsAdvertParams> {
        @Override // android.os.Parcelable.Creator
        public final ImvGoodsAdvertParams createFromParcel(Parcel parcel) {
            return new ImvGoodsAdvertParams(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvGoodsAdvertParams[] newArray(int i12) {
            return new ImvGoodsAdvertParams[i12];
        }
    }

    public ImvGoodsAdvertParams(@Y61.k String str, @Y61.k String str2) {
        this.f170311b = str;
        this.f170312c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvGoodsAdvertParams)) {
            return false;
        }
        ImvGoodsAdvertParams imvGoodsAdvertParams = (ImvGoodsAdvertParams) obj;
        return L.f(this.f170311b, imvGoodsAdvertParams.f170311b) && L.f(this.f170312c, imvGoodsAdvertParams.f170312c);
    }

    public final int hashCode() {
        return this.f170312c.hashCode() + (this.f170311b.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvGoodsAdvertParams(params=");
        sb2.append(this.f170311b);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f170312c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f170311b);
        parcel.writeString(this.f170312c);
    }
}
