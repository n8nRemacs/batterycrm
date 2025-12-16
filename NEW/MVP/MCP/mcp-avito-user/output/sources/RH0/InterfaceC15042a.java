package Rh0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentProfileCreateLandingFlowsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LRh0/a;", "", "a", "b", "c", "LRh0/a$a;", "LRh0/a$b;", "LRh0/a$c;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rh0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC15042a {

    /* compiled from: ReAgentProfileCreateLandingFlowsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRh0/a$a;", "LRh0/a;", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rh0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0971a implements InterfaceC15042a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14564a;

        public C0971a(@k DeepLink deepLink) {
            this.f14564a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0971a) && L.f(this.f14564a, ((C0971a) obj).f14564a);
        }

        public final int hashCode() {
            return this.f14564a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("FollowDeeplink(deeplink="), this.f14564a, ')');
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRh0/a$b;", "LRh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rh0.a$b */
    public static final /* data */ class b implements InterfaceC15042a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f14565a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 596058701;
        }

        @k
        public final String toString() {
            return "OnClose";
        }
    }

    /* compiled from: ReAgentProfileCreateLandingFlowsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRh0/a$c;", "LRh0/a;", "<init>", "()V", "_avito_re-agent-landing_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rh0.a$c */
    public static final /* data */ class c implements InterfaceC15042a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f14566a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 355655610;
        }

        @k
        public final String toString() {
            return "OpenErrorDialog";
        }
    }
}
