package CN0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.virtual_deal_room.client_edit.model.ClientSaveResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientEditOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LCN0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LCN0/b$a;", "LCN0/b$b;", "LCN0/b$c;", "LCN0/b$d;", "LCN0/b$e;", "LCN0/b$f;", "LCN0/b$g;", "LCN0/b$h;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN0/b$a;", "LCN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ClientSaveResult.Saved f2138a;

        public a(@k ClientSaveResult.Saved saved) {
            this.f2138a = saved;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f2138a, ((a) obj).f2138a);
        }

        public final int hashCode() {
            return this.f2138a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(saveResult=" + this.f2138a + ')';
        }
    }

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LCN0/b$b;", "LCN0/b;", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: CN0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0106b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0106b f2139a = new C0106b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0106b);
        }

        public final int hashCode() {
            return 666985169;
        }

        @k
        public final String toString() {
            return "CloseWithoutSave";
        }
    }

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN0/b$c;", "LCN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f2140a;

        public c(@l PrintableText printableText) {
            this.f2140a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f2140a, ((c) obj).f2140a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f2140a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowEmailError(error="), this.f2140a, ')');
        }
    }

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN0/b$d;", "LCN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f2141a;

        public d(@k PrintableText printableText) {
            this.f2141a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f2141a, ((d) obj).f2141a);
        }

        public final int hashCode() {
            return this.f2141a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(errorText="), this.f2141a, ')');
        }
    }

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN0/b$e;", "LCN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f2142a;

        public e(@l PrintableText printableText) {
            this.f2142a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f2142a, ((e) obj).f2142a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f2142a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowNameError(error="), this.f2142a, ')');
        }
    }

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN0/b$f;", "LCN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f2143a;

        public f(@l PrintableText printableText) {
            this.f2143a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f2143a, ((f) obj).f2143a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f2143a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowPatronymicError(error="), this.f2143a, ')');
        }
    }

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN0/b$g;", "LCN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f2144a;

        public g(@l PrintableText printableText) {
            this.f2144a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f2144a, ((g) obj).f2144a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f2144a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowPhoneError(error="), this.f2144a, ')');
        }
    }

    /* compiled from: ClientEditOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN0/b$h;", "LCN0/b;", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f2145a;

        public h(@l PrintableText printableText) {
            this.f2145a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f2145a, ((h) obj).f2145a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f2145a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowSurnameError(error="), this.f2145a, ')');
        }
    }
}
