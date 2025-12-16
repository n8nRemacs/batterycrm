package com.avito.android.iac_problems.impl_module.problems_bottom_sheet;

import android.os.Bundle;
import androidx.compose.runtime.internal.P;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: IacProblemBottomSheetFragmentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/b;", "Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/a;", "<init>", "()V", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.iac_problems.impl_module.problems_bottom_sheet.a
    @Y61.k
    public final IacProblemsBottomSheetFragment a(@Y61.k String str, @Y61.k String str2) {
        IacProblemsBottomSheetFragment.f168849t0.getClass();
        IacProblemsBottomSheetFragment iacProblemsBottomSheetFragment = new IacProblemsBottomSheetFragment();
        Bundle bundle = new Bundle();
        bundle.putString("request_key", str);
        bundle.putString("scenario_key", str2);
        iacProblemsBottomSheetFragment.setArguments(bundle);
        return iacProblemsBottomSheetFragment;
    }
}
