package rO0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddSaveResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ClientAddOneTimeEvent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LrO0/c;", "", "a", "b", "c", "d", "e", "f", "g", "LrO0/c$a;", "LrO0/c$b;", "LrO0/c$c;", "LrO0/c$d;", "LrO0/c$e;", "LrO0/c$f;", "LrO0/c$g;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rO0.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC47579c {

    /* compiled from: ClientAddOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/c$a;", "LrO0/c;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.c$a */
    public static final /* data */ class a implements InterfaceC47579c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ClientAddSaveResult.Saved f429794a;

        public a(@k ClientAddSaveResult.Saved saved) {
            this.f429794a = saved;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f429794a, ((a) obj).f429794a);
        }

        public final int hashCode() {
            return this.f429794a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(saveResult=" + this.f429794a + ')';
        }
    }

    /* compiled from: ClientAddOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LrO0/c$b;", "LrO0/c;", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.c$b */
    public static final /* data */ class b implements InterfaceC47579c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f429795a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -454931706;
        }

        @k
        public final String toString() {
            return "CloseWithoutSave";
        }
    }

    /* compiled from: ClientAddOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/c$c;", "LrO0/c;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C12374c implements InterfaceC47579c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f429796a;

        public C12374c(@l PrintableText printableText) {
            this.f429796a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12374c) && L.f(this.f429796a, ((C12374c) obj).f429796a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f429796a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowEmailError(error="), this.f429796a, ')');
        }
    }

    /* compiled from: ClientAddOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/c$d;", "LrO0/c;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.c$d */
    public static final /* data */ class d implements InterfaceC47579c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f429797a;

        public d(@k PrintableText printableText) {
            this.f429797a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f429797a, ((d) obj).f429797a);
        }

        public final int hashCode() {
            return this.f429797a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowError(errorText="), this.f429797a, ')');
        }
    }

    /* compiled from: ClientAddOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/c$e;", "LrO0/c;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.c$e */
    public static final /* data */ class e implements InterfaceC47579c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f429798a;

        public e(@l PrintableText printableText) {
            this.f429798a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f429798a, ((e) obj).f429798a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f429798a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowNameError(error="), this.f429798a, ')');
        }
    }

    /* compiled from: ClientAddOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/c$f;", "LrO0/c;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.c$f */
    public static final /* data */ class f implements InterfaceC47579c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f429799a;

        public f(@l PrintableText printableText) {
            this.f429799a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f429799a, ((f) obj).f429799a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f429799a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowPhoneError(error="), this.f429799a, ')');
        }
    }

    /* compiled from: ClientAddOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrO0/c$g;", "LrO0/c;", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rO0.c$g */
    public static final /* data */ class g implements InterfaceC47579c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f429800a;

        public g(@l PrintableText printableText) {
            this.f429800a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f429800a, ((g) obj).f429800a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f429800a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowSurnameError(error="), this.f429800a, ')');
        }
    }
}
