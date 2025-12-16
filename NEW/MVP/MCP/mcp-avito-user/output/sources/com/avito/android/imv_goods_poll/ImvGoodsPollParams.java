package com.avito.android.imv_goods_poll;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.ImvGoodsPollLinkBody;
import com.avito.android.util.OpenParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ImvGoodsPollParams.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/imv_goods_poll/ImvGoodsPollParams;", "Lcom/avito/android/util/OpenParams;", "_avito_imv-goods-poll_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ImvGoodsPollParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<ImvGoodsPollParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ImvGoodsPollLinkBody f170610b;

    /* renamed from: c, reason: collision with root package name */
    public final long f170611c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f170612d;

    /* compiled from: ImvGoodsPollParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ImvGoodsPollParams> {
        @Override // android.os.Parcelable.Creator
        public final ImvGoodsPollParams createFromParcel(Parcel parcel) {
            return new ImvGoodsPollParams((ImvGoodsPollLinkBody) parcel.readParcelable(ImvGoodsPollParams.class.getClassLoader()), parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ImvGoodsPollParams[] newArray(int i12) {
            return new ImvGoodsPollParams[i12];
        }
    }

    public ImvGoodsPollParams(@Y61.k ImvGoodsPollLinkBody imvGoodsPollLinkBody, long j12, @Y61.k String str) {
        this.f170610b = imvGoodsPollLinkBody;
        this.f170611c = j12;
        this.f170612d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImvGoodsPollParams)) {
            return false;
        }
        ImvGoodsPollParams imvGoodsPollParams = (ImvGoodsPollParams) obj;
        return L.f(this.f170610b, imvGoodsPollParams.f170610b) && this.f170611c == imvGoodsPollParams.f170611c && L.f(this.f170612d, imvGoodsPollParams.f170612d);
    }

    public final int hashCode() {
        return this.f170612d.hashCode() + r.g(this.f170610b.hashCode() * 31, 31, this.f170611c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ImvGoodsPollParams(imvGoodsPollLinkBody=");
        sb2.append(this.f170610b);
        sb2.append(", itemId=");
        sb2.append(this.f170611c);
        sb2.append(", slugAnswer=");
        return C22026a.c(sb2, this.f170612d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f170610b, i12);
        parcel.writeLong(this.f170611c);
        parcel.writeString(this.f170612d);
    }
}
