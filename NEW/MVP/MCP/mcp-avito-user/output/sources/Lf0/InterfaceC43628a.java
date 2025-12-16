package lF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentSelectorAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LlF0/a;", "", "a", "b", "c", "d", "e", "LlF0/a$a;", "LlF0/a$b;", "LlF0/a$c;", "LlF0/a$d;", "LlF0/a$e;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lF0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43628a {

    /* compiled from: PaymentSelectorAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlF0/a$a;", "LlF0/a;", "<init>", "()V", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11779a implements InterfaceC43628a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11779a f413665a = new C11779a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11779a);
        }

        public final int hashCode() {
            return -60373697;
        }

        @k
        public final String toString() {
            return "OnActionClick";
        }
    }

    /* compiled from: PaymentSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlF0/a$b;", "LlF0/a;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.a$b */
    public static final /* data */ class b implements InterfaceC43628a {

        /* renamed from: a, reason: collision with root package name */
        public final long f413666a;

        public b(long j12) {
            this.f413666a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f413666a == ((b) obj).f413666a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f413666a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("OnDescriptionClick(itemId="), this.f413666a, ')');
        }
    }

    /* compiled from: PaymentSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlF0/a$c;", "LlF0/a;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.a$c */
    public static final /* data */ class c implements InterfaceC43628a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413667a;

        public c(@k String str) {
            this.f413667a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f413667a, ((c) obj).f413667a);
        }

        public final int hashCode() {
            return this.f413667a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentDetailsAttached(paymentType="), this.f413667a, ')');
        }
    }

    /* compiled from: PaymentSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlF0/a$d;", "LlF0/a;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.a$d */
    public static final /* data */ class d implements InterfaceC43628a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f413668a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f413669b;

        public d(@l String str, @k String str2) {
            this.f413668a = str;
            this.f413669b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f413668a, dVar.f413668a) && L.f(this.f413669b, dVar.f413669b);
        }

        public final int hashCode() {
            String str = this.f413668a;
            return this.f413669b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PaymentPlanChanged(buttonName=");
            sb2.append(this.f413668a);
            sb2.append(", paymentPlan=");
            return C22026a.c(sb2, this.f413669b, ')');
        }
    }

    /* compiled from: PaymentSelectorAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlF0/a$e;", "LlF0/a;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.a$e */
    public static final /* data */ class e implements InterfaceC43628a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f413670a;

        public e(@k String str) {
            this.f413670a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f413670a, ((e) obj).f413670a);
        }

        public final int hashCode() {
            return this.f413670a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentTypeChanged(paymentType="), this.f413670a, ')');
        }
    }
}
