package com.avito.android.item_price_history.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ItemPriceHistoryLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/item_price_history/deeplink/ItemPriceHistoryLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "_avito_item-price-history_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes14.dex */
public final /* data */ class ItemPriceHistoryLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ItemPriceHistoryLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173656b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f173657c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f173658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f173659e;

    /* compiled from: ItemPriceHistoryLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/item_price_history/deeplink/ItemPriceHistoryLink$a;", "", "<init>", "()V", "", "KEY_CONTEXT", "Ljava/lang/String;", "KEY_IS_FAVORITE", "_avito_item-price-history_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ItemPriceHistoryLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ItemPriceHistoryLink> {
        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryLink createFromParcel(Parcel parcel) {
            return new ItemPriceHistoryLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final ItemPriceHistoryLink[] newArray(int i12) {
            return new ItemPriceHistoryLink[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ItemPriceHistoryLink(@k String str, @k String str2, @k String str3, int i12) {
        this.f173656b = str;
        this.f173657c = str2;
        this.f173658d = str3;
        this.f173659e = i12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemPriceHistoryLink)) {
            return false;
        }
        ItemPriceHistoryLink itemPriceHistoryLink = (ItemPriceHistoryLink) obj;
        return L.f(this.f173656b, itemPriceHistoryLink.f173656b) && L.f(this.f173657c, itemPriceHistoryLink.f173657c) && L.f(this.f173658d, itemPriceHistoryLink.f173658d) && this.f173659e == itemPriceHistoryLink.f173659e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f173659e) + H.d(H.d(this.f173656b.hashCode() * 31, 31, this.f173657c), 31, this.f173658d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemPriceHistoryLink(itemId=");
        sb2.append(this.f173656b);
        sb2.append(", categoryId=");
        sb2.append(this.f173657c);
        sb2.append(", microcatId=");
        sb2.append(this.f173658d);
        sb2.append(", skeletonsCount=");
        return r.t(sb2, this.f173659e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173656b);
        parcel.writeString(this.f173657c);
        parcel.writeString(this.f173658d);
        parcel.writeInt(this.f173659e);
    }
}
