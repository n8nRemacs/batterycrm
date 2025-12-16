package ee;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.authorization.complete_registration.mvi.entity.InputType;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CompleteRegistrationAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lee/a;", "", "a", "b", "c", "d", "e", "f", "Lee/a$a;", "Lee/a$b;", "Lee/a$c;", "Lee/a$d;", "Lee/a$e;", "Lee/a$f;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ee.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC40093a {

    /* compiled from: CompleteRegistrationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/a$a;", "Lee/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11094a implements InterfaceC40093a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Profile f395262a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Session f395263b;

        public C11094a(@k Profile profile, @k Session session) {
            this.f395262a = profile;
            this.f395263b = session;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11094a)) {
                return false;
            }
            C11094a c11094a = (C11094a) obj;
            return L.f(this.f395262a, c11094a.f395262a) && L.f(this.f395263b, c11094a.f395263b);
        }

        public final int hashCode() {
            return this.f395263b.hashCode() + (this.f395262a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "HandleParsingPermissionResult(profile=" + this.f395262a + ", session=" + this.f395263b + ')';
        }
    }

    /* compiled from: CompleteRegistrationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/a$b;", "Lee/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee.a$b */
    public static final /* data */ class b implements InterfaceC40093a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final InputType f395264a;

        public b(@k InputType inputType) {
            this.f395264a = inputType;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f395264a == ((b) obj).f395264a;
        }

        public final int hashCode() {
            return this.f395264a.hashCode();
        }

        @k
        public final String toString() {
            return "InputFocused(input=" + this.f395264a + ')';
        }
    }

    /* compiled from: CompleteRegistrationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/a$c;", "Lee/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee.a$c */
    public static final /* data */ class c implements InterfaceC40093a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f395265a;

        public c(boolean z12) {
            this.f395265a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f395265a == ((c) obj).f395265a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f395265a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("Register(isPasswordValid="), this.f395265a, ')');
        }
    }

    /* compiled from: CompleteRegistrationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lee/a$d;", "Lee/a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee.a$d */
    public static final class d implements InterfaceC40093a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f395266a = new d();
    }

    /* compiled from: CompleteRegistrationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/a$e;", "Lee/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee.a$e */
    public static final /* data */ class e implements InterfaceC40093a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395267a;

        public e(@k String str) {
            this.f395267a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f395267a, ((e) obj).f395267a);
        }

        public final int hashCode() {
            return this.f395267a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdateName(name="), this.f395267a, ')');
        }
    }

    /* compiled from: CompleteRegistrationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lee/a$f;", "Lee/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ee.a$f */
    public static final /* data */ class f implements InterfaceC40093a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f395268a;

        public f(@k String str) {
            this.f395268a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f395268a, ((f) obj).f395268a);
        }

        public final int hashCode() {
            return this.f395268a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("UpdatePassword(password="), this.f395268a, ')');
        }
    }
}
