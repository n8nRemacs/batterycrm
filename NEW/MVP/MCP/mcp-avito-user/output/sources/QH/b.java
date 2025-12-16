package QH;

import Y61.k;
import androidx.recyclerview.widget.GridLayoutManager;
import com.avito.android.grid.GridElementType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;

/* compiled from: GridSpanLookup.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQH/b;", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "_avito-discouraged_avito-libs_tns-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends GridLayoutManager.c {

    /* renamed from: e, reason: collision with root package name */
    @k
    public final N f13652e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public List<? extends a> f13653f = C42784z0.f406748b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(@k Y41.a<Integer> aVar) {
        this.f13652e = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int f(int i12) {
        int size = this.f13653f.size();
        ?? r12 = this.f13652e;
        if (i12 >= size) {
            return ((Number) r12.invoke()).intValue();
        }
        GridElementType f154528c = this.f13653f.get(i12).getF154528c();
        if (f154528c instanceof GridElementType.FullWidth) {
            return ((Number) r12.invoke()).intValue();
        }
        if (f154528c instanceof GridElementType.SingleSpan) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }
}
