package com.avito.android.str_seller_orders_calendar.navigation;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: StrOrdersCalendarLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "b", "_avito_str-seller-orders-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final class StrOrdersCalendarLink extends DeepLink {

    @k
    public static final Parcelable.Creator<StrOrdersCalendarLink> CREATOR = new a();

    /* compiled from: StrOrdersCalendarLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StrOrdersCalendarLink> {
        @Override // android.os.Parcelable.Creator
        public final StrOrdersCalendarLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new StrOrdersCalendarLink();
        }

        @Override // android.os.Parcelable.Creator
        public final StrOrdersCalendarLink[] newArray(int i12) {
            return new StrOrdersCalendarLink[i12];
        }
    }

    /* compiled from: StrOrdersCalendarLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink$b$a;", "Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink$b$b;", "_avito_str-seller-orders-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: StrOrdersCalendarLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink$b$a;", "LJu/a$a;", "Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink$b;", "<init>", "()V", "_avito_str-seller-orders-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14247a.InterfaceC0545a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f290465b = new a();

            public a() {
                super(null);
            }
        }

        /* compiled from: StrOrdersCalendarLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink$b$b;", "LJu/a$b;", "Lcom/avito/android/str_seller_orders_calendar/navigation/StrOrdersCalendarLink$b;", "<init>", "()V", "_avito_str-seller-orders-calendar_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.str_seller_orders_calendar.navigation.StrOrdersCalendarLink$b$b, reason: collision with other inner class name */
        public static final class C8772b extends b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8772b f290466b = new C8772b();

            public C8772b() {
                super(null);
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
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
