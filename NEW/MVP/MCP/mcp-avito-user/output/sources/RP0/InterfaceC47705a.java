package rp0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.screens.bbip_private.ui.items.budget.BbipPrivateBudgetItem;
import com.avito.android.screens.bbip_private.ui.items.budget_widget.BbipPrivateBudgetWidgetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lrp0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lrp0/a$a;", "Lrp0/a$b;", "Lrp0/a$c;", "Lrp0/a$d;", "Lrp0/a$e;", "Lrp0/a$f;", "Lrp0/a$g;", "Lrp0/a$h;", "Lrp0/a$i;", "Lrp0/a$j;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47705a {

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/a$a;", "Lrp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$a, reason: collision with other inner class name */
    public static final class C12395a implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12395a f430228a = new C12395a();
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/a$b;", "Lrp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$b */
    public static final /* data */ class b implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BbipPrivateBudgetItem.Budget f430229a;

        public b(@k BbipPrivateBudgetItem.Budget budget) {
            this.f430229a = budget;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f430229a, ((b) obj).f430229a);
        }

        public final int hashCode() {
            return this.f430229a.hashCode();
        }

        @k
        public final String toString() {
            return "BudgetClicked(budget=" + this.f430229a + ')';
        }
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/a$c;", "Lrp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$c */
    public static final /* data */ class c implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BbipPrivateBudgetWidgetItem.Budget f430230a;

        public c(@k BbipPrivateBudgetWidgetItem.Budget budget) {
            this.f430230a = budget;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f430230a, ((c) obj).f430230a);
        }

        public final int hashCode() {
            return this.f430230a.hashCode();
        }

        @k
        public final String toString() {
            return "BudgetWidgetClicked(budget=" + this.f430230a + ')';
        }
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/a$d;", "Lrp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$d */
    public static final /* data */ class d implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f430231a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f430232b;

        public d(@k DeepLink deepLink, boolean z12) {
            this.f430231a = deepLink;
            this.f430232b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f430231a, dVar.f430231a) && this.f430232b == dVar.f430232b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f430232b) + (this.f430231a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkClicked(deeplink=");
            sb2.append(this.f430231a);
            sb2.append(", showMnzUxFeedback=");
            return r.x(sb2, this.f430232b, ')');
        }

        public /* synthetic */ d(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/a$e;", "Lrp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$e */
    public static final /* data */ class e implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        public final int f430233a;

        public e(int i12) {
            this.f430233a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f430233a == ((e) obj).f430233a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f430233a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("DurationClicked(duration="), this.f430233a, ')');
        }
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/a$f;", "Lrp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$f */
    public static final class f implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f430234a = new f();
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp0/a$g;", "Lrp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$g */
    public static final /* data */ class g implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f430235a;

        /* JADX WARN: Multi-variable type inference failed */
        public g() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f430235a, ((g) obj).f430235a);
        }

        public final int hashCode() {
            Integer num = this.f430235a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("Next(buttonId="), this.f430235a, ')');
        }

        public g(@l Integer num) {
            this.f430235a = num;
        }

        public /* synthetic */ g(Integer num, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : num);
        }
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/a$h;", "Lrp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$h */
    public static final class h implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f430236a = new h();
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/a$i;", "Lrp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$i */
    public static final class i implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f430237a = new i();
    }

    /* compiled from: BbipPrivateAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrp0/a$j;", "Lrp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: rp0.a$j */
    public static final class j implements InterfaceC47705a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f430238a = new j();
    }
}
