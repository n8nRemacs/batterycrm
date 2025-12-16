package dq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectAgentState.kt */
@F3
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Ldq/d;", "", "a", "b", "c", "d", "Ldq/d$a;", "Ldq/d$b;", "Ldq/d$c;", "Ldq/d$d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface d {

    /* compiled from: SelectAgentState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq/d$a;", "Ldq/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f394089a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1501468244;
        }

        @k
        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: SelectAgentState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldq/d$b;", "Ldq/d;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<com.avito.android.comfortable_deal.select_agent.item.agent.c> f394090a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f394091b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f394092c;

        public b(@k List<com.avito.android.comfortable_deal.select_agent.item.agent.c> list, boolean z12, boolean z13) {
            this.f394090a = list;
            this.f394091b = z12;
            this.f394092c = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f394090a, bVar.f394090a) && this.f394091b == bVar.f394091b && this.f394092c == bVar.f394092c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f394092c) + r.i(this.f394090a.hashCode() * 31, 31, this.f394091b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HasAgents(agents=");
            sb2.append(this.f394090a);
            sb2.append(", showSubmitButtonLoader=");
            sb2.append(this.f394091b);
            sb2.append(", isSubmitButtonEnabled=");
            return r.x(sb2, this.f394092c, ')');
        }
    }

    /* compiled from: SelectAgentState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq/d$c;", "Ldq/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f394093a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 571316491;
        }

        @k
        public final String toString() {
            return "NoAgents";
        }
    }

    /* compiled from: SelectAgentState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ldq/d$d;", "Ldq/d;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: dq.d$d, reason: collision with other inner class name */
    public static final /* data */ class C11037d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11037d f394094a = new C11037d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11037d);
        }

        public final int hashCode() {
            return 48525628;
        }

        @k
        public final String toString() {
            return "Placeholders";
        }
    }
}
