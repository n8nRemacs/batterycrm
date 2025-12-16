package ji0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import oi0.C44783b;

/* compiled from: LocationSuggestOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lji0/b;", "", "a", "b", "Lji0/b$a;", "Lji0/b$b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ji0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC42387b {

    /* compiled from: LocationSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lji0/b$a;", "Lji0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ji0.b$a */
    public static final /* data */ class a implements InterfaceC42387b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C44783b f405766a;

        public a(@k C44783b c44783b) {
            this.f405766a = c44783b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f405766a, ((a) obj).f405766a);
        }

        public final int hashCode() {
            return this.f405766a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseScreenWithSelectedLocation(location=" + this.f405766a + ')';
        }
    }

    /* compiled from: LocationSuggestOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lji0/b$b;", "Lji0/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ji0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11576b implements InterfaceC42387b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f405767a;

        public C11576b(@k PrintableText printableText) {
            this.f405767a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11576b) && L.f(this.f405767a, ((C11576b) obj).f405767a);
        }

        public final int hashCode() {
            return this.f405767a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f405767a, ')');
        }
    }
}
