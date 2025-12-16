package P;

import Y61.k;
import androidx.compose.foundation.internal.e;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.snapshots.D;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: UndoManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"LP/d;", "T", "", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d<T> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f12758d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f12759a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final D<T> f12760b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final D<T> f12761c;

    /* compiled from: UndoManager.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LP/d$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public d() {
        this(null, null, 0, 7, null);
    }

    public d(List list, List list2, int i12, int i13, C42822w c42822w) {
        list = (i13 & 1) != 0 ? C42784z0.f406748b : list;
        list2 = (i13 & 2) != 0 ? C42784z0.f406748b : list2;
        i12 = (i13 & 4) != 0 ? 100 : i12;
        this.f12759a = i12;
        D<T> d12 = new D<>();
        d12.addAll(list);
        this.f12760b = d12;
        D<T> d13 = new D<>();
        d13.addAll(list2);
        this.f12761c = d13;
        if (i12 < 0) {
            e.a("Capacity must be a positive integer");
        }
        if (this.f12761c.size() + this.f12760b.size() <= i12) {
            return;
        }
        e.a("Initial list of undo and redo operations have a size greater than the given capacity.");
    }
}
