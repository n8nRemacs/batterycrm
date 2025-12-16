package m40;

import Y61.k;
import Y61.l;
import com.avito.android.offlinization.analytics.events.CacheRequestReason;
import com.avito.android.offlinization.analytics.events.CacheTechnique;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NetworkDataRequestEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lm40/b;", "", "a", "b", "Lm40/b$a;", "Lm40/b$b;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: m40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC43878b {

    /* compiled from: NetworkDataRequestEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lm40/b$a;", "Lm40/b;", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m40.b$a */
    public static final /* data */ class a implements InterfaceC43878b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final CacheRequestReason f414300a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final CacheTechnique f414301b;

        public a(CacheRequestReason cacheRequestReason, CacheTechnique cacheTechnique, int i12, C42822w c42822w) {
            cacheTechnique = (i12 & 2) != 0 ? CacheTechnique.f208495c : cacheTechnique;
            this.f414300a = cacheRequestReason;
            this.f414301b = cacheTechnique;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f414300a == aVar.f414300a && this.f414301b == aVar.f414301b;
        }

        public final int hashCode() {
            return this.f414301b.hashCode() + (this.f414300a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Cache(cacheRequestReason=" + this.f414300a + ", cacheTechnique=" + this.f414301b + ')';
        }
    }

    /* compiled from: NetworkDataRequestEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm40/b$b;", "Lm40/b;", "<init>", "()V", "_common_offlinization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m40.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11814b implements InterfaceC43878b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11814b f414302a = new C11814b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11814b);
        }

        public final int hashCode() {
            return -1132898403;
        }

        @k
        public final String toString() {
            return "Network";
        }
    }
}
