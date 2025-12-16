package FY;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import cZ.AbstractC27130a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.channels.filter.i;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChannelsHeaderInternalAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LFY/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "LFY/b$a;", "LFY/b$b;", "LFY/b$c;", "LFY/b$d;", "LFY/b$e;", "LFY/b$f;", "LFY/b$g;", "LFY/b$h;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFY/b$a;", "LFY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f4756a;

        public a(@l DeepLink deepLink) {
            this.f4756a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f4756a, ((a) obj).f4756a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f4756a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("AssistantSettingsDeeplinkChanged(newAssistantSettingsDeeplink="), this.f4756a, ')');
        }
    }

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFY/b$b;", "LFY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: FY.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0292b implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4757a;

        public C0292b(boolean z12) {
            this.f4757a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0292b) && this.f4757a == ((C0292b) obj).f4757a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4757a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("AutoRepliesOnboardingStateChanged(shouldBeShown="), this.f4757a, ')');
        }
    }

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFY/b$c;", "LFY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f4758a;

        public c(@l String str) {
            this.f4758a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f4758a, ((c) obj).f4758a);
        }

        public final int hashCode() {
            String str = this.f4758a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("AutoRepliesUrlChanged(autoRepliesUrl="), this.f4758a, ')');
        }
    }

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFY/b$d;", "LFY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final i f4759a;

        public d(@k i iVar) {
            this.f4759a = iVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f4759a, ((d) obj).f4759a);
        }

        public final int hashCode() {
            return this.f4759a.hashCode();
        }

        @k
        public final String toString() {
            return "ChannelsFilterStateChanged(channelsFilterState=" + this.f4759a + ')';
        }
    }

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFY/b$e;", "LFY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4760a;

        public e(boolean z12) {
            this.f4760a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f4760a == ((e) obj).f4760a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f4760a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ConnectionStateChanged(newIsConnecting="), this.f4760a, ')');
        }
    }

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFY/b$f;", "LFY/b;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final AbstractC27130a f4761a;

        public f(@k AbstractC27130a abstractC27130a) {
            this.f4761a = abstractC27130a;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f4761a, ((f) obj).f4761a);
        }

        public final int hashCode() {
            return this.f4761a.hashCode();
        }

        @k
        public final String toString() {
            return "CrmEntryPointStatusChanged(newCrmEntryPointStatus=" + this.f4761a + ')';
        }
    }

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFY/b$g;", "LFY/b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final g f4762a = new g();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 2015498625;
        }

        @k
        public final String toString() {
            return "ShowLoginScreen";
        }
    }

    /* compiled from: ChannelsHeaderInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LFY/b$h;", "LFY/b;", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f4763a = new h();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1291691094;
        }

        @k
        public final String toString() {
            return "UserBlocked";
        }
    }
}
