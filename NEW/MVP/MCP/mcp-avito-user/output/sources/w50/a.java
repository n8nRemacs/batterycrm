package W50;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationPopupAction.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LW50/a;", "", "a", "b", "c", "d", "e", "LW50/a$a;", "LW50/a$b;", "LW50/a$c;", "LW50/a$d;", "LW50/a$e;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: VerificationPopupAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW50/a$a;", "LW50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: W50.a$a, reason: collision with other inner class name */
    public static final class C1250a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1250a f17738a = new C1250a();
    }

    /* compiled from: VerificationPopupAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW50/a$b;", "LW50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f17739a = new b();
    }

    /* compiled from: VerificationPopupAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW50/a$c;", "LW50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f17740a = new c();
    }

    /* compiled from: VerificationPopupAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW50/a$d;", "LW50/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f17741a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final InterfaceC14249c f17742b;

        public d(@l String str, @k InterfaceC14249c interfaceC14249c) {
            this.f17741a = str;
            this.f17742b = interfaceC14249c;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f17741a, dVar.f17741a) && L.f(this.f17742b, dVar.f17742b);
        }

        public final int hashCode() {
            String str = this.f17741a;
            return this.f17742b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            return "OnDeeplinkResult(requestKey=" + this.f17741a + ", result=" + this.f17742b + ')';
        }
    }

    /* compiled from: VerificationPopupAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW50/a$e;", "LW50/a;", "<init>", "()V", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final e f17743a = new e();
    }
}
