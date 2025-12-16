package so0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PasswordSettingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lso0/b;", "", "a", "b", "c", "d", "e", "Lso0/b$a;", "Lso0/b$b;", "Lso0/b$c;", "Lso0/b$d;", "Lso0/b$e;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: so0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48392b {

    /* compiled from: PasswordSettingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lso0/b$b;", "Lso0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: so0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12645b implements InterfaceC48392b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12645b f438860a = new C12645b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12645b);
        }

        public final int hashCode() {
            return 724206396;
        }

        @k
        public final String toString() {
            return "DisableAutofill";
        }
    }

    /* compiled from: PasswordSettingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lso0/b$c;", "Lso0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: so0.b$c */
    public static final /* data */ class c implements InterfaceC48392b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f438861a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1341485040;
        }

        @k
        public final String toString() {
            return "FocusInput";
        }
    }

    /* compiled from: PasswordSettingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lso0/b$d;", "Lso0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: so0.b$d */
    public static final /* data */ class d implements InterfaceC48392b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f438862a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1850740528;
        }

        @k
        public final String toString() {
            return "OpenAuth";
        }
    }

    /* compiled from: PasswordSettingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lso0/b$a;", "Lso0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: so0.b$a */
    public static final /* data */ class a implements InterfaceC48392b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f438858a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f438859b;

        public a(boolean z12, @l String str) {
            this.f438858a = z12;
            this.f438859b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f438858a == aVar.f438858a && L.f(this.f438859b, aVar.f438859b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f438858a) * 31;
            String str = this.f438859b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Close(isSuccess=");
            sb2.append(this.f438858a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f438859b, ')');
        }

        public /* synthetic */ a(boolean z12, String str, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: PasswordSettingOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lso0/b$e;", "Lso0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: so0.b$e */
    public static final /* data */ class e implements InterfaceC48392b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f438863a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f438864b;

        public e(@k PrintableText printableText, @k f fVar) {
            this.f438863a = printableText;
            this.f438864b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f438863a, eVar.f438863a) && L.f(this.f438864b, eVar.f438864b);
        }

        public final int hashCode() {
            return this.f438864b.hashCode() + (this.f438863a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(message=" + this.f438863a + ", type=" + this.f438864b + ')';
        }

        public /* synthetic */ e(PrintableText printableText, f fVar, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? f.a.f125253a : fVar);
        }
    }
}
