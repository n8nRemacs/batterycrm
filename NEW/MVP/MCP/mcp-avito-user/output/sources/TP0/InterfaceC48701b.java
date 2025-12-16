package tp0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipPrivateV2OneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Ltp0/b;", "", "a", "b", "c", "d", "e", "Ltp0/b$a;", "Ltp0/b$b;", "Ltp0/b$c;", "Ltp0/b$d;", "Ltp0/b$e;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tp0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC48701b {

    /* compiled from: BbipPrivateV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltp0/b$a;", "Ltp0/b;", "<init>", "()V", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.b$a */
    public static final /* data */ class a implements InterfaceC48701b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f439457a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -63188676;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: BbipPrivateV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/b$b;", "Ltp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12682b implements InterfaceC48701b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Integer f439458a;

        public C12682b(@l Integer num) {
            this.f439458a = num;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12682b) && L.f(this.f439458a, ((C12682b) obj).f439458a);
        }

        public final int hashCode() {
            Integer num = this.f439458a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @k
        public final String toString() {
            return s.j(new StringBuilder("ForecastRequired(duration="), this.f439458a, ')');
        }
    }

    /* compiled from: BbipPrivateV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/b$c;", "Ltp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.b$c */
    public static final /* data */ class c implements InterfaceC48701b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f439459a;

        public c(@k DeepLink deepLink) {
            this.f439459a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f439459a, ((c) obj).f439459a);
        }

        public final int hashCode() {
            return this.f439459a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f439459a, ')');
        }
    }

    /* compiled from: BbipPrivateV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/b$e;", "Ltp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.b$e */
    public static final /* data */ class e implements InterfaceC48701b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f439463a;

        public e(@k String str) {
            this.f439463a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f439463a, ((e) obj).f439463a);
        }

        public final int hashCode() {
            return this.f439463a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowMnzUxFeedback(campaignName="), this.f439463a, ')');
        }
    }

    /* compiled from: BbipPrivateV2OneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltp0/b$d;", "Ltp0/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tp0.b$d */
    public static final /* data */ class d implements InterfaceC48701b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f439460a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final InterfaceC48700a f439461b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f439462c;

        public d(@k Throwable th2, @l InterfaceC48700a interfaceC48700a, boolean z12) {
            this.f439460a = th2;
            this.f439461b = interfaceC48700a;
            this.f439462c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f439460a, dVar.f439460a) && L.f(this.f439461b, dVar.f439461b) && this.f439462c == dVar.f439462c;
        }

        public final int hashCode() {
            int iHashCode = this.f439460a.hashCode() * 31;
            InterfaceC48700a interfaceC48700a = this.f439461b;
            return Boolean.hashCode(this.f439462c) + ((iHashCode + (interfaceC48700a == null ? 0 : interfaceC48700a.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowError(error=");
            sb2.append(this.f439460a);
            sb2.append(", retryAction=");
            sb2.append(this.f439461b);
            sb2.append(", showOnDatePicker=");
            return r.x(sb2, this.f439462c, ')');
        }

        public /* synthetic */ d(Throwable th2, InterfaceC48700a interfaceC48700a, boolean z12, int i12, C42822w c42822w) {
            this(th2, (i12 & 2) != 0 ? null : interfaceC48700a, (i12 & 4) != 0 ? false : z12);
        }
    }
}
