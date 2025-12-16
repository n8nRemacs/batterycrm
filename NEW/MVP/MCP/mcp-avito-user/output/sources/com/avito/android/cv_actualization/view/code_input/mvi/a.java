package com.avito.android.cv_actualization.view.code_input.mvi;

import com.avito.android.arch.mvi.a;
import com.avito.android.cv_actualization.view.code_input.mvi.entity.JsxCvActualizationCodeInputInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import qt.AbstractC47436a;

/* compiled from: JsxCvActualizationCodeInputActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cv_actualization/view/code_input/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lqt/a;", "Lcom/avito/android/cv_actualization/view/code_input/mvi/entity/JsxCvActualizationCodeInputInternalAction;", "Lqt/c;", "_avito_job_cv-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.a<AbstractC47436a, JsxCvActualizationCodeInputInternalAction, qt.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_actualization.view.code_input.mvi.action_handler.c f131167a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.cv_actualization.view.code_input.mvi.action_handler.a f131168b;

    @Inject
    public a(@Y61.k com.avito.android.cv_actualization.view.code_input.mvi.action_handler.c cVar, @Y61.k com.avito.android.cv_actualization.view.code_input.mvi.action_handler.a aVar) {
        this.f131167a = cVar;
        this.f131168b = aVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<JsxCvActualizationCodeInputInternalAction> b(AbstractC47436a abstractC47436a, qt.c cVar) {
        AbstractC47436a abstractC47436a2 = abstractC47436a;
        if (abstractC47436a2.equals(AbstractC47436a.b.f429381a)) {
            return new C43210w(new JsxCvActualizationCodeInputInternalAction.BackClicked());
        }
        if (abstractC47436a2 instanceof AbstractC47436a.C12337a) {
            return this.f131168b.a(((AbstractC47436a.C12337a) abstractC47436a2).f429380a);
        }
        if (abstractC47436a2.equals(AbstractC47436a.d.f429383a)) {
            return this.f131167a.a();
        }
        if (abstractC47436a2.equals(AbstractC47436a.c.f429382a)) {
            return new C43210w(new JsxCvActualizationCodeInputInternalAction.InputChanged());
        }
        throw new NoWhenBranchMatchedException();
    }
}
