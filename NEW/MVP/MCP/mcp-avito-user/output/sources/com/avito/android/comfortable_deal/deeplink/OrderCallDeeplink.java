package com.avito.android.comfortable_deal.deeplink;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: OrderCallDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class OrderCallDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<OrderCallDeeplink> CREATOR = new a();

    /* compiled from: OrderCallDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OrderCallDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final OrderCallDeeplink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new OrderCallDeeplink();
        }

        @Override // android.os.Parcelable.Creator
        public final OrderCallDeeplink[] newArray(int i12) {
            return new OrderCallDeeplink[i12];
        }
    }

    /* compiled from: OrderCallDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b$b;", "Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b$c;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: OrderCallDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b$a;", "Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b;", "<init>", "()V", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final a f121878b = new a();

            public a() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1030000389;
            }

            @Y61.k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: OrderCallDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b$b;", "Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b;", "<init>", "()V", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.comfortable_deal.deeplink.OrderCallDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C3602b extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3602b f121879b = new C3602b();

            public C3602b() {
                super(null);
            }

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C3602b);
            }

            public final int hashCode() {
                return 228450911;
            }

            @Y61.k
            public final String toString() {
                return "Failure";
            }
        }

        /* compiled from: OrderCallDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b$c;", "Lcom/avito/android/comfortable_deal/deeplink/OrderCallDeeplink$b;", "_avito_comfortable-deal_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final DeepLink f121880b;

            public c(@Y61.k DeepLink deepLink) {
                super(null);
                this.f121880b = deepLink;
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
