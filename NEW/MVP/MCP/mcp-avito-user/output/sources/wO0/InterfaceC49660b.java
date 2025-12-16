package wo0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.component.toast.f;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TfaDisablePasswordOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lwo0/b;", "", "a", "b", "c", "d", "e", "Lwo0/b$a;", "Lwo0/b$b;", "Lwo0/b$c;", "Lwo0/b$d;", "Lwo0/b$e;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wo0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49660b {

    /* compiled from: TfaDisablePasswordOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwo0/b$a;", "Lwo0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0.b$a */
    public static final /* data */ class a implements InterfaceC49660b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f441785a;

        public a(boolean z12) {
            this.f441785a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f441785a == ((a) obj).f441785a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f441785a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Close(isSuccess="), this.f441785a, ')');
        }
    }

    /* compiled from: TfaDisablePasswordOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwo0/b$b;", "Lwo0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12831b implements InterfaceC49660b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12831b f441786a = new C12831b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12831b);
        }

        public final int hashCode() {
            return -1659244135;
        }

        @k
        public final String toString() {
            return "OpenForgotPassword";
        }
    }

    /* compiled from: TfaDisablePasswordOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lwo0/b$c;", "Lwo0/b;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0.b$c */
    public static final /* data */ class c implements InterfaceC49660b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f441787a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1908863125;
        }

        @k
        public final String toString() {
            return "ShowKeyboard";
        }
    }

    /* compiled from: TfaDisablePasswordOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwo0/b$e;", "Lwo0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0.b$e */
    public static final /* data */ class e implements InterfaceC49660b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            ((e) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        @k
        public final String toString() {
            return "TogglePasswordHidden(isHidden=false)";
        }
    }

    /* compiled from: TfaDisablePasswordOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwo0/b$d;", "Lwo0/b;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wo0.b$d */
    public static final /* data */ class d implements InterfaceC49660b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f441788a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final f f441789b;

        public d(@k PrintableText printableText, @k f fVar) {
            this.f441788a = printableText;
            this.f441789b = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f441788a, dVar.f441788a) && L.f(this.f441789b, dVar.f441789b);
        }

        public final int hashCode() {
            return this.f441789b.hashCode() + (this.f441788a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ShowToast(message=" + this.f441788a + ", type=" + this.f441789b + ')';
        }

        public /* synthetic */ d(PrintableText printableText, f fVar, int i12, C42822w c42822w) {
            this(printableText, (i12 & 2) != 0 ? f.a.f125253a : fVar);
        }
    }
}
