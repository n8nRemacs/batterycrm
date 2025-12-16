package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import com.avito.android.bxcontent.beduin_v2.wrapper.cell.CellWrapper;
import com.avito.beduin.v2.engine.component.G;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.jvm.internal.N;

/* compiled from: BxCellWrapperState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/h;", "invoke", "(Lcom/avito/beduin/v2/engine/component/G;)Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class i extends N implements Y41.l<G, h> {

    /* renamed from: l, reason: collision with root package name */
    public static final i f109586l = new i();

    public i() {
        super(1);
    }

    @Override // Y41.l
    public final h invoke(G g12) {
        Object next;
        CellWrapper cellWrapper;
        CellWrapper.a aVar = CellWrapper.f109568c;
        String string = g12.getString("cellId");
        aVar.getClass();
        if (string == null) {
            cellWrapper = CellWrapper.f109569d;
        } else {
            Iterator it = ((AbstractC42738c) CellWrapper.f109571f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((CellWrapper) next).f109572b.equals(string)) {
                    break;
                }
            }
            CellWrapper cellWrapper2 = (CellWrapper) next;
            cellWrapper = cellWrapper2 == null ? CellWrapper.f109569d : cellWrapper2;
        }
        return new h(cellWrapper);
    }
}
