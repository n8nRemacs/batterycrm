package com.avito.android.early_access_advert.info_screen.mvi;

import Vx.InterfaceC15724a;
import com.avito.android.arch.mvi.a;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.early_access_advert.info_screen.mvi.entity.EarlyAccessAdvertInfoInternalAction;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: EarlyAccessAdvertInfoActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LVx/a;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "LVx/c;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC15724a, EarlyAccessAdvertInfoInternalAction, Vx.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.early_access_advert.a f145727a;

    @Inject
    public a(@Y61.k com.avito.android.early_access_advert.a aVar) {
        this.f145727a = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<EarlyAccessAdvertInfoInternalAction> b(InterfaceC15724a interfaceC15724a, Vx.c cVar) {
        EarlyAccessFeedback negativeFeedback;
        InterfaceC15724a interfaceC15724a2 = interfaceC15724a;
        boolean z12 = interfaceC15724a2 instanceof InterfaceC15724a.C1217a;
        EarlyAccessAdvert earlyAccessAdvert = cVar.f17522b;
        com.avito.android.early_access_advert.a aVar = this.f145727a;
        if (z12) {
            aVar.e();
            EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType = EarlyAccessAdvertFeedbackType.f145650d;
            negativeFeedback = earlyAccessAdvert != null ? earlyAccessAdvert.getPositiveFeedback() : null;
            return negativeFeedback != null ? new C43210w(new EarlyAccessAdvertInfoInternalAction.ShowFeedbackScreen(earlyAccessAdvertFeedbackType, negativeFeedback)) : C43175k.w();
        }
        if (!(interfaceC15724a2 instanceof InterfaceC15724a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        aVar.c();
        EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType2 = EarlyAccessAdvertFeedbackType.f145651e;
        negativeFeedback = earlyAccessAdvert != null ? earlyAccessAdvert.getNegativeFeedback() : null;
        return negativeFeedback != null ? new C43210w(new EarlyAccessAdvertInfoInternalAction.ShowFeedbackScreen(earlyAccessAdvertFeedbackType2, negativeFeedback)) : C43175k.w();
    }
}
