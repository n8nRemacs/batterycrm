package SV;

import Y61.k;
import Y61.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.P;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PagingSnapHelper.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LSV/b;", "Landroidx/recyclerview/widget/P;", "a", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class b extends P {

    /* renamed from: d, reason: collision with root package name */
    public int f15037d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f15038e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final int[] f15039f;

    /* compiled from: PagingSnapHelper.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSV/b$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        void a(int i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.P
    @k
    public final int[] c(@k RecyclerView.m mVar, @k View view) {
        mVar.getClass();
        int iJ02 = RecyclerView.m.j0(view) - this.f15037d;
        int[] iArr = this.f15039f;
        iArr[0] = iJ02;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.P
    @l
    public final View f(@k RecyclerView.m mVar) {
        View viewZ;
        int i12;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
        int iH1 = linearLayoutManager.H1();
        if (iH1 == -1) {
            iH1 = linearLayoutManager.K1();
        }
        if (iH1 == -1 || (viewZ = mVar.Z(iH1)) == null) {
            return null;
        }
        a aVar = this.f15038e;
        if (aVar != null) {
            aVar.a(iH1);
        }
        return (Math.abs(RecyclerView.m.m0(viewZ)) >= Math.abs(RecyclerView.m.j0(viewZ)) || (i12 = iH1 + 1) == linearLayoutManager.o0()) ? viewZ : mVar.Z(i12);
    }

    @Override // androidx.recyclerview.widget.P
    public final int g(@k RecyclerView.m mVar, int i12, int i13) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mVar;
        int iK1 = linearLayoutManager.K1();
        if (!linearLayoutManager.f53694v ? i12 >= 0 : i12 <= 0) {
            iK1++;
        }
        int iMin = Math.min(linearLayoutManager.o0() - 1, Math.max(iK1, 0));
        a aVar = this.f15038e;
        if (aVar != null) {
            aVar.a(iMin);
        }
        return iMin;
    }

    public /* synthetic */ b(int i12, a aVar, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12, (i13 & 2) != 0 ? null : aVar);
    }

    public b(int i12, @l a aVar) {
        this.f15037d = i12;
        this.f15038e = aVar;
        this.f15039f = new int[2];
    }
}
