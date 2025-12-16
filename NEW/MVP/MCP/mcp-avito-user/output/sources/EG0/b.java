package Eg0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.review_action_network_request.ReviewActionNetworkRequestResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextSheetInternalAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LEg0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "LEg0/b$a;", "LEg0/b$b;", "LEg0/b$c;", "LEg0/b$d;", "LEg0/b$e;", "LEg0/b$f;", "LEg0/b$g;", "LEg0/b$h;", "LEg0/b$i;", "LEg0/b$j;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/b$a;", "LEg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReviewActionNetworkRequestResult.Info f4141a;

        public a(@k ReviewActionNetworkRequestResult.Info info) {
            this.f4141a = info;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f4141a, ((a) obj).f4141a);
        }

        public final int hashCode() {
            return this.f4141a.hashCode();
        }

        @k
        public final String toString() {
            return "CloseWithInfoResult(result=" + this.f4141a + ')';
        }
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/b$b;", "LEg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Eg0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0244b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f4142a;

        public C0244b(@k DeepLink deepLink) {
            this.f4142a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0244b) && L.f(this.f4142a, ((C0244b) obj).f4142a);
        }

        public final int hashCode() {
            return this.f4142a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deeplink="), this.f4142a, ')');
        }
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/b$c;", "LEg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f4143a = new c();
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/b$d;", "LEg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f4144a = new d();
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/b$e;", "LEg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f4145a = new e();
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/b$f;", "LEg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f4146a = new f();
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/b$g;", "LEg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4147a;

        public g(@k String str) {
            this.f4147a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f4147a, ((g) obj).f4147a);
        }

        public final int hashCode() {
            return this.f4147a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowError(errorMessage="), this.f4147a, ')');
        }
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEg0/b$i;", "LEg0/b;", "<init>", "()V", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f4151a = new i();
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/b$j;", "LEg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4152a;

        public j(@k String str) {
            this.f4152a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f4152a, ((j) obj).f4152a);
        }

        public final int hashCode() {
            return this.f4152a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("TextChanged(text="), this.f4152a, ')');
        }
    }

    /* compiled from: TextSheetInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LEg0/b$h;", "LEg0/b;", "_avito_rating_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f4148a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f4149b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final InterfaceC13484a f4150c;

        public h(@k String str, @l String str2, @l InterfaceC13484a interfaceC13484a) {
            this.f4148a = str;
            this.f4149b = str2;
            this.f4150c = interfaceC13484a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f4148a, hVar.f4148a) && L.f(this.f4149b, hVar.f4149b) && L.f(this.f4150c, hVar.f4150c);
        }

        public final int hashCode() {
            int iHashCode = this.f4148a.hashCode() * 31;
            String str = this.f4149b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            InterfaceC13484a interfaceC13484a = this.f4150c;
            return iHashCode2 + (interfaceC13484a != null ? interfaceC13484a.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "ShowErrorToastBar(message=" + this.f4148a + ", actionText=" + this.f4149b + ", action=" + this.f4150c + ')';
        }

        public /* synthetic */ h(String str, String str2, InterfaceC13484a interfaceC13484a, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? null : str2, interfaceC13484a);
        }
    }
}
