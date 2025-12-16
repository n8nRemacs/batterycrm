package RI;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LRI/d;", "", "a", "b", "c", "d", "e", "LRI/d$a;", "LRI/d$b;", "LRI/d$c;", "LRI/d$d;", "LRI/d$e;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface d {

    /* compiled from: HotelBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRI/d$a;", "LRI/d;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f14294a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -981251916;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: HotelBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/d$b;", "LRI/d;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14295a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Bundle f14296b;

        public b(@k DeepLink deepLink, @l Bundle bundle) {
            this.f14295a = deepLink;
            this.f14296b = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f14295a, bVar.f14295a) && L.f(this.f14296b, bVar.f14296b);
        }

        public final int hashCode() {
            int iHashCode = this.f14295a.hashCode() * 31;
            Bundle bundle = this.f14296b;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f14295a);
            sb2.append(", bundle=");
            return H.m(sb2, this.f14296b, ')');
        }
    }

    /* compiled from: HotelBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/d$c;", "LRI/d;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f14297a;

        public c(int i12) {
            this.f14297a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f14297a == ((c) obj).f14297a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f14297a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f14297a, ')');
        }
    }

    /* compiled from: HotelBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/d$d;", "LRI/d;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RI.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0949d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f14298a;

        public C0949d(@k PrintableText printableText) {
            this.f14298a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0949d) && L.f(this.f14298a, ((C0949d) obj).f14298a);
        }

        public final int hashCode() {
            return this.f14298a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(message="), this.f14298a, ')');
        }
    }

    /* compiled from: HotelBookingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/d$e;", "LRI/d;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f14299a;

        public e(@k PrintableText printableText) {
            this.f14299a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f14299a, ((e) obj).f14299a);
        }

        public final int hashCode() {
            return this.f14299a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowInfoToast(message="), this.f14299a, ')');
        }
    }
}
