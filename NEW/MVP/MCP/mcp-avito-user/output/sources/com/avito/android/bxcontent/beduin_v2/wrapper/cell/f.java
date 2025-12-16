package com.avito.android.bxcontent.beduin_v2.wrapper.cell;

import com.avito.android.bxcontent.beduin_v2.wrapper.cell.CellWrapper;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: BxCellWrapperItemProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/f;", "Lcom/avito/android/bxcontent/beduin_v2/wrapper/cell/e;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Y41.a<com.avito.android.bxcontent.mvi.entity.l> f109583a;

    /* compiled from: BxCellWrapperItemProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CellWrapper.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CellWrapper.a aVar = CellWrapper.f109568c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CellWrapper.a aVar2 = CellWrapper.f109568c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Inject
    public f(@Y61.k Y41.a<com.avito.android.bxcontent.mvi.entity.l> aVar) {
        this.f109583a = aVar;
    }

    @Override // com.avito.android.bxcontent.beduin_v2.wrapper.cell.e
    @Y61.k
    public final List<l1> a(@Y61.k CellWrapper cellWrapper) {
        ArrayList arrayList;
        com.avito.android.bxcontent.mvi.entity.l lVarInvoke = this.f109583a.invoke();
        int iOrdinal = cellWrapper.ordinal();
        if (iOrdinal == 0) {
            List<l1> list = lVarInvoke.f112335g;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof MiniMenuBlockItem) {
                    arrayList.add(obj);
                }
            }
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return C42784z0.f406748b;
                }
                throw new NoWhenBranchMatchedException();
            }
            List<l1> list2 = lVarInvoke.f112335g;
            arrayList = new ArrayList();
            for (Object obj2 : list2) {
                if (obj2 instanceof VisualRubricatorWidgetItem) {
                    arrayList.add(obj2);
                }
            }
        }
        return arrayList;
    }
}
