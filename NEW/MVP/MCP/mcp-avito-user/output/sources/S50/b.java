package S50;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentShortFlowCreationOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LS50/b;", "", "a", "b", "c", "d", "e", "LS50/b$a;", "LS50/b$b;", "LS50/b$c;", "LS50/b$d;", "LS50/b$e;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: ReAgentShortFlowCreationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS50/b$a;", "LS50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f14810a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f14811b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f14812c;

        public a(@l Bundle bundle, @k DeepLink deepLink, @k String str) {
            this.f14810a = deepLink;
            this.f14811b = str;
            this.f14812c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f14810a, aVar.f14810a) && L.f(this.f14811b, aVar.f14811b) && L.f(this.f14812c, aVar.f14812c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f14810a.hashCode() * 31, 31, this.f14811b);
            Bundle bundle = this.f14812c;
            return iD2 + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplinkForResult(deeplink=");
            sb2.append(this.f14810a);
            sb2.append(", requestKey=");
            sb2.append(this.f14811b);
            sb2.append(", args=");
            return H.m(sb2, this.f14812c, ')');
        }
    }

    /* compiled from: ReAgentShortFlowCreationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS50/b$b;", "LS50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: S50.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1000b implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f14813a;

        public C1000b(@l DeepLink deepLink) {
            this.f14813a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1000b) && L.f(this.f14813a, ((C1000b) obj).f14813a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f14813a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnBack(deeplink="), this.f14813a, ')');
        }
    }

    /* compiled from: ReAgentShortFlowCreationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS50/b$c;", "LS50/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f14814a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1738323248;
        }

        @k
        public final String toString() {
            return "OnClose";
        }
    }

    /* compiled from: ReAgentShortFlowCreationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS50/b$d;", "LS50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14815a;

        public d(boolean z12) {
            this.f14815a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f14815a == ((d) obj).f14815a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14815a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnFinal(isProfileUpgraded="), this.f14815a, ')');
        }
    }

    /* compiled from: ReAgentShortFlowCreationOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS50/b$e;", "LS50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f14816a;

        public e(@k ApiException apiException) {
            this.f14816a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f14816a.equals(((e) obj).f14816a);
        }

        public final int hashCode() {
            return this.f14816a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("ShowError(throwable="), this.f14816a, ')');
        }
    }
}
