package ee;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.UserDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CompleteRegistrationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lee/b;", "", "a", "b", "c", "d", "e", "Lee/b$a;", "Lee/b$b;", "Lee/b$c;", "Lee/b$d;", "Lee/b$e;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: CompleteRegistrationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lee/b$a;", "Lee/b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f395269a = new a();
    }

    /* compiled from: CompleteRegistrationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/b$b;", "Lee/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11095b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InputType f395270a;

        public C11095b(@k InputType inputType) {
            this.f395270a = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11095b) && this.f395270a == ((C11095b) obj).f395270a;
        }

        public final int hashCode() {
            return this.f395270a.hashCode();
        }

        @k
        public final String toString() {
            return "FocusInput(inputType=" + this.f395270a + ')';
        }
    }

    /* compiled from: CompleteRegistrationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/b$c;", "Lee/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f395271a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f395272b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f395273c;

        public c(@l String str, @l String str2, @l String str3) {
            this.f395271a = str;
            this.f395272b = str2;
            this.f395273c = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f395271a, cVar.f395271a) && L.f(this.f395272b, cVar.f395272b) && L.f(this.f395273c, cVar.f395273c);
        }

        public final int hashCode() {
            String str = this.f395271a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f395272b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f395273c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NeedParsingPermission(name=");
            sb2.append(this.f395271a);
            sb2.append(", phone=");
            sb2.append(this.f395272b);
            sb2.append(", login=");
            return C22026a.c(sb2, this.f395273c, ')');
        }
    }

    /* compiled from: CompleteRegistrationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/b$d;", "Lee/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserDialog f395274a;

        public d(@k UserDialog userDialog) {
            this.f395274a = userDialog;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f395274a, ((d) obj).f395274a);
        }

        public final int hashCode() {
            return this.f395274a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDialog(dialog=" + this.f395274a + ')';
        }
    }

    /* compiled from: CompleteRegistrationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/b$e;", "Lee/b;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f395275a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f395276b;

        public e(@k PrintableText printableText, @k f fVar) {
            this.f395275a = printableText;
            this.f395276b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f395275a, eVar.f395275a) && L.f(this.f395276b, eVar.f395276b);
        }

        public final int hashCode() {
            return this.f395276b.hashCode() + (this.f395275a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(message=" + this.f395275a + ", type=" + this.f395276b + ')';
        }

        public /* synthetic */ e(PrintableText printableText, f fVar, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? f.a.f125253a : fVar);
        }
    }
}
