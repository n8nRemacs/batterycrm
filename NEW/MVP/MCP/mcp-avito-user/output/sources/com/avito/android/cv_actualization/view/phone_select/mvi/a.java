package com.avito.android.cv_actualization.view.phone_select.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.cv_actualization.view.phone_select.mvi.entity.JsxCvActualizationPhoneSelectInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import vt.AbstractC49378a;
import vt.C49380c;

/* compiled from: JsxCvActualizationPhoneSelectActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_actualization/view/phone_select/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lvt/a;", "Lcom/avito/android/cv_actualization/view/phone_select/mvi/entity/JsxCvActualizationPhoneSelectInternalAction;", "Lvt/c;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<AbstractC49378a, JsxCvActualizationPhoneSelectInternalAction, C49380c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_actualization.view.phone_select.domain.phone_update.c f131352a;

    @Inject
    public a(@Y61.k com.avito.android.cv_actualization.view.phone_select.domain.phone_update.c cVar) {
        this.f131352a = cVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<JsxCvActualizationPhoneSelectInternalAction> b(AbstractC49378a abstractC49378a, C49380c c49380c) {
        AbstractC49378a abstractC49378a2 = abstractC49378a;
        if (abstractC49378a2.equals(AbstractC49378a.C12796a.f441027a)) {
            return new C43210w(new JsxCvActualizationPhoneSelectInternalAction.ShowPhoneInput(true));
        }
        if (abstractC49378a2 instanceof AbstractC49378a.b) {
            return this.f131352a.a(((AbstractC49378a.b) abstractC49378a2).f441028a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
