package tp0;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateV2Action.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Ltp0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "Ltp0/a$a;", "Ltp0/a$b;", "Ltp0/a$c;", "Ltp0/a$d;", "Ltp0/a$e;", "Ltp0/a$f;", "Ltp0/a$g;", "Ltp0/a$h;", "Ltp0/a$i;", "Ltp0/a$j;", "Ltp0/a$k;", "Ltp0/a$l;", "Ltp0/a$m;", "Ltp0/a$n;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tp0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48700a {

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/a$a;", "Ltp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12681a implements InterfaceC48700a {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12681a)) {
                return false;
            }
            ((C12681a) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "BudgetClicked(budget=null)";
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/a$b;", "Ltp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$b */
    public static final /* data */ class b implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        public final float f439443a;

        public b(float f12) {
            this.f439443a = f12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f439443a, ((b) obj).f439443a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f439443a);
        }

        @Y61.k
        public final String toString() {
            return r.k(')', this.f439443a, new StringBuilder("BudgetSliderChanged(value="));
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/a$c;", "Ltp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$c */
    public static final /* data */ class c implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f439444a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1432035469;
        }

        @Y61.k
        public final String toString() {
            return "CloseDurationPicker";
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/a$d;", "Ltp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$d */
    public static final /* data */ class d implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        public final int f439445a;

        public d(int i12) {
            this.f439445a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f439445a == ((d) obj).f439445a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439445a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("CustomDurationPicked(duration="), this.f439445a, ')');
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/a$e;", "Ltp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$e */
    public static final /* data */ class e implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439446a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f439447b;

        public e(@Y61.k DeepLink deepLink, boolean z12) {
            this.f439446a = deepLink;
            this.f439447b = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f439446a, eVar.f439446a) && this.f439447b == eVar.f439447b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f439447b) + (this.f439446a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkClicked(deeplink=");
            sb2.append(this.f439446a);
            sb2.append(", showMnzUxFeedback=");
            return r.x(sb2, this.f439447b, ')');
        }

        public /* synthetic */ e(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/a$f;", "Ltp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$f */
    public static final /* data */ class f implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        public final int f439448a;

        public f(int i12) {
            this.f439448a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f439448a == ((f) obj).f439448a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439448a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("DurationSelected(duration="), this.f439448a, ')');
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/a$g;", "Ltp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$g */
    public static final /* data */ class g implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f439449a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 505587232;
        }

        @Y61.k
        public final String toString() {
            return "Next";
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/a$h;", "Ltp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$h */
    public static final /* data */ class h implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f439450a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 41033842;
        }

        @Y61.k
        public final String toString() {
            return "OnNavBarIconClicked";
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/a$i;", "Ltp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$i */
    public static final /* data */ class i implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        public final int f439451a;

        public i(int i12) {
            this.f439451a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f439451a == ((i) obj).f439451a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439451a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("OnPresetClicked(index="), this.f439451a, ')');
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/a$j;", "Ltp0/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$j */
    public static final /* data */ class j implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        public final int f439452a;

        public j(int i12) {
            this.f439452a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f439452a == ((j) obj).f439452a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f439452a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("OnSegmentClicked(index="), this.f439452a, ')');
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/a$k;", "Ltp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$k */
    public static final /* data */ class k implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f439453a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 1305310361;
        }

        @Y61.k
        public final String toString() {
            return "OpenDurationPicker";
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/a$l;", "Ltp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$l */
    public static final /* data */ class l implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f439454a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -1837938537;
        }

        @Y61.k
        public final String toString() {
            return "RequestConfigurator";
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/a$m;", "Ltp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$m */
    public static final /* data */ class m implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f439455a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -209766307;
        }

        @Y61.k
        public final String toString() {
            return "RequestForecast";
        }
    }

    /* compiled from: BbipPrivateV2Action.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/a$n;", "Ltp0/a;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.a$n */
    public static final /* data */ class n implements InterfaceC48700a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f439456a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 505741484;
        }

        @Y61.k
        public final String toString() {
            return "Skip";
        }
    }
}
