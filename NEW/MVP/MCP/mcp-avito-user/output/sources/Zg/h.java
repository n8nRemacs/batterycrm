package zg;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvlPlayerState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lzg/h;", "", "a", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f444159b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final h f444160c = new h(C42784z0.f406748b);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f444161a;

    /* compiled from: AvlPlayerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzg/h$a;", "", "<init>", "()V", "_avito_avl_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@k List<? extends com.avito.conveyor_item.a> list) {
        this.f444161a = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && L.f(this.f444161a, ((h) obj).f444161a);
    }

    public final int hashCode() {
        return this.f444161a.hashCode();
    }

    @k
    public final String toString() {
        return H.p(new StringBuilder("AvlPlayerState(videosList="), this.f444161a, ')');
    }
}
