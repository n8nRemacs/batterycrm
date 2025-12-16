package fq;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import eq.InterfaceC40145a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StagesTransitionState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lfq/f;", "", "a", "b", "Lfq/f$a;", "Lfq/f$b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface f {

    /* compiled from: StagesTransitionState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq/f$a;", "Lfq/f;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<InterfaceC40145a> f396157a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f396158b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k List<? extends InterfaceC40145a> list, boolean z12) {
            this.f396157a = list;
            this.f396158b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f396157a, aVar.f396157a) && this.f396158b == aVar.f396158b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f396158b) + (this.f396157a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(fields=");
            sb2.append(this.f396157a);
            sb2.append(", readyForSave=");
            return r.x(sb2, this.f396158b, ')');
        }
    }

    /* compiled from: StagesTransitionState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/f$b;", "Lfq/f;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f396159a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1884282368;
        }

        @k
        public final String toString() {
            return "Loading";
        }
    }
}
