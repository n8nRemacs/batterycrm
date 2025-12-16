package Vc0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkingGroupManagementAction.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LVc0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LVc0/a$a;", "LVc0/a$b;", "LVc0/a$c;", "LVc0/a$d;", "LVc0/a$e;", "LVc0/a$f;", "LVc0/a$g;", "LVc0/a$h;", "LVc0/a$i;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vc0.a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC15664a {

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/a$a;", "LVc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$a, reason: collision with other inner class name */
    public static final class C1192a implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1192a f17276a = new C1192a();
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/a$b;", "LVc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$b */
    public static final /* data */ class b implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f17277a;

        public b(@k DeepLink deepLink) {
            this.f17277a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return L.f(this.f17277a, ((b) obj).f17277a);
            }
            return false;
        }

        public final int hashCode() {
            return (this.f17277a.hashCode() * 31) - 1690359988;
        }

        @k
        public final String toString() {
            return "DeeplinkAction(deeplink=" + this.f17277a + ", requestCode=vk_group_management_req_key)";
        }
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/a$c;", "LVc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$c */
    public static final /* data */ class c implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        public final long f17278a;

        public c(long j12) {
            this.f17278a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f17278a == ((c) obj).f17278a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f17278a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("GroupItemClick(groupId="), this.f17278a, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/a$d;", "LVc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$d */
    public static final /* data */ class d implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17279a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f17280b;

        public d(@k String str, @k String str2) {
            this.f17279a = str;
            this.f17280b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f17279a, dVar.f17279a) && L.f(this.f17280b, dVar.f17280b);
        }

        public final int hashCode() {
            return this.f17280b.hashCode() + (this.f17279a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LinkingAction(code=");
            sb2.append(this.f17279a);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f17280b, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/a$e;", "LVc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$e */
    public static final class e implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f17281a = new e();
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/a$f;", "LVc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$f */
    public static final class f implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f17282a = new f();
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/a$g;", "LVc0/a;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$g */
    public static final /* data */ class g implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17283a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f17284b;

        public g(@k String str, @k String str2) {
            this.f17283a = str;
            this.f17284b = str2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f17283a, gVar.f17283a) && L.f(this.f17284b, gVar.f17284b);
        }

        public final int hashCode() {
            return this.f17284b.hashCode() + (this.f17283a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendVkTokens(code=");
            sb2.append(this.f17283a);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f17284b, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/a$h;", "LVc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$h */
    public static final class h implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final h f17285a = new h();
    }

    /* compiled from: VkLinkingGroupManagementAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/a$i;", "LVc0/a;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.a$i */
    public static final class i implements InterfaceC15664a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f17286a = new i();
    }
}
