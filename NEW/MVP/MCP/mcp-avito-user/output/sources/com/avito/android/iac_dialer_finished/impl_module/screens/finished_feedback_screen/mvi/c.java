package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.a;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenInternalAction;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.entity.IacFinishedFeedbackScreenState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: IacFinishedFeedbackScreenActor.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LWK/a;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenInternalAction;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_feedback_screen/mvi/entity/IacFinishedFeedbackScreenState;", "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.arch.mvi.a<WK.a, IacFinishedFeedbackScreenInternalAction, IacFinishedFeedbackScreenState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f166680a;

    @Inject
    public c(@Y61.k InterfaceC28373a interfaceC28373a) {
        this.f166680a = interfaceC28373a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<IacFinishedFeedbackScreenInternalAction> b(WK.a aVar, IacFinishedFeedbackScreenState iacFinishedFeedbackScreenState) {
        return C43175k.G(new a(aVar, this, iacFinishedFeedbackScreenState, null));
    }
}
