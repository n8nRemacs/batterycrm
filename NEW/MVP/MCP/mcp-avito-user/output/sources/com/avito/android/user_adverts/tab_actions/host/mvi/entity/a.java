package com.avito.android.user_adverts.tab_actions.host.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.model.UserAdvertActionAttentionInfo;
import com.avito.android.user_adverts.model.UserAdvertActionPendingResult;
import com.avito.android.user_adverts.model.UserAdvertActionType;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_actions.host.mvi.entity.UserAdvertsActionsState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsActionsEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$b;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$c;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$d;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$e;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$f;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$g;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$h;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$i;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.tab_actions.host.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C9711a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f314484a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314485b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Object f314486c;

        public C9711a(@k PrintableText printableText, @k String str, @k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map) {
            this.f314484a = printableText;
            this.f314485b = str;
            this.f314486c = map;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C9711a)) {
                return false;
            }
            C9711a c9711a = (C9711a) obj;
            return this.f314484a.equals(c9711a.f314484a) && L.f(this.f314485b, c9711a.f314485b) && this.f314486c.equals(c9711a.f314486c);
        }

        public final int hashCode() {
            return this.f314486c.hashCode() + H.d(this.f314484a.hashCode() * 31, 31, this.f314485b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionFailure(failureMsg=");
            sb2.append(this.f314484a);
            sb2.append(", shortcut=");
            sb2.append(this.f314485b);
            sb2.append(", failedAdvertsGroupInfo=");
            return H.n(sb2, this.f314486c, ')');
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$b;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final UserAdvertActionPendingResult.Info f314487a;

        public b(@k UserAdvertActionPendingResult.Info info) {
            this.f314487a = info;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f314487a, ((b) obj).f314487a);
        }

        public final int hashCode() {
            return this.f314487a.hashCode();
        }

        @k
        public final String toString() {
            return "ActionInfo(info=" + this.f314487a + ')';
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$c;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f314488a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final UserAdvertsActionsState.a f314489b;

        public c(@k String str, @k UserAdvertsActionsState.a aVar) {
            this.f314488a = str;
            this.f314489b = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f314488a, cVar.f314488a) && L.f(this.f314489b, cVar.f314489b);
        }

        public final int hashCode() {
            return this.f314489b.hashCode() + (this.f314488a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Closed(shortcut=" + this.f314488a + ", actionsInfo=" + this.f314489b + ')';
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$d;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> f314490a;

        /* renamed from: b, reason: collision with root package name */
        public final int f314491b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final UserAdvertActionAttentionInfo f314492c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f314493d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final UserAdvertActionType.Multiple f314494e;

        public d(int i12, @k UserAdvertActionAttentionInfo userAdvertActionAttentionInfo, @k UserAdvertActionType.Multiple multiple, @k String str, @k Map map) {
            this.f314490a = map;
            this.f314491b = i12;
            this.f314492c = userAdvertActionAttentionInfo;
            this.f314493d = str;
            this.f314494e = multiple;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f314490a, dVar.f314490a) && this.f314491b == dVar.f314491b && L.f(this.f314492c, dVar.f314492c) && L.f(this.f314493d, dVar.f314493d) && this.f314494e == dVar.f314494e;
        }

        public final int hashCode() {
            return this.f314494e.hashCode() + H.d((this.f314492c.hashCode() + r.e(this.f314491b, this.f314490a.hashCode() * 31, 31)) * 31, 31, this.f314493d);
        }

        @k
        public final String toString() {
            return "Confirmation(selectedGroupInfo=" + this.f314490a + ", selectedSize=" + this.f314491b + ", attentionInfo=" + this.f314492c + ", shortcut=" + this.f314493d + ", actionType=" + this.f314494e + ')';
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$e;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f314495a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final ApiError f314496b;

        public e(@k PrintableText printableText, @l ApiError apiError) {
            this.f314495a = printableText;
            this.f314496b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f314495a.equals(eVar.f314495a) && L.f(this.f314496b, eVar.f314496b) && L.f(null, null);
        }

        public final int hashCode() {
            int iHashCode = this.f314495a.hashCode() * 31;
            ApiError apiError = this.f314496b;
            return (iHashCode + (apiError == null ? 0 : apiError.hashCode())) * 31;
        }

        @k
        public final String toString() {
            return "Error(errorMsg=" + this.f314495a + ", apiError=" + this.f314496b + ", throwable=null)";
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$f;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f314497a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f314498b;

        public f(@k String str, @k PrintableText printableText) {
            this.f314497a = str;
            this.f314498b = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f314497a, fVar.f314497a) && L.f(this.f314498b, fVar.f314498b);
        }

        public final int hashCode() {
            return this.f314498b.hashCode() + (this.f314497a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MultipleActionSuccess(shortcut=");
            sb2.append(this.f314497a);
            sb2.append(", successMsg=");
            return AK.c.m(sb2, this.f314498b, ')');
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$g;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f314499a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f314500b;

        public g(@k DeepLink deepLink, @l String str) {
            this.f314499a = deepLink;
            this.f314500b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f314499a, gVar.f314499a) && L.f(this.f314500b, gVar.f314500b);
        }

        public final int hashCode() {
            int iHashCode = this.f314499a.hashCode() * 31;
            String str = this.f314500b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenDeepLink(deepLink=");
            sb2.append(this.f314499a);
            sb2.append(", requestKey=");
            return C22026a.c(sb2, this.f314500b, ')');
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$h;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f314501a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314502b;

        public h(@k DeepLink deepLink, @k String str) {
            this.f314501a = deepLink;
            this.f314502b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f314501a, hVar.f314501a) && L.f(this.f314502b, hVar.f314502b);
        }

        public final int hashCode() {
            return this.f314502b.hashCode() + (this.f314501a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SingleActionDeepLink(deepLink=");
            sb2.append(this.f314501a);
            sb2.append(", advertId=");
            return C22026a.c(sb2, this.f314502b, ')');
        }
    }

    /* compiled from: UserAdvertsActionsEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a$i;", "Lcom/avito/android/user_adverts/tab_actions/host/mvi/entity/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f314503a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f314504b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final PrintableText f314505c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final DeepLink f314506d;

        public i(@k String str, @k String str2, @l PrintableText printableText, @l DeepLink deepLink) {
            this.f314503a = str;
            this.f314504b = str2;
            this.f314505c = printableText;
            this.f314506d = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f314503a, iVar.f314503a) && L.f(this.f314504b, iVar.f314504b) && L.f(this.f314505c, iVar.f314505c) && L.f(this.f314506d, iVar.f314506d);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f314503a.hashCode() * 31, 31, this.f314504b);
            PrintableText printableText = this.f314505c;
            int iHashCode = (iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
            DeepLink deepLink = this.f314506d;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SingleActionSuccess(shortcut=");
            sb2.append(this.f314503a);
            sb2.append(", advertId=");
            sb2.append(this.f314504b);
            sb2.append(", successMsg=");
            sb2.append(this.f314505c);
            sb2.append(", redirect=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f314506d, ')');
        }
    }
}
