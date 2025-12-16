package dz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import jz.C42453d;
import jz.InterfaceC42451b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmployeeModeAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Ldz/a;", "", "a", "b", "c", "d", "e", "Ldz/a$a;", "Ldz/a$b;", "Ldz/a$c;", "Ldz/a$d;", "Ldz/a$e;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: dz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC39830a {

    /* compiled from: EmployeeModeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldz/a$a;", "Ldz/a;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11046a implements InterfaceC39830a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11046a f394185a = new C11046a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11046a);
        }

        public final int hashCode() {
            return -188966924;
        }

        @k
        public final String toString() {
            return "LoadEmployeeInfo";
        }
    }

    /* compiled from: EmployeeModeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/a$b;", "Ldz/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.a$b */
    public static final /* data */ class b implements InterfaceC39830a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394186a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC42451b f394187b;

        public b(@k String str, @k InterfaceC42451b interfaceC42451b) {
            this.f394186a = str;
            this.f394187b = interfaceC42451b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f394186a, bVar.f394186a) && L.f(this.f394187b, bVar.f394187b);
        }

        public final int hashCode() {
            return this.f394187b.hashCode() + (this.f394186a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "ProfileChangeStarted(targetProfileId=" + this.f394186a + ", targetEmployeeMode=" + this.f394187b + ')';
        }
    }

    /* compiled from: EmployeeModeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/a$c;", "Ldz/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.a$c */
    public static final /* data */ class c implements InterfaceC39830a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f394188a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f394189b;

        public c(@k String str, @k String str2) {
            this.f394188a = str;
            this.f394189b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f394188a, cVar.f394188a) && L.f(this.f394189b, cVar.f394189b);
        }

        public final int hashCode() {
            return this.f394189b.hashCode() + (this.f394188a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ProfileChanged(profileId=");
            sb2.append(this.f394188a);
            sb2.append(", profileHashId=");
            return C22026a.c(sb2, this.f394189b, ')');
        }
    }

    /* compiled from: EmployeeModeAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldz/a$d;", "Ldz/a;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.a$d */
    public static final /* data */ class d implements InterfaceC39830a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f394190a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1529615419;
        }

        @k
        public final String toString() {
            return "RefreshAccessInfo";
        }
    }

    /* compiled from: EmployeeModeAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldz/a$e;", "Ldz/a;", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dz.a$e */
    public static final /* data */ class e implements InterfaceC39830a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C42453d f394191a;

        public e(@k C42453d c42453d) {
            this.f394191a = c42453d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f394191a, ((e) obj).f394191a);
        }

        public final int hashCode() {
            return this.f394191a.hashCode();
        }

        @k
        public final String toString() {
            return "SwitchMode(switchMode=" + this.f394191a + ')';
        }
    }
}
