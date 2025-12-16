package lF0;

import Y61.k;
import Y61.l;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentSelectorOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LlF0/b;", "", "a", "b", "c", "LlF0/b$a;", "LlF0/b$b;", "LlF0/b$c;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lF0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC43629b {

    /* compiled from: PaymentSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlF0/b$a;", "LlF0/b;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.b$a */
    public static final /* data */ class a implements InterfaceC43629b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f413671a;

        public a(@l DeepLink deepLink) {
            this.f413671a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f413671a, ((a) obj).f413671a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f413671a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenPaymentDeeplink(deeplink="), this.f413671a, ')');
        }
    }

    /* compiled from: PaymentSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlF0/b$b;", "LlF0/b;", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11780b implements InterfaceC43629b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f413672a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f.c f413673b;

        public C11780b(@k PrintableText printableText, @k f.c cVar) {
            this.f413672a = printableText;
            this.f413673b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11780b)) {
                return false;
            }
            C11780b c11780b = (C11780b) obj;
            return this.f413672a.equals(c11780b.f413672a) && this.f413673b.equals(c11780b.f413673b);
        }

        public final int hashCode() {
            return this.f413673b.hashCode() + (this.f413672a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowError(message=" + this.f413672a + ", errorType=" + this.f413673b + ')';
        }
    }

    /* compiled from: PaymentSelectorOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlF0/b$c;", "LlF0/b;", "<init>", "()V", "_avito_travel-payment-selector_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lF0.b$c */
    public static final /* data */ class c implements InterfaceC43629b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f413674a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1475312074;
        }

        @k
        public final String toString() {
            return "ShowPaymentPlanChangedFeedback";
        }
    }
}
