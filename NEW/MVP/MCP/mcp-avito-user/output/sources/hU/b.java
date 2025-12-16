package HU;

import Y61.k;
import Y61.l;
import androidx.camera.camera2.internal.G;
import androidx.compose.foundation.lazy.grid.InterfaceC20662b;
import androidx.compose.ui.unit.d;
import androidx.compose.ui.unit.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GridCells.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LHU/b;", "Landroidx/compose/foundation/lazy/grid/b;", "Landroidx/compose/ui/unit/h;", "minSize", "", "minCrossAxisCells", "<init>", "(FILkotlin/jvm/internal/w;)V", "_design-modules_compose_shared_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements InterfaceC20662b {

    /* renamed from: a, reason: collision with root package name */
    public final float f7096a;

    /* renamed from: b, reason: collision with root package name */
    public final int f7097b;

    public b(float f12, int i12, C42822w c42822w) {
        this.f7096a = f12;
        this.f7097b = i12;
        h.a aVar = h.f42849c;
        if (Float.compare(f12, 0) > 0) {
            if (i12 <= 0) {
                throw new IllegalArgumentException(G.e(i12, "Provided min cross axis cells ", " should be larger than zero.").toString());
            }
        } else {
            throw new IllegalArgumentException(("Provided min size " + ((Object) h.c(f12)) + " should be larger than zero.").toString());
        }
    }

    @Override // androidx.compose.foundation.lazy.grid.InterfaceC20662b
    @k
    public final List<Integer> a(@k d dVar, int i12, int i13) {
        int iMax = Math.max((i12 + i13) / (dVar.y0(this.f7096a) + i13), this.f7097b);
        int i14 = i12 - ((iMax - 1) * i13);
        int i15 = i14 / iMax;
        int i16 = i14 % iMax;
        ArrayList arrayList = new ArrayList(iMax);
        int i17 = 0;
        while (i17 < iMax) {
            arrayList.add(Integer.valueOf((i17 < i16 ? 1 : 0) + i15));
            i17++;
        }
        return arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (h.b(this.f7096a, bVar.f7096a) && this.f7097b == bVar.f7097b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        h.a aVar = h.f42849c;
        return Float.hashCode(this.f7096a);
    }
}
