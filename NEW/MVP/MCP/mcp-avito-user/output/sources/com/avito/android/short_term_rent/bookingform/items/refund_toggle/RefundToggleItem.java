package com.avito.android.short_term_rent.bookingform.items.refund_toggle;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RefundToggleItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "RefundToggleButton", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RefundToggleItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<RefundToggleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f281579b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f281580c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RefundToggleButton f281581d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final RefundToggleButton f281582e;

    /* compiled from: RefundToggleItem.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem$RefundToggleButton;", "Landroid/os/Parcelable;", "Regular", "WithDiscount", "Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem$RefundToggleButton$Regular;", "Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem$RefundToggleButton$WithDiscount;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class RefundToggleButton implements Parcelable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f281583b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f281584c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final DeepLink f281585d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f281586e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f281587f;

        /* renamed from: g, reason: collision with root package name */
        public final int f281588g;

        /* compiled from: RefundToggleItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem$RefundToggleButton$Regular;", "Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem$RefundToggleButton;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Regular extends RefundToggleButton {

            @Y61.k
            public static final Parcelable.Creator<Regular> CREATOR = new a();

            /* renamed from: h, reason: collision with root package name */
            @Y61.k
            public final String f281589h;

            /* renamed from: i, reason: collision with root package name */
            @Y61.k
            public final String f281590i;

            /* renamed from: j, reason: collision with root package name */
            @Y61.k
            public final DeepLink f281591j;

            /* renamed from: k, reason: collision with root package name */
            @Y61.k
            public final String f281592k;

            /* renamed from: l, reason: collision with root package name */
            public final boolean f281593l;

            /* renamed from: m, reason: collision with root package name */
            public final int f281594m;

            /* compiled from: RefundToggleItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Regular> {
                @Override // android.os.Parcelable.Creator
                public final Regular createFromParcel(Parcel parcel) {
                    return new Regular(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(Regular.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Regular[] newArray(int i12) {
                    return new Regular[i12];
                }
            }

            public Regular(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.k String str3, boolean z12, int i12) {
                super(str, str2, deepLink, str3, z12, i12, null);
                this.f281589h = str;
                this.f281590i = str2;
                this.f281591j = deepLink;
                this.f281592k = str3;
                this.f281593l = z12;
                this.f281594m = i12;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            /* renamed from: c, reason: from getter */
            public final int getF281588g() {
                return this.f281594m;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: d, reason: from getter */
            public final DeepLink getF281585d() {
                return this.f281591j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: e, reason: from getter */
            public final String getF281586e() {
                return this.f281592k;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Regular)) {
                    return false;
                }
                Regular regular = (Regular) obj;
                return L.f(this.f281589h, regular.f281589h) && L.f(this.f281590i, regular.f281590i) && L.f(this.f281591j, regular.f281591j) && L.f(this.f281592k, regular.f281592k) && this.f281593l == regular.f281593l && this.f281594m == regular.f281594m;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF281583b() {
                return this.f281589h;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: getText, reason: from getter */
            public final String getF281584c() {
                return this.f281590i;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f281594m) + r.i(H.d(com.avito.android.actions_sheet.a.e(this.f281591j, H.d(this.f281589h.hashCode() * 31, 31, this.f281590i), 31), 31, this.f281592k), 31, this.f281593l);
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            /* renamed from: isSelected, reason: from getter */
            public final boolean getF281587f() {
                return this.f281593l;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Regular(id=");
                sb2.append(this.f281589h);
                sb2.append(", text=");
                sb2.append(this.f281590i);
                sb2.append(", tooltip=");
                sb2.append(this.f281591j);
                sb2.append(", totalPrice=");
                sb2.append(this.f281592k);
                sb2.append(", isSelected=");
                sb2.append(this.f281593l);
                sb2.append(", backgroundResId=");
                return r.t(sb2, this.f281594m, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f281589h);
                parcel.writeString(this.f281590i);
                parcel.writeParcelable(this.f281591j, i12);
                parcel.writeString(this.f281592k);
                parcel.writeInt(this.f281593l ? 1 : 0);
                parcel.writeInt(this.f281594m);
            }
        }

        /* compiled from: RefundToggleItem.kt */
        @K51.d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem$RefundToggleButton$WithDiscount;", "Lcom/avito/android/short_term_rent/bookingform/items/refund_toggle/RefundToggleItem$RefundToggleButton;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class WithDiscount extends RefundToggleButton {

            @Y61.k
            public static final Parcelable.Creator<WithDiscount> CREATOR = new a();

            /* renamed from: h, reason: collision with root package name */
            @Y61.k
            public final String f281595h;

            /* renamed from: i, reason: collision with root package name */
            @Y61.k
            public final String f281596i;

            /* renamed from: j, reason: collision with root package name */
            @Y61.k
            public final DeepLink f281597j;

            /* renamed from: k, reason: collision with root package name */
            @Y61.k
            public final String f281598k;

            /* renamed from: l, reason: collision with root package name */
            public final boolean f281599l;

            /* renamed from: m, reason: collision with root package name */
            public final int f281600m;

            /* renamed from: n, reason: collision with root package name */
            @Y61.k
            public final String f281601n;

            /* renamed from: o, reason: collision with root package name */
            @Y61.k
            public final String f281602o;

            /* compiled from: RefundToggleItem.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<WithDiscount> {
                @Override // android.os.Parcelable.Creator
                public final WithDiscount createFromParcel(Parcel parcel) {
                    return new WithDiscount(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(WithDiscount.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final WithDiscount[] newArray(int i12) {
                    return new WithDiscount[i12];
                }
            }

            public WithDiscount(@Y61.k String str, @Y61.k String str2, @Y61.k DeepLink deepLink, @Y61.k String str3, boolean z12, int i12, @Y61.k String str4, @Y61.k String str5) {
                super(str, str2, deepLink, str3, z12, i12, null);
                this.f281595h = str;
                this.f281596i = str2;
                this.f281597j = deepLink;
                this.f281598k = str3;
                this.f281599l = z12;
                this.f281600m = i12;
                this.f281601n = str4;
                this.f281602o = str5;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            /* renamed from: c, reason: from getter */
            public final int getF281588g() {
                return this.f281600m;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: d, reason: from getter */
            public final DeepLink getF281585d() {
                return this.f281597j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: e, reason: from getter */
            public final String getF281586e() {
                return this.f281598k;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WithDiscount)) {
                    return false;
                }
                WithDiscount withDiscount = (WithDiscount) obj;
                return L.f(this.f281595h, withDiscount.f281595h) && L.f(this.f281596i, withDiscount.f281596i) && L.f(this.f281597j, withDiscount.f281597j) && L.f(this.f281598k, withDiscount.f281598k) && this.f281599l == withDiscount.f281599l && this.f281600m == withDiscount.f281600m && L.f(this.f281601n, withDiscount.f281601n) && L.f(this.f281602o, withDiscount.f281602o);
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: getId, reason: from getter */
            public final String getF281583b() {
                return this.f281595h;
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            @Y61.k
            /* renamed from: getText, reason: from getter */
            public final String getF281584c() {
                return this.f281596i;
            }

            public final int hashCode() {
                return this.f281602o.hashCode() + H.d(r.e(this.f281600m, r.i(H.d(com.avito.android.actions_sheet.a.e(this.f281597j, H.d(this.f281595h.hashCode() * 31, 31, this.f281596i), 31), 31, this.f281598k), 31, this.f281599l), 31), 31, this.f281601n);
            }

            @Override // com.avito.android.short_term_rent.bookingform.items.refund_toggle.RefundToggleItem.RefundToggleButton
            /* renamed from: isSelected, reason: from getter */
            public final boolean getF281587f() {
                return this.f281599l;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("WithDiscount(id=");
                sb2.append(this.f281595h);
                sb2.append(", text=");
                sb2.append(this.f281596i);
                sb2.append(", tooltip=");
                sb2.append(this.f281597j);
                sb2.append(", totalPrice=");
                sb2.append(this.f281598k);
                sb2.append(", isSelected=");
                sb2.append(this.f281599l);
                sb2.append(", backgroundResId=");
                sb2.append(this.f281600m);
                sb2.append(", strikethroughPrice=");
                sb2.append(this.f281601n);
                sb2.append(", discountPercent=");
                return C22026a.c(sb2, this.f281602o, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
                parcel.writeString(this.f281595h);
                parcel.writeString(this.f281596i);
                parcel.writeParcelable(this.f281597j, i12);
                parcel.writeString(this.f281598k);
                parcel.writeInt(this.f281599l ? 1 : 0);
                parcel.writeInt(this.f281600m);
                parcel.writeString(this.f281601n);
                parcel.writeString(this.f281602o);
            }
        }

        public RefundToggleButton(String str, String str2, DeepLink deepLink, String str3, boolean z12, int i12, C42822w c42822w) {
            this.f281583b = str;
            this.f281584c = str2;
            this.f281585d = deepLink;
            this.f281586e = str3;
            this.f281587f = z12;
            this.f281588g = i12;
        }

        /* renamed from: c, reason: from getter */
        public int getF281588g() {
            return this.f281588g;
        }

        @Y61.k
        /* renamed from: d, reason: from getter */
        public DeepLink getF281585d() {
            return this.f281585d;
        }

        @Y61.k
        /* renamed from: e, reason: from getter */
        public String getF281586e() {
            return this.f281586e;
        }

        @Y61.k
        /* renamed from: getId, reason: from getter */
        public String getF281583b() {
            return this.f281583b;
        }

        @Y61.k
        /* renamed from: getText, reason: from getter */
        public String getF281584c() {
            return this.f281584c;
        }

        /* renamed from: isSelected, reason: from getter */
        public boolean getF281587f() {
            return this.f281587f;
        }
    }

    /* compiled from: RefundToggleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RefundToggleItem> {
        @Override // android.os.Parcelable.Creator
        public final RefundToggleItem createFromParcel(Parcel parcel) {
            return new RefundToggleItem(parcel.readString(), parcel.readInt() != 0, (RefundToggleButton) parcel.readParcelable(RefundToggleItem.class.getClassLoader()), (RefundToggleButton) parcel.readParcelable(RefundToggleItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final RefundToggleItem[] newArray(int i12) {
            return new RefundToggleItem[i12];
        }
    }

    public RefundToggleItem(@Y61.k String str, boolean z12, @Y61.k RefundToggleButton refundToggleButton, @Y61.k RefundToggleButton refundToggleButton2) {
        this.f281579b = str;
        this.f281580c = z12;
        this.f281581d = refundToggleButton;
        this.f281582e = refundToggleButton2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefundToggleItem)) {
            return false;
        }
        RefundToggleItem refundToggleItem = (RefundToggleItem) obj;
        return L.f(this.f281579b, refundToggleItem.f281579b) && this.f281580c == refundToggleItem.f281580c && L.f(this.f281581d, refundToggleItem.f281581d) && L.f(this.f281582e, refundToggleItem.f281582e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF270893b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF271477k() {
        return this.f281579b;
    }

    public final int hashCode() {
        return this.f281582e.hashCode() + ((this.f281581d.hashCode() + r.i(this.f281579b.hashCode() * 31, 31, this.f281580c)) * 31);
    }

    @Y61.k
    public final String toString() {
        return "RefundToggleItem(stringId=" + this.f281579b + ", needFormReload=" + this.f281580c + ", firstButton=" + this.f281581d + ", secondButton=" + this.f281582e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f281579b);
        parcel.writeInt(this.f281580c ? 1 : 0);
        parcel.writeParcelable(this.f281581d, i12);
        parcel.writeParcelable(this.f281582e, i12);
    }
}
