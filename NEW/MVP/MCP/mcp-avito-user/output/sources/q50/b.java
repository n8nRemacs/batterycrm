package Q50;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentSetProfileNameOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LQ50/b;", "", "a", "b", "c", "d", "LQ50/b$a;", "LQ50/b$b;", "LQ50/b$c;", "LQ50/b$d;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: ReAgentSetProfileNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ50/b$a;", "LQ50/b;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13473a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1361195091;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ReAgentSetProfileNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ50/b$c;", "LQ50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ProfileCreateExtendedFlow f13477a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f13478b;

        public c(@k ProfileCreateExtendedFlow profileCreateExtendedFlow, boolean z12) {
            this.f13477a = profileCreateExtendedFlow;
            this.f13478b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f13477a, cVar.f13477a) && this.f13478b == cVar.f13478b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13478b) + (this.f13477a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnFinal(flow=");
            sb2.append(this.f13477a);
            sb2.append(", isProfileFinalized=");
            return r.x(sb2, this.f13478b, ')');
        }
    }

    /* compiled from: ReAgentSetProfileNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ50/b$d;", "LQ50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f13479a;

        public d(@k Throwable th2) {
            this.f13479a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13479a, ((d) obj).f13479a);
        }

        public final int hashCode() {
            return this.f13479a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f13479a, ')');
        }
    }

    /* compiled from: ReAgentSetProfileNameOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ50/b$b;", "LQ50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q50.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0887b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f13474a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f13475b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Bundle f13476c;

        public C0887b(@l Bundle bundle, @k DeepLink deepLink, @k String str) {
            this.f13474a = deepLink;
            this.f13475b = str;
            this.f13476c = bundle;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0887b)) {
                return false;
            }
            C0887b c0887b = (C0887b) obj;
            return L.f(this.f13474a, c0887b.f13474a) && L.f(this.f13475b, c0887b.f13475b) && L.f(this.f13476c, c0887b.f13476c);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f13474a.hashCode() * 31, 31, this.f13475b);
            Bundle bundle = this.f13476c;
            return iD2 + (bundle == null ? 0 : bundle.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HandleDeeplink(deeplink=");
            sb2.append(this.f13474a);
            sb2.append(", requestKey=");
            sb2.append(this.f13475b);
            sb2.append(", args=");
            return H.m(sb2, this.f13476c, ')');
        }

        public /* synthetic */ C0887b(DeepLink deepLink, String str, Bundle bundle, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? null : bundle, deepLink, str);
        }
    }
}
