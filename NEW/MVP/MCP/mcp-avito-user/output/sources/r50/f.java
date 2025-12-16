package r50;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PaginationInternalAction.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lr50/f;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "Lr50/f$a;", "Lr50/f$b;", "Lr50/f$c;", "Lr50/f$d;", "Lr50/f$e;", "Lr50/f$f;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class f {

    /* compiled from: PaginationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr50/f$a;", "Lr50/f;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends f {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return L.f(null, null) && L.f(null, null) && 0 == 0;
        }

        public final int hashCode() {
            Object obj = null;
            obj.getClass();
            throw null;
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("FailedFetchNewData(direction=");
            sb2.append((Object) null);
            sb2.append(", errorContent=null, loadId=");
            return r.u(sb2, 0L, ')');
        }
    }

    /* compiled from: PaginationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr50/f$b;", "Lr50/f;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends f {
        public b() {
            throw null;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return L.f(null, null) && L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "FetchedNewData(direction=null, items=null, exhausted=false, loadId=0)";
        }
    }

    /* compiled from: PaginationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr50/f$c;", "Lr50/f;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends f {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f429610a;

        /* renamed from: b, reason: collision with root package name */
        public final long f429611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, long j12, int i12, C42822w c42822w) {
            super(null);
            z12 = (i12 & 1) != 0 ? false : z12;
            this.f429610a = z12;
            this.f429611b = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f429610a == cVar.f429610a && this.f429611b == cVar.f429611b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f429611b) + (Boolean.hashCode(this.f429610a) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("StartLoadingInitPortion(p2rTriggered=");
            sb2.append(this.f429610a);
            sb2.append(", loadMarker=");
            return r.u(sb2, this.f429611b, ')');
        }
    }

    /* compiled from: PaginationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr50/f$d;", "Lr50/f;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends f {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return 0 == 0;
        }

        public final int hashCode() {
            return Long.hashCode(0L);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("StartLoadingNextPortion(loadMarker="), 0L, ')');
        }
    }

    /* compiled from: PaginationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr50/f$e;", "Lr50/f;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends f {
    }

    /* compiled from: PaginationInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr50/f$f;", "Lr50/f;", "_common_pagination_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r50.f$f, reason: collision with other inner class name */
    public static final class C12357f extends f {
        public C12357f() {
            super(null);
        }
    }

    public /* synthetic */ f(C42822w c42822w) {
        this();
    }

    public f() {
    }
}
