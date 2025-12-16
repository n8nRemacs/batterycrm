package com.avito.android.floating_buy_block;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FloatingBuyBlockItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/floating_buy_block/FloatingBuyBlockItem;", "Landroid/os/Parcelable;", "_avito_floating-buy-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class FloatingBuyBlockItem implements Parcelable {

    @k
    public static final Parcelable.Creator<FloatingBuyBlockItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f158437b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f158438c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f158439d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DeepLink f158440e;

    /* compiled from: FloatingBuyBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<FloatingBuyBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final FloatingBuyBlockItem createFromParcel(Parcel parcel) {
            return new FloatingBuyBlockItem(parcel.readString(), parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(FloatingBuyBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FloatingBuyBlockItem[] newArray(int i12) {
            return new FloatingBuyBlockItem[i12];
        }
    }

    public FloatingBuyBlockItem(@k String str, @k String str2, @k String str3, @k DeepLink deepLink) {
        this.f158437b = str;
        this.f158438c = str2;
        this.f158439d = str3;
        this.f158440e = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FloatingBuyBlockItem)) {
            return false;
        }
        FloatingBuyBlockItem floatingBuyBlockItem = (FloatingBuyBlockItem) obj;
        return L.f(this.f158437b, floatingBuyBlockItem.f158437b) && L.f(this.f158438c, floatingBuyBlockItem.f158438c) && L.f(this.f158439d, floatingBuyBlockItem.f158439d) && L.f(this.f158440e, floatingBuyBlockItem.f158440e);
    }

    public final int hashCode() {
        return this.f158440e.hashCode() + H.d(H.d(this.f158437b.hashCode() * 31, 31, this.f158438c), 31, this.f158439d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FloatingBuyBlockItem(title=");
        sb2.append(this.f158437b);
        sb2.append(", price=");
        sb2.append(this.f158438c);
        sb2.append(", imagePreviewUrl=");
        sb2.append(this.f158439d);
        sb2.append(", buyButtonDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f158440e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f158437b);
        parcel.writeString(this.f158438c);
        parcel.writeString(this.f158439d);
        parcel.writeParcelable(this.f158440e, i12);
    }
}
