package ne0;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.items.ItemWithAdditionalButton;
import com.avito.android.publish.scanner_v2.ScannerOpenParams;
import com.avito.android.remote.model.category_parameters.ManualVin;
import com.avito.android.remote.model.category_parameters.VinSuggest;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InputVinMviInternalAction.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lne0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "Lne0/b$a;", "Lne0/b$b;", "Lne0/b$c;", "Lne0/b$d;", "Lne0/b$e;", "Lne0/b$f;", "Lne0/b$g;", "Lne0/b$h;", "Lne0/b$i;", "Lne0/b$j;", "Lne0/b$k;", "Lne0/b$l;", "Lne0/b$m;", "Lne0/b$n;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ne0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC44385b {

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$a;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$a */
    public static final /* data */ class a implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ItemWithAdditionalButton f415230a;

        public a(@Y61.k ItemWithAdditionalButton itemWithAdditionalButton) {
            this.f415230a = itemWithAdditionalButton;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f415230a, ((a) obj).f415230a);
        }

        public final int hashCode() {
            return this.f415230a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "AdditionalInputButtonClickHappened(element=" + this.f415230a + ')';
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$b;", "Lne0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11866b implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C11866b f415231a = new C11866b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C11866b);
        }

        public final int hashCode() {
            return 1917051559;
        }

        @Y61.k
        public final String toString() {
            return "BackButtonClickHappened";
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$c;", "Lne0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$c */
    public static final /* data */ class c implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f415232a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1530968984;
        }

        @Y61.k
        public final String toString() {
            return "CloseButtonClickHappened";
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$d;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$d */
    public static final /* data */ class d implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ru.avito.component.toolbar.d f415233a;

        public d(@Y61.k ru.avito.component.toolbar.d dVar) {
            this.f415233a = dVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f415233a, ((d) obj).f415233a);
        }

        public final int hashCode() {
            return this.f415233a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DraftOnboardingReceived(onboardingData=" + this.f415233a + ')';
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$e;", "Lne0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$e */
    public static final /* data */ class e implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f415234a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1094089105;
        }

        @Y61.k
        public final String toString() {
            return "EnteredVinValid";
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$f;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$f */
    public static final /* data */ class f implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f415235a;

        public f(@Y61.k String str) {
            this.f415235a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f415235a, ((f) obj).f415235a);
        }

        public final int hashCode() {
            return this.f415235a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ErrorHappened(message="), this.f415235a, ')');
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$g;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$g */
    public static final /* data */ class g implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UV0.a<? extends com.avito.conveyor_item.a> f415236a;

        public g(@Y61.k UV0.a<? extends com.avito.conveyor_item.a> aVar) {
            this.f415236a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f415236a, ((g) obj).f415236a);
        }

        public final int hashCode() {
            return this.f415236a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ItemsDataUpdated(itemsDataSource=" + this.f415236a + ')';
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lne0/b$h;", "Lne0/b;", "a", "b", "c", "Lne0/b$h$a;", "Lne0/b$h$b;", "Lne0/b$h$c;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$h */
    public interface h extends InterfaceC44385b {

        /* compiled from: InputVinMviInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$h$a;", "Lne0/b$h;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ne0.b$h$a */
        public static final /* data */ class a implements h {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final a f415237a = new a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 998503744;
            }

            @Y61.k
            public final String toString() {
                return "Failed";
            }
        }

        /* compiled from: InputVinMviInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$h$b;", "Lne0/b$h;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ne0.b$h$b, reason: collision with other inner class name */
        public static final /* data */ class C11867b implements h {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C11867b f415238a = new C11867b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C11867b);
            }

            public final int hashCode() {
                return 1182961928;
            }

            @Y61.k
            public final String toString() {
                return "Loaded";
            }
        }

        /* compiled from: InputVinMviInternalAction.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$h$c;", "Lne0/b$h;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ne0.b$h$c */
        public static final /* data */ class c implements h {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f415239a = new c();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 78249950;
            }

            @Y61.k
            public final String toString() {
                return "Started";
            }
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$i;", "Lne0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$i */
    public static final /* data */ class i implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f415240a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return -1403374504;
        }

        @Y61.k
        public final String toString() {
            return "RetryToSubmissionWasMade";
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lne0/b$j;", "Lne0/b;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$j */
    public static final /* data */ class j implements InterfaceC44385b {
        static {
            new j();
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 292242498;
        }

        @Y61.k
        public final String toString() {
            return "ShouldGoToPreviousStep";
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$k;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$k */
    public static final /* data */ class k implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ManualVin f415241a;

        public k(@Y61.k ManualVin manualVin) {
            this.f415241a = manualVin;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f415241a, ((k) obj).f415241a);
        }

        public final int hashCode() {
            return this.f415241a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowManualClickHappened(manualVin=" + this.f415241a + ')';
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$l;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$l */
    public static final /* data */ class l implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f415242a;

        public l(@Y61.k String str) {
            this.f415242a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f415242a, ((l) obj).f415242a);
        }

        public final int hashCode() {
            return this.f415242a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("VinChanged(vin="), this.f415242a, ')');
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$m;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$m */
    public static final /* data */ class m implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final VinSuggest f415243a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f415244b;

        /* renamed from: c, reason: collision with root package name */
        public final int f415245c;

        public m(@Y61.k VinSuggest vinSuggest, @Y61.k String str, int i12) {
            this.f415243a = vinSuggest;
            this.f415244b = str;
            this.f415245c = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f415243a, mVar.f415243a) && L.f(this.f415244b, mVar.f415244b) && this.f415245c == mVar.f415245c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f415245c) + H.d(this.f415243a.hashCode() * 31, 31, this.f415244b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VinShouldBeRecognizedByRegNumber(vinSuggest=");
            sb2.append(this.f415243a);
            sb2.append(", vinId=");
            sb2.append(this.f415244b);
            sb2.append(", stepIndex=");
            return r.t(sb2, this.f415245c, ')');
        }
    }

    /* compiled from: InputVinMviInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne0/b$n;", "Lne0/b;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ne0.b$n */
    public static final /* data */ class n implements InterfaceC44385b {

        /* renamed from: a, reason: collision with root package name */
        public final int f415246a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ScannerOpenParams f415247b;

        public n(int i12, @Y61.k ScannerOpenParams scannerOpenParams) {
            this.f415246a = i12;
            this.f415247b = scannerOpenParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.f415246a == nVar.f415246a && L.f(this.f415247b, nVar.f415247b);
        }

        public final int hashCode() {
            return this.f415247b.hashCode() + (Integer.hashCode(this.f415246a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "VinShouldBeScanned(stepIndex=" + this.f415246a + ", scannerParams=" + this.f415247b + ')';
        }
    }
}
