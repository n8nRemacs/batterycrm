package ao0;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DeliveryUniversalCheckoutOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lao0/b;", "", "a", "b", "Lao0/b$a;", "Lao0/b$b;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ao0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC23645b {

    /* compiled from: DeliveryUniversalCheckoutOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lao0/b$a;", "Lao0/b;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ao0.b$a */
    public static final /* data */ class a implements InterfaceC23645b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InterfaceC14249c f56223a;

        public a(@k InterfaceC14249c interfaceC14249c) {
            this.f56223a = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f56223a, ((a) obj).f56223a);
        }

        public final int hashCode() {
            return this.f56223a.hashCode();
        }

        @k
        public final String toString() {
            return "DeeplinkResultAction(result=" + this.f56223a + ')';
        }
    }

    /* compiled from: DeliveryUniversalCheckoutOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lao0/b$b;", "Lao0/b;", "_avito_safedeal-checkout_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ao0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1970b implements InterfaceC23645b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiError f56224a;

        public C1970b(@k ApiError apiError) {
            this.f56224a = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1970b) && L.f(this.f56224a, ((C1970b) obj).f56224a);
        }

        public final int hashCode() {
            return this.f56224a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("ShowExecutingError(error="), this.f56224a, ')');
        }
    }
}
