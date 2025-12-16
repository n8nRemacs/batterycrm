package com.avito.android.user_adverts.tab_actions.host;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.user_adverts.model.UserAdvertsGroupData;
import com.avito.android.user_adverts.model.UserAdvertsGroupInfo;
import com.avito.android.user_adverts.model.UserAdvertsShortcutGroup;
import com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAdvertsActionsHandler.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e;", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b;", "Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_adverts/tab_actions/host/e$a;", "a", "b", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface e extends InterfaceC43160i<b>, InterfaceC43172j<a> {

    /* compiled from: UserAdvertsActionsHandler.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$a;", "", "a", "b", "c", "Lcom/avito/android/user_adverts/tab_actions/host/e$a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/e$a$b;", "Lcom/avito/android/user_adverts/tab_actions/host/e$a$c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: UserAdvertsActionsHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$a$a;", "Lcom/avito/android/user_adverts/tab_actions/host/e$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.e$a$a, reason: collision with other inner class name */
        public static final /* data */ class C9697a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f314269a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final UserAdvertsGroupData f314270b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final UserAdvertActionsInfoDomain f314271c;

            public C9697a(@Y61.k String str, @Y61.k UserAdvertsGroupData userAdvertsGroupData, @Y61.k UserAdvertActionsInfoDomain userAdvertActionsInfoDomain) {
                this.f314269a = str;
                this.f314270b = userAdvertsGroupData;
                this.f314271c = userAdvertActionsInfoDomain;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9697a)) {
                    return false;
                }
                C9697a c9697a = (C9697a) obj;
                return L.f(this.f314269a, c9697a.f314269a) && L.f(this.f314270b, c9697a.f314270b) && L.f(this.f314271c, c9697a.f314271c);
            }

            public final int hashCode() {
                return this.f314271c.hashCode() + AK.c.c(this.f314269a.hashCode() * 31, 31, this.f314270b.f312182b);
            }

            @Y61.k
            public final String toString() {
                return "MultipleSelected(shortcut=" + this.f314269a + ", groupData=" + this.f314270b + ", actionsInfo=" + this.f314271c + ')';
            }
        }

        /* compiled from: UserAdvertsActionsHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$a$b;", "Lcom/avito/android/user_adverts/tab_actions/host/e$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f314272a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f314273b;

            /* renamed from: c, reason: collision with root package name */
            @Y61.k
            public final String f314274c;

            /* renamed from: d, reason: collision with root package name */
            @Y61.k
            public final AvailableActionsDomain f314275d;

            public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k AvailableActionsDomain availableActionsDomain) {
                this.f314272a = str;
                this.f314273b = str2;
                this.f314274c = str3;
                this.f314275d = availableActionsDomain;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return L.f(this.f314272a, bVar.f314272a) && L.f(this.f314273b, bVar.f314273b) && L.f(this.f314274c, bVar.f314274c) && L.f(this.f314275d, bVar.f314275d);
            }

            public final int hashCode() {
                return this.f314275d.f314259b.hashCode() + H.d(H.d(this.f314272a.hashCode() * 31, 31, this.f314273b), 31, this.f314274c);
            }

            @Y61.k
            public final String toString() {
                return "SingleSelected(shortcut=" + this.f314272a + ", advertId=" + this.f314273b + ", advertTitle=" + this.f314274c + ", availableActions=" + this.f314275d + ')';
            }
        }

        /* compiled from: UserAdvertsActionsHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$a$c;", "Lcom/avito/android/user_adverts/tab_actions/host/e$a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f314276a;

            public c(@Y61.k String str) {
                this.f314276a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && L.f(this.f314276a, ((c) obj).f314276a);
            }

            public final int hashCode() {
                return this.f314276a.hashCode();
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Unselected(shortcut="), this.f314276a, ')');
            }
        }
    }

    /* compiled from: UserAdvertsActionsHandler.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$b;", "", "a", "b", "c", "d", "Lcom/avito/android/user_adverts/tab_actions/host/e$b$a;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b$b;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b$c;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b$d;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: UserAdvertsActionsHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$b$a;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f314277a;

            public a(@Y61.k String str) {
                this.f314277a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && L.f(this.f314277a, ((a) obj).f314277a);
            }

            public final int hashCode() {
                return this.f314277a.hashCode();
            }

            @Override // com.avito.android.user_adverts.tab_actions.host.e.b
            @Y61.k
            /* renamed from: k, reason: from getter */
            public final String getF314282a() {
                return this.f314277a;
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Cancelled(shortcut="), this.f314277a, ')');
            }
        }

        /* compiled from: UserAdvertsActionsHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$b$b;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.user_adverts.tab_actions.host.e$b$b, reason: collision with other inner class name */
        public static final /* data */ class C9698b implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f314278a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Object f314279b;

            public C9698b(@Y61.k String str, @Y61.k Map<UserAdvertsShortcutGroup, UserAdvertsGroupInfo> map) {
                this.f314278a = str;
                this.f314279b = map;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C9698b)) {
                    return false;
                }
                C9698b c9698b = (C9698b) obj;
                return L.f(this.f314278a, c9698b.f314278a) && this.f314279b.equals(c9698b.f314279b);
            }

            public final int hashCode() {
                return this.f314279b.hashCode() + (this.f314278a.hashCode() * 31);
            }

            @Override // com.avito.android.user_adverts.tab_actions.host.e.b
            @Y61.k
            /* renamed from: k, reason: from getter */
            public final String getF314282a() {
                return this.f314278a;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Failed(shortcut=");
                sb2.append(this.f314278a);
                sb2.append(", failedInfo=");
                return H.n(sb2, this.f314279b, ')');
            }
        }

        /* compiled from: UserAdvertsActionsHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$b$c;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class c implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f314280a;

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final String f314281b;

            public c(@Y61.k String str, @Y61.k String str2) {
                this.f314280a = str;
                this.f314281b = str2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return L.f(this.f314280a, cVar.f314280a) && L.f(this.f314281b, cVar.f314281b);
            }

            public final int hashCode() {
                return this.f314281b.hashCode() + (this.f314280a.hashCode() * 31);
            }

            @Override // com.avito.android.user_adverts.tab_actions.host.e.b
            @Y61.k
            /* renamed from: k, reason: from getter */
            public final String getF314282a() {
                return this.f314280a;
            }

            @Y61.k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SingleActionCancelled(shortcut=");
                sb2.append(this.f314280a);
                sb2.append(", advertId=");
                return C22026a.c(sb2, this.f314281b, ')');
            }
        }

        /* compiled from: UserAdvertsActionsHandler.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/e$b$d;", "Lcom/avito/android/user_adverts/tab_actions/host/e$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final String f314282a;

            public d(@Y61.k String str) {
                this.f314282a = str;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && L.f(this.f314282a, ((d) obj).f314282a);
            }

            public final int hashCode() {
                return this.f314282a.hashCode();
            }

            @Override // com.avito.android.user_adverts.tab_actions.host.e.b
            @Y61.k
            /* renamed from: k, reason: from getter */
            public final String getF314282a() {
                return this.f314282a;
            }

            @Y61.k
            public final String toString() {
                return C22026a.c(new StringBuilder("Success(shortcut="), this.f314282a, ')');
            }
        }

        @Y61.k
        /* renamed from: k */
        String getF314282a();
    }
}
