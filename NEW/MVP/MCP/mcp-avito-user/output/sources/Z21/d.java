package z21;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.core.view2.items.Direction;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: DivViewWithItems.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d {

    /* compiled from: DivViewWithItems.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Direction.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
        }
    }

    public static final int a(RecyclerView recyclerView, Direction direction) {
        int iH1;
        int iK1;
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            iH1 = -1;
        } else {
            int iOrdinal = direction.ordinal();
            if (iOrdinal == 0) {
                RecyclerView.m layoutManager2 = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                Integer numValueOf = linearLayoutManager2 == null ? null : Integer.valueOf(linearLayoutManager2.f53690r);
                iH1 = (numValueOf != null && numValueOf.intValue() == 0) ? recyclerView.canScrollHorizontally(1) : (numValueOf != null && numValueOf.intValue() == 1) ? recyclerView.canScrollVertically(1) : false ? linearLayoutManager.H1() : linearLayoutManager.L1();
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                iH1 = linearLayoutManager.H1();
            }
        }
        Integer numValueOf2 = Integer.valueOf(iH1);
        if (!(iH1 != -1)) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            return numValueOf2.intValue();
        }
        RecyclerView.m layoutManager3 = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager3 = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
        if (linearLayoutManager3 == null) {
            return -1;
        }
        int iOrdinal2 = direction.ordinal();
        if (iOrdinal2 == 0) {
            iK1 = linearLayoutManager3.K1();
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            iK1 = linearLayoutManager3.M1();
        }
        return iK1;
    }
}
