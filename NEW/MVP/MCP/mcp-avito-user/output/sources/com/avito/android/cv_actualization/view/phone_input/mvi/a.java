package com.avito.android.cv_actualization.view.phone_input.mvi;

import Y61.k;
import com.avito.android.arch.mvi.a;
import com.avito.android.cv_actualization.view.phone_input.mvi.entity.JsxCvActualizationPhoneInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import tt.AbstractC48713a;

/* compiled from: JsxCvActualizationPhoneInputActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_input/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Ltt/a;", "Lcom/avito/android/cv_actualization/view/phone_input/mvi/entity/JsxCvActualizationPhoneInputInternalAction;", "Ltt/c;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<AbstractC48713a, JsxCvActualizationPhoneInputInternalAction, tt.c> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.cv_actualization.view.phone_input.mvi.action_handler.c f131273a;

    @Inject
    public a(@k com.avito.android.cv_actualization.view.phone_input.mvi.action_handler.c cVar) {
        this.f131273a = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @k
    public final InterfaceC43160i a(@k C43197r1 c43197r1, @k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<JsxCvActualizationPhoneInputInternalAction> b(AbstractC48713a abstractC48713a, tt.c cVar) {
        AbstractC48713a abstractC48713a2 = abstractC48713a;
        if (abstractC48713a2 instanceof AbstractC48713a.C12689a) {
            return this.f131273a.a(((AbstractC48713a.C12689a) abstractC48713a2).f439617a);
        }
        if (abstractC48713a2.equals(AbstractC48713a.b.f439618a)) {
            return new C43210w(JsxCvActualizationPhoneInputInternalAction.OnToolbarNavigationClick.f131293b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
