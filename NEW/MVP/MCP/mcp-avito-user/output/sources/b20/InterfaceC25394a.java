package b20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationContactInfoAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lb20/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lb20/a$a;", "Lb20/a$b;", "Lb20/a$c;", "Lb20/a$d;", "Lb20/a$e;", "Lb20/a$f;", "Lb20/a$g;", "Lb20/a$h;", "Lb20/a$i;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC25394a {

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/a$a;", "Lb20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1986a implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f56823a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56824b;

        public C1986a(@k ContactInfoFieldId contactInfoFieldId, boolean z12) {
            this.f56823a = contactInfoFieldId;
            this.f56824b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1986a)) {
                return false;
            }
            C1986a c1986a = (C1986a) obj;
            return this.f56823a == c1986a.f56823a && this.f56824b == c1986a.f56824b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f56824b) + (this.f56823a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentFieldFocusChanged(id=");
            sb2.append(this.f56823a);
            sb2.append(", hasFocus=");
            return r.x(sb2, this.f56824b, ')');
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/a$b;", "Lb20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$b */
    public static final /* data */ class b implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f56825a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56826b;

        public b(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f56825a = contactInfoFieldId;
            this.f56826b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f56825a == bVar.f56825a && L.f(this.f56826b, bVar.f56826b);
        }

        public final int hashCode() {
            return this.f56826b.hashCode() + (this.f56825a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentFieldUpdated(id=");
            sb2.append(this.f56825a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f56826b, ')');
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb20/a$c;", "Lb20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$c */
    public static final /* data */ class c implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f56827a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 944733624;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/a$d;", "Lb20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$d */
    public static final /* data */ class d implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f56828a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56829b;

        public d(@k ContactInfoFieldId contactInfoFieldId, boolean z12) {
            this.f56828a = contactInfoFieldId;
            this.f56829b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f56828a == dVar.f56828a && this.f56829b == dVar.f56829b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f56829b) + (this.f56828a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientFieldFocusChanged(id=");
            sb2.append(this.f56828a);
            sb2.append(", hasFocus=");
            return r.x(sb2, this.f56829b, ')');
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/a$e;", "Lb20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$e */
    public static final /* data */ class e implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ContactInfoFieldId f56830a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f56831b;

        public e(@k ContactInfoFieldId contactInfoFieldId, @k String str) {
            this.f56830a = contactInfoFieldId;
            this.f56831b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f56830a == eVar.f56830a && L.f(this.f56831b, eVar.f56831b);
        }

        public final int hashCode() {
            return this.f56831b.hashCode() + (this.f56830a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientFieldUpdated(id=");
            sb2.append(this.f56830a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f56831b, ')');
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lb20/a$f;", "Lb20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$f */
    public static final /* data */ class f implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MortgageClient f56832a;

        public f(@k MortgageClient mortgageClient) {
            this.f56832a = mortgageClient;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f56832a, ((f) obj).f56832a);
        }

        public final int hashCode() {
            return this.f56832a.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f56832a + ')';
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb20/a$g;", "Lb20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$g */
    public static final /* data */ class g implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f56833a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1412040317;
        }

        @k
        public final String toString() {
            return "CreateApplication";
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb20/a$h;", "Lb20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$h */
    public static final /* data */ class h implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f56834a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 389760969;
        }

        @k
        public final String toString() {
            return "CreateNewClientClicked";
        }
    }

    /* compiled from: ApplicationContactInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb20/a$i;", "Lb20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b20.a$i */
    public static final /* data */ class i implements InterfaceC25394a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f56835a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1395825138;
        }

        @k
        public final String toString() {
            return "ReloadForm";
        }
    }
}
