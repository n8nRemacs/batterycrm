package com.avito.android.developments_catalog.residential_complex_search.mvi;

import com.adjust.sdk.network.ErrorCodes;
import com.avito.android.arch.mvi.t;
import com.avito.android.developments_catalog.residential_complex_search.mvi.entity.ResidentialComplexInternalAction;
import com.avito.android.remote.model.category_parameters.SelectParameter;
import javax.inject.Inject;
import kotlin.Metadata;
import sx.InterfaceC48427b;

/* compiled from: ResidentialComplexOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/developments_catalog/residential_complex_search/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/developments_catalog/residential_complex_search/mvi/entity/ResidentialComplexInternalAction;", "Lsx/b;", "<init>", "()V", "_avito_developments-catalog_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements t<ResidentialComplexInternalAction, InterfaceC48427b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC48427b b(ResidentialComplexInternalAction residentialComplexInternalAction) {
        ResidentialComplexInternalAction residentialComplexInternalAction2 = residentialComplexInternalAction;
        if (residentialComplexInternalAction2 instanceof ResidentialComplexInternalAction.SearchFieldInput) {
            String str = ((ResidentialComplexInternalAction.SearchFieldInput) residentialComplexInternalAction2).f139216b;
            return new InterfaceC48427b.d(str.length() > 0, str);
        }
        if (residentialComplexInternalAction2 instanceof ResidentialComplexInternalAction.CloseScreen) {
            return InterfaceC48427b.C12652b.f438926a;
        }
        if (residentialComplexInternalAction2 instanceof ResidentialComplexInternalAction.ClearSearchField) {
            return InterfaceC48427b.a.f438925a;
        }
        if (!(residentialComplexInternalAction2 instanceof ResidentialComplexInternalAction.ReturnItemResult)) {
            return null;
        }
        ResidentialComplexInternalAction.ReturnItemResult returnItemResult = (ResidentialComplexInternalAction.ReturnItemResult) residentialComplexInternalAction2;
        return new InterfaceC48427b.c(new SelectParameter.Value(String.valueOf(returnItemResult.f139212b), returnItemResult.f139213c, null, null, null, null, false, null, null, null, ErrorCodes.PROTOCOL_EXCEPTION, null));
    }
}
