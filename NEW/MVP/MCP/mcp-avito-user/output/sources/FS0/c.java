package Fs0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingNavigationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LFs0/c;", "", "a", "b", "LFs0/c$a;", "LFs0/c$b;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: ServiceBookingNavigationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/c$a;", "LFs0/c;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f6005a;

        public a(@k String str) {
            this.f6005a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f6005a, ((a) obj).f6005a);
        }

        public final int hashCode() {
            return this.f6005a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("CreateStep(stepId="), this.f6005a, ')');
        }
    }

    /* compiled from: ServiceBookingNavigationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFs0/c$b;", "LFs0/c;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f6006a;

        public b(@l String str) {
            this.f6006a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f6006a, ((b) obj).f6006a);
        }

        public final int hashCode() {
            String str = this.f6006a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PopToStep(stepId="), this.f6006a, ')');
        }
    }
}
