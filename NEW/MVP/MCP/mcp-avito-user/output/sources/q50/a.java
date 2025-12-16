package Q50;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ReAgentSetProfileNameAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LQ50/a;", "", "a", "b", "c", "d", "e", "LQ50/a$a;", "LQ50/a$b;", "LQ50/a$c;", "LQ50/a$d;", "LQ50/a$e;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ReAgentSetProfileNameAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ50/a$a;", "LQ50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q50.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0886a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0886a f13467a = new C0886a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0886a);
        }

        public final int hashCode() {
            return 292281003;
        }

        @k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: ReAgentSetProfileNameAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ50/a$b;", "LQ50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f13468a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1630430735;
        }

        @k
        public final String toString() {
            return "CreateProfileClick";
        }
    }

    /* compiled from: ReAgentSetProfileNameAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ50/a$c;", "LQ50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13469a;

        public c(@k String str) {
            this.f13469a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f13469a, ((c) obj).f13469a);
        }

        public final int hashCode() {
            return this.f13469a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("FirstNameTextChanged(text="), this.f13469a, ')');
        }
    }

    /* compiled from: ReAgentSetProfileNameAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ50/a$d;", "LQ50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f13470a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC14249c f13471b;

        public d(@l String str, @k InterfaceC14249c interfaceC14249c) {
            this.f13470a = str;
            this.f13471b = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f13470a, dVar.f13470a) && L.f(this.f13471b, dVar.f13471b);
        }

        public final int hashCode() {
            String str = this.f13470a;
            return this.f13471b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "OnDeeplinkResult(requestKey=" + this.f13470a + ", result=" + this.f13471b + ')';
        }
    }

    /* compiled from: ReAgentSetProfileNameAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ50/a$e;", "LQ50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f13472a;

        public e(@k String str) {
            this.f13472a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13472a, ((e) obj).f13472a);
        }

        public final int hashCode() {
            return this.f13472a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("SecondNameTextChanged(text="), this.f13472a, ')');
        }
    }
}
