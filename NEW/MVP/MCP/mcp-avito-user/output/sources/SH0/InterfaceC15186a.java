package Sh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LSh0/a;", "", "a", "b", "c", "d", "e", "f", "LSh0/a$a;", "LSh0/a$b;", "LSh0/a$c;", "LSh0/a$d;", "LSh0/a$e;", "LSh0/a$f;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC15186a {

    /* compiled from: ReAgentProfileCreateLandingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSh0/a$a;", "LSh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sh0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1030a implements InterfaceC15186a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1030a f15112a = new C1030a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1030a);
        }

        public final int hashCode() {
            return -790887152;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSh0/a$b;", "LSh0/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sh0.a$b */
    public static final /* data */ class b implements InterfaceC15186a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15113a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f15114b;

        public b(@k DeepLink deepLink, boolean z12) {
            this.f15113a = deepLink;
            this.f15114b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f15113a, bVar.f15113a) && this.f15114b == bVar.f15114b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f15114b) + (this.f15113a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FollowDeeplink(deeplink=");
            sb2.append(this.f15113a);
            sb2.append(", refreshOnResume=");
            return r.x(sb2, this.f15114b, ')');
        }

        public /* synthetic */ b(DeepLink deepLink, boolean z12, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: ReAgentProfileCreateLandingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSh0/a$c;", "LSh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sh0.a$c */
    public static final /* data */ class c implements InterfaceC15186a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f15115a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1373384475;
        }

        @k
        public final String toString() {
            return "OpenFlowsDialog";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSh0/a$d;", "LSh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sh0.a$d */
    public static final /* data */ class d implements InterfaceC15186a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f15116a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 385569779;
        }

        @k
        public final String toString() {
            return "Refresh";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSh0/a$e;", "LSh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sh0.a$e */
    public static final /* data */ class e implements InterfaceC15186a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f15117a = new e();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -777238080;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSh0/a$f;", "LSh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sh0.a$f */
    public static final /* data */ class f implements InterfaceC15186a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f15118a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2124658760;
        }

        @k
        public final String toString() {
            return "ScrollToActionIfNeeded";
        }
    }
}
