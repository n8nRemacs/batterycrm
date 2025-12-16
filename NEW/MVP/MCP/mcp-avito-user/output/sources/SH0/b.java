package Sh0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.re_agent_landing.landing.items.action_block.ReAgentProfileCreateLandingFlowsData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LSh0/b;", "", "a", "b", "c", "d", "LSh0/b$a;", "LSh0/b$b;", "LSh0/b$c;", "LSh0/b$d;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ReAgentProfileCreateLandingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSh0/b$a;", "LSh0/b;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f15119a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -435364319;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSh0/b$b;", "LSh0/b;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Sh0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1031b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f15120a;

        public C1031b(@k DeepLink deepLink) {
            this.f15120a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1031b) && L.f(this.f15120a, ((C1031b) obj).f15120a);
        }

        public final int hashCode() {
            return this.f15120a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f15120a, ')');
        }
    }

    /* compiled from: ReAgentProfileCreateLandingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSh0/b$c;", "LSh0/b;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ReAgentProfileCreateLandingFlowsData f15121a;

        public c(@k ReAgentProfileCreateLandingFlowsData reAgentProfileCreateLandingFlowsData) {
            this.f15121a = reAgentProfileCreateLandingFlowsData;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f15121a, ((c) obj).f15121a);
        }

        public final int hashCode() {
            return this.f15121a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenFlowsDialog(data=" + this.f15121a + ')';
        }
    }

    /* compiled from: ReAgentProfileCreateLandingOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSh0/b$d;", "LSh0/b;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f15122a;

        public d(int i12) {
            this.f15122a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f15122a == ((d) obj).f15122a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f15122a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToItem(position="), this.f15122a, ')');
        }
    }
}
