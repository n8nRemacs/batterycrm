package kotlinx.coroutines.internal;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: OnDemandAllocatingPool.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/internal/O;", "T", "", "Lkotlinx/atomicfu/AtomicInt;", "controlState", "Lkotlinx/atomicfu/AtomicArray;", "elements", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class O<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f411880a = AtomicIntegerFieldUpdater.newUpdater(O.class, "controlState$volatile");
    private volatile /* synthetic */ int controlState$volatile;

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnDemandAllocatingPool(");
        int i12 = f411880a.get(this);
        kotlin.ranges.l lVarR = kotlin.ranges.s.r(0, Integer.MAX_VALUE & i12);
        ArrayList arrayList = new ArrayList(C42745f0.q(lVarR, 10));
        kotlin.ranges.k it = lVarR.iterator();
        if (it.f406910d) {
            it.a();
            throw null;
        }
        sb2.append(arrayList.toString() + ((i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? "[closed]" : ""));
        sb2.append(')');
        return sb2.toString();
    }
}
