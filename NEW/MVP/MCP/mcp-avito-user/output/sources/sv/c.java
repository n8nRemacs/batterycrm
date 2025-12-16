package SV;

import Y61.k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SectionSnapHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSV/c;", "LSV/a;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class c extends a {
    public c(int i12, int i13, int i14, C42822w c42822w) {
        super(i12, (i14 & 2) != 0 ? 0 : i13);
    }

    @Override // androidx.recyclerview.widget.A, androidx.recyclerview.widget.P
    public final int g(@k RecyclerView.m mVar, int i12, int i13) {
        int iG2 = super.g(mVar, i12, i13);
        LinearLayoutManager linearLayoutManager = mVar instanceof LinearLayoutManager ? (LinearLayoutManager) mVar : null;
        if (linearLayoutManager == null) {
            return iG2;
        }
        int iK1 = i12 > 0 ? linearLayoutManager.K1() : linearLayoutManager.H1();
        int iL1 = linearLayoutManager.L1();
        if (iK1 == -1 || iL1 == -1) {
            return iG2;
        }
        int iMax = Math.max(iL1 - iK1, 1);
        return i12 > 0 ? Math.min(iG2, Math.min(iK1 + iMax, ((LinearLayoutManager) mVar).o0() - 1)) : Math.max(iG2, Math.max(iK1 - iMax, 0));
    }
}
