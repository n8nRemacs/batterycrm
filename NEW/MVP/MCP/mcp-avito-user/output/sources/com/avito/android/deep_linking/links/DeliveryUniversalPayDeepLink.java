package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.util.C4;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: DeliveryUniversalPayDeepLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "a", "c", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class DeliveryUniversalPayDeepLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<DeliveryUniversalPayDeepLink> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f133227b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f133228c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f133229d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f133230e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f133231f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f133232g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Map<String, Object> f133233h;

    /* compiled from: DeliveryUniversalPayDeepLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$a;", "", "<init>", "()V", "", "LEGACY_CHECKOUT", "Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: DeliveryUniversalPayDeepLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<DeliveryUniversalPayDeepLink> {
        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalPayDeepLink createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = org.webrtc.h.c(DeliveryUniversalPayDeepLink.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new DeliveryUniversalPayDeepLink(string, string2, string3, string4, string5, linkedHashMap, z12);
        }

        @Override // android.os.Parcelable.Creator
        public final DeliveryUniversalPayDeepLink[] newArray(int i12) {
            return new DeliveryUniversalPayDeepLink[i12];
        }
    }

    /* compiled from: DeliveryUniversalPayDeepLink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c$a;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c$b;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c$c;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class c {

        /* compiled from: DeliveryUniversalPayDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c$a;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c;", "LJu/c$b;", "Lcom/avito/android/util/C4;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends c implements InterfaceC14249c.b, C4 {

            /* renamed from: b, reason: collision with root package name */
            @Y61.l
            public final List<BeduinAction> f133234b;

            /* JADX WARN: Multi-variable type inference failed */
            public a(@Y61.l List<? extends BeduinAction> list) {
                super(null);
                this.f133234b = list;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f133234b, ((a) obj).f133234b);
            }

            @Override // com.avito.android.util.C4
            @Y61.l
            public final List<BeduinAction> getActions() {
                return this.f133234b;
            }

            public final int hashCode() {
                List<BeduinAction> list = this.f133234b;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            @Y61.k
            public final String toString() {
                return androidx.compose.foundation.H.p(new StringBuilder("Canceled(actions="), this.f133234b, ')');
            }
        }

        /* compiled from: DeliveryUniversalPayDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c$b;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends c implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final b f133235b = new b();

            public b() {
                super(null);
            }
        }

        /* compiled from: DeliveryUniversalPayDeepLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c$c;", "Lcom/avito/android/deep_linking/links/DeliveryUniversalPayDeepLink$c;", "LJu/c$a;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.links.DeliveryUniversalPayDeepLink$c$c, reason: collision with other inner class name */
        public static final class C3994c extends c implements InterfaceC14249c.a {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3994c f133236b = new C3994c();

            public C3994c() {
                super(null);
            }
        }

        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public /* synthetic */ DeliveryUniversalPayDeepLink(String str, String str2, String str3, String str4, String str5, boolean z12, Map map, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 64) != 0 ? null : map, (i12 & 32) != 0 ? false : z12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeliveryUniversalPayDeepLink)) {
            return false;
        }
        DeliveryUniversalPayDeepLink deliveryUniversalPayDeepLink = (DeliveryUniversalPayDeepLink) obj;
        return kotlin.jvm.internal.L.f(this.f133227b, deliveryUniversalPayDeepLink.f133227b) && kotlin.jvm.internal.L.f(this.f133228c, deliveryUniversalPayDeepLink.f133228c) && kotlin.jvm.internal.L.f(this.f133229d, deliveryUniversalPayDeepLink.f133229d) && kotlin.jvm.internal.L.f(this.f133230e, deliveryUniversalPayDeepLink.f133230e) && kotlin.jvm.internal.L.f(this.f133231f, deliveryUniversalPayDeepLink.f133231f) && this.f133232g == deliveryUniversalPayDeepLink.f133232g && kotlin.jvm.internal.L.f(this.f133233h, deliveryUniversalPayDeepLink.f133233h);
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(this.f133227b.hashCode() * 31, 31, this.f133228c);
        String str = this.f133229d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f133230e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f133231f;
        int i12 = androidx.appcompat.app.r.i((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f133232g);
        Map<String, Object> map = this.f133233h;
        return i12 + (map != null ? map.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeliveryUniversalPayDeepLink(paymentUri=");
        sb2.append(this.f133227b);
        sb2.append(", orderId=");
        sb2.append(this.f133228c);
        sb2.append(", onCancelBeduinActionsJson=");
        sb2.append(this.f133229d);
        sb2.append(", closeAlertInfo=");
        sb2.append(this.f133230e);
        sb2.append(", paymentFailToast=");
        sb2.append(this.f133231f);
        sb2.append(", disableParentScreenClose=");
        sb2.append(this.f133232g);
        sb2.append(", analyticsParams=");
        return androidx.appcompat.app.r.w(sb2, this.f133233h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f133227b);
        parcel.writeString(this.f133228c);
        parcel.writeString(this.f133229d);
        parcel.writeString(this.f133230e);
        parcel.writeString(this.f133231f);
        parcel.writeInt(this.f133232g ? 1 : 0);
        Map<String, Object> map = this.f133233h;
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

    public DeliveryUniversalPayDeepLink(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Map map, boolean z12) {
        this.f133227b = str;
        this.f133228c = str2;
        this.f133229d = str3;
        this.f133230e = str4;
        this.f133231f = str5;
        this.f133232g = z12;
        this.f133233h = map;
    }
}
