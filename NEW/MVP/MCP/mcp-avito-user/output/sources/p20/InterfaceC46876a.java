package p20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lp20/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lp20/a$a;", "Lp20/a$b;", "Lp20/a$c;", "Lp20/a$d;", "Lp20/a$e;", "Lp20/a$f;", "Lp20/a$g;", "Lp20/a$h;", "Lp20/a$i;", "Lp20/a$j;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC46876a {

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/a$a;", "Lp20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12252a implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParticipantFieldId f428123a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f428124b;

        public C12252a(@k ParticipantFieldId participantFieldId, boolean z12) {
            this.f428123a = participantFieldId;
            this.f428124b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12252a)) {
                return false;
            }
            C12252a c12252a = (C12252a) obj;
            return this.f428123a == c12252a.f428123a && this.f428124b == c12252a.f428124b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f428124b) + (this.f428123a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentFieldFocused(id=");
            sb2.append(this.f428123a);
            sb2.append(", isFocused=");
            return r.x(sb2, this.f428124b, ')');
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/a$b;", "Lp20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$b */
    public static final /* data */ class b implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParticipantFieldId f428125a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f428126b;

        public b(@k ParticipantFieldId participantFieldId, @k String str) {
            this.f428125a = participantFieldId;
            this.f428126b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f428125a == bVar.f428125a && L.f(this.f428126b, bVar.f428126b);
        }

        public final int hashCode() {
            return this.f428126b.hashCode() + (this.f428125a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AgentFieldUpdated(id=");
            sb2.append(this.f428125a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f428126b, ')');
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/a$c;", "Lp20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$c */
    public static final /* data */ class c implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428127a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2012181343;
        }

        @k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/a$d;", "Lp20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$d */
    public static final /* data */ class d implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParticipantFieldId f428128a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f428129b;

        public d(@k ParticipantFieldId participantFieldId, boolean z12) {
            this.f428128a = participantFieldId;
            this.f428129b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f428128a == dVar.f428128a && this.f428129b == dVar.f428129b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f428129b) + (this.f428128a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientFieldFocused(id=");
            sb2.append(this.f428128a);
            sb2.append(", isFocused=");
            return r.x(sb2, this.f428129b, ')');
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/a$e;", "Lp20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$e */
    public static final /* data */ class e implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ParticipantFieldId f428130a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f428131b;

        public e(@k ParticipantFieldId participantFieldId, @k String str) {
            this.f428130a = participantFieldId;
            this.f428131b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f428130a == eVar.f428130a && L.f(this.f428131b, eVar.f428131b);
        }

        public final int hashCode() {
            return this.f428131b.hashCode() + (this.f428130a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClientFieldUpdated(id=");
            sb2.append(this.f428130a);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f428131b, ')');
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp20/a$f;", "Lp20/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$f */
    public static final /* data */ class f implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final MortgageClient f428132a;

        public f(@k MortgageClient mortgageClient) {
            this.f428132a = mortgageClient;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f428132a, ((f) obj).f428132a);
        }

        public final int hashCode() {
            return this.f428132a.hashCode();
        }

        @k
        public final String toString() {
            return "ClientSelected(client=" + this.f428132a + ')';
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/a$g;", "Lp20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$g */
    public static final /* data */ class g implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f428133a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2048150910;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/a$h;", "Lp20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$h */
    public static final /* data */ class h implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f428134a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1905798458;
        }

        @k
        public final String toString() {
            return "CreateApplication";
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/a$i;", "Lp20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$i */
    public static final /* data */ class i implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f428135a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -634925454;
        }

        @k
        public final String toString() {
            return "CreateNewClientClicked";
        }
    }

    /* compiled from: ParticipantAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/a$j;", "Lp20/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.a$j */
    public static final /* data */ class j implements InterfaceC46876a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f428136a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 613933623;
        }

        @k
        public final String toString() {
            return "ReloadForm";
        }
    }
}
