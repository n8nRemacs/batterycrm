package YI0;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_actions.host.items.UserAdvertSingleActionItem;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: UserAdvertsActionsAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LYI0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "LYI0/a$a;", "LYI0/a$b;", "LYI0/a$d;", "LYI0/a$e;", "LYI0/a$g;", "LYI0/a$h;", "LYI0/a$i;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"LYI0/a$a;", "LYI0/a;", "LYI0/a$c;", "LYI0/a$f;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: YI0.a$a, reason: collision with other inner class name */
    public interface InterfaceC1374a extends a {
        @k
        UserAdvertActionType a();
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LYI0/a$b;", "LYI0/a;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f19416a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 663869651;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYI0/a$c;", "LYI0/a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements InterfaceC1374a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.user_adverts.tab_actions.host.items.a f19417a;

        public c(@k com.avito.android.user_adverts.tab_actions.host.items.a aVar) {
            this.f19417a = aVar;
        }

        @Override // YI0.a.InterfaceC1374a
        @k
        public final UserAdvertActionType a() {
            return this.f19417a.f314318f;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f19417a, ((c) obj).f19417a);
        }

        public final int hashCode() {
            return this.f19417a.hashCode();
        }

        @k
        public final String toString() {
            return "MultiActionClicked(actionItem=" + this.f19417a + ')';
        }
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYI0/a$e;", "LYI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19422a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsGroupData f19423b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertActionsInfoDomain f19424c;

        public e(@k String str, @k UserAdvertsGroupData userAdvertsGroupData, @k UserAdvertActionsInfoDomain userAdvertActionsInfoDomain) {
            this.f19422a = str;
            this.f19423b = userAdvertsGroupData;
            this.f19424c = userAdvertActionsInfoDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f19422a, eVar.f19422a) && L.f(this.f19423b, eVar.f19423b) && L.f(this.f19424c, eVar.f19424c);
        }

        public final int hashCode() {
            return this.f19424c.hashCode() + AK.c.c(this.f19422a.hashCode() * 31, 31, this.f19423b.f312182b);
        }

        @k
        public final String toString() {
            return "MultipleSelected(shortcut=" + this.f19422a + ", groupData=" + this.f19423b + ", actionsInfo=" + this.f19424c + ')';
        }
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYI0/a$f;", "LYI0/a$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements InterfaceC1374a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertSingleActionItem f19425a;

        public f(@k UserAdvertSingleActionItem userAdvertSingleActionItem) {
            this.f19425a = userAdvertSingleActionItem;
        }

        @Override // YI0.a.InterfaceC1374a
        @k
        public final UserAdvertActionType a() {
            return this.f19425a.f314308i;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f19425a, ((f) obj).f19425a);
        }

        public final int hashCode() {
            return this.f19425a.hashCode();
        }

        @k
        public final String toString() {
            return "SingleActionClicked(actionItem=" + this.f19425a + ')';
        }
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYI0/a$g;", "LYI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19426a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC14249c f19427b;

        public g(@k String str, @k InterfaceC14249c interfaceC14249c) {
            this.f19426a = str;
            this.f19427b = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f19426a, gVar.f19426a) && L.f(this.f19427b, gVar.f19427b);
        }

        public final int hashCode() {
            return this.f19427b.hashCode() + (this.f19426a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "SingleActionResult(advertId=" + this.f19426a + ", result=" + this.f19427b + ')';
        }
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYI0/a$h;", "LYI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19428a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19429b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f19430c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AvailableActionsDomain f19431d;

        public h(@k String str, @k String str2, @k String str3, @k AvailableActionsDomain availableActionsDomain) {
            this.f19428a = str;
            this.f19429b = str2;
            this.f19430c = str3;
            this.f19431d = availableActionsDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f19428a, hVar.f19428a) && L.f(this.f19429b, hVar.f19429b) && L.f(this.f19430c, hVar.f19430c) && L.f(this.f19431d, hVar.f19431d);
        }

        public final int hashCode() {
            return this.f19431d.f314259b.hashCode() + H.d(H.d(this.f19428a.hashCode() * 31, 31, this.f19429b), 31, this.f19430c);
        }

        @k
        public final String toString() {
            return "SingleSelected(shortcut=" + this.f19428a + ", advertId=" + this.f19429b + ", advertTitle=" + this.f19430c + ", availableActions=" + this.f19431d + ')';
        }
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYI0/a$i;", "LYI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f19432a;

        public i(@k String str) {
            this.f19432a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f19432a, ((i) obj).f19432a);
        }

        public final int hashCode() {
            return this.f19432a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Unselected(shortcut="), this.f19432a, ')');
        }
    }

    /* compiled from: UserAdvertsActionsAction.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYI0/a$d;", "LYI0/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> f19418a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f19419b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertActionType.Multiple f19420c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f19421d;

        public d(@k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map, @k String str, @k UserAdvertActionType.Multiple multiple, @l DeepLink deepLink) {
            this.f19418a = map;
            this.f19419b = str;
            this.f19420c = multiple;
            this.f19421d = deepLink;
        }

        @k
        public final Set<String> b() {
            Collection<UserAdvertsGroupInfo> collectionValues = this.f19418a.values();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = collectionValues.iterator();
            while (it.hasNext()) {
                C42745f0.h(((UserAdvertsGroupInfo) it.next()).f312184b, arrayList);
            }
            return C42745f0.P0(arrayList);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f19418a, dVar.f19418a) && L.f(this.f19419b, dVar.f19419b) && this.f19420c == dVar.f19420c && L.f(this.f19421d, dVar.f19421d);
        }

        public final int hashCode() {
            int iHashCode = (this.f19420c.hashCode() + H.d(this.f19418a.hashCode() * 31, 31, this.f19419b)) * 31;
            DeepLink deepLink = this.f19421d;
            return iHashCode + (deepLink == null ? 0 : deepLink.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultiActionConfirmed(selectedGroupInfo=");
            sb2.append(this.f19418a);
            sb2.append(", currentShortcut=");
            sb2.append(this.f19419b);
            sb2.append(", actionType=");
            sb2.append(this.f19420c);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f19421d, ')');
        }

        public /* synthetic */ d(Map map, String str, UserAdvertActionType.Multiple multiple, DeepLink deepLink, int i12, C42822w c42822w) {
            this(map, str, multiple, (i12 & 8) != 0 ? null : deepLink);
        }
    }
}
