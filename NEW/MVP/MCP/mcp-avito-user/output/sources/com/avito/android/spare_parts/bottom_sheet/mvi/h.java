package com.avito.android.spare_parts.bottom_sheet.mvi;

import com.avito.android.arch.mvi.t;
import com.avito.android.spare_parts.bottom_sheet.mvi.entity.SparePartsBottomSheetInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import tx0.InterfaceC48736b;

/* compiled from: SparePartsBottomSheetOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "Ltx0/b;", "<init>", "()V", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements t<SparePartsBottomSheetInternalAction, InterfaceC48736b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48736b b(SparePartsBottomSheetInternalAction sparePartsBottomSheetInternalAction) {
        if (sparePartsBottomSheetInternalAction.equals(SparePartsBottomSheetInternalAction.Close.f284805b)) {
            return InterfaceC48736b.a.f439672a;
        }
        return null;
    }
}
