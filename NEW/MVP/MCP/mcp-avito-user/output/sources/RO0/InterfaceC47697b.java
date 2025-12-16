package ro0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PasswordChangeOneTimeEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lro0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lro0/b$a;", "Lro0/b$b;", "Lro0/b$c;", "Lro0/b$d;", "Lro0/b$e;", "Lro0/b$f;", "Lro0/b$g;", "Lro0/b$h;", "Lro0/b$i;", "Lro0/b$j;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ro0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47697b {

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/b$a;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$a */
    public static final /* data */ class a implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f430177a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f430178b;

        public a(boolean z12, @l String str) {
            this.f430177a = z12;
            this.f430178b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f430177a == aVar.f430177a && L.f(this.f430178b, aVar.f430178b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f430177a) * 31;
            String str = this.f430178b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Close(isSuccess=");
            sb2.append(this.f430177a);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f430178b, ')');
        }

        public /* synthetic */ a(boolean z12, String str, int i12, C42822w c42822w) {
            this(z12, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/b$b;", "Lro0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12394b implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12394b f430179a = new C12394b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12394b);
        }

        public final int hashCode() {
            return -33459664;
        }

        @k
        public final String toString() {
            return "DisableAutofill";
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/b$c;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$c */
    public static final /* data */ class c implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InputType f430180a;

        public c(@k InputType inputType) {
            this.f430180a = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f430180a == ((c) obj).f430180a;
        }

        public final int hashCode() {
            return this.f430180a.hashCode();
        }

        @k
        public final String toString() {
            return "FocusInput(inputType=" + this.f430180a + ')';
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/b$d;", "Lro0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$d */
    public static final /* data */ class d implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f430181a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2116682298;
        }

        @k
        public final String toString() {
            return "NavigateHome";
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/b$e;", "Lro0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$e */
    public static final /* data */ class e implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f430182a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 330640476;
        }

        @k
        public final String toString() {
            return "OpenAuth";
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/b$f;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$f */
    public static final /* data */ class f implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f430183a;

        public f(@l String str) {
            this.f430183a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f430183a, ((f) obj).f430183a);
        }

        public final int hashCode() {
            String str = this.f430183a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenPasswordRecovery(login="), this.f430183a, ')');
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/b$g;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$g */
    public static final /* data */ class g implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f430184a;

        public g(@k String str) {
            this.f430184a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f430184a, ((g) obj).f430184a);
        }

        public final int hashCode() {
            return this.f430184a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetOldPassword(text="), this.f430184a, ')');
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/b$h;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$h */
    public static final /* data */ class h implements InterfaceC47697b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            ((h) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ShowDialog(dialog=null)";
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/b$j;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$j */
    public static final /* data */ class j implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f430187a;

        public j(boolean z12) {
            this.f430187a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f430187a == ((j) obj).f430187a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f430187a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ToggleOldPasswordHidden(isHidden="), this.f430187a, ')');
        }
    }

    /* compiled from: PasswordChangeOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/b$i;", "Lro0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.b$i */
    public static final /* data */ class i implements InterfaceC47697b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f430185a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final com.avito.android.component.toast.f f430186b;

        public i(@k PrintableText printableText, @k com.avito.android.component.toast.f fVar) {
            this.f430185a = printableText;
            this.f430186b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f430185a, iVar.f430185a) && L.f(this.f430186b, iVar.f430186b);
        }

        public final int hashCode() {
            return this.f430186b.hashCode() + (this.f430185a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(message=" + this.f430185a + ", type=" + this.f430186b + ')';
        }

        public /* synthetic */ i(PrintableText printableText, com.avito.android.component.toast.f fVar, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? f.a.f125253a : fVar);
        }
    }
}
