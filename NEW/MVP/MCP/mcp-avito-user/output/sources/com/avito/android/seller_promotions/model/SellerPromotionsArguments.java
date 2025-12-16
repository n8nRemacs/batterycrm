package com.avito.android.seller_promotions.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import org.webrtc.h;

/* compiled from: SellerPromotionsArguments.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/seller_promotions/model/SellerPromotionsArguments;", "Landroid/os/Parcelable;", "_avito_seller-promotions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SellerPromotionsArguments implements Parcelable {

    @k
    public static final Parcelable.Creator<SellerPromotionsArguments> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f267877b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f267878c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f267879d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f267880e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f267881f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Map<String, Object> f267882g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f267883h;

    /* compiled from: SellerPromotionsArguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellerPromotionsArguments> {
        @Override // android.os.Parcelable.Creator
        public final SellerPromotionsArguments createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = h.c(SellerPromotionsArguments.class, parcel, linkedHashMap, parcel.readString(), iC2, 1);
                }
            }
            return new SellerPromotionsArguments(string, string2, string3, linkedHashMap, string4, string5, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SellerPromotionsArguments[] newArray(int i12) {
            return new SellerPromotionsArguments[i12];
        }
    }

    public SellerPromotionsArguments(@k String str, @k String str2, @k String str3, @l Map map, @k String str4, @l String str5, @l String str6) {
        this.f267877b = str;
        this.f267878c = str2;
        this.f267879d = str3;
        this.f267880e = str4;
        this.f267881f = str5;
        this.f267882g = map;
        this.f267883h = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerPromotionsArguments)) {
            return false;
        }
        SellerPromotionsArguments sellerPromotionsArguments = (SellerPromotionsArguments) obj;
        return L.f(this.f267877b, sellerPromotionsArguments.f267877b) && L.f(this.f267878c, sellerPromotionsArguments.f267878c) && L.f(this.f267879d, sellerPromotionsArguments.f267879d) && L.f(this.f267880e, sellerPromotionsArguments.f267880e) && L.f(this.f267881f, sellerPromotionsArguments.f267881f) && L.f(this.f267882g, sellerPromotionsArguments.f267882g) && L.f(this.f267883h, sellerPromotionsArguments.f267883h);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f267877b.hashCode() * 31, 31, this.f267878c), 31, this.f267879d), 31, this.f267880e);
        String str = this.f267881f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.f267882g;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f267883h;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SellerPromotionsArguments(sellerId=");
        sb2.append(this.f267877b);
        sb2.append(", initialRequest=");
        sb2.append(this.f267878c);
        sb2.append(", itemsUpdateRequest=");
        sb2.append(this.f267879d);
        sb2.append(", paginationRequest=");
        sb2.append(this.f267880e);
        sb2.append(", updatePromotionRequest=");
        sb2.append(this.f267881f);
        sb2.append(", extraParameters=");
        sb2.append(this.f267882g);
        sb2.append(", context=");
        return C22026a.c(sb2, this.f267883h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f267877b);
        parcel.writeString(this.f267878c);
        parcel.writeString(this.f267879d);
        parcel.writeString(this.f267880e);
        parcel.writeString(this.f267881f);
        Map<String, Object> map = this.f267882g;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                h.h(parcel, (String) entry.getKey(), entry);
            }
        }
        parcel.writeString(this.f267883h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SellerPromotionsArguments(String str, String str2, String str3, String str4, String str5, Map map, String str6, int i12, C42822w c42822w) {
        String str7;
        if ((i12 & 64) != 0) {
            Object obj = map != null ? map.get("context") : null;
            str7 = obj instanceof String ? (String) obj : null;
        } else {
            str7 = str6;
        }
        this(str, str2, str3, map, str4, str5, str7);
    }
}
