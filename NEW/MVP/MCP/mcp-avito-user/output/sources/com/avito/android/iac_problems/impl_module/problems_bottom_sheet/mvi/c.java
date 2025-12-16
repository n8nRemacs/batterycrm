package com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.iac_problems.impl_module.problems_bottom_sheet.mvi.entity.IacProblemsBottomSheetInternalAction;
import eM.InterfaceC40021a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: IacProblemsBottomSheetActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LeM/a;", "Lcom/avito/android/iac_problems/impl_module/problems_bottom_sheet/mvi/entity/IacProblemsBottomSheetInternalAction;", "LeM/c;", "_avito_iac-problems_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC40021a, IacProblemsBottomSheetInternalAction, eM.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final NL.e f168911a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f168912b;

    @Inject
    public c(@Y61.k NL.e eVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f168911a = eVar;
        this.f168912b = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<IacProblemsBottomSheetInternalAction> b(InterfaceC40021a interfaceC40021a, eM.c cVar) {
        InterfaceC40021a interfaceC40021a2 = interfaceC40021a;
        if (interfaceC40021a2 instanceof InterfaceC40021a.d) {
            return new C43210w(IacProblemsBottomSheetInternalAction.RefreshProblems.f168921b);
        }
        if (interfaceC40021a2 instanceof InterfaceC40021a.c) {
            return new C43210w(IacProblemsBottomSheetInternalAction.RefreshProblems.f168921b);
        }
        if (interfaceC40021a2 instanceof InterfaceC40021a.b) {
            return C43175k.G(new a(((InterfaceC40021a.b) interfaceC40021a2).f395117a, this, null));
        }
        if (interfaceC40021a2 instanceof InterfaceC40021a.e) {
            return new C43210w(IacProblemsBottomSheetInternalAction.RefreshProblems.f168921b);
        }
        if (interfaceC40021a2 instanceof InterfaceC40021a.f) {
            return C43175k.G(new b(this, null));
        }
        if (interfaceC40021a2 instanceof InterfaceC40021a.C11072a) {
            return new C43210w(IacProblemsBottomSheetInternalAction.Close.f168915b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
