package com.avito.android.spare_parts.bottom_sheet.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.remote.models.SparePartsGroup;
import com.avito.android.spare_parts.bottom_sheet.mvi.entity.SparePartsBottomSheetInternalAction;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import tx0.C48737c;

/* compiled from: SparePartsBottomSheetReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "Ltx0/c;", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements u<SparePartsBottomSheetInternalAction, C48737c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C48737c a(SparePartsBottomSheetInternalAction sparePartsBottomSheetInternalAction, C48737c c48737c) {
        SparePartsBottomSheetInternalAction sparePartsBottomSheetInternalAction2 = sparePartsBottomSheetInternalAction;
        C48737c c48737c2 = c48737c;
        if (sparePartsBottomSheetInternalAction2 instanceof SparePartsBottomSheetInternalAction.InitRootGroup) {
            return new C48737c(Collections.singletonList(((SparePartsBottomSheetInternalAction.InitRootGroup) sparePartsBottomSheetInternalAction2).f284806b));
        }
        boolean z12 = sparePartsBottomSheetInternalAction2 instanceof SparePartsBottomSheetInternalAction.AddGroup;
        List<SparePartsGroup> list = c48737c2.f439675b;
        if (z12) {
            return new C48737c(C42745f0.h0(Collections.singletonList(((SparePartsBottomSheetInternalAction.AddGroup) sparePartsBottomSheetInternalAction2).f284804b), list));
        }
        if (sparePartsBottomSheetInternalAction2.equals(SparePartsBottomSheetInternalAction.PopGroupsStack.f284807b)) {
            return new C48737c(C42745f0.x(list));
        }
        if (sparePartsBottomSheetInternalAction2.equals(SparePartsBottomSheetInternalAction.Close.f284805b)) {
            return c48737c2;
        }
        throw new NoWhenBranchMatchedException();
    }
}
