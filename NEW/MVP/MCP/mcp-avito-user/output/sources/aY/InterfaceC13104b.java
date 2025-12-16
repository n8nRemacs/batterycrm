package Ay;

import Ay.InterfaceC13103a;
import Ay.d;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_management_core.edit_text_field.FormattedAlertSettings;
import com.avito.android.profile_management_core.edit_text_field.NotSavedAlertSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditTextFieldInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LAy/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LAy/b$a;", "LAy/b$b;", "LAy/b$c;", "LAy/b$d;", "LAy/b$e;", "LAy/b$f;", "LAy/b$g;", "LAy/b$h;", "LAy/b$i;", "LAy/b$j;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ay.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC13104b {

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/b$a;", "LAy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$a */
    public static final /* data */ class a implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f742a;

        public a(boolean z12) {
            this.f742a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f742a == ((a) obj).f742a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f742a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("LeaveEditTextFieldScreen(hasChanged="), this.f742a, ')');
        }
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAy/b$b;", "LAy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$b, reason: collision with other inner class name */
    public static final class C0032b implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0032b f743a = new C0032b();
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAy/b$c;", "LAy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$c */
    public static final class c implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f744a = new c();
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/b$d;", "LAy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$d */
    public static final /* data */ class d implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f745a;

        public d(@k String str) {
            this.f745a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f745a, ((d) obj).f745a);
        }

        public final int hashCode() {
            return this.f745a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnTextChanged(text="), this.f745a, ')');
        }
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/b$e;", "LAy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$e */
    public static final /* data */ class e implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f746a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC13103a.g f747b;

        public e(@k Throwable th2, @k InterfaceC13103a.g gVar) {
            this.f746a = th2;
            this.f747b = gVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f746a, eVar.f746a) && this.f747b.equals(eVar.f747b);
        }

        public final int hashCode() {
            return this.f747b.f741a.hashCode() + (this.f746a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "SavingFailure(throwable=" + this.f746a + ", action=" + this.f747b + ')';
        }
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/b$f;", "LAy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$f */
    public static final /* data */ class f implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f748a;

        public f(@l String str) {
            this.f748a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f748a, ((f) obj).f748a);
        }

        public final int hashCode() {
            String str = this.f748a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SavingFailureIncorrectValues(message="), this.f748a, ')');
        }
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LAy/b$g;", "LAy/b;", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$g */
    public static final class g implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f749a = new g();
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/b$h;", "LAy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$h */
    public static final /* data */ class h implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final FormattedAlertSettings f750a;

        public h(@k FormattedAlertSettings formattedAlertSettings) {
            this.f750a = formattedAlertSettings;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f750a, ((h) obj).f750a);
        }

        public final int hashCode() {
            return this.f750a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowFormattedAlert(settings=" + this.f750a + ')';
        }
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/b$i;", "LAy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$i */
    public static final /* data */ class i implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final NotSavedAlertSettings f751a;

        public i(@k NotSavedAlertSettings notSavedAlertSettings) {
            this.f751a = notSavedAlertSettings;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f751a, ((i) obj).f751a);
        }

        public final int hashCode() {
            return this.f751a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowNotSavedAlert(settings=" + this.f751a + ')';
        }
    }

    /* compiled from: EditTextFieldInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAy/b$j;", "LAy/b;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ay.b$j */
    public static final /* data */ class j implements InterfaceC13104b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final d.c f752a;

        public j(@k d.c cVar) {
            this.f752a = cVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f752a, ((j) obj).f752a);
        }

        public final int hashCode() {
            return this.f752a.hashCode();
        }

        @k
        public final String toString() {
            return "UpdateFormatTextState(formatTextState=" + this.f752a + ')';
        }
    }
}
