package Ro0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: SbcAutoDispatchesListEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LRo0/b;", "", "a", "b", "LRo0/b$a;", "LRo0/b$b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ro0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC15068b {

    /* compiled from: SbcAutoDispatchesListEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRo0/b$a;", "LRo0/b;", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro0.b$a */
    public static final /* data */ class a implements InterfaceC15068b {

        /* renamed from: a, reason: collision with root package name */
        public final long f14638a;

        public a(long j12) {
            this.f14638a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f14638a == ((a) obj).f14638a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f14638a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("NavigateToDispatchEditScreen(dispatchId="), this.f14638a, ')');
        }
    }

    /* compiled from: SbcAutoDispatchesListEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRo0/b$b;", "LRo0/b;", "<init>", "()V", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Ro0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0981b implements InterfaceC15068b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0981b f14639a = new C0981b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0981b);
        }

        public final int hashCode() {
            return 600112200;
        }

        @k
        public final String toString() {
            return "ShowMoreAdvertsExplanationDialog";
        }
    }
}
