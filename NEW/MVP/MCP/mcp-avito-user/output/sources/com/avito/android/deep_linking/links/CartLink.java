package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.util.C35755b0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: CartLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/CartLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class CartLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<CartLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f133088b;

    /* compiled from: CartLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CartLink> {
        @Override // android.os.Parcelable.Creator
        public final CartLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(CartLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CartLink(linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final CartLink[] newArray(int i12) {
            return new CartLink[i12];
        }
    }

    /* compiled from: CartLink.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/CartLink$b;", "", "<init>", "()V", "a", "Lcom/avito/android/deep_linking/links/CartLink$b$a;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: CartLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/CartLink$b$a;", "Lcom/avito/android/deep_linking/links/CartLink$b;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f133089b = new a();

            public a() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public CartLink(@Y61.l Map<String, ? extends Object> map) {
        this.f133088b = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CartLink) && kotlin.jvm.internal.L.f(this.f133088b, ((CartLink) obj).f133088b);
    }

    public final int hashCode() {
        Map<String, Object> map = this.f133088b;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("CartLink(extraParameters="), this.f133088b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Map<String, Object> map = this.f133088b;
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

    public /* synthetic */ CartLink(String str, String str2, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2);
    }

    public CartLink(@Y61.l String str, @Y61.l String str2) {
        this(C35755b0.c(P0.g(new Q("context", str), new Q("segment", str2))));
    }
}
