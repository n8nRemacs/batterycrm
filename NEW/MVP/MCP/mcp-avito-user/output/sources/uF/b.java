package Uf;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaWaitingForPaymentOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LUf/b;", "", "a", "b", "c", "LUf/b$a;", "LUf/b$b;", "LUf/b$c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface b {

    /* compiled from: AutotekaWaitingForPaymentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUf/b$a;", "LUf/b;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f16538a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -100354977;
        }

        @k
        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: AutotekaWaitingForPaymentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUf/b$b;", "LUf/b;", "<init>", "()V", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Uf.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1134b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1134b f16539a = new C1134b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1134b);
        }

        public final int hashCode() {
            return 292291683;
        }

        @k
        public final String toString() {
            return "OpenAuthScreen";
        }
    }

    /* compiled from: AutotekaWaitingForPaymentOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUf/b$c;", "LUf/b;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f16540a;

        public c(@k DeepLink deepLink) {
            this.f16540a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f16540a, ((c) obj).f16540a);
        }

        public final int hashCode() {
            return this.f16540a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f16540a, ')');
        }
    }
}
