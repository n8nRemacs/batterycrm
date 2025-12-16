package ro0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.safety.password_change.mvi.entity.InputType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PasswordChangeAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lro0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lro0/a$a;", "Lro0/a$b;", "Lro0/a$c;", "Lro0/a$d;", "Lro0/a$e;", "Lro0/a$f;", "Lro0/a$g;", "Lro0/a$h;", "Lro0/a$i;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ro0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47696a {

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/a$a;", "Lro0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12393a implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f430168a;

        public C12393a(boolean z12) {
            this.f430168a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12393a) && this.f430168a == ((C12393a) obj).f430168a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f430168a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("AuthCompleted(isSucceeded="), this.f430168a, ')');
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/a$b;", "Lro0/a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$b */
    public static final /* data */ class b implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f430169a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -983905118;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/a$c;", "Lro0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$c */
    public static final /* data */ class c implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f430170a;

        public c(boolean z12) {
            this.f430170a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f430170a == ((c) obj).f430170a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f430170a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ChangeClick(isNewPasswordValid="), this.f430170a, ')');
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/a$d;", "Lro0/a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$d */
    public static final /* data */ class d implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f430171a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -306525991;
        }

        @k
        public final String toString() {
            return "ForgotPassword";
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/a$e;", "Lro0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$e */
    public static final /* data */ class e implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InputType f430172a;

        public e(@k InputType inputType) {
            this.f430172a = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f430172a == ((e) obj).f430172a;
        }

        public final int hashCode() {
            return this.f430172a.hashCode();
        }

        @k
        public final String toString() {
            return "InputFocused(input=" + this.f430172a + ')';
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/a$f;", "Lro0/a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$f */
    public static final /* data */ class f implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f430173a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 61825858;
        }

        @k
        public final String toString() {
            return "RequestInputFocus";
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro0/a$g;", "Lro0/a;", "<init>", "()V", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$g */
    public static final /* data */ class g implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f430174a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 884823453;
        }

        @k
        public final String toString() {
            return "ToggleOldPasswordHidden";
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/a$h;", "Lro0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$h */
    public static final /* data */ class h implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f430175a;

        public h(@k String str) {
            this.f430175a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f430175a, ((h) obj).f430175a);
        }

        public final int hashCode() {
            return this.f430175a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateNewPassword(text="), this.f430175a, ')');
        }
    }

    /* compiled from: PasswordChangeAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lro0/a$i;", "Lro0/a;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ro0.a$i */
    public static final /* data */ class i implements InterfaceC47696a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f430176a;

        public i(@k String str) {
            this.f430176a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f430176a, ((i) obj).f430176a);
        }

        public final int hashCode() {
            return this.f430176a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateOldPassword(text="), this.f430176a, ')');
        }
    }
}
