package Vc0;

import Wc0.C15743a;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VkLinkingGroupManagementInternalAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LVc0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "LVc0/b$a;", "LVc0/b$b;", "LVc0/b$c;", "LVc0/b$d;", "LVc0/b$e;", "LVc0/b$f;", "LVc0/b$g;", "LVc0/b$h;", "LVc0/b$i;", "LVc0/b$j;", "LVc0/b$k;", "LVc0/b$l;", "LVc0/b$m;", "LVc0/b$n;", "LVc0/b$o;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/b$a;", "LVc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f17287a = new a();
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$b;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Vc0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1193b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f17288a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f17289b;

        public C1193b(@Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f17288a = deepLink;
            this.f17289b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1193b)) {
                return false;
            }
            C1193b c1193b = (C1193b) obj;
            return L.f(this.f17288a, c1193b.f17288a) && L.f(this.f17289b, c1193b.f17289b);
        }

        public final int hashCode() {
            return this.f17289b.hashCode() + (this.f17288a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkAction(deeplink=");
            sb2.append(this.f17288a);
            sb2.append(", requestCode=");
            return C22026a.c(sb2, this.f17289b, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$c;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final long f17290a;

        public c(long j12) {
            this.f17290a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f17290a == ((c) obj).f17290a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f17290a);
        }

        @Y61.k
        public final String toString() {
            return r.u(new StringBuilder("GroupItemSelected(groupId="), this.f17290a, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$d;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17291a;

        public d(@Y61.k String str) {
            this.f17291a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f17291a, ((d) obj).f17291a);
        }

        public final int hashCode() {
            return this.f17291a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LinkingError(message="), this.f17291a, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$e;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17292a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f17293b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f17294c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f17295d;

        public e(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
            this.f17292a = str;
            this.f17293b = str2;
            this.f17294c = str3;
            this.f17295d = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f17292a, eVar.f17292a) && L.f(this.f17293b, eVar.f17293b) && L.f(this.f17294c, eVar.f17294c) && L.f(this.f17295d, eVar.f17295d);
        }

        public final int hashCode() {
            return this.f17295d.hashCode() + H.d(H.d(this.f17292a.hashCode() * 31, 31, this.f17293b), 31, this.f17294c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LinkingErrorWithRepeat(message=");
            sb2.append(this.f17292a);
            sb2.append(", repeatButtonText=");
            sb2.append(this.f17293b);
            sb2.append(", code=");
            sb2.append(this.f17294c);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f17295d, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/b$f;", "LVc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f17296a = new f();
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/b$g;", "LVc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f17297a = new g();
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$h;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17298a;

        public h(@Y61.k String str) {
            this.f17298a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f17298a, ((h) obj).f17298a);
        }

        public final int hashCode() {
            return this.f17298a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("LoadingError(message="), this.f17298a, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$i;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final VkPopup f17299a;

        public i(@Y61.k VkPopup vkPopup) {
            this.f17299a = vkPopup;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f17299a, ((i) obj).f17299a);
        }

        public final int hashCode() {
            return this.f17299a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "NextPopupAction(dialog=" + this.f17299a + ')';
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$j;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17300a;

        public j(@Y61.k String str) {
            this.f17300a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f17300a, ((j) obj).f17300a);
        }

        public final int hashCode() {
            return this.f17300a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SendVkTokensError(message="), this.f17300a, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$k;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f17301a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f17302b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f17303c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f17304d;

        public k(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k String str4) {
            this.f17301a = str;
            this.f17302b = str2;
            this.f17303c = str3;
            this.f17304d = str4;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f17301a, kVar.f17301a) && L.f(this.f17302b, kVar.f17302b) && L.f(this.f17303c, kVar.f17303c) && L.f(this.f17304d, kVar.f17304d);
        }

        public final int hashCode() {
            return this.f17304d.hashCode() + H.d(H.d(this.f17301a.hashCode() * 31, 31, this.f17302b), 31, this.f17303c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SendVkTokensErrorWithRepeat(message=");
            sb2.append(this.f17301a);
            sb2.append(", repeatButtonText=");
            sb2.append(this.f17302b);
            sb2.append(", code=");
            sb2.append(this.f17303c);
            sb2.append(", state=");
            return C22026a.c(sb2, this.f17304d, ')');
        }
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/b$l;", "LVc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f17305a = new l();
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/b$m;", "LVc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f17306a = new m();
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVc0/b$n;", "LVc0/b;", "<init>", "()V", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f17307a = new n();
    }

    /* compiled from: VkLinkingGroupManagementInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVc0/b$o;", "LVc0/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C15743a.b f17308a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final VkPopup f17309b;

        public o(@Y61.k C15743a.b bVar, @Y61.l VkPopup vkPopup) {
            this.f17308a = bVar;
            this.f17309b = vkPopup;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.f17308a, oVar.f17308a) && L.f(this.f17309b, oVar.f17309b);
        }

        public final int hashCode() {
            int iHashCode = this.f17308a.hashCode() * 31;
            VkPopup vkPopup = this.f17309b;
            return iHashCode + (vkPopup == null ? 0 : vkPopup.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "UpdateData(data=" + this.f17308a + ", dialog=" + this.f17309b + ')';
        }

        public /* synthetic */ o(C15743a.b bVar, VkPopup vkPopup, int i12, C42822w c42822w) {
            this(bVar, (i12 & 2) != 0 ? null : vkPopup);
        }
    }
}
