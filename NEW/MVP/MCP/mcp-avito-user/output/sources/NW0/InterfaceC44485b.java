package nw0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.short_term_rent.promo_codes.ui.StrSoftBookingPromoCodesDialogResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSoftBookingPromoCodesOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lnw0/b;", "", "a", "b", "c", "d", "Lnw0/b$a;", "Lnw0/b$b;", "Lnw0/b$c;", "Lnw0/b$d;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC44485b {

    /* compiled from: StrSoftBookingPromoCodesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnw0/b$a;", "Lnw0/b;", "<init>", "()V", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nw0.b$a */
    public static final /* data */ class a implements InterfaceC44485b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f419232a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1802478631;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: StrSoftBookingPromoCodesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnw0/b$b;", "Lnw0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nw0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12153b implements InterfaceC44485b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f419233a;

        public C12153b(boolean z12) {
            this.f419233a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12153b) && this.f419233a == ((C12153b) obj).f419233a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f419233a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RequestFocus(shouldRequest="), this.f419233a, ')');
        }
    }

    /* compiled from: StrSoftBookingPromoCodesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnw0/b$c;", "Lnw0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nw0.b$c */
    public static final /* data */ class c implements InterfaceC44485b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StrSoftBookingPromoCodesDialogResult f419234a;

        public c(@k StrSoftBookingPromoCodesDialogResult strSoftBookingPromoCodesDialogResult) {
            this.f419234a = strSoftBookingPromoCodesDialogResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f419234a, ((c) obj).f419234a);
        }

        public final int hashCode() {
            return this.f419234a.hashCode();
        }

        @k
        public final String toString() {
            return "SetResult(result=" + this.f419234a + ')';
        }
    }

    /* compiled from: StrSoftBookingPromoCodesOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnw0/b$d;", "Lnw0/b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nw0.b$d */
    public static final /* data */ class d implements InterfaceC44485b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f419235a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f.c f419236b;

        public d(@k PrintableText printableText, @k f.c cVar) {
            this.f419235a = printableText;
            this.f419236b = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f419235a.equals(dVar.f419235a) && this.f419236b.equals(dVar.f419236b);
        }

        public final int hashCode() {
            return this.f419236b.hashCode() + (this.f419235a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(text=" + this.f419235a + ", type=" + this.f419236b + ')';
        }
    }
}
