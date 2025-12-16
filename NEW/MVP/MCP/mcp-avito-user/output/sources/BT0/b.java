package Bt0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingItemDetailsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LBt0/b;", "", "a", "b", "c", "d", "e", "LBt0/b$a;", "LBt0/b$b;", "LBt0/b$c;", "LBt0/b$d;", "LBt0/b$e;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ServiceBookingItemDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/b$a;", "LBt0/b;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1760a;

        public a(int i12) {
            this.f1760a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f1760a == ((a) obj).f1760a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f1760a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("Close(activityResult="), this.f1760a, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/b$b;", "LBt0/b;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Bt0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0075b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.service_booking_common.blueprints.contact.c f1761a;

        public C0075b(@k com.avito.android.service_booking_common.blueprints.contact.c cVar) {
            this.f1761a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0075b) && L.f(this.f1761a, ((C0075b) obj).f1761a);
        }

        public final int hashCode() {
            return this.f1761a.hashCode();
        }

        @k
        public final String toString() {
            return "CopyPhoneToClipboard(item=" + this.f1761a + ')';
        }
    }

    /* compiled from: ServiceBookingItemDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/b$c;", "LBt0/b;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f1762a;

        public c(@k DeepLink deepLink) {
            this.f1762a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f1762a, ((c) obj).f1762a);
        }

        public final int hashCode() {
            return this.f1762a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f1762a, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBt0/b$d;", "LBt0/b;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f1763a;

        public d(@k PrintableText printableText) {
            this.f1763a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f1763a, ((d) obj).f1763a);
        }

        public final int hashCode() {
            return this.f1763a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(message="), this.f1763a, ')');
        }
    }

    /* compiled from: ServiceBookingItemDetailsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBt0/b$e;", "LBt0/b;", "<init>", "()V", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f1764a = new e();
    }
}
