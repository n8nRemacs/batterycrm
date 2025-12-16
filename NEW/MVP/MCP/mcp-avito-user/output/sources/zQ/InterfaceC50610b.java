package zq;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ComfortableDealInviteOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lzq/b;", "", "a", "b", "c", "d", "Lzq/b$a;", "Lzq/b$b;", "Lzq/b$c;", "Lzq/b$d;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zq.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC50610b {

    /* compiled from: ComfortableDealInviteOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzq/b$a;", "Lzq/b;", "<init>", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zq.b$a */
    public static final /* data */ class a implements InterfaceC50610b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f444273a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -518762677;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ComfortableDealInviteOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzq/b$b;", "Lzq/b;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zq.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12978b implements InterfaceC50610b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f444274a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f444275b;

        public C12978b(@k DeepLink deepLink, @l String str) {
            this.f444274a = deepLink;
            this.f444275b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12978b)) {
                return false;
            }
            C12978b c12978b = (C12978b) obj;
            return L.f(this.f444274a, c12978b.f444274a) && L.f(this.f444275b, c12978b.f444275b);
        }

        public final int hashCode() {
            int iHashCode = this.f444274a.hashCode() * 31;
            String str = this.f444275b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeeplink(deeplink=");
            sb2.append(this.f444274a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f444275b, ')');
        }

        public /* synthetic */ C12978b(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: ComfortableDealInviteOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzq/b$c;", "Lzq/b;", "<init>", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zq.b$c */
    public static final /* data */ class c implements InterfaceC50610b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f444276a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -349835965;
        }

        @k
        public final String toString() {
            return "ShowCheckingToast";
        }
    }

    /* compiled from: ComfortableDealInviteOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzq/b$d;", "Lzq/b;", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: zq.b$d */
    public static final /* data */ class d implements InterfaceC50610b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Exception f444277a;

        public d(@k Exception exc) {
            this.f444277a = exc;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f444277a.equals(((d) obj).f444277a);
        }

        public final int hashCode() {
            return this.f444277a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowError(error=" + this.f444277a + ')';
        }
    }
}
