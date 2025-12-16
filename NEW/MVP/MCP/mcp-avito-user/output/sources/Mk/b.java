package mK;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: IacCallLauncherDialerMediatorAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LmK/b;", "", "a", "b", "LmK/b$a;", "LmK/b$b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: IacCallLauncherDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmK/b$a;", "LmK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414458a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f414459b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f414460c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f414461d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f414462e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Long f414463f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Map<String, String> f414464g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final Map<String, String> f414465h;

        public a(@k String str, @k String str2, boolean z12, @k String str3, @k String str4, @l Long l12, @l Map map, @l Map map2) {
            this.f414458a = str;
            this.f414459b = str2;
            this.f414460c = str3;
            this.f414461d = str4;
            this.f414462e = z12;
            this.f414463f = l12;
            this.f414464g = map;
            this.f414465h = map2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f414458a, aVar.f414458a) && L.f(this.f414459b, aVar.f414459b) && L.f(this.f414460c, aVar.f414460c) && L.f(this.f414461d, aVar.f414461d) && this.f414462e == aVar.f414462e && L.f(this.f414463f, aVar.f414463f) && L.f(this.f414464g, aVar.f414464g) && L.f(this.f414465h, aVar.f414465h);
        }

        public final int hashCode() {
            int i12 = r.i(H.d(H.d(H.d(this.f414458a.hashCode() * 31, 31, this.f414459b), 31, this.f414460c), 31, this.f414461d), 31, this.f414462e);
            Long l12 = this.f414463f;
            int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Map<String, String> map = this.f414464g;
            int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, String> map2 = this.f414465h;
            return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartNewCall(callId=");
            sb2.append(this.f414458a);
            sb2.append(", from=");
            sb2.append(this.f414459b);
            sb2.append(", to=");
            sb2.append(this.f414460c);
            sb2.append(", scenario=");
            sb2.append(this.f414461d);
            sb2.append(", isVideo=");
            sb2.append(this.f414462e);
            sb2.append(", itemId=");
            sb2.append(this.f414463f);
            sb2.append(", extraInfo=");
            sb2.append(this.f414464g);
            sb2.append(", analyticsExtraParams=");
            return r.w(sb2, this.f414465h, ')');
        }
    }

    /* compiled from: IacCallLauncherDialerMediatorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LmK/b$b;", "LmK/b;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: mK.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11825b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f414466a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f414467b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f414468c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f414469d;

        public C11825b(@k String str, @k String str2, @k String str3, boolean z12) {
            this.f414466a = str;
            this.f414467b = str2;
            this.f414468c = str3;
            this.f414469d = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C11825b)) {
                return false;
            }
            C11825b c11825b = (C11825b) obj;
            return L.f(this.f414466a, c11825b.f414466a) && L.f(this.f414467b, c11825b.f414467b) && L.f(this.f414468c, c11825b.f414468c) && this.f414469d == c11825b.f414469d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f414469d) + H.d(H.d(this.f414466a.hashCode() * 31, 31, this.f414467b), 31, this.f414468c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartRecallFromSystemApi(callId=");
            sb2.append(this.f414466a);
            sb2.append(", scenario=");
            sb2.append(this.f414467b);
            sb2.append(", prevCallId=");
            sb2.append(this.f414468c);
            sb2.append(", isVideo=");
            return r.x(sb2, this.f414469d, ')');
        }
    }
}
