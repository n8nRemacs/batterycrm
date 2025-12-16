package Po0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.UserAdvertsLink;
import com.avito.android.sbc.autodispatches.SbcDispatchEditResult;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchesInternalAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LPo0/c;", "", "a", "b", "c", "d", "e", "f", "g", "LPo0/c$a;", "LPo0/c$b;", "LPo0/c$c;", "LPo0/c$d;", "LPo0/c$e;", "LPo0/c$f;", "LPo0/c$g;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Po0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14819c {

    /* compiled from: SbcAutoDispatchesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPo0/c$a;", "LPo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.c$a */
    public static final /* data */ class a implements InterfaceC14819c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13286a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -906112811;
        }

        @k
        public final String toString() {
            return "AutoDispatchLoadingFailed";
        }
    }

    /* compiled from: SbcAutoDispatchesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPo0/c$b;", "LPo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.c$b */
    public static final /* data */ class b implements InterfaceC14819c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13287a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1164678889;
        }

        @k
        public final String toString() {
            return "AutoDispatchLoadingStarted";
        }
    }

    /* compiled from: SbcAutoDispatchesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPo0/c$c;", "LPo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0866c implements InterfaceC14819c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<AutoDispatchOut> f13288a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AutoDispatchOut> f13289b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f13290c;

        public C0866c(@k List<AutoDispatchOut> list, @k List<AutoDispatchOut> list2, boolean z12) {
            this.f13288a = list;
            this.f13289b = list2;
            this.f13290c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0866c)) {
                return false;
            }
            C0866c c0866c = (C0866c) obj;
            return L.f(this.f13288a, c0866c.f13288a) && L.f(this.f13289b, c0866c.f13289b) && this.f13290c == c0866c.f13290c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13290c) + H.e(this.f13288a.hashCode() * 31, 31, this.f13289b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutoDispatchesLoaded(active=");
            sb2.append(this.f13288a);
            sb2.append(", inactive=");
            sb2.append(this.f13289b);
            sb2.append(", forcedByDispatchFinish=");
            return r.x(sb2, this.f13290c, ')');
        }
    }

    /* compiled from: SbcAutoDispatchesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPo0/c$d;", "LPo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.c$d */
    public static final /* data */ class d implements InterfaceC14819c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f13291a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 3302982;
        }

        @k
        public final String toString() {
            return "AutoDispatchesRefreshFailed";
        }
    }

    /* compiled from: SbcAutoDispatchesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPo0/c$e;", "LPo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.c$e */
    public static final /* data */ class e implements InterfaceC14819c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f13292a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -708202600;
        }

        @k
        public final String toString() {
            return "AutoDispatchesRefreshStarted";
        }
    }

    /* compiled from: SbcAutoDispatchesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPo0/c$f;", "LPo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.c$f */
    public static final /* data */ class f implements InterfaceC14819c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertsLink f13293a;

        public f(@k UserAdvertsLink userAdvertsLink) {
            this.f13293a = userAdvertsLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f13293a.equals(((f) obj).f13293a);
        }

        public final int hashCode() {
            return this.f13293a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenDeeplinkInternalAction(deeplink=" + this.f13293a + ')';
        }
    }

    /* compiled from: SbcAutoDispatchesInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPo0/c$g;", "LPo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Po0.c$g */
    public static final /* data */ class g implements InterfaceC14819c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final SbcDispatchEditResult f13294a;

        public g(@k SbcDispatchEditResult sbcDispatchEditResult) {
            this.f13294a = sbcDispatchEditResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f13294a == ((g) obj).f13294a;
        }

        public final int hashCode() {
            return this.f13294a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowDispatchFinishedToast(result=" + this.f13294a + ')';
        }
    }
}
