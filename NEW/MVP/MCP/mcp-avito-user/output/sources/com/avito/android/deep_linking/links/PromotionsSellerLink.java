package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PromotionsSellerLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PromotionsSellerLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class PromotionsSellerLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PromotionsSellerLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133615b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133616c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f133617d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f133618e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133619f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f133620g;

    /* compiled from: PromotionsSellerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PromotionsSellerLink> {
        @Override // android.os.Parcelable.Creator
        public final PromotionsSellerLink createFromParcel(Parcel parcel) {
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
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(PromotionsSellerLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PromotionsSellerLink(string, string2, string3, string4, string5, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionsSellerLink[] newArray(int i12) {
            return new PromotionsSellerLink[i12];
        }
    }

    /* compiled from: PromotionsSellerLink.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PromotionsSellerLink$b;", "", "a", "Lcom/avito/android/deep_linking/links/PromotionsSellerLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PromotionsSellerLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/PromotionsSellerLink$b$a;", "Lcom/avito/android/deep_linking/links/PromotionsSellerLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133621b = new a();
        }
    }

    public PromotionsSellerLink(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4, @Y61.l String str5, @Y61.l Map<String, ? extends Object> map) {
        this.f133615b = str;
        this.f133616c = str2;
        this.f133617d = str3;
        this.f133618e = str4;
        this.f133619f = str5;
        this.f133620g = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionsSellerLink)) {
            return false;
        }
        PromotionsSellerLink promotionsSellerLink = (PromotionsSellerLink) obj;
        return kotlin.jvm.internal.L.f(this.f133615b, promotionsSellerLink.f133615b) && kotlin.jvm.internal.L.f(this.f133616c, promotionsSellerLink.f133616c) && kotlin.jvm.internal.L.f(this.f133617d, promotionsSellerLink.f133617d) && kotlin.jvm.internal.L.f(this.f133618e, promotionsSellerLink.f133618e) && kotlin.jvm.internal.L.f(this.f133619f, promotionsSellerLink.f133619f) && kotlin.jvm.internal.L.f(this.f133620g, promotionsSellerLink.f133620g);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(androidx.compose.foundation.H.d(this.f133615b.hashCode() * 31, 31, this.f133616c), 31, this.f133617d), 31, this.f133618e);
        String str = this.f133619f;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, Object> map = this.f133620g;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PromotionsSellerLink(sellerId=");
        sb2.append(this.f133615b);
        sb2.append(", initialRequest=");
        sb2.append(this.f133616c);
        sb2.append(", itemsUpdateRequest=");
        sb2.append(this.f133617d);
        sb2.append(", paginationRequest=");
        sb2.append(this.f133618e);
        sb2.append(", updatePromotionRequest=");
        sb2.append(this.f133619f);
        sb2.append(", extraParameters=");
        return androidx.appcompat.app.r.w(sb2, this.f133620g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133615b);
        parcel.writeString(this.f133616c);
        parcel.writeString(this.f133617d);
        parcel.writeString(this.f133618e);
        parcel.writeString(this.f133619f);
        Map<String, Object> map = this.f133620g;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            org.webrtc.h.h(parcel, (String) entry.getKey(), entry);
        }
    }
}
