package U10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientFormAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LU10/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LU10/a$a;", "LU10/a$b;", "LU10/a$c;", "LU10/a$d;", "LU10/a$e;", "LU10/a$f;", "LU10/a$g;", "LU10/a$h;", "LU10/a$i;", "LU10/a$j;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/a$a;", "LU10/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: U10.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1091a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1091a f16088a = new C1091a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1091a);
        }

        public final int hashCode() {
            return 2058185133;
        }

        @k
        public final String toString() {
            return "ActionButtonClick";
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/a$b;", "LU10/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f16089a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f16090b;

        public b(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f16089a = contactInfoFieldId;
            this.f16090b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f16089a == bVar.f16089a && L.f(this.f16090b, bVar.f16090b);
        }

        public final int hashCode() {
            return this.f16090b.hashCode() + (this.f16089a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentInfoFieldChange(id=");
            sb2.append(this.f16089a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f16090b, ')');
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/a$c;", "LU10/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f16091a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -347029901;
        }

        @k
        public final String toString() {
            return "BannerActionClick";
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/a$d;", "LU10/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f16092a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f16093b;

        public d(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f16092a = contactInfoFieldId;
            this.f16093b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f16092a == dVar.f16092a && L.f(this.f16093b, dVar.f16093b);
        }

        public final int hashCode() {
            return this.f16093b.hashCode() + (this.f16092a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientInfoFieldChange(id=");
            sb2.append(this.f16092a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f16093b, ')');
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/a$e;", "LU10/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f16094a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1482671460;
        }

        @k
        public final String toString() {
            return "ClientSearchInputClick";
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LU10/a$f;", "LU10/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MortgageClient f16095a;

        public f(@k MortgageClient mortgageClient) {
            this.f16095a = mortgageClient;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f16095a, ((f) obj).f16095a);
        }

        public final int hashCode() {
            return this.f16095a.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f16095a + ')';
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/a$g;", "LU10/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f16096a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -171079828;
        }

        @k
        public final String toString() {
            return "CreateNewClientClick";
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/a$h;", "LU10/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f16097a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1872909506;
        }

        @k
        public final String toString() {
            return "PhoneConfirmSuccess";
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/a$i;", "LU10/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f16098a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1269667821;
        }

        @k
        public final String toString() {
            return "RetryClick";
        }
    }

    /* compiled from: ApplicationClientFormAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/a$j;", "LU10/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f16099a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1520051103;
        }

        @k
        public final String toString() {
            return "SelectedClientInfoClick";
        }
    }
}
