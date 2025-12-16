package Ro0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.sbc.generated.api.api_get_auto_dispatches_v_1.AutoDispatchOut;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbcAutoDispatchesListInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LRo0/c;", "", "a", "b", "c", "d", "e", "f", "LRo0/c$a;", "LRo0/c$b;", "LRo0/c$c;", "LRo0/c$d;", "LRo0/c$e;", "LRo0/c$f;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: SbcAutoDispatchesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo0/c$a;", "LRo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<AutoDispatchOut> f14640a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f14641b;

        public a(@k List<AutoDispatchOut> list, boolean z12) {
            this.f14640a = list;
            this.f14641b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f14640a, aVar.f14640a) && this.f14641b == aVar.f14641b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14641b) + (this.f14640a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AutoDispatchesLoaded(dispatches=");
            sb2.append(this.f14640a);
            sb2.append(", isFullyLoaded=");
            return r.x(sb2, this.f14641b, ')');
        }
    }

    /* compiled from: SbcAutoDispatchesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo0/c$b;", "LRo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public final long f14642a;

        public b(long j12) {
            this.f14642a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f14642a == ((b) obj).f14642a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f14642a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("NavigateToDispatchEditScreen(dispatchId="), this.f14642a, ')');
        }
    }

    /* compiled from: SbcAutoDispatchesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRo0/c$c;", "LRo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro0.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0982c implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0982c f14643a = new C0982c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0982c);
        }

        public final int hashCode() {
            return 341416297;
        }

        @k
        public final String toString() {
            return "NextPageLoadingError";
        }
    }

    /* compiled from: SbcAutoDispatchesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRo0/c$d;", "LRo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f14644a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1265349538;
        }

        @k
        public final String toString() {
            return "NextPageLoadingStarted";
        }
    }

    /* compiled from: SbcAutoDispatchesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo0/c$e;", "LRo0/c;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final com.avito.android.sbc.autodispatcheslist.adapter.f f14645a;

        public e(@k com.avito.android.sbc.autodispatcheslist.adapter.f fVar) {
            this.f14645a = fVar;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f14645a, ((e) obj).f14645a);
        }

        public final int hashCode() {
            return this.f14645a.hashCode();
        }

        @k
        public final String toString() {
            return "OnAutoDispatchItemClicked(itemClicked=" + this.f14645a + ')';
        }
    }

    /* compiled from: SbcAutoDispatchesListInternalAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRo0/c$f;", "LRo0/c;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f14646a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 226843375;
        }

        @k
        public final String toString() {
            return "ShowMoreAdvertsExplanationDialog";
        }
    }
}
