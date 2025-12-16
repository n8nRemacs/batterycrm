package Jo;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.code_check_public.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CodeConfirmOneTimeEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LJo/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LJo/b$a;", "LJo/b$b;", "LJo/b$c;", "LJo/b$d;", "LJo/b$e;", "LJo/b$f;", "LJo/b$g;", "LJo/b$h;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC14225b {

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJo/b$a;", "LJo/b;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$a */
    public static final /* data */ class a implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f9138a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -710348932;
        }

        @k
        public final String toString() {
            return "DisableAutofill";
        }
    }

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/b$b;", "LJo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0542b implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final PrintableText f9139a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f9140b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f9141c;

        public C0542b() {
            this(null, null, null, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0542b)) {
                return false;
            }
            C0542b c0542b = (C0542b) obj;
            return L.f(this.f9139a, c0542b.f9139a) && L.f(this.f9140b, c0542b.f9140b) && L.f(this.f9141c, c0542b.f9141c);
        }

        public final int hashCode() {
            PrintableText printableText = this.f9139a;
            int iHashCode = (printableText == null ? 0 : printableText.hashCode()) * 31;
            ApiError apiError = this.f9140b;
            int iHashCode2 = (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
            Throwable th2 = this.f9141c;
            return iHashCode2 + (th2 != null ? th2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(message=");
            sb2.append(this.f9139a);
            sb2.append(", apiError=");
            sb2.append(this.f9140b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f9141c, ')');
        }

        public C0542b(PrintableText printableText, ApiError apiError, Throwable th2, int i12, C42822w c42822w) {
            printableText = (i12 & 1) != 0 ? null : printableText;
            apiError = (i12 & 2) != 0 ? null : apiError;
            th2 = (i12 & 4) != 0 ? null : th2;
            this.f9139a = printableText;
            this.f9140b = apiError;
            this.f9141c = th2;
        }
    }

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/b$c;", "LJo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$c */
    public static final /* data */ class c implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final To.b f9142a;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9142a, ((c) obj).f9142a);
        }

        public final int hashCode() {
            To.b bVar = this.f9142a;
            if (bVar == null) {
                return 0;
            }
            return bVar.f15854a.hashCode();
        }

        @k
        public final String toString() {
            return "Finished(packResult=" + this.f9142a + ')';
        }

        public c(@l To.b bVar) {
            this.f9142a = bVar;
        }

        public /* synthetic */ c(To.b bVar, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bVar);
        }
    }

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJo/b$d;", "LJo/b;", "<init>", "()V", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$d */
    public static final class d implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f9143a = new d();
    }

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/b$e;", "LJo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$e */
    public static final /* data */ class e implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.code_check_public.a f9144a;

        public e(@k com.avito.android.code_check_public.a aVar) {
            this.f9144a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f9144a, ((e) obj).f9144a);
        }

        public final int hashCode() {
            return this.f9144a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(destination=" + this.f9144a + ')';
        }
    }

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/b$f;", "LJo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$f */
    public static final /* data */ class f implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9145a;

        public f(@k String str) {
            this.f9145a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f9145a, ((f) obj).f9145a);
        }

        public final int hashCode() {
            return this.f9145a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SetCode(code="), this.f9145a, ')');
        }
    }

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/b$g;", "LJo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$g */
    public static final /* data */ class g implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f9146a;

        public g(@k PrintableText printableText) {
            this.f9146a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f9146a, ((g) obj).f9146a);
        }

        public final int hashCode() {
            return this.f9146a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowToast(text="), this.f9146a, ')');
        }
    }

    /* compiled from: CodeConfirmOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJo/b$h;", "LJo/b;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jo.b$h */
    public static final /* data */ class h implements InterfaceC14225b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final i f9147a;

        public h(@k i iVar) {
            this.f9147a = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f9147a, ((h) obj).f9147a);
        }

        public final int hashCode() {
            return this.f9147a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowUserDialog(dialog=" + this.f9147a + ')';
        }
    }
}
