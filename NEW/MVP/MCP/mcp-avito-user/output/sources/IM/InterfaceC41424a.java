package im;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import gm.C40705b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CampaignsSaleAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"Lim/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "Lim/a$a;", "Lim/a$b;", "Lim/a$c;", "Lim/a$d;", "Lim/a$e;", "Lim/a$f;", "Lim/a$g;", "Lim/a$h;", "Lim/a$i;", "Lim/a$j;", "Lim/a$k;", "Lim/a$l;", "Lim/a$m;", "Lim/a$n;", "Lim/a$o;", "Lim/a$p;", "Lim/a$q;", "Lim/a$r;", "Lim/a$s;", "Lim/a$t;", "Lim/a$u;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: im.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC41424a {

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$a;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11392a implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398717a;

        public C11392a(@Y61.k String str) {
            this.f398717a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11392a) && L.f(this.f398717a, ((C11392a) obj).f398717a);
        }

        public final int hashCode() {
            return this.f398717a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("AddAllItems(uuid="), this.f398717a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$b;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$b */
    public static final class b implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f398718a = new b();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$c;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$c */
    public static final /* data */ class c implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f398719a;

        public c(@Y61.k DeepLink deepLink) {
            this.f398719a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f398719a, ((c) obj).f398719a);
        }

        public final int hashCode() {
            return this.f398719a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ChooseItems(deepLink="), this.f398719a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$d;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$d */
    public static final class d implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f398720a = new d();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$e;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$e */
    public static final class e implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f398721a = new e();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$f;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$f */
    public static final /* data */ class f implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f398722a;

        public f(@Y61.k DeepLink deepLink) {
            this.f398722a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f398722a, ((f) obj).f398722a);
        }

        public final int hashCode() {
            return this.f398722a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeeplinkClicked(deeplink="), this.f398722a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$g;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$g */
    public static final /* data */ class g implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398723a;

        public g(@Y61.k String str) {
            this.f398723a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f398723a, ((g) obj).f398723a);
        }

        public final int hashCode() {
            return this.f398723a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteBlock(uuid="), this.f398723a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$h;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$h */
    public static final /* data */ class h implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398724a;

        public h(@Y61.k String str) {
            this.f398724a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f398724a, ((h) obj).f398724a);
        }

        public final int hashCode() {
            return this.f398724a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("DeleteBlockConfirmed(uuid="), this.f398724a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$i;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$i */
    public static final /* data */ class i implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398725a;

        public i(@Y61.k String str) {
            this.f398725a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f398725a, ((i) obj).f398725a);
        }

        public final int hashCode() {
            return this.f398725a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("EditBlock(uuid="), this.f398725a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$j;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$j */
    public static final /* data */ class j implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f398726a;

        public j(@Y61.k DeepLink deepLink) {
            this.f398726a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f398726a, ((j) obj).f398726a);
        }

        public final int hashCode() {
            return this.f398726a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("EditItems(deepLink="), this.f398726a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$k;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$k */
    public static final class k implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f398727a = new k();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$l;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$l */
    public static final class l implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f398728a = new l();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$m;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$m */
    public static final class m implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f398729a = new m();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$n;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$n */
    public static final class n implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f398730a = new n();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$o;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$o */
    public static final /* data */ class o implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C40705b f398731a;

        /* renamed from: b, reason: collision with root package name */
        public final int f398732b;

        public o(@Y61.k C40705b c40705b, int i12) {
            this.f398731a = c40705b;
            this.f398732b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.f398731a, oVar.f398731a) && this.f398732b == oVar.f398732b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f398732b) + (this.f398731a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ReturnRemovedBlock(block=");
            sb2.append(this.f398731a);
            sb2.append(", index=");
            return androidx.appcompat.app.r.t(sb2, this.f398732b, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$p;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$p */
    public static final /* data */ class p implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f398733a;

        public p(@Y61.l DeepLink deepLink) {
            this.f398733a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f398733a, ((p) obj).f398733a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f398733a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("SaveDraftActionReceived(deepLink="), this.f398733a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$q;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$q */
    public static final class q implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f398734a = new q();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lim/a$r;", "Lim/a;", "<init>", "()V", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$r */
    public static final class r implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f398735a = new r();
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$s;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$s */
    public static final /* data */ class s implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f398736a;

        public s(boolean z12) {
            this.f398736a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f398736a == ((s) obj).f398736a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f398736a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.x(new StringBuilder("SetChangesMade(changesMade="), this.f398736a, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$t;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$t */
    public static final /* data */ class t implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398737a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f398738b;

        public t(@Y61.k String str, @Y61.l Integer num) {
            this.f398737a = str;
            this.f398738b = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof t)) {
                return false;
            }
            t tVar = (t) obj;
            return L.f(this.f398737a, tVar.f398737a) && L.f(this.f398738b, tVar.f398738b);
        }

        public final int hashCode() {
            int iHashCode = this.f398737a.hashCode() * 31;
            Integer num = this.f398738b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SetDiscount(uuid=");
            sb2.append(this.f398737a);
            sb2.append(", discount=");
            return com.akita.compose.component.accordion.s.j(sb2, this.f398738b, ')');
        }
    }

    /* compiled from: CampaignsSaleAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lim/a$u;", "Lim/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: im.a$u */
    public static final /* data */ class u implements InterfaceC41424a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f398739a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<Long> f398740b;

        public u(@Y61.k String str, @Y61.k List<Long> list) {
            this.f398739a = str;
            this.f398740b = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return L.f(this.f398739a, uVar.f398739a) && L.f(this.f398740b, uVar.f398740b);
        }

        public final int hashCode() {
            return this.f398740b.hashCode() + (this.f398739a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateBlockItems(uuid=");
            sb2.append(this.f398739a);
            sb2.append(", itemIds=");
            return H.p(sb2, this.f398740b, ')');
        }
    }
}
