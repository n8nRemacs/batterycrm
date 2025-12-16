package S50;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentShortFlowCreationAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LS50/a;", "", "a", "b", "c", "d", "LS50/a$a;", "LS50/a$b;", "LS50/a$c;", "LS50/a$d;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ReAgentShortFlowCreationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS50/a$a;", "LS50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: S50.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0999a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0999a f14805a = new C0999a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0999a);
        }

        public final int hashCode() {
            return -813026585;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: ReAgentShortFlowCreationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS50/a$b;", "LS50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f14806a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 846907690;
        }

        @k
        public final String toString() {
            return "CloseClick";
        }
    }

    /* compiled from: ReAgentShortFlowCreationAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LS50/a$c;", "LS50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f14807a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC14249c f14808b;

        public c(@l String str, @k InterfaceC14249c interfaceC14249c) {
            this.f14807a = str;
            this.f14808b = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f14807a, cVar.f14807a) && L.f(this.f14808b, cVar.f14808b);
        }

        public final int hashCode() {
            String str = this.f14807a;
            return this.f14808b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "OnDeeplinkResult(requestKey=" + this.f14807a + ", result=" + this.f14808b + ')';
        }
    }

    /* compiled from: ReAgentShortFlowCreationAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LS50/a$d;", "LS50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f14809a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1251032326;
        }

        @k
        public final String toString() {
            return "UpgradeClick";
        }
    }
}
