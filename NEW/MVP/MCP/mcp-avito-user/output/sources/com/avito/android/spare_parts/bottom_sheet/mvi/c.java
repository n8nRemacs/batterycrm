package com.avito.android.spare_parts.bottom_sheet.mvi;

import Y61.l;
import com.avito.android.remote.models.SparePartsGroup;
import com.avito.android.spare_parts.bottom_sheet.mvi.entity.SparePartsBottomSheetInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SparePartsBottomSheetBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/spare_parts/bottom_sheet/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/spare_parts/bottom_sheet/mvi/entity/SparePartsBottomSheetInternalAction;", "_avito_spare-parts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements com.avito.android.arch.mvi.b<SparePartsBottomSheetInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SparePartsGroup f284796a;

    @Inject
    public c(@Y61.k SparePartsGroup sparePartsGroup) {
        this.f284796a = sparePartsGroup;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SparePartsBottomSheetInternalAction> a() {
        return new C43210w(new SparePartsBottomSheetInternalAction.InitRootGroup(this.f284796a));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
