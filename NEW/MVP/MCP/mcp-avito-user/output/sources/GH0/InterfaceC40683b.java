package gh0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DialogOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lgh0/b;", "", "a", "b", "c", "d", "e", "Lgh0/b$a;", "Lgh0/b$b;", "Lgh0/b$c;", "Lgh0/b$d;", "Lgh0/b$e;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gh0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC40683b {

    /* compiled from: DialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgh0/b$a;", "Lgh0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.b$a */
    public static final /* data */ class a implements InterfaceC40683b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f396711a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -436307417;
        }

        @k
        public final String toString() {
            return "CloseDialog";
        }
    }

    /* compiled from: DialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/b$b;", "Lgh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11223b implements InterfaceC40683b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f396712a;

        public C11223b(@k DeepLink deepLink) {
            this.f396712a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11223b) && L.f(this.f396712a, ((C11223b) obj).f396712a);
        }

        public final int hashCode() {
            return this.f396712a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f396712a, ')');
        }
    }

    /* compiled from: DialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/b$c;", "Lgh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.b$c */
    public static final /* data */ class c implements InterfaceC40683b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f396713a;

        public c(@k String str) {
            this.f396713a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f396713a, ((c) obj).f396713a);
        }

        public final int hashCode() {
            return this.f396713a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f396713a, ')');
        }
    }

    /* compiled from: DialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgh0/b$d;", "Lgh0/b;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.b$d */
    public static final /* data */ class d implements InterfaceC40683b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f396714a;

        /* JADX WARN: Multi-variable type inference failed */
        public d() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f396714a, ((d) obj).f396714a);
        }

        public final int hashCode() {
            PrintableText printableText = this.f396714a;
            if (printableText == null) {
                return 0;
            }
            return printableText.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(text="), this.f396714a, ')');
        }

        public d(@l PrintableText printableText) {
            this.f396714a = printableText;
        }

        public /* synthetic */ d(PrintableText printableText, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : printableText);
        }
    }

    /* compiled from: DialogOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgh0/b$e;", "Lgh0/b;", "<init>", "()V", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: gh0.b$e */
    public static final /* data */ class e implements InterfaceC40683b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f396715a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -257854143;
        }

        @k
        public final String toString() {
            return "StartAuthentication";
        }
    }
}
