package com.avito.android.payment.lib;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.payment.ParametersTree;
import com.avito.android.payment.remote.PaymentSessionTypeMarker;
import com.avito.android.remote.model.payment.service.OrderItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PaymentActivity.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/payment/lib/PaymentSessionType;", "Landroid/os/Parcelable;", "CPA", "Services", "Wallet", "Lcom/avito/android/payment/lib/PaymentSessionType$CPA;", "Lcom/avito/android/payment/lib/PaymentSessionType$Services;", "Lcom/avito/android/payment/lib/PaymentSessionType$Wallet;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class PaymentSessionType implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PaymentSessionTypeMarker f214555b;

    /* compiled from: PaymentActivity.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/PaymentSessionType$CPA;", "Lcom/avito/android/payment/lib/PaymentSessionType;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class CPA extends PaymentSessionType {

        @Y61.k
        public static final Parcelable.Creator<CPA> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f214556c;

        /* compiled from: PaymentActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<CPA> {
            @Override // android.os.Parcelable.Creator
            public final CPA createFromParcel(Parcel parcel) {
                return new CPA(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CPA[] newArray(int i12) {
                return new CPA[i12];
            }
        }

        public CPA(@Y61.l String str) {
            super(PaymentSessionTypeMarker.f214817d, null);
            this.f214556c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f214556c);
        }
    }

    /* compiled from: PaymentActivity.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/PaymentSessionType$Services;", "Lcom/avito/android/payment/lib/PaymentSessionType;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Services extends PaymentSessionType {

        @Y61.k
        public static final Parcelable.Creator<Services> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Set<OrderItem> f214557c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f214558d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f214559e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final String f214560f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final Map<String, Object> f214561g;

        /* compiled from: PaymentActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Services> {
            @Override // android.os.Parcelable.Creator
            public final Services createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i12);
                for (int i13 = 0; i13 != i12; i13++) {
                    linkedHashSet.add(parcel.readParcelable(Services.class.getClassLoader()));
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
                        iC2 = org.webrtc.h.c(Services.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new Services(linkedHashSet, string, string2, string3, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final Services[] newArray(int i12) {
                return new Services[i12];
            }
        }

        public /* synthetic */ Services(Set set, String str, String str2, String str3, Map map, int i12, C42822w c42822w) {
            this(set, str, str2, str3, (i12 & 16) != 0 ? null : map);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            Set<OrderItem> set = this.f214557c;
            parcel.writeInt(set.size());
            Iterator<OrderItem> it = set.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable(it.next(), i12);
            }
            parcel.writeString(this.f214558d);
            parcel.writeString(this.f214559e);
            parcel.writeString(this.f214560f);
            Map<String, Object> map = this.f214561g;
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

        public Services(@Y61.k Set<OrderItem> set, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Map<String, ? extends Object> map) {
            super(PaymentSessionTypeMarker.f214815b, null);
            this.f214557c = set;
            this.f214558d = str;
            this.f214559e = str2;
            this.f214560f = str3;
            this.f214561g = map;
        }
    }

    /* compiled from: PaymentActivity.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/PaymentSessionType$Wallet;", "Lcom/avito/android/payment/lib/PaymentSessionType;", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Wallet extends PaymentSessionType {

        @Y61.k
        public static final Parcelable.Creator<Wallet> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final ParametersTree f214562c;

        /* compiled from: PaymentActivity.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Wallet> {
            @Override // android.os.Parcelable.Creator
            public final Wallet createFromParcel(Parcel parcel) {
                return new Wallet((ParametersTree) parcel.readParcelable(Wallet.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Wallet[] newArray(int i12) {
                return new Wallet[i12];
            }
        }

        public Wallet(@Y61.k ParametersTree parametersTree) {
            super(PaymentSessionTypeMarker.f214816c, null);
            this.f214562c = parametersTree;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeParcelable(this.f214562c, i12);
        }
    }

    public PaymentSessionType(PaymentSessionTypeMarker paymentSessionTypeMarker, C42822w c42822w) {
        this.f214555b = paymentSessionTypeMarker;
    }
}
