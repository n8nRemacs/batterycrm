package eu0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingBlockEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Leu0/b;", "", "a", "b", "Leu0/b$a;", "Leu0/b$b;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40159b {

    /* compiled from: ServiceBookingBlockEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/b$a;", "Leu0/b;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.b$a */
    public static final /* data */ class a implements InterfaceC40159b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395431a;

        public a(@k DeepLink deepLink) {
            this.f395431a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f395431a, ((a) obj).f395431a);
        }

        public final int hashCode() {
            return this.f395431a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f395431a, ')');
        }
    }

    /* compiled from: ServiceBookingBlockEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leu0/b$b;", "Leu0/b;", "_avito_service-booking-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eu0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11112b implements InterfaceC40159b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f395432a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f395433b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ApiError f395434c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Throwable f395435d;

        public C11112b(@k PrintableText printableText, @k PrintableText printableText2, @l ApiError apiError, @l Throwable th2) {
            this.f395432a = printableText;
            this.f395433b = printableText2;
            this.f395434c = apiError;
            this.f395435d = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11112b)) {
                return false;
            }
            C11112b c11112b = (C11112b) obj;
            return L.f(this.f395432a, c11112b.f395432a) && L.f(this.f395433b, c11112b.f395433b) && L.f(this.f395434c, c11112b.f395434c) && L.f(this.f395435d, c11112b.f395435d);
        }

        public final int hashCode() {
            int iF2 = com.avito.android.actions_sheet.a.f(this.f395433b, this.f395432a.hashCode() * 31, 31);
            ApiError apiError = this.f395434c;
            int iHashCode = (iF2 + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f395435d;
            return iHashCode + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToast(errorText=");
            sb2.append(this.f395432a);
            sb2.append(", retryText=");
            sb2.append(this.f395433b);
            sb2.append(", apiError=");
            sb2.append(this.f395434c);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f395435d, ')');
        }
    }
}
