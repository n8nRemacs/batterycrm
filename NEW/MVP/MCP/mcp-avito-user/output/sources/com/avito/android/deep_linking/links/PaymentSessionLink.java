package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.payment.service.OrderItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: PaymentSessionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/PaymentSessionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class PaymentSessionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<PaymentSessionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<OrderItem> f133562b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133563c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133564d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133565e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f133566f;

    /* compiled from: PaymentSessionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PaymentSessionLink> {
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            int i12 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashSet.add(OrderItem.CREATOR.createFromParcel(parcel));
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iC2 = 0;
                while (iC2 != i14) {
                    iC2 = org.webrtc.h.c(PaymentSessionLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new PaymentSessionLink(linkedHashSet, string, string2, string3, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentSessionLink[] newArray(int i12) {
            return new PaymentSessionLink[i12];
        }
    }

    /* compiled from: PaymentSessionLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/avito/android/deep_linking/links/PaymentSessionLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/deep_linking/links/LegacyPaymentSessionLink$b$a;", "Lcom/avito/android/deep_linking/links/PaymentSessionLink$b$a;", "Lcom/avito/android/deep_linking/links/PaymentSessionLink$b$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: PaymentSessionLink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PaymentSessionLink$b$a;", "Lcom/avito/android/deep_linking/links/PaymentSessionLink$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final String f133567b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f133568c;

            public a(@Y61.l String str, boolean z12) {
                super(null);
                this.f133567b = str;
                this.f133568c = z12;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return kotlin.jvm.internal.L.f(this.f133567b, aVar.f133567b) && this.f133568c == aVar.f133568c;
            }

            public final int hashCode() {
                String str = this.f133567b;
                return Boolean.hashCode(this.f133568c) + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Cancelled(title=");
                sb2.append(this.f133567b);
                sb2.append(", finishFlow=");
                return androidx.appcompat.app.r.x(sb2, this.f133568c, ')');
            }

            public /* synthetic */ a(String str, boolean z12, int i12, C42822w c42822w) {
                this(str, (i12 & 2) != 0 ? true : z12);
            }
        }

        /* compiled from: PaymentSessionLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/PaymentSessionLink$b$b;", "Lcom/avito/android/deep_linking/links/PaymentSessionLink$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.PaymentSessionLink$b$b, reason: collision with other inner class name */
        public static final class C4013b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C4013b f133569b = new C4013b();

            public C4013b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ PaymentSessionLink(Set set, String str, String str2, String str3, Map map, int i12, C42822w c42822w) {
        this(set, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Set<OrderItem> set = this.f133562b;
        parcel.writeInt(set.size());
        Iterator<OrderItem> it = set.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f133563c);
        parcel.writeString(this.f133564d);
        parcel.writeString(this.f133565e);
        Map<String, Object> map = this.f133566f;
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

    public PaymentSessionLink(@Y61.k Set<OrderItem> set, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Map<String, ? extends Object> map) {
        this.f133562b = set;
        this.f133563c = str;
        this.f133564d = str2;
        this.f133565e = str3;
        this.f133566f = map;
    }
}
