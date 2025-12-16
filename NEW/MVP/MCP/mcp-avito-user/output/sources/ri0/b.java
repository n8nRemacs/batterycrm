package RI0;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceFreemiumState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRI0/b;", "", "a", "b", "LRI0/b$a;", "LRI0/b$b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface b {

    /* compiled from: ServiceFreemiumState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRI0/b$a;", "LRI0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f14303a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -2141133134;
        }

        @k
        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: ServiceFreemiumState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI0/b$b;", "LRI0/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RI0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0951b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a f14304a;

        public C0951b(@k com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a aVar) {
            this.f14304a = aVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0951b) && L.f(this.f14304a, ((C0951b) obj).f14304a);
        }

        public final int hashCode() {
            return this.f14304a.hashCode();
        }

        @k
        public final String toString() {
            return "Show(feedback=" + this.f14304a + ')';
        }
    }
}
