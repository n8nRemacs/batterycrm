package Sz0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvailabilityType.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LSz0/a;", "", "a", "b", "LSz0/a$a;", "LSz0/a$b;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC15272a {

    /* compiled from: AvailabilityType.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSz0/a$a;", "LSz0/a;", "<init>", "()V", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sz0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1042a implements InterfaceC15272a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1042a f15235a = new C1042a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1042a);
        }

        public final int hashCode() {
            return -5725923;
        }

        @k
        public final String toString() {
            return "Available";
        }
    }

    /* compiled from: AvailabilityType.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSz0/a$b;", "LSz0/a;", "_avito_str-seller-orders-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sz0.a$b */
    public static final /* data */ class b implements InterfaceC15272a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f15236a;

        public b(@l PrintableText printableText) {
            this.f15236a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15236a, ((b) obj).f15236a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f15236a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Unavailable(title="), this.f15236a, ')');
        }
    }
}
