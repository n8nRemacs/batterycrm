package com.avito.android.short_term_rent.deeplink;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes3.dex */
public final /* data */ class BookingFormPromoCodeDialogDeeplink extends DeepLink {

    @k
    public static final Parcelable.Creator<BookingFormPromoCodeDialogDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f282241b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f282242c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f282243d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f282244e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f282245f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final List<PromoCode> f282246g;

    /* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BookingFormPromoCodeDialogDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final BookingFormPromoCodeDialogDeeplink createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(PromoCode.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            return new BookingFormPromoCodeDialogDeeplink(arrayList, j12, string, string2, string3, string4);
        }

        @Override // android.os.Parcelable.Creator
        public final BookingFormPromoCodeDialogDeeplink[] newArray(int i12) {
            return new BookingFormPromoCodeDialogDeeplink[i12];
        }
    }

    /* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b;", "LJu/c$b;", "a", "b", "c", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b$a;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b$b;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b$c;", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends InterfaceC14249c.b {

        /* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b$a;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b;", "<init>", "()V", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {
            static {
                new a();
            }

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -843159258;
            }

            @k
            public final String toString() {
                return "NoResult";
            }
        }

        /* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b$b;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b;", "<init>", "()V", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.short_term_rent.deeplink.BookingFormPromoCodeDialogDeeplink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C8423b implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C8423b f282247b = new C8423b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C8423b);
            }

            public final int hashCode() {
                return -908907929;
            }

            @k
            public final String toString() {
                return "Reset";
            }
        }

        /* compiled from: BookingFormPromoCodeDialogDeeplink.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b$c;", "Lcom/avito/android/short_term_rent/deeplink/BookingFormPromoCodeDialogDeeplink$b;", "_avito_short-term-rent_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f282248b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f282249c;

            public c(@k String str, @l String str2) {
                this.f282248b = str;
                this.f282249c = str2;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f282248b, cVar.f282248b) && L.f(this.f282249c, cVar.f282249c);
            }

            public final int hashCode() {
                int iHashCode = this.f282248b.hashCode() * 31;
                String str = this.f282249c;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Success(promoCode=");
                sb2.append(this.f282248b);
                sb2.append(", toastText=");
                return C22026a.c(sb2, this.f282249c, ')');
            }
        }
    }

    public BookingFormPromoCodeDialogDeeplink(@l List list, long j12, @k String str, @k String str2, @l String str3, @l String str4) {
        this.f282241b = j12;
        this.f282242c = str;
        this.f282243d = str2;
        this.f282244e = str3;
        this.f282245f = str4;
        this.f282246g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BookingFormPromoCodeDialogDeeplink)) {
            return false;
        }
        BookingFormPromoCodeDialogDeeplink bookingFormPromoCodeDialogDeeplink = (BookingFormPromoCodeDialogDeeplink) obj;
        return this.f282241b == bookingFormPromoCodeDialogDeeplink.f282241b && L.f(this.f282242c, bookingFormPromoCodeDialogDeeplink.f282242c) && L.f(this.f282243d, bookingFormPromoCodeDialogDeeplink.f282243d) && L.f(this.f282244e, bookingFormPromoCodeDialogDeeplink.f282244e) && L.f(this.f282245f, bookingFormPromoCodeDialogDeeplink.f282245f) && L.f(this.f282246g, bookingFormPromoCodeDialogDeeplink.f282246g);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(Long.hashCode(this.f282241b) * 31, 31, this.f282242c), 31, this.f282243d);
        String str = this.f282244e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f282245f;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PromoCode> list = this.f282246g;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormPromoCodeDialogDeeplink(itemId=");
        sb2.append(this.f282241b);
        sb2.append(", title=");
        sb2.append(this.f282242c);
        sb2.append(", buttonTitle=");
        sb2.append(this.f282243d);
        sb2.append(", inputHint=");
        sb2.append(this.f282244e);
        sb2.append(", bookingContext=");
        sb2.append(this.f282245f);
        sb2.append(", promoCodes=");
        return H.p(sb2, this.f282246g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f282241b);
        parcel.writeString(this.f282242c);
        parcel.writeString(this.f282243d);
        parcel.writeString(this.f282244e);
        parcel.writeString(this.f282245f);
        List<PromoCode> list = this.f282246g;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((PromoCode) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
