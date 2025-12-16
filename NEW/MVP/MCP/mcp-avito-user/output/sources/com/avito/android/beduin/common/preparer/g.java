package com.avito.android.beduin.common.preparer;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import com.avito.android.R;
import com.avito.android.beduin.common.component.grid_layout.BeduinGridLayoutModel;
import com.avito.android.beduin.common.component.grid_layout.row.BeduinGridLayoutRowContainerModel;
import com.avito.android.beduin.common.component.model.BeduinContainerIndent;
import com.avito.android.beduin.common.component.spacing.BeduinSpacingModel;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.ranges.l;
import kotlin.ranges.s;
import qj.InterfaceC47406a;

/* compiled from: GridLayoutModelPreparer.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/beduin/common/preparer/g;", "Lqj/a;", "Lcom/avito/android/beduin/common/component/grid_layout/BeduinGridLayoutModel;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g implements InterfaceC47406a<BeduinGridLayoutModel> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f103456a;

    @Inject
    public g(@Y61.k Context context) {
        this.f103456a = context;
    }

    @Override // qj.InterfaceC47406a
    public final BeduinModel a(BeduinModel beduinModel) throws Resources.NotFoundException {
        int iIntValue;
        int i12;
        Iterable iterableSingletonList;
        Parcelable beduinSpacingModel;
        BeduinGridLayoutModel beduinGridLayoutModel = (BeduinGridLayoutModel) beduinModel;
        Context context = this.f103456a;
        boolean z12 = context.getResources().getDisplayMetrics().widthPixels > context.getResources().getDisplayMetrics().heightPixels;
        boolean z13 = context.getResources().getBoolean(R.bool.is_tablet);
        if (z12 || z13) {
            Integer wideScreenColumnCount = beduinGridLayoutModel.getWideScreenColumnCount();
            iIntValue = wideScreenColumnCount != null ? wideScreenColumnCount.intValue() : 3;
        } else {
            Integer narrowScreenColumnCount = beduinGridLayoutModel.getNarrowScreenColumnCount();
            iIntValue = narrowScreenColumnCount != null ? narrowScreenColumnCount.intValue() : 2;
        }
        List<BeduinModel> children = beduinGridLayoutModel.getChildren();
        int size = children != null ? children.size() : 0;
        if (iIntValue > 0) {
            i12 = (size / iIntValue) + (size % iIntValue > 0 ? 1 : 0);
        } else {
            i12 = 0;
        }
        String id2 = beduinGridLayoutModel.getId();
        l lVarR = s.r(0, i12);
        ArrayList arrayList = new ArrayList();
        kotlin.ranges.k it = lVarR.iterator();
        while (it.f406910d) {
            int iA2 = it.a();
            String str = id2 + '_' + iA2;
            BeduinContainerIndent rowPadding = beduinGridLayoutModel.getRowPadding();
            BeduinContainerIndent rowMargin = beduinGridLayoutModel.getRowMargin();
            int i13 = iA2 * iIntValue;
            l lVarR2 = s.r(i13, i13 + iIntValue);
            ArrayList arrayList2 = new ArrayList(C42745f0.q(lVarR2, 10));
            kotlin.ranges.k it2 = lVarR2.iterator();
            while (it2.f406910d) {
                int iA3 = it2.a();
                List<BeduinModel> children2 = beduinGridLayoutModel.getChildren();
                if (children2 == null || (beduinSpacingModel = (BeduinModel) C42745f0.K(iA3, children2)) == null) {
                    beduinSpacingModel = new BeduinSpacingModel(id2 + '_' + iA2 + '_' + iA3, null, null, null, 14, null);
                }
                arrayList2.add(beduinSpacingModel);
            }
            Integer horizontalInterItemSpacing = beduinGridLayoutModel.getHorizontalInterItemSpacing();
            List listSingletonList = Collections.singletonList(new BeduinGridLayoutRowContainerModel(str, null, rowPadding, rowMargin, null, arrayList2, Integer.valueOf(horizontalInterItemSpacing != null ? horizontalInterItemSpacing.intValue() : 12)));
            if (iA2 != i12 - 1) {
                String str2 = id2 + '_' + iA2 + "_spacing";
                Integer verticalInterItemSpacing = beduinGridLayoutModel.getVerticalInterItemSpacing();
                iterableSingletonList = Collections.singletonList(new BeduinSpacingModel(str2, 1, Integer.valueOf(verticalInterItemSpacing != null ? verticalInterItemSpacing.intValue() : 20), null, 8, null));
            } else {
                iterableSingletonList = C42784z0.f406748b;
            }
            C42745f0.h(C42745f0.h0(iterableSingletonList, listSingletonList), arrayList);
        }
        BeduinGridLayoutModel beduinGridLayoutModel2 = L.f(beduinGridLayoutModel.getRows(), arrayList) ? beduinGridLayoutModel : null;
        return beduinGridLayoutModel2 == null ? BeduinGridLayoutModel.copy$default(beduinGridLayoutModel, null, null, null, null, null, null, null, null, null, arrayList, 511, null) : beduinGridLayoutModel2;
    }
}
