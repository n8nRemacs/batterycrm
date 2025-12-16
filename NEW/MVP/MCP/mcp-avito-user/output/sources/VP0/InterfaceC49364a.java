package vp0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.screens.bbip_v2.ui.items.budget.b;
import com.avito.android.screens.bbip_v2.ui.items.duration.b;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BbipV2Action.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lvp0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lvp0/a$a;", "Lvp0/a$b;", "Lvp0/a$c;", "Lvp0/a$d;", "Lvp0/a$e;", "Lvp0/a$f;", "Lvp0/a$g;", "Lvp0/a$h;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: vp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC49364a {

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/a$a;", "Lvp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12792a implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C12792a f440970a = new C12792a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C12792a);
        }

        public final int hashCode() {
            return -666299401;
        }

        @k
        public final String toString() {
            return "BackPressed";
        }
    }

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvp0/a$b;", "Lvp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$b */
    public static final /* data */ class b implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b.a f440971a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f440972b;

        public b(@k b.a aVar, boolean z12) {
            this.f440971a = aVar;
            this.f440972b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f440971a, bVar.f440971a) && this.f440972b == bVar.f440972b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440972b) + (this.f440971a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BudgetClicked(budget=");
            sb2.append(this.f440971a);
            sb2.append(", isBlockedBudget=");
            return r.x(sb2, this.f440972b, ')');
        }
    }

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvp0/a$c;", "Lvp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$c */
    public static final /* data */ class c implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final b.a f440973a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f440974b;

        public c(@k b.a aVar, boolean z12) {
            this.f440973a = aVar;
            this.f440974b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f440973a, cVar.f440973a) && this.f440974b == cVar.f440974b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f440974b) + (this.f440973a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DurationClicked(duration=");
            sb2.append(this.f440973a);
            sb2.append(", isBlockedDuration=");
            return r.x(sb2, this.f440974b, ')');
        }
    }

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/a$d;", "Lvp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$d */
    public static final /* data */ class d implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f440975a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1149840379;
        }

        @k
        public final String toString() {
            return "Help";
        }
    }

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/a$e;", "Lvp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$e */
    public static final /* data */ class e implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f440976a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1149661257;
        }

        @k
        public final String toString() {
            return "Next";
        }
    }

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/a$f;", "Lvp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$f */
    public static final /* data */ class f implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f440977a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1370022368;
        }

        @k
        public final String toString() {
            return "RequestConfigurator";
        }
    }

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/a$g;", "Lvp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$g */
    public static final /* data */ class g implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f440978a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -38454682;
        }

        @k
        public final String toString() {
            return "RequestForecast";
        }
    }

    /* compiled from: BbipV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvp0/a$h;", "Lvp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: vp0.a$h */
    public static final /* data */ class h implements InterfaceC49364a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f440979a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1149507005;
        }

        @k
        public final String toString() {
            return "Skip";
        }
    }
}
